package com.accenture.lab.carfast.test.tp7k;


public class TP16 implements TPInterface4 {


public int TPInterface4Method0(int var0, int var1, int var2, int var3, int var4){
 if(((var4*var2)==(var4-var1))){
System.out.println("TP16 - TPInterface4Method0- LineInMethod: 4");
}
else{
 var3 = (int)((var4%(int)(8))-(var3+var1));
}
for(int i = 0; i < 0; i++){
 if( ((((var1%(int)(28))!=((var1*var2)-(var1/(int)(23))))&&((var3+var2)<(var1+(int)(22))))&&((var1-(int)(2))>(var1+var3)))){
var0 = (int)((var0%(int)(19))+((var1+(int)(28))-(var0%(int)(37))));
}
}
switch(((var0-(int)(18))*(var1+(int)(11)))){
case 0:
var1 = (int)((var4-var0)*(var2+(int)(11)));
 break;
case 1:
var4 = TPInterface4Method1(var3,var1,var0,var2,var0,var2);
 break;
case 2:
System.out.println("TP16 - TPInterface4Method0- LineInMethod: 21");
 break;
case 3:
var2 = (int)((var3*var2)*((var1+var3)*(((var3/(int)(4))+(var2-var0))+(var1/(int)(31)))));
 break;
default :
System.out.println("TP16 - TPInterface4Method0- LineInMethod: 27");
}
return (int)var4;

}

public int TPInterface4Method1(int var0, int var1, int var2, int var3, int var4, int var5){
 for(int i = 0; i < 4; i++){
 if( ((((var3*var1)>(((var3-(int)(34))*(var1+(int)(10)))-(var4+var3)))&&((var4%(int)(8))==(var1/(int)(19))))&&(((var4-var1)<=((var0*var2)-(var3*var1)))&&(((var2*var0)+(var5/(int)(49)))>(var3/(int)(43)))))){
System.out.println("TP16 - TPInterface4Method1- LineInMethod: 4");
}
}
for(int i = 0; i < 4; i++){
 if( ((var3-var0)<(var4*var5))){
if( ((var4-var0)==((var1*var5)*(var4-(int)(38))))){
var3 = (int)((var3+(int)(14))/(int)(9));
}
}
}
for(int i = 0; i < 2; i++){
 System.out.println("TP16 - TPInterface4Method1- LineInMethod: 17");
}
for(int i = 0; i < 2; i++){
 if( ((var3%(int)(2))<(var0-var2))){
if( ((var2%(int)(28))==(var4%(int)(21)))){
var0 = (int)(29);
}
}
}
return (int)var3;

}

public static int TP16method0(int var0, int var1, int var2, int var3, int var4){
 if( ((((var0+var2)==(var3-var4))&&(((var0+var3)==(var3*var1))&&(((var4+(int)(38))!=(var2+var3))&&((var2+var0)<=((var3/(int)(14))-(var0%(int)(26)))))))&&((var0/(int)(40))<(var2%(int)(8))))){
System.out.println("TP16 - TP16method0- LineInMethod: 2");
}
switch((var3-(int)(43))){
case 0:
var1 = (int)(29);
 break;
case 1:
var1 = (int)(45);
 break;
case 2:
System.out.println("TP16 - TP16method0- LineInMethod: 11");
 break;
case 3:
System.out.println("TP16 - TP16method0- LineInMethod: 17");
 break;
default :
var2 = (int)(var3/(int)(7));
}
if( ((var3/(int)(36))!=((((var0*var3)*(var1-var3))%(int)(37))*(var1-var2)))){
if( (((((var3*var1)*((var1*var4)%(int)(20)))>(var2-var4))&&(((var0/(int)(3))%(int)(5))>(var4*var2)))&&((var3%(int)(16))<(((var0-(int)(5))*(var0+(int)(44)))/(int)(7))))){
if( ((var1%(int)(27))<(((var1*var4)+(var0-var2))+((((var3-var0)-(var0+var1))-(var2+var3))/(int)(11))))){
var1 = (int)((var1%(int)(32))*(((var4*(int)(1))/(int)(43))%(int)(15)));
}
}
}
return (int)var2;

}

public int TP16method1(int var0, int var1, int var2, int var3, int var4){
 if( ((var4-var3)==(var1-var4))){
if( (((var3+var1)<=((var4/(int)(19))-(var2*var1)))&&(((var4/(int)(14))%(int)(39))<=(var4+var2)))){
if( (((var2+var1)+(var1/(int)(31)))>=(var0/(int)(41)))){
System.out.println("TP16 - TP16method1- LineInMethod: 6");
}
}
}
if((((var3%(int)(17))-((var0/(int)(28))*(var0/(int)(41))))!=(var3-var4))){
var4 = (int)(19);
}
else{
 var4 = (int)(48);
}
for(int i = 0; i < 6; i++){
 if( ((var1-var3)>(var0%(int)(19)))){
var2 = (int)((var3%(int)(48))+(var0*var4));
}
}
if( (((var2*var4)<(((var4*var2)/(int)(11))+((var3+(int)(2))-(var0+var3))))&&((((var0-var1)+(var3-var4))<(var0%(int)(3)))&&((var0+var3)>=(var1/(int)(21)))))){
System.out.println("TP16 - TP16method1- LineInMethod: 21");
}
return (int)var1;

}


public static void main(String args[]){
TP16 obj = new TP16();
obj.TPInterface4Method0((int)(19),(int)(4),(int)(21),(int)(36),(int)(12));
obj.TPInterface4Method1((int)(46),(int)(12),(int)(38),(int)(29),(int)(15),(int)(5));
TP16method0((int)(11),(int)(35),(int)(31),(int)(1),(int)(24));
obj.TP16method1((int)(34),(int)(37),(int)(38),(int)(35),(int)(24));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP16 obj = new TP16();
obj.TPInterface4Method0(i3,i11,i1,i2,i8);
obj.TPInterface4Method1(i8,i11,i2,i9,i14,i3);
TP16method0(i5,i2,i3,i12,i9);
obj.TP16method1(i10,i6,i5,i4,i3);
}

}