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


public class NischitTest4 implements NischitTestInterface0, Runnable  {
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
String[] f0= new String[18];
long[] f1= new long[18];
static long f2;
static NischitTest0[] f3= new NischitTest0[23];
int[] f4= new int[4];


public long NischitTestInterface0Method0(int var0, long var1){
 if( (((var0*(int)(1085))-(var0*(int)(257)))>=(var0-(int)(1713)))){
System.out.println("NischitTest4 - NischitTestInterface0Method0- LineInMethod: 2");
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\__UIC__RUGRAT__VQjyd.txt"));
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
bufferedWriter.append("C:\\__UIC__RUGRAT__VQjyd.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Config.Msi\\__UIC__RUGRAT__myz4l.txt"));
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
String logfile = "E:\\Projects\\RUGRATLOAD\\log.txt";
bufferedWriter = new BufferedWriter( new java.io.FileWriter( logfile, true ) );
bufferedWriter.append("C:\\Config.Msi\\__UIC__RUGRAT__myz4l.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (long)var1;

}

public long NischitTest4method0(int var0, long var1, String var2){
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
(new Thread(new NischitTest6())).start();
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
bufferedWriter= new BufferedWriter(new FileWriter("C:\\__UIC__RUGRAT__E3RaFT5BWIS.txt"));
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
String logfile = "E:\\Projects\\RUGRATLOAD\\log.txt";
bufferedWriter = new BufferedWriter( new java.io.FileWriter( logfile, true ) );
bufferedWriter.append("C:\\__UIC__RUGRAT__E3RaFT5BWIS.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
if( ((var1+(long)(2551))==(var1%(long)(698)))){
if( ((var0+(int)(1887))>((var0+(int)(1011))-(var0*(int)(1752))))){
var1 = (long)(var1-(long)(1721));
}
}
for(int i = 0; i < 12; i++){
 f4[3] = (int)((f4[0]*f4[3])-((var0-(int)(1467))+(var0-(int)(1979))));
}
return (long)var1;

}

public static long NischitTest4method1(int var0, String var1){
 return (long)(long)(22);

}

public int NischitTest4method2(int var0, String var1){
 for(int i = 0; i < 11; i++){
 if( ((f4[0]/(int)(1820))==(var0-(int)(2521)))){
System.out.println("NischitTest4 - NischitTest4method2- LineInMethod: 4");
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
if((((var1+"vsknfzdwggykxqgghiqrtguzsfwzqhzxqpbxunesiwuqiratbpbjsdeuhdskq")!=(var1+"kvndgqeddodiojzdadcqeqqildhmpvobxffkmobxpykpatepobarpbbrokxbbhyaozzqeeottiifddqhibvwi"))&&((((var1+"kqoiyoyakjujrcsltzwjjopbcuvmcxxnpzsyqh")+(var1+"gplgmlxazwzaniqedmdwty"))==(f0[6]+f0[16]))||(((var1+"zzhsaatdnnclxkezibopdkzzqjuymhpqfncrwfzqfk")+(var1+"qizq"))!=(var1+"cnoufypadpwqcitfthutkwzeggkswwiyyeiytbawvxqiknriqhtjekqdnxsiwunaqawtrblswesvfzqdtaqpttfpbyfvowfl"))))){
System.out.println("NischitTest4 - NischitTest4method2- LineInMethod: 11");
}
else{
 System.out.println("NischitTest4 - NischitTest4method2- LineInMethod: 14");
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
if(((var1+"utentdugfrtznoermtobuzvypnisiuyhxyzxwkcwmqlyuriteykkszaaiynpczmuhxpnlkiptenoofsnpouhqpznfzycz")!=((var1+"fwrhwwrrdlvaqfkhwczghecywlxwdkklgxgvyoauomnrvfmwfvlorfneovcduiahrlokmv")+(var1+"dteygchoxcznyvwiyucivaueldkblzozpnpaxqsr")))){
System.out.println("NischitTest4 - NischitTest4method2- LineInMethod: 22");
}
else{
 var1 = (String)((var1+"znhdveatvpbtugjba")+(var1+"zfgzbxxkiiuwthxinzccpilpovsjhzxwgsqgprbjrtvodryblwdbrjzvwod"));
}
for(int i = 0; i < 1; i++){
 if( (((var0-(int)(1140))<(((var0-(int)(3416))+(var0-(int)(2148)))*(var0*(int)(1088))))&&((var0+(int)(2136))>(var0-(int)(3178))))){
if( ((var1+"vozjwnaiafbsexicbjucjtnnlqzoonehdhkbiuklcynsdbjvgernu")==(var1+"suqvocpwhqqvstzejgmvrbalswehhbrnrrehlbomfwqodsdcumceuetpuaskckmfvcvcckkibixpdrsuquvkvsmjzhzqrn"))){
if( ((var0+(int)(1432))<=(var0/(int)(2336)))){
if( ((f0[11]+f0[11])!=((var1+"qalquqbdxfaobaiobcxnrrfjnsuuimepzdevsq")+(var1+"wlkwbbnkznqriloppymetfiliapnrlhpxxaff")))){
if( ((var0*(int)(2735))!=(var0%(int)(522)))){
var0 = (int)((var0%(int)(1035))/(int)(3253));
}
}
}
}
}
}
switch(((var0+(int)(1955))*(var0*(int)(1948)))){
case 0:
System.out.println("NischitTest4 - NischitTest4method2- LineInMethod: 39");
 break;
case 1:
System.out.println("NischitTest4 - NischitTest4method2- LineInMethod: 42");
 break;
case 2:
var0 = NischitTest4method3(null,var1,var1);
 break;
case 3:
var1 = (String)(((f0[6]+f0[3])+(f0[7]+f0[11]))+((var1+"shcziygxglffjdbkkjzuiuwwauzmrerfjtumsfbcsisvhgdtyporzsqsateampoyelqacnnfpddavvy")+(((var1+"cawimtyqznmqapuksdejtdyrydyjrvdzifpvbqhqmitjupsemfnrjdfywcmnz")+(var1+"isdxpkibxrxznkndilkyozelhrcfypuciigzwutxlrmnsbgtidqukwqccqlkdgrkvtdixqvuzxhtryqfffryugmprszuqz"))+(var1+"xdwsf"))));
 break;
case 4:
System.out.println("NischitTest4 - NischitTest4method2- LineInMethod: 51");
 break;
case 5:
System.out.println("NischitTest4 - NischitTest4method2- LineInMethod: 56");
 break;
default :
System.out.println("NischitTest4 - NischitTest4method2- LineInMethod: 59");
}
if(((f4[3]*(int)(3347))<(var0+(int)(2900)))){
System.out.println("NischitTest4 - NischitTest4method2- LineInMethod: 65");
}
else{
 var1 = "nabnsqaytozyybokdktvtysveyfzznekanpqqlcsekqcmqmcbhupiwtgzcikuvtdiuwzgdceqccduxjnclczekudnzygfwhutumfp";
}
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\WINDOWS\\java\\classes\\__UIC__RUGRAT__lb2IY.txt"));
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
bufferedWriter.append("C:\\WINDOWS\\java\\classes\\__UIC__RUGRAT__lb2IY.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (int)var0;

}

public static int NischitTest4method3(NischitTest9 var0, String var1, String var2){
 for(int i = 0; i < 30; i++){
 System.out.println("NischitTest4 - NischitTest4method3- LineInMethod: 2");
}
for(int i = 0; i < 7; i++){
 System.out.println("NischitTest4 - NischitTest4method3- LineInMethod: 8");
}
return (int)(int)(3120);

}

public static long NischitTest4method4(int var0, long var1){
 if(((((var1-(long)(2790))%(long)(2781))*((var1+(long)(2196))/(long)(2549)))!=(var1+(long)(3260)))){
f3[18] = new NischitTest0();
}
else{
 f2 = (long)(f2+(long)(989));
}
return (long)var1;

}


public static void main(String args[]){
NischitTest4 obj = new NischitTest4();
obj.NischitTestInterface0Method0((int)(3143),(long)(2340));
obj.NischitTest4method0((int)(47),(long)(1680),"headcroykjjuyifirkuxfxwikib");
NischitTest4method1((int)(3323),"hvvtuuvthrkiajqnw");
obj.NischitTest4method2((int)(987),"gmahfcxm");
NischitTest4method3(new NischitTest9(),"cublfotimirrsyrqohysxwxkxnbkznnjxejxanzuicucydemvsgccczxcnmnjcpawnjqeoyxzizaozbtkyqp","hoyxtxrgpsilycrzuxjpgwenslwlnvaknjjigasrgtmddahqxnewlixfm");
NischitTest4method4((int)(723),(long)(70));
}

public void run(){
NischitTest4 obj = new NischitTest4();
obj.NischitTestInterface0Method0((int)(3143),(long)(2340));
obj.NischitTest4method0((int)(47),(long)(1680),"headcroykjjuyifirkuxfxwikib");
NischitTest4method1((int)(3323),"hvvtuuvthrkiajqnw");
obj.NischitTest4method2((int)(987),"gmahfcxm");
NischitTest4method3(new NischitTest9(),"cublfotimirrsyrqohysxwxkxnbkznnjxejxanzuicucydemvsgccczxcnmnjcpawnjqeoyxzizaozbtkyqp","hoyxtxrgpsilycrzuxjpgwenslwlnvaknjjigasrgtmddahqxnewlixfm");
NischitTest4method4((int)(723),(long)(70));
}

}