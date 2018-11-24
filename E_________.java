import java.util.Arrays;
/*35:{1=["Aqua Teen Hunger Force: Vol. 1"], 2=["Immortal Beloved"], 3=["Full Frame: Documentary Shorts", "Rudolph The Red-nosed Reindeer", "Jade"], 4=["Paula Abdul's Get Up & Dance", "Clifford: Clifford Saves The Day! Clifford's Fluffiest Friend Cleo", "Never Die Alone"], 5=["Love Reinvented"]}
19:{2=["Nature: Antarctica"], 3=["8 Man", "Boycott", "Searching For Paradise", "Devo: The Complete Truth About De-evolution", "Jonah: A Veggietales Movie: Bonus Material", "Dragonheart"], 5=["The Libertine"]}
20:{2=["Isle Of Man Tt 2004 Review", "What The Hell Do We Know!?"], 3=["Screamers", "My Bloody Valentine"], 4=["Seeta Aur Geeta", "Something's Gotta Give", "Silent Service", "The Weather Underground"], 5=["Zatoichi's Conspiracy"]}
36:{2=["Horror Vision", "Richard Iii"], 3=["Lilo And Stitch", "Ferngully 2: The Magical Rescue"], 4=["Sick"], 5=["Lord Of The Rings: The Return Of The King: Extended Edition: Bonus Material", "Justice League"]}
21:{1=["Carandiru"], 2=["Ashtanga Yoga: Beginner's Practice With Nicki Doane"], 3=["By Dawn's Early Light", "Pitcher And The Pin-up"], 4=["My Favorite Brunette", "The Bad And The Beautiful"], 5=["The Rise And Fall Of Ecw", "Sesame Street: Elmo's World: The Street We Live On"]}
40:{1=["Class Of Nuke 'Em High 2"], 2=["Spitfire Grill"], 4=["Strange Relations"], 5=["Classic Albums: Meat Loaf: Bat Out Of Hell", "The Bonesetter"]}
25:{1=["Character"], 2=["Inspector Morse 31: Death Is Now My Neighbour"], 4=["7 Seconds"], 5=["Daydream Obsession"]}
13:{1=["The Love Letter"], 2=["Fighter", "Abc Primetime: Mel Gibson's The Passion Of The Christ"], 3=["We're Not Married"], 5=["Chump Change"]}
15:{2=["Neil Diamond: Greatest Hits Live", "A Yank In The Raf"], 3=["Dinosaur Planet", "Lady Chatterley"], 4=["Sex And The Beauties"]}
*/
public class E_________ {
	public static void main(String[] args) {
		int[] a= {35,
				19,
				20,
				36,
				21,
				40,
				25,
				13,
				15
};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		int min1=a[a.length-1]+1,min2=a[a.length-1]+1,start=0;
		System.out.println(min1);
		int age=18;
		if(age<a[a.length-1]&&age>a[0]) {
			for(int i=0;i<a.length-1;i++) {
				if(age>a[i]&&age<a[i+1]) {
					if(Math.abs(age-a[i])<Math.abs(age-a[i+1])) {
						System.out.println(a[i]);
					}
					else {
						System.out.println(a[i+1]+"SAS");
					}
				}
					
			}
		}
		System.out.println("start:"+start+""+a[start]);
		
	}
}

/*for(int j=0;j<age1.length;j++) {
int rating = 5;
if(age1[j]!=0&&number>0) {
	
	while (number > 0 && rating > 0) {
		if (hout.get(age1[j]).get(rating) != null) {
			//System.out.println(rating + ":" + hout.get(age1[j]).get(rating));// task 4
			list.addAll(hout.get(age1[j]).get(rating));
			number -= hout.get(age1[j]).get(rating).size();//for list of size 1
		}
	rating--;
	}
}
}*/