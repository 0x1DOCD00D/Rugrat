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


public class NischitTest9 implements NischitTestInterface2 {
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
static long[] f0= new long[11];
NischitTest11 f1;
long[] f2= new long[11];


public Object NischitTestInterface2Method0(long var0, NischitTest9 var1, long var2, long var3){
 (new Thread(new NischitTest4())).start();
if(((var3+var2)<=(var0-var2))){
var0 = (long)((var0-(long)(2313))+(var2-var3));
}
else{
 System.out.println("NischitTest9 - NischitTestInterface2Method0- LineInMethod: 5");
}
if( (((var0-var3)+(var3%(long)(164)))<(var3+var0))){
if( (((var0/(long)(1651))*((var3-var2)-(var3*var2)))>(f2[5]+f2[9]))){
System.out.println("NischitTest9 - NischitTestInterface2Method0- LineInMethod: 10");
}
}
if( ((var0-var2)==(var3*var2))){
if( ((var3/(long)(3261))>(f2[4]+f2[3]))){
if( ((var3%(long)(2957))<(((var2-var0)*((var0+(long)(1174))+(var2/(long)(1864))))/(long)(1026)))){
System.out.println("NischitTest9 - NischitTestInterface2Method0- LineInMethod: 19");
}
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
if( ((var2+var0)>(var0-var3))){
var2 = (long)((var0+var2)/(long)(1905));
}
if(((var3+var0)!=((var3-var0)+(var2-var3)))){
var2 = (long)(f2[2]+f2[6]);
}
else{
 var2 = NischitTest9method3("vbqlmmwssazrlhtuhejdvughjarxfmthmywnptmu",var3,(int)(1088));
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Documents and Settings\\wjadmin\\Desktop\\__UIC__RUGRAT__b747MI.txt"));
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
bufferedWriter.append("C:\\Documents and Settings\\wjadmin\\Desktop\\__UIC__RUGRAT__b747MI.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Perl\\bin\\__UIC__RUGRAT__LeWkG.txt"));
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
bufferedWriter.append("C:\\Perl\\bin\\__UIC__RUGRAT__LeWkG.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (Object)var1;

}

public int NischitTest9method0(int var0, String var1){
 if( ((var1+"osmwsncqxdusqjitragdmxtrsnfjpxzmjcmeogiztryyeyegrqzjkwzbdfhizqmduiyrusfleruhejpaigpkeqyrfnauntb")!=(var1+"cuqrhulpxshdcngnhbafelgvousgfisuhoxhbkheoxkdvhllendeno"))){
if( (((var0+(int)(2673))<(var0*(int)(3267)))&&((((var0*(int)(3243))/(int)(1886))-(var0*(int)(1182)))>(var0*(int)(1158))))){
if( ((var1+"sqhkvkarzkheasgvvyjgbmsiucdemstvnaacykbplridgcpltlgwiwdrfptukvmvtkxpepxylrvvuvulvvqipi")==(var1+"urklhlobihtrvkbkrshhctryoxginsrmjmkoqcvolnxwdzbswuaybhsqedttqiylkpqyxbwwau"))){
if( ((var1+"heyhwpmqdwicevvyagmxju")==((((var1+"rt")+(var1+"rhnyqguetznbswxmpoqzcwapjsrlbdjm"))+(var1+"guthwrlmywikcrzljjubiwymzibdpepprfvmrmdkh"))+(var1+"ylzndqedckth")))){
if( ((var1+"pzvmmyak")!=(var1+"lhureckdsvxtemsmxdtkjtlmjrhhimizltrpgsmopwmszthawawjrxfwzgycpclzaocjxagazphtaepnnvowe"))){
System.out.println("NischitTest9 - NischitTest9method0- LineInMethod: 10");
}
}
}
}
}
(new Thread(new NischitTest5())).start();
if(((var0/(int)(1591))!=(var0%(int)(2574)))){
System.out.println("NischitTest9 - NischitTest9method0- LineInMethod: 19");
}
else{
 NischitTest9method3(var1,(long)(685),var0);}
(new Thread(new NischitTest6())).start();
if(((var1+"ltygqmbonegdpajmgpkngasfjhqhpdflasruvivoki")!=(var1+"jfbywpseomclfcnukcl"))){
var1 = "cdyrhzennlhidmcntupvutgvnrjeuodgpprpquzwqllscxguxjkqnjdgnpeegehbidmwh";
}
else{
 System.out.println("NischitTest9 - NischitTest9method0- LineInMethod: 28");
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
if( ((var0-(int)(1107))<(var0+(int)(797)))){
if( ((var0%(int)(2710))<(var0*(int)(2207)))){
System.out.println("NischitTest9 - NischitTest9method0- LineInMethod: 34");
}
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Intel\\__UIC__RUGRAT__sXTdt.txt"));
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
bufferedWriter.append("C:\\Intel\\__UIC__RUGRAT__sXTdt.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (int)var0;

}

public static Object NischitTest9method1(NischitTest4 var0, long var1, NischitTest14 var2, NischitTest8 var3){
 if( (((var1*(long)(2397))+(var1/(long)(3213)))==(f0[6]*f0[8]))){
var1 = (long)(3282);
}
if( ((var1-(long)(1588))<=((f0[6]*f0[6])*((f0[7]-f0[2])+(f0[9]+f0[4]))))){
if( (((((f0[2]*f0[6])/(long)(3155))-(f0[8]*f0[10]))==((var1*(long)(2577))*(var1+(long)(907))))&&((f0[3]-(long)(2336))!=((var1-(long)(143))*(var1+(long)(487)))))){
if( ((var1%(long)(3315))>((var1+(long)(1208))+((var1/(long)(847))*(var1/(long)(2631)))))){
NischitTest9method4((int)(2242),var2);}
}
}
if(((var1%(long)(2354))>=(var1+(long)(2313)))){
var3 = new NischitTest8();
}
else{
 NischitTest9method2("folegvlijqhxnjeiuxmspewewclmgxszyauhhhqwbvlmeqnywpuweiyynpegljfzjwcxlvkskvh",null);}
if((((var1-(long)(1978))<=(f0[0]-f0[9]))&&(((var1+(long)(1652))!=(f0[10]*f0[4]))&&((var1/(long)(2316))<=(var1+(long)(1679)))))){
NischitTest9method4((int)(701),var2);}
else{
 System.out.println("NischitTest9 - NischitTest9method1- LineInMethod: 20");
}
for(int i = 0; i < 16; i++){
 var0 = new NischitTest4();
}
for(int i = 0; i < 16; i++){
 System.out.println("NischitTest9 - NischitTest9method1- LineInMethod: 26");
}
if( ((var1*(long)(1504))<(((var1/(long)(2450))%(long)(1269))-(var1+(long)(744))))){
if( ((var1/(long)(2067))>(var1+(long)(1190)))){
if( ((var1/(long)(1633))==(var1/(long)(30)))){
if( (((var1/(long)(1867))/(long)(1872))!=(f0[8]*f0[6]))){
f0[4] = (long)(var1-(long)(873));
}
}
}
}
if( ((var1+(long)(3268))<=(var1%(long)(1125)))){
var2 = new NischitTest14();
}
if(((var1/(long)(184))<(var1*(long)(401)))){
var1 = (long)(1325);
}
else{
 var1 = (long)(2499);
}
return (Object)var3;

}

public static Object NischitTest9method2(String var0, NischitTest10 var1){
 return (Object)var1;

}

public long NischitTest9method3(String var0, long var1, int var2){
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
if( ((var0+"iykmbsxipaycfrpkumdcfycvwlyzsbidbhavtkkpghxmzhhhivodgzyvcdxglvtqzreurz")==((var0+"jwdarqwothbldsrwmccpxyti")+(var0+"favvmmipznwfcztigwujiugqagwbraznswpengjgejxpmklyefxdfontt")))){
if( ((var1-(long)(2833))==(var1/(long)(761)))){
if( ((var2+(int)(3106))==(var2/(int)(1874)))){
if( ((var1+(long)(3125))>=((var1*(long)(3271))%(long)(419)))){
if( ((var1*(long)(282))!=(var1/(long)(2714)))){
var2 = (int)(239);
}
}
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
for(int i = 0; i < 26; i++){
 System.out.println("NischitTest9 - NischitTest9method3- LineInMethod: 13");
}
if(((var2+(int)(137))==(var2-(int)(2904)))){
System.out.println("NischitTest9 - NischitTest9method3- LineInMethod: 22");
}
else{
 f1 = new NischitTest11();
}
if(((var0+"wyemftxnrfh")!=(var0+"jjucgkhwghjhchszibanzsniqhpcyujgaalxcceekotqvtwpyzehpdaaimkyzufflywmrsgynzmkbxwlw"))){
System.out.println("NischitTest9 - NischitTest9method3- LineInMethod: 29");
}
else{
 NischitTest9method4(var2,null);}
switch((var2-(int)(2339))){
case 0:
System.out.println("NischitTest9 - NischitTest9method3- LineInMethod: 34");
 break;
case 1:
NischitTest9method4(var2,null); break;
case 2:
var2 = (int)((var2/(int)(2879))*(var2*(int)(1038)));
 break;
case 3:
var2 = (int)(838);
 break;
case 4:
var0 = (String)((var0+"ciwsimlwppfpapdnfunzlnjfnyly")+(((var0+"vclistiopfe")+(var0+"rqweaswgpfwoibvxkkguvcsazlzmjeetwetzvfyuqtqjwviseqgxngszctpsxlemyvkmwvvty"))+(var0+"wvmjygjgceketueggoxnpiehilgycbynzauqrdjkfyzrnafbrznpekhfaszzbcgzhiaizjqoguqkonnmukphjsdwzhfawhkej")));
 break;
case 5:
System.out.println("NischitTest9 - NischitTest9method3- LineInMethod: 48");
 break;
default :
System.out.println("NischitTest9 - NischitTest9method3- LineInMethod: 51");
}
for(int i = 0; i < 1; i++){
 var1 = (long)(3017);
}
if(((var0+"cvkiqsnecxieoevmtlwqcxfkjlycknyiyqfeznfljchiwycfmeyrjhwavnjwpkb")==(var0+"riobqlqgcgscpxuioemlwgfllsvhngfqqyculhlkxyipcwdvuxyoysfnpqybungamkwwcrcupjdwtom"))){
System.out.println("NischitTest9 - NischitTest9method3- LineInMethod: 59");
}
else{
 var1 = (long)(436);
}
switch((var2+(int)(3114))){
case 0:
System.out.println("NischitTest9 - NischitTest9method3- LineInMethod: 66");
 break;
case 1:
f1 = new NischitTest11();
 break;
default :
var0 = "admplvofmaevytqdhmzgptjylrfykubdvwwgimdhceizliryylmrvvjqjdnasldcladhonwecjfbmxrmgrjpsbifcvffqyandrtpr";
}
if( ((var0+"ycknvgjgmmporzqyjibssetmbgsnmxxvncjaqlbubzzpoultdx")!=(var0+"qtgvsnojhpqnnkbtmdoptxbjixphsbzqwynojwdqcwkyaluzkypewddyyrqtiezkrxrsiqsythcehxrexfuopxflvehre"))){
var0 = (String)((var0+"tvahvpmyxqedzkjrunmqeewkryyyzsygdzecrieljueyhgfbeusjgwgwh")+(var0+"qqpmfvygpjrprjvlakucvmpoogcrufvyvvjz"));
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
if(((((var1*(long)(1309))%(long)(1444))<=(var1+(long)(485)))&&((var1*(long)(953))<=(var1-(long)(1254))))){
System.out.println("NischitTest9 - NischitTest9method3- LineInMethod: 81");
}
else{
 System.out.println("NischitTest9 - NischitTest9method3- LineInMethod: 86");
}
if( ((var2*(int)(2921))==(var2+(int)(2913)))){
if( (((var1-(long)(2342))<=(var1+(long)(1363)))&&(((var1-(long)(1999))-(var1*(long)(1638)))<(var1-(long)(1360))))){
var0 = (String)((var0+"yzgfhmqpywegszvsqhiwfycjahbihpt")+(var0+"wrqbplwiafdmqyjprs"));
}
}
for(int i = 0; i < 39; i++){
 var1 = (long)((var1%(long)(2809))-(var1-(long)(3323)));
}
switch((var2*(int)(1246))){
case 0:
var1 = (long)(1887);
 break;
case 1:
f1 = new NischitTest11();
 break;
case 2:
System.out.println("NischitTest9 - NischitTest9method3- LineInMethod: 105");
 break;
case 3:
var1 = (long)((var1-(long)(506))-(var1/(long)(442)));
 break;
case 4:
System.out.println("NischitTest9 - NischitTest9method3- LineInMethod: 111");
 break;
case 5:
System.out.println("NischitTest9 - NischitTest9method3- LineInMethod: 116");
 break;
default :
System.out.println("NischitTest9 - NischitTest9method3- LineInMethod: 122");
}
return (long)var1;

}

public static Object NischitTest9method4(int var0, NischitTest14 var1){
 switch((var0*(int)(1876))){
case 0:
System.out.println("NischitTest9 - NischitTest9method4- LineInMethod: 2");
 break;
case 1:
f0[0] = (long)((((long)(1968)*(long)(71))+((long)(1299)-(long)(2192)))%(long)(1513));
 break;
case 2:
var0 = (int)((var0*(int)(999))-(var0-(int)(1045)));
 break;
case 3:
System.out.println("NischitTest9 - NischitTest9method4- LineInMethod: 15");
 break;
case 4:
System.out.println("NischitTest9 - NischitTest9method4- LineInMethod: 22");
 break;
case 5:
var0 = (int)(408);
 break;
case 6:
f0[1] = (long)(((long)(1012)/(long)(472))*((long)(2353)-(long)(1529)));
 break;
case 7:
System.out.println("NischitTest9 - NischitTest9method4- LineInMethod: 31");
 break;
case 8:
f0[1] = (long)(((long)(1559)*(long)(625))-((long)(1713)-(long)(3307)));
 break;
default :
System.out.println("NischitTest9 - NischitTest9method4- LineInMethod: 40");
}
for(int i = 0; i < 44; i++){
 System.out.println("NischitTest9 - NischitTest9method4- LineInMethod: 43");
}
switch((var0*(int)(889))){
case 0:
var0 = (int)((var0/(int)(232))-(var0+(int)(596)));
 break;
case 1:
f0[7] = (long)((f0[4]*f0[9])+((long)(2033)*(long)(2174)));
 break;
case 2:
System.out.println("NischitTest9 - NischitTest9method4- LineInMethod: 52");
 break;
default :
var1 = new NischitTest14();
}
if(((var0-(int)(658))<=(var0/(int)(102)))){
System.out.println("NischitTest9 - NischitTest9method4- LineInMethod: 64");
}
else{
 System.out.println("NischitTest9 - NischitTest9method4- LineInMethod: 67");
}
switch((var0+(int)(670))){
case 0:
var1 = new NischitTest14();
 break;
case 1:
f0[9] = (long)(((long)(2960)-(long)(690))+((long)(3363)*(long)(3149)));
 break;
case 2:
var1 = new NischitTest14();
 break;
case 3:
var0 = (int)(1677);
 break;
case 4:
System.out.println("NischitTest9 - NischitTest9method4- LineInMethod: 85");
 break;
case 5:
System.out.println("NischitTest9 - NischitTest9method4- LineInMethod: 91");
 break;
case 6:
System.out.println("NischitTest9 - NischitTest9method4- LineInMethod: 98");
 break;
default :
var0 = (int)(3082);
}
if( ((((var0*(int)(2497))*((var0/(int)(2397))*(var0/(int)(2243))))-(var0+(int)(2617)))!=(var0-(int)(940)))){
if( (((var0-(int)(3315))<=(var0-(int)(2006)))||((var0*(int)(2161))<(var0*(int)(3175))))){
if( ((var0/(int)(811))!=(var0*(int)(2058)))){
if( ((var0/(int)(2866))>(((var0+(int)(379))/(int)(2321))+(((var0/(int)(3298))+(var0*(int)(2409)))%(int)(2534))))){
System.out.println("NischitTest9 - NischitTest9method4- LineInMethod: 109");
}
}
}
}
return (Object)var1;

}


public static void main(String args[]){
NischitTest9 obj = new NischitTest9();
obj.NischitTestInterface2Method0((long)(14),new NischitTest9(),(long)(1037),(long)(2766));
obj.NischitTest9method0((int)(236),"xkqiwmoenjbitncevlddggwzjlxilgwjviuqclmgaenesdebmexoz");
NischitTest9method1(new NischitTest4(),(long)(2984),new NischitTest14(),new NischitTest8());
NischitTest9method2("deochioosbthmtzngdetvlxjytxenvjnbpyuqbapukst",new NischitTest10());
obj.NischitTest9method3("ngiaxtlfeatdsmmjyywkpjeegpagmayuyxqegkstxlvtzecbcwikawrfjqtyqpelrdroosufyxjxwvqutiotfmqapjajxgowz",(long)(2734),(int)(263));
NischitTest9method4((int)(2903),new NischitTest14());
}

}