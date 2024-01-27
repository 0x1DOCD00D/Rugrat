package com.accenture.lab.carfast.test.tp2k;


public class TP6 extends TP13 {


public int TP6method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9){
 if( ((var9%(int)(22))>(var3-var7))){
if( ((var3-(int)(39))==(var7*var1))){
if( ((var3+(int)(4))<(var1-var7))){
var8 = (int)(var3+var9);
}
}
}
for(int i = 0; i < 0; i++){
 System.out.println("TP6 - TP6method0- LineInMethod: 9");
}
return (int)var1;

}

public static int TP13method0(int var0, int var1, int var2, int var3, int var4){
 switch((var1-(int)(39))){
case 0:
System.out.println("TP6 - TP13method0- LineInMethod: 2");
 break;
case 1:
var3 = TP13method2(var1,var2,var4,var2,var0,var4,var3,var3,var2);
 break;
case 2:
System.out.println("TP6 - TP13method0- LineInMethod: 9");
 break;
case 3:
var2 = (int)((var0*var4)*(var0-var3));
 break;
case 4:
var3 = (int)((var0+(int)(45))*((var0-(int)(11))+((var2-var3)-(var3+var2))));
 break;
case 5:
TP13method2(var3,var0,var0,var3,var0,var3,var4,var4,var4); break;
case 6:
System.out.println("TP6 - TP13method0- LineInMethod: 24");
 break;
case 7:
System.out.println("TP6 - TP13method0- LineInMethod: 27");
 break;
default :
var1 = (int)((var3+var2)-((var2-var1)*(var0+var4)));
}
return (int)var3;

}

public int TP6method2(int var0, int var1, int var2, int var3){
 switch((var0-var1)){
case 0:
var1 = (int)((var3-var2)+(((var0+var3)%(int)(9))*((var0/(int)(33))-((var2+var3)%(int)(15)))));
 break;
case 1:
System.out.println("TP6 - TP6method2- LineInMethod: 5");
 break;
case 2:
System.out.println("TP6 - TP6method2- LineInMethod: 9");
 break;
case 3:
System.out.println("TP6 - TP6method2- LineInMethod: 14");
 break;
case 4:
System.out.println("TP6 - TP6method2- LineInMethod: 21");
 break;
default :
System.out.println("TP6 - TP6method2- LineInMethod: 28");
}
return (int)var3;

}

public static int TP13method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8){
 if((((var1/(int)(14))!=(var6*var5))&&((((var2+var4)<(var7/(int)(28)))||(((var5%(int)(34))==(var3*var0))&&((var3-var4)>=(var3-var0))))&&((var3+var6)>=((var8-var7)+(var4+var7)))))){
var5 = (int)((((var8*var2)-(var2-var5))%(int)(21))*(var2*var6));
}
else{
 var1 = (int)(1);
}
switch((var6%(int)(22))){
case 0:
var5 = (int)((var5*var0)%(int)(26));
 break;
case 1:
System.out.println("TP6 - TP13method2- LineInMethod: 10");
 break;
case 2:
var3 = (int)((var5-var3)-(var1*var3));
 break;
case 3:
System.out.println("TP6 - TP13method2- LineInMethod: 19");
 break;
default :
var1 = (int)((var3-var7)+((var3-var7)/(int)(44)));
}
return (int)var2;

}


public static void main(String args[]){
TP6 obj = new TP6();
obj.TP6method0((int)(14),(int)(43),(int)(31),(int)(25),(int)(26),(int)(42),(int)(19),(int)(37),(int)(24),(int)(5));
TP13method0((int)(27),(int)(48),(int)(29),(int)(3),(int)(33));
obj.TP6method2((int)(31),(int)(21),(int)(27),(int)(8));
TP13method2((int)(46),(int)(13),(int)(40),(int)(32),(int)(42),(int)(23),(int)(23),(int)(28),(int)(46));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP6 obj = new TP6();
obj.TP6method0(i8,i14,i10,i4,i2,i12,i13,i5,i6,i9);
TP13method0(i14,i10,i1,i7,i11);
obj.TP6method2(i5,i12,i3,i7);
TP13method2(i0,i14,i10,i9,i1,i7,i12,i2,i8);
}

}