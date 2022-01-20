
public class Player1Inventory
	{
		private String name;
		private int rent;

		
		public Player1Inventory(String n, int r)
		{
			name = n;
			rent = r;
		}


		public String getName()
			{
				return name;
			}


		public void setName(String name)
			{
				this.name = name;
			}


		public int getRent()
			{
				return rent;
			}


		public void setRent(int rent)
			{
				this.rent = rent;
			}

		
	}
