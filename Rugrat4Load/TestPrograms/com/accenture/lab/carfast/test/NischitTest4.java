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


public class NischitTest4 implements NischitTestInterface0 {
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
static String[] f0= new String[19];


public int NischitTestInterface0Method0(long var0, int var1, String var2, int var3){
 try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Program Files (x86)\\MEGA5\\uninstall\\__UIC__RUGRAT__qY6EAD1xa.txt"));
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
bufferedWriter.append("C:\\Program Files (x86)\\MEGA5\\uninstall\\__UIC__RUGRAT__qY6EAD1xa.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (int)var3;

}

public long NischitTestInterface0Method1(String var0, long var1){
 final NischitTest0 obj_NischitTest0 = new NischitTest0() ;
Thread th8= new Thread(obj_NischitTest0,"th8"){
public void run() { 
 int rv0= obj_NischitTest0.NischitTest0method16(null,null,var0);
int rv1= obj_NischitTest0.NischitTest0method9(var0,var1);
Object rv2= obj_NischitTest0.NischitTest0method15(var0,var0);
long rv3= obj_NischitTest0.NischitTest0method7(var0,var1);
String rv4= obj_NischitTest0.NischitTest0method11(var0,var0,(int)(640));
int rv5= obj_NischitTest0.NischitTest0method9(var0,var1);

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
if(((var1-(long)(615))==(var1*(long)(2086)))){
var1 = (long)((var1+(long)(687))%(long)(1281));
}
else{
 var0 = NischitTest4method2(var0,var1,null,var1);
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
for(int i = 0; i < 52; i++){
 if( ((var1-(long)(3206))==(var1*(long)(1175)))){
if( ((var0+"zztdczu")!=(var0+"uobexfrcyvenvusuxbvurqrrqtxmdsuuwqifkhaljjveubqhqmpwxolfjbkblqs"))){
if( ((var1+(long)(2480))==(var1*(long)(724)))){
if( (((var0+"azdronzjayebpdhpvmisieqeavrkxfglrfrmxzlfcdazpkamqj")+(var0+"scykfcarhfefilcwfyyvlqiifngtm"))==(var0+"xlhuoklugwtiiladecppzvjhfixrtqurdzjtcojvzlyqvadotzpqvwwkrsdlrppajtvksownnffxn"))){
var1 = (long)(1450);
}
}
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
if(((var0+"ehbipucdyccepuayzqbxxzpwkidmdgttxxfhyqkglzrxfrqlrfmuqpxlmttzwluw")!=(var0+"tqwbdsdaxgybdfwldjofrmxplbzvdowtgybtykgzwrh"))){
var1 = NischitTest4method7((int)(777),var1);
}
else{
 var1 = (long)(((var1*(long)(2568))%(long)(1496))*((var1+(long)(559))%(long)(1413)));
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Documents and Settings\\__UIC__RUGRAT__Em6YrQb1q.txt"));
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
bufferedWriter.append("C:\\Documents and Settings\\__UIC__RUGRAT__Em6YrQb1q.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (long)var1;

}

public int NischitTestInterface0Method2(NischitTest4 var0, long var1, int var2, NischitTest5 var3){
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
if( ((var1/(long)(2575))<=(var1%(long)(1461)))){
if( ((var1/(long)(3006))>=(var1%(long)(836)))){
var3 = new NischitTest5();
}
}
if( ((var1+(long)(1325))>=((var1*(long)(2266))*(var1+(long)(2569))))){
if( (((var1-(long)(2479))!=(var1*(long)(2967)))&&(((var1/(long)(722))%(long)(190))>(var1-(long)(2390))))){
var1 = NischitTest4method7(var2,var1);
}
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Program Files (x86)\\Stimfit 0.13\\wx-2.9.4-msw\\__UIC__RUGRAT__Jt5oA.txt"));
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
bufferedWriter.append("C:\\Program Files (x86)\\Stimfit 0.13\\wx-2.9.4-msw\\__UIC__RUGRAT__Jt5oA.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (int)var2;

}

public long NischitTest4method0(int var0, long var1, String var2, int var3){
 try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\ccp4temp\\__UIC__RUGRAT__toKUL.txt"));
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
bufferedWriter.append("C:\\ccp4temp\\__UIC__RUGRAT__toKUL.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (long)var1;

}

public Object NischitTest4method1(int var0, long var1, NischitTest4 var2, int var3){
 switch((var0%(int)(508))){
case 0:
var1 = NischitTest4method3("jrbivyadzbqhvvliceymlpavxfhlremwokqhklzvgjedonryjfejzwduifkkxrdvikucymcudikyvszcuxuiyejorzkwd",null);
 break;
case 1:
System.out.println("NischitTest4 - NischitTest4method1- LineInMethod: 5");
 break;
case 2:
var2 = new NischitTest4();
 break;
case 3:
System.out.println("NischitTest4 - NischitTest4method1- LineInMethod: 14");
 break;
case 4:
System.out.println("NischitTest4 - NischitTest4method1- LineInMethod: 20");
 break;
case 5:
var0 = (int)((var3*(int)(1468))*(var0-var3));
 break;
case 6:
var0 = (int)((var3+var0)*(var3-var0));
 break;
default :
System.out.println("NischitTest4 - NischitTest4method1- LineInMethod: 31");
}
final NischitTest1 obj_NischitTest1 = new NischitTest1() ;
Thread th9= new Thread(obj_NischitTest1,"th9"){
public void run() { 
 Object rv0= obj_NischitTest1.NischitTest1method9("swkyuqihwkobtymckv",var0,var3);
String rv1= obj_NischitTest1.NischitTest1method11(var1,var0,var1);
Object rv2= obj_NischitTest1.NischitTest1method9("esnfhinzepsuvbfsrqlvipfeoyjyylqaizzrnar",var3,var3);
long rv3= obj_NischitTest1.NischitTestInterface2Method0(null,"cneeewzmwdhhojkuzywjybjfmuzeyfyyyutziawqfyioztxzdreytlxcexpervxhsyjznktazpivkvjoflmifpwkuoqa",null,var1);
String rv4= obj_NischitTest1.NischitTest1method11(var1,var3,var1);
long rv5= obj_NischitTest1.NischitTestInterface2Method0(null,"blbafumuwathpoyawjveugtagwjn",null,var1);

 }.start() ;
if( ((var3-var0)<=(var0*var3))){
if( ((var3-(int)(1223))==(var3-(int)(2645)))){
if( ((var0+var3)>=(var3-var0))){
if( ((var0-(int)(2419))<(var0/(int)(122)))){
if( ((var0/(int)(2704))>((var0%(int)(1960))%(int)(2597)))){
if( ((var0+(int)(329))!=(var3+var0))){
var3 = (int)((var0*(int)(2168))+(var0+var3));
}
}
}
}
}
}
return (Object)var2;

}

public String NischitTest4method2(String var0, long var1, NischitTest7 var2, long var3){
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
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Documents and Settings\\__UIC__RUGRAT__air5ZUvvnoX.txt"));
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
bufferedWriter.append("C:\\Documents and Settings\\__UIC__RUGRAT__air5ZUvvnoX.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (String)var0;

}

public long NischitTest4method3(String var0, NischitTest0 var1){
 if((((var0+"wmscqdfdbsbhucdefwxoqvrudxzpgjvvfwsnfycox")==(var0+"kdqnqtbwvlbsmluccnpqdzwehahvvhggdwucnawexcldxdffadoysfspy"))&&((var0+"egljtiosmkfomuwlqfytsuipbixdlxmccwuvdkbrsndnugsjitepynuyaz")!=(var0+"zemymlfduwtokimvnxestccsdzwelelpxyqpziioksfttutehjvfapmlrdpexbqhazamtfcfrkwlerrwpvvlgdczrvnkydy")))){
System.out.println("NischitTest4 - NischitTest4method3- LineInMethod: 4");
}
else{
 NischitTest4method12((int)(2926),(long)(3168),(long)(1887));}
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
bufferedWriter= new BufferedWriter(new FileWriter("C:\\__UIC__RUGRAT__ayxCS.txt"));
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
bufferedWriter.append("C:\\__UIC__RUGRAT__ayxCS.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (long)(long)(2995);

}

public String NischitTest4method4(NischitTest7 var0, NischitTest6 var1){
 System.out.println("NischitTest4 - NischitTest4method4- LineInMethod: 6");
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
final NischitTest3 obj_NischitTest3 = new NischitTest3() ;
Thread th10= new Thread(obj_NischitTest3,"th10"){
public void run() { 
 String rv0= obj_NischitTest3.NischitTest3method9("kphmwcoexwzlhsxcfimxjaffkurnhmusfzeznyvscofunlfemqzxbkuqezceqbsimqfnhldzyduuidroiajfntuitkbzypz",(long)(2520));
String rv1= obj_NischitTest3.NischitTest3method11((int)(3074),"fbjoqonkeqjcmcqizusvzc","ktv");
String rv2= obj_NischitTest3.NischitTest3method6((long)(2976),null);
String rv3= obj_NischitTest3.NischitTest3method11((int)(1248),"boukcujfhljpehmpytonictfqt","jspoafekjingxzdmu");

 }.start() ;
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Program Files (x86)\\Windows Multimedia Platform\\__UIC__RUGRAT__cs5ZgmNH2b.txt"));
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
bufferedWriter.append("C:\\Program Files (x86)\\Windows Multimedia Platform\\__UIC__RUGRAT__cs5ZgmNH2b.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (String)"dhqkkdeekrwuoprzhxekjenonlcaubzgybeusoqdiekoleuuarfwfjawegwaecrtjwliwxd";

}

public long NischitTest4method5(long var0, int var1, int var2, int var3){
 try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\__UIC__RUGRAT__cxGhe.txt"));
bufferedWriter.write("Writing line 1 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 2 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 3 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 4 to file");
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
bufferedWriter.append("C:\\__UIC__RUGRAT__cxGhe.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
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
switch((var2-var1)){
case 0:
System.out.println("NischitTest4 - NischitTest4method5- LineInMethod: 31");
 break;
case 1:
System.out.println("NischitTest4 - NischitTest4method5- LineInMethod: 38");
 break;
case 2:
NischitTest4method11("pyhbapimcydolyavjfzjbqwlourgjk",var0,var0); break;
default :
System.out.println("NischitTest4 - NischitTest4method5- LineInMethod: 45");
}
return (long)var0;

}

public static Object NischitTest4method6(String var0, int var1){
 if(((var1+(int)(998))<=(var1+(int)(1029)))){
NischitTest4method9(var1,null);}
else{
 System.out.println("NischitTest4 - NischitTest4method6- LineInMethod: 5");
}
switch((var1/(int)(818))){
case 0:
NischitTest4method10(var0,var0); break;
case 1:
var0 = (String)((var0+"pjrbwrakzxksuwhfyesjxjlxwmrgxuoohmcalvwmuktblgikjlixk")+(var0+"dqdonkflujwydjsvvjgjtegthhmcsissaoqzimdkjhstslzovuyyjdynoerfbccop"));
 break;
case 2:
var0 = (String)(var0+"qkbglvavknbfadtnfrkckqbrmjgjocqmohvncbpkjoorukamgkgdwhndeqixpgoyxunannjhfdsjsbuelruwnxels");
 break;
default :
f0[15] = (String)(((f0[6]+f0[4])+(f0[8]+f0[4]))+(var0+"arroyhcxjwfizbykugap"));
}
if(((var0+"etojfrntopizzlzpvsqalpfbsfhxzhibycdqdpeehktanifpjcrvfybaqcywdelhpnuouovxwwxs")==(var0+"foyisykarhovvyokktqrtrxqbeireljhsvmggjsuvcmbpttkdtmwz"))){
var0 = NischitTest4method10(var0,var0);
}
else{
 NischitTest4method7(var1,(long)(2220));}
for(int i = 0; i < 22; i++){
 if( ((var0+"okhhekbgcurbuxmtmoevjjwgyknltzzqopdobbcsigkndkeplnqrylzwislwjjxquaaovgdcejbyqbuqmdpkaampalbdrc")!=(var0+"nagmudqxmxrryfelz"))){
NischitTest4method10(var0,var0);}
}
if(((var1%(int)(2281))==(var1%(int)(1480)))){
NischitTest4method12(var1,(long)(2125),(long)(2902));}
else{
 var1 = (int)((var1-(int)(757))*(var1*(int)(1753)));
}
if(((var1+(int)(3107))<=(var1*(int)(1950)))){
f0[12] = (String)((var0+"aimvssreymohmlyqownyllixittwfjryhnrs")+(var0+"dpllgpmngbnwyztidgdtgiyr"));
}
else{
 System.out.println("NischitTest4 - NischitTest4method6- LineInMethod: 41");
}
return (Object)null;

}

public static long NischitTest4method7(int var0, long var1){
 if( ((var1+(long)(3110))<=((var1/(long)(2021))/(long)(717)))){
if( ((var1*(long)(3201))==(var1-(long)(148)))){
if( ((var0+(int)(2974))>(var0+(int)(494)))){
if( (((var1+(long)(2688))/(long)(1029))<=(var1+(long)(1776)))){
if( ((var0*(int)(2525))!=(var0*(int)(3358)))){
NischitTest4method12(var0,var1,var1);}
}
}
}
}
if( (((var1+(long)(1158))+(var1+(long)(2996)))!=(var1/(long)(708)))){
var1 = (long)(3081);
}
if(((var1-(long)(2719))<(var1+(long)(1929)))){
NischitTest4method12(var0,var1,var1);}
else{
 System.out.println("NischitTest4 - NischitTest4method7- LineInMethod: 18");
}
if((((var1/(long)(1396))>=((var1*(long)(1658))%(long)(1606)))&&((var1-(long)(1784))>=(var1/(long)(2698))))){
System.out.println("NischitTest4 - NischitTest4method7- LineInMethod: 23");
}
else{
 var1 = (long)((var1-(long)(135))-(var1*(long)(1306)));
}
if(((((var1-(long)(414))*(var1-(long)(1468)))*(var1*(long)(97)))>(var1+(long)(2749)))){
NischitTest4method11("zcpcwyhuvdrocisdlsuuldkclawaxgcmdzbvgdvcwkydxebohqfdckyxbsnsdxd",var1,var1);}
else{
 System.out.println("NischitTest4 - NischitTest4method7- LineInMethod: 30");
}
return (long)var1;

}

public long NischitTest4method8(long var0, int var1, NischitTest6 var2, String var3){
 if( ((var3+"zuktbftugyusekcn")!=(((var3+"pzhq")+((var3+"qjqzumjulju")+(var3+"wjrswbldbzshyrufnlbovthgtlphbbhbolcywsvn")))+((var3+"ktajcwviiefrvxgmovyhozaewvafk")+(var3+"nlybrnyqrxfpuwqnllmknkrsykiissdvdudedipzifceb"))))){
System.out.println("NischitTest4 - NischitTest4method8- LineInMethod: 2");
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
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\CCP4\\CCP4_DATABASE\\__UIC__RUGRAT__uq6EB.txt"));
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
bufferedWriter.append("C:\\CCP4\\CCP4_DATABASE\\__UIC__RUGRAT__uq6EB.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\WORK\\College of Pharmacy\\_no_task\\__UIC__RUGRAT__5gr7d.txt"));
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
bufferedWriter.append("C:\\WORK\\College of Pharmacy\\_no_task\\__UIC__RUGRAT__5gr7d.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (long)var0;

}

public static int NischitTest4method9(int var0, NischitTest1 var1){
 switch((((var0%(int)(810))+(var0-(int)(1976)))*((var0-(int)(511))*((var0/(int)(2400))*(var0/(int)(2560)))))){
case 0:
System.out.println("NischitTest4 - NischitTest4method9- LineInMethod: 2");
 break;
case 1:
System.out.println("NischitTest4 - NischitTest4method9- LineInMethod: 5");
 break;
case 2:
var1 = new NischitTest1();
 break;
case 3:
f0[7] = (String)(("vjlbayqiccqroytyfbhkrweglaozaceyeuqhwfvnnrfkqwkryzenblynomcwxfxxoby"+"ekyfdcvddpmdoutzrsfdbncosmwbhuvhlzdzq")+("netgc"+"fchguqscsz"));
 break;
case 4:
f0[13] = (String)(("ptzsodcudcpnfptczaxzrqjrdzlzkvcid"+"liyjkhfpfkgracjzcvrhakhhhiqaxnbuuewekhzcwrixsnrcjuukhmkgncmulnrtthmdnkptutrrgjpexmmsuoszscaortknyzg")+(("vybl"+"qdubefwiflhgxouo")+("xpppvtgkubfgcylikuibpcvgcdawqqlhqcyozwcenkborwozxurwyqbihjblciar"+"wuijqxhpfxkvmwpyjlxxoroytcdrslkdukfdj")));
 break;
case 5:
f0[13] = (String)(("ftjuefdjppjjqompbmgmjgrdpnshcpjzfoebdiqktlkmnmfzblghg"+"chxkhszigzxsrlzmjyjbrbwjmxbncwuts")+(("ewmmymikpaxtsqimvpghschqkzmusiowahwibqx"+"golayihoscscaiioo")+(("hpdxpwithgnxpyxvfrxhtmocaqdmxyryiptiwsijw"+"ondax")+("ojumpfmkgukjumztdftvtfiosztvmug"+"filfbctzfvjafwngxxfppgxghmgthzkdhkfhurfnxvnac"))));
 break;
case 6:
System.out.println("NischitTest4 - NischitTest4method9- LineInMethod: 24");
 break;
default :
var0 = (int)(1897);
}
if(((((var0+(int)(787))%(int)(1758))-(var0/(int)(846)))!=(var0-(int)(1308)))){
f0[2] = (String)(("pndgkeaxdbqrskakuekcytgrwclvyiznviibverydghukuaprvgmjlchpxvge"+"zdjimrckrpjqfbrjvvlhxzfbvsildainfdnxioqiptlsoctamiaotrluruozjvnmik")+("tmuwkkldhtngyfcgfuyieeoxmpwbteujpmaydyxfgwgjwxzruaqcdlxyaogwfqg"+"tszqvphreczrkqe"));
}
else{
 var0 = (int)(3088);
}
for(int i = 0; i < 60; i++){
 if( ((var0-(int)(2986))>=(var0*(int)(2426)))){
if( ((var0+(int)(183))==(var0+(int)(1722)))){
if( ((var0*(int)(1634))!=(var0-(int)(323)))){
f0[4] = (String)((("dkwxxjrqbvabglthqhhihjojuzuwudylacywiwmymozpfwobgxeuinacku"+"wvnbbvukloanwkzaahhkwnjtnusvtivnyaiqwxzoecefpqhlekrtvkpfgihkrnsfqdabkujlytfshemffijrctbqvewy")+("mledugvrzpgtdrfizkqmjbhgwqu"+"vopfcvyvbsviqwwnun"))+("tnhkeidiogbmjxusgditqipfpfvgwqthygtngpiefyuerikrgrkurjdsowqilklcqgkxlorwwwzdwmgazc"+"srunlzjertulniphgamebvzqbyzcunwgtmbrretadfzeovpwrmrcfqxboqdni"));
}
}
}
}
return (int)var0;

}

public static String NischitTest4method10(String var0, String var1){
 return (String)var1;

}

public static Object NischitTest4method11(String var0, long var1, long var2){
 return (Object)null;

}

public static Object NischitTest4method12(int var0, long var1, long var2){
 if(((var2%(long)(2324))>((var1+var2)-(var2+var1)))){
System.out.println("NischitTest4 - NischitTest4method12- LineInMethod: 4");
}
else{
 System.out.println("NischitTest4 - NischitTest4method12- LineInMethod: 9");
}
switch((var0-(int)(756))){
case 0:
var2 = (long)((var2/(long)(482))%(long)(786));
 break;
case 1:
var1 = (long)(759);
 break;
case 2:
var2 = (long)(1219);
 break;
case 3:
f0[9] = (String)(("fhfstsercvvdjqyqwrqxhcfykvufugnwrwqnfizcddsmwbqbqlhpaxdkyumd"+"bwhjyoutq")+("niphikagfjqiknzophwvkrovqqzdherpulmbgnfuowxryjcubtfhdzrtsj"+"hwqsxncdebhsjhinnyjjdgtlcbdktxjrrivrjl"));
 break;
case 4:
System.out.println("NischitTest4 - NischitTest4method12- LineInMethod: 24");
 break;
case 5:
var0 = (int)(1394);
 break;
case 6:
System.out.println("NischitTest4 - NischitTest4method12- LineInMethod: 30");
 break;
case 7:
System.out.println("NischitTest4 - NischitTest4method12- LineInMethod: 37");
 break;
case 8:
var2 = (long)((var2+var1)-(var2/(long)(719)));
 break;
default :
f0[13] = (String)(("zblymtxqpdryphowiflrsmhaslcdjbwpdivygpmdgckkqbmjtrbqmjhkx"+"utfapylutgqqtwisfwnfdvdybcmswhznjkoldmnvjveilebbbwrgsn")+("tpg"+"oy"));
}
return (Object)null;

}


public static void main(String args[]){
NischitTest4 obj = new NischitTest4();
obj.NischitTestInterface0Method0((long)(2404),(int)(2033),"zacpfhhmciqllvqlqqcfxjouroniuxrqchgibidabajagkzrktbzpwtgeahxixeekjhggzoautthurxbhumqikompk",(int)(3245));
obj.NischitTestInterface0Method1("seuabwjekdiwtjfxbngmwejmhvnaiihnoljmqyyejveilgzjoymitarxkasrmuubrkiguatsvassv",(long)(548));
obj.NischitTestInterface0Method2(new NischitTest4(),(long)(904),(int)(323),new NischitTest5());
obj.NischitTest4method0((int)(2395),(long)(1900),"xoizcwbedfcdwuqcgcfpmnysqcjvcerpgvvpwr",(int)(2522));
obj.NischitTest4method1((int)(2629),(long)(538),new NischitTest4(),(int)(1108));
obj.NischitTest4method2("mhnnpiuehmzhhreosrztwziswgjjibbpzvfpshmjslfwxcjhgmhevcwksranpspioqoslthixaqutpnmudbaz",(long)(1231),new NischitTest7(),(long)(301));
obj.NischitTest4method3("lc",new NischitTest0());
obj.NischitTest4method4(new NischitTest7(),new NischitTest6());
obj.NischitTest4method5((long)(3152),(int)(3212),(int)(3286),(int)(3265));
NischitTest4method6("fefpvioeo",(int)(3066));
NischitTest4method7((int)(1923),(long)(2197));
obj.NischitTest4method8((long)(790),(int)(2660),new NischitTest6(),"xqysvayjsvuvghyfjeivjqrbslcferez");
NischitTest4method9((int)(1259),new NischitTest1());
NischitTest4method10("ghrjqxwiuqzedofrhqoh","ksrghxrltysapvfqtz");
NischitTest4method11("ysjqlvjtoeciepuyupahypazoicrfvawwqofdxiwxvulmibiwokniktbkgatyntostndoivylu",(long)(1158),(long)(2578));
NischitTest4method12((int)(360),(long)(1855),(long)(2624));
}

}