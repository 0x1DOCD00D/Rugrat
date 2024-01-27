package com.accenture.lab.carfast.test.tp2k;


public class TP19 {


public static int TP19method0(int var0, int var1, int var2, int var3){
 if(((var3*var0)==(var2/(int)(24)))){
TP19method3(var2,var1,var1,var1);}
else{
 System.out.println("TP19 - TP19method0- LineInMethod: 5");
}
switch((var2*var1)){
case 0:
TP19method3(var1,var3,var3,var3); break;
case 1:
System.out.println("TP19 - TP19method0- LineInMethod: 14");
 break;
case 2:
System.out.println("TP19 - TP19method0- LineInMethod: 18");
 break;
case 3:
var3 = (int)((var0-var3)-((var1%(int)(45))/(int)(11)));
 break;
default :
System.out.println("TP19 - TP19method0- LineInMethod: 25");
}
return (int)var1;

}

public int TP19method1(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8){
 if( ((var0-var5)>=(var1-var4))){
System.out.println("TP19 - TP19method1- LineInMethod: 2");
}
switch((var2-(int)(36))){
case 0:
System.out.println("TP19 - TP19method1- LineInMethod: 7");
 break;
case 1:
var1 = (int)((var8+var4)*(var6-var0));
 break;
default :
System.out.println("TP19 - TP19method1- LineInMethod: 14");
}
return (int)var4;

}

public static int TP19method2(int var0, int var1, int var2, int var3){
 switch((var1/(int)(9))){
case 0:
TP19method3(var3,var3,var0,var1); break;
case 1:
var2 = (int)((var3/(int)(30))*(var1-var2));
 break;
case 2:
System.out.println("TP19 - TP19method2- LineInMethod: 8");
 break;
case 3:
var0 = (int)((var3+var2)-(var3-(int)(45)));
 break;
case 4:
var1 = (int)((var3-(int)(46))-(((var1/(int)(38))+(var0*var3))-(var0*var1)));
 break;
case 5:
System.out.println("TP19 - TP19method2- LineInMethod: 21");
 break;
default :
System.out.println("TP19 - TP19method2- LineInMethod: 25");
}
return (int)var3;

}

public static int TP19method3(int var0, int var1, int var2, int var3){
 if( ((var0*var2)!=(var3/(int)(46)))){
if( ((var0/(int)(35))==(((var3+var2)%(int)(46))-(var2*var3)))){
if( ((var1+var2)>(var3/(int)(16)))){
var3 = (int)((var3%(int)(15))*((var1-var3)/(int)(28)));
}
}
}
if( ((var1-var2)==(var0*var2))){
var2 = (int)((var1-(int)(5))*(var3/(int)(19)));
}
switch(((var1+(int)(10))%(int)(47))){
case 0:
System.out.println("TP19 - TP19method3- LineInMethod: 12");
 break;
case 1:
var0 = (int)((var2+(int)(36))+(var0*var2));
 break;
case 2:
var2 = (int)((var2+(int)(0))/(int)(13));
 break;
default :
var3 = (int)((var2-var0)+(var3/(int)(35)));
}
return (int)var3;

}


public static void main(String args[]){
TP19 obj = new TP19();
TP19method0((int)(48),(int)(39),(int)(36),(int)(34));
obj.TP19method1((int)(0),(int)(12),(int)(8),(int)(3),(int)(49),(int)(4),(int)(23),(int)(32),(int)(40));
TP19method2((int)(3),(int)(44),(int)(3),(int)(37));
TP19method3((int)(19),(int)(14),(int)(26),(int)(36));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP19 obj = new TP19();
TP19method0(i4,i11,i2,i14);
obj.TP19method1(i2,i10,i0,i5,i4,i8,i6,i9,i13);
TP19method2(i13,i1,i9,i8);
TP19method3(i8,i4,i10,i5);
}

}