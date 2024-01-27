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


public class NischitTest10 {
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
static int[] f0= new int[4];
static NischitTest6 f1;
static int[] f2= new int[13];
long f3;
static String[] f4= new String[12];


public static String NischitTest10method0(int var0, long var1){
 if((((var0/(int)(2235))+(var0-(int)(1650)))!=(f2[12]%(int)(2072)))){
var1 = NischitTest10method2(null,null);
}
else{
 System.out.println("NischitTest10 - NischitTest10method0- LineInMethod: 5");
}
switch((var0%(int)(2004))){
case 0:
var1 = (long)((var1/(long)(1380))-(var1+(long)(985)));
 break;
case 1:
var1 = (long)((var1*(long)(968))-((var1*(long)(1704))*(var1%(long)(3036))));
 break;
case 2:
NischitTest10method4(var1,null); break;
case 3:
f4[11] = (String)(f4[9]+f4[1]);
 break;
case 4:
f0[1] = (int)((var0/(int)(704))+(f0[2]/(int)(2899)));
 break;
case 5:
f2[0] = (int)((f0[2]+f2[12])-(var0%(int)(789)));
 break;
default :
var1 = (long)((var1*(long)(1857))+(var1+(long)(1148)));
}
(new Thread(new NischitTest4())).start();
if(((var0*(int)(2137))>(var0*(int)(306)))){
f0[1] = (int)((var0%(int)(3012))*(var0-(int)(278)));
}
else{
 NischitTest10method3(null,var1);}
switch((var0%(int)(1429))){
case 0:
System.out.println("NischitTest10 - NischitTest10method0- LineInMethod: 35");
 break;
case 1:
var0 = (int)((f0[2]-f2[2])%(int)(1874));
 break;
case 2:
var0 = (int)(2061);
 break;
default :
NischitTest10method2(null,null);}
switch(((var0%(int)(1960))%(int)(375))){
case 0:
var1 = NischitTest10method2(null,null);
 break;
case 1:
System.out.println("NischitTest10 - NischitTest10method0- LineInMethod: 49");
 break;
case 2:
NischitTest10method4(var1,null); break;
case 3:
System.out.println("NischitTest10 - NischitTest10method0- LineInMethod: 55");
 break;
case 4:
var0 = (int)(2791);
 break;
case 5:
System.out.println("NischitTest10 - NischitTest10method0- LineInMethod: 60");
 break;
case 6:
f1 = new NischitTest6();
 break;
case 7:
var0 = (int)(var0/(int)(1024));
 break;
default :
var1 = (long)((var1-(long)(2939))+(var1*(long)(2453)));
}
if( (((var0+(int)(766))!=(var0+(int)(3418)))&&(((var0*(int)(3219))<=((f0[0]-f0[0])+((f2[6]-f2[11])/(int)(2370))))||(((var0/(int)(176))>=(f0[2]+f2[7]))&&((var0*(int)(1063))<(var0+(int)(2731))))))){
f0[1] = (int)((var0/(int)(843))-(var0%(int)(829)));
}
(new Thread(new NischitTest5())).start();
(new Thread(new NischitTest6())).start();
if( ((var0-(int)(749))!=(var0*(int)(1599)))){
System.out.println("NischitTest10 - NischitTest10method0- LineInMethod: 75");
}
switch(((var0+f0[3])*(var0-f0[2]))){
case 0:
NischitTest10method2(null,null); break;
case 1:
var0 = (int)(711);
 break;
case 2:
f2[2] = (int)((var0-(int)(3258))+(var0-(int)(1566)));
 break;
default :
var0 = (int)(2631);
}
if(((var0*(int)(1952))<(f2[2]-f0[1]))){
var1 = (long)((var1-(long)(2197))+(var1*(long)(2276)));
}
else{
 NischitTest10method2(null,null);}
for(int i = 0; i < 17; i++){
 var0 = (int)((((var0%(int)(2614))/(int)(1075))/(int)(1367))+(f2[2]-f2[0]));
}
return (String)"vnlivalgjhtctbmgvpmzdammckyftasulsbtlgezdttwttsxtxkfirsyhjlqptkdibbkmanfeezkmmxpgoujcfvsattfyyjcdmy";

}

public Object NischitTest10method1(long var0, NischitTest5 var1){
 for(int i = 0; i < 46; i++){
 f3 = (long)((var0*(long)(418))*(var0*(long)(3322)));
}
if(((f3+(long)(2738))>=(f3/(long)(1480)))){
f3 = (long)(var0-(long)(40));
}
else{
 var1 = new NischitTest5();
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
if(((var0*(long)(1174))==(var0-(long)(3004)))){
System.out.println("NischitTest10 - NischitTest10method1- LineInMethod: 14");
}
else{
 System.out.println("NischitTest10 - NischitTest10method1- LineInMethod: 18");
}
if(((f3%(long)(765))<(var0-(long)(2388)))){
System.out.println("NischitTest10 - NischitTest10method1- LineInMethod: 25");
}
else{
 System.out.println("NischitTest10 - NischitTest10method1- LineInMethod: 30");
}
if( ((f3/(long)(536))==((f3-(long)(1793))*(f3%(long)(2747))))){
if( ((var0*(long)(3300))<=((var0-(long)(2345))+(((var0/(long)(1985))%(long)(1916))%(long)(2624))))){
if( (((f3-(long)(792))<=((var0+(long)(2521))*(var0/(long)(1589))))&&(((f3-(long)(900))+(f3+(long)(2274)))>=(var0*(long)(1434))))){
if( (((f3*(long)(3074))/(long)(3125))<=(var0+(long)(781)))){
f3 = (long)((var0*(long)(2872))-(var0-(long)(3064)));
}
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
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Intel\\Logs\\__UIC__RUGRAT__hXzAJ.txt"));
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
bufferedWriter.write("Writing line 61 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 62 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 63 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 64 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 65 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 66 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 67 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 68 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 69 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 70 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 71 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 72 to file");
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
bufferedWriter.append("C:\\Intel\\Logs\\__UIC__RUGRAT__hXzAJ.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (Object)var1;

}

public static long NischitTest10method2(NischitTest14 var0, NischitTest6 var1){
 return (long)(long)(838);

}

public static Object NischitTest10method3(NischitTest12 var0, long var1){
 for(int i = 0; i < 23; i++){
 if( (((var1-(long)(1686))<=(var1/(long)(1369)))&&((var1-(long)(3168))>=(var1-(long)(1845))))){
if( ((var1%(long)(534))==(var1+(long)(1932)))){
if( ((var1/(long)(2964))<=(var1-(long)(3275)))){
System.out.println("NischitTest10 - NischitTest10method3- LineInMethod: 8");
}
}
}
}
if((((var1-(long)(1235))>(var1/(long)(2906)))&&((var1-(long)(1953))!=((var1*(long)(3108))*(((var1+(long)(2516))-((var1+(long)(1126))*((var1+(long)(546))%(long)(1698))))/(long)(1399)))))){
var1 = (long)(2372);
}
else{
 System.out.println("NischitTest10 - NischitTest10method3- LineInMethod: 13");
}
if(((var1+(long)(1081))!=(var1+(long)(740)))){
f2[8] = (int)((int)(1019)-(int)(1799));
}
else{
 var1 = (long)((var1*(long)(3286))/(long)(2780));
}
for(int i = 0; i < 30; i++){
 System.out.println("NischitTest10 - NischitTest10method3- LineInMethod: 25");
}
for(int i = 0; i < 47; i++){
 if( ((var1+(long)(1355))<=(var1-(long)(1178)))){
if( ((var1*(long)(3423))==(var1*(long)(135)))){
if( ((var1-(long)(2513))!=(var1-(long)(643)))){
var1 = (long)(2104);
}
}
}
}
return (Object)var0;

}

public static String NischitTest10method4(long var0, NischitTest5 var1){
 for(int i = 0; i < 19; i++){
 var0 = (long)(1601);
}
if( (((var0+(long)(38))==(var0+(long)(3390)))&&((var0-(long)(1608))!=(var0/(long)(1063))))){
if( (((var0+(long)(922))+(var0*(long)(665)))>((var0/(long)(1161))*(var0-(long)(2333))))){
if( ((var0+(long)(2710))>(var0*(long)(651)))){
f4[0] = (String)(("imwoyccwiuhgxyzfztugozwgmffshpsreykp"+"ogclgbfurkccnsngwwktqpboeavtzxh")+("chzlwmqdewmvgmhtglztawhktqfyxzsmmzulnavnluehwndaseogkdwgtxnp"+"esalqisdyocidkugwnwz"));
}
}
}
if((((var0*(long)(1070))*(var0-(long)(872)))!=(var0+(long)(1291)))){
System.out.println("NischitTest10 - NischitTest10method4- LineInMethod: 13");
}
else{
 System.out.println("NischitTest10 - NischitTest10method4- LineInMethod: 15");
}
if(((var0+(long)(2767))>(var0/(long)(567)))){
var0 = (long)(150);
}
else{
 var0 = (long)(3175);
}
for(int i = 0; i < 29; i++){
 if( ((((var0*(long)(3296))>=(var0*(long)(1254)))&&((var0+(long)(1739))<=(var0/(long)(900))))&&((var0*(long)(941))==(((var0-(long)(1665))%(long)(137))-(var0+(long)(1203)))))){
if( ((var0-(long)(2064))==(var0-(long)(529)))){
if( ((var0+(long)(1036))>(var0/(long)(345)))){
if( ((var0+(long)(2764))==(var0/(long)(2494)))){
System.out.println("NischitTest10 - NischitTest10method4- LineInMethod: 30");
}
}
}
}
}
if(((var0-(long)(728))>(((var0/(long)(1234))*(var0+(long)(1209)))+(var0*(long)(2601))))){
var0 = (long)(1478);
}
else{
 f4[0] = (String)((("yqksucgjoagriyjamxknensccpmlwydnmxmmxjfqywxrzmqyrlbkvcddpgdacybsviswunokvbvwrgfyoqadecgegcotjgmkyye"+"avniawycnlookxjvcraxlwuzokpioqvtpavojbydzfyniklylafggyjiazncgddwltrbdnbncthdawtgmfcdyhd")+("btmcqmibhowshbqmgdbzfsazldlbwbhnvladbpntyvhroiwstfzzkroabirhhbqvrexiqxehmlyuafagugrzqrkxksqb"+"dyfqmatufthqrbzgueaunhwdcvzfyiwpotexwzjvzmbaxwj"))+("dxucdwgalqcsfzqkyvapabmgixjkxakojrmgqhtohpzpbheadsazpk"+"gblvbdxkifwqcmvqcrqclsyeapmzdjrwttyqgghkpycfcgiultfutgvggbrmislpqgenvvfogqqgrfynrthbnaddyecwfdnpng"));
}
if( ((var0*(long)(672))>=(var0*(long)(2394)))){
System.out.println("NischitTest10 - NischitTest10method4- LineInMethod: 40");
}
if( (((var0*(long)(1553))%(long)(2556))<(var0/(long)(2897)))){
f0[2] = (int)((int)(1574)+(int)(2588));
}
if(((var0+(long)(2610))<(var0+(long)(2299)))){
var0 = (long)(2653);
}
else{
 System.out.println("NischitTest10 - NischitTest10method4- LineInMethod: 49");
}
return (String)"djgchmricpjgnltlpqiprqjfuxjahgktocgopjxzmncqyxvvmstbalummxxzhhyaecudkowvhlejiexoxrhzkdlajjgomcyfhrxi";

}


public static void main(String args[]){
NischitTest10 obj = new NischitTest10();
NischitTest10method0((int)(719),(long)(927));
obj.NischitTest10method1((long)(2337),new NischitTest5());
NischitTest10method2(new NischitTest14(),new NischitTest6());
NischitTest10method3(new NischitTest12(),(long)(1162));
NischitTest10method4((long)(2324),new NischitTest5());
}

}