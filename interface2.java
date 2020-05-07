interface sport {
	void play();
}
class volleyball implements sport {

	
	public void play() {
		System.out.println("playing volleyball");
		
	}
}
class cricket implements sport{

	
	public void play() {
		System.out.println("playing cricket");
		
	}

}
class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sport sports=new volleyball();
		sports.play();
		

	}

}

