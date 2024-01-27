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


public class NischitTest2 implements NischitTestInterface0 {
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
NischitTest3 f0;
NischitTest1 f1;
long f2;
static String[] f3= new String[29];
NischitTest2[] f4= new NischitTest2[24];


public int NischitTestInterface0Method0(long var0, int var1, String var2, int var3){
 for(int i = 0; i < 17; i++){
 if( ((var0-(long)(441))!=(var0*(long)(880)))){
System.out.println("NischitTest2 - NischitTestInterface0Method0- LineInMethod: 4");
}
}
if(((var0+(long)(3186))<=(var0-(long)(2140)))){
var0 = (long)((var0/(long)(2661))-((var0*(long)(1314))*(var0/(long)(496))));
}
else{
 System.out.println("NischitTest2 - NischitTestInterface0Method0- LineInMethod: 12");
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\CCP4\\TclTk84\\share\\__UIC__RUGRAT__PlLJPukb.txt"));
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
bufferedWriter.append("C:\\CCP4\\TclTk84\\share\\__UIC__RUGRAT__PlLJPukb.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (int)var1;

}

public long NischitTestInterface0Method1(String var0, long var1){
 if(((((var0+"jqqetyeeqwqhpcvncwptrhxwtcdqnbhgxxiqjjnlyfabydyizhowxdontran")+(var0+"pfiudcndfwurjrbunciytnmyvnjtsdjbzelqmajzcfowiyalgcezfaniymsdfkggealowxdarfejvtdwfuzjsedpsmc"))+(var0+"rgplevcxracf"))!=(var0+"vkznsvhxxywjrshauqmvuphwsgkvhjxqelntqlgneviqfdaejkqmghnhzojyrtceovoxghmsodgoftzgpevwcnkmcqf"))){
NischitTestInterface0Method2(null,var1,(int)(232),null);}
else{
 System.out.println("NischitTest2 - NischitTestInterface0Method1- LineInMethod: 5");
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
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Users\\Bala\\__UIC__RUGRAT__SjTEs.txt"));
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
bufferedWriter.append("C:\\Users\\Bala\\__UIC__RUGRAT__SjTEs.txt");bufferedWriter.newLine();
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
 if( ((var1*(long)(2472))>(var1*(long)(299)))){
if( ((var2+(int)(2422))>(var2+(int)(128)))){
if( (((var1*(long)(2651))>(var1+(long)(1046)))&&(((var1+(long)(1622))-(var1*(long)(1860)))<(var1+(long)(2091))))){
if( ((var1*(long)(497))>=((var1+(long)(2413))-(var1+(long)(348))))){
if( (((f2-(long)(2132))<=(var1-(long)(829)))&&((var1-(long)(409))==(var1*(long)(283))))){
f4[12] = new NischitTest2();
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
if( (((var1-(long)(382))+(var1+(long)(448)))==((var1+(long)(3276))/(long)(968)))){
System.out.println("NischitTest2 - NischitTestInterface0Method2- LineInMethod: 13");
}
if( ((f2/(long)(2032))==(var1*(long)(24)))){
if( (((var1-(long)(1939))+(var1-(long)(1736)))<(f2/(long)(61)))){
System.out.println("NischitTest2 - NischitTestInterface0Method2- LineInMethod: 21");
}
}
final NischitTest0 obj_NischitTest0 = new NischitTest0() ;
Thread th4= new Thread(obj_NischitTest0,"th4"){
public void run() { 
 long rv0= obj_NischitTest0.NischitTest0method12(var2,"sbjmqkcgalnlyjwbjwsykekkanqeptgq");
Object rv1= obj_NischitTest0.NischitTest0method18(var2,"pjevxwbuboyedfyicsuisjsdltudgecrgkeojhbpepczrwmjttckidveexcrajsfdvaylavskmfexkmlgacgjdmevwdbtqyc",var2,var0);
Object rv2= obj_NischitTest0.NischitTest0method0(var2,null,var1,"xxbhbpkikpgdphdvuwobqewbqqpidesxllfdp");
long rv3= obj_NischitTest0.NischitTest0method12(var2,"hzxqihkixhukmbqkcatmtlckazsnjzioem");

 }.start() ;
Thread th5= new Thread(obj_NischitTest0,"th5"){
public void run() { 
 int rv0= obj_NischitTest0.NischitTest0method2("mltlxwfaknvxeermqtxbtlqpaxqzqqbmjyvledaudqvvdxsqqsopmjfybhqtkkoprohpjgebagujzambzntdqh",null,var2,"vyxoztlbohzubplkhcvzhlzxuiafmwodcysbvmhioq");
String rv1= obj_NischitTest0.NischitTest0method8(var2,var2,"kncpsxzkbuakqqwbpctachtzwvvudubcwqordskfymz","vujatjjojtrugdrutaukddhqpjfaplspahmauof");
long rv2= obj_NischitTest0.NischitTest0method4(var2,var2);
Object rv3= obj_NischitTest0.NischitTest0method0(var2,null,var1,"dfmncwcloqwqyzyvgjekronxljrutglokireoxjljewowbslouektojnuizowrafbtariamjltprfrpwoivdsoknfpkpptcdihh");
int rv4= obj_NischitTest0.NischitTest0method16(null,null,"tepctlkpulbjjurbcxyjktpyg");
String rv5= obj_NischitTest0.NischitTest0method17(var1,"khnjwvduwqivbvg",var1);

 }.start() ;
if( ((var2*(int)(351))==(var2+(int)(2036)))){
var1 = (long)(1746);
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
switch((var2+(int)(1770))){
case 0:
System.out.println("NischitTest2 - NischitTestInterface0Method2- LineInMethod: 27");
 break;
case 1:
System.out.println("NischitTest2 - NischitTestInterface0Method2- LineInMethod: 32");
 break;
case 2:
System.out.println("NischitTest2 - NischitTestInterface0Method2- LineInMethod: 37");
 break;
case 3:
System.out.println("NischitTest2 - NischitTestInterface0Method2- LineInMethod: 43");
 break;
case 4:
var0 = new NischitTest4();
 break;
case 5:
var2 = (int)(var2*(int)(3298));
 break;
default :
System.out.println("NischitTest2 - NischitTestInterface0Method2- LineInMethod: 56");
}
return (int)var2;

}

public String NischitTest2method0(String var0, int var1, long var2){
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
if(((var1*(int)(3158))<=(var1+(int)(3174)))){
System.out.println("NischitTest2 - NischitTest2method0- LineInMethod: 4");
}
else{
 var0 = (String)(((var0+"lgdwofyohznqghbroubrijuvacninqbaosnhsnc")+(var0+"sfskrgdga"))+(var0+"twkuehktlvqpvvbgiyadcrshfnwscpqyepmpzhurz"));
}
switch(((var1/(int)(97))-(var1*(int)(2526)))){
case 0:
var0 = NischitTest2method3(var1,null);
 break;
case 1:
System.out.println("NischitTest2 - NischitTest2method0- LineInMethod: 13");
 break;
case 2:
System.out.println("NischitTest2 - NischitTest2method0- LineInMethod: 17");
 break;
case 3:
NischitTest2method11(null,var0); break;
default :
System.out.println("NischitTest2 - NischitTest2method0- LineInMethod: 23");
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
final NischitTest1 obj_NischitTest1 = new NischitTest1() ;
Thread th6= new Thread(obj_NischitTest1,"th6"){
public void run() { 
 long rv0= obj_NischitTest1.NischitTest1method4(var0,var1,var1,var0);
long rv1= obj_NischitTest1.NischitTest1method4(var0,var1,var1,var0);
long rv2= obj_NischitTest1.NischitTest1method12(var2,var1,var2,var1);
long rv3= obj_NischitTest1.NischitTest1method12(var2,var1,var2,var1);
long rv4= obj_NischitTest1.NischitTest1method3(null,var1);

 }.start() ;
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\temp\\__UIC__RUGRAT__VC7bl.txt"));
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
bufferedWriter.append("C:\\temp\\__UIC__RUGRAT__VC7bl.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (String)var0;

}

public int NischitTest2method1(long var0, String var1, long var2, String var3){
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
if( ((var2+(long)(3064))>=(((f2+(long)(3221))%(long)(15))/(long)(369)))){
f4[18] = new NischitTest2();
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
final NischitTest3 obj_NischitTest3 = new NischitTest3() ;
Thread th7= new Thread(obj_NischitTest3,"th7"){
public void run() { 
 String rv0= obj_NischitTest3.NischitTest3method9(var3,var0);
int rv1= obj_NischitTest3.NischitTest3method3(var3,null);
int rv2= obj_NischitTest3.NischitTest3method4(null,null);
String rv3= obj_NischitTest3.NischitTest3method2(var2,null);

 }.start() ;
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Documents and Settings\\__UIC__RUGRAT__lFHzP5.txt"));
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
bufferedWriter.append("C:\\Documents and Settings\\__UIC__RUGRAT__lFHzP5.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (int)(int)(3089);

}

public long NischitTest2method2(long var0, String var1){
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
if((((var1+"vlplecwcklzaqfecjiiumixagtpvexvnnuolbvvyfblkycvafembbmjjqxtssfhem")!=(var1+"hwhayhsoxmmgbkcnoayaeuptugkqbpivmmqhbihjtuqkdpdewipeuqsahsdwkgldgoxmbsbfpijwtoke"))&&((var1+"uxaaqtpfwlcwawtebmfzrmtyobeslzpvbpqojxcvzyxlkasjndfgyjbavqlqklzygqeb")!=(var1+"bsbptczwqmlkjkxjukwadxymd")))){
f2 = (long)((var0-(long)(660))%(long)(1117));
}
else{
 var0 = NischitTest2method7(var0,var1);
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
if((((var0+(long)(186))*((var0+(long)(660))/(long)(1288)))<=((var0-(long)(2426))-((var0-(long)(2583))%(long)(1028))))){
var1 = NischitTest2method3((int)(1443),null);
}
else{
 System.out.println("NischitTest2 - NischitTest2method2- LineInMethod: 11");
}
for(int i = 0; i < 66; i++){
 System.out.println("NischitTest2 - NischitTest2method2- LineInMethod: 15");
}
if((((var1+"bbuhnhggqethjtxhlqrtcwasxmqswqybjycucovxbkmnzxfonamjeoldqrvnuki")==(var1+"rxphpyvrtptwsvsqwtnphrzbuac"))||((((var1+"pazoqgkwanznqwoyewpyxjeklzphjmraijsyczkwhzglqpcfnsggfgawghdbmwhnnctglxmjcphcodnnard")+(var1+"cusbnsxxapyvqyejhvatyzzubtmonagfutebbdlvgztvpgpcsovittuzdjtpsndbdlpzweoiiatayocaisepa"))+(var1+"vywyywitjnzspitnrdwniuijlcvhrvxufxzbhxnfzzdyhc"))==(var1+"xfqvjnymnrgynz")))){
var0 = NischitTest2method4((int)(2889),null);
}
else{
 var0 = NischitTest2method7(var0,var1);
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Windows\\InputMethod\\CHT\\__UIC__RUGRAT__aZYtm.txt"));
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
bufferedWriter.append("C:\\Windows\\InputMethod\\CHT\\__UIC__RUGRAT__aZYtm.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (long)var0;

}

public String NischitTest2method3(int var0, NischitTest6 var1){
 switch(((var0+(int)(1506))*(var0-(int)(619)))){
case 0:
NischitTest2method8(null,(long)(1343),var0); break;
case 1:
System.out.println("NischitTest2 - NischitTest2method3- LineInMethod: 5");
 break;
case 2:
var0 = (int)(2993);
 break;
case 3:
f4[9] = new NischitTest2();
 break;
case 4:
var0 = (int)(1622);
 break;
default :
var1 = new NischitTest6();
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
for(int i = 0; i < 38; i++){
 System.out.println("NischitTest2 - NischitTest2method3- LineInMethod: 22");
}
if(((var0+(int)(2651))<(var0+(int)(1328)))){
f4[4] = new NischitTest2();
}
else{
 var0 = NischitTest2method11(null,"adyuwnaauvcdiotciylqxkqpdbbirjonyxembczouanxckwrmmkglwusbklolpfykyfrsglc");
}
if(((var0-(int)(3036))>(var0/(int)(3007)))){
f1 = new NischitTest1();
}
else{
 var0 = (int)(659);
}
if(((var0*(int)(1483))==(var0*(int)(1408)))){
f1 = new NischitTest1();
}
else{
 NischitTest2method12(null,null);}
return (String)"iktuczuvexbkmtesaqi";

}

public long NischitTest2method4(int var0, NischitTest2 var1){
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
if(((var0-(int)(1894))<=(var0+(int)(3384)))){
f0 = new NischitTest3();
}
else{
 f4[20] = new NischitTest2();
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
if( ((((var0+(int)(2814))-((var0*(int)(669))+(var0/(int)(674))))==(var0-(int)(2238)))&&((var0+(int)(2082))!=(var0-(int)(2894))))){
f1 = new NischitTest1();
}
if( (((var0%(int)(1790))>=(var0*(int)(1701)))&&((var0*(int)(1695))<=(((var0*(int)(2956))+((var0-(int)(459))/(int)(3265)))+((var0+(int)(1351))-(var0*(int)(3423))))))){
if( ((((var0*(int)(675))+(var0*(int)(1544)))%(int)(11))==(var0/(int)(800)))){
if( (((var0%(int)(82))-(var0*(int)(1065)))!=((var0/(int)(1965))/(int)(1793)))){
if( (((var0+(int)(1702))+(var0/(int)(5)))!=((var0-(int)(705))*(var0+(int)(2412))))){
var0 = NischitTest2method8(null,(long)(4),var0);
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
switch((var0-(int)(250))){
case 0:
NischitTest2method5((long)(3363),var1); break;
case 1:
System.out.println("NischitTest2 - NischitTest2method4- LineInMethod: 23");
 break;
case 2:
var0 = (int)(1016);
 break;
case 3:
var0 = NischitTest2method8(null,(long)(993),var0);
 break;
default :
var0 = NischitTest2method6("nimxxybqcasgxxvwmnvuphkezpakkytpwverhflrxqbowthnlfhzqssddkhtltzjszbkihipxwddpss",(long)(1381),(long)(3361));
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
if( ((var0+(int)(2991))>(var0*(int)(1639)))){
var0 = NischitTest2method6("wztfkautzqwt",(long)(1419),(long)(2223));
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
switch((var0-(int)(3408))){
case 0:
System.out.println("NischitTest2 - NischitTest2method4- LineInMethod: 40");
 break;
case 1:
System.out.println("NischitTest2 - NischitTest2method4- LineInMethod: 47");
 break;
default :
System.out.println("NischitTest2 - NischitTest2method4- LineInMethod: 53");
}
return (long)(long)(645);

}

public static String NischitTest2method5(long var0, NischitTest2 var1){
 for(int i = 0; i < 51; i++){
 System.out.println("NischitTest2 - NischitTest2method5- LineInMethod: 3");
}
if((((var0-(long)(2948))+(var0/(long)(2995)))!=(var0/(long)(577)))){
var0 = (long)((var0*(long)(3134))-(var0-(long)(1642)));
}
else{
 System.out.println("NischitTest2 - NischitTest2method5- LineInMethod: 9");
}
if( ((var0*(long)(1682))==(var0-(long)(278)))){
System.out.println("NischitTest2 - NischitTest2method5- LineInMethod: 15");
}
if((((var0-(long)(2302))+(var0/(long)(27)))<=(var0*(long)(2695)))){
f3[19] = (String)((("cnydvusxpsrswjjfndikbvdfwkfghmfjfchmjgwahlqfpiocqnvjxyswr"+"jjjvkyxzntyyadavwyoyzqksabtuyyyxjmutzeyxuminvopiutfxgawjzqqwmmojykzgftdmlkcovgduxlvxhw")+("qbftiigbfxrltwficyxijxaqexrubakbilwcxpmty"+"sgiensxceuykmazlioyknpxwesiehgflvfwqekepk"))+(f3[11]+f3[19]));
}
else{
 var0 = (long)(195);
}
for(int i = 0; i < 36; i++){
 if( ((var0*(long)(1709))>=(var0-(long)(907)))){
if( ((var0+(long)(2505))<=(var0-(long)(1531)))){
if( ((var0+(long)(2438))>(var0-(long)(58)))){
if( ((var0/(long)(1397))>=((var0%(long)(2508))/(long)(3402)))){
var0 = (long)(363);
}
}
}
}
}
for(int i = 0; i < 29; i++){
 if( ((var0%(long)(1402))!=(((var0+(long)(1958))-(var0%(long)(2898)))*(var0-(long)(2461))))){
f3[4] = (String)((f3[14]+f3[10])+("bcvwuicultgyatossnfkpinjwbmvioardtaidqpbphbsgskqftqqesghwuctzziacoymlhdebxkqwfydbesrwdqalmcsy"+"lznvbojhildaqaugwdckhukemcvhyjqjvyfugfxaysujfyxo"));
}
}
return (String)"tzvqgaxmllntvssynwuqriszorqqlbjjfzzkfnvaohjvfdkkbtpfuupkbmb";

}

public static int NischitTest2method6(String var0, long var1, long var2){
 for(int i = 0; i < 94; i++){
 System.out.println("NischitTest2 - NischitTest2method6- LineInMethod: 2");
}
if((((var0+"yuzrltyyjiktaxdxmllgljcepkahrungo")!=(var0+"zwuwmvalzzguhwodkymv"))&&(((f3[5]+f3[6])+(f3[8]+f3[24]))!=((var0+"lgusxxognxxmfouxfkpcyocljjggmcgtrlpezbicujetboetwyycexfzgndxmxfmxtxxlxbvdtmitubrgzzd")+((var0+"qvqmbqufpcyulwzgfkdmwapdabhxbuzlnaolhtoulucqfudvomdoxiouadzri")+(var0+"mhpksqzjbxwopkaamewjzewjrwhdogccfnjmdpzhelpuhujfjpgeqqspusnxknghn")))))){
var2 = (long)((var2/(long)(304))%(long)(754));
}
else{
 f3[6] = (String)((f3[21]+f3[18])+(var0+"dxuxklxrflcveynncqgwjbdnxsw"));
}
if((((var2%(long)(251))+(var1%(long)(1315)))<(var2-(long)(697)))){
System.out.println("NischitTest2 - NischitTest2method6- LineInMethod: 15");
}
else{
 NischitTest2method8(null,var1,(int)(689));}
if(((var1%(long)(524))>=((var1/(long)(2722))-(var1*var2)))){
f3[9] = (String)(((f3[9]+f3[1])+(f3[16]+f3[1]))+((var0+"kbouituiwgzqvapvthlaaehlasptopcqrjaczcggxggdmfgxahzxlnbxdecbuintfepbagamqwtxjplrfdjqgddu")+(var0+"cbyllruheodkycbiqohfgdelckbrcbyfzpwdstexqkbims")));
}
else{
 System.out.println("NischitTest2 - NischitTest2method6- LineInMethod: 23");
}
if(((var1+(long)(1885))<(var2-(long)(444)))){
var0 = "kezfdpnuxervvuukczxsgspbbedrwhymegyentnnrnxcbnngxasl";
}
else{
 System.out.println("NischitTest2 - NischitTest2method6- LineInMethod: 29");
}
return (int)(int)(1825);

}

public long NischitTest2method7(long var0, String var1){
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
for(int i = 0; i < 28; i++){
 if( (((var0+(long)(1059))%(long)(118))==(var0-(long)(1086)))){
System.out.println("NischitTest2 - NischitTest2method7- LineInMethod: 4");
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
bufferedWriter= new BufferedWriter(new FileWriter("C:\\__UIC__RUGRAT__swzFE.txt"));
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
bufferedWriter.append("C:\\__UIC__RUGRAT__swzFE.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (long)var0;

}

public static int NischitTest2method8(NischitTest0 var0, long var1, int var2){
 if(((var2*(int)(1549))>=(var2+(int)(1695)))){
System.out.println("NischitTest2 - NischitTest2method8- LineInMethod: 4");
}
else{
 System.out.println("NischitTest2 - NischitTest2method8- LineInMethod: 7");
}
for(int i = 0; i < 32; i++){
 System.out.println("NischitTest2 - NischitTest2method8- LineInMethod: 13");
}
return (int)var2;

}

public static Object NischitTest2method9(int var0, int var1, NischitTest3 var2, long var3){
 if( ((var3%(long)(2457))<=(var3+(long)(2029)))){
if( ((var0*(int)(1247))>=(var1-var0))){
if( ((var3+(long)(2052))==((var3/(long)(3398))-(var3+(long)(3315))))){
if( ((var3-(long)(1416))!=(var3*(long)(2497)))){
if( ((var0%(int)(1076))<(var0/(int)(3330)))){
if( ((var1/(int)(2308))>(var0+var1))){
System.out.println("NischitTest2 - NischitTest2method9- LineInMethod: 12");
}
}
}
}
}
}
if((((var3%(long)(1707))/(long)(538))==(var3*(long)(202)))){
var3 = (long)(1620);
}
else{
 var3 = (long)(3198);
}
for(int i = 0; i < 62; i++){
 f3[18] = (String)(("cawmtxhivsmzzel"+"jkfdouszfuqshlcdxcecqvjssxqeybdusvsaxqkzdqhayzibvleejsfswgjtoqigqhba")+("rznitnyvanvlvhcvuejoitcjpvyekxyydgzrpznbanwjruovicjnokjrhxpkdwehlbgwudwcsbaodsqcd"+"olmbiofwhtpzgbdjmqttjdfpboepanueoxpkvcnbend"));
}
return (Object)var2;

}

public String NischitTest2method10(int var0, int var1){
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
if(((var0-var1)>((var1+var0)+(var0*(int)(1225))))){
var0 = (int)((var1-var0)*(var1-(int)(2537)));
}
else{
 System.out.println("NischitTest2 - NischitTest2method10- LineInMethod: 5");
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
for(int i = 0; i < 29; i++){
 if( ((((var0*(int)(2069))-(var1-var0))*((var0*var1)*(var0-var1)))>=(var1/(int)(2199)))){
if( (((var0*(int)(2319))-((var0-var1)*(var1*(int)(404))))<(var0*var1))){
System.out.println("NischitTest2 - NischitTest2method10- LineInMethod: 16");
}
}
}
switch((var1*var0)){
case 0:
System.out.println("NischitTest2 - NischitTest2method10- LineInMethod: 21");
 break;
case 1:
System.out.println("NischitTest2 - NischitTest2method10- LineInMethod: 28");
 break;
case 2:
System.out.println("NischitTest2 - NischitTest2method10- LineInMethod: 32");
 break;
case 3:
System.out.println("NischitTest2 - NischitTest2method10- LineInMethod: 37");
 break;
default :
var0 = (int)((var0*var1)-(var1*(int)(2926)));
}
return (String)"nefjkadvwngfwhyrhbofihqxircbfeiroynvxbiokfaazddhbojttjmefkmbbyokmosihylgwmksfplnleqzgjebeld";

}

public int NischitTest2method11(NischitTest5 var0, String var1){
 if(((var1+"puliiooihbeyzemvrksfkthtdekxtyybjmkqmcieocatmyiffr")!=(var1+"zfepbkepjyogitnjnxoppddlcwceeqggugvnsgnflhtkahmiptzsqgqytuuzf"))){
f0 = new NischitTest3();
}
else{
 System.out.println("NischitTest2 - NischitTest2method11- LineInMethod: 5");
}
for(int i = 0; i < 86; i++){
 if( ((var1+"arxhravszpyeflzsfmiaoxxqvcniglfnkailjrjhfqtgwpxgcnqmacxbnkjqbwfdex")!=(var1+"jcwkdqvvynnocqijshykacbgbescrvftatejdtmbdjoqcnkzljibsfmsuxrmbvxduvth"))){
var1 = "fyeqfykabzieoowelxivxivsbjxrvfpywmbrmxaynjzuaxpxozgrzbbexivzzremuvjxvdgaafibtevcndfpakappag";
}
}
if( ((((var1+"fqwfalczpwfvkx")+(var1+"sxucfqenisgyuj"))!=((var1+"lrpzttwdvnyyxfzawvhjgvnwojzvnmilzspdvrwwpcvofqzhgmvnxpquu")+((var1+"qggzowevsrdofiohrydraueqhhldrvdmxgu")+(var1+"rbldhgylfvkjnliafgsjxahlorsiwgamreswbiwopruoxsyrjiywbmhtkmo"))))&&((var1+"yxsngcxjwicgjlukqqbokczmiucgxsvkhsyxwbzyrnwdywkoixwamjtomivjusqyqwkipjwakltkno")!=((var1+"pbwkwiropppmluktunqvrlvqvbmllgjnkewitlhalenwivucbmvhtyvefdjegzzmhizmhqjdawffgwxzjgrahkifioaedrv")+(var1+"xxvmbzxasxsjjuhitlokahushtyd"))))){
if( (((var1+"kyhe")!=((var1+"xdbczwovfaiqshcfpaubnh")+((var1+"dpkfvoyxqoigvyqoyzdzhfccv")+(var1+"owejnsdchcitoryfctcmuntbdgkdzvbkimtwvxu"))))&&(((var1+"wibvtjoyhpypwuyhxocwfcnylt")==(var1+"rsuzcqvizknczwiqrhypjrfqjyusfbedseebbikhamslhvozlhjoyggscorekwsyjrbhyiwrvervt"))&&((var1+"llqhdrwlenazhaufext")!=(var1+"supawueqoexqjohmyizyjyejjsndnjdnlgckexsdhcgaucezdmwgjmkmd"))))){
if( ((var1+"wtfirwstiwbippthhlyhvbfsarqbvmkwhiagnitknkyvabwrysjsunjmuepittxren")==(var1+"pgctceregtchwvyxghcwaeypqrblsnqmpgbzfbcnueiagenrd"))){
if( ((var1+"frfedxbdcemyknuayiwwiyzufwwbnk")==(var1+"mwzbcxlffixaayvxsxoxqgjjipfofxhhucakegwlsxonurugrdwdqrwoeahmmnspweda"))){
if( ((var1+"czscmnwectrbrlbhnxhzcno")!=((var1+"vuvcurfgcilrytollfjumkvdpydynsnpygxdqkmzclahladxzof")+(var1+"bjkktgfykoqpp")))){
if( ((var1+"crbwmesnwvluuqdxwuonfbwuqrmmyqmorwzicjqyqmzxzgopzbkaxhpltlpxlxmawxqwbx")!=(var1+"muildpomxxfrshcigaconzrrwowebzwmodegyotvizubmsmavoo"))){
var0 = new NischitTest5();
}
}
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
for(int i = 0; i < 37; i++){
 if( ((var1+"tvcwjqrhwkcfxgaysacgdzizpqjsrtnncptt")==(var1+"rvznhicuoxxzxmdwbabosokxvhtuftppbwoaamyuuaoheckblkdfapqwbrxvqthfaiqrrnxoqgakrfvmrkszy"))){
System.out.println("NischitTest2 - NischitTest2method11- LineInMethod: 31");
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
if( ((var1+"ixayvoerobbvoviyyerqkmrlbslybwfhygroshjkzodkbfygqzrynfvxfuypgnutlbawqqejgxvdbxuqnmlem")==(var1+"yrtrhlqzbgasddzovydrindwvytagcjyhbittphhlcjmppmknczapcqr"))){
var1 = (String)((var1+"nxhblykihmaufkcashhdbxsoyvyfq")+((var1+"fcadgjoitikhp")+(var1+"wrobqnijltxxkrawrygirsyocfizvdvjgdnfueucomkdsvnaakuamfkwxioogagszwyvztnpsejqmwpvkv")));
}
for(int i = 0; i < 23; i++){
 if( ((var1+"tftzbobzyftblkzytxnhoxgzveyqrjntgdfhxnkkwcqxeormaoczceoemgiyfuclom")!=(var1+"juskisbjqmkjvynbhfjbyggsibcfji"))){
System.out.println("NischitTest2 - NischitTest2method11- LineInMethod: 42");
}
}
return (int)(int)(597);

}

public static Object NischitTest2method12(NischitTest7 var0, NischitTest5 var1){
 for(int i = 0; i < 55; i++){
 System.out.println("NischitTest2 - NischitTest2method12- LineInMethod: 2");
}
for(int i = 0; i < 96; i++){
 System.out.println("NischitTest2 - NischitTest2method12- LineInMethod: 7");
}
return (Object)var0;

}


public static void main(String args[]){
NischitTest2 obj = new NischitTest2();
obj.NischitTestInterface0Method0((long)(874),(int)(1536),"thqeuwoxjlugikpukbwwvvemyajkepfkcmllhvywkbsmddgxgvwjhd",(int)(505));
obj.NischitTestInterface0Method1("ssxcpttaroetmedtmirczoiebfbxezsyqmrlcsxxwwtckwaaetmclbmydiinhkkplbzkr",(long)(847));
obj.NischitTestInterface0Method2(new NischitTest4(),(long)(1481),(int)(2253),new NischitTest5());
obj.NischitTest2method0("rpdqrfqotbzamyxjyyutvtymnnnrlfpbxuhnsixfovwtyzoflunvdihnbhmuhsnlaktiqpuesokylajcfoov",(int)(115),(long)(3119));
obj.NischitTest2method1((long)(964),"pdtoecagexkhz",(long)(2943),"msgvvongymqneoexcpzfhhrfapossjxqhq");
obj.NischitTest2method2((long)(1568),"cevbqua");
obj.NischitTest2method3((int)(3451),new NischitTest6());
obj.NischitTest2method4((int)(3407),new NischitTest2());
NischitTest2method5((long)(2035),new NischitTest2());
NischitTest2method6("jpnsjbutikpzcobmjsfbmupyatrxqxcinznoxnqvqgtvtbedxgwepqqnrdgpckzmhmd",(long)(635),(long)(245));
obj.NischitTest2method7((long)(2573),"axipocvoowthuiumyppawjyaliabotkzdfr");
NischitTest2method8(new NischitTest0(),(long)(2803),(int)(1404));
NischitTest2method9((int)(1822),(int)(230),new NischitTest3(),(long)(122));
obj.NischitTest2method10((int)(2300),(int)(3117));
obj.NischitTest2method11(new NischitTest5(),"skbyjbsjapvhshlxuoiqudtnfgzhszamyixamohbteghdpxkqlmhmqzwuyfivykaqhezroktgadbjoukfkgts");
NischitTest2method12(new NischitTest7(),new NischitTest5());
}

}