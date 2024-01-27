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


public class NischitTest1 {
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
static NischitTest9[] f0= new NischitTest9[12];
String[] f1= new String[21];


public static Object NischitTest1method0(long var0, int var1){
 (new Thread(new NischitTest4())).start();
return (Object)null;

}

public Object NischitTest1method1(long var0, NischitTest13 var1, long var2, long var3){
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
(new Thread(new NischitTest5())).start();
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
if(((var0-var3)>(var2%(long)(2393)))){
System.out.println("NischitTest1 - NischitTest1method1- LineInMethod: 4");
}
else{
 f1[3] = (String)((f1[16]+f1[17])+(f1[6]+f1[14]));
}
if( ((var3-var2)<=(var0/(long)(1381)))){
System.out.println("NischitTest1 - NischitTest1method1- LineInMethod: 11");
}
(new Thread(new NischitTest6())).start();
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Documents and Settings\\All Users\\ZeroC\\__UIC__RUGRAT__rdWIJ.txt"));
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
bufferedWriter.append("C:\\Documents and Settings\\All Users\\ZeroC\\__UIC__RUGRAT__rdWIJ.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
for(int i = 0; i < 32; i++){
 var3 = (long)((var3+(long)(181))*(var2/(long)(2174)));
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Python26\\libs\\__UIC__RUGRAT__aZP87.txt"));
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
bufferedWriter.append("C:\\Python26\\libs\\__UIC__RUGRAT__aZP87.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (Object)var1;

}

public long NischitTest1method2(NischitTest9 var0, int var1, NischitTest1 var2, long var3){
 if( ((var3*(long)(79))>=((var3+(long)(3337))+(var3/(long)(418))))){
f1[1] = (String)("adscilafxeocnizjnxtkiiwmvbdbhdzbzdzkrjzdeyizizygzrfyrtozorewtqdo"+"jtfktdlzcgfeadikepvrilnklflguiyynnaecmmjxllohjithkbxhjkgmcjvdohocuwynabpdfzakwtrjuzfdv");
}
for(int i = 0; i < 26; i++){
 if( ((var1/(int)(2038))<((var1+(int)(1425))/(int)(3269)))){
var2 = new NischitTest1();
}
}
for(int i = 0; i < 11; i++){
 f1[8] = (String)((f1[11]+f1[18])+("qiqoemgvdeoogwwtxqcmhmriwriyqyykqpafvynrwrzjsrmcewdvukpvdqqhmlzwtiiqbbjgkscishagowayylfedvkekh"+"jrasoyfwwugyjgxciipesvpgsuyjomrrqveeucofgjnluamupqxqkumsjuvqruchunbslaomosjctrnim"));
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
if(((var1+(int)(1866))==(var1+(int)(2131)))){
f1[12] = (String)(("lscolyjdcpkxhkgzelofnigknunybgtyr"+"xpooxzvnxuizlavkooojlvict")+("derylezbzmpfayxergouckkktztbitucpdasvhtcsuecerjwiwzlcxbjrsyxibrvkdzirvntthjfwordwwxugsaxdpp"+"vecvfmnwjhtlxpnuouanylngmnnyuwhjrjbbgyljxmgjaowkjzobmeytostuwieigscxpy"));
}
else{
 f1[14] = (String)(("cxepxtsydkptbfbcideeqputqyxbxganxqwq"+"mvaqpevqnalpjzex")+("klagbfsurawvzreaqmfbhevndwpedebnsegalvjqoyehrwadadiwqvbbmuaicrjvhhrutbosalxbfoiasaujyydmjcvsrdyhc"+"icdpdcdjdhansgrzsrtshqqpvhvewmkegyrqjwmwpqyxgcughrflijtrplqhdjokhoiccaylqcgxygfmvkzlekobcidw"));
}
for(int i = 0; i < 24; i++){
 if( (((var3/(long)(13))-(var3/(long)(424)))==(var3*(long)(1374)))){
System.out.println("NischitTest1 - NischitTest1method2- LineInMethod: 21");
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
switch((var1/(int)(276))){
case 0:
var3 = (long)((var3*(long)(3050))-((var3*(long)(2241))*(var3+(long)(2255))));
 break;
case 1:
f1[9] = (String)(("cmczxercfksucyilgjybljdxezdvefvtgpehm"+"btwrohbizjpjacspzsncczwbyzamshailfaqzcvegudkqsvgxogvtvimfzgeemeldwgelrckopfcemggb")+("yzozsbfbmoatbkuz"+"tevlmejyvmqkhrmqsl"));
 break;
case 2:
f1[20] = (String)((("kaulecuiuodgwnwfycqkpbkmhkkuniwtvlouuf"+"skjplnsqnafuhjbylucgjbobp")+(("qzksdthkkdtzzwnekbpzknojvxrnnlqaujyuceexgbfav"+"iwpw")+(("hqrjbtlqypdhtbvwjtdbnbfqayuqahomzkrqrvgoezxgguddphmxnuiufopwtlmdjagoruxszdkthpziefyehqsgcdyzrwerqmkze"+"yeuildopydskpku")+("tgxwmxplofbzrqgiajnnfc"+"znpximieuzjmpkovllaweifvlwtgtorqcskowgyxtmulp"))))+(("dpnzlsxwnambjvxcqtfljjjqznlyovbiknitpxbdaptpvkxijunosiirjaolmnpbocikwcbxk"+"llcdcntskabjcahcarxagfpzklpuryplbnnsfqgqpdsjkiryolipwzjzhblow")+(("dgghvjtkwxutemeetqoikevgvuccefpggiywhhqirknlhkxgcjuw"+"yoziqllxzhkjgzorfhrgtqnqneysijudtutavgd")+("fmnhotilqqmlwykeifemngihxdrjduplkppjzhumhgvcorkrpmyvjdpkefojjksupfvewqdycfxdctxwr"+"fqmtrpmaavryrhdpfqlgzzwubyxypekhzioiprlpxktzfcsahujnccejlqbajabwkszbjdgnjhnwgdlubafqeyvqch"))));
 break;
case 3:
f1[11] = (String)((f1[10]+f1[6])+("kupflmtcmduouukdcvpbavhjeohvqetzgyldjzedyqkdawhxyo"+"vplbkhpicqm"));
 break;
default :
var0 = new NischitTest9();
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
switch((var1*(int)(553))){
case 0:
System.out.println("NischitTest1 - NischitTest1method2- LineInMethod: 43");
 break;
case 1:
System.out.println("NischitTest1 - NischitTest1method2- LineInMethod: 48");
 break;
default :
f1[3] = (String)((("twhsajfjqmdfbhruajyrquzmugcsbrhtgofndcyufatcpuoktqsoambdfjrfwbnyvtxzrlpqlijjqkdwxbwrkphlqhg"+"jlmbxxyyigzjthfijhg")+("gdndayakqzzxakriu"+"xmkpbicccgzfisayscsvjmvbyk"))+("ef"+"nnpm"));
}
switch(((var1-(int)(2858))*((var1/(int)(284))-((var1/(int)(673))-(var1*(int)(1572)))))){
case 0:
var2 = new NischitTest1();
 break;
case 1:
var3 = (long)((var3-(long)(2546))%(long)(1982));
 break;
case 2:
var3 = NischitTest1method4(null,var3);
 break;
case 3:
System.out.println("NischitTest1 - NischitTest1method2- LineInMethod: 66");
 break;
case 4:
f1[4] = (String)((("ethkkwpmldtcelspnyrcmsdwmijhbthgvwz"+"xzjevvixbtlrvpnhtwwbqtvshdnjotthtpxqbqjtjvjhfiek")+("smmzmhhyztuixoibsxcowgwggirlvog"+"nnwhtttnyurra"))+("nmsgstmxiixqmgxcwitglklilwpdvmmlihjtrqcyalrchlwwmwbqugqacfu"+"nsmtlipdrjvqkdwuvyjllbahbxcynvvgqqcngfuzgjfuaqxxgtlzweyqrnlwsglflwuvxpxsrtfg"));
 break;
case 5:
var1 = NischitTest1method3(null,"dltobzmdyibmyrpnljshaaaxrfabhxgjbbnbaprkslaftegaydqgeypiv",var1,var3);
 break;
default :
System.out.println("NischitTest1 - NischitTest1method2- LineInMethod: 76");
}
if( ((var1%(int)(1782))==(var1/(int)(2417)))){
System.out.println("NischitTest1 - NischitTest1method2- LineInMethod: 79");
}
for(int i = 0; i < 4; i++){
 if( ((((var3-(long)(2538))==(var3/(long)(3399)))&&((var3+(long)(2131))!=(var3*(long)(1537))))&&((var3-(long)(3179))>(var3+(long)(471))))){
if( ((((var1+(int)(1516))>((var1+(int)(2502))+((var1-(int)(2126))*(var1*(int)(3349)))))&&(((var1*(int)(2944))+(var1+(int)(257)))!=(var1*(int)(124))))&&((var1%(int)(1291))!=(var1+(int)(1038))))){
if( ((var1-(int)(3226))==(var1+(int)(814)))){
System.out.println("NischitTest1 - NischitTest1method2- LineInMethod: 90");
}
}
}
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Intel\\Logs\\__UIC__RUGRAT__vo1Jn.txt"));
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
bufferedWriter.append("C:\\Intel\\Logs\\__UIC__RUGRAT__vo1Jn.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (long)var3;

}

public static int NischitTest1method3(NischitTest2 var0, String var1, int var2, long var3){
 if(((var2-(int)(1613))>(var2%(int)(2932)))){
var1 = (String)(var1+"gyaeawlofskogssbgciedvvztnbeufqzggpgwkovpfscesdjmbpgrfjgkyynklstdfqbiataucqhomx");
}
else{
 NischitTest1method4(null,var3);}
if(((var2*(int)(570))==(var2-(int)(985)))){
System.out.println("NischitTest1 - NischitTest1method3- LineInMethod: 10");
}
else{
 System.out.println("NischitTest1 - NischitTest1method3- LineInMethod: 11");
}
for(int i = 0; i < 0; i++){
 System.out.println("NischitTest1 - NischitTest1method3- LineInMethod: 14");
}
for(int i = 0; i < 43; i++){
 System.out.println("NischitTest1 - NischitTest1method3- LineInMethod: 17");
}
if( ((var3+(long)(3341))>=(var3-(long)(3306)))){
if( ((var1+"fntdvmfncpaoxvzojuwlbqjlvnonxbijnopcmzpbhqttvqugngn")==(var1+"iwrcomzobgzglhcrlwjadcdcnzgmhxrpdkwtdwcwwftwpnrjbwzdcyyfnikxslfrqi"))){
var0 = new NischitTest2();
}
}
switch((var2+(int)(966))){
case 0:
var1 = (String)((var1+"gtytrdlcoucogqtdppqmzsuigxfxuhmlrocygauhfwurtabuguisgxalrfcflmdupqkyuafjiuixjipptljxkiwcizer")+(var1+"plbcajqqpsblidnzyftbukdmwvklgozdhsmmmytdgrazjvgubtb"));
 break;
case 1:
System.out.println("NischitTest1 - NischitTest1method3- LineInMethod: 30");
 break;
case 2:
NischitTest1method4(null,var3); break;
default :
System.out.println("NischitTest1 - NischitTest1method3- LineInMethod: 36");
}
if( ((var3+(long)(1550))>=(var3*(long)(673)))){
if( (((var3-(long)(120))*(var3*(long)(1657)))<(var3*(long)(1629)))){
System.out.println("NischitTest1 - NischitTest1method3- LineInMethod: 44");
}
}
for(int i = 0; i < 29; i++){
 var1 = (String)((var1+"uiphxefiampdnklltkwkekvzlkigtyadmtgqbnahllawvpfvhzjnrqpvaeeuzsiwnuljr")+(var1+"ldfpycyjcbqbeuxynflqyexrqxscbyztzxmuofzbgxd"));
}
switch((var2-(int)(238))){
case 0:
f0[3] = new NischitTest9();
 break;
case 1:
f0[2] = new NischitTest9();
 break;
default :
f0[6] = new NischitTest9();
}
if((((var2/(int)(2546))+(var2+(int)(3104)))<(var2/(int)(1560)))){
System.out.println("NischitTest1 - NischitTest1method3- LineInMethod: 63");
}
else{
 System.out.println("NischitTest1 - NischitTest1method3- LineInMethod: 64");
}
if(((var1+"txqliledskhwbtsbzcflugmbdzfghoiwdmilakkinqtzrhyceqya")!=(var1+"oifbefhfmomororlibrqjrphtibwyqveioittszpewkdpfhdoopoavdkhlrorrcayiksmoiogqpgq"))){
System.out.println("NischitTest1 - NischitTest1method3- LineInMethod: 69");
}
else{
 var3 = (long)((var3+(long)(1480))%(long)(458));
}
if(((var1+"hgxunhsdvrhggmaaubqicnrwwmgeumxjggmabaocdrnevrhzmzuzboqbhnsvwnvs")==(var1+"ztqyqeefibpiejhkuiverwbvuxjtoqr"))){
System.out.println("NischitTest1 - NischitTest1method3- LineInMethod: 75");
}
else{
 System.out.println("NischitTest1 - NischitTest1method3- LineInMethod: 78");
}
switch((var2*(int)(1658))){
case 0:
var3 = (long)((var3+(long)(682))+(var3*(long)(2473)));
 break;
case 1:
var1 = "ejotmgtf";
 break;
default :
f0[5] = new NischitTest9();
}
if(((var1+"wrdmmpwxwzxkxqkdyluzylegxcmmmbostkouayicdhwgqjgnjdzwmmaefyywnwvetsdcoqbvhsscwwtdfkexzexsstmmc")!=((var1+"rfibzyszzdxlbemlddztciqecqsnmfoyjrbptnwjvlwahrlgnekpzqt")+(var1+"vnavccxpobxinrqspqwmgjysljcumfwrkzaggsjlzewejafeekcaxeenyowny")))){
System.out.println("NischitTest1 - NischitTest1method3- LineInMethod: 94");
}
else{
 System.out.println("NischitTest1 - NischitTest1method3- LineInMethod: 97");
}
if( ((var2/(int)(3431))>(var2*(int)(181)))){
if( ((var1+"rloejdyyyggocczjfkwapcswaumada")!=(var1+"mizktinsbzsqaektngnedfldeacjndpa"))){
if( ((var1+"betdylccxhpbvc")!=(var1+"ojzgwxxrrzqbjqesvxphvldlffq"))){
var2 = (int)(1434);
}
}
}
return (int)var2;

}

public static long NischitTest1method4(NischitTest10 var0, long var1){
 for(int i = 0; i < 45; i++){
 System.out.println("NischitTest1 - NischitTest1method4- LineInMethod: 2");
}
if( (((var1+(long)(1796))<=(var1+(long)(786)))&&((var1*(long)(1313))!=((var1%(long)(2297))-(var1/(long)(727)))))){
if( (((var1*(long)(3442))/(long)(1904))>(((var1+(long)(1206))-(var1%(long)(933)))*(var1-(long)(1813))))){
System.out.println("NischitTest1 - NischitTest1method4- LineInMethod: 8");
}
}
for(int i = 0; i < 47; i++){
 var1 = (long)(1670);
}
for(int i = 0; i < 42; i++){
 System.out.println("NischitTest1 - NischitTest1method4- LineInMethod: 14");
}
if( ((((((var1/(long)(996))+(var1*(long)(3278)))-(var1%(long)(1166)))-(var1-(long)(1378)))>=(var1%(long)(1629)))&&((var1+(long)(907))==(var1+(long)(1217))))){
var1 = (long)(1156);
}
for(int i = 0; i < 36; i++){
 System.out.println("NischitTest1 - NischitTest1method4- LineInMethod: 106");
}
for(int i = 0; i < 13; i++){
 if( ((var1*(long)(394))!=(var1-(long)(825)))){
if( ((((var1/(long)(1342))>=(var1-(long)(857)))&&((var1*(long)(263))==(var1*(long)(2210))))&&((var1*(long)(1606))<=((((var1*(long)(1695))%(long)(2223))+(var1+(long)(18)))-(var1-(long)(968)))))){
if( (((var1-(long)(775))>=(var1*(long)(3256)))||((var1-(long)(511))>=(var1*(long)(991))))){
if( (((var1%(long)(620))+(var1/(long)(2751)))<(var1+(long)(578)))){
if( ((var1*(long)(3200))!=((var1+(long)(617))*(var1-(long)(1734))))){
System.out.println("NischitTest1 - NischitTest1method4- LineInMethod: 121");
}
}
}
}
}
}
for(int i = 0; i < 49; i++){
 if( ((var1-(long)(3071))!=(var1-(long)(1863)))){
System.out.println("NischitTest1 - NischitTest1method4- LineInMethod: 130");
}
}
return (long)var1;

}


public static void main(String args[]){
NischitTest1 obj = new NischitTest1();
NischitTest1method0((long)(3384),(int)(751));
obj.NischitTest1method1((long)(145),new NischitTest13(),(long)(1888),(long)(2409));
obj.NischitTest1method2(new NischitTest9(),(int)(3451),new NischitTest1(),(long)(2854));
NischitTest1method3(new NischitTest2(),"sagqvrsqwbdsrtenfpfjoehqzwekwoormvsjmzddelfpuqnbspkoaxlw",(int)(2505),(long)(2494));
NischitTest1method4(new NischitTest10(),(long)(1357));
}

}