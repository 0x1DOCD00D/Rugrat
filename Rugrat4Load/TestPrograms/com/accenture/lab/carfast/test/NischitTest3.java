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


public class NischitTest3 implements Runnable  {
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
long f0;
static String f1;
static long[] f2= new long[25];
static NischitTest0[] f3= new NischitTest0[9];


public Object NischitTest3method0(NischitTest2 var0, int var1){
 try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\WinCoot\\__UIC__RUGRAT__KIOiz.txt"));
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
bufferedWriter.append("C:\\WinCoot\\__UIC__RUGRAT__KIOiz.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (Object)var0;

}

public static int NischitTest3method1(NischitTest6 var0, int var1){
 if(((var1%(int)(2000))<(var1-(int)(2840)))){
System.out.println("NischitTest3 - NischitTest3method1- LineInMethod: 4");
}
else{
 NischitTest3method4(var0,null);}
for(int i = 0; i < 56; i++){
 if( (((var1+(int)(1537))<((var1-(int)(2822))*(var1*(int)(1890))))&&((var1/(int)(977))>(var1-(int)(1252))))){
NischitTest3method7((long)(3307),(long)(3253));}
}
if( ((var1%(int)(3177))==(var1+(int)(3275)))){
if( ((var1*(int)(739))>((var1+(int)(3407))*(var1%(int)(873))))){
if( ((var1-(int)(2321))>(var1%(int)(3436)))){
System.out.println("NischitTest3 - NischitTest3method1- LineInMethod: 20");
}
}
}
synchronized(this){

 }
return (int)var1;

}

public static String NischitTest3method2(long var0, NischitTest6 var1){
 for(int i = 0; i < 92; i++){
 System.out.println("NischitTest3 - NischitTest3method2- LineInMethod: 2");
}
synchronized(this){
if( ((var0-(long)(3335))==((var0*(long)(1200))/(long)(1354)))){
if( ((f2[5]+f2[10])>=(var0+(long)(1218)))){
if( ((var0*(long)(1981))>=(var0-(long)(1169)))){
var0 = (long)(1565);
}
}
}

 }
if(((var0/(long)(2342))<(f2[1]*f2[14]))){
NischitTest3method11((int)(2050),"zcvpxqexnvztjfipilfuywfxrexnidhnaacuvrspr","cjxqnpqifimirhfhidteowpcrexwrewtadxmertdopbzeurjjpnbgjqwrg");}
else{
 f3[1] = new NischitTest0();
}
if(((var0-(long)(3270))<(var0*(long)(741)))){
var0 = (long)(f2[16]+f2[23]);
}
else{
 NischitTest3method7(var0,var0);}
if(((var0-(long)(2272))==(var0-(long)(477)))){
var0 = (long)(2736);
}
else{
 var0 = (long)(17);
}
if(((var0%(long)(3274))<=(var0+(long)(1927)))){
NischitTest3method11((int)(1575),"gqsctpdpk","qbnioibwamlihbtmwqgwx");}
else{
 System.out.println("NischitTest3 - NischitTest3method2- LineInMethod: 34");
}
synchronized(this){
if( ((var0/(long)(1493))>=((((var0/(long)(1481))-((var0*(long)(2154))+(var0*(long)(1911))))-(var0+(long)(1586)))/(long)(3000)))){
if( ((var0-(long)(2255))>(((var0-(long)(1865))+(var0+(long)(372)))*(var0-(long)(965))))){
var0 = (long)(2655);
}
}

 }
synchronized(this){
if( ((((f2[4]-f2[11])*(f2[3]-f2[3]))/(long)(2657))>=(var0-(long)(1526)))){
System.out.println("NischitTest3 - NischitTest3method2- LineInMethod: 43");
}

 }
return (String)"bcbqcpxbqvsymxueacdcqbidqmk";

}

public int NischitTest3method3(String var0, NischitTest0 var1){
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
synchronized(this){
if((((var0+"sukglslnoyxubrgmajpgkoomeanzoptcfmbjltghpnnvnjlpmufmefdkmerceajvwychwjweffgimdpvtlikscmllmq")==(var0+"ptnagwujvmijuwewyrchsdgfwn"))&&((var0+"eiuodxcztaajamvkvnmagswupszzvsowuzroysltzmvdmerpshebmwfxurtbrtnavktmboyxqwqyiylld")==(var0+"kqfzhwntulujfvhvvszfvtja")))){
f0 = (long)(((((long)(2198)-(long)(2489))*((long)(2092)-(long)(1436)))*((long)(1416)/(long)(1824)))*((long)(129)+(long)(1499)));
}
else{
 System.out.println("NischitTest3 - NischitTest3method3- LineInMethod: 5");
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
bufferedReader= new BufferedReader(new FileReader(getNextFile("C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\log.txt","C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\config.xml")));
String line = null;
while((line = bufferedReader.readLine()) != null){
System.out.println("Read line = " + line );
}
}
catch(Exception e){
e.printStackTrace();
}
synchronized(this){
for(int i = 0; i < 59; i++){
 if( (((var0+"huyntwbvxkecxlvrxtatnzhyadesgahwph")+(var0+"lxtawomkuhci"))==(var0+"awrnwavtxdmnydjvcgbxtrtltololsdkvjasmwjhlsycutjtawblkzpveclkgxpmgtcozc"))){
NischitTest3method9(var0,(long)(1241));}
}

 }
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\__UIC__RUGRAT__AqeI86z.txt"));
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
bufferedWriter.append("C:\\__UIC__RUGRAT__AqeI86z.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (int)(int)(272);

}

public static int NischitTest3method4(NischitTest6 var0, NischitTest1 var1){
 System.out.println("NischitTest3 - NischitTest3method4- LineInMethod: 9");
for(int i = 0; i < 8; i++){
 System.out.println("NischitTest3 - NischitTest3method4- LineInMethod: 20");
}
for(int i = 0; i < 77; i++){
 System.out.println("NischitTest3 - NischitTest3method4- LineInMethod: 30");
}
System.out.println("NischitTest3 - NischitTest3method4- LineInMethod: 37");
for(int i = 0; i < 29; i++){
 System.out.println("NischitTest3 - NischitTest3method4- LineInMethod: 48");
}
return (int)(int)(2016);

}

public String NischitTest3method5(NischitTest2 var0, long var1){
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
for(int i = 0; i < 22; i++){
 System.out.println("NischitTest3 - NischitTest3method5- LineInMethod: 2");
}
synchronized(this){
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\PerfLogs\\__UIC__RUGRAT__XL8aQ.txt"));
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
bufferedWriter.write("Writing line 79 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 80 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 81 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 82 to file");
bufferedWriter.newLine();
bufferedWriter.write("Writing line 83 to file");
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
bufferedWriter.append("C:\\PerfLogs\\__UIC__RUGRAT__XL8aQ.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}

 }
return (String)"boiakxsfjgjpgeyzcdx";

}

public String NischitTest3method6(long var0, NischitTest5 var1){
 if(((var0+(long)(1342))>(f0-(long)(3242)))){
f0 = (long)((var0%(long)(3265))-(var0%(long)(802)));
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
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\ccp4temp\\__UIC__RUGRAT__s22EP.txt"));
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
String logfile = "C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\log.txt";
bufferedWriter = new BufferedWriter( new java.io.FileWriter( logfile, true ) );
bufferedWriter.append("C:\\ccp4temp\\__UIC__RUGRAT__s22EP.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (String)"ppqnfjyatajnncxucwjodqbnpuaedplhkjuwipy";

}

public static int NischitTest3method7(long var0, long var1){
 for(int i = 0; i < 42; i++){
 if( ((var1+var0)!=(f2[15]-f2[24]))){
var0 = (long)(2491);
}
}
synchronized(this){

 }
synchronized(this){
if( ((var1-var0)<(var0/(long)(3263)))){
NischitTest3method9("voqmhtfdehilgvreijsryfqqjdbkrsmqnwamkb",var0);}

 }
synchronized(this){
if( ((var1+(long)(982))<=(var0-(long)(1303)))){
f1 = (String)("eyfvvzaqajnjvgqigpctswgnjdny"+"weqbvixgwtyrzdnsgevjbkhrtigiwlewmzydgmavtzdhbizfsbulonpnylrlvczmnelwkow");
}

 }
if( ((var0+var1)>((var0%(long)(715))*((var1%(long)(2361))*((var0-(long)(351))*(var1+(long)(365))))))){
if( ((var0+(long)(562))<=(var0+var1))){
if( ((f2[23]-f2[23])!=(var1*var0))){
if( (((var0*var1)+(var0+(long)(1489)))==((f2[5]%(long)(293))/(long)(1591)))){
System.out.println("NischitTest3 - NischitTest3method7- LineInMethod: 49");
}
}
}
}
return (int)(int)(3076);

}

public long NischitTest3method8(int var0, int var1, String var2){
 if( ((var1-(int)(2230))<(var1+var0))){
var0 = (int)((var1/(int)(3209))%(int)(2899));
}
switch(((var0+var1)*(var1*var0))){
case 0:
NischitTest3method10(var0,var1); break;
case 1:
System.out.println("NischitTest3 - NischitTest3method8- LineInMethod: 8");
 break;
case 2:
System.out.println("NischitTest3 - NischitTest3method8- LineInMethod: 12");
 break;
case 3:
System.out.println("NischitTest3 - NischitTest3method8- LineInMethod: 16");
 break;
case 4:
System.out.println("NischitTest3 - NischitTest3method8- LineInMethod: 19");
 break;
case 5:
var2 = "cchytsolarseldvmzyreidubuyblqnlbqhplgycwiutrtxtcrhvmuapqvhsbbvvgroiayqvpgthmxjjiwbcarm";
 break;
case 6:
System.out.println("NischitTest3 - NischitTest3method8- LineInMethod: 25");
 break;
case 7:
f0 = (long)(((f0/(long)(752))*((f0+(long)(833))+(f0*(long)(386))))*((long)(2511)+(long)(3385)));
 break;
default :
System.out.println("NischitTest3 - NischitTest3method8- LineInMethod: 31");
}
if(((var1*var0)!=(var1/(int)(3171)))){
System.out.println("NischitTest3 - NischitTest3method8- LineInMethod: 40");
}
else{
 var0 = (int)(var1+(int)(201));
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
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Documents and Settings\\__UIC__RUGRAT__bFT7R.txt"));
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
bufferedWriter.append("C:\\Documents and Settings\\__UIC__RUGRAT__bFT7R.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (long)(long)(965);

}

public static String NischitTest3method9(String var0, long var1){
 if( ((var1+(long)(3239))==(var1%(long)(150)))){
System.out.println("NischitTest3 - NischitTest3method9- LineInMethod: 2");
}
for(int i = 0; i < 53; i++){
 if( ((((var1*(long)(1087))*(var1*(long)(469)))-(var1-(long)(2772)))==(var1-(long)(676)))){
var0 = (String)((var0+"kedjgmwwtgpvgyzchrjglfuvripykizsdzspctamcoyjlmlbgmyydkehsoqxavdjoaekgvqolvrqmftrqxuzogea")+(var0+"mcstcrujvzhmlyjnelarnztznippwrglxgwbrfeyehqhhhzzwfgnjdaygbmhlhdu"));
}
}
return (String)var0;

}

public String NischitTest3method10(int var0, int var1){
 synchronized(this){
switch((var1*(int)(2537))){
case 0:
var0 = (int)((var0+var1)+(var0*var1));
 break;
case 1:
var1 = (int)(1346);
 break;
case 2:
System.out.println("NischitTest3 - NischitTest3method10- LineInMethod: 7");
 break;
case 3:
System.out.println("NischitTest3 - NischitTest3method10- LineInMethod: 12");
 break;
case 4:
var0 = (int)(2176);
 break;
case 5:
System.out.println("NischitTest3 - NischitTest3method10- LineInMethod: 21");
 break;
default :
var0 = (int)(910);
}

 }
synchronized(this){
if( ((var1*var0)>=(var1+var0))){
var0 = (int)((var0/(int)(1397))-(var0/(int)(1677)));
}

 }
if( ((var1*var0)>((var0-(int)(1889))-(var0+var1)))){
if( ((var0/(int)(1961))<=(var1%(int)(672)))){
if( (((var0/(int)(2692))+(var1+(int)(1723)))<=(((var0+(int)(1462))-(var1+(int)(1552)))+((var1+var0)%(int)(2500))))){
if( (((var0*var1)%(int)(2798))>(((var1-var0)-(var0/(int)(2240)))*(var1*var0)))){
if( ((var1*(int)(2297))<((var0-var1)*(var1+var0)))){
var1 = (int)((var0+var1)+(var0*var1));
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
synchronized(this){
for(int i = 0; i < 25; i++){
 var1 = (int)(1668);
}

 }
switch((var0*(int)(3317))){
case 0:
f0 = (long)(((long)(438)-(long)(2511))%(long)(1606));
 break;
case 1:
f0 = (long)(((long)(1179)+(long)(3130))*((long)(1591)*(long)(2334)));
 break;
case 2:
var0 = (int)(1641);
 break;
case 3:
System.out.println("NischitTest3 - NischitTest3method10- LineInMethod: 54");
 break;
default :
var1 = (int)(1866);
}
return (String)"kyguukwwykiomanujjgggueyaxxhrbubofzbuqxlmq";

}

public static String NischitTest3method11(int var0, String var1, String var2){
 synchronized(this){
for(int i = 0; i < 8; i++){
 if( (((var2+"abeutlyozjsvydonqwuhyfoxohsklrdnkgehupiagdsxhwfynidvzbyglwtydnrmwhysytfqozmndnmjnokivmvbjrntbecpaqz")!=(var1+"mfgwxsfbrzcjonyqjoombyxrhqrevqicmquslq"))||((var1+var2)==(var1+"xhhmlpugalkqfjlqgqamrbt")))){
System.out.println("NischitTest3 - NischitTest3method11- LineInMethod: 4");
}
}

 }
synchronized(this){
if( (((var0+(int)(2970))>(var0+(int)(2110)))&&(((var0-(int)(2825))*((var0+(int)(1789))*(var0*(int)(509))))==(((var0/(int)(1212))%(int)(635))+(var0+(int)(1792)))))){
System.out.println("NischitTest3 - NischitTest3method11- LineInMethod: 7");
}

 }
synchronized(this){
switch((var0+(int)(2199))){
case 0:
f3[1] = new NischitTest0();
 break;
case 1:
System.out.println("NischitTest3 - NischitTest3method11- LineInMethod: 14");
 break;
case 2:
NischitTest3method12(null,(long)(933)); break;
default :
var1 = (String)((var2+"ldgpxrdqlglijgqswmosjwfuqnclensadflymga")+(var1+"zkvsvivqgailfchblijpc"));
}

 }
return (String)var1;

}

public static String NischitTest3method12(NischitTest7 var0, long var1){
 synchronized(this){
if((((f2[6]*f2[17])+(f2[16]/(long)(128)))<(f2[8]*f2[0]))){
System.out.println("NischitTest3 - NischitTest3method12- LineInMethod: 4");
}
else{
 System.out.println("NischitTest3 - NischitTest3method12- LineInMethod: 5");
}

 }
return (String)"yxhyaeqifdapzbcggmufrjtunzvtjhcug";

}


public static void main(String args[]){
NischitTest3 obj = new NischitTest3();
obj.NischitTest3method0(new NischitTest2(),(int)(2596));
NischitTest3method1(new NischitTest6(),(int)(1454));
NischitTest3method2((long)(2697),new NischitTest6());
obj.NischitTest3method3("awsupiwp",new NischitTest0());
NischitTest3method4(new NischitTest6(),new NischitTest1());
obj.NischitTest3method5(new NischitTest2(),(long)(1181));
obj.NischitTest3method6((long)(2410),new NischitTest5());
NischitTest3method7((long)(2725),(long)(3156));
obj.NischitTest3method8((int)(3451),(int)(2320),"cifxqwmmrxqtsqmj");
NischitTest3method9("bghlqjgkyisoncibsvlzhexlttecyesuucriattitgzbkaphehdnkjuvgrobajkocshyvuarydlycvflvmlzszcdw",(long)(2999));
obj.NischitTest3method10((int)(3108),(int)(361));
NischitTest3method11((int)(3067),"fnpcwchrubfjjptkjruohihfupprkqwdiocgqyuwgngwohxavufurlmhaofzgtauhnojlpdiiampzdiib","vxpzvjkmzbnseauklpimelhqwcqlz");
NischitTest3method12(new NischitTest7(),(long)(641));
}

public void run(){
      try{
NischitTest3 obj = new NischitTest3();
obj.NischitTest3method0(new NischitTest2(),(int)(2596));
NischitTest3method1(new NischitTest6(),(int)(1454));
NischitTest3method2((long)(2697),new NischitTest6());
obj.NischitTest3method3("awsupiwp",new NischitTest0());
NischitTest3method4(new NischitTest6(),new NischitTest1());
obj.NischitTest3method5(new NischitTest2(),(long)(1181));
obj.NischitTest3method6((long)(2410),new NischitTest5());
NischitTest3method7((long)(2725),(long)(3156));
obj.NischitTest3method8((int)(3451),(int)(2320),"cifxqwmmrxqtsqmj");
NischitTest3method9("bghlqjgkyisoncibsvlzhexlttecyesuucriattitgzbkaphehdnkjuvgrobajkocshyvuarydlycvflvmlzszcdw",(long)(2999));
obj.NischitTest3method10((int)(3108),(int)(361));
NischitTest3method11((int)(3067),"fnpcwchrubfjjptkjruohihfupprkqwdiocgqyuwgngwohxavufurlmhaofzgtauhnojlpdiiampzdiib","vxpzvjkmzbnseauklpimelhqwcqlz");
NischitTest3method12(new NischitTest7(),(long)(641));
}
} catch (InterruptedException e) {
 e.printStackTrace();
}

}