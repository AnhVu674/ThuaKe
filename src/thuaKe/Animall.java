package thuaKe;

import java.util.Objects;

public class Animall {

	private String ten;
	private int id;

	

	public String getTen() {
		return ten;
	}



	@Override
	public int hashCode() {
		return Objects.hash(id, ten);
	}



	@Override
	public String toString() {
		return "Animal [ten=" + ten + ", id=" + id + "]";
	}



	


	public Animall() {
		super();
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animall other = (Animall) obj;
		return id == other.id && Objects.equals(ten, other.ten);
	}



	public void setTen(String ten) {
		this.ten = ten;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Animall(String ten, int id) {
		super();
		this.ten = ten;
		this.id = id;
	}
public void ahii() {
	System.out.println("hii");
}
public static void main(String[] args) {
	Animall a =new Animall();
	a.ahii();
}
}
