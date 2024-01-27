package com.accenture.lab.carfast.test.tp2k;


public class TP1 extends TP10 {


public static int TP1method0(int var0, int var1, int var2, int var3, int var4, int var5){
 if( ((var3-var4)<(var0/(int)(9)))){
System.out.println("TP1 - TP1method0- LineInMethod: 2");
}
if((((var2*var3)-(var2*var1))!=(var3+var4))){
var4 = (int)((var0/(int)(5))+((var2*var5)*(var1+var0)));
}
else{
 TP1method2(var1,var0,var2,var1,var3,var0,var2,var3,var3,var5,var3,var5);}
for(int i = 0; i < 3; i++){
 var5 = (int)((var4-var2)*(var3/(int)(5)));
}
return (int)var2;

}

public static int TP18method0(int var0, int var1, int var2, int var3){
 switch(((var0+(int)(38))-((var1+var3)*((var0*var3)%(int)(19))))){
case 0:
System.out.println("TP1 - TP18method0- LineInMethod: 2");
 break;
case 1:
var1 = (int)(11);
 break;
case 2:
var0 = TP1method2(var3,var0,var3,var1,var1,var2,var3,var2,var3,var0,var1,var1);
 break;
case 3:
System.out.println("TP1 - TP18method0- LineInMethod: 11");
 break;
case 4:
var0 = (int)((var2-var1)+(var2/(int)(1)));
 break;
case 5:
var1 = (int)((var2+(int)(40))*(var1+var0));
 break;
case 6:
System.out.println("TP1 - TP18method0- LineInMethod: 23");
 break;
case 7:
var3 = (int)((var0+var3)*(var3-var1));
 break;
case 8:
System.out.println("TP1 - TP18method0- LineInMethod: 31");
 break;
default :
var1 = (int)(((var1%(int)(3))+(var2+var3))%(int)(21));
}
return (int)var1;

}

public static int TP1method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11){
 if(((var10*var3)>(var5+var4))){
var4 = (int)(26);
}
else{
 var8 = (int)((var10-var0)+(var6*var10));
}
if( ((var11+var7)>(var3-var5))){
var9 = (int)((var9-var8)+(var3+(int)(31)));
}
if((((var4*var6)!=(var9+var6))&&((var2/(int)(34))!=((var10+(int)(33))+((var9-var5)-(var7/(int)(32))))))){
var8 = (int)((var4*var3)+(var2+var1));
}
else{
 var5 = (int)((var6+var9)+((((((var5%(int)(7))-((var4-var7)*(var0%(int)(23))))-(var10/(int)(18)))/(int)(46))+(((var3/(int)(24))-(var6-var0))+(var3/(int)(26))))*(var11*var10)));
}
return (int)var3;

}

public int TP10method2(int var0, int var1, int var2, int var3, int var4){
 for(int i = 0; i < 2; i++){
 if( ((var4+var0)==(var1*(int)(28)))){
if( (((var0+var4)<((var3%(int)(32))-(var0*var4)))&&((var2*(int)(3))<(var3/(int)(12))))){
var0 = (int)((var0+var3)+(var4-var1));
}
}
}
if( (((var4+var3)-(var3*var2))!=(var1%(int)(11)))){
var2 = (int)((var4*var0)%(int)(17));
}
if(((var4-var2)==((var4-(int)(37))*((var1/(int)(20))*(var0*var1))))){
var4 = (int)(var1*var3);
}
else{
 System.out.println("TP1 - TP10method2- LineInMethod: 15");
}
return (int)var1;

}


public static void main(String args[]){
TP1 obj = new TP1();
TP1method0((int)(29),(int)(34),(int)(5),(int)(41),(int)(28),(int)(23));
TP18method0((int)(40),(int)(13),(int)(12),(int)(9));
TP1method2((int)(5),(int)(22),(int)(46),(int)(26),(int)(35),(int)(27),(int)(28),(int)(48),(int)(10),(int)(29),(int)(33),(int)(38));
obj.TP10method2((int)(38),(int)(37),(int)(27),(int)(2),(int)(45));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP1 obj = new TP1();
TP1method0(i2,i4,i9,i12,i13,i5);
TP18method0(i10,i14,i1,i11);
TP1method2(i9,i14,i10,i6,i1,i12,i11,i2,i3,i8,i13,i7);
obj.TP10method2(i3,i9,i1,i14,i13);
}

}