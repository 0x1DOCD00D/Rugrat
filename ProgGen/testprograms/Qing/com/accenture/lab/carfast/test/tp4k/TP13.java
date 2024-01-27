package com.accenture.lab.carfast.test.tp4k;


public class TP13 extends TP8 implements TPInterface4 {


public int TPInterface4Method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 if( (((var5+var0)/(int)(51))<((var3*var6)%(int)(68)))){
System.out.println("TP13 - TPInterface4Method0- LineInMethod: 2");
}
for(int i = 0; i < 3; i++){
 var6 = (int)((var7-var2)-(var1*var4));
}
switch((var0*var7)){
case 0:
var2 = (int)(57);
 break;
case 1:
TPInterface4Method1(var4,var0,var7,var2,var3,var0,var2,var4); break;
case 2:
System.out.println("TP13 - TPInterface4Method0- LineInMethod: 16");
 break;
case 3:
var5 = (int)(52);
 break;
case 4:
var0 = (int)(var1*var0);
 break;
case 5:
var4 = (int)(14);
 break;
case 6:
TPInterface4Method1(var0,var7,var1,var0,var2,var4,var3,var6); break;
case 7:
System.out.println("TP13 - TPInterface4Method0- LineInMethod: 32");
 break;
default :
var3 = (int)((var4+var7)%(int)(8));
}
return (int)var6;

}

public int TPInterface4Method1(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 switch((var5/(int)(3))){
case 0:
var2 = TP13method2(var3,var3,var6,var7,var2);
 break;
case 1:
System.out.println("TP13 - TPInterface4Method1- LineInMethod: 5");
 break;
case 2:
var5 = (int)((var5/(int)(34))*(var1*var0));
 break;
case 3:
System.out.println("TP13 - TPInterface4Method1- LineInMethod: 13");
 break;
case 4:
TPInterface4Method2(var6,var0,var2,var2,var1); break;
default :
var7 = (int)(var0/(int)(52));
}
return (int)var6;

}

public int TPInterface4Method2(int var0, int var1, int var2, int var3, int var4){
 switch((var3-(int)(57))){
case 0:
var2 = (int)((var3+var1)*((var1*var4)*(var4-var2)));
 break;
case 1:
var4 = (int)(72);
 break;
case 2:
var4 = (int)(var0+var1);
 break;
case 3:
System.out.println("TP13 - TPInterface4Method2- LineInMethod: 10");
 break;
case 4:
System.out.println("TP13 - TPInterface4Method2- LineInMethod: 17");
 break;
default :
System.out.println("TP13 - TPInterface4Method2- LineInMethod: 23");
}
return (int)var1;

}

public static int TP13method0(int var0, int var1, int var2, int var3, int var4){
 if( ((var1*var4)<(var0%(int)(49)))){
if( ((var4*var2)<(var1+var4))){
System.out.println("TP13 - TP13method0- LineInMethod: 4");
}
}
if(((var1+var3)==(var4*(int)(59)))){
System.out.println("TP13 - TP13method0- LineInMethod: 10");
}
else{
 var0 = (int)(((var3-var0)*((var1+var3)%(int)(71)))/(int)(3));
}
for(int i = 0; i < 3; i++){
 if( ((var1*var4)<=((var2*(int)(47))+(var4-var2)))){
if( ((var2%(int)(23))>=(var4+var1))){
var1 = (int)(((var1+var4)+(var2-var0))-(var2-(int)(20)));
}
}
}
return (int)var3;

}

public int TP4method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 if((((var0-var3)%(int)(49))<=(var4+var7))){
System.out.println("TP13 - TP4method0- LineInMethod: 4");
}
else{
 var2 = (int)(var6*var3);
}
if(((((var6-(int)(18))>(var7-var2))||(((var7*var6)>=(var7-var2))&&(((var4+var3)>=(var7+(int)(73)))&&(((var5+(int)(14))<(var6%(int)(34)))&&(((var3-var2)<(var6-(int)(26)))&&((var1*var4)<=(var4*var7)))))))&&((((var0/(int)(65))-(var4+(int)(49)))==(var7-var2))||((var3*var7)>(var7-var4))))){
var7 = (int)(((var2%(int)(40))*((var5/(int)(19))/(int)(73)))+(var5+var4));
}
else{
 var5 = (int)((var1/(int)(69))-(var3-var6));
}
if( ((var3-var2)!=((var3-var5)+(var7%(int)(20))))){
var2 = (int)(var6-(int)(39));
}
return (int)var5;

}

public static int TP13method2(int var0, int var1, int var2, int var3, int var4){
 for(int i = 0; i < 1; i++){
 if( ((var1/(int)(23))!=(var3*var0))){
var3 = (int)(40);
}
}
for(int i = 0; i < 3; i++){
 var0 = (int)(42);
}
if(((var4*var0)!=(var0+var1))){
System.out.println("TP13 - TP13method2- LineInMethod: 10");
}
else{
 System.out.println("TP13 - TP13method2- LineInMethod: 13");
}
return (int)var1;

}


public static void main(String args[]){
TP13 obj = new TP13();
obj.TPInterface4Method0((int)(16),(int)(26),(int)(61),(int)(24),(int)(69),(int)(65),(int)(18),(int)(7));
obj.TPInterface4Method1((int)(44),(int)(41),(int)(35),(int)(51),(int)(11),(int)(0),(int)(56),(int)(11));
obj.TPInterface4Method2((int)(60),(int)(4),(int)(22),(int)(47),(int)(38));
TP13method0((int)(37),(int)(42),(int)(0),(int)(26),(int)(12));
obj.TP4method0((int)(54),(int)(30),(int)(76),(int)(36),(int)(19),(int)(4),(int)(70),(int)(54));
TP13method2((int)(44),(int)(30),(int)(63),(int)(45),(int)(34));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP13 obj = new TP13();
obj.TPInterface4Method0(i14,i8,i7,i0,i2,i10,i9,i6);
obj.TPInterface4Method1(i7,i6,i5,i8,i1,i4,i3,i9);
obj.TPInterface4Method2(i0,i14,i8,i7,i4);
TP13method0(i2,i11,i5,i7,i13);
obj.TP4method0(i14,i5,i3,i2,i9,i11,i8,i13);
TP13method2(i9,i8,i1,i2,i5);
}

}