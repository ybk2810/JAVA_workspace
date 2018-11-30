/*
 * Author : Gompang
 * Desc : ��Ʈ��ũ ���ӿ��� ���Ǵ�(ä�õ� ����) �� ���� Ŭ����
 * Blog : http://gompangs.tistory.com/
 */
package GameRoomPkg;

import java.util.ArrayList;
import java.util.List;

public class GameRoom {

    private int id; // �� ID
    private List userList;
    private GameUser roomOwner; // ����
    private String roomName; // �� �̸�

    public GameRoom(int roomId) { // �ƹ��� ���� ���� ������ ��
        this.id = roomId;
        userList = new ArrayList();
    }

    public GameRoom(GameUser user) { // ������ ���� ���鶧
        userList = new ArrayList();
        user.enterRoom(this);
        userList.add(user); // ������ �߰���Ų ��
        this.roomOwner = user; // ������ ������ �����.
    }

    public GameRoom(List users) { // ���� ����Ʈ�� ���� ������
        this.userList = users; // ��������Ʈ ����

        // �� ����
        for(GameUser user : users){
            user.enterRoom(this);
        }

        this.roomOwner = userList.get(0); // ù��° ������ �������� ����
    }

    public void enterUser(GameUser user) {
        user.enterRoom(this);
        userList.add(user);
    }

    public void enterUser(List users) {
        for(GameUser gameUser : users){
            gameUser.enterRoom(this);
        }
        userList.addAll(users);
    }

    /**
     * �ش� ������ �濡�� ������
     * @param user ������ ����
     */
    public void exitUser(GameUser user) {
        user.exitRoom(this);
        userList.remove(user); // �ش� ������ �濡�� ������

        if (userList.size() < 1) { // ��� �ο��� �� ���� �����ٸ�
            RoomManager.removeRoom(this); // �� ���� �����Ѵ�.
            return;
        }

        if (userList.size() < 2) { // �濡 ���� �ο��� 1�� ���϶��
            this.roomOwner = userList.get(0); // ����Ʈ�� ù��° ������ ������ �ȴ�.
            return;
        }
    }

    /**
     * �ش� ���� ������ �� �����Ű�� ������
     */
    public void close() {
        for (GameUser user : userList) {
            user.exitRoom(this);
        }
        this.userList.clear();
        this.userList = null;
    }

    // ���� ����

    /**
     * �ش� byte �迭�� ���� ��� �������� ����
     * @param data ���� data
     */
    public void broadcast(byte[] data) {
        for (GameUser user : userList) { // �濡 ���� ������ ����ŭ �ݺ�
            // �� �������� �����͸� �����ϴ� �޼��� ȣ��~
            // ex) user.SendData(data);

//			try {
//				user.sock.getOutputStream().write(data); // �̷������� ����Ʈ�迭�� ������.
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
        }
    }

    public void setOwner(GameUser gameUser) {
        this.roomOwner = gameUser; // Ư�� ����ڸ� �������� �����Ѵ�.
    }

    public void setRoomName(String name) { // �� �̸��� ����
        this.roomName = name;
    }

    public GameUser getUserByNickName(String nickName) { // �г����� ���ؼ� �濡 ���� ������ ������

        for (GameUser user : userList) {
            if (user.getNickName().equals(nickName)) {
                return user; // ������ ã�Ҵٸ�
            }
        }
        return null; // ã�� ������ ���ٸ�
    }

    public GameUser getUser(GameUser gameUser) { // GameUser ��ü�� get

        int idx = userList.indexOf(gameUser);

        // ������ �����Ѵٸ�(gameUser�� equals�� ��)
        if(idx > 0){
            return userList.get(idx);
        }
        else{
            // ������ ���ٸ�
            return null;
        }
    }

    public String getRoomName() { // �� �̸��� ������
        return roomName;
    }

    public int getUserSize() { // ������ ���� ����
        return userList.size();
    }

    public GameUser getOwner() { // ������ ����
        return roomOwner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List getUserList() {
        return userList;
    }

    public void setUserList(List userList) {
        this.userList = userList;
    }

    public GameUser getRoomOwner() {
        return roomOwner;
    }

    public void setRoomOwner(GameUser roomOwner) {
        this.roomOwner = roomOwner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GameRoom gameRoom = (GameRoom) o;

        return id == gameRoom.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}