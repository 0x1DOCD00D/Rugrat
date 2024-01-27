package com.accenture.lab.carfast.test;


import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.io.BufferedReader;


public class NischitTest6 implements NischitTestInterface0, Runnable  {
private BufferedWriter bufferedWriter = null;
private BufferedReader bufferedReader = null;
private static int lineCount = 0;

private File getNextFile(String logfile, String defaultFile) {
	File file = null;
	try{
		bufferedReader = new BufferedReader(new FileReader(logfile));
		String line = null;
		int breakPoint = 0;
		while((line = bufferedReader.readLine()) != null && breakPoint <= lineCount ) {
			breakPoint++;
		}
		lineCount++;
		file = new File(line);
		if(file.exists()) {
			return file;
		}
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	return new File(defaultFile);
}
String[] f0= new String[7];


public long NischitTestInterface0Method0(int var0, long var1){
 for(int i = 0; i < 25; i++){
 if( ((var1*(long)(1125))<(var1-(long)(1922)))){
if( ((((var1%(long)(2317))>(var1+(long)(1097)))||((var1+(long)(569))<=(var1+(long)(524))))&&((var1-(long)(425))==(var1*(long)(3423))))){
System.out.println("NischitTest6 - NischitTestInterface0Method0- LineInMethod: 6");
}
}
}
try {
bufferedReader= new BufferedReader(new FileReader(getNextFile("E:\\Projects\\RUGRATLOAD\\log.txt","E:\\Projects\\RUGRATLOAD\\config.xml")));
String line = null;
while((line = bufferedReader.readLine()) != null){
System.out.println("Read line = " + line );
}
}
catch(Exception e){
e.printStackTrace();
}
if(((var1+(long)(1525))<(var1*(long)(3260)))){
System.out.println("NischitTest6 - NischitTestInterface0Method0- LineInMethod: 15");
}
else{
 f0[0] = (String)(("gcjhatfpvsoqwkzzopighpibhgrcgggaevbxvboed"+"akywxucqmtkwjwikmnz")+("zkcchlvhobearuwlslbtoxsmcfwmbsqfksxaoiobyjrltrsqfdndopbitvkmhxmziarqakypgdf"+"uwdknjstrmzrfsmpobzqymjtmdlidc"));
}
try {
bufferedReader= new BufferedReader(new FileReader(getNextFile("E:\\Projects\\RUGRATLOAD\\log.txt","E:\\Projects\\RUGRATLOAD\\config.xml")));
String line = null;
while((line = bufferedReader.readLine()) != null){
System.out.println("Read line = " + line );
}
}
catch(Exception e){
e.printStackTrace();
}
switch((var0-(int)(2884))){
case 0:
var0 = (int)((var0+(int)(1480))%(int)(19));
 break;
case 1:
f0[3] = (String)(("vbcfgievptndquoqqgdibarvsvxlekajhfeoleikgaz"+"fwmhejdizkfdzlseqlrweapmqupyvfmagzgsvhyeikkojtuitbvqddispeki")+("tqsqargmewlfmzkdxxdxpihoekamgcqrnaxlmffjdhubvvmbbkwuuqoxkecsejkxskfzlnzboxzcczuakphzgozsmbra"+"dfssph"));
 break;
case 2:
f0[2] = (String)((f0[4]+f0[1])+("vzppipnbxcvxzzfpurfouesmqlreeilbuibsmmoulymmmboimqkezubfssviqogfsrhfvzqsyqhsnquqfvwrdssgzanyydpgeorl"+"wrwxxubplpazuzddkbfnoaepmzthblbzrsrsatmgbpjfknrtmgrkntqfrznh"));
 break;
case 3:
var0 = (int)(1122);
 break;
case 4:
f0[3] = (String)(("mxswstkzdpkbwneyyqdodbcgk"+"qrhxusbwqjhenf")+(f0[4]+"pitqfdquqpmvllclvnnwtnyzwhyhwicrmtncszjbqjbhaixyxqpqkkioymnkfjehnv"));
 break;
default :
var0 = (int)(2365);
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\tmp\\apps\\Cygwin\\1.5.24-2\\http%3a%2f%2fwww.gtlib.gatech.edu%2fpub%2fcygwin%2f\\release\\__UIC__RUGRAT__Bwemk.txt"));
bufferedWriter.write("Writing line 1 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 2 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 3 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 4 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 5 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 6 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 7 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 8 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 9 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 10 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 11 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 12 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 13 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 14 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 15 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 16 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 17 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 18 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 19 to file");
bufferedWriter.newLine();
} catch (FileNotFoundException ex) {
ex.printStackTrace();
} catch (IOException ex) {
ex.printStackTrace();
} finally {
try {
if (bufferedWriter != null) {
bufferedWriter.flush();
bufferedWriter.close();
String logfile = "E:\\Projects\\RUGRATLOAD\\log.txt";
bufferedWriter = new BufferedWriter( new java.io.FileWriter( logfile, true ) );
bufferedWriter.append("C:\\tmp\\apps\\Cygwin\\1.5.24-2\\http%3a%2f%2fwww.gtlib.gatech.edu%2fpub%2fcygwin%2f\\release\\__UIC__RUGRAT__Bwemk.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Documents and Settings\\Administrator\\__UIC__RUGRAT__KYTMJ.txt"));
bufferedWriter.write("Writing line 1 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 2 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 3 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 4 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 5 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 6 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 7 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 8 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 9 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 10 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 11 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 12 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 13 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 14 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 15 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 16 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 17 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 18 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 19 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 20 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 21 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 22 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 23 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 24 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 25 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 26 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 27 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 28 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 29 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 30 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 31 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 32 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 33 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 34 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 35 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 36 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 37 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 38 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 39 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 40 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 41 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 42 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 43 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 44 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 45 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 46 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 47 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 48 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 49 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 50 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 51 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 52 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 53 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 54 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 55 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 56 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 57 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 58 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 59 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 60 to file");
bufferedWriter.newLine();
} catch (FileNotFoundException ex) {
ex.printStackTrace();
} catch (IOException ex) {
ex.printStackTrace();
} finally {
try {
if (bufferedWriter != null) {
bufferedWriter.flush();
bufferedWriter.close();
String logfile = "E:\\Projects\\RUGRATLOAD\\log.txt";
bufferedWriter = new BufferedWriter( new java.io.FileWriter( logfile, true ) );
bufferedWriter.append("C:\\Documents and Settings\\Administrator\\__UIC__RUGRAT__KYTMJ.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (long)var1;

}

public static int NischitTest6method0(String var0, int var1, long var2){
 if( ((var0+"soc")==(var0+"fjtqzjbtvwnksibapbodtsdarfbnxjyofmnngumsqyudgu"))){
if( (((var1-(int)(681))>(var1*(int)(2012)))&&((var1+(int)(1676))<=((var1*(int)(1367))%(int)(3291))))){
if( (((var2+(long)(2297))+(var2/(long)(1682)))!=(var2+(long)(1786)))){
if( ((var0+"sijolxsmlpsgjjznrpimquoushhmirxnxhumzz")!=(var0+"xqgztwdftwow"))){
var0 = NischitTest6method2(var0,var0,var1,var1);
}
}
}
}
switch((var1*(int)(2894))){
case 0:
System.out.println("NischitTest6 - NischitTest6method0- LineInMethod: 11");
 break;
case 1:
var1 = (int)(3447);
 break;
case 2:
var2 = (long)((var2+(long)(2285))/(long)(2336));
 break;
case 3:
System.out.println("NischitTest6 - NischitTest6method0- LineInMethod: 21");
 break;
case 4:
var0 = NischitTest6method3(null,var0);
 break;
case 5:
System.out.println("NischitTest6 - NischitTest6method0- LineInMethod: 29");
 break;
case 6:
System.out.println("NischitTest6 - NischitTest6method0- LineInMethod: 32");
 break;
case 7:
var1 = (int)(1686);
 break;
default :
var1 = (int)((var1/(int)(864))-(var1-(int)(3133)));
}
for(int i = 0; i < 46; i++){
 System.out.println("NischitTest6 - NischitTest6method0- LineInMethod: 41");
}
for(int i = 0; i < 23; i++){
 var2 = (long)(2597);
}
for(int i = 0; i < 23; i++){
 System.out.println("NischitTest6 - NischitTest6method0- LineInMethod: 46");
}
for(int i = 0; i < 39; i++){
 if( ((((var0+"wzxppudmjussrssmrlyszpkutwwbrhgcpjenoualjhbipgdgswxseavlmswtdl")+((var0+"sykpcgqhuuwxuugyuoxtwdvkquxqoknvof")+(var0+"cofiaincyatiuzdwnenazacuajhkicfqiiayxalmojpavarbwetzjdmmpdcmgmbzohfog")))+(((var0+"qckljnguzpnyqt")+(var0+"qsn"))+((var0+"tzincpnhfjzyqnkvbysmvzziytwhkkrxmdkhngbzeczuzkqneemllkxclechgstnngmbmxqfcraponrboia")+(((((var0+"cjkdjouvxitnebxottvvaluntwxlwnobjaonwldaeuojfajbfiwnqiysaagednnojihczzsfygplszijfcobtdzhhrmoqaijl")+(var0+"ztrxkaejooxaezwfikapxsifabmhopisrdavmwldfscalx"))+(var0+"dzohpagpgrhpvwwdkfrjtkqtxmygezdmfjtplqgdsfkvgpulywqjphtxaojcsyxlhwmiagqassaolyxfhl"))+(var0+"xckybiqjppuxmnk"))+(var0+"urfexatqeycuzoikuvextbmtemrweekofssgscqevhplvvibxhx")))))!=(var0+"oyzncdnqgwpommpwiylihjbjrxbxjxshcoyjxgxxensepzbbfahsd"))){
if( ((var2-(long)(1465))>(var2*(long)(1966)))){
if( ((var0+"fdtazxcbidakbbauodbpizccpn")!=(var0+"usdztmaezv"))){
var1 = (int)(452);
}
}
}
}
if( ((var0+"rltivnzxeoyhhdhjtsbfxipoladcapm")!=(var0+"fisfbhanyidthznjqjnypxdaamzqkv"))){
var1 = (int)((var1-(int)(800))*(var1-(int)(2251)));
}
switch((var1*(int)(3388))){
case 0:
System.out.println("NischitTest6 - NischitTest6method0- LineInMethod: 63");
 break;
case 1:
var1 = (int)(2316);
 break;
case 2:
var1 = (int)(((var1+(int)(3369))-(((var1-(int)(693))-((var1*(int)(3311))-(var1*(int)(83))))%(int)(752)))/(int)(1962));
 break;
case 3:
var1 = (int)((var1*(int)(797))*(var1*(int)(1906)));
 break;
default :
var1 = (int)(2869);
}
switch(((var1-(int)(2509))-(var1*(int)(2401)))){
case 0:
NischitTest6method3(null,var0); break;
case 1:
System.out.println("NischitTest6 - NischitTest6method0- LineInMethod: 83");
 break;
default :
var0 = (String)((var0+"uplkknwoexustdpplkigtedbjxzahqcnkhjztgfpvwrsyohdxhkefckusofjejigszuazghaeuujanrrmvblbvs")+(var0+"auumyclhalhvsghurucftxzgixmcnrfkrnpfcqyeqsztyliojkxxgctmgmahabpbvjjpfhivsjhvtuqcljauqexrhuwvihddv"));
}
return (int)var1;

}

public static Object NischitTest6method1(long var0, long var1){
 return (Object)null;

}

public static String NischitTest6method2(String var0, String var1, int var2, int var3){
 for(int i = 0; i < 17; i++){
 if( ((var3%(int)(2463))<(var3+var2))){
System.out.println("NischitTest6 - NischitTest6method2- LineInMethod: 4");
}
}
switch((var2*(int)(3363))){
case 0:
var2 = (int)((var3+var2)*(var2%(int)(33)));
 break;
case 1:
System.out.println("NischitTest6 - NischitTest6method2- LineInMethod: 12");
 break;
case 2:
var3 = (int)((var2/(int)(2805))-(var2-(int)(1627)));
 break;
case 3:
var0 = NischitTest6method3(null,var1);
 break;
default :
var2 = (int)(1286);
}
return (String)var0;

}

public static String NischitTest6method3(NischitTest1 var0, String var1){
 if((((var1+"axvtxhhhjjpkkkdbd")+((var1+"ldqdqnwwcjlkigoqgodzstdsdgzvazlgnxjhsedsafjrmsdszyvmlnogebnolrcecsfhz")+(var1+"prsnkoozelcmyudexjmoadzjhvrmdbxbfspudbkzvcwznfkfrpksvnnltzjgsoshjmvawx")))==(var1+"dcsgalchvuardaofyesncokptvpyaiojglkfrpxh"))){
var1 = (String)((var1+"hcagcevoicaatddtjmaqwoyvufvpsysleuecudryohtcjqmqrjsmlamqoajbbzffcyomdkfrpwmw")+(var1+"jrbvmvtjuczayikgofdmpveemprnagwefjvhyalxnejvbsjaokbvlivrvbkrusvhalvkrwshpllioqwycgzupqumjyyd"));
}
else{
 var1 = "jhnneaoxrtyjmjtvbwrcowjwfdpejyxyrrwguufsktjptgbdemrvnxvghquciatjb";
}
for(int i = 0; i < 13; i++){
 System.out.println("NischitTest6 - NischitTest6method3- LineInMethod: 84");
}
if( ((var1+"djbnyslsusokawnqtajewrgjoqjtmfkjzb")==(var1+"jgvgvosvsvawxhzkffwdjavalandbueagavefockzwjdxlcwgmlabztbas"))){
if( (((var1+"wfinzdhapsctjstljhyoromusfprkwrlv")!=(var1+"lfjmxyjdofexnxyr"))&&(((var1+"yqowzqzmlpesaktwxaowfjqgtjzcyxlqtcuzlxxyqzkdpbppioothfacrwlmcrlyqkjlqxxmsotwskexbmucyhjutmuqdwqeg")+(var1+"pochbc"))!=(var1+"rbylmfcsntcvdgilpolkffuqkjzpratqyaxcwyahxempxysunhsubf")))){
if( (((var1+"dbsqvhrskctmkruwovwqaijgqtmdugwkxdcvunwgjecxwaczxpn")+(var1+"rkqejlojh"))!=(var1+"szwgncksckpnczbjkvwqbxgrrleyhkzkbkzvhkgugzqkszvqzjhpzn"))){
if( ((var1+"gvrwthcfarsmktuyfblvxkwmrzrhhdovibvkylurrcbesimuzzleyvzujusenvw")!=(var1+"rglpkwzloxdzrewnvjcidrddyftieetnslplrbxloohvyrkkdcsycetcsrdpomhyac"))){
if( ((var1+"vjvwmwsraxwtiuyfcyvbexerrrxhpnnjgcrjusflliinabbclyfmemoejfzmhajrx")!=(var1+"pacjrksfaqyokhlcbmdvjkrtnbwjvpvhxfjpbnyynojdiwvbeodadewgbok"))){
if( ((var1+"hfcjmcgxnphlmcrhoqnnhy")!=(var1+"bsxwxbiehcystenqzuefccgjrctovnqaiggvlcuvuqztnhqgsohnmreihdvels"))){
var1 = (String)(var1+"jaoxnxzozimogcbgx");
}
}
}
}
}
}
if( ((var1+"pwprewq")==(var1+"rgycezsgcogrnjhvhqzmxwd"))){
var1 = "vvfhuzluqytkjmlytrsukqlbsfehmagxi";
}
for(int i = 0; i < 16; i++){
 if( ((var1+"ucnycwrlfemglhvlspkwgrukcpavozmhunnbiehtcnnibmclus")!=(var1+"uxstcyudlsmkpkralwwwdddhghhkqtanxxlgmewaenivaezjtlanvociorhbrgcnerzkyzxytschetrcm"))){
System.out.println("NischitTest6 - NischitTest6method3- LineInMethod: 107");
}
}
for(int i = 0; i < 7; i++){
 System.out.println("NischitTest6 - NischitTest6method3- LineInMethod: 111");
}
return (String)var1;

}

public Object NischitTest6method4(String var0, NischitTest0 var1, NischitTest0 var2, NischitTest1 var3){
 if(((var0+"cbghlhyxeeupgifjtxnrcakzlwrctwobmieaesfbbiwskrihdarksnflfepluhgdxxkbdgpzsdubgccfsbawiwaiqywgbfzgqbgfa")!=(var0+"ljewzlnopshaebrvvsaypukkowkdwtncsnhhhgndcsxbbbhslizxzqcgelyqibeudooykpvljfrcyegpxbstnbern"))){
var0 = "rvtkqbipoixgmymzfivetldrkxsoocmlwitapvjykwflfqhmrdaqupjlmyqptoicwpwbfiqizgsoviykond";
}
else{
 var1 = new NischitTest0();
}
if( ((var0+"avnccevaqhgvivvvzmilpilvcrajaafeizmbeaksenrhzxdha")==(var0+"qymgkgehdgavpesyipwyckbqiwyglseetgemztsbbjfchlxyhjplygjjmofkcbltqsrbjauubvcrxnqwmsuydkbdriakzkthzdc"))){
if( ((f0[1]+f0[6])==((f0[5]+f0[5])+(f0[6]+f0[3])))){
var1 = new NischitTest0();
}
}
try {
URL url = new URL("http://en.wikipedia.org/wiki/India");
bufferedReader=new BufferedReader(new InputStreamReader(url.openStream()));
String line = null;
while((line = bufferedReader.readLine()) != null){
System.out.println("Read line = " + line );
}
}
catch(Exception e){
e.printStackTrace();
}
if( ((var0+"ozczmjlxxqirnlhfuhtgsmtujgtrbbkcdkqqvfvztxqvmcpjppydcwbabvljafxxqbyqeprsguqqjrjtzzqwq")==((var0+"nobzgwwwkeiypjjynjwdypxfiahmtozzucnkgnsmbfqbqscmkqahgupenyeersyaxlbqrfxln")+(var0+"qephmkuvyniflztybnpazxqihhgmgvwslukudkaquaakmzszwgcxooibyjkdcjqruec")))){
if( ((var0+"qexkrsadzmfaroivjppsqofbgo")!=(var0+"xovpxhjhqqkoenxnlosqoqzsimfgfgziscpkydjgdqnseybttmknaxokidztnrtkzvdlgwkqpxksoygldjtsrshxgzd"))){
System.out.println("NischitTest6 - NischitTest6method4- LineInMethod: 14");
}
}
if( ((var0+"epzccdffpmfdtaukujmemqtrjzicobb")==(var0+"tqvbhrvsewpgfzkksqsnkttwdfowcdlmtjazfrfozmamiwjztwqweaxivqjpuyacjyrcfcnycubjfabzrpa"))){
System.out.println("NischitTest6 - NischitTest6method4- LineInMethod: 18");
}
try {
URL url = new URL("http://en.wikipedia.org/wiki/India");
bufferedReader=new BufferedReader(new InputStreamReader(url.openStream()));
String line = null;
while((line = bufferedReader.readLine()) != null){
System.out.println("Read line = " + line );
}
}
catch(Exception e){
e.printStackTrace();
}
try {
URL url = new URL("http://en.wikipedia.org/wiki/India");
bufferedReader=new BufferedReader(new InputStreamReader(url.openStream()));
String line = null;
while((line = bufferedReader.readLine()) != null){
System.out.println("Read line = " + line );
}
}
catch(Exception e){
e.printStackTrace();
}
if( (((((((f0[6]+f0[0])+(f0[1]+"yimxgzosthheuljjhswabxcbvyfwcupavprb"))+((f0[2]+f0[3])+(f0[3]+f0[1])))+(f0[5]+f0[1]))==(var0+"ojrxxjwzxyaibontfyoizlkrmowsobfzdirhigatgxtuhqttyblcfrjvlgexxmwpvbpwhcpbesvujvsh"))&&((f0[2]+f0[2])==(var0+"exbijfhzoccaybmtmvtrsvialdgkioziwlfxuuxxgpklcairtrmddklxloabjqynwpryylptaoqjljkphsnxbfmtxmmf")))&&((var0+"ekfvbzeynjmehozftjsckbbdbuoker")!=(var0+"luclzjfanewkwsxtsiunaumdxenejfgxgpwswxlroubyhnzbrequoiljqao")))){
if( (((f0[6]+"slmnnswgxtblqidkrlaodpioucldhzrsdrlydcsifrrprexwivaxaqcfkszuhzsdxbhocoofsfvrmljzdevobqhbdcveekqol")==(var0+"htlkyfnozgiwsizjgikouxkpczuohwtqdxbpiuqvxlxczlzlxuaustpgeahinjkypmnu"))&&((var0+"hkasjrympkyophhwxpxcqwwsokavkpmeltgsbpwrrepxupisqzwisgify")==(var0+"bibsttbbkdxnkmhxhqrtvoqdxyrbryibioxercjixcwkkuzope")))){
if( ((var0+"wvgigdxenjxmmajgmjynzmcbclxcregiwvjbkqaqojxebefjtfvymvzzcxmpudv")==(var0+"hparwzchypq"))){
if( (((var0+"bbvvmxyfdhtoovdeeadtiifpzglxvfchhwqqsrircuxzkbqdrsqgpqqr")+(var0+"diwywsfoqxxvu"))==(var0+"wzszxoesaczdpmicvnldmicyruozy"))){
var2 = new NischitTest0();
}
}
}
}
for(int i = 0; i < 6; i++){
 if( (((var0+"mwvm")+(var0+"grbjofzvvljcbggisaahnfusskocrcnxcobrddpidwqzagkbssbnozsxalj"))==(var0+"nfaloujywpgdllfmykfkxgallhizwfjpfnniiyvuurdpohczwwkndru"))){
System.out.println("NischitTest6 - NischitTest6method4- LineInMethod: 33");
}
}
if( ((var0+"brmdahdzxdhyfvnbgiomicijjqbuvpshzjbyicltjvkijewbeoupphpgpkbcqwherfydjvp")!=(var0+"idbjzguykzceiccviwwdpmvhdxnbmlbtcllghchkefdtwbhkrvcjgkevsugsdtytvyepaexrcubwkkvqxnt"))){
System.out.println("NischitTest6 - NischitTest6method4- LineInMethod: 38");
}
if(((var0+"uyqiukdjemhdodtmiecpzvgntppmvnktshjpzcwykcvkovjcvwxdnsxgfravubyccwbuqwmrq")!=(var0+"opevdhqpaqircivseekeabguzkwsgcvefgonwtvx"))){
f0[3] = (String)(((((((var0+"uftyqlmjltgkthtwgudxwafxorkonpvxydqwcwhbszgpeiwszuruzylkdyipk")+(var0+"tguwhpppzsjhzmdhuxgetolosofigup"))+(((var0+"orhawfqyttzwoxqlhfqqrcpwrbbrufxbafsuxsjmvubqsqyzyejo")+(var0+"mecpujuttvgsflkoigcqojdojmxgkfubtheiuuqxxffkihliizxiymwzxgihhspmenivsnmrjysmqgdrnkjpopfkyyboyfsdfryo"))+(var0+"kysgjzxgov")))+(var0+"yherexyksuyyp"))+(var0+"pwxrxqlvpknynakymecifdmjzewrdilafhdrizfgqgsjqxmjzbdsehzofm"))+((var0+"fvegfpjgaobnmrunfahhwttafbawqdiihvecucvbzthdlxuxuegecqpjwlhscohkroteparuqbx")+(var0+"svznjnngrbzhkddxnlzzvtenfvushzrfvzsabazlmprrsgpeefnpchsusjjdqjwfmlkihjwinsxoewbmeuarcanlymlx")))+(var0+"yqwubmsqwvexxbywzolrjlrchpfmgvodt"));
}
else{
 f0[0] = (String)(((var0+"pqeeyygxwfskbizqlxaisgzjexejgutogqvjodhpddxtuzudmtegtoqfrbwffznwiujxmxsrtohvbrxlpqayoqjxqdnxulbdhmhpz")+((var0+"zozvnzzroaqmqzjchmvcnupzxcvmexpuewggyneiuqqrcxeqsmpqsxqpwvayqwznintuupmtirwigyomercbhbjkypnsnuzplxgo")+(var0+"jseakbiphjukeeirmtoxfmwiboylgqqzx")))+(f0[4]+f0[2]));
}
try {
bufferedReader= new BufferedReader(new FileReader(getNextFile("E:\\Projects\\RUGRATLOAD\\log.txt","E:\\Projects\\RUGRATLOAD\\config.xml")));
String line = null;
while((line = bufferedReader.readLine()) != null){
System.out.println("Read line = " + line );
}
}
catch(Exception e){
e.printStackTrace();
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\WINDOWS\\hsperfdata_Qing_Xie\\__UIC__RUGRAT__kkyjB.txt"));
bufferedWriter.write("Writing line 1 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 2 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 3 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 4 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 5 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 6 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 7 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 8 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 9 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 10 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 11 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 12 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 13 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 14 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 15 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 16 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 17 to file");
bufferedWriter.newLine();
} catch (FileNotFoundException ex) {
ex.printStackTrace();
} catch (IOException ex) {
ex.printStackTrace();
} finally {
try {
if (bufferedWriter != null) {
bufferedWriter.flush();
bufferedWriter.close();
String logfile = "E:\\Projects\\RUGRATLOAD\\log.txt";
bufferedWriter = new BufferedWriter( new java.io.FileWriter( logfile, true ) );
bufferedWriter.append("C:\\WINDOWS\\hsperfdata_Qing_Xie\\__UIC__RUGRAT__kkyjB.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
try {
URL url = new URL("http://en.wikipedia.org/wiki/India");
bufferedReader=new BufferedReader(new InputStreamReader(url.openStream()));
String line = null;
while((line = bufferedReader.readLine()) != null){
System.out.println("Read line = " + line );
}
}
catch(Exception e){
e.printStackTrace();
}
if( ((var0+"zsgycqoxozvtgfogdvziu")!=(var0+"yiaoilhvhbfkinldcnojojqgbwhzxbysmniwtvtcoqseonwakvzvizgftlrpxf"))){
System.out.println("NischitTest6 - NischitTest6method4- LineInMethod: 102");
}
if(((var0+"argfavmjisegdvimqvjfqjjnahoaqnfndpqncjfjcmztwupzgrsrigp")==(var0+"ukubyrqhpizkxdglzkhfqddgjffqkaiquwhmwayabgwykbjztycakrtnqpowvkulbhrwrthlwgzgmnimtgb"))){
System.out.println("NischitTest6 - NischitTest6method4- LineInMethod: 108");
}
else{
 System.out.println("NischitTest6 - NischitTest6method4- LineInMethod: 111");
}
return (Object)var2;

}


public static void main(String args[]){
NischitTest6 obj = new NischitTest6();
obj.NischitTestInterface0Method0((int)(20),(long)(260));
NischitTest6method0("tvpatnmyrokhvoawjibecsxfmbflyxoowrezmocvpxpnxpxvgqrtgqilkcykurnrwqarhhyozptrqeybewyfefcnyshjtwy",(int)(1394),(long)(521));
NischitTest6method1((long)(2888),(long)(434));
NischitTest6method2("byryxiiirbypnpgbodjstiknpshluvcfibhbogclcfslye","chlnlsubzpfzsytemzoqsaa",(int)(561),(int)(251));
NischitTest6method3(new NischitTest1(),"xxwwyrfuvcngtrksfqswrtbckkokwdcnvv");
obj.NischitTest6method4("cqhcyfrgtveyi",new NischitTest0(),new NischitTest0(),new NischitTest1());
}

public void run(){
NischitTest6 obj = new NischitTest6();
obj.NischitTestInterface0Method0((int)(20),(long)(260));
NischitTest6method0("tvpatnmyrokhvoawjibecsxfmbflyxoowrezmocvpxpnxpxvgqrtgqilkcykurnrwqarhhyozptrqeybewyfefcnyshjtwy",(int)(1394),(long)(521));
NischitTest6method1((long)(2888),(long)(434));
NischitTest6method2("byryxiiirbypnpgbodjstiknpshluvcfibhbogclcfslye","chlnlsubzpfzsytemzoqsaa",(int)(561),(int)(251));
NischitTest6method3(new NischitTest1(),"xxwwyrfuvcngtrksfqswrtbckkokwdcnvv");
obj.NischitTest6method4("cqhcyfrgtveyi",new NischitTest0(),new NischitTest0(),new NischitTest1());
}

}