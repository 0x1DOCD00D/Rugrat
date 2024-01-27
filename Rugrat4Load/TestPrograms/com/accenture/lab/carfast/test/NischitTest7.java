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


public class NischitTest7 extends NischitTest6 implements NischitTestInterface2, NischitTestInterface1 {
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
String[] f0= new String[16];


public long NischitTestInterface2Method0(NischitTest2 var0, String var1, NischitTest0 var2, long var3){
 for(int i = 0; i < 81; i++){
 f0[12] = (String)((f0[5]+f0[14])+(var1+"vnrpwbymfrrb"));
}
for(int i = 0; i < 2; i++){
 var1 = (String)(var1+"pjbexbgibucaujlusbpkycxxiurlaezblfgnaypeobgmgmxuvzhzbquxvpdyowihcgifxig");
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
if(((var1+"hdkdjbly")!=((var1+"ctbjgkieeywnhsfnweugaqpuydsvel")+((var1+"bcthwqqdskgvgrtxxnruggzdbcwql")+(var1+"rwiorylvtckacrwjnbgjpttdyfuoexobryweleq"))))){
var3 = NischitTest6method10(var3,(int)(260));
}
else{
 var3 = NischitTest6method10(var3,(int)(2560));
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
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Python27\\libs\\__UIC__RUGRAT__OJfkM.txt"));
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
bufferedWriter.append("C:\\Python27\\libs\\__UIC__RUGRAT__OJfkM.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (long)var3;

}

public String NischitTestInterface1Method0(int var0, String var1, NischitTest3 var2){
 final NischitTest0 obj_NischitTest0 = new NischitTest0() ;
Thread th22= new Thread(obj_NischitTest0,"th22"){
public void run() { 
 long rv0= obj_NischitTest0.NischitTest0method7(var1,(long)(2648));
int rv1= obj_NischitTest0.NischitTest0method2(var1,null,var0,var1);
Object rv2= obj_NischitTest0.NischitTest0method0(var0,var2,(long)(135),var1);
String rv3= obj_NischitTest0.NischitTest0method17((long)(3392),var1,(long)(2405));
long rv4= obj_NischitTest0.NischitTest0method4(var0,var0);

 }.start() ;
Thread th23= new Thread(obj_NischitTest0,"th23"){
public void run() { 
 int rv0= obj_NischitTest0.NischitTest0method2(var1,null,var0,var1);
int rv1= obj_NischitTest0.NischitTest0method16(var2,null,var1);
String rv2= obj_NischitTest0.NischitTest0method11(var1,var1,var0);
int rv3= obj_NischitTest0.NischitTest0method2(var1,null,var0,var1);
long rv4= obj_NischitTest0.NischitTest0method13((long)(894),null);
long rv5= obj_NischitTest0.NischitTest0method6(null,var1);

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
bufferedWriter= new BufferedWriter(new FileWriter("C:\\WinCoot\\share\\__UIC__RUGRAT__fkj8g.txt"));
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
bufferedWriter.append("C:\\WinCoot\\share\\__UIC__RUGRAT__fkj8g.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (String)var1;

}

public Object NischitTest7method0(NischitTest3 var0, NischitTest5 var1){
 final NischitTest1 obj_NischitTest1 = new NischitTest1() ;
Thread th24= new Thread(obj_NischitTest1,"th24"){
public void run() { 
 Object rv0= obj_NischitTest1.NischitTest1method2((int)(2173),(int)(34));
long rv1= obj_NischitTest1.NischitTest1method6("cqbflvcogblqhleysiplempqyerqhjbudpoqebqtcerfjsfvmvmwfzexlsmovygqmzbxazltetiqkict",(int)(2840));
long rv2= obj_NischitTest1.NischitTest1method6("ffaahrmczklbeikqnyskccst",(int)(1433));
String rv3= obj_NischitTest1.NischitTest1method5("fimdlddjsdwkryyzgabit",(long)(2829));
String rv4= obj_NischitTest1.NischitTest1method11((long)(2266),(int)(747),(long)(2519));

 }.start() ;
System.out.println("NischitTest7 - NischitTest7method0- LineInMethod: 11");
for(int i = 0; i < 66; i++){
 System.out.println("NischitTest7 - NischitTest7method0- LineInMethod: 20");
}
final NischitTest3 obj_NischitTest3 = new NischitTest3() ;
Thread th25= new Thread(obj_NischitTest3,"th25"){
public void run() { 
 String rv0= obj_NischitTest3.NischitTest3method12(null,(long)(2954));
String rv1= obj_NischitTest3.NischitTest3method5(null,(long)(2542));
int rv2= obj_NischitTest3.NischitTest3method1(null,(int)(1108));
String rv3= obj_NischitTest3.NischitTest3method10((int)(2983),(int)(3393));
int rv4= obj_NischitTest3.NischitTest3method7((long)(551),(long)(1994));

 }.start() ;
Thread th26= new Thread(obj_NischitTest3,"th26"){
public void run() { 
 String rv0= obj_NischitTest3.NischitTest3method9("shwhuuiwtrkmknwcjtglhahlzquwrqguilxvcrwqltfccehiovqyjvbvlncicfmm",(long)(80));
int rv1= obj_NischitTest3.NischitTest3method3("hccpfxwullmqizxvykotjnzizrhbm",null);
int rv2= obj_NischitTest3.NischitTest3method4(null,null);
Object rv3= obj_NischitTest3.NischitTest3method0(null,(int)(854));

 }.start() ;
System.out.println("NischitTest7 - NischitTest7method0- LineInMethod: 28");
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\CCP4\\__UIC__RUGRAT__ZEWuT.txt"));
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
bufferedWriter.append("C:\\CCP4\\__UIC__RUGRAT__ZEWuT.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (Object)var0;

}

public static Object NischitTest7method1(String var0, String var1, NischitTest3 var2){
 for(int i = 0; i < 76; i++){
 if( (((var1+"dbzhgvqfruavxtmtwadzqcdcwtufwcrjgeldl")+((var1+var0)+"knrafikiomslmcypdlmutctyk"))==(var1+var0))){
var0 = (String)((((var0+"hjexkthfvwddvytjmesebhgskymtlurrzunttwhfdfociepezdproyuhltdkllkcwhjzlzsoshd")+((var1+"tputyegjqbsuzmzxjpipvgolcttseuojbbyawgtgbybsjfrbrwjtohzxpbbfnnxzulfsvjzdlxdtwxnmgbkcgasbbvryxgflrv")+(var1+"qillgpsvyigqtxisvcnpqlrxzfszbjmbhtlrvtzohdltcaefqtcyotorrfmnuvsqacxwrhaagwkx")))+(var1+"drkdkvgahxvyhmsbsjgdpyprzcbnhpjviqzjwfzky"))+((var0+"rrhgspauohtzwaaiitjyfqtipxxboclwkywzcjbwloeuzadhpapribzfbeaydsvgtbynhwunztiwcyfoltag")+(var1+"jeoftddcwintsbvzzgkmumglnpihfavseczhyosbeerjeyijdjxwjisespotowdikxxuzqbkimtxhhjtrmdswdryzlzlncyza")));
}
}
if( ((var1+var0)==(var1+"ocorkfsyenxkwjirsqiisbrsacyxzbyctjrhchsmkuehssmm"))){
if( ((var0+var1)!=(var0+"uqcfcsptxnolmhgr"))){
var1 = (String)((var1+"uuxgdsvigakwwxrlzlizjncixrsnctebgodguvczhgzpcuywwiwjwillwlbfhgelrkleaoxrkqbfwjiwflerib")+(var0+var1));
}
}
return (Object)var2;

}

public Object NischitTest7method2(long var0, long var1){
 if((((var1/(long)(2752))==(var0+(long)(2160)))||(((var1%(long)(1789))!=(var0*var1))&&(((var0%(long)(1461))!=(var0*(long)(1971)))&&((var1-(long)(1097))<(var1-var0)))))){
System.out.println("NischitTest7 - NischitTest7method2- LineInMethod: 4");
}
else{
 NischitTest6method9("qgnknioekiewyzifichzhsqbycqmxkswsxiw",(int)(3));}
if((((var1-var0)==(var1*var0))||(((var1-(long)(522))*((var0%(long)(2107))*(var0%(long)(660))))>(var0%(long)(2236))))){
System.out.println("NischitTest7 - NischitTest7method2- LineInMethod: 11");
}
else{
 var0 = (long)(((var1/(long)(3385))-(var0/(long)(112)))-(var0-var1));
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\temp\\__UIC__RUGRAT__EBOhT.txt"));
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
bufferedWriter.append("C:\\temp\\__UIC__RUGRAT__EBOhT.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (Object)null;

}

public static Object NischitTest6method1(int var0, int var1){
 return (Object)null;

}

public String NischitTest7method4(int var0, int var1, int var2){
 try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\__UIC__RUGRAT__P8b5g.txt"));
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
bufferedWriter.append("C:\\__UIC__RUGRAT__P8b5g.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (String)"goqovuqotdsgumfekwurmaycoafvvkoydtfqsqlf";

}

public static long NischitTest7method5(NischitTest2 var0, long var1, int var2, long var3){
 switch(((var2*(int)(2648))+(var2+(int)(111)))){
case 0:
var1 = (long)((var3%(long)(890))+((var1/(long)(954))-(var3+var1)));
 break;
case 1:
System.out.println("NischitTest7 - NischitTest7method5- LineInMethod: 5");
 break;
case 2:
NischitTest7method8(var1,var2); break;
case 3:
System.out.println("NischitTest7 - NischitTest7method5- LineInMethod: 14");
 break;
case 4:
var3 = (long)(((var1*var3)-(var3*(long)(1452)))-(var3/(long)(2071)));
 break;
case 5:
System.out.println("NischitTest7 - NischitTest7method5- LineInMethod: 22");
 break;
case 6:
var1 = (long)((var3*var1)+(var3*(long)(2528)));
 break;
case 7:
var3 = (long)(194);
 break;
case 8:
var1 = (long)((var1*(long)(1443))%(long)(108));
 break;
default :
System.out.println("NischitTest7 - NischitTest7method5- LineInMethod: 33");
}
if( (((var2%(int)(3425))<=((var2+(int)(1057))/(int)(1525)))||((((var2+(int)(153))+(var2-(int)(302)))<=(var2*(int)(2464)))&&(((var2-(int)(3091))<=(var2+(int)(908)))&&((var2%(int)(1615))==(var2+(int)(1438))))))){
var3 = (long)(var1%(long)(1025));
}
if( (((var2-(int)(1851))!=(var2/(int)(2906)))&&(((var2-(int)(933))+(var2*(int)(2279)))>((var2*(int)(28))%(int)(2590))))){
if( ((var3-(long)(2799))>=(var3/(long)(1198)))){
if( (((var2-(int)(404))%(int)(2649))>(var2+(int)(3156)))){
var2 = (int)(3306);
}
}
}
return (long)var3;

}

public Object NischitTest7method6(int var0, String var1, long var2){
 if(((var0-(int)(2150))<(var0+(int)(801)))){
System.out.println("NischitTest7 - NischitTest7method6- LineInMethod: 4");
}
else{
 var0 = NischitTest7method9(var1,var1,null);
}
for(int i = 0; i < 55; i++){
 if( ((var0/(int)(2784))<=(var0*(int)(1216)))){
if( ((((var2%(long)(2268))<=(var2+(long)(2481)))&&((var2-(long)(2317))<=(var2-(long)(2038))))||(((var2-(long)(2902))<=(var2*(long)(1304)))&&((var2/(long)(3406))>=(var2*(long)(3070)))))){
var0 = (int)((var0*(int)(3292))*((var0+(int)(2187))/(int)(1034)));
}
}
}
switch((var0*(int)(3452))){
case 0:
NischitTest7method10(var1,var1,null); break;
case 1:
System.out.println("NischitTest7 - NischitTest7method6- LineInMethod: 21");
 break;
case 2:
var2 = (long)((var2-(long)(1162))*(var2/(long)(1074)));
 break;
case 3:
var1 = "mtfkveiauwyibqedftiebswytzhonvptzayheihikjdtrssmcqginympcubbldloucabahcbmlw";
 break;
case 4:
System.out.println("NischitTest7 - NischitTest7method6- LineInMethod: 30");
 break;
case 5:
System.out.println("NischitTest7 - NischitTest7method6- LineInMethod: 33");
 break;
case 6:
f0[11] = (String)((var1+"iosxzofqydtkucrxzyonqazshckbyjgjswlidmpxqfvoucvaltkdsacqduqcshoxsbkxepkgpxghqgpkd")+(var1+"noaiwgqquhztphuzqnlgbjqovxhnwtr"));
 break;
case 7:
System.out.println("NischitTest7 - NischitTest7method6- LineInMethod: 42");
 break;
default :
var1 = "dskkgwmgdvujktfvusyfpbxamumyknmwffefkxsikwxdnizzaqspdernu";
}
return (Object)null;

}

public int NischitTest7method7(int var0, int var1, String var2, int var3){
 if( ((var1*var0)!=(var3*(int)(2131)))){
System.out.println("NischitTest7 - NischitTest7method7- LineInMethod: 2");
}
switch((var3*(int)(2444))){
case 0:
var1 = (int)((var1+var3)%(int)(2420));
 break;
case 1:
System.out.println("NischitTest7 - NischitTest7method7- LineInMethod: 10");
 break;
case 2:
System.out.println("NischitTest7 - NischitTest7method7- LineInMethod: 17");
 break;
case 3:
var3 = (int)(((var1/(int)(2981))*(var0%(int)(3356)))-(var0%(int)(2234)));
 break;
case 4:
System.out.println("NischitTest7 - NischitTest7method7- LineInMethod: 24");
 break;
case 5:
var3 = (int)((var1-(int)(1616))*(var3-var1));
 break;
default :
System.out.println("NischitTest7 - NischitTest7method7- LineInMethod: 33");
}
switch((var1*var0)){
case 0:
f0[12] = (String)(((var2+"yh")+(var2+"ifgtgtcol"))+(var2+"grukozrdgoseamirhrdtrzbuxgkntyeowilprdlgsnmlncycdjbnimctelinwdnldzlv"));
 break;
case 1:
f0[4] = (String)((var2+"wwyucuinofegvhskzplcodlaofdcazbqkiulhecciehbxgdhssirwlkxxsrvxeuqojl")+(f0[13]+f0[11]));
 break;
case 2:
System.out.println("NischitTest7 - NischitTest7method7- LineInMethod: 42");
 break;
case 3:
var0 = (int)((var0*var3)-(var0/(int)(2828)));
 break;
case 4:
System.out.println("NischitTest7 - NischitTest7method7- LineInMethod: 52");
 break;
case 5:
System.out.println("NischitTest7 - NischitTest7method7- LineInMethod: 57");
 break;
case 6:
System.out.println("NischitTest7 - NischitTest7method7- LineInMethod: 61");
 break;
default :
var1 = (int)(var3*var0);
}
return (int)var1;

}

public static String NischitTest7method8(long var0, int var1){
 return (String)"yanophrwtcoshwzlnsnqn";

}

public int NischitTest7method9(String var0, String var1, NischitTest3 var2){
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
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Documents and Settings\\__UIC__RUGRAT__vl8uu.txt"));
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
String logfile = "C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\log.txt";
bufferedWriter = new BufferedWriter( new java.io.FileWriter( logfile, true ) );
bufferedWriter.append("C:\\Documents and Settings\\__UIC__RUGRAT__vl8uu.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (int)(int)(2480);

}

public static String NischitTest7method10(String var0, String var1, NischitTest6 var2){
 if( (((var1+"zfismlaiojgwlwhilusqcoxrxlsommulixmtqwzwfjkcoojogfsxkqukajzfabtybqgutywpwxhnvftszotswpkplycxuqmtvyu")!=((var1+"pmszwbkwxzymksbtgyvzzrochwqrrvscqrwpcnoopzkzruswccdeqoelfgxivxegoigro")+(var1+var0)))&&(((var1+var0)+(var0+var1))!=((var0+"ojplzwwsynklptsxysliiljqcafdyhhqyedrgforftkyu")+(var0+"peftwpqkuh"))))){
if( ((var1+var0)==(var0+"hqqvualjkoxhhxbybywxxgnygmvepcsyrhhjpephpfuobvipue"))){
if( (((var1+"ttuflzieduyajshfovfkfychpchtpmhup")!=(var0+var1))&&(((var1+var0)==(var1+"deacgucfyrcywcmxuubosiyhaovdfxamjyshhdaxzdwjsaqhrnpnqsnznnndvmctpeqxaowhtifyrqjmbcydb"))&&((var1+var0)==(var1+"mozgylxerobssbrxjbwqovuupcafnehzlxgpgfsxbpipxkiueofoxvobjfalzuhorujntwnlqngvexqyojivxjgzx"))))){
if( ((var0+"plumtcjasiqqqelbdmvwpwzienvnsuovyv")!=(var1+"anrynarfamfdiraebtlvnemdjxheofezcdxhwrgzywq"))){
if( ((var0+var1)==((var0+"cxoesjogezxrnfqfhpihz")+(var1+"yenewzfbrmy")))){
if( ((var1+var0)!=(var0+"zuylfquhzcfjelsotdrvcbzzcqtaprypkfpvlozwf"))){
var1 = "xwsioppydnvgadfwd";
}
}
}
}
}
}
for(int i = 0; i < 46; i++){
 var1 = "ohlbuonpixjbypeiheukojl";
}
return (String)var1;

}

public long NischitTest6method10(long var0, int var1){
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
switch(((var1-(int)(3237))-(var1+(int)(2433)))){
case 0:
f0[4] = (String)("yvrbyjqiuufvvwemesfcomixklqrekurvq"+"bnftcpwsemdezgitqsttzjrrxuupyhjhpugacckeaapiqfblfnuxmxidytqfewcltqwpdvnktkptbieddxlz");
 break;
case 1:
System.out.println("NischitTest7 - NischitTest6method10- LineInMethod: 5");
 break;
case 2:
System.out.println("NischitTest7 - NischitTest6method10- LineInMethod: 8");
 break;
case 3:
f0[3] = (String)((f0[14]+f0[7])+(f0[12]+f0[14]));
 break;
case 4:
var0 = (long)((var0+(long)(694))-(var0-(long)(225)));
 break;
case 5:
f0[5] = (String)(((f0[13]+"gibhgxizudskzkwhqflqpvouikqialaydleftvziidvsbkgyrdssltmtqqjlwlobfpjsgjroxltbgcbcwepctmjsikbiq")+(f0[13]+f0[13]))+("eflrpugzzmpgtxpsoaxzlrrweisuutgylxdgagqjfztvjclvefurwlwulsdk"+"opmczrycjszsltmyjoofvlybwsvjdsxnezs"));
 break;
case 6:
var0 = (long)(1132);
 break;
case 7:
System.out.println("NischitTest7 - NischitTest6method10- LineInMethod: 22");
 break;
default :
System.out.println("NischitTest7 - NischitTest6method10- LineInMethod: 28");
}
switch(((var1*(int)(669))/(int)(81))){
case 0:
System.out.println("NischitTest7 - NischitTest6method10- LineInMethod: 31");
 break;
case 1:
var1 = (int)((var1%(int)(2423))+(var1*(int)(1162)));
 break;
case 2:
System.out.println("NischitTest7 - NischitTest6method10- LineInMethod: 41");
 break;
case 3:
System.out.println("NischitTest7 - NischitTest6method10- LineInMethod: 46");
 break;
default :
f0[11] = (String)("tldwtuyhjlvsuzlyaswrijmyazpualmkennfcengrdofrkhcswjivblqewyhjcoalrywpmkgjgqijjfds"+"pflkezwldnjihylnorwvpzkcqlcmaqffzdi");
}
return (long)var0;

}

public static Object NischitTest6method9(String var0, int var1){
 if( (((var1/(int)(1726))==(var1-(int)(2053)))&&((var1*(int)(2575))>(var1*(int)(1255))))){
if( (((var1*(int)(3265))<=((var1*(int)(878))*(var1/(int)(543))))&&((var1*(int)(1187))>(var1*(int)(2693))))){
System.out.println("NischitTest7 - NischitTest6method9- LineInMethod: 4");
}
}
if(((var0+"gc")==(var0+"eouzetolrkgqxtowkpegglcmkmqbuaomwjbxvzhglrwhvggdxwtiaecgtlripmkwrvxbyfnigeepmqwhevxjb"))){
var0 = "glydhjxpckhuxqxaiihmwntdtkfiuslqtegvkyxkgyaqftexlejepgdyjhurhziqngjejmcvbprfpjocacgrlpivzxhtk";
}
else{
 System.out.println("NischitTest7 - NischitTest6method9- LineInMethod: 11");
}
if(((var0+"dmbmbyvmqapejvmeltrhfzhxdvfbhxgcuehkimapwbbpcoroisuybapqgqfgklkthdamrsrvlwearzqmryih")==(var0+"dqgzwsiodpkayszdkzwobkzqwccoyrlmtvyjociumojdismvsszciggmlexwd"))){
var1 = (int)((var1*(int)(3330))-(var1+(int)(1695)));
}
else{
 var0 = (String)((var0+"dm")+(var0+"mjyymtkflhvvraumupopognkowweaeryhilyyclnqxbsouvpcfqyhbqhorpzoembzmdmzagjgcsbyi"));
}
return (Object)null;

}


public static void main(String args[]){
NischitTest7 obj = new NischitTest7();
obj.NischitTestInterface2Method0(new NischitTest2(),"uufuhbgelnwflwyzifoocvh",new NischitTest0(),(long)(2376));
obj.NischitTestInterface1Method0((int)(1856),"betwbqbthqvghkcmsmittuqhjsueksvxjxlqspxmajhvyiythxureezegtsbrdupqbrcyvmwcxgaxar",new NischitTest3());
obj.NischitTest7method0(new NischitTest3(),new NischitTest5());
NischitTest7method1("dyjotansqjgzpmsohxzbtsdedakjcnldbreyjuruoptnggxwvtiolipayshbqrfzoltfxunklkxdimscgmkc","xrzinoaupgtiwerdoiknturxhpswswmgc",new NischitTest3());
obj.NischitTest7method2((long)(2993),(long)(2581));
NischitTest6method1((int)(2630),(int)(381));
obj.NischitTest7method4((int)(1479),(int)(2696),(int)(195));
NischitTest7method5(new NischitTest2(),(long)(737),(int)(2652),(long)(2358));
obj.NischitTest7method6((int)(516),"svbqnhkoohfzrrumumqjzfosa",(long)(2023));
obj.NischitTest7method7((int)(2202),(int)(2715),"krdmxkinggrcfolgrrwrytrimkvwqetahdurrcpfitmwfdmwnukgugzdshgyehyjaxjucuidvwffidkenlteyfhbvrqupo",(int)(427));
NischitTest7method8((long)(3340),(int)(1618));
obj.NischitTest7method9("xwahxyqoqxdommtrbtzawratkoutqiuplkqwyrnvse","ydukrldtwagzpixeigdkrijrlrxnmyrceisoenu",new NischitTest3());
NischitTest7method10("znjtomzgieqtgoxbjjovieaucgtzpvxysnebcxsxyoejarluufpzlhbazdfbxsvajhblenlkjgdsxbjjqqxsafhitapghj","cdnncdetjdtgjmkmmrbtbykfeyhsagdczltonoszcmimklidzmirhxbtsetzneebustkrbaptxcnfzibafsnqnytikqnpajems",new NischitTest6());
obj.NischitTest6method10((long)(3074),(int)(2089));
NischitTest6method9("susbrczsnhkpadufuxbhsldpaacqgqqepenxoidvbbipafhlobfzfmipumdmzjlvrj",(int)(1053));
}

}