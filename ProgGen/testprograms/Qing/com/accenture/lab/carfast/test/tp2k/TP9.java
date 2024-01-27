package com.accenture.lab.carfast.test.tp2k;


public class TP9 extends TP19 implements TPInterface0 {


public int TPInterface0Method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 if( (((var6/(int)(43))-(var4*var3))>=(var7%(int)(19)))){
if( ((var5/(int)(29))>(var4*var3))){
if( (((var3%(int)(13))*(var5*var4))!=(var0-var7))){
var5 = (int)(var6/(int)(45));
}
}
}
if( ((var4*var3)>=(var6/(int)(2)))){
System.out.println("TP9 - TPInterface0Method0- LineInMethod: 9");
}
return (int)var0;

}

public static int TP9method0(int var0, int var1, int var2, int var3){
 if( ((var0+var1)<=(var1*(int)(45)))){
if( ((((var1-var3)<(var3+(int)(15)))&&(((((var3-var2)*(var0+(int)(0)))*((var1-var2)+(var2/(int)(20))))<(var1*var3))&&(((var1-var0)*(var1+var2))>(var3/(int)(45)))))||((var2+var1)>((var3%(int)(36))-(var1*(int)(27)))))){
if( ((var2+var1)>((var1-var3)+(var0%(int)(12))))){
System.out.println("TP9 - TP9method0- LineInMethod: 6");
}
}
}
if( ((var3-(int)(8))==(var2-var0))){
var3 = (int)(((var0*(int)(40))-(var1-var3))*(var3%(int)(42)));
}
return (int)var1;

}

public static int TP19method0(int var0, int var1, int var2, int var3){
 if( ((var0-(int)(20))<(var2+var3))){
if( ((var0*var1)<(var2+(int)(17)))){
TP19method2(var3,var3,var2,var1);}
}
switch((var3/(int)(34))){
case 0:
System.out.println("TP9 - TP19method0- LineInMethod: 7");
 break;
case 1:
var3 = (int)((var1+var3)*((var3%(int)(1))*(var1*var3)));
 break;
case 2:
System.out.println("TP9 - TP19method0- LineInMethod: 17");
 break;
case 3:
var2 = TP9method2(var3,var3,var2,var1);
 break;
default :
System.out.println("TP9 - TP19method0- LineInMethod: 26");
}
return (int)var0;

}

public static int TP9method2(int var0, int var1, int var2, int var3){
 switch((var0-var3)){
case 0:
System.out.println("TP9 - TP9method2- LineInMethod: 2");
 break;
case 1:
var0 = (int)((var2*var3)%(int)(19));
 break;
case 2:
System.out.println("TP9 - TP9method2- LineInMethod: 12");
 break;
default :
System.out.println("TP9 - TP9method2- LineInMethod: 15");
}
return (int)var0;

}

public static int TP19method2(int var0, int var1, int var2, int var3){
 if(((var3-var1)>(var2*var1))){
var0 = (int)(3);
}
else{
 System.out.println("TP9 - TP19method2- LineInMethod: 4");
}
switch((var1-(int)(18))){
case 0:
System.out.println("TP9 - TP19method2- LineInMethod: 8");
 break;
case 1:
System.out.println("TP9 - TP19method2- LineInMethod: 13");
 break;
case 2:
System.out.println("TP9 - TP19method2- LineInMethod: 19");
 break;
case 3:
var3 = (int)((var3-(int)(25))+(var1-var2));
 break;
case 4:
System.out.println("TP9 - TP19method2- LineInMethod: 27");
 break;
case 5:
System.out.println("TP9 - TP19method2- LineInMethod: 30");
 break;
case 6:
var2 = (int)(var2+(int)(32));
 break;
default :
var3 = (int)((var2*var1)+(var1-var2));
}
return (int)var2;

}


public static void main(String args[]){
TP9 obj = new TP9();
obj.TPInterface0Method0((int)(37),(int)(5),(int)(27),(int)(9),(int)(8),(int)(25),(int)(13),(int)(49));
TP9method0((int)(17),(int)(37),(int)(29),(int)(15));
TP19method0((int)(31),(int)(6),(int)(40),(int)(37));
TP9method2((int)(36),(int)(24),(int)(19),(int)(25));
TP19method2((int)(42),(int)(26),(int)(9),(int)(21));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP9 obj = new TP9();
obj.TPInterface0Method0(i12,i11,i7,i2,i6,i8,i1,i14);
TP9method0(i8,i14,i3,i11);
TP19method0(i6,i2,i4,i5);
TP9method2(i9,i0,i2,i6);
TP19method2(i3,i6,i5,i2);
}

}