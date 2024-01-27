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


public class NischitTest5 implements NischitTestInterface1 {
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
int f0;
static int f1;
static int f2;
static NischitTest3[] f3= new NischitTest3[25];
static NischitTest3 f4;
static String[] f5= new String[20];


public String NischitTestInterface1Method0(int var0, String var1, NischitTest3 var2){
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
bufferedReader= new BufferedReader(new FileReader(getNextFile("C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\log.txt","C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\config.xml")));
String line = null;
while((line = bufferedReader.readLine()) != null){
System.out.println("Read line = " + line );
}
}
catch(Exception e){
e.printStackTrace();
}
for(int i = 0; i < 15; i++){
 var1 = (String)((var1+"cyxaejmgzyzdvgplnxxqxpjyrhoryvnowlc")+(var1+"gnenmollcduzwiezvzwyrveldu"));
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
bufferedWriter= new BufferedWriter(new FileWriter("C:\\WORK\\College of Pharmacy\\_no_task\\__UIC__RUGRAT__efout.txt"));
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
bufferedWriter.append("C:\\WORK\\College of Pharmacy\\_no_task\\__UIC__RUGRAT__efout.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (String)var1;

}

public Object NischitTest5method0(NischitTest3 var0, String var1){
 try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Users\\Ramya\\__UIC__RUGRAT__KTHt2nILL.txt"));
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
bufferedWriter.append("C:\\Users\\Ramya\\__UIC__RUGRAT__KTHt2nILL.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (Object)var0;

}

public static String NischitTest5method1(String var0, NischitTest5 var1){
 final NischitTest0 obj_NischitTest0 = new NischitTest0() ;
Thread th11= new Thread(obj_NischitTest0,"th11"){
public void run() { 
 long rv0= obj_NischitTest0.NischitTest0method7(var0,(long)(1013));
Object rv1= obj_NischitTest0.NischitTest0method1(var0,(long)(812),null);
long rv2= obj_NischitTest0.NischitTest0method7(var0,(long)(838));
long rv3= obj_NischitTest0.NischitTest0method12((int)(212),var0);
long rv4= obj_NischitTest0.NischitTest0method6(null,var0);
int rv5= obj_NischitTest0.NischitTest0method10((int)(1825),(long)(83));

 }.start() ;
Thread th12= new Thread(obj_NischitTest0,"th12"){
public void run() { 
 String rv0= obj_NischitTest0.NischitTest0method11(var0,var0,(int)(2157));
Object rv1= obj_NischitTest0.NischitTest0method18((int)(3246),var0,(int)(332),null);
long rv2= obj_NischitTest0.NischitTest0method7(var0,(long)(1082));
String rv3= obj_NischitTest0.NischitTest0method5((long)(3296),(long)(1395));
int rv4= obj_NischitTest0.NischitTest0method2(var0,null,(int)(2494),var0);
long rv5= obj_NischitTest0.NischitTest0method7(var0,(long)(3234));

 }.start() ;
if( (((((f5[9]+f5[7])+(f5[13]+f5[18]))+(f5[0]+f5[4]))==(var0+"jeuiabqiwzktkgyiafpuytvimcbufjslmtfuydylgmfppnhqgcauzvlhsxdvxyuyzjabyejtaysdaz"))&&((var0+"vmueajdbnrvivkalepcfyabedjhvktxvkxyyyacvqnpihhyridgyindjlbubjiqyjttblchzqipdkzlqkhduiepp")!=(f5[1]+f5[4])))){
if( ((var0+"oagpbnnktfvaevxfjjjwnypywzuspiztoasqafxxchdoymtksvgxwcgpcdunggmcmiviec")!=(var0+"ahcoatpsaexqtnpyjxrrhbmrodgkzbdtcu"))){
if( ((var0+"surkbr")!=(var0+"vptveerjmkarkvjtifrjxcghncozwuxlas"))){
System.out.println("NischitTest5 - NischitTest5method1- LineInMethod: 6");
}
}
}
return (String)var0;

}

public long NischitTest5method2(long var0, NischitTest0 var1){
 if(((var0/(long)(820))!=(var0+(long)(1495)))){
f0 = (int)(((int)(3015)+(int)(1078))+((int)(1949)%(int)(3218)));
}
else{
 var0 = NischitTest5method8(null,null,null);
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
if( ((var0-(long)(2456))!=(var0-(long)(3242)))){
if( (((var0*(long)(494))>(var0-(long)(512)))||((var0-(long)(3216))<(var0-(long)(27))))){
if( ((((var0%(long)(2314))+(var0*(long)(3152)))+(var0%(long)(1515)))<((var0-(long)(2672))*(var0-(long)(2209))))){
if( (((var0%(long)(2714))+(var0+(long)(633)))!=(var0%(long)(3196)))){
if( ((((var0%(long)(1507))%(long)(1915))-(var0*(long)(3345)))==(var0-(long)(1951)))){
if( (((var0-(long)(2937))<=(var0+(long)(3003)))||((((var0*(long)(1345))+(var0-(long)(3276)))-(var0-(long)(709)))==(var0+(long)(1442))))){
var0 = NischitTest5method8(null,null,null);
}
}
}
}
}
}
if((((var0*(long)(2329))<=(var0/(long)(1620)))&&((var0+(long)(2584))!=(var0+(long)(1916))))){
var0 = (long)((var0%(long)(1749))-(var0%(long)(1629)));
}
else{
 var0 = NischitTest5method8(null,null,null);
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Users\\Public\\Pictures\\__UIC__RUGRAT__cbnDe.txt"));
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
bufferedWriter.append("C:\\Users\\Public\\Pictures\\__UIC__RUGRAT__cbnDe.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (long)var0;

}

public static String NischitTest5method3(long var0, int var1){
 switch((var1+(int)(2145))){
case 0:
System.out.println("NischitTest5 - NischitTest5method3- LineInMethod: 2");
 break;
case 1:
f2 = (int)(var1-(int)(385));
 break;
case 2:
var0 = (long)(((var0+(long)(1550))*(var0-(long)(1107)))-(var0*(long)(1416)));
 break;
default :
System.out.println("NischitTest5 - NischitTest5method3- LineInMethod: 14");
}
final NischitTest1 obj_NischitTest1 = new NischitTest1() ;
Thread th13= new Thread(obj_NischitTest1,"th13"){
public void run() { 
 long rv0= obj_NischitTest1.NischitTest1method4("rcndnrbengolfwyjvnladfwtgfrvrjanvoorrkpsmassyelbiewcobrtcqanbmuxyldlgfwjhzjyhylmdjmbtuahcwnarezu",var1,var1,"hlsixcwypjvxomdixhnaxwgkzgtvxidohumegdkpwjgynrwjfxvwftlfvfcjdjpbacyqhscclk");
Object rv1= obj_NischitTest1.NischitTest1method2(var1,var1);
int rv2= obj_NischitTest1.NischitTest1method0(var0,var0);
long rv3= obj_NischitTest1.NischitTest1method4("lejpshichbjzgrzjncvqjdarzsdpbhsxfdlbrmlmvyfzprnlnnn",var1,var1,"rhzkimndtrgpucuekbhrikdvgrlayggqguavhcnzgotygmduhbqevezdcaknikgwstpyhqmxjtdcdxgnenlejpfi");

 }.start() ;
Thread th14= new Thread(obj_NischitTest1,"th14"){
public void run() { 
 String rv0= obj_NischitTest1.NischitTest1method8(null,var1);
long rv1= obj_NischitTest1.NischitTest1method7(var0,null,var1);
Object rv2= obj_NischitTest1.NischitTest1method2(var1,var1);
long rv3= obj_NischitTest1.NischitTest1method6("tzurcesamonnjkykdtvxqjhjmnmweuxfpbxtbbzbtlcklvuowushpkbixhifvqspghxfysnhkeueblpmmnlxd",var1);
long rv4= obj_NischitTest1.NischitTest1method4("zretgzlzpfewmyolbikbuovmyxjdvihnalhnltvgsvhpobpisxvftnniwhdujjwtfqpmbhbxtihxmqjtgngnri",var1,var1,"mo");

 }.start() ;
for(int i = 0; i < 92; i++){
 if( ((var0*(long)(1402))==(var0+(long)(1752)))){
System.out.println("NischitTest5 - NischitTest5method3- LineInMethod: 22");
}
}
if(((f1+(int)(972))<=(var1+(int)(2448)))){
NischitTest5method6(var0,var0);}
else{
 var1 = (int)(var1/(int)(698));
}
for(int i = 0; i < 13; i++){
 f1 = (int)((var1-(int)(194))%(int)(3009));
}
final NischitTest3 obj_NischitTest3 = new NischitTest3() ;
Thread th15= new Thread(obj_NischitTest3,"th15"){
public void run() { 
 String rv0= obj_NischitTest3.NischitTest3method2(var0,null);
int rv1= obj_NischitTest3.NischitTest3method1(null,var1);
String rv2= obj_NischitTest3.NischitTest3method5(null,var0);
String rv3= obj_NischitTest3.NischitTest3method9("lseejmpcllphahsupbjckevsedvqzdxxpvtsnzlsftyfkdrvidpbgcpdwupsdgevhuugttpjrmemwvzjcyqa",var0);
String rv4= obj_NischitTest3.NischitTest3method11(var1,"plnwaugjmbszoamcleqchugcdwrkneaucqqacridpmhgixrjwasnhhajfoyosfolndqkcsgxakiqwunwvyhiu","cbubdahodimsnkcswlyxgvpnqvoji");

 }.start() ;
Thread th16= new Thread(obj_NischitTest3,"th16"){
public void run() { 
 Object rv0= obj_NischitTest3.NischitTest3method0(null,var1);
String rv1= obj_NischitTest3.NischitTest3method10(var1,var1);
String rv2= obj_NischitTest3.NischitTest3method2(var0,null);
long rv3= obj_NischitTest3.NischitTest3method8(var1,var1,"cvpfxnswqktyvpfudwrxefynmqgpbujfvefy");
long rv4= obj_NischitTest3.NischitTest3method8(var1,var1,"hozqnayrlvnfstgsjpuvm");

 }.start() ;
switch((var1+f2)){
case 0:
var1 = (int)((var1+(int)(504))*((var1%(int)(3274))%(int)(651)));
 break;
case 1:
System.out.println("NischitTest5 - NischitTest5method3- LineInMethod: 38");
 break;
case 2:
var1 = (int)((var1*(int)(1219))-((f2+(int)(3327))-(f1*(int)(110))));
 break;
case 3:
System.out.println("NischitTest5 - NischitTest5method3- LineInMethod: 44");
 break;
default :
NischitTest5method6(var0,var0);}
return (String)"tioypkyorwacurbjrbzyujxlyzav";

}

public int NischitTest5method4(String var0, long var1, String var2, String var3){
 try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\__UIC__RUGRAT__Dqdpa.txt"));
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
bufferedWriter.append("C:\\__UIC__RUGRAT__Dqdpa.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (int)(int)(2104);

}

public static String NischitTest5method5(String var0, long var1){
 return (String)var0;

}

public static int NischitTest5method6(long var0, long var1){
 for(int i = 0; i < 44; i++){
 System.out.println("NischitTest5 - NischitTest5method6- LineInMethod: 2");
}
for(int i = 0; i < 73; i++){
 var1 = (long)((var1-(long)(140))*(var0+var1));
}
if((((var1*(long)(1655))+(var1%(long)(219)))<=(var1*(long)(3410)))){
f1 = (int)((int)(1370)+(int)(2160));
}
else{
 System.out.println("NischitTest5 - NischitTest5method6- LineInMethod: 13");
}
if(((var1+(long)(2611))<=(var1+(long)(2947)))){
var1 = (long)((var1/(long)(114))+(var0/(long)(1368)));
}
else{
 System.out.println("NischitTest5 - NischitTest5method6- LineInMethod: 23");
}
if( ((var0-var1)>(var1*var0))){
if( ((var0+(long)(674))<=(var1%(long)(1019)))){
if( (((var0+var1)/(long)(2324))<=(var1%(long)(406)))){
if( ((var0%(long)(2422))<=(var0*var1))){
if( ((var1*(long)(2863))>(var0+(long)(3406)))){
System.out.println("NischitTest5 - NischitTest5method6- LineInMethod: 36");
}
}
}
}
}
if( ((var0+(long)(254))<=(var1/(long)(3188)))){
if( ((var1+(long)(678))<(var0/(long)(2866)))){
System.out.println("NischitTest5 - NischitTest5method6- LineInMethod: 45");
}
}
return (int)(int)(1367);

}

public String NischitTest5method7(int var0, long var1, NischitTest6 var2, NischitTest2 var3){
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
bufferedReader= new BufferedReader(new FileReader(getNextFile("C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\log.txt","C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\config.xml")));
String line = null;
while((line = bufferedReader.readLine()) != null){
System.out.println("Read line = " + line );
}
}
catch(Exception e){
e.printStackTrace();
}
if(((var1*(long)(1761))==(var1*(long)(1200)))){
var0 = (int)((var0+(int)(997))+(var0+(int)(906)));
}
else{
 System.out.println("NischitTest5 - NischitTest5method7- LineInMethod: 5");
}
if( ((((var0+(int)(1388))-(var0/(int)(2240)))<=(var0-(int)(173)))&&((var0-(int)(2289))<(f0-(int)(78))))){
if( ((var1*(long)(2630))>((var1/(long)(2274))%(long)(2290)))){
System.out.println("NischitTest5 - NischitTest5method7- LineInMethod: 12");
}
}
switch((var0+(int)(2454))){
case 0:
var1 = (long)(2520);
 break;
case 1:
System.out.println("NischitTest5 - NischitTest5method7- LineInMethod: 19");
 break;
case 2:
var0 = NischitTest5method10(var0,"sskprjhljkhltraecupboosgqpxhhutahrkvvjpikslan",var1);
 break;
case 3:
System.out.println("NischitTest5 - NischitTest5method7- LineInMethod: 27");
 break;
case 4:
System.out.println("NischitTest5 - NischitTest5method7- LineInMethod: 32");
 break;
case 5:
f0 = (int)((f0+(int)(1547))*(var0%(int)(3391)));
 break;
case 6:
var2 = new NischitTest6();
 break;
case 7:
var1 = (long)((var1*(long)(1530))-((var1*(long)(2234))*(var1+(long)(748))));
 break;
default :
var1 = NischitTest5method8(null,null,null);
}
return (String)"nywahearnodfiannamhiwjnzutcfhhi";

}

public static long NischitTest5method8(NischitTest7 var0, NischitTest7 var1, NischitTest1 var2){
 System.out.println("NischitTest5 - NischitTest5method8- LineInMethod: 21");
for(int i = 0; i < 80; i++){
 System.out.println("NischitTest5 - NischitTest5method8- LineInMethod: 33");
}
for(int i = 0; i < 61; i++){
 System.out.println("NischitTest5 - NischitTest5method8- LineInMethod: 36");
}
System.out.println("NischitTest5 - NischitTest5method8- LineInMethod: 47");
return (long)(long)(232);

}

public static Object NischitTest5method9(String var0, int var1, String var2, int var3){
 for(int i = 0; i < 37; i++){
 if( (((var0+"pwhrnhezwfomslgvqlwitcaolghiuzhlvbkklxuabmfdheyrwwppwkwhxhzqwetwgcklkffnt")==((var2+"pqugmtigyxyqllmnieguwjlzwtlwtwmusjdufycsevybcszalgwadbmaceimolxohjcbmpeqtfrmzvarumknohrltrj")+(var0+var2)))||((f5[4]+f5[18])==(var2+var0)))){
f4 = new NischitTest3();
}
}
switch((var1*f1)){
case 0:
System.out.println("NischitTest5 - NischitTest5method9- LineInMethod: 7");
 break;
case 1:
System.out.println("NischitTest5 - NischitTest5method9- LineInMethod: 10");
 break;
case 2:
var2 = "wpoaqzguulhjbuxnkgssttszchylhegmjpctyfxnvtxtluhrxpgqnulaxhcwjfhaopewnuixvsfjhxtr";
 break;
case 3:
var2 = (String)((f5[14]+f5[0])+(var2+"ismxqknpv"));
 break;
default :
var3 = (int)(2991);
}
if(((var1%(int)(89))!=(var1*var3))){
var1 = (int)((var3+var1)%(int)(2954));
}
else{
 System.out.println("NischitTest5 - NischitTest5method9- LineInMethod: 23");
}
return (Object)null;

}

public static int NischitTest5method10(int var0, String var1, long var2){
 return (int)var0;

}

public int NischitTest5method11(int var0, long var1, int var2, int var3){
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
if( ((var1-(long)(121))!=(var1+(long)(2463)))){
f0 = (int)((f0-(int)(1179))+(f0/(int)(221)));
}
for(int i = 0; i < 54; i++){
 if( ((var2*(int)(1889))!=(f0-(int)(1378)))){
if( ((var1-(long)(2406))<=(var1-(long)(2698)))){
System.out.println("NischitTest5 - NischitTest5method11- LineInMethod: 9");
}
}
}
for(int i = 0; i < 65; i++){
 if( (((var0+(int)(1706))<(var2+var0))&&(((var0-var3)+(var2*var3))<=(var2-var0)))){
var1 = (long)(1882);
}
}
for(int i = 0; i < 46; i++){
 if( (((var1*(long)(1869))>((var1*(long)(188))+(var1/(long)(437))))&&((var1/(long)(2795))!=(var1/(long)(1639))))){
f0 = (int)(((f0-(int)(3047))+(f0+(int)(903)))%(int)(857));
}
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\CCP4\\__UIC__RUGRAT__mDfU3Y5bE.txt"));
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
bufferedWriter.append("C:\\CCP4\\__UIC__RUGRAT__mDfU3Y5bE.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (int)var3;

}

public static Object NischitTest5method12(String var0, NischitTest5 var1, String var2){
 if(((var0+"acrhotxhdjhgowdhgatiqawaceimhqdvjgairmtcbusaubcklzxavehptumqegjcgffyckfzdukochdqbztpqlvgjswqmqxgnhrp")!=(var2+var0))){
var2 = "cwdfxucdrxlispxfrhscwmiqtrqgapwnuusosmqajosilqsgxigiwjvajmxnpmgmrqywpgfakabjnroewuwiyqaitqsrltobmbxe";
}
else{
 System.out.println("NischitTest5 - NischitTest5method12- LineInMethod: 4");
}
if(((f5[16]+f5[19])!=(var2+"thujxejjddtpcwxzdllzqnpp"))){
var0 = (String)(((var2+var0)+(var0+"pmmsnbvaalbviurlgiisgsxpervlvonnhvifaglontahetehhfhsydlkhyxokgkayeclayerdwon"))+(var2+"usnoaojbshuloriujfjmzwgpoagltinamfbtfvn"));
}
else{
 var2 = (String)((f5[15]+f5[19])+(var0+"zbbmafbvqeoheglmggcgqrvoyrbpxlyudhncoehdecmqiviaqdovptqesxiobkuoabwisxovyfjdmruouhghcv"));
}
if( (((f5[19]+"oawlins")!=(f5[17]+f5[9]))&&((var2+"eociehfkkvrbtlarkmzsoexqbkfjylobfntdlokvwpwhmlfv")!=(f5[15]+f5[17])))){
System.out.println("NischitTest5 - NischitTest5method12- LineInMethod: 15");
}
for(int i = 0; i < 70; i++){
 if( ((var2+var0)==(var0+var2))){
f1 = (int)((f2%(int)(3223))/(int)(2248));
}
}
for(int i = 0; i < 66; i++){
 var1 = new NischitTest5();
}
if((((var0+var2)==(var2+"itcqtftimitcdimdtjxgfvvpdzjeajii"))&&(((var0+"fkxnycythelslkvaaidfpvqvhnhwotnapsrs")==(var0+var2))||(((var2+var0)+"voxbtpxutlrqazjxolszztmdzkrlayqk")!=(var2+"hqxgcretpzmoayljpnwheiqsckqoljqgotdnxgupubabwxxkbpwilferuxbafgejakopocwjspaivqctdlqljlknzzbtojrtp"))))){
var1 = new NischitTest5();
}
else{
 System.out.println("NischitTest5 - NischitTest5method12- LineInMethod: 32");
}
return (Object)var1;

}


public static void main(String args[]){
NischitTest5 obj = new NischitTest5();
obj.NischitTestInterface1Method0((int)(469),"pfshqkmtwmmncxmjdqviruwwdnuupjrndikkiifvlgaadylwvmgbrvgmuwpmks",new NischitTest3());
obj.NischitTest5method0(new NischitTest3(),"meeyecofyidrwmmzozvoehmuubxladcbomwkgewuifudqkxvwyoebmscalxxblmejhdx");
NischitTest5method1("nwcvwbxsnqmlwpjoscvsfsgfoyagdzxbqcxfgkrpclmzxsczkrltipcpqdjzrtutaoukftjh",new NischitTest5());
obj.NischitTest5method2((long)(2875),new NischitTest0());
NischitTest5method3((long)(1118),(int)(3101));
obj.NischitTest5method4("ylhwldbdbrrehqpqtprqgaxbbsnknrqpqjudcbcmsxeslpgjyubqycmxytcrkdefeifewybuwvvgegbvyjwnnbhqaalbfxvcow",(long)(1217),"qlccltfchgpdwxtrtsamwthksfl","agsczrffgtommnecpbpemzxjcugoxjftrtcpsijgkbfdbweambxkxaahubbzayoobpdpvfiqaizfmyevqnaljrcnvpeeioahnxb");
NischitTest5method5("okqpvyintojtrulnamzaqlgixpioaunftubolakxwvqwawq",(long)(2825));
NischitTest5method6((long)(584),(long)(686));
obj.NischitTest5method7((int)(2663),(long)(382),new NischitTest6(),new NischitTest2());
NischitTest5method8(new NischitTest7(),new NischitTest7(),new NischitTest1());
NischitTest5method9("urjsorjzjsztgkzgqioqbhcgsjmkdinrvhoudgoqy",(int)(2784),"vjxuciphyyxzmskswemntahjppgzlonsvj",(int)(30));
NischitTest5method10((int)(3313),"ralvidawezghtoxitqufi",(long)(596));
obj.NischitTest5method11((int)(3113),(long)(2230),(int)(1190),(int)(483));
NischitTest5method12("xmwyvndrrntzkq",new NischitTest5(),"dyoishqswsjuqwwgwhwejrqhcchgaodck");
}

}