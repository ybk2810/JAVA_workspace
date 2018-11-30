package ProjectGG;

import java.awt.geom.Point2D;
import java.io.*;
import java.net.*;
import java.util.*;

/**
 * Ŭ���̾�Ʈ�� �����ϸ� ��ſ� ������� ��� �����ڿ��� �ֱ������� ���� �����͸� �����ϴ� �����带 �����Ѵ�
 */
public class Server {
	// ���ӵ� ����� ����
	static List<UserConnection> userList = new ArrayList<>();
	// ��� �̿����� ȭ�鿡�� �̵� ���� ��ź�� ��ǥ ����Ʈ(��� �̿��ڿ��� ���۵�)
	static List<Point2D> bulletList = new LinkedList<>();
	// ��� �̿��ڵ��� ��Ʈ ���� �ʿ� �����Ͽ� �� �̿��ڵ鿡�� ������ �� �����
	static Map<String, Integer> pointMap = new HashMap<>();

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(1234);
			ServerLoopThread loop = null;
			UserConnection user = null;
			while (true) {
				System.out.println("Waiting for Connection...");
				Socket socket = ss.accept();
				// ��ſ� ������ �̿��Ͽ� �����ڿ� ������ ����ϱ� ���� ��Ʈ���� ������
				user = new UserConnection(socket);
				// �̿��ڷκ��� �Էµ� �̺�Ʈ ������ ���� �����͸� �����ϴ� ������
				new UserThread(user).start();
				// ��� �̿��ڿ��� ��ε�ĳ������ �� ���� �̿������� ����Ʈ
				userList.add(user);
				if (loop == null) {
					// ��� �����ڿ��� �ֱ������� ���� ��ġ�� ������ ȭ�� ������ �����Ѵ�
					// ���������� Ŭ���̾�Ʈ���� ����ϴ� ���
					loop = new ServerLoopThread();
					loop.start();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

/**
 * ���� ��ǥ�� �����ϰ� �̿����� ���� �����Ϳ� ���� �浹���θ� �˻��ϸ� ��� Ŭ���̾�Ʈ���� ���� ����ǥ�� �浹���θ� �ֱ������� �۽��ϴ�
 * ������ ������
 */
class ServerLoopThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}

}

/**
 * �����ڿ� ������ ���� �� �����ڿ� ����� ���� ��Ʈ�� ���̵�, ����, ������Ʈ �Է½�Ʈ��, ������Ʈ ��½�Ʈ��, �̿����� ���� ������
 * ���⼭ ������ ����� ��Ʈ���� ���������� ���������� ����ϸ�, �ٸ� �������� ��Ʈ�� ��ü�� ���� �������� ����
 */
class UserConnection {
	String id;
	Socket socket;
	ObjectInputStream oin;
	ObjectOutputStream out;
	// �� �̿��ڰ� ������ ������ ���� �����͸� ����
	GameData gd;

	public UserConnection() {
	}

	public UserConnection(Socket socket) {
		// �̿����� ���̵� ���ӽð����� ������
		this.id = String.valueOf(new Date().getTime());
		gd = new GameData(this.id);
		this.socket = socket;
		try {
			oin = new ObjectInputStream(socket.getInputStream());
			out = new ObjectOutputStream(socket.getOutputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/**
 * �̿����� Ű����, ���콺 �Է� ������ �������� �����ϴ� ������ �̿��ڷκ��� ���� ����
 */
class UserThread extends Thread {
	// �̿��ڷκ��� ������ ���۵� ���� �����ʹ� �ش� �̿����� ������ user.gd ������ ����Ǹ�,
	// user�� ������ GameServer.userList���� ����Ǿ� �����Ƿ� ���� ���ӷ����� ����
	// �ٸ� �̿��ڿ��� ���� �̿����� ���� �����͸� ������ �� ���ȴ�
	UserConnection user;

	UserThread(UserConnection user) {
		this.user = user;
	}

	@Override
	public void run() {
		while (true) {
			try {
				// �̿��ڷκ��� ���� �����͸� �����Ͽ� �ش� �̿����� GameData ���������� ����
				user.gd = (GameData) user.oin.readObject();
			} catch (Exception e) {
				// e.printStackTrace();
				System.err.println("Ŭ���̾�Ʈ ����(����)\n");
				if (e instanceof OptionalDataException) {
					OptionalDataException ode = (OptionalDataException) e;
					System.out.printf("e.length:%d, e.eof:%b %n", ode.length, ode.eof);
				}
				Server.userList.remove(user);
				break;
			}
		}
	}
}

/**
 * Ŭ���̾�Ʈ�� ���� ���̿� ������ �����͸� ĸ��ȭ�� �ٸ� �����Ͱ� �� �ʿ��ϴٸ� ���� �߰������� �����ϸ� ��
 */
class GameData implements Serializable {
	String id; // �̿��� ���̵�
	// ���������� ��� ���� ��ġ

	public GameData() {
	}

	public GameData(String userId) {
		this.id = userId;
	}

}
