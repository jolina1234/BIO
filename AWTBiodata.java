import java.awt.*;
class First extends Frame{
	TextField TF,TF2;
	Checkbox C1,C2;
	Label L1,L2,L3;
	First(){
		C1 = new Checkbox("M");
		C2 = new Checkbox("F");
		TF = new TextField();
		TF2 = new TextField();
		L1 = new Label("First Name:");
		L2 = new Label("Last Name:");
		L3 = new Label("Gender:");
		Button a = new Button("Save");
		Button b = new Button("Cancel");
		C1.setBounds(60,160,50,20);
		C2.setBounds(150,160,50,20);
		TF.setBounds(60,50,170,20);
		TF2.setBounds(60,100,170,20);
		L1.setBounds(60,28,170,20);
		L2.setBounds(60,75,170,20);
		L3.setBounds(60,140,170,20);
		a.setBounds(60,220,80,30);
		b.setBounds(160,220,80,30);
		add(a);
		add(b);
		add(L1);
		add(L2);
		add(L3);
		add(C1);
		add(C2);
		add(TF);
		add(TF2);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
}
	public static void main(String args[]){
		First f = new First();
}
}