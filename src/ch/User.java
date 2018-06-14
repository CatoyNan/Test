package ch;

public class User {
	private Discount discount;
	public void excute()
	{
		discount.Exucute();
	}
	public void SetDiscount(Discount discount)
	{
		this.discount=discount;
	}
}
