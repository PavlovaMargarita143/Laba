package lab3;

public class Main {

	public static void main(String[] args) {
Mum R1 = new Mum();
try{ R1.getName();}
catch (NoNameException e){
	System.out.println(e.getMessage());
}
room.OldFurniture= true;
if (room.OldFurniture == true){
	System.out.print(" оказавшись в окружении старой мебели ");
	R1.feel("гораздо спокойнее");
	room R = new room(" комната ");
	R.actions("приняла жилой вид");
	System.out.println();
	}
room.RockingChair=true;
System.out.print("Она ");
try{
R1.sit();
}
catch (NowhereToSitException e){
	System.out.println(e.getMessage());
}
System.out.print("и ");
R1.dream("занавесках и обоях небесно-голубого цвета ");
System.out.print("Дом ");
House H = new House("дом"){
	@Override
	public void be(){
		System.out.println("этот дом был необычным");
	}
	
};
H.be();
H.setName("дом");
H.actions("плыл");
H.across("долину");
System.out.println();
R1.setName("Муми-мама");
R1.set();
R1.in("своем новом доме");
System.out.println();
table tabl = new table("Стол");
tabl.Seem("несколько сиротливым");
tabl.in(" большом незнакомом зале");
System.out.println(" Стол накрыт = "+table.IsCover);
chairs R3 = new chairs("Стулья");
R3.LineUp();
R3.around("стола, ");
trellis R4 = new trellis ("трельяж");
R4.Stay();
System.out.print("и"+ " ");
R4.Seem("стражем и");
cupboard R5 = new cupboard ("шкаф", Adjective.платяной);
R5.Stay();
System.out.print("и ");
R5.Seem("стражем");
System.out.println();
room R6 = new room("комната ");
R6.behind("ними");
R6.in("мрачном запустении");
R6.actions("терялась");
System.out.print(" и ");
DustSilence R7 = new DustSilence("пыль и безмолвие");
R7.actions("царили");
System.out.println();
Ceiling R8 = new Ceiling("потолок");
System.out.print(" ");
R8.Seem("самым удивительным");
System.out.println();
R8.on(" нем");
Lamp R9 = new Lamp(Adjective.парадный, Adjective.гостиный, "абажур");
R9.with();
R9.Hang();
System.out.println();
System.out.print("А ");
Shadows R10 = new Shadows("тени", Adjective.таинственные);
R10.actions("его скрывали");
System.out.println();
System.out.print("Там ");
SomeTh R11 = new SomeTh ("что-то", Adjective.большое, Adjective.неизвестное);
R11.actions(" двигалось и болталось");
System.out.println();
System.out.print("Дом ");
H.actions("раскачивался");
H.on(" воде");
System.out.print("и"+ " ");
H.actions("плыл");
System.out.println();
R1.setName("Она ");
R1.count( "чашки ");
R1.on(" столе ");
System.out.println();
Homsa X = new Homsa();
X.setName("Он");
X.go();
X.in("темноту");
System.out.println();
X.setName("Хомса");
X.openDoor();
System.out.print(" и"+ " ");
X.see("камин нарисованный");
X.on(" двери");
System.out.println();
X.setName("Он");
X.go();
X.in("вверх по лестнице ");
System.out.println();
X.setName("Хомса");
X.think();
H.door.leads();
H.stairs.leads();
System.out.print("и о многом другом");

}

}
