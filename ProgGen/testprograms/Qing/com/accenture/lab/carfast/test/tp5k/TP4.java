package com.accenture.lab.carfast.test.tp5k;


public class TP4 extends TP26 {


public static int TP26method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9){
 if( (((var2-(int)(21))==((var6+var8)/(int)(62)))&&((var6/(int)(22))==(var8-var6)))){
System.out.println("TP4 - TP26method2- LineInMethod: 2");
}
if( (((((var8/(int)(49))/(int)(32))<(var4*(int)(54)))&&((var2*var6)>=(var4+var3)))||((var0*var6)<(var3-var8)))){
System.out.println("TP4 - TP26method2- LineInMethod: 5");
}
for(int i = 0; i < 4; i++){
 System.out.println("TP4 - TP26method2- LineInMethod: 12");
}
if(((var4-var6)<(var5-var1))){
var3 = (int)(((var8*var7)/(int)(32))*(var7*var9));
}
else{
 System.out.println("TP4 - TP26method2- LineInMethod: 21");
}
return (int)var4;

}

public static int TP27method2(int var0, int var1, int var2, int var3, int var4){
 switch(((var0-(int)(62))%(int)(11))){
case 0:
var4 = (int)(44);
 break;
case 1:
var3 = (int)((var0-var3)*(var1-var2));
 break;
case 2:
System.out.println("TP4 - TP27method2- LineInMethod: 7");
 break;
case 3:
System.out.println("TP4 - TP27method2- LineInMethod: 11");
 break;
default :
System.out.println("TP4 - TP27method2- LineInMethod: 16");
}
if( ((var0%(int)(13))<(var1-var4))){
if( ((var0+var4)==(var0/(int)(32)))){
var3 = (int)((var0+var1)%(int)(72));
}
}
return (int)var1;

}

public int TP4method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11){
 for(int i = 0; i < 4; i++){
 System.out.println("TP4 - TP4method2- LineInMethod: 2");
}
if((((var5*var9)*(var1+var7))>(var5+var9))){
var1 = (int)(1);
}
else{
 var7 = (int)((var0-var7)+(var1+var8));
}
if(((var10*var6)==(var8+var0))){
var8 = (int)(var10-var2);
}
else{
 System.out.println("TP4 - TP4method2- LineInMethod: 14");
}
if(((var1*var7)<=(var11+(int)(44)))){
System.out.println("TP4 - TP4method2- LineInMethod: 23");
}
else{
 System.out.println("TP4 - TP4method2- LineInMethod: 26");
}
return (int)var1;

}

public static int TP23method2(int var0, int var1, int var2, int var3, int var4){
 switch(((((var1/(int)(16))%(int)(49))*(var0+var4))+(var0+var3))){
case 0:
var4 = (int)((var2+var0)*(var2*var3));
 break;
case 1:
System.out.println("TP4 - TP23method2- LineInMethod: 5");
 break;
case 2:
System.out.println("TP4 - TP23method2- LineInMethod: 8");
 break;
case 3:
var1 = (int)(((var4%(int)(1))+((var3/(int)(14))%(int)(67)))/(int)(69));
 break;
case 4:
System.out.println("TP4 - TP23method2- LineInMethod: 15");
 break;
case 5:
var3 = (int)((var2/(int)(37))-(var1%(int)(42)));
 break;
case 6:
System.out.println("TP4 - TP23method2- LineInMethod: 25");
 break;
default :
var1 = (int)(21);
}
return (int)var3;

}


public static void main(String args[]){
TP4 obj = new TP4();
TP26method2((int)(66),(int)(15),(int)(22),(int)(34),(int)(23),(int)(25),(int)(63),(int)(43),(int)(19),(int)(59));
TP27method2((int)(64),(int)(51),(int)(60),(int)(5),(int)(5));
obj.TP4method2((int)(56),(int)(27),(int)(27),(int)(14),(int)(72),(int)(41),(int)(75),(int)(14),(int)(16),(int)(7),(int)(57),(int)(37));
TP23method2((int)(40),(int)(55),(int)(34),(int)(10),(int)(72));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP4 obj = new TP4();
TP26method2(i6,i8,i4,i5,i12,i2,i11,i10,i13,i14);
TP27method2(i7,i2,i3,i4,i6);
obj.TP4method2(i13,i10,i2,i7,i4,i9,i0,i14,i5,i12,i8,i3);
TP23method2(i13,i4,i10,i9,i0);
}

}