
public class ConnectionPool {

	//인스턴스는 하나만 있을 거니까 private으로 일단 접근 안되게 선언.
	private static ConnectionPool instance = new ConnectionPool();
	
	//생성자도 default쓰면 그냥 맘대로 생성이 될 수도 있으니까 일단 private으로 막기
	private ConnectionPool() {}
	public static ConnectionPool getInstance() {
		if(instance == null) {
			instance = new ConnectionPool();
		}
		return instance;
	}
}
