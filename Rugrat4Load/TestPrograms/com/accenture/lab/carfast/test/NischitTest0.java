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


public class NischitTest0 implements Runnable  {
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
NischitTest0 f0;
static long f1;
static int f2;
static int[] f3= new int[17];
int f4;
static int[] f5= new int[18];
long f6;


public static Object NischitTest0method0(int var0, NischitTest3 var1, long var2, String var3){
 synchronized(this){
switch((var0%(int)(718))){
case 0:
System.out.println("NischitTest0 - NischitTest0method0- LineInMethod: 2");
 break;
case 1:
var3 = (String)(var3+"gyliemocuebnqidztbpqmwac");
 break;
case 2:
f5[0] = (int)(var0%(int)(2190));
 break;
case 3:
var3 = NischitTest0method11(var3,var3,var0);
 break;
case 4:
var0 = (int)((var0+(int)(2234))-(var0*(int)(3372)));
 break;
case 5:
var2 = (long)(((var2*(long)(2950))+(var2+(long)(1596)))/(long)(1748));
 break;
default :
var1 = new NischitTest3();
}

 }
final NischitTest1 obj_NischitTest1 = new NischitTest1() ;
Thread th0= new Thread(obj_NischitTest1,"th0"){
public void run() { 
 long rv0= obj_NischitTest1.NischitTest1method12(var2,var0,var2,var0);
long rv1= obj_NischitTest1.NischitTest1method12(var2,var0,var2,var0);
String rv2= obj_NischitTest1.NischitTest1method8(null,var0);
String rv3= obj_NischitTest1.NischitTest1method5(var3,var2);
Object rv4= obj_NischitTest1.NischitTest1method2(var0,var0);
int rv5= obj_NischitTest1.NischitTest1method0(var2,var2);

 }.start() ;
if( ((var2*(long)(2147))<=(f1%(long)(1526)))){
if( ((var0*(int)(3188))>(var0+(int)(214)))){
if( (((var0-(int)(3425))-(var0-(int)(2439)))>=(var0+(int)(2704)))){
if( ((var3+"pykkkzwbklur")==(var3+"wr"))){
if( ((var0*(int)(988))<(f2*(int)(980)))){
System.out.println("NischitTest0 - NischitTest0method0- LineInMethod: 35");
}
}
}
}
}
return (Object)var1;

}

public Object NischitTest0method1(String var0, long var1, NischitTest3 var2){
 final NischitTest3 obj_NischitTest3 = new NischitTest3() ;
Thread th1= new Thread(obj_NischitTest3,"th1"){
public void run() { 
 String rv0= obj_NischitTest3.NischitTest3method12(null,var1);
String rv1= obj_NischitTest3.NischitTest3method5(null,var1);
int rv2= obj_NischitTest3.NischitTest3method7(var1,var1);
String rv3= obj_NischitTest3.NischitTest3method2(var1,null);
String rv4= obj_NischitTest3.NischitTest3method10((int)(192),(int)(92));

 }.start() ;
Thread th2= new Thread(obj_NischitTest3,"th2"){
public void run() { 
 String rv0= obj_NischitTest3.NischitTest3method10((int)(279),(int)(857));
String rv1= obj_NischitTest3.NischitTest3method2(var1,null);
int rv2= obj_NischitTest3.NischitTest3method1(null,(int)(379));
int rv3= obj_NischitTest3.NischitTest3method1(null,(int)(2710));
String rv4= obj_NischitTest3.NischitTest3method5(null,var1);
String rv5= obj_NischitTest3.NischitTest3method11((int)(138),var0,var0);

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
synchronized(this){
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\__UIC__RUGRAT__JRteZ.txt"));
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
bufferedWriter.append("C:\\__UIC__RUGRAT__JRteZ.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}

 }
return (Object)var2;

}

public static int NischitTest0method2(String var0, NischitTest0 var1, int var2, String var3){
 switch((var2*(int)(1080))){
case 0:
var0 = NischitTest0method8(var2,var2,var0,var0);
 break;
case 1:
System.out.println("NischitTest0 - NischitTest0method2- LineInMethod: 5");
 break;
case 2:
System.out.println("NischitTest0 - NischitTest0method2- LineInMethod: 10");
 break;
case 3:
NischitTest0method12(var2,var0); break;
case 4:
var1 = new NischitTest0();
 break;
case 5:
System.out.println("NischitTest0 - NischitTest0method2- LineInMethod: 20");
 break;
case 6:
NischitTest0method6(null,var0); break;
case 7:
System.out.println("NischitTest0 - NischitTest0method2- LineInMethod: 28");
 break;
default :
f2 = (int)(var2+(int)(2368));
}
return (int)var2;

}

public static int NischitTest0method3(long var0, int var1, NischitTest0 var2, String var3){
 return (int)var1;

}

public long NischitTest0method4(int var0, int var1){
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
if(((var0-(int)(1372))>(var1%(int)(1232)))){
System.out.println("NischitTest0 - NischitTest0method4- LineInMethod: 4");
}
else{
 NischitTest0method14(null,null);}
synchronized(this){
if((((var0*(int)(986))+(var1-var0))!=(var0+(int)(2701)))){
var0 = NischitTest0method9("ojhghzlppxqentgcqcqdzciapbpyoxbplhgnpfexywcvrnybrsxftpeztfwbajyqqvubjrsjsbeigmwsjlnliyeehwngkhrbe",(long)(1025));
}
else{
 System.out.println("NischitTest0 - NischitTest0method4- LineInMethod: 12");
}

 }
if((((f4/(int)(2198))+(f4-(int)(37)))!=(var0+var1))){
var1 = NischitTest0method10(var1,(long)(1236));
}
else{
 var0 = (int)((var1+(int)(1030))%(int)(2476));
}
switch((var1%(int)(2703))){
case 0:
NischitTest0method18(var1,"irynxvmnjpcweoiooezrqryburfcapkkwngppqnwrykombwuolhroyxkvnm",var0,null); break;
case 1:
var1 = (int)((var0-var1)/(int)(2345));
 break;
case 2:
var0 = (int)(2818);
 break;
default :
f6 = (long)((f6+(long)(2653))%(long)(68));
}
return (long)(long)(410);

}

public String NischitTest0method5(long var0, long var1){
 synchronized(this){
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Program Files (x86)\\MSBuild\\Microsoft\\Windows Workflow Foundation\\__UIC__RUGRAT__4jBY5.txt"));
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
bufferedWriter.append("C:\\Program Files (x86)\\MSBuild\\Microsoft\\Windows Workflow Foundation\\__UIC__RUGRAT__4jBY5.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}

 }
return (String)"qtypphdoxgyxabmblaryatodworehvcdnnmcuhpkwzaejouqfbblanwiywbtzkvobpjfyixhglqccieinui";

}

public static long NischitTest0method6(NischitTest7 var0, String var1){
 synchronized(this){

 }
return (long)(long)(3423);

}

public long NischitTest0method7(String var0, long var1){
 synchronized(this){
if(((((var1*(long)(1583))*(var1/(long)(1009)))%(long)(2965))>(f6-(long)(1748)))){
NischitTest0method10((int)(1067),var1);}
else{
 System.out.println("NischitTest0 - NischitTest0method7- LineInMethod: 5");
}

 }
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Program Files\\__UIC__RUGRAT__wFadbxZvbk.txt"));
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
bufferedWriter.append("C:\\Program Files\\__UIC__RUGRAT__wFadbxZvbk.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (long)var1;

}

public static String NischitTest0method8(int var0, int var1, String var2, String var3){
 switch((var0%(int)(82))){
case 0:
System.out.println("NischitTest0 - NischitTest0method8- LineInMethod: 2");
 break;
case 1:
System.out.println("NischitTest0 - NischitTest0method8- LineInMethod: 6");
 break;
case 2:
f5[9] = (int)((f5[15]-f2)%(int)(2889));
 break;
case 3:
f1 = (long)(((long)(3070)*(long)(208))+((long)(3397)-(long)(3316)));
 break;
case 4:
NischitTest0method12(var1,var3); break;
case 5:
System.out.println("NischitTest0 - NischitTest0method8- LineInMethod: 22");
 break;
case 6:
System.out.println("NischitTest0 - NischitTest0method8- LineInMethod: 26");
 break;
case 7:
f5[9] = (int)((var1%(int)(1000))+(var0+var1));
 break;
case 8:
System.out.println("NischitTest0 - NischitTest0method8- LineInMethod: 32");
 break;
default :
var2 = NischitTest0method11(var3,var2,var1);
}
return (String)var2;

}

public int NischitTest0method9(String var0, long var1){
 if( (((f6/(long)(205))!=(var1-(long)(2753)))&&((f6-(long)(276))!=((var1-(long)(2365))-(var1/(long)(1825)))))){
System.out.println("NischitTest0 - NischitTest0method9- LineInMethod: 2");
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
bufferedReader= new BufferedReader(new FileReader(getNextFile("C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\log.txt","C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\config.xml")));
String line = null;
while((line = bufferedReader.readLine()) != null){
System.out.println("Read line = " + line );
}
}
catch(Exception e){
e.printStackTrace();
}
if(((var0+"wzxrdmztwyfjvjtfwxuycvcnnkkmhrdkzsdqborffykmubabuaxlzptcbltbhlncoxlavgnoisjcctzfwlty")==(var0+"yewdgdvtdajikutocaqo"))){
f0 = new NischitTest0();
}
else{
 System.out.println("NischitTest0 - NischitTest0method9- LineInMethod: 10");
}
if( ((((var0+"jaoaiujqmvmzendkgyqbrhbwhuktqqmckuaegaaketngindocupxeifnpckkbdvkissxoaugxdvzmccutbfavleyjvbd")+(var0+"ubmhgwkcrpbrvruujrlmuolptxbyxetmwrjwcrmpqivc"))==(var0+"cvkuoobzaznnrbyyetnavcttnlfcrsqthaquwuvfsheplgfqxrfrgktsjpkdmtoxddvzb"))&&(((var0+"spbwjkrlskrzzjfldawqwgjhwwwstpzcsqrhhmaacmubaswprrwjrmduioixbcbztwbobvatolxfaoagrfynre")==(var0+"ekaicbdgjkafdbprllquhckmsbpydncmezjojigmerjibrbahfxgeyggemqczyajdfvpmxmmuwurwuuptm"))&&((var0+"ozqfvniihqzbokrylvwbytljnyoemyqyfmzpakbaavez")==(var0+"zsczaoagqsxnoqogsydagwgeaemqyxdeikigdlsxdkbmbqtrtzzqolktbd"))))){
if( ((var0+"wapwqwndluulliscms")==(((var0+"dghbtteazwkmwgzsdiwblqnailensstehvylhjcwm")+(var0+"httlybibwxrtqqrqwsoxndvviafqidymyjtxglyjwpqblxolemfhkissuoecoiaiawhzlpenvrbipmekrhklzrbput"))+(var0+"kwrknaybjgrrzjiexxxayulcndhkxkfnphldndpxhogrtsepoxmryowuslmycyvvnrxwqxeteljhntfyedzobraysslzod")))){
System.out.println("NischitTest0 - NischitTest0method9- LineInMethod: 16");
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
if(((var1+(long)(1134))<(f6%(long)(3251)))){
f4 = (int)(((int)(27)%(int)(2804))*(f4+(int)(2332)));
}
else{
 var0 = (String)((var0+"ycssmlyxdvwtcanahvwdvkclvbrqxdjmewqufpljkdnuemwfoabnchqaoqcwdoeupwwrozvokizjcnaejcjjcsatgtpb")+(var0+"fkycywxwmuleaqsccuwzeogmdfhsxylxpetcmovsfehnlnsnwwxztrbarh"));
}
synchronized(this){
if(((var0+"kuivycofvylcvtnmgvrlpomuumhomstimtbwibcrizmffvwftvilwgcouesdexhhdlgbgevlywsdyucigdcjwfhfospbxfvz")!=(((var0+"zpnaozwqmzabzagazabdgtkgbvbgofglhznoxwp")+(var0+"jvjuvcfz"))+(var0+"lbqnqab")))){
var1 = (long)(((var1-(long)(858))/(long)(1904))%(long)(446));
}
else{
 f0 = new NischitTest0();
}

 }
for(int i = 0; i < 44; i++){
 if( ((var0+"xbahsrfhxehrmswpgtohbxpabxzdtfjoojzlplvjirqfacxmdljbs")!=(var0+"kbshopnnfxijbohpecchiwhkrqcbglrajed"))){
System.out.println("NischitTest0 - NischitTest0method9- LineInMethod: 34");
}
}
return (int)(int)(3044);

}

public static int NischitTest0method10(int var0, long var1){
 if( (((f3[4]*f2)/(int)(423))>=(var0+(int)(2818)))){
if( ((var0+(int)(2065))>=(var0*(int)(3113)))){
f5[12] = (int)((var0%(int)(2560))+(f5[3]*f2));
}
}
for(int i = 0; i < 76; i++){
 var0 = (int)(var0*(int)(88));
}
switch((var0-f5[9])){
case 0:
System.out.println("NischitTest0 - NischitTest0method10- LineInMethod: 10");
 break;
case 1:
System.out.println("NischitTest0 - NischitTest0method10- LineInMethod: 14");
 break;
case 2:
NischitTest0method12(var0,"elohiwztpsudocuc"); break;
case 3:
var1 = (long)(var1-(long)(553));
 break;
default :
System.out.println("NischitTest0 - NischitTest0method10- LineInMethod: 27");
}
for(int i = 0; i < 33; i++){
 System.out.println("NischitTest0 - NischitTest0method10- LineInMethod: 35");
}
return (int)var0;

}

public static String NischitTest0method11(String var0, String var1, int var2){
 synchronized(this){
for(int i = 0; i < 67; i++){
 var0 = (String)(((var1+var0)+"jmkcjzkqfakphxcayzzebufbilno")+(var0+"kicjftuomnijtpfuqbfdvhlyofjtfvotsvhvkektyoefbuqeqfetvexqzcfeayomxjqhoa"));
}

 }
switch((var2-(int)(2724))){
case 0:
var2 = (int)(var2+(int)(2218));
 break;
case 1:
var0 = (String)((var1+var0)+((var1+var0)+(var0+var1)));
 break;
case 2:
var0 = (String)((var0+var1)+(var0+"cehdprxpnhvuflzlkoshkmlpvzdihzfoydjcvzsgjeixgldwmcrqlhocdwwypvfkdisscxsnibprjbeahtr"));
 break;
case 3:
var1 = "aamxevjvfdiugmdxfdbnwcnzlhgawdhjylnnlxytnmqezehdyabmsypqoeirblnagqrwgxfywqldtkrnksifjgmmjtoyuvnu";
 break;
default :
var0 = (String)(var0+"plesxqcpxwbcgfzemdygelrsapglzuiqsqbxhhrzjeyotr");
}
synchronized(this){

 }
return (String)var0;

}

public static long NischitTest0method12(int var0, String var1){
 switch((var0%(int)(64))){
case 0:
System.out.println("NischitTest0 - NischitTest0method12- LineInMethod: 2");
 break;
case 1:
var1 = (String)((var1+"vlwmt")+((var1+"iukgpsrlcummypqetcfhzzctlubgznprtmjbuiloyhaumqdxnoijaglcumizhpgduupgksqrczpvndevxh")+(var1+"xeqctbsfnhotyvqinmpulwjfkdudmxhdswumjnsm")));
 break;
case 2:
f5[12] = (int)(f2*f3[13]);
 break;
case 3:
f5[1] = (int)((var0+(int)(368))*(var0/(int)(2660)));
 break;
default :
System.out.println("NischitTest0 - NischitTest0method12- LineInMethod: 17");
}
synchronized(this){
for(int i = 0; i < 60; i++){
 f3[8] = (int)((var0%(int)(2868))*(var0+(int)(2418)));
}

 }
synchronized(this){

 }
return (long)(long)(3330);

}

public static long NischitTest0method13(long var0, NischitTest7 var1){
 synchronized(this){

 }
return (long)var0;

}

public long NischitTest0method14(NischitTest5 var0, NischitTest7 var1){
 System.out.println("NischitTest0 - NischitTest0method14- LineInMethod: 10");
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\WORK\\College of Pharmacy\\_no_task\\__UIC__RUGRAT__RzNpF.txt"));
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
bufferedWriter.append("C:\\WORK\\College of Pharmacy\\_no_task\\__UIC__RUGRAT__RzNpF.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (long)(long)(707);

}

public static Object NischitTest0method15(String var0, String var1){
 if( ((var1+"wccmfiqdsffavdiaunqpvxitvcidgbmzzgafudsvehscmlatwvtpsyactawpjzsginwehunplfdmxobljacautygsajihjjlfybor")!=(var1+"tsxgdlsmcidjncmqrmmrhagupxctrqddkvnnprcfpnvifp"))){
if( ((var0+var1)==((var1+"bmxiampimmybedujchjowoodxsdez")+(var0+var1)))){
if( ((var1+var0)==(var0+"yvvmrsozqosrpogqycqsmhlgybpabirczbedqmbpae"))){
if( (((var0+var1)+(var1+var0))==(var1+"pquqokvwiqtvqwmretowjyilwrtfmlxgt"))){
if( ((var0+var1)==(var0+"zgpwoishbkwapyq"))){
var0 = "yooenzmnbwanecgfjsyyzfvsgglxbbvpemddsbyncapmtfnwzhfebjbmgkyyevumluwrkcchagtepftdtjwxtvh";
}
}
}
}
}
return (Object)null;

}

public static int NischitTest0method16(NischitTest3 var0, NischitTest2 var1, String var2){
 for(int i = 0; i < 45; i++){
 var2 = "rgmafczblepesypanuntvdhpkreuiki";
}
return (int)(int)(1265);

}

public String NischitTest0method17(long var0, String var1, long var2){
 synchronized(this){
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\ccp4temp\\__UIC__RUGRAT__MUJd6.txt"));
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
bufferedWriter.write("Writing line 73 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 74 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 75 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 76 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 77 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 78 to file");
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
bufferedWriter.append("C:\\ccp4temp\\__UIC__RUGRAT__MUJd6.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}

 }
return (String)var1;

}

public Object NischitTest0method18(int var0, String var1, int var2, NischitTest4 var3){
 try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Program Files (x86)\\Windows Multimedia Platform\\__UIC__RUGRAT__8nEY8.txt"));
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
String logfile = "C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\log.txt";
bufferedWriter = new BufferedWriter( new java.io.FileWriter( logfile, true ) );
bufferedWriter.append("C:\\Program Files (x86)\\Windows Multimedia Platform\\__UIC__RUGRAT__8nEY8.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (Object)var3;

}


public static void main(String args[]){
NischitTest0 obj = new NischitTest0();
NischitTest0method0((int)(1196),new NischitTest3(),(long)(767),"twjsohobxdecasyxrcelvikwpnautfmkalceddeaieihaafyhyemmatrozqfllsyxmodedkvaribtywvnytktlieuwyd");
obj.NischitTest0method1("luvhzoxxtltaprxzfcsaeyolccdgodnowxwjddvdwiyrarvjsowslysfjzvqxdpmpuwoeeskfgrvmhzonuuhafegiohcadx",(long)(559),new NischitTest3());
NischitTest0method2("dyrodzqvngwjnidnstmihlrbqyekwltxyyrcsqjcnglmrckpvu",new NischitTest0(),(int)(2558),"myqdqhbfjirapjbkosjvdniwjqhxsasgjppezewnhjiazmtzrusdmtzxlvczwnqry");
NischitTest0method3((long)(2607),(int)(574),new NischitTest0(),"ombibe");
obj.NischitTest0method4((int)(3106),(int)(1456));
obj.NischitTest0method5((long)(1463),(long)(250));
NischitTest0method6(new NischitTest7(),"alcsdvxizuqkxxwwyfnzkvkhtkebswbbyuppoyjkcnohkelxqojdvlv");
obj.NischitTest0method7("rturkjrwwktiemdpnmvihsgukiipqheztscjggypcxgyxtpfkelnuqcfotfrwzmlh",(long)(1962));
NischitTest0method8((int)(354),(int)(2296),"kwdeyfwjycohgrcuhwgccrvhcqgcwuxqnadfdgnupdqsgfbbbhdziuiroptdnpvrzdunbqqzgtmcv","ckyodazyltgmjycxahpekisaltkrnbmjbovzputocthunvdxudjcpcxldlui");
obj.NischitTest0method9("dxohwjqyjqdxpqopwsegmgtrdvdblipcuqmldautgzvoqjdoamfzleaneotqovbvjfhxx",(long)(1949));
NischitTest0method10((int)(2551),(long)(3102));
NischitTest0method11("nm","jfrcxlbodpmgkbjjvhjdvhtocjhoshhvjldtrkhrdasuarmrnfxpprhevrlsdcukujlocfkhlocclqbmjruxaap",(int)(914));
NischitTest0method12((int)(1762),"zyphvnvaiuywtvqktkyveopbzlmnxafjhxjjqsdblglfys");
NischitTest0method13((long)(1574),new NischitTest7());
obj.NischitTest0method14(new NischitTest5(),new NischitTest7());
NischitTest0method15("ghojcohqdmuuwassqlgfuigtrtzmyvkfcpk","bkrqvuomwqjvzjczydmghtcvwbzeqjafsztvckqbboshiivjsvgsgcfvbgwht");
NischitTest0method16(new NischitTest3(),new NischitTest2(),"ftajuccgxpyakxdqpkvktq");
obj.NischitTest0method17((long)(1017),"riwtwxyebbdntybhkswoauiwoyeguttpjgexhgcjrgroa",(long)(3045));
obj.NischitTest0method18((int)(3159),"rosgqhwcsaiztlalfbafubdngrgivvzhpfkcmupsnteztnyftcumqaugtutppudegjjhgkqfihsspjzjq",(int)(2468),new NischitTest4());
}

public void run(){
      try{
NischitTest0 obj = new NischitTest0();
NischitTest0method0((int)(1196),new NischitTest3(),(long)(767),"twjsohobxdecasyxrcelvikwpnautfmkalceddeaieihaafyhyemmatrozqfllsyxmodedkvaribtywvnytktlieuwyd");
obj.NischitTest0method1("luvhzoxxtltaprxzfcsaeyolccdgodnowxwjddvdwiyrarvjsowslysfjzvqxdpmpuwoeeskfgrvmhzonuuhafegiohcadx",(long)(559),new NischitTest3());
NischitTest0method2("dyrodzqvngwjnidnstmihlrbqyekwltxyyrcsqjcnglmrckpvu",new NischitTest0(),(int)(2558),"myqdqhbfjirapjbkosjvdniwjqhxsasgjppezewnhjiazmtzrusdmtzxlvczwnqry");
NischitTest0method3((long)(2607),(int)(574),new NischitTest0(),"ombibe");
obj.NischitTest0method4((int)(3106),(int)(1456));
obj.NischitTest0method5((long)(1463),(long)(250));
NischitTest0method6(new NischitTest7(),"alcsdvxizuqkxxwwyfnzkvkhtkebswbbyuppoyjkcnohkelxqojdvlv");
obj.NischitTest0method7("rturkjrwwktiemdpnmvihsgukiipqheztscjggypcxgyxtpfkelnuqcfotfrwzmlh",(long)(1962));
NischitTest0method8((int)(354),(int)(2296),"kwdeyfwjycohgrcuhwgccrvhcqgcwuxqnadfdgnupdqsgfbbbhdziuiroptdnpvrzdunbqqzgtmcv","ckyodazyltgmjycxahpekisaltkrnbmjbovzputocthunvdxudjcpcxldlui");
obj.NischitTest0method9("dxohwjqyjqdxpqopwsegmgtrdvdblipcuqmldautgzvoqjdoamfzleaneotqovbvjfhxx",(long)(1949));
NischitTest0method10((int)(2551),(long)(3102));
NischitTest0method11("nm","jfrcxlbodpmgkbjjvhjdvhtocjhoshhvjldtrkhrdasuarmrnfxpprhevrlsdcukujlocfkhlocclqbmjruxaap",(int)(914));
NischitTest0method12((int)(1762),"zyphvnvaiuywtvqktkyveopbzlmnxafjhxjjqsdblglfys");
NischitTest0method13((long)(1574),new NischitTest7());
obj.NischitTest0method14(new NischitTest5(),new NischitTest7());
NischitTest0method15("ghojcohqdmuuwassqlgfuigtrtzmyvkfcpk","bkrqvuomwqjvzjczydmghtcvwbzeqjafsztvckqbboshiivjsvgsgcfvbgwht");
NischitTest0method16(new NischitTest3(),new NischitTest2(),"ftajuccgxpyakxdqpkvktq");
obj.NischitTest0method17((long)(1017),"riwtwxyebbdntybhkswoauiwoyeguttpjgexhgcjrgroa",(long)(3045));
obj.NischitTest0method18((int)(3159),"rosgqhwcsaiztlalfbafubdngrgivvzhpfkcmupsnteztnyftcumqaugtutppudegjjhgkqfihsspjzjq",(int)(2468),new NischitTest4());
}
} catch (InterruptedException e) {
 e.printStackTrace();
}

}