/*"Ok so it seems whenever you create a new java file,
 * it's linked to the default package initially. Once
 * you add the package declaration to that java file,
 * the linked resource behind the scene should be
 * updated to the proper package"
 * https://github.com/redhat-developer/vscode-java/issues/274
 * In short, it appears that you need to declare the package you are in,
 * then you can start importing whatever the heck you want. I don't know if
 * it was the proper fix to the fact that nothing outside of the (default package) 
 * didn't seem to cooperate with importing stuff and the src/(default package) stuff
 * worked. I tried named packages cause for the life of me I couldn't figure out how 
 * on earth to get a proper file path to connect to another class in the same folder...
 * This still may not work in the end, but one step forward, no steps back (I hope)
 * -Gareth, 12:52 AM 3/3/18
 * 
 * switch statements are only for ints, convertable strings, and enum are allowed
 */
import java.util.Random;
import java.util.Scanner;

//test for github 

public class v2 {
	public static void main(String[] args) {
		Random dice = new Random();
		int rolltotalS, rolltotalC, rolltotalD, rolltotalI, rolltotalW, rolltotalCh, strength, con, dex, intel, wis, chars;
		int roll[] = { 1 + dice.nextInt(6), 1 + dice.nextInt(6), 1 + dice.nextInt(6), 1 + dice.nextInt(6),
				1 + dice.nextInt(6), 1 + dice.nextInt(6), 1 + dice.nextInt(6), 1 + dice.nextInt(6), 1 + dice.nextInt(6),
				1 + dice.nextInt(6), 1 + dice.nextInt(6), 1 + dice.nextInt(6), 1 + dice.nextInt(6), 1 + dice.nextInt(6),
				1 + dice.nextInt(6), 1 + dice.nextInt(6), 1 + dice.nextInt(6), 1 + dice.nextInt(6), 1 + dice.nextInt(6),
				1 + dice.nextInt(6), 1 + dice.nextInt(6), 1 + dice.nextInt(6), 1 + dice.nextInt(6),
				1 + dice.nextInt(6) };

		int roll1, roll2, roll3, roll4, roll5, roll6, roll7, roll8, roll9, roll10, roll11, roll12, roll13, roll14,
			roll15, roll16, roll17, roll18, roll19, roll20, roll21, roll22, roll23, roll24;
		roll1 = roll[0];
		roll2 = roll[1];
		roll3 = roll[2];
		roll4 = roll[3];
		roll5 = roll[4];
		roll6 = roll[5];
		roll7 = roll[6];
		roll8 = roll[7];
		roll9 = roll[8];
		roll10 = roll[9];
		roll11 = roll[10];
		roll12 = roll[11];
		roll13 = roll[12];
		roll14 = roll[13];
		roll15 = roll[14];
		roll16 = roll[15];
		roll17 = roll[16];
		roll18 = roll[17];
		roll19 = roll[18];
		roll20 = roll[19];
		roll21 = roll[20];
		roll22 = roll[21];
		roll23 = roll[22];
		roll24 = roll[23];

rolltotalS = roll1 + roll2 + roll3 + roll4;
rolltotalC = roll5 + roll6 + roll7 + roll8;
rolltotalD = roll9 + roll10 + roll11 + roll12;
rolltotalI = roll13 + roll14 + roll15 + roll16;
rolltotalW = roll17 + roll18 + roll19 + roll20;
rolltotalCh = roll21 + roll22 + roll23 + roll24;

strength = rolltotalS - (Math.min((Math.min(roll1, roll2)), (Math.min(roll3, roll4))));
con = rolltotalC - (Math.min((Math.min(roll5, roll6)), (Math.min(roll7, roll8))));
dex = rolltotalD - (Math.min((Math.min(roll9, roll10)), (Math.min(roll11, roll12))));
intel = rolltotalI - (Math.min((Math.min(roll13, roll14)), (Math.min(roll15, roll16))));
wis = rolltotalW - (Math.min((Math.min(roll17, roll18)), (Math.min(roll19, roll20))));
chars = rolltotalCh - (Math.min((Math.min(roll21, roll22)), (Math.min(roll23, roll24))));

int Smod, Cmod, Dmod, Imod, Wmod, Chmod;

if (strength < 4)
Smod = (-4);
else if (strength < 6)
Smod = (-3);
else if (strength < 8)
Smod = (-2);
else if (strength < 10)
Smod = (-1);
else if (strength < 12)
Smod = (0);
else if (strength < 14)
Smod = (1);
else if (strength < 16)
Smod = (2);
else if (strength < 18)
Smod = (3);
else 
Smod = (4);

if (con < 4)
Cmod = (-4);
else if (con < 6)
Cmod = (-3);
else if (con < 8)
Cmod = (-2);
else if (con < 10)
Cmod = (-1);
else if (con < 12)
Cmod = (0);
else if (con < 14)
Cmod = (1);
else if (con < 16)
Cmod = (2);
else if (con < 18)
Cmod = (3);
else 
Cmod = (4);

if (dex < 4)
Dmod = (-4);
else if (dex < 6)
Dmod = (-3);
else if (dex < 8)
Dmod = (-2);
else if (dex < 10)
Dmod = (-1);
else if (dex < 12)
Dmod = (0);
else if (dex < 14)
Dmod = (1);
else if (dex < 16)
Dmod = (2);
else if (dex < 18)
Dmod = (3);
else 
Dmod = (4);

if (intel < 4)
Imod = (-4);
else if (intel < 6)
Imod = (-3);
else if (intel < 8)
Imod = (-2);
else if (intel < 10)
Imod = (-1);
else if (intel < 12)
Imod = (0);
else if (intel < 14)
Imod = (1);
else if (intel < 16)
Imod = (2);
else if (intel < 18)
Imod = (3);
else 
Imod = (4);

if (wis < 4)
Wmod = (-4);
else if (wis < 6)
Wmod = (-3);
else if (wis < 8)
Wmod = (-2);
else if (wis < 10)
Wmod = (-1);
else if (wis < 12)
Wmod = (0);
else if (wis < 14)
Wmod = (1);
else if (wis < 16)
Wmod = (2);
else if (wis < 18)
Wmod = (3);
else 
Wmod = (4);

if (chars < 4)
Chmod = (-4);
else if (chars < 6)
Chmod = (-3);
else if (chars < 8)
Chmod = (-2);
else if (chars < 10)
Chmod = (-1);
else if (chars < 12)
Chmod = (0);
else if (chars < 14)
Chmod = (1);
else if (chars < 16)
Chmod = (2);
else if (chars < 18)
Chmod = (3);
else 
Chmod = (4);
	
		int Acrobatics, Arcana, Athletics, Bluff, Diplomacy, Dungeoneering, Endurance, Heal, History, Insight, Intimidate, Nature, Perception, Religion, Stealth, Streetwise, Thievery;
			//above: all 17 skills for the skill tree
		Scanner kappa = new Scanner(System.in);
		Scanner lawl = new Scanner(System.in);
		
		int race, armor, type, clss, train, shifter, wilden;
		shifter = 0;
		
		System.out.println("Select the number of your race:");
		System.out.println("1. Dragonborn");
		System.out.println("2. Dwarf");
		System.out.println("3. Eladrin");
		System.out.println("4. Elf");
		System.out.println("5. Half-Elf");
		System.out.println("6. Halfling");
		System.out.println("7. Human");
		System.out.println("8. Tiefling");
		System.out.println("9. Deva");
		System.out.println("10. Gnome");
		System.out.println("11. Goliath");
		System.out.println("12. Half-Orc");
		System.out.println("13. Shifter");
		System.out.println("14. Changeling");
		System.out.println("15. Kalashtar");
		System.out.println("16. Warforged");
		System.out.println("");

		
		
		race = kappa.nextInt();
		//if/else if statements that won't let me perform numerous actions per "if/else if" scenario lines 350-
		switch (race) {
		case 1:
			System.out.println("You have selected the mighty Dragonborn!");
			System.out.println("");
			strength = strength + 2;
			chars = chars + 2;
			break;
		case 2:
			System.out.println("You have selected the small, yet powerful, Dwarf!");
			System.out.println("");
			con = con + 2;
			wis = wis + 2;
			break;
		case 3:
			System.out.println("You have selected the Fey Eladrin!");
			System.out.println("");
			dex = dex + 2;
			Imod = Imod + 2;
			break;
		case 4:
			System.out.println("You have selected the intelligent Elf!");
			System.out.println("");
			dex = dex + 2;
			wis = wis + 2;
			break;
		case 5:
			System.out.println("You have selected the Human/Elf hybrid known as the Half-Elf!");
			System.out.println("");
			con = con + 2;
			chars = chars + 2;
			break;
		case 6:
			System.out.println("You have selected the small, but fierce, Halfling!");
			System.out.println("");
			dex = dex + 2;
			chars = chars + 2;
			break;
		case 7:
			System.out.println("You have selected the intelligent Human!");
			System.out.println("");
			System.out.println("Add +2 to one of your 6 ability scores.");
			System.out.println("-------------------");
			System.out.println("");
			break;
		case 8:
			System.out.println("You have selected the fearsome Tiefling!");
			System.out.println("");
			chars = chars + 2;
			intel = intel + 2;
			break;
		case 9:
			System.out.println("You have selected the virtuous Deva!");
			System.out.println("");
			intel = intel + 2;
			wis = wis + 2;
			break;
		case 10:
			System.out.println("You have selected the sly Gnome!");
			System.out.println("");
			intel = intel + 2;
			chars = chars + 2;
			break;
		case 11:
			System.out.println("You have selected the Strong Goliath!");
			System.out.println("");
			strength = strength + 2;
			con = con + 2;
			break;
		case 12:
			System.out.println("You have selected the Human/Orc hybrid known as the Half-Orc!");
			System.out.println("");
			strength = strength + 2;
			dex = dex + 2;
			break;
		case 13:
			System.out.println("You have selected the ferocious Shifter!");
			System.out.println("");
			System.out.println("Do you want to be a:");
			System.out.println("1. Longtooth Shifter?");
			System.out.println("2. Razorclaw Shifter?");
			shifter = lawl.nextInt();
				if (shifter > 1) 
					dex = dex + 2;
				else
					strength = strength + 2;
				
				if (shifter > 1)
					wis = wis + 2;
				else
					wis = wis + 2;
			break;
		case 14:
			System.out.println("You have selected the stealthy Changeling!");
			System.out.println("");
			dex = dex + 2;
			intel = intel + 2;
			break;
		case 15:
			System.out.println("You have selected the sharp-minded Kalashtar!");
			System.out.println("");
			wis = wis + 2;
			chars = chars + 2;
			break;
		case 16:
			System.out.println("You have selected the great Warforged!");
			System.out.println("");
			strength = strength + 2;
			con = con + 2;
			break;
		case 17:
			System.out.println("You have selected the disciplined Githzerai!");
			System.out.println("");
			wis = wis + 2;
			dex = dex + 2;
			break;
		case 18:
			System.out.println("You have selected the powerful Minotaur!");
			System.out.println("");
			strength = strength + 2;
			con = con + 2;
			break;
		case 19:
			System.out.println("You have selected the energetic Shardmind!");
			System.out.println("");
			intel = intel + 2;
			wis = wis + 2;
			break;
		case 20:
			System.out.println("You have selected the guardian of nature, the Wilden!");
			System.out.println("");
			wis = wis + 2;
			con = con + 2;
			break;
		}
	
	if (strength < 4)
		Smod = (-4);
	else if (strength < 6)
		Smod = (-3);
	else if (strength < 8)
		Smod = (-2);
	else if (strength < 10)
		Smod = (-1);
	else if (strength < 12)
		Smod = (0);
	else if (strength < 14)
		Smod = (1);
	else if (strength < 16)
		Smod = (2);
	else if (strength < 18)
		Smod = (3);
	else 
		Smod = (4);

	if (con < 4)
		Cmod = (-4);
	else if (con < 6)
		Cmod = (-3);
	else if (con < 8)
		Cmod = (-2);
	else if (con < 10)
		Cmod = (-1);
	else if (con < 12)
		Cmod = (0);
	else if (con < 14)
		Cmod = (1);
	else if (con < 16)
		Cmod = (2);
	else if (con < 18)
		Cmod = (3);
	else 
		Cmod = (4);

	if (dex < 4)
		Dmod = (-4);
	else if (dex < 6)
		Dmod = (-3);
	else if (dex < 8)
		Dmod = (-2);
	else if (dex < 10)
		Dmod = (-1);
	else if (dex < 12)
		Dmod = (0);
	else if (dex < 14)
		Dmod = (1);
	else if (dex < 16)
		Dmod = (2);
	else if (dex < 18)
		Dmod = (3);
	else 
		Dmod = (4);

	if (intel < 4)
		Imod = (-4);
	else if (intel < 6)
		Imod = (-3);
	else if (intel < 8)
		Imod = (-2);
	else if (intel < 10)
		Imod = (-1);
	else if (intel < 12)
		Imod = (0);
	else if (intel < 14)
		Imod = (1);
	else if (intel < 16)
		Imod = (2);
	else if (intel < 18)
		Imod = (3);
	else 
		Imod = (4);

	if (wis < 4)
		Wmod = (-4);
	else if (wis < 6)
		Wmod = (-3);
	else if (wis < 8)
		Wmod = (-2);
	else if (wis < 10)
		Wmod = (-1);
	else if (wis < 12)
		Wmod = (0);
	else if (wis < 14)
		Wmod = (1);
	else if (wis < 16)
		Wmod = (2);
	else if (wis < 18)
		Wmod = (3);
	else 
		Wmod = (4);
		
	if (chars < 4)
		Chmod = (-4);
	else if (chars < 6)
		Chmod = (-3);
	else if (chars < 8)
		Chmod = (-2);
	else if (chars < 10)
		Chmod = (-1);
	else if (chars < 12)
		Chmod = (0);
	else if (chars < 14)
		Chmod = (1);
	else if (chars < 16)
		Chmod = (2);
	else if (chars < 18)
		Chmod = (3);
	else 
		Chmod = (4);
	

	Acrobatics = Dmod;
	Arcana = Imod;
	Athletics = Smod;
	Bluff = Chmod;
	Diplomacy = Chmod;
	Dungeoneering = Wmod;
	Endurance = Cmod;
	Heal = Wmod;
	History = Imod;
	Insight = Wmod;
	Intimidate = Chmod;
	Nature = Wmod;
	Perception = Wmod;
	Religion = Imod;
	Stealth = Dmod;
	Streetwise = Chmod;
	Thievery = Dmod;
	
	//next 2 blocks are modifying the 17 skills shown above, depending on race
	switch (race) {
	case 1:
		History = History + 2;
		Intimidate = Intimidate + 2;
		break;
	case 2:
		Dungeoneering = Dungeoneering + 2 ;
		Endurance = Endurance + 2;
		break;
	case 3:
		History = History + 2;
		Arcana = Arcana + 2;
		break;
	case 4:
		Nature = Nature + 2;
		Perception = Perception + 2;
		break;
	case 5:
		Diplomacy = Diplomacy + 2;
		Insight = Insight + 2;
		break;
	case 6:
		Acrobatics = Acrobatics + 2;
		Thievery = Thievery + 2;
		break;
	case 7:
		System.out.println("No bonuses to your skill tree are given. :(");
		break;
	case 8:
		Bluff = Bluff + 2;
		Stealth = Stealth + 2;
		break;
	case 9:
		History = History + 2;
		Religion = Religion + 2;
		break;
	case 10:
		Arcana = Arcana + 2;
		Stealth = Stealth + 2;
		break;
	case 11:
		Athletics = Athletics + 2;
		Nature = Nature + 2;
		break;
	case 12:
		Endurance = Endurance + 2;
		Intimidate = Intimidate + 2;
		break;
	case 13:
		if (shifter > 1) 
			Acrobatics = Acrobatics + 2;
		else
			Athletics = Athletics + 2;
		
		if (shifter > 1)
			Stealth = Stealth + 2;
		else
			Endurance = Endurance + 2;
		break;
	case 14:
		Bluff = Bluff + 2;
		Insight = Insight + 2;
		break;
	case 15:
		Insight = Insight + 2;
		System.out.println("");
		System.out.println("+2 to any skill except Insight!");
		System.out.println("");
		break;
	case 16:
		Endurance = Endurance + 2;
		Intimidate = Intimidate + 2;
		break;
	case 17:
		Acrobatics = Acrobatics + 2;
		Athletics = Athletics + 2;
		break;
	case 18:
		Nature = Nature + 2;
		Perception = Perception + 2;
		break;
	case 19:
		Arcana = Arcana + 2;
		Endurance = Endurance + 2;
		System.out.println("+2 to any one of your skills, except Arcana or Endurance");
		break;
	case 20:
		Nature = Nature + 2;
		Stealth = Stealth + 2;
		break;
	}
	
	
	int APerception, AInsight;
	APerception = Perception + 10;
	AInsight = Insight + 10;
	
	//ARMOR------------------------------------------------
	
		int AC;
		AC = 10;
		Scanner pogchamp = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("Select your armor!");
		System.out.println("1. Cloth");
		System.out.println("2. Leather");
		System.out.println("3. Hide");
		System.out.println("4. Chainmail");
		System.out.println("5. Scale");
		System.out.println("6. Plate");
		System.out.println("");

		
		armor = pogchamp.nextInt();
		
		switch (armor) {
		case 1:
			System.out.println("You chose Cloth Armor!");
			//AC, Acrobatics, Athletics, Endurance, Stealth, and Thievery don't change because of this armor, no need to program it = itself
			break;
		case 2:
			System.out.println("You chose Leather Armor!");
			AC = AC + 2;
			//Acrobatics, Athletics, Endurance, Stealth, and Thievery don't change because of this armor, no need to program it = itself
			break;
		case 3:
			System.out.println("You chose Hide Armor!");
			AC = AC + 3;
			Acrobatics = Acrobatics - 1;
			Athletics = Athletics - 1;
			Endurance = Endurance - 1;
			Stealth = Stealth - 1;
			Thievery = Thievery - 1;
			break;
		case 4:
			System.out.println("You chose Chainmail Armor!");
			AC = AC + 6;
			Acrobatics = Acrobatics - 1;
			Athletics = Athletics - 1;
			Endurance = Endurance - 1;
			Stealth = Stealth - 1;
			Thievery = Thievery - 1;
			break;
		case 5:
			System.out.println("You chose Scale Armor!");
			AC = AC + 7;
			//Acrobatics, Athletics, Endurance, Stealth, and Thievery don't change because of this armor, no need to program it = itself
			break;
		case 6:
			System.out.println("You chose Plate Armor!");
			AC =AC + 8;
			Acrobatics = Acrobatics - 2;
			Athletics = Athletics - 2;
			Endurance = Endurance - 2;
			Stealth = Stealth - 2;
			Thievery = Thievery - 2;
			break;
		}
		
		Scanner meme = new Scanner(System.in);
		
		
		System.out.println("");
		System.out.println("Which kind of shield?");
		System.out.println("1. Light?");
		System.out.println("2. Heavy?");
		System.out.println("3. NONE.");
		System.out.println("");

		
		type = meme.nextInt();
		
		switch (type) {
		case 1:
			System.out.println("You chose the light shield!");
			System.out.println("");

			AC = AC + 1;
			//Acrobatics, Athletics, Endurance, Stealth, and Thievery don't change because of this armor, no need to program it = itself
			break;
		case 2:
			System.out.println("You chose the heavy shield!");
			System.out.println("");

			AC = AC +2;
			Acrobatics = Acrobatics - 2;
			Athletics = Athletics - 2;
			Endurance = Endurance - 2;
			Stealth = Stealth - 2;
			Thievery = Thievery - 2;
			break;
		case 3:
			break;
		}
		
		//------------------------------------------------------------------------------------------------------
		
		//class time oh boy
		
		
		int will, fort, ref, hp, surgeV, surgePD, HPperlvl;
		will = 10;
		fort = 10;
		ref = 10;
		hp = 0;
		surgeV = 0;
		surgePD = 0;
		HPperlvl = 0;
		
		System.out.println("");
		System.out.println("Select your class!");
		System.out.println("1. Cleric");
		System.out.println("2. Fighter");
		System.out.println("3. Paladin");
		System.out.println("4. Ranger");
		System.out.println("5. Rogue");
		System.out.println("6. Warlock");
		System.out.println("7. Warlord");
		System.out.println("8. Wizard");
		System.out.println("9. Avenger");
		System.out.println("10. Barbarian");
		System.out.println("11. Bard");
		System.out.println("12. Druid");
		System.out.println("13. Invoker");
		System.out.println("14. Shaman");
		System.out.println("15. Sorcerer");
		System.out.println("16. Warden");
		System.out.println("17. Artificer");
		System.out.println("18. Ardent");
		System.out.println("19. Battlemind");
		System.out.println("20. Monk");
		System.out.println("21. Psion");
		System.out.println("22. Runepriest");
		System.out.println("23. Seeker");
		
		Scanner nyan = new Scanner(System.in);
		Scanner badger = new Scanner(System.in);
		
		clss = nyan.nextInt();
		
		
		int counter1;
		counter1 = 0;
		System.out.println("");//spacing
		System.out.println("skills:");
		System.out.println("Acrobatics: " + Acrobatics);
		System.out.println("Arcana: " + Arcana);
		System.out.println("Athletics: " + Athletics);
		System.out.println("Bluff: " + Bluff);
		System.out.println("Diplomacy: " + Diplomacy);
		System.out.println("Dungeoneering: " + Dungeoneering);
		System.out.println("Endurance: " + Endurance);
		System.out.println("Heal: " + Heal);
		System.out.println("History: " + History);
		System.out.println("Insight: " + Insight);
		System.out.println("Intimidate: " + Intimidate);
		System.out.println("Nature: " + Nature);
		System.out.println("Perception: " + Perception);
		System.out.println("Religion: " + Religion);
		System.out.println("Stealth: " + Stealth);
		System.out.println("Streetwise: " + Streetwise);
		System.out.println("Thievery: " + Thievery);
		System.out.println("");
		switch (clss) {
		case 1:
			System.out.println("You chose to be a Cleric!");
			System.out.println("");
			
			will = will + 2;
			hp = 12 + con;
			surgeV = hp/4;
			surgePD = 7 + Cmod;
			HPperlvl = 5;
			Religion = Religion + 5;
			System.out.println("You are already trained in Religion!");
			System.out.println("Please select 3 more skills to be trained in:");
			System.out.println("");

			System.out.println("1. Arcana");
			System.out.println("2. Diplomacy");
			System.out.println("3. Heal");
			System.out.println("4. History");
			System.out.println("5. Insight");
			while (counter1 < 3) {
				train = badger.nextInt();
				if (train > 4)
					Insight = Insight + 5;
				else if (train > 3)
					History = History + 5;
				else if (train > 2)
					Heal = Heal + 5;
				else if (train > 1)
					Diplomacy = Diplomacy + 5;
				else
					Arcana = Arcana + 5;
				
				if (train > 4)
					System.out.println("You are trained in Insight!");
				else if (train > 3)
					System.out.println("You are trained in History!");
				else if (train > 2)
					System.out.println("You are trained in Healing!");
				else if (train > 1)
					System.out.println("You are trained in Diplomacy!");
				else
					System.out.println("You are trained in Arcana!");
				
				counter1++;
			}
			break;
		case 2:
			System.out.println("You chose to be a Fighter!");
			System.out.println("");

			fort = fort + 2;
			hp = 15 + con;
			surgeV = hp/4;
			surgePD = 9 + Cmod;
			HPperlvl = 6;
			System.out.println("Please select 3 skills to be trained in:");
			System.out.println("");

			System.out.println("1. Athletics");
			System.out.println("2. Endurance");
			System.out.println("3. Heal");
			System.out.println("4. Intimidate");
			System.out.println("5. Streetwise");
			while (counter1 < 3) {
				train = badger.nextInt();
				if (train > 4)
					Streetwise = Streetwise + 5;
				else if (train > 3)
					Intimidate = Intimidate + 5;
				else if (train > 2)
					Heal = Heal + 5;
				else if (train > 1)
					Endurance = Endurance + 5;
				else
					Athletics = Athletics + 5;
				
				if (train > 4)
					System.out.println("You are trained in Streetwise!");
				else if (train > 3)
					System.out.println("You are trained in Intimidate!");
				else if (train > 2)
					System.out.println("You are trained in Healing!");
				else if (train > 1)
					System.out.println("You are trained in Endurance!");
				else
					System.out.println("You are trained in Athletics!");
				
				counter1++;
			}
			break;
		case 3:
			System.out.println("You chose to be a Paladin!");
			System.out.println("");

			fort = fort + 1;
			ref = ref + 1;
			will = will + 1;
			hp = 15 + con;
			surgeV = hp/4;
			surgePD = 10 + Cmod;
			HPperlvl = 6;
			System.out.println("Please select 3 skills to be trained in:");
			System.out.println("");

			System.out.println("1. Diplomacy");
			System.out.println("2. Endurance");
			System.out.println("3. Heal");
			System.out.println("4. Insight");
			System.out.println("5. Intimidate");
			System.out.println("6. Religion");
			while (counter1 < 3) {
				train = badger.nextInt();
				if (train > 5)
					Religion = Religion + 5;
				else if (train > 4)
					Intimidate = Intimidate + 5;
				else if (train > 3)
					Insight = Insight + 5;
				else if (train > 2)
					Heal = Heal + 5;
				else if (train > 1)
					Endurance = Endurance + 5;
				else
					Diplomacy = Diplomacy + 5;
				
				if (train > 5)
					System.out.println("You are trained in Religion!");
				else if (train > 4)
					System.out.println("You are trained in Intimidate!");
				else if (train > 3)
					System.out.println("You are trained in Insight!");
				else if (train > 2)
					System.out.println("You are trained in Healing!");
				else if (train > 1)
					System.out.println("You are trained in Endurance!");
				else
					System.out.println("You are trained in Diplomacy!");
				
				counter1++;
			}
			break;
		case 4:
			System.out.println("You chose to be a Ranger!");
			System.out.println("");

			fort = fort + 1;
			ref = ref + 1;
			hp = 12 + con;
			surgeV = hp/4;
			surgePD = 6 + Cmod;
			HPperlvl = 5;
			System.out.println("Manually add 5 to either your Dungeoneering or Nature skill before continuing!");
			System.out.println("Please select 4 more skills to be trained in:");
			System.out.println("");

			System.out.println("1. Acrobatics");
			System.out.println("2. Athletics");
			System.out.println("3. Dungeoneering");
			System.out.println("4. Endurance");
			System.out.println("5. Heal");
			System.out.println("6. Nature");
			System.out.println("7. Perception");
			System.out.println("8. Stealth");
			while (counter1 < 4) {
				train = badger.nextInt();
				
				if (train > 7)
					Stealth = Stealth + 5;
				else if (train > 6)
					Perception = Perception + 5;
				else if (train > 5)
					Nature = Nature + 5;
				else if (train > 4)
					Heal = Heal + 5;
				else if (train > 3)
					Endurance = Endurance + 5;
				else if (train > 2)
					Dungeoneering = Dungeoneering + 5;
				else if (train > 1)
					Athletics = Athletics + 5;
				else
					Acrobatics = Acrobatics + 5;
				
				if (train > 7)
					System.out.println("You are trained in Stealth");
				else if (train > 6)
					System.out.println("You are trained in Perception");
				else if (train > 5)
					System.out.println("You are trained in Nature!");
				else if (train > 4)
					System.out.println("You are trained in Healing!");
				else if (train > 3)
					System.out.println("You are trained in Endurance!");
				else if (train > 2)
					System.out.println("You are trained in Dungeoneering!");
				else if (train > 1)
					System.out.println("You are trained in Athletics!");
				else
					System.out.println("You are trained in Acrobatics!");
				
				counter1++;
			}
			break;
		case 5:
			System.out.println("You chose to be a Rogue!");
			System.out.println("");

			ref = ref + 2;
			hp = 12 + con;
			surgeV = hp/4;
			surgePD = 6 + Cmod;
			HPperlvl = 5;
			System.out.println("You are already trained in Stealth and Thievery!");
			Stealth = Stealth + 5;
			Thievery = Thievery + 5;
			System.out.println("Please select 4 more skills to be trained in:");
			System.out.println("");

			System.out.println("1. Acrobatics");
			System.out.println("2. Athletics");
			System.out.println("3. Bluff");
			System.out.println("4. Dungeoneering");
			System.out.println("5. Insight");
			System.out.println("6. Intimidate");
			System.out.println("7. Perception");
			System.out.println("8. Streetwise");
			while (counter1 < 4) {
				train = badger.nextInt();
	
				if (train > 7)
					Streetwise = Streetwise + 5;
				else if (train > 6)
					Perception = Perception + 5;
				else if (train > 5)
					Intimidate = Intimidate + 5;
				else if (train > 4)
					Insight = Insight + 5;
				else if (train > 3)
					Dungeoneering = Dungeoneering + 5;
				else if (train > 2)
					Bluff = Bluff + 5;
				else if (train > 1)
					Athletics = Athletics + 5;
				else
					Acrobatics = Acrobatics + 5;
				
				if (train > 7)
					System.out.println("You are trained in Streetwise");
				else if (train > 6)
					System.out.println("You are trained in Perception");
				else if (train > 5)
					System.out.println("You are trained in Intimidate!");
				else if (train > 4)
					System.out.println("You are trained in Insight!");
				else if (train > 3)
					System.out.println("You are trained in Dungeoneering!");
				else if (train > 2)
					System.out.println("You are trained in Bluff!");
				else if (train > 1)
					System.out.println("You are trained in Athletics!");
				else
					System.out.println("You are trained in Acrobatics!");
				
				counter1++;
			}
			break;
		case 6:
			System.out.println("You chose to be a Warlock!");
			System.out.println("");

			ref = ref + 1;
			will = will + 1;
			hp = 12 + con;
			surgeV = hp/4;
			surgePD = 6 + Cmod;
			HPperlvl = 5;
			System.out.println("Please select 4 skills to be trained in:");
			System.out.println("");

			System.out.println("1. Arcana");
			System.out.println("2. Bluff");
			System.out.println("3. History");
			System.out.println("4. Insight");
			System.out.println("5. Intimidate");
			System.out.println("6. Religion");
			System.out.println("7. Streetwise");
			System.out.println("8. Thievery");
			while (counter1 < 4) {
				train = badger.nextInt();
	
				if (train > 7)
					Thievery = Thievery + 5;
				else if (train > 6)
					Streetwise = Streetwise + 5;
				else if (train > 5)
					Religion = Religion + 5;
				else if (train > 4)
					Intimidate = Intimidate + 5;
				else if (train > 3)
					Insight = Insight + 5;
				else if (train > 2)
					History = History + 5;
				else if (train > 1)
					Bluff = Bluff + 5;
				else
					Arcana = Arcana + 5;
				
				if (train > 7)
					System.out.println("You are trained in Thievery");
				else if (train > 6)
					System.out.println("You are trained in Streetwise");
				else if (train > 5)
					System.out.println("You are trained in Religion!");
				else if (train > 4)
					System.out.println("You are trained in Intimidate!");
				else if (train > 3)
					System.out.println("You are trained in Insight!");
				else if (train > 2)
					System.out.println("You are trained in History!");
				else if (train > 1)
					System.out.println("You are trained in Bluff!");
				else
					System.out.println("You are trained in Arcana!");
				
				counter1++;
			}
			break;
		case 7:
			System.out.println("You chose to be a Warlord!");
			System.out.println("");

			fort = fort + 1;
			will = will + 1;
			hp = 12 + con;
			surgeV = hp/4;
			surgePD = 7 + Cmod;
			HPperlvl = 5;
			System.out.println("Please select 4 skills to be trained in:");
			System.out.println("");

			System.out.println("1. Athletics");
			System.out.println("2. Diplomacy");
			System.out.println("3. Endurance");
			System.out.println("4. Heal");
			System.out.println("5. History");
			System.out.println("6. Intimidate");
			while (counter1 < 4) {
				train = badger.nextInt();
	
				if (train > 5)
					Intimidate = Intimidate + 5;
				else if (train > 4)
					History = History + 5;
				else if (train > 3)
					Heal = Heal + 5;
				else if (train > 2)
					Endurance = Endurance + 5;
				else if (train > 1)
					Diplomacy = Diplomacy + 5;
				else
					Athletics = Athletics + 5;
				
				if (train > 5)
					System.out.println("You are trained in Intimidate!");
				else if (train > 4)
					System.out.println("You are trained in History!");
				else if (train > 3)
					System.out.println("You are trained in Heal!");
				else if (train > 2)
					System.out.println("You are trained in Endurance!");
				else if (train > 1)
					System.out.println("You are trained in Diplomacy!");
				else
					System.out.println("You are trained in Athletics!");
				
				counter1++;
			}
			break;
		case 8:
			System.out.println("You chose to be a Wizard!");
			System.out.println("");

			will = will + 2;
			hp = 10 + con;
			surgeV = hp/4;
			surgePD = 6 + Cmod;
			HPperlvl = 4;
			Arcana = Arcana + 5;
			System.out.println("You are already trained in Arcana!");
			System.out.println("Please select 3 more skills to be trained in:");
			System.out.println("");

			System.out.println("1. Diplomacy");
			System.out.println("2. Dungeoneering");
			System.out.println("3. History");
			System.out.println("4. Insight");
			System.out.println("5. Nature");
			System.out.println("6. Religion");
			while (counter1 < 3) {
				train = badger.nextInt();
	
				if (train > 5)
					Religion = Religion + 5;
				else if (train > 4)
					Nature = Nature + 5;
				else if (train > 3)
					Insight = Insight + 5;
				else if (train > 2)
					History = History + 5;
				else if (train > 1)
					Dungeoneering = Dungeoneering + 5;
				else
					Diplomacy = Diplomacy + 5;
				
				if (train > 5)
					System.out.println("You are trained in Religion!");
				else if (train > 4)
					System.out.println("You are trained in Nature!");
				else if (train > 3)
					System.out.println("You are trained in Insight!");
				else if (train > 2)
					System.out.println("You are trained in History!");
				else if (train > 1)
					System.out.println("You are trained in Dungeoneering!");
				else
					System.out.println("You are trained in Diplomacy!");
				
				counter1++;
			}
			break;
		case 9:
			System.out.println("You chose to be an Avenger!");
			System.out.println("");

			fort = fort + 1;
			ref = ref + 1;
			will = will + 1;
			
			hp = 14 + con;
			surgeV = hp/4;
			surgePD = 7 + Cmod;
			HPperlvl = 6;
			Religion = Religion + 5;
			System.out.println("You are already trained in Religion!");
			System.out.println("Please select 3 more skills to be trained in:");
			System.out.println("");

			System.out.println("1. Acrobatics");
			System.out.println("2. Athletics");
			System.out.println("3. Endurance");
			System.out.println("4. Heal");
			System.out.println("5. Intimidate");
			System.out.println("6. Perception");
			System.out.println("7. Stealth");
			System.out.println("8. Streetwise");
			while (counter1 < 3) {
				train = badger.nextInt();
	
				if (train > 7)
					Streetwise = Streetwise + 5;
				else if (train > 6)
					Stealth = Stealth + 5;
				else if (train > 5)
					Perception = Perception + 5;
				else if (train > 4)
					Intimidate = Intimidate + 5;
				else if (train > 3)
					Heal = Heal + 5;
				else if (train > 2)
					Endurance = Endurance + 5;
				else if (train > 1)
					Athletics = Athletics + 5;
				else
					Acrobatics = Acrobatics + 5;
				
				if (train > 7)
					System.out.println("You are trained in Streetwise!");
				else if (train > 6)
					System.out.println("You are trained in Stealth!");
				else if (train > 5)
					System.out.println("You are trained in Perception!");
				else if (train > 4)
					System.out.println("You are trained in Intimidate!");
				else if (train > 3)
					System.out.println("You are trained in Heal!");
				else if (train > 2)
					System.out.println("You are trained in Endurance!");
				else if (train > 1)
					System.out.println("You are trained in Athletics!");
				else
					System.out.println("You are trained in Acrobatics!");
				
				counter1++;
			}
			break;
		case 10:
			System.out.println("You chose to be a Barbarian!");
			System.out.println("");

			fort = fort + 2;
			
			hp = 15 + con;
			surgeV = hp/4;
			surgePD = 8 + Cmod;
			HPperlvl = 6;
			System.out.println("Please select 3 skills to be trained in:");
			System.out.println("");

			System.out.println("1. Acrobatics");
			System.out.println("2. Athletics");
			System.out.println("3. Endurance");
			System.out.println("4. Heal");
			System.out.println("5. Intimidate");
			System.out.println("6. Nature");
			System.out.println("7. Perception");
			while (counter1 < 3) {
				train = badger.nextInt();
	
				if (train > 6)
					Perception = Perception + 5;
				else if (train > 5)
					Nature = Nature + 5;
				else if (train > 4)
					Intimidate = Intimidate + 5;
				else if (train > 3)
					Heal = Heal + 5;
				else if (train > 2)
					Endurance = Endurance + 5;
				else if (train > 1)
					Athletics = Athletics + 5;
				else
					Acrobatics = Acrobatics + 5;
				
				if (train > 6)
					System.out.println("You are trained in Perception!");
				else if (train > 5)
					System.out.println("You are trained in Nature!");
				else if (train > 4)
					System.out.println("You are trained in Intimidate!");
				else if (train > 3)
					System.out.println("You are trained in Heal!");
				else if (train > 2)
					System.out.println("You are trained in Endurance!");
				else if (train > 1)
					System.out.println("You are trained in Athletics!");
				else
					System.out.println("You are trained in Acrobatics!");
				
				counter1++;
			}
			break;
		case 11:
			System.out.println("You chose to be a Bard!");
			System.out.println("");

			ref = ref + 1;
			will = will + 1;
			
			hp = 12 + con;
			surgeV = hp/4;
			surgePD = 7 + Cmod;
			HPperlvl = 5;
			Arcana = Arcana + 5;
			System.out.println("You are already trained in Arcana!");
			System.out.println("Please select 4 more skills to be trained in:");
			System.out.println("");

			System.out.println("1. Acrobatics");
			System.out.println("2. Athletics");
			System.out.println("3. Bluff");
			System.out.println("4. Diplomacy");
			System.out.println("5. Dungeoneering");
			System.out.println("6. Heal");
			System.out.println("7. Insight");
			System.out.println("8. Intimidate");
			System.out.println("9. Nature");
			System.out.println("10. Perception");
			System.out.println("11. Religion");
			System.out.println("12. Streetwise");
			while (counter1 < 4) {
				train = badger.nextInt();
	
				if (train > 11)
					Streetwise = Streetwise + 5;
				else if (train > 10)
					Religion = Religion + 5;
				else if (train > 9)
					Perception = Perception + 5;
				else if (train > 8)
					Nature = Nature + 5;
				else if (train > 7)
					Intimidate = Intimidate + 5;
				else if (train > 6)
					Insight = Insight + 5;
				else if (train > 5)
					Heal = Heal + 5;
				else if (train > 4)
					Dungeoneering = Dungeoneering + 5;
				else if (train > 3)
					Diplomacy = Diplomacy + 5;
				else if (train > 2)
					Bluff = Bluff + 5;
				else if (train > 1)
					Athletics = Athletics + 5;
				else
					Acrobatics = Acrobatics + 5;
				
				if (train > 11)
					System.out.println("You are trained in Streetwise!");
				else if (train > 10)
					System.out.println("You are trained in Religion!");
				else if (train > 9)
					System.out.println("You are trained in Perception!");
				else if (train > 8)
					System.out.println("You are trained in Nature!");
				else if (train > 7)
					System.out.println("You are trained in Intimidate!");
				else if (train > 6)
					System.out.println("You are trained in Insight!");
				else if (train > 5)
					System.out.println("You are trained in Heal!");
				else if (train > 4)
					System.out.println("You are trained in Dungeoneering!");
				else if (train > 3)
					System.out.println("You are trained in Diplomacy!");
				else if (train > 2)
					System.out.println("You are trained in Bluff!");
				else if (train > 1)
					System.out.println("You are trained in Athletics!");
				else
					System.out.println("You are trained in Acrobatics!");
				
				counter1++;
			}
			break;
		case 12:
			System.out.println("You chose to be a Druid!");
			System.out.println("");

			ref = ref + 1;
			will = will + 1;
			
			hp = 12 + con;
			surgeV = hp/4;
			surgePD = 7 + Cmod;
			HPperlvl = 5;
			Nature = Nature + 5;
			System.out.println("You are already trained in Nature!");
			System.out.println("Please select 3 more skills to be trained in:");
			System.out.println("");

			System.out.println("1. Arcana");
			System.out.println("2. Athletics");
			System.out.println("3. Diplomacy");
			System.out.println("4. Endurance");
			System.out.println("5. Heal");
			System.out.println("6. History");
			System.out.println("7. Insight");
			System.out.println("8. Perception");
			while (counter1 < 3) {
				train = badger.nextInt();
	
				if (train > 7)
					Perception = Perception + 5;
				else if (train > 6)
					Insight = Insight + 5;
				else if (train > 5)
					History = History + 5;
				else if (train > 4)
					Heal = Heal + 5;
				else if (train > 3)
					Endurance = Endurance + 5;
				else if (train > 2)
					Diplomacy = Diplomacy + 5;
				else if (train > 1)
					Athletics = Athletics + 5;
				else
					Arcana = Arcana + 5;
				
				if (train > 7)
					System.out.println("You are trained in Perception!");
				else if (train > 6)
					System.out.println("You are trained in Insight!");
				else if (train > 5)
					System.out.println("You are trained in History!");
				else if (train > 4)
					System.out.println("You are trained in Heal!");
				else if (train > 3)
					System.out.println("You are trained in Endurance!");
				else if (train > 2)
					System.out.println("You are trained in Diplomacy!");
				else if (train > 1)
					System.out.println("You are trained in Athletics!");
				else
					System.out.println("You are trained in Arcana!");
				
				counter1++;
			}
			break;
		case 13:
			System.out.println("You chose to be a Invoker!");
			System.out.println("");
			
			fort = fort + 1;
			ref = ref + 1;
			will = will + 1;
			
			hp = 10 + con;
			surgeV = hp/4;
			surgePD = 6 + Cmod;
			HPperlvl = 4;
			Religion = Religion + 5;
			System.out.println("You are already trained in Religion!");
			System.out.println("Please select 3 more skills to be trained in:");
			System.out.println("");

			System.out.println("1. Arcana");
			System.out.println("2. Diplomacy");
			System.out.println("3. Endurance");
			System.out.println("4. History");
			System.out.println("5. Insight");
			System.out.println("6. Intimidate");
			while (counter1 < 3) {
				train = badger.nextInt();
	
				if (train > 5)
					Intimidate = Intimidate + 5;
				else if (train > 4)
					Insight = Insight + 5;
				else if (train > 3)
					History = History + 5;
				else if (train > 2)
					Endurance = Endurance + 5;
				else if (train > 1)
					Diplomacy = Diplomacy + 5;
				else
					Arcana = Arcana + 5;
				
				if (train > 5)
					System.out.println("You are trained in Intimidate!");
				else if (train > 4)
					System.out.println("You are trained in Insight!");
				else if (train > 3)
					System.out.println("You are trained in History!");
				else if (train > 2)
					System.out.println("You are trained in Endurance!");
				else if (train > 1)
					System.out.println("You are trained in Diplomacy!");
				else
					System.out.println("You are trained in Arcana!");
				
				counter1++;
			}
			break;
		case 14:
			System.out.println("You chose to be a Shaman!");
			System.out.println("");

			fort = fort + 1;
			will = will + 1;
			
			hp = 12 + con;
			surgeV = hp/4;
			surgePD = 7 + Cmod;
			HPperlvl = 5;
			Nature = Nature + 5;
			System.out.println("You are already trained in Nature!");
			System.out.println("Please select 3 more skills to be trained in:");
			System.out.println("");

			System.out.println("1. Arcana");
			System.out.println("2. Athletics");
			System.out.println("3. Endurance");
			System.out.println("4. Heal");
			System.out.println("5. History");
			System.out.println("6. Insight");
			System.out.println("7. Perception");
			System.out.println("8. Religion");
			while (counter1 < 3) {
				train = badger.nextInt();
	
				if (train > 7)
					Religion = Religion + 5;
				else if (train > 6)
					Perception = Perception + 5;
				else if (train > 5)
					Insight = Insight + 5;
				else if (train > 4)
					History = History + 5;
				else if (train > 3)
					Heal = Heal + 5;
				else if (train > 2)
					Endurance = Endurance + 5;
				else if (train > 1)
					Athletics = Athletics + 5;
				else
					Arcana = Arcana + 5;
				
				if (train > 7)
					System.out.println("You are trained in Religion!");
				else if (train > 6)
					System.out.println("You are trained in Perception!");
				else if (train > 5)
					System.out.println("You are trained in Insight!");
				else if (train > 4)
					System.out.println("You are trained in History!");
				else if (train > 3)
					System.out.println("You are trained in Heal!");
				else if (train > 2)
					System.out.println("You are trained in Endurance!");
				else if (train > 1)
					System.out.println("You are trained in Athletics!");
				else
					System.out.println("You are trained in Arcana!");
				
				counter1++;
			}
			break;
		case 15:
			System.out.println("You chose to be a Sorcerer!");
			System.out.println("");

			
			will = will + 2;
			
			hp = 12 + con;
			surgeV = hp/4;
			surgePD = 6 + Cmod;
			HPperlvl = 5;
			Arcana = Arcana + 5;
			System.out.println("You are already trained in Arcana!");
			System.out.println("Please select 3 more skills to be trained in:");
			System.out.println("");

			System.out.println("1. Athletics");
			System.out.println("2. Bluff");
			System.out.println("3. Diplomacy");
			System.out.println("4. Dungeoneering");
			System.out.println("5. Endurance");
			System.out.println("6. History");
			System.out.println("7. Insight");
			System.out.println("8. Intimidate");
			System.out.println("9. Nature");
			while (counter1 < 3) {
				train = badger.nextInt();
	
				if (train > 8)
					Nature = Nature + 5;
				else if (train > 7)
					Intimidate = Intimidate + 5;
				else if (train > 6)
					Insight = Insight + 5;
				else if (train > 5)
					History = History + 5;
				else if (train > 4)
					Endurance = Endurance + 5;
				else if (train > 3)
					Dungeoneering = Dungeoneering + 5;
				else if (train > 2)
					Diplomacy = Diplomacy + 5;
				else if (train > 1)
					Bluff = Bluff + 5;
				else
					Athletics = Athletics + 5;
				
				if (train > 8)
					System.out.println("You are trained in Nature!");
				else if (train > 7)
					System.out.println("You are trained in Intimidate!");
				else if (train > 6)
					System.out.println("You are trained in Insight!");
				else if (train > 5)
					System.out.println("You are trained in History!");
				else if (train > 4)
					System.out.println("You are trained in Endurance!");
				else if (train > 3)
					System.out.println("You are trained in Dungeoneering!");
				else if (train > 2)
					System.out.println("You are trained in Diplomacy!");
				else if (train > 1)
					System.out.println("You are trained in Bluff!");
				else
					System.out.println("You are trained in Athletics!");
				
				counter1++;
			}
			break;
		case 16:
			System.out.println("You chose to be a Warden!");
			System.out.println("");

			fort = fort + 1;
			will = will + 1;
			
			hp = 17 + con;
			surgeV = hp/4;
			surgePD = 9 + Cmod;
			HPperlvl = 7;
			Nature = Nature + 5;
			System.out.println("You are already trained in Nature!");
			System.out.println("Please select 3 more skills to be trained in:");
			System.out.println("");

			System.out.println("1. Athletics");
			System.out.println("2. Dungeoneering");
			System.out.println("3. Endurance");
			System.out.println("4. Heal");
			System.out.println("5. Intimidate");
			System.out.println("6. Perception");
			while (counter1 < 3) {
				train = badger.nextInt();
	
				if (train > 5)
					Perception = Perception + 5;
				else if (train > 4)
					Intimidate = Intimidate + 5;
				else if (train > 3)
					Heal = Heal + 5;
				else if (train > 2)
					Endurance = Endurance + 5;
				else if (train > 1)
					Dungeoneering = Dungeoneering + 5;
				else
					Athletics = Athletics + 5;
				
				if (train > 5)
					System.out.println("You are trained in Perception!");
				else if (train > 4)
					System.out.println("You are trained in Intimidate!");
				else if (train > 3)
					System.out.println("You are trained in Heal!");
				else if (train > 2)
					System.out.println("You are trained in Endurance!");
				else if (train > 1)
					System.out.println("You are trained in Dungeoneering!");
				else
					System.out.println("You are trained in Athletics!");
				
				counter1++;
			}
			break;
		case 17:
			System.out.println("You chose to be an Artificer!");
			System.out.println("");

			fort = fort + 1;
			will = will + 1;
			
			hp = 12 + con;
			surgeV = hp/4;
			surgePD = 6 + Cmod;
			HPperlvl = 5;
			Arcana = Arcana + 5;
			System.out.println("You are already trained in Arcana!");
			System.out.println("Please select 4 more skills to be trained in:");
			System.out.println("");

			System.out.println("1. Diplomacy");
			System.out.println("2. Dungeoneering");
			System.out.println("3. Heal");
			System.out.println("4. History");
			System.out.println("5. Perception");
			System.out.println("6. Thievery");
			while (counter1 < 4) {
				train = badger.nextInt();
	
				if (train > 5)
					Thievery = Thievery + 5;
				else if (train > 4)
					Perception = Perception + 5;
				else if (train > 3)
					History = History + 5;
				else if (train > 2)
					Heal = Heal + 5;
				else if (train > 1)
					Dungeoneering = Dungeoneering + 5;
				else
					Diplomacy = Diplomacy + 5;
				
				if (train > 5)
					System.out.println("You are trained in Thievery!");
				else if (train > 4)
					System.out.println("You are trained in Perception!");
				else if (train > 3)
					System.out.println("You are trained in History!");
				else if (train > 2)
					System.out.println("You are trained in Heal!");
				else if (train > 1)
					System.out.println("You are trained in Dungeoneering!");
				else
					System.out.println("You are trained in Diplomacy!");
				
				counter1++;
			}
			break;
		case 18:
			System.out.println("You chose to be an Ardent!");
			System.out.println("");

			fort = fort + 1;
			will = will + 1;
			
			hp = 12 + con;
			surgeV = hp/4;
			surgePD = 7 + Cmod;
			HPperlvl = 5;
			System.out.println("Please select 4 skills to be trained in:");
			System.out.println("");

			System.out.println("1. Arcana");
			System.out.println("2. Athletics");
			System.out.println("3. Bluff");
			System.out.println("4. Diplomacy");
			System.out.println("5. Endurance");
			System.out.println("6. Heal");
			System.out.println("7. Insight");
			System.out.println("8. Intimidate");
			System.out.println("9. Streetwise");
			while (counter1 < 4) {
				train = badger.nextInt();
	
				if (train > 8)
					Streetwise = Streetwise + 5;
				else if (train > 7)
					Intimidate = Intimidate + 5;
				else if (train > 6)
					Insight = Insight + 5;
				else if (train > 5)
					Heal = Heal + 5;
				else if (train > 4)
					Endurance = Endurance + 5;
				else if (train > 3)
					Diplomacy = Diplomacy + 5;
				else if (train > 2)
					Bluff = Bluff + 5;
				else if (train > 1)
					Athletics = Athletics + 5;
				else
					Arcana = Arcana + 5;
				
				if (train > 8)
					System.out.println("You are trained in Streetwise!");
				else if (train > 7)
					System.out.println("You are trained in Intimidate!");
				else if (train > 6)
					System.out.println("You are trained in Insight!");
				else if (train > 5)
					System.out.println("You are trained in Heal!");
				else if (train > 4)
					System.out.println("You are trained in Endurance!");
				else if (train > 3)
					System.out.println("You are trained in Diplomacy!");
				else if (train > 2)
					System.out.println("You are trained in Bluff!");
				else if (train > 1)
					System.out.println("You are trained in Athletics!");
				else
					System.out.println("You are trained in Arcana!");
				
				counter1++;
			}
			break;
		case 19:
			System.out.println("You chose to be a Battlemind!");
			System.out.println("");

			will = will + 2;
			
			hp = 15 + con;
			surgeV = hp/4;
			surgePD = 9 + Cmod;
			HPperlvl = 6;
			System.out.println("Please select 3 skills to be trained in:");
			System.out.println("");

			System.out.println("1. Arcana");
			System.out.println("2. Athletics");
			System.out.println("3. Bluff");
			System.out.println("4. Diplomacy");
			System.out.println("5. Endurance");
			System.out.println("6. Heal");
			System.out.println("7. Insight");
			System.out.println("8. Intimidate");
			while (counter1 < 3) {
				train = badger.nextInt();
	
				if (train > 7)
					Intimidate = Intimidate + 5;
				else if (train > 6)
					Insight = Insight + 5;
				else if (train > 5)
					Heal = Heal + 5;
				else if (train > 4)
					Endurance = Endurance + 5;
				else if (train > 3)
					Diplomacy = Diplomacy + 5;
				else if (train > 2)
					Bluff = Bluff + 5;
				else if (train > 1)
					Athletics = Athletics + 5;
				else
					Arcana = Arcana + 5;
				
				if (train > 7)
					System.out.println("You are trained in Intimidate!");
				else if (train > 6)
					System.out.println("You are trained in Insight!");
				else if (train > 5)
					System.out.println("You are trained in Heal!");
				else if (train > 4)
					System.out.println("You are trained in Endurance!");
				else if (train > 3)
					System.out.println("You are trained in Diplomacy!");
				else if (train > 2)
					System.out.println("You are trained in Bluff!");
				else if (train > 1)
					System.out.println("You are trained in Athletics!");
				else
					System.out.println("You are trained in Arcana!");
				
				counter1++;
			}
			break;
		case 20:
			System.out.println("You chose to be a Monk!");
			System.out.println("");

			fort = fort + 1;
			ref = ref + 1;
			will = will + 1;
			
			hp = 12 + con;
			surgeV = hp/4;
			surgePD = 7 + Cmod;
			HPperlvl = 5;
			System.out.println("Please select 4 skills to be trained in:");
			System.out.println("");

			System.out.println("1. Acrobatics");
			System.out.println("2. Athletics");
			System.out.println("3. Diplomacy");
			System.out.println("4. Endurance");
			System.out.println("5. Heal");
			System.out.println("6. Insight");
			System.out.println("7. Perception");
			System.out.println("8. Religion");
			System.out.println("9. Stealth");
			System.out.println("10. Thievery");
			while (counter1 < 4) {
				train = badger.nextInt();
	
				if ( train > 9)
					Thievery = Thievery + 5;
				else if (train > 8)
					Stealth = Stealth + 5;
				else if (train > 7)
					Religion = Religion + 5;
				else if (train > 6)
					Perception = Perception + 5;
				else if (train > 5)
					Insight = Insight + 5;
				else if (train > 4)
					Heal = Heal + 5;
				else if (train > 3)
					Endurance = Endurance + 5;
				else if (train > 2)
					Diplomacy = Diplomacy + 5;
				else if (train > 1)
					Athletics = Athletics + 5;
				else
					Acrobatics = Acrobatics + 5;
				
				if ( train > 9)
					System.out.println("You are trained in Thievery!");
				else if (train > 8)
					System.out.println("You are trained in Stealth!");
				else if (train > 7)
					System.out.println("You are trained in Religion!");
				else if (train > 6)
					System.out.println("You are trained in Perception!");
				else if (train > 5)
					System.out.println("You are trained in Insight!");
				else if (train > 4)
					System.out.println("You are trained in Heal!");
				else if (train > 3)
					System.out.println("You are trained in Endurance!");
				else if (train > 2)
					System.out.println("You are trained in Diplomacy!");
				else if (train > 1)
					System.out.println("You are trained in Athletics!");
				else
					System.out.println("You are trained in Acrobatics!");
				
				counter1++;
			}
			break;
		case 21:
			System.out.println("You chose to be a Psion!");
			System.out.println("");

			will = will + 2;
			
			hp = 12 + con;
			surgeV = hp/4;
			surgePD = 6 + Cmod;
			HPperlvl = 4;
			System.out.println("Please select 4 skills to be trained in:");
			System.out.println("");

			System.out.println("1. Arcana");
			System.out.println("2. Bluff");
			System.out.println("3. Diplomacy");
			System.out.println("4. Dungeoneering");
			System.out.println("5. History");
			System.out.println("6. Insight");
			System.out.println("7. Intimidate");
			System.out.println("8. Perception");
			while (counter1 < 4) {
				train = badger.nextInt();
	
				if (train > 7)
					Perception = Perception + 5;
				else if (train > 6)
					Intimidate = Intimidate + 5;
				else if (train > 5)
					Insight = Insight + 5;
				else if (train > 4)
					History = History + 5;
				else if (train > 3)
					Dungeoneering = Dungeoneering + 5;
				else if (train > 2)
					Diplomacy = Diplomacy + 5;
				else if (train > 1)
					Bluff = Bluff + 5;
				else
					Arcana = Arcana + 5;
				
				if (train > 7)
					System.out.println("You are trained in Perception!");
				else if (train > 6)
					System.out.println("You are trained in Intimidate!");
				else if (train > 5)
					System.out.println("You are trained in Insight!");
				else if (train > 4)
					System.out.println("You are trained in History!");
				else if (train > 3)
					System.out.println("You are trained in Dungeoneering!");
				else if (train > 2)
					System.out.println("You are trained in Diplomacy!");
				else if (train > 1)
					System.out.println("You are trained in Bluff!");
				else
					System.out.println("You are trained in Arcana!");
				
				counter1++;
			}
			break;
		case 22:
			System.out.println("You chose to be a Runepriest!");
			System.out.println("");

			will = will + 2;
			
			hp = 12 + con;
			surgeV = hp/4;
			surgePD = 7 + Cmod;
			HPperlvl = 5;
			Religion = Religion + 5;
			System.out.println("You are already trained in Religion!");
			System.out.println("Please select 3 more skills to be trained in:");
			System.out.println("");

			System.out.println("1. Arcana");
			System.out.println("2. Athletics");
			System.out.println("3. Endurance");
			System.out.println("4. Heal");
			System.out.println("5. History");
			System.out.println("6. Insight");
			System.out.println("7. Thievery");
			while (counter1 < 3) {
				train = badger.nextInt();
	
				if (train > 6)
					Thievery = Thievery + 5;
				else if (train > 5)
					Insight = Insight + 5;
				else if (train > 4)
					History = History + 5;
				else if (train > 3)
					Heal = Heal + 5;
				else if (train > 2)
					Endurance = Endurance + 5;
				else if (train > 1)
					Athletics = Athletics + 5;
				else
					Arcana = Arcana + 5;
				
				if (train > 6)
					System.out.println("You are trained in Thievery!");
				else if (train > 5)
					System.out.println("You are trained in Insight!");
				else if (train > 4)
					System.out.println("You are trained in History!");
				else if (train > 3)
					System.out.println("You are trained in Heal!");
				else if (train > 2)
					System.out.println("You are trained in Endurance!");
				else if (train > 1)
					System.out.println("You are trained in Athletics!");
				else
					System.out.println("You are trained in Arcana!");
				
				counter1++;
			}
			break;
		case 23:
			System.out.println("You chose to be a Seeker!");
			System.out.println("");

			ref = ref + 1;
			will = will + 1;
			
			hp = 12 + con;
			surgeV = hp/4;
			surgePD = 7 + Cmod;
			HPperlvl = 5;
			System.out.println("You are already trained in Nature!");
			System.out.println("Please select 3 more skills to be trained in:");
			System.out.println("");

			System.out.println("1. Acrobatics");
			System.out.println("2. Athletics");
			System.out.println("3. Endurance");
			System.out.println("4. Heal");
			System.out.println("5. Insight");
			System.out.println("6. Intimidate");
			System.out.println("7. Perception");
			System.out.println("8. Stealth");
			while (counter1 < 3) {
				train = badger.nextInt();
	
				if (train > 7)
					Stealth = Stealth + 5;
				else if (train > 6)
					Perception = Perception + 5;
				else if (train > 5)
					Intimidate = Intimidate + 5;
				else if (train > 4)
					Insight = Insight + 5;
				else if (train > 3)
					Heal = Heal + 5;
				else if (train > 2)
					Endurance = Endurance + 5;
				else if (train > 1)
					Athletics = Athletics + 5;
				else
					Acrobatics = Acrobatics + 5;
				
				if (train > 7)
					System.out.println("You are trained in Stealth!");
				else if (train > 6)
					System.out.println("You are trained in Perception!");
				else if (train > 5)
					System.out.println("You are trained in Intimidate!");
				else if (train > 4)
					System.out.println("You are trained in Insight!");
				else if (train > 3)
					System.out.println("You are trained in Heal!");
				else if (train > 2)
					System.out.println("You are trained in Endurance!");
				else if (train > 1)
					System.out.println("You are trained in Athletics!");
				else
					System.out.println("You are trained in Acrobatics!");
				
				counter1++;
			}
			break;
		}
		
		int speed, initiative;
		speed = 0;
		initiative = 0;
		
		initiative = Dmod;
		switch (race) { //race determining speed
		case 1:
			speed = speed + 6;
			break;
		case 2:
			speed = speed + 5;
			break;
		case 3:
			speed = speed + 6;
			break;
		case 4:
			speed = speed + 7;
			break;
		case 5:
			speed = speed + 6;
			break;
		case 6:
			speed = speed + 6;
			break;
		case 7:
			speed = speed + 6;
			break;
		case 8:
			speed = speed + 6;
			break;
		case 9:
			speed = speed + 6;
			break;
		case 10:
			speed = speed + 5;
			break;
		case 11:
			speed = speed + 6;
			break;
		case 12:
			speed = speed + 6;
			break;
		case 13:
			speed = speed + 6;
			break;
		case 14:
			speed = speed + 6;
			break;
		case 15:
			speed = speed + 6;
			break;
		case 16:
			speed = speed + 6;
			break;
		case 17:
			speed = speed + 6;
			break;
		case 18:
			speed = speed + 6;
			break;
		case 19:
			speed = speed + 6;
			break;
		case 20:
			speed = speed + 6;
			break;
		}
		switch (race) {//random boosts that need to be calculated last because of race
		case 1:
			surgeV = surgeV + Cmod;
			break;
		case 2:
			System.out.println("If you're using chainmail, scale, or plate armor +1 to your speed (being a dwarf negates armor speed reduction)");
			break;
		case 3:
			System.out.println("Eladrin get a +5 to any skill that they haven't been trained in yet!");
			will = will + 1;
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			will = will + 1;
			fort = fort + 1;
			ref = ref + 1;
			System.out.println("Humans get a +5 to any trainable skill (depending on class) that they haven't be trained in yet!");
			break;
		case 8:
			break;
		case 9:
			break;
		case 10:
			break;
		case 11:
			will = will + 1;
			break;
		case 12:
			break;
		case 13:
			break;
		case 14:
			will = will + 1;
			break;
		case 15:
			break;
		case 16:
			will = will + 1;
			break;
		case 17:
			initiative = initiative + 2;
			break;
		case 18:
			surgePD = surgePD + 1;
		case 19:
			break;
		case 20:
			System.out.println("Choose a racial bonus to defense:");
			Scanner kek = new Scanner(System.in);
			wilden = kek.nextInt();
			System.out.println("1. Will");
			System.out.println("2. Fortitude");
			System.out.println("3. Reflex");
			if (wilden > 2) 
				ref = ref + 1;
			else if (wilden > 1)
				fort = fort + 1;
			else
				will = will + 1;
			
			break;
		}
		
		switch (armor) { //armor determing speed
		case 1:
			//speed isn't affected by this armor type
			break;
		case 2:
			//speed isn't affected by this armor type
			break;
		case 3:
			//speed isn't affected by this armor type
			break;
		case 4:
			speed = speed - 1;
			break;
		case 5:
			speed = speed - 1;
			break;
		case 6:
			speed = speed - 1;
			break;
		}
		int HPbloodied;
		HPbloodied = hp/2;
		
		System.out.println("");//spacing
		System.out.println("Current stats:");
		System.out.println("");//spacing
		System.out.println("Strength: " + strength);
		System.out.println("Constitution: " + con);
		System.out.println("Dexterity: " + dex);
		System.out.println("Intelligence: " + intel);
		System.out.println("Wisdom: " + wis);
		System.out.println("Charisma: " + chars);
		System.out.println("");//spacing
		System.out.println("Strength modifier: " + Smod);
		System.out.println("Constitution modifier: " + Cmod);
		System.out.println("Dexterity modifier: " + Dmod);
		System.out.println("Intelligence modifier: " + Imod);
		System.out.println("Wisdom modifier: " + Wmod);
		System.out.println("Charisma modifier: " + Chmod);
		System.out.println("");//spacing
		System.out.println("skills:");
		System.out.println("Acrobatics: " + Acrobatics);
		System.out.println("Arcana: " + Arcana);
		System.out.println("Athletics: " + Athletics);
		System.out.println("Bluff: " + Bluff);
		System.out.println("Diplomacy: " + Diplomacy);
		System.out.println("Dungeoneering: " + Dungeoneering);
		System.out.println("Endurance: " + Endurance);
		System.out.println("Heal: " + Heal);
		System.out.println("History: " + History);
		System.out.println("Insight: " + Insight);
		System.out.println("Intimidate: " + Intimidate);
		System.out.println("Nature: " + Nature);
		System.out.println("Perception: " + Perception);
		System.out.println("Religion: " + Religion);
		System.out.println("Stealth: " + Stealth);
		System.out.println("Streetwise: " + Streetwise);
		System.out.println("Thievery: " + Thievery);
		System.out.println("");//spacing
		System.out.println("Your Armor Check (AC) is: " + AC);
		System.out.println("Your Fortitude (FORT) is: " + fort);
		System.out.println("Your Reflex (REF) is: " + ref);
		System.out.println("Your Will (WILL) is: " + will);
		System.out.println("");//spacing
		System.out.println("Passive Percecption: " + APerception);
		System.out.println("Passive Insight: " + AInsight);
		System.out.println("");
		System.out.println("Speed: " + speed);
		System.out.println("Initiative: " + initiative);
		System.out.println("");//spacing
		System.out.println("Your maximum HP is: " + hp);
		System.out.println("You become bloodied at: " + HPbloodied + " health");
		System.out.println("You gain: " + HPperlvl + " maximum health per level up");
		
		if (race < 2) //dragonborn gets a bonus to surge value
			System.out.println("Your Surge Value is: " + surgeV);
		else
		System.out.println("Your Surge Value is: " + surgeV + " (quarter of your maximum HP)");
		
		System.out.println("You have: " + surgePD + " surges per day");
		
	}
}
