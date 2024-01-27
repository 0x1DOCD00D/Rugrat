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


public class NischitTest1 implements NischitTestInterface2, Runnable  {
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
static int f0;
String f1;
static NischitTest4 f2;
long[] f3= new long[6];
static String f4;
static int[] f5= new int[18];
static int f6;
static NischitTest5 f7;


public long NischitTestInterface2Method0(NischitTest2 var0, String var1, NischitTest0 var2, long var3){
 if((((var3-(long)(2650))>(f3[5]+(long)(638)))&&((var3*(long)(1292))==(f3[3]*f3[5])))){
var1 = NischitTest1method5(var1,var3);
}
else{
 var0 = new NischitTest2();
}
if(((var3*(long)(2879))<(var3%(long)(3064)))){
f1 = (String)(((var1+"bhlvibxkaeqtyomtcrhmtotmabmzddnufbniqrthvtnamxcjisdcghsafirnesdqbk")+(var1+"hewxciszrrwcjqftysqxabzvdjruqmdgwpwugcrnbeimltazurshurcqsoynbyiiklfbyarnxfkcrdgyuruniefdlfyfsnogezm"))+(var1+"qkkxjkbueafgsqhttwlgimivgnhsbzyfadltntn"));
}
else{
 System.out.println("NischitTest1 - NischitTestInterface2Method0- LineInMethod: 11");
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
if( ((((var3-(long)(2476))>(var3-(long)(1385)))&&((var3*(long)(2340))<(var3+(long)(985))))||((f3[4]+f3[5])>(var3%(long)(1648))))){
var2 = new NischitTest0();
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
if( ((var1+"biobqmovaaqhcwbsehffqqcmitrnvvyyyxhveacvetyyryufgshmcyjgijzqcuhrmpgftsmpnztzozdugixphhreeapoloehumel")==(var1+"ghpdgdsegbnbetqiuanbdlodzytntfpsfdmoqgdzlsvsvfbqbsjojwgyflswhzbrfcbgryuufsppk"))){
if( (((var3*(long)(2085))%(long)(1521))>(var3-(long)(1545)))){
if( ((var1+"wyrvcyeszdjozyreknujmywssulrkwwit")!=(var1+"umawoovvtssfbwxrtpwaxbzmspqmlkgytymnuhoglavkrkznuswoenbitlgjvosxtfmptuagfcpglyggfxrxja"))){
if( ((var3*(long)(2107))<=(var3-(long)(575)))){
System.out.println("NischitTest1 - NischitTestInterface2Method0- LineInMethod: 24");
}
}
}
}

 }
synchronized(this){
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\WinCoot\\doc\\__UIC__RUGRAT__CAcIg.txt"));
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
String logfile = "C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\log.txt";
bufferedWriter = new BufferedWriter( new java.io.FileWriter( logfile, true ) );
bufferedWriter.append("C:\\WinCoot\\doc\\__UIC__RUGRAT__CAcIg.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}

 }
return (long)var3;

}

public static int NischitTest1method0(long var0, long var1){
 final NischitTest3 obj_NischitTest3 = new NischitTest3() ;
Thread th3= new Thread(obj_NischitTest3,"th3"){
public void run() { 
 String rv0= obj_NischitTest3.NischitTest3method6(var1,null);
String rv1= obj_NischitTest3.NischitTest3method6(var0,null);
String rv2= obj_NischitTest3.NischitTest3method12(null,var1);
Object rv3= obj_NischitTest3.NischitTest3method0(null,(int)(46));
String rv4= obj_NischitTest3.NischitTest3method6(var0,null);

 }.start() ;
synchronized(this){
if(((var0*(long)(1638))<(var0+(long)(2807)))){
f7 = new NischitTest5();
}
else{
 System.out.println("NischitTest1 - NischitTest1method0- LineInMethod: 5");
}

 }
return (int)(int)(1144);

}

public String NischitTest1method1(int var0, long var1){
 switch((var0+(int)(1219))){
case 0:
var0 = NischitTest1method10(var0,var1);
 break;
case 1:
System.out.println("NischitTest1 - NischitTest1method1- LineInMethod: 5");
 break;
case 2:
var0 = (int)((var0-(int)(3437))+(var0+(int)(2631)));
 break;
case 3:
NischitTest1method3(null,var0); break;
case 4:
System.out.println("NischitTest1 - NischitTest1method1- LineInMethod: 18");
 break;
case 5:
f1 = (String)(("pmquhlipjwfdlttyknjwguprovbp"+"hvivolzrkhfsdlpr")+("zubwiiczobvaxcqaovnlxrexbfekwrepjaymkwtieyuagdudskyngitomouiibpchuqb"+"pkmeenkzkgkarzyitfhsmnhuxosgufyhwzsqlmvqdxydjray"));
 break;
case 6:
NischitTest1method11(var1,var0,var1); break;
default :
var0 = (int)((var0-(int)(471))+((var0*(int)(2888))*(var0/(int)(405))));
}
synchronized(this){
switch((var0+(int)(1659))){
case 0:
var0 = (int)((var0%(int)(1234))*(var0+(int)(105)));
 break;
case 1:
System.out.println("NischitTest1 - NischitTest1method1- LineInMethod: 36");
 break;
case 2:
var0 = (int)((var0+(int)(2125))+(var0*(int)(106)));
 break;
case 3:
System.out.println("NischitTest1 - NischitTest1method1- LineInMethod: 46");
 break;
default :
System.out.println("NischitTest1 - NischitTest1method1- LineInMethod: 52");
}

 }
return (String)"ckpktkwvrizsegx";

}

public static Object NischitTest1method2(int var0, int var1){
 for(int i = 0; i < 49; i++){
 f2 = new NischitTest4();
}
switch(((var0%(int)(2991))-((var1*f6)*(var0/(int)(945))))){
case 0:
System.out.println("NischitTest1 - NischitTest1method2- LineInMethod: 5");
 break;
case 1:
var1 = (int)(((var0*(int)(2261))-(var1*(int)(386)))/(int)(296));
 break;
case 2:
var1 = (int)(var1*(int)(2253));
 break;
case 3:
System.out.println("NischitTest1 - NischitTest1method2- LineInMethod: 16");
 break;
case 4:
System.out.println("NischitTest1 - NischitTest1method2- LineInMethod: 22");
 break;
case 5:
NischitTest1method4("onojzbopzpasetpnyq",var1,var0,"dpomdvszbsopefjqukucraycqyaqsuxpmzhtycesnvmruhqnccpjljvhnriebyjmuvuffzcxlrbvtjylfyr"); break;
case 6:
f5[3] = (int)((f0*(int)(1586))*(var0+(int)(2058)));
 break;
case 7:
System.out.println("NischitTest1 - NischitTest1method2- LineInMethod: 32");
 break;
default :
var0 = (int)((var1-(int)(41))*(var1%(int)(2287)));
}
switch(((var1/(int)(1658))+((var1%(int)(1262))*(var1-(int)(2960))))){
case 0:
f7 = new NischitTest5();
 break;
case 1:
NischitTest1method11((long)(1649),var0,(long)(669)); break;
case 2:
System.out.println("NischitTest1 - NischitTest1method2- LineInMethod: 47");
 break;
case 3:
f2 = new NischitTest4();
 break;
case 4:
System.out.println("NischitTest1 - NischitTest1method2- LineInMethod: 53");
 break;
case 5:
var1 = (int)(2485);
 break;
case 6:
var0 = (int)((var0%(int)(206))%(int)(2104));
 break;
default :
System.out.println("NischitTest1 - NischitTest1method2- LineInMethod: 61");
}
return (Object)null;

}

public long NischitTest1method3(NischitTest0 var0, int var1){
 if( (((var1/(int)(1948))+(var1*(int)(1426)))!=(var1-(int)(2605)))){
if( ((var1-(int)(899))<(var1-(int)(3039)))){
var0 = new NischitTest0();
}
}
for(int i = 0; i < 1; i++){
 f3[4] = (long)((long)(336)+(long)(1846));
}
synchronized(this){
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\temp\\__UIC__RUGRAT__2lPEnDfiiMf.txt"));
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
bufferedWriter.append("C:\\temp\\__UIC__RUGRAT__2lPEnDfiiMf.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}

 }
return (long)(long)(1138);

}

public static long NischitTest1method4(String var0, int var1, int var2, String var3){
 synchronized(this){
if( ((var0+"jtjgcmcuvlgzoyuiomxdgrgdlbjbxhqytmgarmaxcfkishixwfktpxh")!=(f4+"wisodslperfvobevzrlxsiw"))){
if( ((((var3+var0)!=(var0+var3))&&((f4+"zucpcimigvv")==(var0+var3)))||((var0+var3)==(var0+"eeneyxvsffckqazhudsfuftghdp")))){
f6 = (int)(((f0/(int)(1660))*(f6*(int)(1334)))/(int)(2559));
}
}

 }
for(int i = 0; i < 84; i++){
 if( ((var2/(int)(1549))!=(var2%(int)(99)))){
System.out.println("NischitTest1 - NischitTest1method4- LineInMethod: 9");
}
}
if((((var0+var3)==((f4+"jnkfpvlajnmwptronsmxjoeurlyfilrkolcyyowpxyjcvpzeewndegdgrhejtflwrx")+(f4+"axhwgkadlofcfpvjsvxlpvufmfjdpaqzxpdrkyxpovuuanaptkxpmudqmaqmllxiosxnaiuddwnohfzhrvtamqg")))||(((var0+"vqyyhundlesgfpmpmhsugmoidilqjtjrnijdtyjnbclqponmhqcunfqsznuaq")+(var0+"ucxtyhnlcvazqtrktahomcnkpeefelancdklblcrzqqhhwdgpkhpakuymqobumgphmxtpdcogpgw"))==(var0+var3)))){
System.out.println("NischitTest1 - NischitTest1method4- LineInMethod: 18");
}
else{
 var2 = (int)(var1-var2);
}
synchronized(this){
for(int i = 0; i < 61; i++){
 if( ((f0%(int)(1233))<(var1+var2))){
if( ((f5[6]+f0)>(var2/(int)(2109)))){
if( ((var2*var1)!=(var1*var2))){
if( ((f4+"lxnaflezfsgmimdtzrijnxcpeqhoxez")==(var3+"coelndokoldlghtllvlsciwzqvbuvqeotepxtbakasuwjkhnhcyxoiahwlebkflhdymzssaljkgwvjnfgiljwcwdmyusrdcs"))){
if( ((var2/(int)(1177))==(var1+var2))){
System.out.println("NischitTest1 - NischitTest1method4- LineInMethod: 35");
}
}
}
}
}
}

 }
for(int i = 0; i < 28; i++){
 if( ((var2-var1)<=(f6%(int)(1228)))){
NischitTest1method8(null,var1);}
}
switch((var1%(int)(2975))){
case 0:
f4 = (String)((var0+var3)+(var0+"oqcaqqvvvpsnarijwyey"));
 break;
case 1:
var1 = (int)(2369);
 break;
case 2:
System.out.println("NischitTest1 - NischitTest1method4- LineInMethod: 49");
 break;
case 3:
var0 = NischitTest1method11((long)(1040),var2,(long)(1345));
 break;
default :
System.out.println("NischitTest1 - NischitTest1method4- LineInMethod: 57");
}
return (long)(long)(769);

}

public String NischitTest1method5(String var0, long var1){
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
bufferedWriter= new BufferedWriter(new FileWriter("C:\\temp\\__UIC__RUGRAT__5a8aZ.txt"));
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
bufferedWriter.append("C:\\temp\\__UIC__RUGRAT__5a8aZ.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (String)var0;

}

public static long NischitTest1method6(String var0, int var1){
 for(int i = 0; i < 11; i++){
 if( (((var1*(int)(951))-(var1+(int)(1362)))!=(var1+(int)(1235)))){
if( (((var1+(int)(2610))!=(var1*(int)(1022)))&&((var1-(int)(876))==(var1/(int)(1137))))){
if( ((var1*(int)(2721))>=((var1-(int)(3429))*(((var1/(int)(1851))-((var1%(int)(1888))-(var1-(int)(574))))-(var1/(int)(1691)))))){
System.out.println("NischitTest1 - NischitTest1method6- LineInMethod: 8");
}
}
}
}
if( ((((var1-(int)(286))+(var1+(int)(1244)))==(f0+f5[13]))&&((var1*(int)(1407))<=(f6+f0)))){
System.out.println("NischitTest1 - NischitTest1method6- LineInMethod: 12");
}
switch((var1+f0)){
case 0:
f2 = new NischitTest4();
 break;
case 1:
System.out.println("NischitTest1 - NischitTest1method6- LineInMethod: 19");
 break;
case 2:
var0 = (String)(((var0+"vykekgnlmcggwkwhxcuqishaqlqfhotgweibegsbfgvxlztwswrgynljrdsi")+(((var0+"ipsvmilyrkdorloqpskxufdybntlmslatky")+((var0+"mhnaxgulkpnzwyngdakgitxmzzvozsrflvnutdmntscxqevazvlctnedrplsmtbhmedd")+(var0+"hjeqessbnzurdmtrctwqbwfbwbhzybiangarkjrhttysmxmpvujiek")))+(var0+"jbkbpuqlolojumbth")))+(var0+"ddpvkwnsxmqxevffdmiilmnoaofxdaawfmuudnhqhtcxxmxasykhuoda"));
 break;
case 3:
System.out.println("NischitTest1 - NischitTest1method6- LineInMethod: 26");
 break;
case 4:
f0 = (int)((f5[13]+f6)/(int)(2294));
 break;
case 5:
f2 = new NischitTest4();
 break;
case 6:
System.out.println("NischitTest1 - NischitTest1method6- LineInMethod: 37");
 break;
default :
System.out.println("NischitTest1 - NischitTest1method6- LineInMethod: 44");
}
return (long)(long)(3433);

}

public long NischitTest1method7(long var0, NischitTest1 var1, int var2){
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
for(int i = 0; i < 3; i++){
 f1 = (String)((("fkskazncafnktyugyoaubrbzvtoqqxicdvjpnqrwiphzawboqecydeykhporpasqkslmdvjzifkcmzvlbiwajqvfgdyfyzq"+"jlgrrjydnqidhwheprec")+("aagpydutrwqmaxnjcypgecdblzvdwwjzqsfwhjwqnmweiilvxkxksxtkeytijvkid"+"jahjqcktlntznvvdyvibruwrotzyfzk"))+("eaggklodaicfxtrusrtjokgagsvgtstfxobftidvbaggavpd"+"dclpnwyzinnqdrhjxloou"));
}
if(((var0/(long)(249))>(var0/(long)(1912)))){
var2 = (int)(1594);
}
else{
 var0 = (long)(3432);
}
switch((var2%(int)(1085))){
case 0:
var2 = (int)(var2%(int)(2284));
 break;
case 1:
System.out.println("NischitTest1 - NischitTest1method7- LineInMethod: 12");
 break;
case 2:
NischitTest1method9("eyfmflyogvfjurj",var2,var2); break;
default :
var0 = (long)((var0-(long)(3232))-(var0-(long)(2140)));
}
synchronized(this){
if( ((f3[5]*f3[4])!=(f3[1]-f3[0]))){
System.out.println("NischitTest1 - NischitTest1method7- LineInMethod: 23");
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
if(((var0+(long)(947))==(((var0-(long)(3141))*(var0-(long)(2355)))*(var0-(long)(2691))))){
var0 = NischitTest1method12(var0,var2,var0,var2);
}
else{
 var0 = (long)(265);
}
synchronized(this){
try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\WinCoot\\bin\\Lib\\sqlite3\\test\\__UIC__RUGRAT__h1MZd.txt"));
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
bufferedWriter.append("C:\\WinCoot\\bin\\Lib\\sqlite3\\test\\__UIC__RUGRAT__h1MZd.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}

 }
return (long)var0;

}

public static String NischitTest1method8(NischitTest1 var0, int var1){
 synchronized(this){
for(int i = 0; i < 75; i++){
 System.out.println("NischitTest1 - NischitTest1method8- LineInMethod: 2");
}

 }
synchronized(this){
switch((var1/(int)(847))){
case 0:
System.out.println("NischitTest1 - NischitTest1method8- LineInMethod: 8");
 break;
case 1:
var1 = (int)(2210);
 break;
case 2:
var1 = (int)(1770);
 break;
case 3:
System.out.println("NischitTest1 - NischitTest1method8- LineInMethod: 19");
 break;
default :
f4 = (String)((f4+"okorittnqvzvvwxmlkbnmycfspbr")+(f4+"hutvvbknyqocubethfjeljbtaoeomcluzhdclixpbxjdxsdlzotewkyygcjeztjdxfaekmspddcdt"));
}

 }
synchronized(this){
for(int i = 0; i < 6; i++){
 System.out.println("NischitTest1 - NischitTest1method8- LineInMethod: 29");
}

 }
if(((var1%(int)(2533))==(var1/(int)(489)))){
System.out.println("NischitTest1 - NischitTest1method8- LineInMethod: 35");
}
else{
 NischitTest1method11((long)(692),var1,(long)(1006));}
synchronized(this){
if( ((((var1-(int)(615))*(var1%(int)(1320)))>(var1+(int)(2920)))&&((var1/(int)(2335))>(var1-(int)(194))))){
if( (((var1-(int)(655))/(int)(2752))<=(f6-(int)(1247)))){
if( ((((var1+(int)(1360))*(var1-(int)(2653)))+(var1-(int)(1114)))<=(var1-(int)(1344)))){
var1 = (int)((f5[8]%(int)(139))*(var1*(int)(3430)));
}
}
}

 }
return (String)"kwssrjtfchergbxjtabrpordbehydirfzzzljdudoivgpdwgmtdvekahgsbvhrezgaaplph";

}

public Object NischitTest1method9(String var0, int var1, int var2){
 synchronized(this){
for(int i = 0; i < 44; i++){
 var0 = "nhirfmmjfylsrtcidnruuycawzfdpqwajlatlvvyhypvtuwrjguymfphqhhpjfotrqxiwxrczfltgpyilftoehuot";
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
for(int i = 0; i < 69; i++){
 System.out.println("NischitTest1 - NischitTest1method9- LineInMethod: 5");
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
bufferedReader= new BufferedReader(new FileReader(getNextFile("C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\log.txt","C:\\Users\\Ramya\\workspace\\RUGRAT4LOAD\\config.xml")));
String line = null;
while((line = bufferedReader.readLine()) != null){
System.out.println("Read line = " + line );
}
}
catch(Exception e){
e.printStackTrace();
}
switch((var1*(int)(2369))){
case 0:
var0 = (String)(var0+"mlgahklgxuyenqbzserknkxepmqkashnonxtwhfuwqqhdswdplnibsnauyllunnqobzycoisiaubpfksaxkowsiuezeex");
 break;
case 1:
var0 = "rchhpxridsddpyebhwbrboaziwsybtwzvjidwqdqfnkddkpqiwlmzb";
 break;
case 2:
var1 = NischitTest1method10(var1,(long)(2644));
 break;
case 3:
System.out.println("NischitTest1 - NischitTest1method9- LineInMethod: 19");
 break;
case 4:
var0 = "vspznsbjyosgcucqynycdgusyxdbehqfmchiqlltuw";
 break;
case 5:
System.out.println("NischitTest1 - NischitTest1method9- LineInMethod: 24");
 break;
case 6:
System.out.println("NischitTest1 - NischitTest1method9- LineInMethod: 30");
 break;
case 7:
var2 = (int)((var1*(int)(1497))/(int)(1007));
 break;
case 8:
System.out.println("NischitTest1 - NischitTest1method9- LineInMethod: 38");
 break;
default :
f1 = (String)(var0+"rggarrnatkcplqivacmzxmqdclfklaxqehcskeuhgjaazw");
}
if( (((((var1/(int)(1012))<(var1*(int)(3047)))&&((((var1-(int)(339))-(var1*var2))==((var2*var1)+(var1-(int)(273))))&&((var2/(int)(660))<(var1-(int)(1950)))))||((((var1*var2)!=(var1*(int)(3078)))||(((var2*var1)-(var1*(int)(1150)))>=((var2+var1)-(var1+(int)(1755)))))||((var2-(int)(624))<(var2-(int)(1564)))))&&((var2-var1)<=((var2+(int)(2805))-(var2+(int)(2493)))))){
if( (((var0+"xhupllgegmcrdhznsmueesjzpwhkgbpqzynfdgyklprmzpnljfvqdyhlusgfoyqquzjwrobzihpcd")+(var0+"xyvm"))!=(var0+"urxgunhveitkznwmadgrvmhpnftqldhnxgpvprdgouxxtzfluxeqjdsiatltlkaack"))){
if( (((f1+"rhuhhdqnewjcisbwevpvzzdzpcbbiuxcoinmzeyeigeymiusbodxejgrbzfey")+(f1+"hrakefxekjrejwmjxcitunstmhiofbwirhqnvqutkbhvvwwfqyxhgwwudhdearureorkukjzyxnaoolprbmhucejur"))==(var0+"seeowaauhdivpateubhejpibrkrjvoiusjqkzworfzqvzhtwnsyptyzcdrjqqsngdogcwmacycebgof"))){
if( ((var2-var1)>=(var1*(int)(2583)))){
var1 = (int)((var1+var2)*(var2*(int)(1502)));
}
}
}
}
return (Object)null;

}

public int NischitTest1method10(int var0, long var1){
 try {
bufferedWriter= new BufferedWriter(new FileWriter("C:\\Windows\\apppatch\\apppatch64\\__UIC__RUGRAT__ROcnU.txt"));
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
bufferedWriter.append("C:\\Windows\\apppatch\\apppatch64\\__UIC__RUGRAT__ROcnU.txt");bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
}
} catch (IOException ex) {
ex.printStackTrace();
}
}
return (int)var0;

}

public static String NischitTest1method11(long var0, int var1, long var2){
 synchronized(this){
if( ((var1/(int)(346))<(var1+(int)(776)))){
if( ((var0+var2)!=(var0+(long)(2886)))){
if( ((var1%(int)(1204))==(f5[13]+f5[9]))){
if( (((var1+(int)(3153))%(int)(1056))<((f0+(int)(1963))%(int)(3234)))){
if( ((var1%(int)(2810))>(var1-(int)(221)))){
if( ((var0/(long)(661))>(var2*(long)(3362)))){
System.out.println("NischitTest1 - NischitTest1method11- LineInMethod: 12");
}
}
}
}
}
}

 }
if( ((var2-(long)(2412))!=(var2+(long)(1919)))){
System.out.println("NischitTest1 - NischitTest1method11- LineInMethod: 15");
}
return (String)"kdpzlcrwcrczeksxdpizziswjitwjnwhguimorzgacgrwqrhqygqmmbiflogybncuybycejwrcnlgbyjvydes";

}

public long NischitTest1method12(long var0, int var1, long var2, int var3){
 if(((f3[2]-f3[4])<=(var2*(long)(1582)))){
System.out.println("NischitTest1 - NischitTest1method12- LineInMethod: 4");
}
else{
 f3[2] = (long)((((var2*(long)(2611))*(var0*var2))/(long)(2976))*(var2*var0));
}
synchronized(this){
switch((var1-var3)){
case 0:
System.out.println("NischitTest1 - NischitTest1method12- LineInMethod: 8");
 break;
case 1:
System.out.println("NischitTest1 - NischitTest1method12- LineInMethod: 13");
 break;
case 2:
System.out.println("NischitTest1 - NischitTest1method12- LineInMethod: 19");
 break;
case 3:
f1 = (String)((f1+"roaoffchynaifdqzhgdrdbggkukyefevclqdckzfclurgsuarmcnsbqwlceewenobkltfkegyfsqambnjuonpznoom")+("kbhnkppxpscmauesvbsc"+"zmvbruudwgakjvpcrjnsztvnhhvvagsegblsxsgxljqgvax"));
 break;
case 4:
System.out.println("NischitTest1 - NischitTest1method12- LineInMethod: 25");
 break;
case 5:
var3 = (int)((var1-var3)-(var3+var1));
 break;
case 6:
f1 = (String)((("knsgwrkbngkzapyoarspqaf"+"kinwskbgylhvpxmskqgrmummnnvufqrjzqfsbdmlbdgzcxiucjzoxhyfbrhoadvwjwpacjotoiplozwqrqxgmysgaly")+("zyoglpqegkwybokairxrfaxdjcsgfoyrjllciy"+"hipdjvduwxsjvwqjbejqwlxykhegiplsmkrtwxxchogdomaulnfwtipkavhwbwnsgpgmpqctizsjpsctqezoibxne"))+(f1+"gsabsmwfmmydabwkpyztcifghneyqpjpebsujiuiyqfkgybppbvrdeyngjcybmgrqdojrdnoldcrhretwtnbbpbuo"));
 break;
default :
System.out.println("NischitTest1 - NischitTest1method12- LineInMethod: 38");
}

 }
if( ((var1%(int)(1996))<(var3-(int)(3306)))){
if( ((var0%(long)(2021))==(var0*(long)(1802)))){
var0 = (long)((var0+(long)(2519))+(var2+var0));
}
}
return (long)var0;

}


public static void main(String args[]){
NischitTest1 obj = new NischitTest1();
obj.NischitTestInterface2Method0(new NischitTest2(),"swsiebsyjqjddctkcufqitfnikwkkelvrtaonfhliiubznydpbqrxkzkmgcuvdfsarijysqvtomutrsjruflhwuecpncd",new NischitTest0(),(long)(2292));
NischitTest1method0((long)(1124),(long)(2930));
obj.NischitTest1method1((int)(625),(long)(1541));
NischitTest1method2((int)(2299),(int)(3356));
obj.NischitTest1method3(new NischitTest0(),(int)(1272));
NischitTest1method4("jpcxpsimlemikukqwriegslncxvbaaudwmllukxgfytvinfwdxwqtitop",(int)(2031),(int)(3313),"udaklpbcyabdkrilioobmnkhytchmwnfdtbvucolyvlnfoxcvvtnufnpisnxtndbyycubybfvnqjpukbsynoqcs");
obj.NischitTest1method5("ajytnfiqgidebxssmhitgtqeiqgognrsimxmkezbzidqlwvtxhjfqttsyakpwmeyoaebl",(long)(2136));
NischitTest1method6("otingxtbpdibtkrqobjxwnmuirtdxlfrzorlyurhgymcalivtorfockksfyfqnqu",(int)(1370));
obj.NischitTest1method7((long)(1740),new NischitTest1(),(int)(1548));
NischitTest1method8(new NischitTest1(),(int)(3256));
obj.NischitTest1method9("iwzwuiaqepdqdb",(int)(2975),(int)(1486));
obj.NischitTest1method10((int)(1739),(long)(495));
NischitTest1method11((long)(2853),(int)(2312),(long)(2300));
obj.NischitTest1method12((long)(718),(int)(622),(long)(682),(int)(3059));
}

public void run(){
      try{
NischitTest1 obj = new NischitTest1();
obj.NischitTestInterface2Method0(new NischitTest2(),"swsiebsyjqjddctkcufqitfnikwkkelvrtaonfhliiubznydpbqrxkzkmgcuvdfsarijysqvtomutrsjruflhwuecpncd",new NischitTest0(),(long)(2292));
NischitTest1method0((long)(1124),(long)(2930));
obj.NischitTest1method1((int)(625),(long)(1541));
NischitTest1method2((int)(2299),(int)(3356));
obj.NischitTest1method3(new NischitTest0(),(int)(1272));
NischitTest1method4("jpcxpsimlemikukqwriegslncxvbaaudwmllukxgfytvinfwdxwqtitop",(int)(2031),(int)(3313),"udaklpbcyabdkrilioobmnkhytchmwnfdtbvucolyvlnfoxcvvtnufnpisnxtndbyycubybfvnqjpukbsynoqcs");
obj.NischitTest1method5("ajytnfiqgidebxssmhitgtqeiqgognrsimxmkezbzidqlwvtxhjfqttsyakpwmeyoaebl",(long)(2136));
NischitTest1method6("otingxtbpdibtkrqobjxwnmuirtdxlfrzorlyurhgymcalivtorfockksfyfqnqu",(int)(1370));
obj.NischitTest1method7((long)(1740),new NischitTest1(),(int)(1548));
NischitTest1method8(new NischitTest1(),(int)(3256));
obj.NischitTest1method9("iwzwuiaqepdqdb",(int)(2975),(int)(1486));
obj.NischitTest1method10((int)(1739),(long)(495));
NischitTest1method11((long)(2853),(int)(2312),(long)(2300));
obj.NischitTest1method12((long)(718),(int)(622),(long)(682),(int)(3059));
}
} catch (InterruptedException e) {
 e.printStackTrace();
}

}