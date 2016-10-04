package Lalalalalalala;

public class Order {
	private int id;
	private Humen  humen;
	private Commody commody;
	public Order(int id, Humen humen, Commody commody) {
		super();
		this.id = id;
		this.humen = humen;
		this.commody = commody;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Humen getHumen() {
		return humen;
	}
	public void setHumen(Humen humen) {
		this.humen = humen;
	}
	public Commody getCommody() {
		return commody;
	}
	public void setCommody(Commody commody) {
		this.commody = commody;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((commody == null) ? 0 : commody.hashCode());
		result = prime * result + ((humen == null) ? 0 : humen.hashCode());
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (commody == null) {
			if (other.commody != null)
				return false;
		} else if (!commody.equals(other.commody))
			return false;
		if (humen == null) {
			if (other.humen != null)
				return false;
		} else if (!humen.equals(other.humen))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", humen=" + humen + ", commody=" + commody
				+ "]";
	}
	
	
	
}
