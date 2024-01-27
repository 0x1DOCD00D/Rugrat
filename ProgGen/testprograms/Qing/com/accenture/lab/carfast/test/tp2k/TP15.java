package com.accenture.lab.carfast.test.tp2k;


public class TP15 extends TP17 {


public static int TP15method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8){
 if(((var1*var2)>=((var8-var4)*(var5-var4)))){
System.out.println("TP15 - TP15method0- LineInMethod: 4");
}
else{
 var0 = (int)((var0%(int)(19))/(int)(16));
}
if( ((var4%(int)(41))==(var7*var6))){
System.out.println("TP15 - TP15method0- LineInMethod: 10");
}
for(int i = 0; i < 0; i++){
 System.out.println("TP15 - TP15method0- LineInMethod: 13");
}
return (int)var1;

}

public static int TP17method0(int var0, int var1, int var2, int var3){
 if( ((var1-var3)<(var1+var0))){
if( ((var2+var3)>(var0/(int)(6)))){
if( ((var1+(int)(16))>=(var2/(int)(10)))){
var1 = (int)((((var3-var2)+(var2/(int)(9)))*(var1+var2))/(int)(1));
}
}
}
if( ((var0+var2)<=(var3%(int)(23)))){
var2 = (int)(((var3%(int)(21))-((var0-var1)-(var1*var3)))*(var3%(int)(4)));
}
if(((var0-var1)<(var1-var2))){
System.out.println("TP15 - TP17method0- LineInMethod: 14");
}
else{
 var0 = TP17method2(var0,var2,var2,var3,var2);
}
return (int)var0;

}

public int TP15method2(int var0, int var1, int var2, int var3){
 for(int i = 0; i < 3; i++){
 System.out.println("TP15 - TP15method2- LineInMethod: 2");
}
if(((var2-var1)>=(((var2*var3)*(var2+(int)(42)))-(var2-var1)))){
System.out.println("TP15 - TP15method2- LineInMethod: 7");
}
else{
 var3 = (int)((var1-(int)(21))-((var2+(int)(33))%(int)(45)));
}
for(int i = 0; i < 1; i++){
 if( (((var2+var0)>=(var1+var0))||((var2/(int)(13))<(var0+var2)))){
if( (((var0*var3)+(((var2/(int)(36))*((var0+(int)(40))*((var2/(int)(27))%(int)(48))))/(int)(26)))<=(var2-(int)(46)))){
if( ((((var0-(int)(8))-(var1*var3))<=(var0*(int)(27)))&&((var3-var0)!=((var0-var1)*(var2+var3))))){
System.out.println("TP15 - TP15method2- LineInMethod: 19");
}
}
}
}
return (int)var2;

}

public static int TP17method2(int var0, int var1, int var2, int var3, int var4){
 switch((var3+(int)(34))){
case 0:
var2 = (int)((var1-var4)-(var1-(int)(32)));
 break;
case 1:
System.out.println("TP15 - TP17method2- LineInMethod: 5");
 break;
case 2:
System.out.println("TP15 - TP17method2- LineInMethod: 8");
 break;
case 3:
System.out.println("TP15 - TP17method2- LineInMethod: 14");
 break;
case 4:
var2 = (int)((var2*var0)%(int)(10));
 break;
case 5:
var1 = (int)(28);
 break;
case 6:
System.out.println("TP15 - TP17method2- LineInMethod: 24");
 break;
case 7:
System.out.println("TP15 - TP17method2- LineInMethod: 27");
 break;
case 8:
System.out.println("TP15 - TP17method2- LineInMethod: 30");
 break;
default :
var1 = (int)((var2-var1)+(var2*var0));
}
return (int)var0;

}


public static void main(String args[]){
TP15 obj = new TP15();
TP15method0((int)(13),(int)(12),(int)(9),(int)(22),(int)(25),(int)(27),(int)(32),(int)(32),(int)(10));
TP17method0((int)(9),(int)(10),(int)(16),(int)(25));
obj.TP15method2((int)(21),(int)(21),(int)(2),(int)(21));
TP17method2((int)(24),(int)(6),(int)(37),(int)(23),(int)(46));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP15 obj = new TP15();
TP15method0(i7,i11,i14,i9,i4,i10,i3,i12,i6);
TP17method0(i7,i13,i9,i12);
obj.TP15method2(i5,i12,i9,i11);
TP17method2(i12,i0,i8,i6,i11);
}

}