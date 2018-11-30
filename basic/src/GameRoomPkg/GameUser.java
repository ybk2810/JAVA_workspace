/*
 * Author : Gompang
 * Desc : ��Ʈ��ũ ���ӿ��� ���Ǵ�(ä�õ� ����) �� ���� Ŭ����
 * Blog : http://gompangs.tistory.com/
 */
package GameRoomPkg;

import java.net.Socket;

// ������ ������ �÷����ϴ� ������ Ŭ�����̴�.

public class GameUser {

	private int id; 			// Unique ID
	private GameRoom room; 		// ������ ���� ���̴�.
	private Socket sock; 		// ���� object
	private String nickName;	// �г���

	// ���ӿ� ���õ� ���� ����
	// ...
	//

	private PlayerGameInfo.Location playerLocation; // ���� ����
	private PlayerGameInfo.Status playerStatus; // ���� ����

	public GameUser() { // �ƹ��� ������ ���� ���� ������ ���� ��
	}

    /**
     * ���� ����
     * @param nickName �г���
     */
    public GameUser(String nickName) { // �г��� ������ ������ ����
		this.nickName = nickName;
	}

    /**
     * ���� ����
     * @param id ID
     * @param nickName �г���
     */
    public GameUser(int id, String nickName) { // UID, �г��� ������ ������ ����
		this.id = id;
		this.nickName = nickName;
	}

    /**
     * �濡 �����Ŵ
     * @param room  ������ ��
     */
    public void enterRoom(GameRoom room) {
		room.enterUser(this); // �뿡 �����Ų ��
		this.room = room; // ������ ���� ���� ������ �����Ѵ�.(�߿�)
	}

    /**
     * �濡�� ����
     * @param room ������ ��
     */
    public void exitRoom(GameRoom room){
        this.room = null;
        // ����ó��(ȭ�鿡 �޼����� �شٴ� ��)
        // ...
    }

	public void setPlayerStatus(PlayerGameInfo.Status status) { // ������ ���¸� ����
		this.playerStatus = status;
	}

	public void setPlayerLocation(PlayerGameInfo.Location location) { // ������ ��ġ�� ����
		this.playerLocation = location;
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GameRoom getRoom() {
        return room;
    }

    public void setRoom(GameRoom room) {
        this.room = room;
    }

    public Socket getSock() {
        return sock;
    }

    public void setSock(Socket sock) {
        this.sock = sock;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public PlayerGameInfo.Location getPlayerLocation() {
        return playerLocation;
    }

    public PlayerGameInfo.Status getPlayerStatus() {
        return playerStatus;
    }

    /*
        equals�� hashCode�� override �����, ���������� ���� �� �ִ�
        ���� �� -> gameUser �� equals ��, list���� find ��
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GameUser gameUser = (GameUser) o;

        return id == gameUser.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}