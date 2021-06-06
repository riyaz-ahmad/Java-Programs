class HappyDiwali{
	public static void main(String [] args){
		int d = 40;
		int a = d, b = 1;
		for(int i=1;i<=d;i++){
			System.out.print(b>=1&&b<=3?" ":
			b==4&&i>19&&i<=20||b==5&&i>=19&&i<=21||b>=6&&b<=8&&i>=18&&i<=22||b==9&&i>=19&&i<=21||b==10&&i>19&&i<=20||b>=11&&b<=15&&i>=b&&i<=40-b?"*":" "
			);
			if(i==a){
				i=0;
				a=d;
				b++;
				System.out.println("");
			}
			if(b==15)
				break;
		}
		System.out.println("\n\t***HAPPY DIWALI DEAR RITU***");
	}
}