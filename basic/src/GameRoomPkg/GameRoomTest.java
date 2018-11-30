package GameRoomPkg;


import GameRoomPkg.GameRoom;
import GameRoomPkg.GameUser;
import GameRoomPkg.RoomManager;

public class GameRoomTest {

    public void roomCreateTest(){

        // #1. ���� �α���
        GameUser gameUser = new GameUser(1, "gompang");
        GameUser gameUser2 = new GameUser(2, "apple");
        GameUser gameUser3 = new GameUser(3, "banana");

        // #2. Ư�� ������ ���� ������� ��
        GameRoom gameRoom = RoomManager.createRoom(gameUser);

        // #3. �� �濡 ������ ������ ������ ��
        gameRoom.enterUser(gameUser2);
        gameRoom.enterUser(gameUser3);

        // -- ���� ����~ ����, ä�� �� --

        // #4. ������ �濡�� ����
        gameRoom.exitUser(gameUser2);

        // #5. ������ �濡�� ���� -> gameUser3�� ������ ��
        gameRoom.exitUser(gameUser);

        // #6. gameUser3�� �濡�� ���� -> size�� 0�� �Ǹ鼭 ���� ������
        gameRoom.exitUser(gameUser3);

        // #7. �Ʒ� ����� null �̰���
        GameRoom room = RoomManager.getRoom(gameRoom);

        if(room != null){
            System.out.println("���� ���� �ֳ�");
        }
        else{
            System.out.println("���� ��������");
        }
    }

    public void roomTest(){
        // #1. ���� �α���
        GameUser gameUser = new GameUser(1, "gompang");
        GameUser gameUser2 = new GameUser(2, "apple");
        GameUser gameUser3 = new GameUser(3, "banana");

        // #2. Ư�� ������ ���� ������� ��
        GameRoom gameRoom = RoomManager.createRoom(gameUser);

        // #3. �� �濡 ������ ������ ������ ��
        gameRoom.enterUser(gameUser2);
        gameRoom.enterUser(gameUser3);

        // -- �� ����������� ������ ���� --
        byte[] data = "�� �������� broadcast�� ������".getBytes();
        gameRoom.broadcast(data);

        // #4. �������� gompang�̶�� �г������� ���� ������ �˻���(�ӼӸ�, �ŷ� ���� ��������)
        GameUser gompang = gameRoom.getUserByNickName("gompang");

        // #5. �������� ������ ������ gameRoom�� ������(��� ���� ����ó��)
        RoomManager.removeRoom(gameRoom);
    }

}