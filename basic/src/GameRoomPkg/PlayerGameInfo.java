/*
 * Author : Gompang
 * Desc : ��Ʈ��ũ ���ӿ��� ���Ǵ�(ä�õ� ����) �� ���� Ŭ����
 * Blog : http://gompangs.tistory.com/
 */
package GameRoomPkg;

// ������ ���� �� ���� ��ġ�ϰ� �ִ� ��Ҹ� �����ϱ� ���� Enum Class
public class PlayerGameInfo {

	enum Location {
		MAP_1, MAP_2, MAP_3, MAP_4, MAP_5
	};

	enum Status {
		IDLE, BATTLE, DEAD
	};
}
