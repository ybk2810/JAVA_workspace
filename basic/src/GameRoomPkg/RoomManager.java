/*
 * Author : Gompang
 * Desc : ��Ʈ��ũ ���ӿ��� ���Ǵ�(ä�õ� ����) �� ���� Ŭ����
 * Blog : http://gompangs.tistory.com/
 */
package GameRoomPkg;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class RoomManager {

    private static List roomList; // ���� ����Ʈ
    private static AtomicInteger atomicInteger;

    static {
        roomList = new ArrayList();
        atomicInteger = new AtomicInteger();
    }

    public RoomManager() {

    }

    /**
     * �� ���� ����
     * @return GameRoom
     */
    public static GameRoom createRoom() { // ���� ���� ����(�� ��)
        int roomId = atomicInteger.incrementAndGet();// room id ä��
        GameRoom room = new GameRoom(roomId);
        roomList.add(room);
        System.out.println("Room Created!");
        return room;
    }

    /**
     * ���� �����԰� ���ÿ� ������ �������
     * @param owner ����
     * @return GameRoom
     */
    public static GameRoom createRoom(GameUser owner) { // ������ ���� ������ �� ���(������ �������� ��)
        int roomId = atomicInteger.incrementAndGet();// room id ä��

        GameRoom room = new GameRoom(roomId);
        room.enterUser(owner);
        room.setOwner(owner);

        roomList.add(room);
        System.out.println("Room Created!");
        return room;
    }

    /**
     * ���� ����Ʈ�� ���� ����
     * @param users �����ų ���� ����Ʈ
     * @return GameRoom
     */
    public static GameRoom createRoom(List users) {
        int roomId = atomicInteger.incrementAndGet();// room id ä��

        GameRoom room = new GameRoom(roomId);
        room.enterUser(users);

        roomList.add(room);
        System.out.println("Room Created!");
        return room;
    }

    public static GameRoom getRoom(GameRoom gameRoom){

        int idx = roomList.indexOf(gameRoom);

        if(idx > 0){
            return roomList.get(idx);
        }
        else{
            return null;
        }
    }

    /**
     * ���޹��� ���� ����
     * @param room ������ ��
     */
    public static void removeRoom(GameRoom room) {
        room.close();
        roomList.remove(room); // ���޹��� ���� �����Ѵ�.
        System.out.println("Room Deleted!");
    }

    /**
     * ���� ���� ũ�⸦ ����
     * @return ���� size
     */
    public static int roomCount() {
        return roomList.size();
    }
}