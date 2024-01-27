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


public class NischitTest6 {
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
String[] f0= new String[29];


public static Object NischitTest6method0(NischitTest1 var0, String var1){
 return (Object)var0;

}

public static Object NischitTest6method1(int var0, int var1){
 if(((var0/(int)(2568))==((var0*(int)(1976))*(var1*(int)(2080))))){
System.out.println("NischitTest6 - NischitTest6method1- LineInMethod: 4");
}
else{
 var0 = (int)((var1/(int)(3038))-(var0*var1));
}
if( (((var0%(int)(1542))<=(var0*(int)(827)))&&((var1%(int)(3014))==(var1/(int)(87))))){
var1 = (int)(((var0-var1)-(var0*var1))%(int)(1739));
}
switch((var0+var1)){
case 0:
System.out.println("NischitTest6 - NischitTest6method1- LineInMethod: 13");
 break;
case 1:
System.out.println("NischitTest6 - NischitTest6method1- LineInMethod: 20");
 break;
default :
NischitTest6method4(var1,"rsmflrhautjwacpqdnjugyyyhvoxlhqiizdvpsepwfiepkifgxmjfimkjdugirdzwddcexeatmqawivegc");}
return (Object)null;

}

public String NischitTest6method2(String var0, NischitTest2 var1){
 if((((var0+"kwuadeslnajukzoihbjrvlxbdlxisnjllxjplvmslsahbqbpinomvasltchcfeqstnne")==(var0+"gnmcaafeckdlnpkpntfztsdripqptptuirryttlgzvoumnrhygligdyfljcrrgfuafmrwsseqdwbnppggtjypdbbascqequzoaa"))&&((var0+"jzlqqzjfiqbsavydabuyknhyssnkosjsrfufslvtvtktqqtzgustjwzbspazztncfwaesioeidohvyv")!=(var0+"itorbzeumtuhynkric")))){
System.out.println("NischitTest6 - NischitTest6method2- LineInMethod: 4");
}
else{
 System.out.println("NischitTest6 - NischitTest6method2- LineInMethod: 8");
}
for(int i = 0; i < 5; i++){
 System.out.println("NischitTest6 - NischitTest6method2- LineInMethod: 12");
}
if(((var0+"dtgwcwmibfxjypykoddqaavdwwwtlaydhszqklfshiplyfdahfyekayjpkslpjrey")==(var0+"yzehcbikhiypbgygfydtfzbivcbfhdkekjrnjwhdxitjblbwxnrtbqhhgwicj"))){
var0 = (String)((f0[27]+"bgqfqocnzixvtbierloubdsmvpcjhborxklzjezdaxfawawxbyycpwfcejrdomijychxbirznbtecbrprquipzkdqghxkiqx")+((var0+"utcnjeifxuguivynabfizqywdnwjesuqkyllykwgfiuzrajj")+(var0+"dhxuvzconsqiexxsspkphzk")));
}
else{
 var1 = new NischitTest2();
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
for(int i = 0; i < 31; i++){
 var1 = new NischitTest2();
}
for(int i = 0; i < 13; i++){
 if( ((var0+"owwclrsqaheoqfvegitiybzumrsccggrdxourexvfdyujadunjzlekhvstzqlkyfb")==(var0+"jiyvbioykdfwmvhuhlagbrhpazmmdqljrlvblxedlhplemmyqabxihxsdvxavbvaeeybnhszbektxhfsirhirlxuygsdip"))){
var1 = new NischitTest2();
}
}
if((((var0+"gfhqglifruyflcizcfvqx")==(var0+"stbjiqhnevlegiasscejbsfxailuamtgtbgsrmpfeqcfoiquqfpmfailtvnolhifobbqrrrqkqsxbwdqxyuz"))&&((var0+"ipoujzeqwzmltzzpkzaxjdnuayrfrbqhjdijdbdpyl")==(var0+"lklrxqbf")))){
System.out.println("NischitTest6 - NischitTest6method2- LineInMethod: 35");
}
else{
 var0 = NischitTest6method11(var0,(int)(1313));
}
final NischitTest0 obj_NischitTest0 = new NischitTest0() ;
Thread th17= new Thread(obj_NischitTest0,"th17"){
public void run() { 
 int rv0= obj_NischitTest0.NischitTest0method16(null,var1,var0);
int rv1= obj_NischitTest0.NischitTest0method9(var0,(long)(1319));
String rv2= obj_NischitTest0.NischitTest0method8((int)(1719),(int)(3065),var0,var0);
Object rv3= obj_NischitTest0.NischitTest0method0((int)(1030),null,(long)(1829),var0);
String rv4= obj_NischitTest0.NischitTest0method5((long)(3153),(long)(924));

 }.start() ;
Thread th18= new Thread(obj_NischitTest0,"th18"){
public void run() { 
 int rv0= obj_NischitTest0.NischitTest0method9(var0,(long)(1616));
Object rv1= obj_NischitTest0.NischitTest0method1(var0,(long)(633),null);
Object rv2= obj_NischitTest0.NischitTest0method18((int)(336),var0,(int)(2822),null);
Object rv3= obj_NischitTest0.NischitTest0method18((int)(220),var0,(int)(2841),null);
String rv4= obj_NischitTest0.NischitTest0method17((long)(2136),var0,(long)(3162));

 }.start() ;
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Program Files\\Microsoft Silverlight\\5.1.20913.0\\fi\\__UIC__RUGRAT__aaLed.txt"));
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
} catch (FileNotFoundException ex) {
ex.printStackTrace();
} catch (IOException ex) {
ex.printStackTrace();
} finally {
try {
if (bufferedWriter != null) {
bufferedWriter.flush();
bufferedWriter.close();
String logfile = "C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\log.txt";
bufferedWriter = new BufferedWriter( new java.io.FileWriter( logfile, true ) );
bufferedWriter.append("C:\\Program Files\\Microsoft Silverlight\\5.1.20913.0\\fi\\__UIC__RUGRAT__aaLed.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (String)var0;

}

public static String NischitTest6method3(int var0, long var1, NischitTest6 var2){
 if( (((var0/(int)(2801))<=(((var0%(int)(109))*(var0-(int)(2022)))*((var0*(int)(1725))/(int)(1577))))||(((var0%(int)(3049))-(var0-(int)(1233)))<=(var0/(int)(1276))))){
if( ((var1*(long)(506))<=(var1+(long)(2743)))){
var1 = (long)(2839);
}
}
return (String)"wyemkzhbzsooocqeczirqagqanhwqzgpbixslrbyfxzcyxdfcmijconkpzlgmybkksblazezwjgcflnzjggakiyyorgdublztf";

}

public static Object NischitTest6method4(int var0, String var1){
 if(((((var0+(int)(3272))/(int)(1281))>=((var0+(int)(2417))+(var0*(int)(1593))))||(((var0-(int)(540))>=(var0%(int)(2061)))||((var0-(int)(690))<(var0-(int)(341)))))){
System.out.println("NischitTest6 - NischitTest6method4- LineInMethod: 4");
}
else{
 var0 = (int)((var0-(int)(3025))%(int)(1275));
}
if( (((var0+(int)(692))*(var0-(int)(2762)))<=(var0-(int)(923)))){
System.out.println("NischitTest6 - NischitTest6method4- LineInMethod: 8");
}
switch((var0*(int)(858))){
case 0:
var0 = (int)((var0*(int)(3288))*((var0+(int)(2883))-(var0%(int)(948))));
 break;
case 1:
System.out.println("NischitTest6 - NischitTest6method4- LineInMethod: 14");
 break;
case 2:
System.out.println("NischitTest6 - NischitTest6method4- LineInMethod: 19");
 break;
case 3:
var1 = "rtjivbcgemhunsklhcemwqqwsiailpweyknfo";
 break;
default :
var1 = (String)(var1+"fslbhiwibyxobdtlgydbyjrldhizfxjhnutueizcdijdxgkkdrexkiisknf");
}
return (Object)null;

}

public String NischitTest6method5(NischitTest0 var0, String var1){
 final NischitTest1 obj_NischitTest1 = new NischitTest1() ;
Thread th19= new Thread(obj_NischitTest1,"th19"){
public void run() { 
 String rv0= obj_NischitTest1.NischitTest1method11((long)(2553),(int)(3342),(long)(1522));
long rv1= obj_NischitTest1.NischitTest1method12((long)(2279),(int)(785),(long)(42),(int)(2583));
Object rv2= obj_NischitTest1.NischitTest1method9(var1,(int)(393),(int)(1507));
long rv3= obj_NischitTest1.NischitTest1method7((long)(2391),null,(int)(781));
String rv4= obj_NischitTest1.NischitTest1method11((long)(2322),(int)(1333),(long)(3101));

 }.start() ;
Thread th20= new Thread(obj_NischitTest1,"th20"){
public void run() { 
 String rv0= obj_NischitTest1.NischitTest1method11((long)(3336),(int)(3255),(long)(2649));
long rv1= obj_NischitTest1.NischitTestInterface2Method0(null,var1,var0,(long)(793));
String rv2= obj_NischitTest1.NischitTest1method1((int)(1841),(long)(1455));
int rv3= obj_NischitTest1.NischitTest1method0((long)(2974),(long)(2610));
String rv4= obj_NischitTest1.NischitTest1method5(var1,(long)(481));
String rv5= obj_NischitTest1.NischitTest1method11((long)(1322),(int)(3111),(long)(960));

 }.start() ;
try {
bufferedReader= new BufferedReader(new FileReader(getNextFile("C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\log.txt","C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\config.xml")));
String line = null;
while((line = bufferedReader.readLine()) != null){
System.out.println("Read line = " + line );
}
}
catch(Exception e){
e.printStackTrace();
}
if(((f0[10]+f0[21])==(var1+"edzryvvpvxtbhekxnlpoxjkryfzogwfiqjtxojwkxsdazwmpucohzihnhsuucxycayaqfwjmluqjtrgpbadcvdtdmu"))){
NischitTest6method11(var1,(int)(2981));}
else{
 var0 = new NischitTest0();
}
if( ((f0[8]+f0[0])==(var1+"rypye"))){
f0[20] = (String)((var1+"uhihfffatqlvrnqdvunyzuwdfahxoebklhybx")+(var1+"oiycyztyicopunvblpureaakdhcdiocsrgeyql"));
}
try {
bufferedReader= new BufferedReader(new FileReader(getNextFile("C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\log.txt","C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\config.xml")));
String line = null;
while((line = bufferedReader.readLine()) != null){
System.out.println("Read line = " + line );
}
}
catch(Exception e){
e.printStackTrace();
}
for(int i = 0; i < 71; i++){
 if( ((var1+"tbolwzddfgzkszmpxumbugqhiwlszhjfmaxeceabohapdihtnnjkssiootjxyosrhdogateibmfztwvpqzjvopwchm")==(var1+"kwbsyitfvkwsiwtstocipllajxrvjyfyadxrwwpq"))){
if( ((f0[22]+f0[20])!=(var1+"hpbfnqsnjxshypytheqstsnryjawogz"))){
System.out.println("NischitTest6 - NischitTest6method5- LineInMethod: 15");
}
}
}
final NischitTest3 obj_NischitTest3 = new NischitTest3() ;
Thread th21= new Thread(obj_NischitTest3,"th21"){
public void run() { 
 Object rv0= obj_NischitTest3.NischitTest3method0(null,(int)(1313));
String rv1= obj_NischitTest3.NischitTest3method6((long)(2930),null);
String rv2= obj_NischitTest3.NischitTest3method11((int)(1420),var1,var1);
int rv3= obj_NischitTest3.NischitTest3method1(null,(int)(1078));
int rv4= obj_NischitTest3.NischitTest3method7((long)(905),(long)(177));

 }.start() ;
try {
bufferedReader= new BufferedReader(new FileReader(getNextFile("C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\log.txt","C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\config.xml")));
String line = null;
while((line = bufferedReader.readLine()) != null){
System.out.println("Read line = " + line );
}
}
catch(Exception e){
e.printStackTrace();
}
if( ((f0[3]+f0[27])==(f0[26]+f0[0]))){
var0 = new NischitTest0();
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
if((((var1+"jkbchakelwobufzlwcn")+((var1+"fvumwgciyxsysxqadawruhejkeyxmtywxjedaytjxqqcvrvaqkphdcvoltngzcsoto")+(var1+"wvlpmbamkvlxa")))!=(f0[22]+f0[17]))){
System.out.println("NischitTest6 - NischitTest6method5- LineInMethod: 23");
}
else{
 var0 = new NischitTest0();
}
try {
bufferedReader= new BufferedReader(new FileReader(getNextFile("C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\log.txt","C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\config.xml")));
String line = null;
while((line = bufferedReader.readLine()) != null){
System.out.println("Read line = " + line );
}
}
catch(Exception e){
e.printStackTrace();
}
if( ((var1+"zpuohhtonflouaaykeqqihbzqotwqqixeduvyhnrlygbizdyjfezbizgznh")!=(var1+"knzj"))){
var1 = "youlevumiqecgzznzaekuolienpiyvxueelryieerwwkzcsthmtgjammvcyzlenzxoptgelvgxoalfcyargpunwcxhrkgdfvyqgb";
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
for(int i = 0; i < 97; i++){
 f0[19] = (String)((((((var1+"rrwhkfzbalmbbqujwymwaltecsrxnyqlkdswqeqotqokwzftgrpymylslvevckhuormiifo")+(var1+"hjycsixhiuktctusbthwyqviwppvyrvxfjegnhxpieqblqjcofzaechbxjdqjntcxuxmpqlovvxrvfnyrqaodisxmy"))+(var1+"cyfejvntcnrsvyxajdemwyasrmdknpiaecnlcssugopw"))+(var1+"blgi"))+(var1+"vv"))+((var1+"dztpcvguantxrtgmazhqpdpzedkdgbwgmtigcusyvkpfwzcjbpcgpptfnebxe")+(var1+"jwuwsiylhsxsxuyizbrnsabijpzssxizuafpgv")));
}
if( ((var1+"zikowiwkjblxmnqgzdsrnmwztkxtyvjqlyndpkodfujginybokcewsgydmhlu")!=(f0[9]+f0[3]))){
var0 = new NischitTest0();
}
if( ((var1+"utlyvvxcfkhpliotxpi")!=((f0[3]+f0[20])+(f0[9]+f0[21])))){
System.out.println("NischitTest6 - NischitTest6method5- LineInMethod: 37");
}
if( (((var1+"rvefqttydxxybomemddoxnnueqhcjwlvfmljsavmkm")+(var1+"wnfonmigsziraahtlbpyboo"))==(var1+"hkbjjjwnfjjqlmhotyoiwkquowpxneulinkkrbwggihbeysereiarb"))){
if( ((var1+"rpxhmkkvsvhxlfkfzrnivuzpdyhjqzguqrovvvkmrkvzcbfskqnztospljmjrbpuykycryic")!=(var1+"ezzjgvyugqwlwob"))){
if( ((f0[27]+f0[10])==(var1+"uzvvhgzuneqcovgsrfbslgohvmo"))){
f0[5] = (String)((var1+"cvpudghfmzmwauuorgeckaiujfvvuhzviqhnpihjfuyutjtlbhoouuelzed")+(var1+"wrzgbrfoyodkqafvsvsbijcbgnbtlsywvhuiwmoxykmzlakvzvtleorlkaapldimdloijmxext"));
}
}
}
try {
bufferedReader= new BufferedReader(new FileReader(getNextFile("C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\log.txt","C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\config.xml")));
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
if((((var1+"kdjejb")!=((var1+"rirjulinjoxyegnfypowfhpwakxudaoloivmhbdpvfqvevywkcbxwvazpk")+(var1+"xiesrhridciknvsekybmgy")))||(((var1+"pivfkdwxobhpmqivvubgccshcbwqtdplnocginqxucpqickghpdimfbwm")==(f0[2]+f0[4]))||(((var1+"oaqxzsxhuxscakmerlecurygvokimazytcpwqdrfdtpalb")+((var1+"rloxjtc")+(var1+"lnzcqsrcudtpftthrmmycewcxwisvzioaszbt")))==(var1+"dvwuikabxqgjpookrhjkagryvfmhtkxuwcpgvcwzhif"))))){
System.out.println("NischitTest6 - NischitTest6method5- LineInMethod: 50");
}
else{
 System.out.println("NischitTest6 - NischitTest6method5- LineInMethod: 55");
}
return (String)var1;

}

public Object NischitTest6method6(String var0, NischitTest5 var1){
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
if( ((var0+"dqsehejmtjmpdshpmrdngdmzldwkatzntbhgxwrznxziqobfoatxnrtqpuublwnvuqxegphviysx")==(var0+"rnosrpmebpuegli"))){
if( ((var0+"vwlxgiknfsxqlqjwynifbeyyslayswykhgzcokvztmlbypoodpluehdqhyjgcelzrbrjdxrntpuomcnstbsc")!=(var0+"msbimjiauixidcpllvrmfqhfxwecqtz"))){
f0[26] = (String)((var0+"amdnkstghaf")+(var0+"xxpaceafeiubqdzzmljjdxlvzobiwkxpyzodnaodlcijusvdrlvqvkdnjoghwscetjaiwskurvyzjzozmcpic"));
}
}
for(int i = 0; i < 10; i++){
 var0 = "jwtebwttfxmzdjbudcvcjmrz";
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
if((((var0+"tigbuprrlwbqtjoinoddsjfcarnrnrggkfsypkete")==(var0+"njdxuahzfmkzcikeuhsybxzyihinmjjndn"))&&((var0+"xo")==(var0+"drqnmne")))){
System.out.println("NischitTest6 - NischitTest6method6- LineInMethod: 11");
}
else{
 var1 = new NischitTest5();
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
if(((var0+"zebldjgctcfcxawlvgnjgogzbsqdnatblddgwnwpiosbysskjimagwaegqww")==(var0+"rnxoracohelefwqbtcyhtyzywwowbrvwfeaqexszosqcgoqzz"))){
System.out.println("NischitTest6 - NischitTest6method6- LineInMethod: 18");
}
else{
 System.out.println("NischitTest6 - NischitTest6method6- LineInMethod: 22");
}
if(((f0[14]+f0[6])==(var0+"uvgiwl"))){
System.out.println("NischitTest6 - NischitTest6method6- LineInMethod: 29");
}
else{
 var0 = "di";
}
if(((f0[4]+f0[23])==(var0+"pskueehiwopyembofdkgtvwxprqinfdqfxmvqfkmdhwmfsgelfauhlgtu"))){
var0 = (String)(((var0+"fjjlgknohdoenpsego")+(var0+"fwacjpcnncvxvgeflyizedxwfnperfhcbbf"))+(var0+"dxkublqijrtgobrylightntpafmewzyilgacfijynpkvtrbornecsjdfgek"));
}
else{
 f0[12] = (String)(var0+"djruncyhqeugqbjuhuctvxoinmvpmwdrfytvoctxgcecuimotbjitqctctvbhvfztuoljiattxugiehfrqixvokiajigwav");
}
if(((var0+"irtssgetjzvolwlkpgsk")!=(var0+"zrmhgrpjxudoznqwavfdpqnbfpjgkusupeczgwc"))){
System.out.println("NischitTest6 - NischitTest6method6- LineInMethod: 42");
}
else{
 f0[13] = (String)((var0+"kpqdjdiggtxmobistzdlwhbbsgx")+(var0+"djcovtceeccrdbinstdfpofifhjjofnqf"));
}
try {
bufferedReader= new BufferedReader(new FileReader(getNextFile("C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\log.txt","C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\config.xml")));
String line = null;
while((line = bufferedReader.readLine()) != null){
System.out.println("Read line = " + line );
}
}
catch(Exception e){
e.printStackTrace();
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\__UIC__RUGRAT__dm87usAOZL3.txt"));
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
} catch (FileNotFoundException ex) {
ex.printStackTrace();
} catch (IOException ex) {
ex.printStackTrace();
} finally {
try {
if (bufferedWriter != null) {
bufferedWriter.flush();
bufferedWriter.close();
String logfile = "C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\log.txt";
bufferedWriter = new BufferedWriter( new java.io.FileWriter( logfile, true ) );
bufferedWriter.append("C:\\__UIC__RUGRAT__dm87usAOZL3.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (Object)var1;

}

public static int NischitTest6method7(long var0, long var1, long var2){
 for(int i = 0; i < 35; i++){
 if( ((var0/(long)(400))>(var0-var1))){
var0 = (long)((var2*var0)+(var0+var1));
}
}
if( ((var1*(long)(3271))>(var2+var0))){
NischitTest6method9("lbdwbnfyvrsmrapoipjwgnqgeaupihwdkulavjwtgeumlnsjkzclhelisq",(int)(3370));}
if( (((var1/(long)(2958))-(var1-var2))>(((var2*var1)-((var1+var0)*((var2-var0)/(long)(582))))/(long)(276)))){
System.out.println("NischitTest6 - NischitTest6method7- LineInMethod: 10");
}
for(int i = 0; i < 87; i++){
 if( ((var0/(long)(2375))==(var0/(long)(968)))){
if( ((var1/(long)(1846))<=((var0-var2)+(var2%(long)(1795))))){
if( ((var2-(long)(1740))<=(var2%(long)(2769)))){
if( ((var1+var2)!=(var1*(long)(293)))){
if( ((var1%(long)(1923))<=(var1/(long)(374)))){
if( ((var1*(long)(2054))>(var1*var0))){
System.out.println("NischitTest6 - NischitTest6method7- LineInMethod: 25");
}
}
}
}
}
}
}
if( (((var0%(long)(3089))+(var1+var0))<(var1*var0))){
System.out.println("NischitTest6 - NischitTest6method7- LineInMethod: 28");
}
for(int i = 0; i < 45; i++){
 var0 = (long)(477);
}
for(int i = 0; i < 47; i++){
 System.out.println("NischitTest6 - NischitTest6method7- LineInMethod: 36");
}
if( (((var2*var1)-(var0-var2))>(var1-(long)(1856)))){
System.out.println("NischitTest6 - NischitTest6method7- LineInMethod: 42");
}
if( (((var1*var2)+(var1%(long)(280)))<(var1+(long)(2724)))){
System.out.println("NischitTest6 - NischitTest6method7- LineInMethod: 49");
}
return (int)(int)(1972);

}

public long NischitTest6method8(NischitTest6 var0, String var1){
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
if(((f0[12]+f0[8])==(var1+"upxqeeekbqj"))){
System.out.println("NischitTest6 - NischitTest6method8- LineInMethod: 4");
}
else{
 System.out.println("NischitTest6 - NischitTest6method8- LineInMethod: 9");
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
if(((var1+"lsmbattkvszlofayzceartftfwjbf")==(f0[13]+f0[7]))){
System.out.println("NischitTest6 - NischitTest6method8- LineInMethod: 15");
}
else{
 var1 = NischitTest6method11(var1,(int)(678));
}
if((((f0[11]+f0[11])+(f0[10]+f0[14]))==(var1+"vgimwwziqfflgcyigjndcnknwhifusplykdxmfnurcxqbcuzxagirjrwimcfzbitdjjmnockqklwvrnjgtf"))){
f0[26] = (String)((f0[9]+f0[6])+(var1+"haelbdznlzeuhecnhkyydneqppgqjillgmgixcwmqmahseazannasykadmfdkiyonyqwqsjwnxnuiltkceysdypixmayk"));
}
else{
 f0[24] = (String)((f0[14]+f0[12])+(var1+"fwyiaiqelapowptfzkxajlankpytpnqzntutqqtayumlqgcr"));
}
if((((f0[16]+f0[1])+(f0[27]+f0[0]))==(var1+"pxgrgbazqjkrsufaxvkgojnrtbqletei"))){
var1 = "cvejaydvqfoiedncqajidquhwciuekjkhrgnwmtphqasubhtdvrlensmhsnxrvkvhwchzgtcxeeokvkctzletiefz";
}
else{
 System.out.println("NischitTest6 - NischitTest6method8- LineInMethod: 28");
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\PerfLogs\\__UIC__RUGRAT__UWFu6.txt"));
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
} catch (FileNotFoundException ex) {
ex.printStackTrace();
} catch (IOException ex) {
ex.printStackTrace();
} finally {
try {
if (bufferedWriter != null) {
bufferedWriter.flush();
bufferedWriter.close();
String logfile = "C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\log.txt";
bufferedWriter = new BufferedWriter( new java.io.FileWriter( logfile, true ) );
bufferedWriter.append("C:\\PerfLogs\\__UIC__RUGRAT__UWFu6.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (long)(long)(3372);

}

public static Object NischitTest6method9(String var0, int var1){
 if(((var0+"cjfxeezfpyfwdriwzrbtdtgadooqzmtkznmtzegbzkwlewnjcvutjviegvvdotaeyubceiwpkxwjgpldfxjztnm")!=(var0+"xaxtyorvpjiqdasezdzcvgnrwkrxatppweelwxgepxdgwzzmdnomnbyosbka"))){
System.out.println("NischitTest6 - NischitTest6method9- LineInMethod: 4");
}
else{
 var1 = (int)((var1-(int)(694))*(var1-(int)(917)));
}
return (Object)null;

}

public long NischitTest6method10(long var0, int var1){
 try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\ccp4temp\\__UIC__RUGRAT__wyGHN.txt"));
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
String logfile = "C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\log.txt";
bufferedWriter = new BufferedWriter( new java.io.FileWriter( logfile, true ) );
bufferedWriter.append("C:\\ccp4temp\\__UIC__RUGRAT__wyGHN.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (long)var0;

}

public String NischitTest6method11(String var0, int var1){
 switch((var1+(int)(212))){
case 0:
f0[8] = (String)(var0+"tssapypxgobchkaaqfirubriuaqfzvbbygiknzfcuysyzlfonevenxhhjoailxnpfradaygpnikzjkqbeikvkuwzjvd");
 break;
case 1:
System.out.println("NischitTest6 - NischitTest6method11- LineInMethod: 5");
 break;
case 2:
f0[22] = (String)((f0[7]+f0[9])+(var0+"etgirsysztzeqbgjtwhekrnycxnftzpgzwamttgbyusqihgowvcrzvqhyyi"));
 break;
default :
var0 = (String)(var0+"mnatddjqtcdjbylwahzsuzmehgmzdisnhjjeizd");
}
try {
bufferedReader= new BufferedReader(new FileReader(getNextFile("C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\log.txt","C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\config.xml")));
String line = null;
while((line = bufferedReader.readLine()) != null){
System.out.println("Read line = " + line );
}
}
catch(Exception e){
e.printStackTrace();
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\WinCoot\\__UIC__RUGRAT__v3yEq.txt"));
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
} catch (FileNotFoundException ex) {
ex.printStackTrace();
} catch (IOException ex) {
ex.printStackTrace();
} finally {
try {
if (bufferedWriter != null) {
bufferedWriter.flush();
bufferedWriter.close();
String logfile = "C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\log.txt";
bufferedWriter = new BufferedWriter( new java.io.FileWriter( logfile, true ) );
bufferedWriter.append("C:\\WinCoot\\__UIC__RUGRAT__v3yEq.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (String)var0;

}

public static int NischitTest6method12(int var0, String var1){
 if( (((var1+"lpwcpd")+((var1+"nbiqyyrjifpabewujukxukdvalrucxat")+(var1+"qrlipuitjyzjcoesobuechumttwdgblvalkuaqqvemyyuakbwqzyjatemklmkvcqmecteerulxclzg")))==(((var1+"qghowbcyzfifzwezevbuzhpmtjbocedinupyyqqcbm")+((var1+"kxxlborwuwrwuedwhuhczkthbmqrvodjcriipocvgjsiobkiayapdoceekriplivuzsyxjaqbimpguqlrqsowiyzqpqoytrlvuqf")+(var1+"dxxrpvztmtokrcdvffwtaqjvsmgwndlmkrowpsnapjtyagjjud")))+(((var1+"ohjtbqvlwnuxoesrqvnwieyeklwxbbbdtnwvqbtsevuhdkrpvlw")+(var1+"fvcpvytcoxvmzvmjjetiuuyhrcfpsfjpivifwvifbivtocbwnghwryaghlwpjtluhgeyeckyrtzklbzsqvvytazm"))+(var1+"fnbthpawqx"))))){
var0 = (int)((var0-(int)(1554))+(var0*(int)(212)));
}
switch((var0*(int)(453))){
case 0:
var1 = "zsyvvhzumihugqijdrivsetaztvqynbldnwpxqxdp";
 break;
case 1:
var1 = "hkfniyvkzqdjob";
 break;
case 2:
System.out.println("NischitTest6 - NischitTest6method12- LineInMethod: 9");
 break;
case 3:
var1 = "mxgsmibqqkosevafjtmmsonbmlmwoxwc";
 break;
case 4:
System.out.println("NischitTest6 - NischitTest6method12- LineInMethod: 14");
 break;
case 5:
var0 = (int)(((var0/(int)(2384))%(int)(3279))*(var0-(int)(510)));
 break;
case 6:
var1 = (String)((var1+"xmiexlatvyjhccxokoymstyutaghrektpuooxdjzkoypdoradiqdwhtcdobbjiydobdzkwstwdzyveo")+(var1+"lfskqodwdlbaalkhpschfkakghzujhanppiucbdomgmwoabxaburdebtbopk"));
 break;
default :
System.out.println("NischitTest6 - NischitTest6method12- LineInMethod: 25");
}
for(int i = 0; i < 21; i++){
 System.out.println("NischitTest6 - NischitTest6method12- LineInMethod: 28");
}
for(int i = 0; i < 5; i++){
 System.out.println("NischitTest6 - NischitTest6method12- LineInMethod: 31");
}
for(int i = 0; i < 40; i++){
 System.out.println("NischitTest6 - NischitTest6method12- LineInMethod: 36");
}
switch((var0*(int)(706))){
case 0:
var0 = (int)((var0+(int)(798))*(var0/(int)(2303)));
 break;
case 1:
System.out.println("NischitTest6 - NischitTest6method12- LineInMethod: 44");
 break;
case 2:
var0 = (int)(2930);
 break;
case 3:
System.out.println("NischitTest6 - NischitTest6method12- LineInMethod: 53");
 break;
case 4:
var0 = (int)(1226);
 break;
case 5:
var0 = (int)(1409);
 break;
case 6:
System.out.println("NischitTest6 - NischitTest6method12- LineInMethod: 64");
 break;
default :
System.out.println("NischitTest6 - NischitTest6method12- LineInMethod: 69");
}
return (int)var0;

}


public static void main(String args[]){
NischitTest6 obj = new NischitTest6();
NischitTest6method0(new NischitTest1(),"uvneaeqaijqzffoersjdjkfsukhcvjbmnxqnfdlawmjkndjpmfqvtdvspqvkhrjduefrjphrskposnrvsoyvqlopeackowaemuo");
NischitTest6method1((int)(1106),(int)(3346));
obj.NischitTest6method2("ipaihwyijvqhnbbjwnxokdcqguwipidbestjrbmfvkkandcytgdumdracqqjpsujpdmwqjdznkgboroyfaidmzxvsoeyp",new NischitTest2());
NischitTest6method3((int)(81),(long)(1270),new NischitTest6());
NischitTest6method4((int)(2393),"jjzinddoaxglmlwsrapleyfsbjgqveyagrfvtosyjjmkxiokyvgocwjdhcvzxldcswdhsuhgueaqinheujqbfuettomjiltouhjfy");
obj.NischitTest6method5(new NischitTest0(),"ilyngmzetlhuzhkhaweh");
obj.NischitTest6method6("mwttomwqdojqupfppmqzselgqmrmeiybmnkbpakekjjgtz",new NischitTest5());
NischitTest6method7((long)(907),(long)(1358),(long)(2532));
obj.NischitTest6method8(new NischitTest6(),"tadllndfhowsbcgxmezkbvcouhncrjwyqgcnmqxhvxuksdqijdbfrumacleoavsvxngfdbtvbltqfmiafdyrsxluubxwcr");
NischitTest6method9("pxmtkboslpnpxoysbplequlpuaccpxyuzicppvsqtysicpccghozxtzxrnbdyqkrlwuledjvrknczsaljtm",(int)(1249));
obj.NischitTest6method10((long)(2298),(int)(167));
obj.NischitTest6method11("sfyovrqqbwqlwsmotibysstavwbqdzotvkvyraxsgudwuegrqdbpwfzma",(int)(55));
NischitTest6method12((int)(518),"zuiyiwmtjhqshxutykyossigwpylvehqpjowtmxclqdpl");
}

}