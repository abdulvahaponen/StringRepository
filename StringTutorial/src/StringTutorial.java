import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class StringTutorial {
	public static void main(String[] args) {
char[] chars= {'M','e','r','h','a','b','a'};
String stringDeger33=new String(chars);
System.out.println(stringDeger33);
String stringDeger="Merhaba mobilhanem.com";
char charDeger=stringDeger.charAt(9);
String subStringDeger=stringDeger.substring(8);
System.out.println(subStringDeger);
String subbStinrgeger2=stringDeger.substring(8,18);
System.out.println(subbStinrgeger2);
String stringDeger3="merhaba mobilhanem.com";
System.out.println(stringDeger3.toUpperCase());
System.out.println(stringDeger3.toLowerCase());
System.out.println(stringDeger.replace("r","s"));
System.out.println(stringDeger.replace("merhaba", "hello"));
boolean durum=stringDeger.equals("Merhaba mobilhanem.com");
System.out.println(durum);
boolean durum2=stringDeger.equals("merhaba mobilhanem.com");
boolean durum3=stringDeger.equalsIgnoreCase("merhaba mobilhanem.com");
System.out.println(durum3);
String[] stringDegerler=stringDeger.split(" ");
System.out.println(stringDegerler[0]);
System.out.println(stringDegerler[1]);
String aString="merhaba";
String bString="mobilhanem.com";
System.out.println(aString+bString);
String cString=aString+bString;
System.out.println(charDeger);
//veya
System.out.println("merhaba"+"mobilhanem.com");
	
	}
}
