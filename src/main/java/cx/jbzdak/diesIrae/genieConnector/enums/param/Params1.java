/*
 * GenieConnector java library to connect with
 * Canberra Genie 2000 library
 * Copyright (C) 2009 Jacek Bzdak jbzdak@gmail.com
 *
 * This program was written for my BA in Faculty of Physics of
 * Warsaw University of Technology.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package cx.jbzdak.diesIrae.genieConnector.enums.param;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: Jacek Bzdak jbzdak@gmail.com
 */
@SuppressWarnings({"ALL"}) interface Params1 {
   ParamImpl<Long> L_DISPTILT = new ParamImpl<Long>('L', 0X2004001, "DISPTILT");

   ParamImpl<Long> L_DISPROT = new ParamImpl<Long>('L', 0X2004001, "DISPROT");

   ParamImpl<Float> F_DISSP1 = new ParamImpl<Float>('F', 0X20040020, "DISSP1");

   ParamImpl<Float> F_DISSP2 = new ParamImpl<Float>('F', 0X20040021, "DISSP2");

   ParamImpl<Long> L_RGNTYPE = new ParamImpl<Long>('L', 0X20040022, "RGNTYPE");

   ParamImpl<Long> L_RGNSTART = new ParamImpl<Long>('L', 0X20040023, "RGNSTART");

   ParamImpl<String> T_DISPMODE = new ParamImpl<String>('T', 0X20040024, "DISPMODE");

   ParamImpl<Long> L_RGNEND = new ParamImpl<Long>('L', 0X20040025, "RGNEND");

   ParamImpl<Long> L_DISPBOXTOP = new ParamImpl<Long>('L', 0X20040026, "DISPBOXTOP");

   ParamImpl<Long> L_DISPBOXBOT = new ParamImpl<Long>('L', 0X20040027, "DISPBOXBOT");

   ParamImpl<Long> L_DISPBOXLEFT = new ParamImpl<Long>('L', 0X20040028, "DISPBOXLEFT");

   ParamImpl<Long> L_DISPBOXRIGHT = new ParamImpl<Long>('L', 0X20040029, "DISPBOXRIGHT");

   ParamImpl<Long> L_SCRNSAVER = new ParamImpl<Long>('L', 0X2004002, "SCRNSAVER");

   ParamImpl<String> T_DISSTR1 = new ParamImpl<String>('T', 0X2004002, "DISSTR1");

   ParamImpl<String> T_DISSTR2 = new ParamImpl<String>('T', 0X2004002, "DISSTR2");

   ParamImpl<String> T_DISSTR3 = new ParamImpl<String>('T', 0X2004002, "DISSTR3");

   ParamImpl<String> T_DISSTR4 = new ParamImpl<String>('T', 0X2004002, "DISSTR4");

   ParamImpl<String> T_DISSTR5 = new ParamImpl<String>('T', 0X2004002, "DISSTR5");

   ParamImpl<String> T_DISSTR6 = new ParamImpl<String>('T', 0X20040030, "DISSTR6");

   ParamImpl<Long> L_DISPTHRESH0 = new ParamImpl<Long>('L', 0X20040031, "DISPTHRESH0");

   ParamImpl<Long> L_DISPTHRESH1 = new ParamImpl<Long>('L', 0X20040032, "DISPTHRESH1");

   ParamImpl<Long> L_DISPTHRESH2 = new ParamImpl<Long>('L', 0X20040033, "DISPTHRESH2");

   ParamImpl<Long> L_DISPTHRESH3 = new ParamImpl<Long>('L', 0X20040034, "DISPTHRESH3");

   ParamImpl<Long> L_DISPTHRESH4 = new ParamImpl<Long>('L', 0X20040035, "DISPTHRESH4");

   ParamImpl<Long> L_DISPTHRESH5 = new ParamImpl<Long>('L', 0X20040036, "DISPTHRESH5");

   ParamImpl<Long> L_DISPTHRESH6 = new ParamImpl<Long>('L', 0X20040037, "DISPTHRESH6");

   ParamImpl<Long> L_DISPTCOLOR0 = new ParamImpl<Long>('L', 0X20040038, "DISPTCOLOR0");

   ParamImpl<Long> L_DISPTCOLOR1 = new ParamImpl<Long>('L', 0X20040039, "DISPTCOLOR1");

   ParamImpl<Long> L_DISPTCOLOR2 = new ParamImpl<Long>('L', 0X2004003, "DISPTCOLOR2");

   ParamImpl<Long> L_DISPTCOLOR3 = new ParamImpl<Long>('L', 0X2004003, "DISPTCOLOR3");

   ParamImpl<Long> L_DISPTCOLOR4 = new ParamImpl<Long>('L', 0X2004003, "DISPTCOLOR4");

   ParamImpl<Long> L_DISPTCOLOR5 = new ParamImpl<Long>('L', 0X2004003, "DISPTCOLOR5");

   ParamImpl<Long> L_DISPTCOLOR6 = new ParamImpl<Long>('L', 0X2004003, "DISPTCOLOR6");

   ParamImpl<Long> L_DISPTCOLOR7 = new ParamImpl<Long>('L', 0X2004003, "DISPTCOLOR7");

   ParamImpl<Long> L_DISPUPDRATE = new ParamImpl<Long>('L', 0X20040040, "DISPUPDRATE");

   ParamImpl<Long> L_DISPTHRESH = new ParamImpl<Long>('L', 0X20040041, "DISPTHRESH");

   ParamImpl<Long> L_DISPTRANSPAR = new ParamImpl<Long>('L', 0X20040042, "DISPTRANSPAR");

   ParamImpl<Long> L_DISPBOXFRONT = new ParamImpl<Long>('L', 0X20040043, "DISPBOXFRONT");

   ParamImpl<Long> L_DISPBOXBACK = new ParamImpl<Long>('L', 0X20040044, "DISPBOXBACK");

   ParamImpl<Long> L_DISPFILLMD = new ParamImpl<Long>('L', 0X20040045, "DISPFILLMD");

   ParamImpl<Long> L_DISPGRIDMD = new ParamImpl<Long>('L', 0X20040046, "DISPGRIDMD");

   ParamImpl<Float> F_RGNSTARTEN = new ParamImpl<Float>('F', 0X20040047, "RGNSTARTEN");

   ParamImpl<Float> F_RGNENDEN = new ParamImpl<Float>('F', 0X20040048, "RGNENDEN");

   ParamImpl<String> T_LDROIFILE = new ParamImpl<String>('T', 0X20040049, "LDROIFILE");

   ParamImpl<String> T_CTFNAME = new ParamImpl<String>('T', 0X20090009, "CTFNAME");

   ParamImpl<Date> X_CTFDATE = new ParamImpl<Date>('X', 0X2009000, "CTFDATE");

   ParamImpl<Float> F_CTFQUANT = new ParamImpl<Float>('F', 0X2009000, "CTFQUANT");

   ParamImpl<String> T_CTFNUCL = new ParamImpl<String>('T', 0X20090002, "CTFNUCL");

   ParamImpl<Float> F_CTFENER = new ParamImpl<Float>('F', 0X20090003, "CTFENER");

   ParamImpl<Float> F_CTFRATE = new ParamImpl<Float>('F', 0X20090004, "CTFRATE");

   ParamImpl<Float> F_CTFABUN = new ParamImpl<Float>('F', 0X20090005, "CTFABUN");

   ParamImpl<Date> X_CTFHLFLIFE = new ParamImpl<Date>('X', 0X20090006, "CTFHLFLIFE");

   ParamImpl<Long> L_CTFFLAGS = new ParamImpl<Long>('L', 0X20090007, "CTFFLAGS");

   ParamImpl<String> T_CTFHLFUNITS = new ParamImpl<String>('T', 0X20090008, "CTFHLFUNITS");

   ParamImpl<Float> F_CTFERROR = new ParamImpl<Float>('F', 0X2009000, "CTFERROR");

   ParamImpl<Long> L_CTFNOASKINI = new ParamImpl<Long>('L', 0X2009000, "CTFNOASKINI");

   ParamImpl<Date> X_CTFHLFERR = new ParamImpl<Date>('X', 0X2009000, "CTFHLFERR");

   ParamImpl<Float> F_CTFECNVFAC = new ParamImpl<Float>('F', 0X2009000, "CTFECNVFAC");

   ParamImpl<String> T_CTFEUNITS = new ParamImpl<String>('T', 0X20090010, "CTFEUNITS");

   ParamImpl<String> T_CTFAUNITS = new ParamImpl<String>('T', 0X20090011, "CTFAUNITS");

   ParamImpl<Float> F_CTFACNVFAC = new ParamImpl<Float>('F', 0X20090012, "CTFACNVFAC");

   ParamImpl<Long> L_CTFTRACER = new ParamImpl<Long>('L', 0X20090013, "CTFTRACER");

   ParamImpl<String> T_CTFASTMMATRX = new ParamImpl<String>('T', 0X20090014, "CTFASTMMATRX");

   ParamImpl<String> T_CTFASTMMATER = new ParamImpl<String>('T', 0X20090015, "CTFASTMMATER");

   ParamImpl<Float> F_CTFASTMMASS = new ParamImpl<Float>('F', 0X20090016, "CTFASTMMASS");

   ParamImpl<Float> F_CTFASTMMERR = new ParamImpl<Float>('F', 0X20090017, "CTFASTMMERR");

   ParamImpl<Long> L_CTFAGAUSED = new ParamImpl<Long>('L', 0X20090018, "CTFAGAUSED");

   ParamImpl<String> T_CTFIMAGEFILE = new ParamImpl<String>('T', 0X20090019, "CTFIMAGEFILE");

   ParamImpl<String> T_INTERFRED = new ParamImpl<String>('T', 0X200, "INTERFRED");

   ParamImpl<String> T_INTERFRING = new ParamImpl<String>('T', 0X200, "INTERFRING");

   ParamImpl<Float> F_INTERFCP = new ParamImpl<Float>('F', 0X200, "INTERFCP");

   ParamImpl<Float> F_INTERFIP = new ParamImpl<Float>('F', 0X200, "INTERFIP");

   ParamImpl<Float> F_INTERFRAT = new ParamImpl<Float>('F', 0X200, "INTERFRAT");

   ParamImpl<Float> F_INTERFRATERR = new ParamImpl<Float>('F', 0X200, "INTERFRATERR");

   ParamImpl<String> T_INTREDN = new ParamImpl<String>('T', 0X200, "INTREDN");

   ParamImpl<Float> F_INTREDL = new ParamImpl<Float>('F', 0X200, "INTREDL");

   ParamImpl<String> T_INTRINGN = new ParamImpl<String>('T', 0X200, "INTRINGN");

   ParamImpl<Float> F_INTRINGL = new ParamImpl<Float>('F', 0X200, "INTRINGL");

   ParamImpl<Long> L_INTRFLAGS = new ParamImpl<Long>('L', 0X200, "INTRFLAGS");

   ParamImpl<String> T_RDFSUNITS = new ParamImpl<String>('T', 0X200, "RDFSUNITS");

   ParamImpl<String> T_RDFUNKNL = new ParamImpl<String>('T', 0X200, "RDFUNKNL");

   ParamImpl<Date> X_RDFSDATE = new ParamImpl<Date>('X', 0X200, "RDFSDATE");

   ParamImpl<Float> F_RDFTNFLUX = new ParamImpl<Float>('F', 0X200, "RDFTNFLUX");

   ParamImpl<Float> F_RDFENFLUX = new ParamImpl<Float>('F', 0X200, "RDFENFLUX");

   ParamImpl<Date> X_RDFIRTIME = new ParamImpl<Date>('X', 0X200, "RDFIRTIME");

   ParamImpl<String> T_RDFSTYPE = new ParamImpl<String>('T', 0X200, "RDFSTYPE");

   ParamImpl<String> T_RDFCNFNAME = new ParamImpl<String>('T', 0X200, "RDFCNFNAME");

   ParamImpl<String> T_RDFNLIBNAME = new ParamImpl<String>('T', 0X200, "RDFNLIBNAME");

   ParamImpl<String> T_RDFILIBNAME = new ParamImpl<String>('T', 0X200, "RDFILIBNAME");

   ParamImpl<String> T_RDFSIDENT = new ParamImpl<String>('T', 0X200, "RDFSIDENT");

   ParamImpl<String> T_RDFSTITLE = new ParamImpl<String>('T', 0X200, "RDFSTITLE");

   ParamImpl<Float> F_RDFSQUANT = new ParamImpl<Float>('F', 0X200, "RDFSQUANT");

   ParamImpl<Float> F_RDFFNFLUX = new ParamImpl<Float>('F', 0X200, "RDFFNFLUX");

   ParamImpl<Date> X_RDFRSDATE = new ParamImpl<Date>('X', 0X200, "RDFRSDATE");

   ParamImpl<Date> X_RDFRIRTIME = new ParamImpl<Date>('X', 0X200, "RDFRIRTIME");

   ParamImpl<Long> L_RDFGRPNUM = new ParamImpl<Long>('L', 0X200, "RDFGRPNUM");

   ParamImpl<String> T_RDFUSRSTR1 = new ParamImpl<String>('T', 0X200, "RDFUSRSTR1");

   ParamImpl<Float> F_CALENERGY = new ParamImpl<Float>('F', 0X200, "CALENERGY");

   ParamImpl<Float> F_CALCENTROID = new ParamImpl<Float>('F', 0X200, "CALCENTROID");

   ParamImpl<Float> F_CALFWHM = new ParamImpl<Float>('F', 0X200, "CALFWHM");

   ParamImpl<String> T_CALVERS = new ParamImpl<String>('T', 0X200, "CALVERS");

   ParamImpl<String> T_ECOPNAME = new ParamImpl<String>('T', 0X200, "ECOPNAME");

   ParamImpl<Float> F_CALCENTERR = new ParamImpl<Float>('F', 0X200, "CALCENTERR");

   ParamImpl<Long> L_CALFLAGS = new ParamImpl<Long>('L', 0X200, "CALFLAGS");

   ParamImpl<Long> L_ERFPOORFIT = new ParamImpl<Long>('L', 0X200, "ERFPOORFIT");

   ParamImpl<Long> L_ERF511PEAK = new ParamImpl<Long>('L', 0X200, "ERF511PEAK");

   ParamImpl<Long> L_ERFREFPEAK = new ParamImpl<Long>('L', 0X200, "ERFREFPEAK");

   ParamImpl<Long> L_CURRPEAK = new ParamImpl<Long>('L', 0X200, "CURRPEAK");

   ParamImpl<Object> V_ERF_POORFIT = new ParamImpl<Object>('V', 0X00000000, "ERF_POORFIT");

   ParamImpl<Object> M_ERF_POORFIT = new ParamImpl<Object>('M', 0X00000001, "ERF_POORFIT");

   ParamImpl<Object> V_ERF_511PEAK = new ParamImpl<Object>('V', 0X00000001, "ERF_511PEAK");

   ParamImpl<Object> M_ERF_511PEAK = new ParamImpl<Object>('M', 0X00000002, "ERF_511PEAK");

   ParamImpl<Object> V_ERF_REFPEAK = new ParamImpl<Object>('V', 0X00000002, "ERF_REFPEAK");

   ParamImpl<Object> M_ERF_REFPEAK = new ParamImpl<Object>('M', 0X00000004, "ERF_REFPEAK");

   ParamImpl<String> T_SFEBACK = new ParamImpl<String>('T', 0X200, "SFEBACK");

   ParamImpl<String> T_SFEACTUNITS = new ParamImpl<String>('T', 0X200, "SFEACTUNITS");

   ParamImpl<Float> F_SFEACTMULT = new ParamImpl<Float>('F', 0X200, "SFEACTMULT");

   ParamImpl<String> T_SFENUCLIDE = new ParamImpl<String>('T', 0X200, "SFENUCLIDE");

   ParamImpl<String> T_SFECONFIG = new ParamImpl<String>('T', 0X200, "SFECONFIG");

   ParamImpl<Date> X_SFEHLFLIFE = new ParamImpl<Date>('X', 0X200, "SFEHLFLIFE");

   ParamImpl<String> T_SFEHLFUNITS = new ParamImpl<String>('T', 0X200, "SFEHLFUNITS");

   ParamImpl<Object> G_SFEACTVTY = new ParamImpl<Object>('G', 0X200, "SFEACTVTY");

   ParamImpl<Date> X_SFEDATE = new ParamImpl<Date>('X', 0X200, "SFEDATE");

   ParamImpl<Object> V_NAIF_UNKBACK = new ParamImpl<Object>('V', 0X00000000, "NAIF_UNKBACK");

   ParamImpl<Object> M_NAIF_UNKBACK = new ParamImpl<Object>('M', 0X00000001, "NAIF_UNKBACK");

   ParamImpl<Object> V_NAIF_STDBACK = new ParamImpl<Object>('V', 0X00000001, "NAIF_STDBACK");

   ParamImpl<Object> M_NAIF_STDBACK = new ParamImpl<Object>('M', 0X00000002, "NAIF_STDBACK");

   ParamImpl<Float> F_SWBCSTRTSPD = new ParamImpl<Float>('F', 0X200, "SWBCSTRTSPD");

   ParamImpl<Float> F_SWBCHOMESPD = new ParamImpl<Float>('F', 0X200, "SWBCHOMESPD");

   ParamImpl<Float> F_SWBCMAXSPD = new ParamImpl<Float>('F', 0X200, "SWBCMAXSPD");

   ParamImpl<Float> F_SWBCACCEL = new ParamImpl<Float>('F', 0X200, "SWBCACCEL");

   ParamImpl<Float> F_SWBCPULINCH = new ParamImpl<Float>('F', 0X200, "SWBCPULINCH");

   ParamImpl<Float> F_SWBCLENGTH = new ParamImpl<Float>('F', 0X200, "SWBCLENGTH");

   ParamImpl<String> T_SWBCSERPORT = new ParamImpl<String>('T', 0X200, "SWBCSERPORT");

   ParamImpl<String> T_SWBCTYPE = new ParamImpl<String>('T', 0X200, "SWBCTYPE");

   ParamImpl<String> T_SWBCCTLR = new ParamImpl<String>('T', 0X200, "SWBCCTLR");

   ParamImpl<Float> F_SWBCHOME = new ParamImpl<Float>('F', 0X200, "SWBCHOME");

   ParamImpl<Float> F_SWBCINMCS = new ParamImpl<Float>('F', 0X200, "SWBCINMCS");

   ParamImpl<Float> F_SWBCMANSPD = new ParamImpl<Float>('F', 0X200, "SWBCMANSPD");

   ParamImpl<Long> L_SWBCDIR = new ParamImpl<Long>('L', 0X200, "SWBCDIR");

   ParamImpl<String> T_EXPICRP = new ParamImpl<String>('T', 0X20100002, "EXPICRP");

   ParamImpl<String> T_EXPHCOUT = new ParamImpl<String>('T', 0X20100003, "EXPHCOUT");

   ParamImpl<Long> L_EXPFLAGS = new ParamImpl<Long>('L', 0X20100004, "EXPFLAGS");

   ParamImpl<String> T_EXPTITLE = new ParamImpl<String>('T', 0X20100005, "EXPTITLE");

   ParamImpl<Date> X_EXPPLIVE = new ParamImpl<Date>('X', 0X20100006, "EXPPLIVE");

   ParamImpl<Long> L_EXPREPMDA = new ParamImpl<Long>('L', 0X20100007, "EXPREPMDA");

   ParamImpl<Long> L_EXPAUTOSAV = new ParamImpl<Long>('L', 0X20100008, "EXPAUTOSAV");

   ParamImpl<Long> L_EXPAUTOREP = new ParamImpl<Long>('L', 0X20100009, "EXPAUTOREP");

   ParamImpl<Long> L_EXPBACKSUB = new ParamImpl<Long>('L', 0X2010000, "EXPBACKSUB");

   ParamImpl<String> T_EXPDDFNAME = new ParamImpl<String>('T', 0X2010000, "EXPDDFNAME");

   ParamImpl<Long> L_EXPROIS = new ParamImpl<Long>('L', 0X2010000, "EXPROIS");

   ParamImpl<Long> L_EXPREPPK = new ParamImpl<Long>('L', 0X2010000, "EXPREPPK");

   ParamImpl<Long> L_EXPREPPLT = new ParamImpl<Long>('L', 0X2010000, "EXPREPPLT");

   ParamImpl<String> T_EXPDSTUNITS = new ParamImpl<String>('T', 0X2010000, "EXPDSTUNITS");

   ParamImpl<Float> F_EXPDSTMULT = new ParamImpl<Float>('F', 0X20100010, "EXPDSTMULT");

   ParamImpl<Long> L_EXPNUMDISP = new ParamImpl<Long>('L', 0X20100011, "EXPNUMDISP");

   ParamImpl<Long> L_EXPPFLAGS = new ParamImpl<Long>('L', 0X20100012, "EXPPFLAGS");

   ParamImpl<Long> L_EXPPFB0 = new ParamImpl<Long>('L', 0X20100013, "EXPPFB0");

   ParamImpl<Long> L_EXPPFB1 = new ParamImpl<Long>('L', 0X20100014, "EXPPFB1");

   ParamImpl<Long> L_EXPPFB2 = new ParamImpl<Long>('L', 0X20100015, "EXPPFB2");

   ParamImpl<Long> L_EXPPFB3 = new ParamImpl<Long>('L', 0X20100016, "EXPPFB3");

   ParamImpl<Long> L_EXPPFB4 = new ParamImpl<Long>('L', 0X20100017, "EXPPFB4");

   ParamImpl<Long> L_EXPPFB5 = new ParamImpl<Long>('L', 0X20100018, "EXPPFB5");

   ParamImpl<Long> L_EXPPFB6 = new ParamImpl<Long>('L', 0X20100019, "EXPPFB6");

   ParamImpl<Long> L_EXPPFB7 = new ParamImpl<Long>('L', 0X2010001, "EXPPFB7");

   ParamImpl<Long> L_EXPPFB8 = new ParamImpl<Long>('L', 0X2010001, "EXPPFB8");

   ParamImpl<Long> L_EXPPFB9 = new ParamImpl<Long>('L', 0X2010001, "EXPPFB9");

   ParamImpl<Long> L_EXPPFB10 = new ParamImpl<Long>('L', 0X2010001, "EXPPFB10");

   ParamImpl<Long> L_EXPPFB11 = new ParamImpl<Long>('L', 0X2010001, "EXPPFB11");

   ParamImpl<Long> L_EXPPFB12 = new ParamImpl<Long>('L', 0X2010001, "EXPPFB12");

   ParamImpl<Long> L_EXPPFB13 = new ParamImpl<Long>('L', 0X20100020, "EXPPFB13");

   ParamImpl<Long> L_EXPPFB14 = new ParamImpl<Long>('L', 0X20100021, "EXPPFB14");

   ParamImpl<Long> L_EXPPFB15 = new ParamImpl<Long>('L', 0X20100022, "EXPPFB15");

   ParamImpl<Long> L_EXPPFB16 = new ParamImpl<Long>('L', 0X20100023, "EXPPFB16");

   ParamImpl<Long> L_EXPPFB17 = new ParamImpl<Long>('L', 0X20100024, "EXPPFB17");

   ParamImpl<Long> L_EXPPFB18 = new ParamImpl<Long>('L', 0X20100025, "EXPPFB18");

   ParamImpl<Long> L_EXPPFB19 = new ParamImpl<Long>('L', 0X20100026, "EXPPFB19");

   ParamImpl<Long> L_EXPPFB20 = new ParamImpl<Long>('L', 0X20100027, "EXPPFB20");

   ParamImpl<Long> L_EXPPFB21 = new ParamImpl<Long>('L', 0X20100028, "EXPPFB21");

   ParamImpl<Long> L_EXPPFB22 = new ParamImpl<Long>('L', 0X20100029, "EXPPFB22");

   ParamImpl<Long> L_EXPPFB23 = new ParamImpl<Long>('L', 0X2010002, "EXPPFB23");

   ParamImpl<Long> L_EXPPFB24 = new ParamImpl<Long>('L', 0X2010002, "EXPPFB24");

   ParamImpl<Long> L_EXPPFB25 = new ParamImpl<Long>('L', 0X2010002, "EXPPFB25");

   ParamImpl<Long> L_EXPPFB26 = new ParamImpl<Long>('L', 0X2010002, "EXPPFB26");

   ParamImpl<Long> L_EXPPFB27 = new ParamImpl<Long>('L', 0X2010002, "EXPPFB27");

   ParamImpl<Long> L_EXPPFB28 = new ParamImpl<Long>('L', 0X2010002, "EXPPFB28");

   ParamImpl<Long> L_EXPPFB29 = new ParamImpl<Long>('L', 0X20100030, "EXPPFB29");

   ParamImpl<Long> L_EXPPFB30 = new ParamImpl<Long>('L', 0X20100031, "EXPPFB30");

   ParamImpl<Long> L_EXPPFB31 = new ParamImpl<Long>('L', 0X20100032, "EXPPFB31");

   ParamImpl<Long> L_EXPRFLAGS = new ParamImpl<Long>('L', 0X20100033, "EXPRFLAGS");

   ParamImpl<Long> L_EXPRFPEAK = new ParamImpl<Long>('L', 0X20100034, "EXPRFPEAK");

   ParamImpl<Long> L_EXPRFEFF = new ParamImpl<Long>('L', 0X20100035, "EXPRFEFF");

   ParamImpl<Long> L_EXPRFACT = new ParamImpl<Long>('L', 0X20100036, "EXPRFACT");

   ParamImpl<Long> L_EXPRFSUM = new ParamImpl<Long>('L', 0X20100037, "EXPRFSUM");

   ParamImpl<Long> L_EXPRFPROP = new ParamImpl<Long>('L', 0X20100038, "EXPRFPROP");

   ParamImpl<Long> L_EXPRFUNK = new ParamImpl<Long>('L', 0X20100039, "EXPRFUNK");

   ParamImpl<Long> L_EXPRFREJ = new ParamImpl<Long>('L', 0X2010003, "EXPRFREJ");

   ParamImpl<Long> L_EXPRFINT = new ParamImpl<Long>('L', 0X2010003, "EXPRFINT");

   ParamImpl<Long> L_EXPRFMDA = new ParamImpl<Long>('L', 0X2010003, "EXPRFMDA");

   ParamImpl<Long> L_EXPRFMPC = new ParamImpl<Long>('L', 0X2010003, "EXPRFMPC");

   ParamImpl<Long> L_EXPRFPOST = new ParamImpl<Long>('L', 0X2010003, "EXPRFPOST");

   ParamImpl<Long> L_EXPRFBRF = new ParamImpl<Long>('L', 0X2010003, "EXPRFBRF");

   ParamImpl<Long> L_EXPRFFMPC = new ParamImpl<Long>('L', 0X20100040, "EXPRFFMPC");

   ParamImpl<Long> L_EXPRFEQV = new ParamImpl<Long>('L', 0X20100041, "EXPRFEQV");

   ParamImpl<Long> L_EXPRFSP1 = new ParamImpl<Long>('L', 0X20100042, "EXPRFSP1");

   ParamImpl<Long> L_EXPRFSP2 = new ParamImpl<Long>('L', 0X20100043, "EXPRFSP2");

   ParamImpl<Long> L_EXPRFSP3 = new ParamImpl<Long>('L', 0X20100044, "EXPRFSP3");

   ParamImpl<Long> L_EXPRFSP4 = new ParamImpl<Long>('L', 0X20100045, "EXPRFSP4");

   ParamImpl<Long> L_EXPRFSP5 = new ParamImpl<Long>('L', 0X20100046, "EXPRFSP5");

   ParamImpl<Long> L_EXPRFSP6 = new ParamImpl<Long>('L', 0X20100047, "EXPRFSP6");

   ParamImpl<Long> L_EXPRFTRL = new ParamImpl<Long>('L', 0X20100048, "EXPRFTRL");

   ParamImpl<String> T_EXPBACK = new ParamImpl<String>('T', 0X20100049, "EXPBACK");

   ParamImpl<String> T_EXPLIB = new ParamImpl<String>('T', 0X2010004, "EXPLIB");

   ParamImpl<String> T_EXPINT = new ParamImpl<String>('T', 0X2010004, "EXPINT");

   ParamImpl<String> T_EXPCERT = new ParamImpl<String>('T', 0X2010004, "EXPCERT");

   ParamImpl<String> T_EXPPLTDEV = new ParamImpl<String>('T', 0X2010004, "EXPPLTDEV");

   ParamImpl<String> T_EXPHDR1 = new ParamImpl<String>('T', 0X2010004, "EXPHDR1");

   ParamImpl<String> T_EXPHDR2 = new ParamImpl<String>('T', 0X2010004, "EXPHDR2");

   ParamImpl<Long> L_EXPAFLAGS = new ParamImpl<Long>('L', 0X20100050, "EXPAFLAGS");

   ParamImpl<Long> L_EXPAFEFF = new ParamImpl<Long>('L', 0X20100051, "EXPAFEFF");

   ParamImpl<Long> L_EXPAFBS = new ParamImpl<Long>('L', 0X20100052, "EXPAFBS");

   ParamImpl<Long> L_EXPAFPP = new ParamImpl<Long>('L', 0X20100053, "EXPAFPP");

   ParamImpl<Long> L_EXPAFNID = new ParamImpl<Long>('L', 0X20100054, "EXPAFNID");

   ParamImpl<Long> L_EXPAFINT = new ParamImpl<Long>('L', 0X20100055, "EXPAFINT");

   ParamImpl<Long> L_EXPAFWTM = new ParamImpl<Long>('L', 0X20100056, "EXPAFWTM");

   ParamImpl<Long> L_EXPAFDTL = new ParamImpl<Long>('L', 0X20100057, "EXPAFDTL");

   ParamImpl<Long> L_EXPRFSP7 = new ParamImpl<Long>('L', 0X20100058, "EXPRFSP7");

   ParamImpl<Long> L_EXPRFSP8 = new ParamImpl<Long>('L', 0X20100059, "EXPRFSP8");

   ParamImpl<Long> L_EXPRFSP9 = new ParamImpl<Long>('L', 0X2010005, "EXPRFSP9");

   ParamImpl<Long> L_EXPRFSP10 = new ParamImpl<Long>('L', 0X2010005, "EXPRFSP10");

   ParamImpl<Long> L_EXPRFSP11 = new ParamImpl<Long>('L', 0X2010005, "EXPRFSP11");

   ParamImpl<Long> L_EXPRFSP12 = new ParamImpl<Long>('L', 0X2010005, "EXPRFSP12");

   ParamImpl<Long> L_EXPRFSP13 = new ParamImpl<Long>('L', 0X2010005, "EXPRFSP13");

   ParamImpl<Long> L_EXPRFSP14 = new ParamImpl<Long>('L', 0X2010005, "EXPRFSP14");

   ParamImpl<Long> L_EXPRFSP15 = new ParamImpl<Long>('L', 0X20100060, "EXPRFSP15");

   ParamImpl<Long> L_EXPPFLAGS1 = new ParamImpl<Long>('L', 0X20100061, "EXPPFLAGS1");

   ParamImpl<Long> L_EXPPF1SP1 = new ParamImpl<Long>('L', 0X20100062, "EXPPF1SP1");

   ParamImpl<Long> L_EXPPF1SP2 = new ParamImpl<Long>('L', 0X20100063, "EXPPF1SP2");

   ParamImpl<Long> L_EXPPF1SP3 = new ParamImpl<Long>('L', 0X20100064, "EXPPF1SP3");

   ParamImpl<Long> L_EXPPF1SP4 = new ParamImpl<Long>('L', 0X20100065, "EXPPF1SP4");

   ParamImpl<Long> L_EXPPF1SP5 = new ParamImpl<Long>('L', 0X20100066, "EXPPF1SP5");

   ParamImpl<String> T_ACBATCHQ = new ParamImpl<String>('T', 0X20100067, "ACBATCHQ");

   ParamImpl<String> T_ACARCHNAME = new ParamImpl<String>('T', 0X20100068, "ACARCHNAME");

   ParamImpl<String> T_ACARGS1 = new ParamImpl<String>('T', 0X20100069, "ACARGS1");

   ParamImpl<String> T_ACARGS2 = new ParamImpl<String>('T', 0X2010006, "ACARGS2");

   ParamImpl<String> T_ACARGS3 = new ParamImpl<String>('T', 0X2010006, "ACARGS3");

   ParamImpl<String> T_ACARGS4 = new ParamImpl<String>('T', 0X2010006, "ACARGS4");

   ParamImpl<String> T_ACENGNAME = new ParamImpl<String>('T', 0X2010006, "ACENGNAME");

   ParamImpl<String> T_ACTARG1 = new ParamImpl<String>('T', 0X2010006, "ACTARG1");

   ParamImpl<String> T_WBCOUNTER = new ParamImpl<String>('T', 0X2010006, "WBCOUNTER");

   ParamImpl<String> T_PEAKLIB = new ParamImpl<String>('T', 0X20100072, "PEAKLIB");

   ParamImpl<String> T_SAMPFPL = new ParamImpl<String>('T', 0X20100073, "SAMPFPL");

   ParamImpl<String> T_REPTEMPLATE = new ParamImpl<String>('T', 0X20100074, "REPTEMPLATE");

   ParamImpl<Long> L_PAGENUM = new ParamImpl<Long>('L', 0X20100075, "PAGENUM");

   ParamImpl<Long> L_LINENUM = new ParamImpl<Long>('L', 0X20100076, "LINENUM");

   ParamImpl<String> T_SAMPLOG = new ParamImpl<String>('T', 0X20100077, "SAMPLOG");

   ParamImpl<String> T_QAFILE = new ParamImpl<String>('T', 0X20100078, "QAFILE");

   ParamImpl<String> T_ALPMSTDS = new ParamImpl<String>('T', 0X20100079, "ALPMSTDS");

   ParamImpl<String> T_ALPHMSTDS = new ParamImpl<String>('T', 0X20100079, "ALPHMSTDS");

   ParamImpl<String> T_RPTSECTNAME = new ParamImpl<String>('T', 0X2010007, "RPTSECTNAME");

   ParamImpl<Long> L_RPTFLAGS = new ParamImpl<Long>('L', 0X2010007, "RPTFLAGS");

   ParamImpl<Long> L_ACFLAGS = new ParamImpl<Long>('L', 0X2010007, "ACFLAGS");

   ParamImpl<String> T_ACTARG2 = new ParamImpl<String>('T', 0X2010007, "ACTARG2");

   ParamImpl<String> T_ACTARG3 = new ParamImpl<String>('T', 0X2010007, "ACTARG3");

   ParamImpl<Object> G_ACGARG1 = new ParamImpl<Object>('G', 0X2010007, "ACGARG1");

   ParamImpl<Object> G_ACGARG2 = new ParamImpl<Object>('G', 0X20100080, "ACGARG2");

   ParamImpl<Object> G_ACGARG3 = new ParamImpl<Object>('G', 0X20100081, "ACGARG3");

   ParamImpl<Long> L_ACLARG1 = new ParamImpl<Long>('L', 0X20100082, "ACLARG1");

   ParamImpl<Long> L_ACLARG2 = new ParamImpl<Long>('L', 0X20100083, "ACLARG2");

   ParamImpl<Long> L_ACLARG3 = new ParamImpl<Long>('L', 0X20100084, "ACLARG3");

   ParamImpl<Long> L_RPTFSCREEN = new ParamImpl<Long>('L', 0X20100085, "RPTFSCREEN");

   ParamImpl<Long> L_RPTFDISK = new ParamImpl<Long>('L', 0X20100086, "RPTFDISK");

   ParamImpl<Long> L_RPTFPRINTER = new ParamImpl<Long>('L', 0X20100087, "RPTFPRINTER");

   ParamImpl<Long> L_RPTFPAGE1 = new ParamImpl<Long>('L', 0X20100088, "RPTFPAGE1");

   ParamImpl<Long> L_RPTFNEWPAGE = new ParamImpl<Long>('L', 0X20100089, "RPTFNEWPAGE");

   ParamImpl<Long> L_RPTFNEWFILE = new ParamImpl<Long>('L', 0X2010008, "RPTFNEWFILE");

   ParamImpl<Long> L_ACFSCREEN = new ParamImpl<Long>('L', 0X2010008, "ACFSCREEN");

   ParamImpl<Long> L_ACFDISK = new ParamImpl<Long>('L', 0X2010008, "ACFDISK");

   ParamImpl<Long> L_ACFPRINTER = new ParamImpl<Long>('L', 0X2010008, "ACFPRINTER");

   ParamImpl<Long> L_ACFPAGE1 = new ParamImpl<Long>('L', 0X2010008, "ACFPAGE1");

   ParamImpl<Long> L_ACFNEWPAGE = new ParamImpl<Long>('L', 0X2010008, "ACFNEWPAGE");

   ParamImpl<Long> L_ACFNEWFILE = new ParamImpl<Long>('L', 0X20100090, "ACFNEWFILE");

   ParamImpl<Long> L_EXPREPWBP = new ParamImpl<Long>('L', 0X20100091, "EXPREPWBP");

   ParamImpl<Long> L_EXPREPDOSE = new ParamImpl<Long>('L', 0X20100092, "EXPREPDOSE");

   ParamImpl<Long> L_EXPAFDOSE = new ParamImpl<Long>('L', 0X20100093, "EXPAFDOSE");

   ParamImpl<String> T_ACTEMPLATE = new ParamImpl<String>('T', 0X20100094, "ACTEMPLATE");

   ParamImpl<Long> L_EXPDOWTM = new ParamImpl<Long>('L', 0X20100095, "EXPDOWTM");

   ParamImpl<Long> L_EXPREP10CFR20 = new ParamImpl<Long>('L', 0X20100096, "EXPREP10CFR20");

   ParamImpl<Long> L_CACLARG1 = new ParamImpl<Long>('L', 0X20100097, "CACLARG1");

   ParamImpl<String> T_NEUTBACKFILE = new ParamImpl<String>('T', 0X20100098, "NEUTBACKFILE");

   ParamImpl<String> T_GUISAMPFPL = new ParamImpl<String>('T', 0X20100099, "GUISAMPFPL");

   ParamImpl<String> T_SADFILE = new ParamImpl<String>('T', 0X2010009, "SADFILE");

   ParamImpl<Long> L_EXPPMODE = new ParamImpl<Long>('L', 0X2010009, "EXPPMODE");

   ParamImpl<Long> L_EXPPMLIVE = new ParamImpl<Long>('L', 0X2010009, "EXPPMLIVE");

   ParamImpl<Long> L_EXPPMREAL = new ParamImpl<Long>('L', 0X2010009, "EXPPMREAL");

   ParamImpl<Long> L_EXPPMSWEEPS = new ParamImpl<Long>('L', 0X2010009, "EXPPMSWEEPS");

   ParamImpl<Long> L_EXPPMLEVEL = new ParamImpl<Long>('L', 0X2010009, "EXPPMLEVEL");

   ParamImpl<Long> L_EXPPMAREA = new ParamImpl<Long>('L', 0X201000, "EXPPMAREA");

   ParamImpl<Long> L_EXPPMPERR = new ParamImpl<Long>('L', 0X201000, "EXPPMPERR");

   ParamImpl<Date> X_EXPPREAL = new ParamImpl<Date>('X', 0X201000, "EXPPREAL");

   ParamImpl<Long> L_EXPPTOTAL = new ParamImpl<Long>('L', 0X201000, "EXPPTOTAL");

   ParamImpl<Long> L_EXPPSWEEPS = new ParamImpl<Long>('L', 0X201000, "EXPPSWEEPS");

   ParamImpl<Long> L_EXPPLEVEL = new ParamImpl<Long>('L', 0X201000, "EXPPLEVEL");

   ParamImpl<Float> F_EXPPAREA = new ParamImpl<Float>('F', 0X201000, "EXPPAREA");

   ParamImpl<Float> F_EXPPPERR = new ParamImpl<Float>('F', 0X201000, "EXPPPERR");

   ParamImpl<Float> F_EXPPNETENG = new ParamImpl<Float>('F', 0X201000, "EXPPNETENG");

   ParamImpl<Long> L_EXPPTSCHAN = new ParamImpl<Long>('L', 0X201000, "EXPPTSCHAN");

   ParamImpl<Long> L_EXPPTECHAN = new ParamImpl<Long>('L', 0X201000, "EXPPTECHAN");

   ParamImpl<Date> X_EXPMAXPLIVE = new ParamImpl<Date>('X', 0X201000, "EXPMAXPLIVE");

   ParamImpl<String> T_ROIFILE = new ParamImpl<String>('T', 0X201000, "ROIFILE");

   ParamImpl<Long> L_CACLARG2 = new ParamImpl<Long>('L', 0X201000, "CACLARG2");

   ParamImpl<Object> G_CACGARG1 = new ParamImpl<Object>('G', 0X201000, "CACGARG1");

   ParamImpl<Long> L_ACFANAL0 = new ParamImpl<Long>('L', 0X201000, "ACFANAL0");

   ParamImpl<Long> L_RPTFANAL0 = new ParamImpl<Long>('L', 0X201000, "RPTFANAL0");

   ParamImpl<String> T_REAGENTFILE = new ParamImpl<String>('T', 0X201000, "REAGENTFILE");

   ParamImpl<Long> L_NUMALTINPS = new ParamImpl<Long>('L', 0X201000, "NUMALTINPS");

   ParamImpl<String> T_ALTINPUT1 = new ParamImpl<String>('T', 0X201000, "ALTINPUT1");

   ParamImpl<String> T_ALTINPUT2 = new ParamImpl<String>('T', 0X201000, "ALTINPUT2");

   ParamImpl<String> T_ALTINPUT3 = new ParamImpl<String>('T', 0X201000, "ALTINPUT3");

   ParamImpl<String> T_ALTINPUT4 = new ParamImpl<String>('T', 0X201000, "ALTINPUT4");

   ParamImpl<String> T_ALTINPUT5 = new ParamImpl<String>('T', 0X201000, "ALTINPUT5");

   ParamImpl<String> T_ALTINPUT6 = new ParamImpl<String>('T', 0X201000, "ALTINPUT6");

   ParamImpl<String> T_ALTINPUT7 = new ParamImpl<String>('T', 0X201000, "ALTINPUT7");

   ParamImpl<String> T_ALTINPUT8 = new ParamImpl<String>('T', 0X201000, "ALTINPUT8");

   ParamImpl<String> T_ALTINPUT9 = new ParamImpl<String>('T', 0X201000, "ALTINPUT9");

   ParamImpl<String> T_ALTINPUT10 = new ParamImpl<String>('T', 0X201000, "ALTINPUT10");

   ParamImpl<String> T_ALTINPUT11 = new ParamImpl<String>('T', 0X201000, "ALTINPUT11");

   ParamImpl<String> T_ALTINPUT12 = new ParamImpl<String>('T', 0X201000, "ALTINPUT12");

   ParamImpl<String> T_ALTINPUT13 = new ParamImpl<String>('T', 0X201000, "ALTINPUT13");

   ParamImpl<String> T_ALTINPUT14 = new ParamImpl<String>('T', 0X201000, "ALTINPUT14");

   ParamImpl<String> T_ALTINPUT15 = new ParamImpl<String>('T', 0X201000, "ALTINPUT15");

   ParamImpl<String> T_ALTINPUT16 = new ParamImpl<String>('T', 0X201000, "ALTINPUT16");

   ParamImpl<String> T_ALTINPUT17 = new ParamImpl<String>('T', 0X201000, "ALTINPUT17");

   ParamImpl<String> T_ALTINPUT18 = new ParamImpl<String>('T', 0X201000, "ALTINPUT18");

   ParamImpl<String> T_ALTINPUT19 = new ParamImpl<String>('T', 0X201000, "ALTINPUT19");

   ParamImpl<String> T_ALTINPUT20 = new ParamImpl<String>('T', 0X201000, "ALTINPUT20");

   ParamImpl<String> T_ALTINPUT21 = new ParamImpl<String>('T', 0X201000, "ALTINPUT21");

   ParamImpl<String> T_ALTINPUT22 = new ParamImpl<String>('T', 0X201000, "ALTINPUT22");

   ParamImpl<String> T_ALTINPUT23 = new ParamImpl<String>('T', 0X201000, "ALTINPUT23");

   ParamImpl<String> T_ALTINPUT24 = new ParamImpl<String>('T', 0X201000, "ALTINPUT24");

   ParamImpl<String> T_ALTINPUT25 = new ParamImpl<String>('T', 0X201000, "ALTINPUT25");

   ParamImpl<String> T_ALTINPUT26 = new ParamImpl<String>('T', 0X201000, "ALTINPUT26");

   ParamImpl<String> T_ALTINPUT27 = new ParamImpl<String>('T', 0X201000, "ALTINPUT27");

   ParamImpl<String> T_ALTINPUT28 = new ParamImpl<String>('T', 0X201000, "ALTINPUT28");

   ParamImpl<String> T_ALTINPUT29 = new ParamImpl<String>('T', 0X201000, "ALTINPUT29");

   ParamImpl<String> T_ALTINPUT30 = new ParamImpl<String>('T', 0X201000, "ALTINPUT30");

   ParamImpl<String> T_ALTINPUT31 = new ParamImpl<String>('T', 0X201000, "ALTINPUT31");

   ParamImpl<String> T_ALTINPUT32 = new ParamImpl<String>('T', 0X201000, "ALTINPUT32");

   ParamImpl<String> T_ALTINPUT33 = new ParamImpl<String>('T', 0X201000, "ALTINPUT33");

   ParamImpl<String> T_ALTINPUT34 = new ParamImpl<String>('T', 0X201000, "ALTINPUT34");

   ParamImpl<String> T_ALTINPUT35 = new ParamImpl<String>('T', 0X201000, "ALTINPUT35");

   ParamImpl<String> T_ALTINPUT36 = new ParamImpl<String>('T', 0X201000, "ALTINPUT36");

   ParamImpl<String> T_ALTINPUT37 = new ParamImpl<String>('T', 0X201000, "ALTINPUT37");

   ParamImpl<String> T_ALTINPUT38 = new ParamImpl<String>('T', 0X201000, "ALTINPUT38");

   ParamImpl<String> T_ALTINPUT39 = new ParamImpl<String>('T', 0X201000, "ALTINPUT39");

   ParamImpl<String> T_ALTINPUT40 = new ParamImpl<String>('T', 0X201000, "ALTINPUT40");

   ParamImpl<String> T_ALTINPUT41 = new ParamImpl<String>('T', 0X201000, "ALTINPUT41");

   ParamImpl<String> T_ALTINPUT42 = new ParamImpl<String>('T', 0X201000, "ALTINPUT42");

   ParamImpl<String> T_ALTINPUT43 = new ParamImpl<String>('T', 0X201000, "ALTINPUT43");

   ParamImpl<String> T_ALTINPUT44 = new ParamImpl<String>('T', 0X201000, "ALTINPUT44");

   ParamImpl<String> T_ALTINPUT45 = new ParamImpl<String>('T', 0X201000, "ALTINPUT45");

   ParamImpl<String> T_ALTINPUT46 = new ParamImpl<String>('T', 0X201000, "ALTINPUT46");

   ParamImpl<String> T_ALTINPUT47 = new ParamImpl<String>('T', 0X201000, "ALTINPUT47");

   ParamImpl<String> T_ALTINPUT48 = new ParamImpl<String>('T', 0X201000, "ALTINPUT48");

   ParamImpl<String> T_TRANSFILE = new ParamImpl<String>('T', 0X201000, "TRANSFILE");

   ParamImpl<String> T_MACFILE = new ParamImpl<String>('T', 0X201000, "MACFILE");

   ParamImpl<String> T_MGAHIGHFILE = new ParamImpl<String>('T', 0X201000, "MGAHIGHFILE");

   ParamImpl<String> T_KEDREFSPEC = new ParamImpl<String>('T', 0X201000, "KEDREFSPEC");

   ParamImpl<String> T_EXPSABSLIB = new ParamImpl<String>('T', 0X201000, "EXPSABSLIB");

   ParamImpl<String> T_AASFILE = new ParamImpl<String>('T', 0X201000, "AASFILE");

   ParamImpl<String> T_ASTMNCCALFIL = new ParamImpl<String>('T', 0X201000, "ASTMNCCALFIL");

   ParamImpl<String> T_EXPCONTROL = new ParamImpl<String>('T', 0X201000, "EXPCONTROL");

   ParamImpl<String> T_MGAUCALFILE = new ParamImpl<String>('T', 0X201000, "MGAUCALFILE");

   ParamImpl<String> T_CNUCLIB = new ParamImpl<String>('T', 0X201000, "CNUCLIB");

   ParamImpl<String> T_MACFILE2 = new ParamImpl<String>('T', 0X201000, "MACFILE2");

   ParamImpl<String> T_MACFILE3 = new ParamImpl<String>('T', 0X201000, "MACFILE3");

   ParamImpl<String> T_MACFILE4 = new ParamImpl<String>('T', 0X201000, "MACFILE4");

   ParamImpl<String> T_MACFILE5 = new ParamImpl<String>('T', 0X201000, "MACFILE5");

   ParamImpl<Long> L_EXPREPDTNID = new ParamImpl<Long>('L', 0X201000, "EXPREPDTNID");

   ParamImpl<String> T_PEAKASF = new ParamImpl<String>('T', 0X201000, "PEAKASF");

   ParamImpl<String> T_TNIDLIB = new ParamImpl<String>('T', 0X201000, "TNIDLIB");

   ParamImpl<String> T_MEASISOFILE = new ParamImpl<String>('T', 0X201000, "MEASISOFILE");

   ParamImpl<Long> L_EXPPSTYPE = new ParamImpl<Long>('L', 0X201000, "EXPPSTYPE");

   ParamImpl<Long> L_EXPNIDTYPE = new ParamImpl<Long>('L', 0X201000, "EXPNIDTYPE");

   ParamImpl<Long> L_EXPISOTYPE = new ParamImpl<Long>('L', 0X201000, "EXPISOTYPE");

   ParamImpl<Long> L_EXPATTCORTYP = new ParamImpl<Long>('L', 0X201000, "EXPATTCORTYP");

   ParamImpl<Long> L_EXPNUTYPE = new ParamImpl<Long>('L', 0X201000, "EXPNUTYPE");

   ParamImpl<String> T_EXPNDARSECS = new ParamImpl<String>('T', 0X201000, "EXPNDARSECS");

   ParamImpl<Long> L_EXPPNIDTYPE = new ParamImpl<Long>('L', 0X201000, "EXPPNIDTYPE");

   ParamImpl<String> T_QUANTGFILE = new ParamImpl<String>('T', 0X201000, "QUANTGFILE");

   ParamImpl<String> T_DDAFILE = new ParamImpl<String>('T', 0X201000, "DDAFILE");

   ParamImpl<String> T_PDDAFILE = new ParamImpl<String>('T', 0X201000, "PDDAFILE");

   ParamImpl<String> T_NSHLDMCSFILE = new ParamImpl<String>('T', 0X201000, "NSHLDMCSFILE");

   ParamImpl<String> T_NBAREMCSFILE = new ParamImpl<String>('T', 0X20100100, "NBAREMCSFILE");

   ParamImpl<String> T_NBARRMCSFILE = new ParamImpl<String>('T', 0X20100101, "NBARRMCSFILE");

   ParamImpl<String> T_NFLUXMONFILE = new ParamImpl<String>('T', 0X20100102, "NFLUXMONFILE");

   ParamImpl<String> T_PASSIVENFILE = new ParamImpl<String>('T', 0X20100103, "PASSIVENFILE");

   ParamImpl<String> T_EFFCALFILE = new ParamImpl<String>('T', 0X20100104, "EFFCALFILE");

   ParamImpl<String> T_GISFILE = new ParamImpl<String>('T', 0X20100105, "GISFILE");

   ParamImpl<Long> L_ACFILETYPE = new ParamImpl<Long>('L', 0X20100106, "ACFILETYPE");

   ParamImpl<String> T_TGSEROIFILE = new ParamImpl<String>('T', 0X20100107, "TGSEROIFILE");

   ParamImpl<String> T_TGSTROIFILE = new ParamImpl<String>('T', 0X20100108, "TGSTROIFILE");

   ParamImpl<String> T_TGSTMAXFILE = new ParamImpl<String>('T', 0X20100109, "TGSTMAXFILE");

   ParamImpl<String> T_CONTATTFILE = new ParamImpl<String>('T', 0X2010010, "CONTATTFILE");

   ParamImpl<String> T_NEUTACTBKGFL = new ParamImpl<String>('T', 0X2010010, "NEUTACTBKGFL");

   ParamImpl<String> T_ACTIVENFILE = new ParamImpl<String>('T', 0X2010010, "ACTIVENFILE");

   ParamImpl<String> T_ALTINPUT49 = new ParamImpl<String>('T', 0X2010010, "ALTINPUT49");

   ParamImpl<String> T_AGATRUESRC = new ParamImpl<String>('T', 0X2010010, "AGATRUESRC");

   ParamImpl<Long> L_AGACONVERGE = new ParamImpl<Long>('L', 0X2010010, "AGACONVERGE");

   ParamImpl<Long> L_AGAITERLIMIT = new ParamImpl<Long>('L', 0X20100110, "AGAITERLIMIT");

   ParamImpl<Long> L_AGAADJZERO = new ParamImpl<Long>('L', 0X20100111, "AGAADJZERO");

   ParamImpl<Float> F_AGAMAXGAIN = new ParamImpl<Float>('F', 0X20100112, "AGAMAXGAIN");

   ParamImpl<Long> L_AGADOINITQA = new ParamImpl<Long>('L', 0X20100113, "AGADOINITQA");

   ParamImpl<Long> L_AGADOFINQA = new ParamImpl<Long>('L', 0X20100114, "AGADOFINQA");

   ParamImpl<Date> X_AGASTARTTIME = new ParamImpl<Date>('X', 0X20100115, "AGASTARTTIME");

   ParamImpl<Long> L_AGAITERDONE = new ParamImpl<Long>('L', 0X20100116, "AGAITERDONE");

   ParamImpl<String> T_AGASTATUS = new ParamImpl<String>('T', 0X20100117, "AGASTATUS");

   ParamImpl<Float> F_AGAAMPGAIN = new ParamImpl<Float>('F', 0X20100118, "AGAAMPGAIN");

   ParamImpl<Float> F_AGAADCZERO = new ParamImpl<Float>('F', 0X20100119, "AGAADCZERO");

   ParamImpl<Float> F_AGATOLFACTOR = new ParamImpl<Float>('F', 0X2010011, "AGATOLFACTOR");

   ParamImpl<Float> F_AGAECOFFSET = new ParamImpl<Float>('F', 0X2010011, "AGAECOFFSET");

   ParamImpl<Float> F_AGAECSLOPE = new ParamImpl<Float>('F', 0X2010011, "AGAECSLOPE");

   ParamImpl<Float> F_AGAECQUAD = new ParamImpl<Float>('F', 0X2010011, "AGAECQUAD");

   ParamImpl<Float> F_AGAECALFAC1 = new ParamImpl<Float>('F', 0X2010011, "AGAECALFAC1");

   ParamImpl<Float> F_AGAECALFAC2 = new ParamImpl<Float>('F', 0X2010011, "AGAECALFAC2");

   ParamImpl<Float> F_AGAECALFAC3 = new ParamImpl<Float>('F', 0X20100120, "AGAECALFAC3");

   ParamImpl<Long> L_AGAUSEASF = new ParamImpl<Long>('L', 0X20100121, "AGAUSEASF");

   ParamImpl<Long> L_AGADONE = new ParamImpl<Long>('L', 0X20100122, "AGADONE");

   ParamImpl<Float> F_AGARELCRIT = new ParamImpl<Float>('F', 0X20100123, "AGARELCRIT");

   ParamImpl<Long> L_AGAACCEPTED = new ParamImpl<Long>('L', 0X20100124, "AGAACCEPTED");

   ParamImpl<Float> F_AGAFWHMOFF = new ParamImpl<Float>('F', 0X20100125, "AGAFWHMOFF");

   ParamImpl<Float> F_AGAFWHMSLOPE = new ParamImpl<Float>('F', 0X20100126, "AGAFWHMSLOPE");

   ParamImpl<String> T_NLSTSIGNFILE = new ParamImpl<String>('T', 0X20100127, "NLSTSIGNFILE");

   ParamImpl<String> T_NLSTRANDFILE = new ParamImpl<String>('T', 0X20100128, "NLSTRANDFILE");

   ParamImpl<String> T_SAVEFDS = new ParamImpl<String>('T', 0X20100129, "SAVEFDS");

   ParamImpl<Long> L_EXPENHDPGRID = new ParamImpl<Long>('L', 0X2010012, "EXPENHDPGRID");

   ParamImpl<Long> L_EXPENHDPXSCL = new ParamImpl<Long>('L', 0X2010012, "EXPENHDPXSCL");

   ParamImpl<Long> L_EXPENHDPTYPE = new ParamImpl<Long>('L', 0X2010012, "EXPENHDPTYPE");

   ParamImpl<Long> L_EXPENHDPSAVE = new ParamImpl<Long>('L', 0X2010012, "EXPENHDPSAVE");

   ParamImpl<Long> L_EXPENHDPNORD = new ParamImpl<Long>('L', 0X2010012, "EXPENHDPNORD");

   ParamImpl<Long> L_EXPENHDPNSRC = new ParamImpl<Long>('L', 0X2010012, "EXPENHDPNSRC");

   ParamImpl<String> T_TGSSTNDFILE = new ParamImpl<String>('T', 0X20100130, "TGSSTNDFILE");

   ParamImpl<String> T_TGSBULKFILE = new ParamImpl<String>('T', 0X20100131, "TGSBULKFILE");

   ParamImpl<String> T_TGSLAYERFILE = new ParamImpl<String>('T', 0X20100132, "TGSLAYERFILE");

   ParamImpl<String> T_EXPSTRIP = new ParamImpl<String>('T', 0X20100133, "EXPSTRIP");

   ParamImpl<String> T_PSHUFFILE = new ParamImpl<String>('T', 0X20100134, "PSHUFFILE");

   ParamImpl<String> T_NSHUFFILE = new ParamImpl<String>('T', 0X20100135, "NSHUFFILE");

   ParamImpl<Object> V_RPTF_SCREEN = new ParamImpl<Object>('V', 0X00000000, "RPTF_SCREEN");

   ParamImpl<Object> M_RPTF_SCREEN = new ParamImpl<Object>('M', 0X00000001, "RPTF_SCREEN");

   ParamImpl<Object> V_RPTF_DISK = new ParamImpl<Object>('V', 0X00000001, "RPTF_DISK");

   ParamImpl<Object> M_RPTF_DISK = new ParamImpl<Object>('M', 0X00000002, "RPTF_DISK");

   ParamImpl<Object> V_RPTF_PRINTER = new ParamImpl<Object>('V', 0X00000002, "RPTF_PRINTER");

   ParamImpl<Object> M_RPTF_PRINTER = new ParamImpl<Object>('M', 0X00000004, "RPTF_PRINTER");

   ParamImpl<Object> V_RPTF_PAGE1 = new ParamImpl<Object>('V', 0X00000003, "RPTF_PAGE1");

   ParamImpl<Object> M_RPTF_PAGE1 = new ParamImpl<Object>('M', 0X00000008, "RPTF_PAGE1");

   ParamImpl<Object> V_RPTF_NEWPAGE = new ParamImpl<Object>('V', 0X00000004, "RPTF_NEWPAGE");

   ParamImpl<Object> M_RPTF_NEWPAGE = new ParamImpl<Object>('M', 0X00000010, "RPTF_NEWPAGE");

   ParamImpl<Object> V_RPTF_NEWFILE = new ParamImpl<Object>('V', 0X00000005, "RPTF_NEWFILE");

   ParamImpl<Object> M_RPTF_NEWFILE = new ParamImpl<Object>('M', 0X00000020, "RPTF_NEWFILE");

   ParamImpl<Object> V_RPTF_ANAL0 = new ParamImpl<Object>('V', 0X00000007, "RPTF_ANAL0");

   ParamImpl<Object> M_RPTF_ANAL0 = new ParamImpl<Object>('M', 0X00000080, "RPTF_ANAL0");

   ParamImpl<Object> V_EXPF_REPMDA = new ParamImpl<Object>('V', 0X00000000, "EXPF_REPMDA");

   ParamImpl<Object> M_EXPF_REPMDA = new ParamImpl<Object>('M', 0X00000001, "EXPF_REPMDA");

   ParamImpl<Object> V_EXPF_AUTOSAV = new ParamImpl<Object>('V', 0X00000001, "EXPF_AUTOSAV");

   ParamImpl<Object> M_EXPF_AUTOSAV = new ParamImpl<Object>('M', 0X00000002, "EXPF_AUTOSAV");

   ParamImpl<Object> V_EXPF_AUTOREP = new ParamImpl<Object>('V', 0X00000002, "EXPF_AUTOREP");

   ParamImpl<Object> M_EXPF_AUTOREP = new ParamImpl<Object>('M', 0X00000004, "EXPF_AUTOREP");

   ParamImpl<Object> V_EXPF_BACKSUB = new ParamImpl<Object>('V', 0X00000003, "EXPF_BACKSUB");

   ParamImpl<Object> M_EXPF_BACKSUB = new ParamImpl<Object>('M', 0X00000008, "EXPF_BACKSUB");

   ParamImpl<Object> V_EXPF_ROIS = new ParamImpl<Object>('V', 0X00000004, "EXPF_ROIS");

   ParamImpl<Object> M_EXPF_ROIS = new ParamImpl<Object>('M', 0X00000010, "EXPF_ROIS");

   ParamImpl<Object> V_EXPF_REPPK = new ParamImpl<Object>('V', 0X00000005, "EXPF_REPPK");

   ParamImpl<Object> M_EXPF_REPPK = new ParamImpl<Object>('M', 0X00000020, "EXPF_REPPK");

   ParamImpl<Object> V_EXPF_REPPLT = new ParamImpl<Object>('V', 0X00000006, "EXPF_REPPLT");

   ParamImpl<Object> M_EXPF_REPPLT = new ParamImpl<Object>('M', 0X00000040, "EXPF_REPPLT");

   ParamImpl<Object> V_EXPF_REPWBP = new ParamImpl<Object>('V', 0X00000007, "EXPF_REPWBP");

   ParamImpl<Object> M_EXPF_REPWBP = new ParamImpl<Object>('M', 0X00000080, "EXPF_REPWBP");

   ParamImpl<Object> V_EXPF_REPDOSE = new ParamImpl<Object>('V', 0X00000008, "EXPF_REPDOSE");

   ParamImpl<Object> M_EXPF_REPDOSE = new ParamImpl<Object>('M', 0X00000100, "EXPF_REPDOSE");

   ParamImpl<Object> V_EXPF_DOWTM = new ParamImpl<Object>('V', 0X00000009, "EXPF_DOWTM");

   ParamImpl<Object> M_EXPF_DOWTM = new ParamImpl<Object>('M', 0X00000200, "EXPF_DOWTM");

   ParamImpl<Object> V_EXPF_REP10CFR20 = new ParamImpl<Object>('V', 0X0000000, "EXPF_REP10CFR20");

   ParamImpl<Object> M_EXPF_REP10CFR20 = new ParamImpl<Object>('M', 0X00000400, "EXPF_REP10CFR20");

   ParamImpl<Object> V_EXPF_REPDTNID = new ParamImpl<Object>('V', 0X0000000, "EXPF_REPDTNID");

   ParamImpl<Object> M_EXPF_REPDTNID = new ParamImpl<Object>('M', 0X00000800, "EXPF_REPDTNID");

   ParamImpl<Object> V_EXPF_AGA2PASS = new ParamImpl<Object>('V', 0X0000000, "EXPF_AGA2PASS");

   ParamImpl<Object> M_EXPF_AGA2PASS = new ParamImpl<Object>('M', 0X00001000, "EXPF_AGA2PASS");

   ParamImpl<Object> V_EXPF_AGAADJ0 = new ParamImpl<Object>('V', 0X0000000, "EXPF_AGAADJ0");

   ParamImpl<Object> M_EXPF_AGAADJ0 = new ParamImpl<Object>('M', 0X00002000, "EXPF_AGAADJ0");

   ParamImpl<Object> V_EXPF_AGAIQA = new ParamImpl<Object>('V', 0X0000000, "EXPF_AGAIQA");

   ParamImpl<Object> M_EXPF_AGAIQA = new ParamImpl<Object>('M', 0X00004000, "EXPF_AGAIQA");

   ParamImpl<Object> V_EXPF_AGAFQA = new ParamImpl<Object>('V', 0X0000000, "EXPF_AGAFQA");

   ParamImpl<Object> M_EXPF_AGAFQA = new ParamImpl<Object>('M', 0X00008000, "EXPF_AGAFQA");

   ParamImpl<Object> V_EXPF_AGAUSEASF = new ParamImpl<Object>('V', 0X00000010, "EXPF_AGAUSEASF");

   ParamImpl<Object> M_EXPF_AGAUSEASF = new ParamImpl<Object>('M', 0X00010000, "EXPF_AGAUSEASF");

   ParamImpl<Object> V_EXPF_AGADONE = new ParamImpl<Object>('V', 0X00000011, "EXPF_AGADONE");

   ParamImpl<Object> M_EXPF_AGADONE = new ParamImpl<Object>('M', 0X00020000, "EXPF_AGADONE");

   ParamImpl<Object> V_EXPF_AGAACCEPT = new ParamImpl<Object>('V', 0X00000012, "EXPF_AGAACCEPT");

   ParamImpl<Object> M_EXPF_AGAACCEPT = new ParamImpl<Object>('M', 0X00040000, "EXPF_AGAACCEPT");

   ParamImpl<Object> V_EXPF_ENHDPGRID = new ParamImpl<Object>('V', 0X00000013, "EXPF_ENHDPGRID");

   ParamImpl<Object> M_EXPF_ENHDPGRID = new ParamImpl<Object>('M', 0X00080000, "EXPF_ENHDPGRID");

   ParamImpl<Object> V_EXPF_ENHDPXSCL = new ParamImpl<Object>('V', 0X00000014, "EXPF_ENHDPXSCL");

   ParamImpl<Object> M_EXPF_ENHDPXSCL = new ParamImpl<Object>('M', 0X00100000, "EXPF_ENHDPXSCL");

   ParamImpl<Object> V_EXPF_ENHDPSAVE = new ParamImpl<Object>('V', 0X00000015, "EXPF_ENHDPSAVE");

   ParamImpl<Object> M_EXPF_ENHDPSAVE = new ParamImpl<Object>('M', 0X00200000, "EXPF_ENHDPSAVE");

   ParamImpl<Object> V_EXPPF_B0 = new ParamImpl<Object>('V', 0X00000000, "EXPPF_B0");

   ParamImpl<Object> M_EXPPF_B0 = new ParamImpl<Object>('M', 0X00000001, "EXPPF_B0");

   ParamImpl<Object> V_EXPPF_B1 = new ParamImpl<Object>('V', 0X00000001, "EXPPF_B1");

   ParamImpl<Object> M_EXPPF_B1 = new ParamImpl<Object>('M', 0X00000002, "EXPPF_B1");

   ParamImpl<Object> V_EXPPF_B2 = new ParamImpl<Object>('V', 0X00000002, "EXPPF_B2");

   ParamImpl<Object> M_EXPPF_B2 = new ParamImpl<Object>('M', 0X00000004, "EXPPF_B2");

   ParamImpl<Object> V_EXPPF_B3 = new ParamImpl<Object>('V', 0X00000003, "EXPPF_B3");

   ParamImpl<Object> M_EXPPF_B3 = new ParamImpl<Object>('M', 0X00000008, "EXPPF_B3");

   ParamImpl<Object> V_EXPPF_B4 = new ParamImpl<Object>('V', 0X00000004, "EXPPF_B4");

   ParamImpl<Object> M_EXPPF_B4 = new ParamImpl<Object>('M', 0X00000010, "EXPPF_B4");

   ParamImpl<Object> V_EXPPF_B5 = new ParamImpl<Object>('V', 0X00000005, "EXPPF_B5");

   ParamImpl<Object> M_EXPPF_B5 = new ParamImpl<Object>('M', 0X00000020, "EXPPF_B5");

   ParamImpl<Object> V_EXPPF_B6 = new ParamImpl<Object>('V', 0X00000006, "EXPPF_B6");

   ParamImpl<Object> M_EXPPF_B6 = new ParamImpl<Object>('M', 0X00000040, "EXPPF_B6");

   ParamImpl<Object> V_EXPPF_B7 = new ParamImpl<Object>('V', 0X00000007, "EXPPF_B7");

   ParamImpl<Object> M_EXPPF_B7 = new ParamImpl<Object>('M', 0X00000080, "EXPPF_B7");

   ParamImpl<Object> V_EXPPF_B8 = new ParamImpl<Object>('V', 0X00000008, "EXPPF_B8");

   ParamImpl<Object> M_EXPPF_B8 = new ParamImpl<Object>('M', 0X00000100, "EXPPF_B8");

   ParamImpl<Object> V_EXPPF_B9 = new ParamImpl<Object>('V', 0X00000009, "EXPPF_B9");

   ParamImpl<Object> M_EXPPF_B9 = new ParamImpl<Object>('M', 0X00000200, "EXPPF_B9");

   ParamImpl<Object> V_EXPPF_B10 = new ParamImpl<Object>('V', 0X0000000, "EXPPF_B10");

   ParamImpl<Object> M_EXPPF_B10 = new ParamImpl<Object>('M', 0X00000400, "EXPPF_B10");

   ParamImpl<Object> V_EXPPF_B11 = new ParamImpl<Object>('V', 0X0000000, "EXPPF_B11");

   ParamImpl<Object> M_EXPPF_B11 = new ParamImpl<Object>('M', 0X00000800, "EXPPF_B11");

   ParamImpl<Object> V_EXPPF_B12 = new ParamImpl<Object>('V', 0X0000000, "EXPPF_B12");

   ParamImpl<Object> M_EXPPF_B12 = new ParamImpl<Object>('M', 0X00001000, "EXPPF_B12");

   ParamImpl<Object> V_EXPPF_B13 = new ParamImpl<Object>('V', 0X0000000, "EXPPF_B13");

   ParamImpl<Object> M_EXPPF_B13 = new ParamImpl<Object>('M', 0X00002000, "EXPPF_B13");

   ParamImpl<Object> V_EXPPF_B14 = new ParamImpl<Object>('V', 0X0000000, "EXPPF_B14");

   ParamImpl<Object> M_EXPPF_B14 = new ParamImpl<Object>('M', 0X00004000, "EXPPF_B14");

   ParamImpl<Object> V_EXPPF_B15 = new ParamImpl<Object>('V', 0X0000000, "EXPPF_B15");

   ParamImpl<Object> M_EXPPF_B15 = new ParamImpl<Object>('M', 0X00008000, "EXPPF_B15");

   ParamImpl<Object> V_EXPPF_B16 = new ParamImpl<Object>('V', 0X00000010, "EXPPF_B16");

   ParamImpl<Object> M_EXPPF_B16 = new ParamImpl<Object>('M', 0X00010000, "EXPPF_B16");

   ParamImpl<Object> V_EXPPF_B17 = new ParamImpl<Object>('V', 0X00000011, "EXPPF_B17");

   ParamImpl<Object> M_EXPPF_B17 = new ParamImpl<Object>('M', 0X00020000, "EXPPF_B17");

   ParamImpl<Object> V_EXPPF_B18 = new ParamImpl<Object>('V', 0X00000012, "EXPPF_B18");

   ParamImpl<Object> M_EXPPF_B18 = new ParamImpl<Object>('M', 0X00040000, "EXPPF_B18");

   ParamImpl<Object> V_EXPPF_B19 = new ParamImpl<Object>('V', 0X00000013, "EXPPF_B19");

   ParamImpl<Object> M_EXPPF_B19 = new ParamImpl<Object>('M', 0X00080000, "EXPPF_B19");

   ParamImpl<Object> V_EXPPF_B20 = new ParamImpl<Object>('V', 0X00000014, "EXPPF_B20");

   ParamImpl<Object> M_EXPPF_B20 = new ParamImpl<Object>('M', 0X00100000, "EXPPF_B20");

   ParamImpl<Object> V_EXPPF_B21 = new ParamImpl<Object>('V', 0X00000015, "EXPPF_B21");

   ParamImpl<Object> M_EXPPF_B21 = new ParamImpl<Object>('M', 0X00200000, "EXPPF_B21");

   ParamImpl<Object> V_EXPPF_B22 = new ParamImpl<Object>('V', 0X00000016, "EXPPF_B22");

   ParamImpl<Object> M_EXPPF_B22 = new ParamImpl<Object>('M', 0X00400000, "EXPPF_B22");

   ParamImpl<Object> V_EXPPF_B23 = new ParamImpl<Object>('V', 0X00000017, "EXPPF_B23");

   ParamImpl<Object> M_EXPPF_B23 = new ParamImpl<Object>('M', 0X00800000, "EXPPF_B23");

   ParamImpl<Object> V_EXPPF_B24 = new ParamImpl<Object>('V', 0X00000018, "EXPPF_B24");

   ParamImpl<Object> M_EXPPF_B24 = new ParamImpl<Object>('M', 0X01000000, "EXPPF_B24");

   ParamImpl<Object> V_EXPPF_B25 = new ParamImpl<Object>('V', 0X00000019, "EXPPF_B25");

   ParamImpl<Object> M_EXPPF_B25 = new ParamImpl<Object>('M', 0X02000000, "EXPPF_B25");

   ParamImpl<Object> V_EXPPF_B26 = new ParamImpl<Object>('V', 0X0000001, "EXPPF_B26");

   ParamImpl<Object> M_EXPPF_B26 = new ParamImpl<Object>('M', 0X04000000, "EXPPF_B26");

   ParamImpl<Object> V_EXPPF_B27 = new ParamImpl<Object>('V', 0X0000001, "EXPPF_B27");

   ParamImpl<Object> M_EXPPF_B27 = new ParamImpl<Object>('M', 0X08000000, "EXPPF_B27");

   ParamImpl<Object> V_EXPPF_B28 = new ParamImpl<Object>('V', 0X0000001, "EXPPF_B28");

   ParamImpl<Object> M_EXPPF_B28 = new ParamImpl<Object>('M', 0X10000000, "EXPPF_B28");

   ParamImpl<Object> V_EXPPF_B29 = new ParamImpl<Object>('V', 0X0000001, "EXPPF_B29");

   ParamImpl<Object> M_EXPPF_B29 = new ParamImpl<Object>('M', 0X20000000, "EXPPF_B29");

   ParamImpl<Object> V_EXPPF_B30 = new ParamImpl<Object>('V', 0X0000001, "EXPPF_B30");

   ParamImpl<Object> M_EXPPF_B30 = new ParamImpl<Object>('M', 0X40000000, "EXPPF_B30");

   ParamImpl<Object> V_EXPPF_B31 = new ParamImpl<Object>('V', 0X0000001, "EXPPF_B31");

   ParamImpl<Object> M_EXPPF_B31 = new ParamImpl<Object>('M', 0X80000000, "EXPPF_B31");

   ParamImpl<Object> V_EXPRF_PEAK = new ParamImpl<Object>('V', 0X00000000, "EXPRF_PEAK");

   ParamImpl<Object> M_EXPRF_PEAK = new ParamImpl<Object>('M', 0X00000001, "EXPRF_PEAK");

   ParamImpl<Object> V_EXPRF_EFF = new ParamImpl<Object>('V', 0X00000001, "EXPRF_EFF");

   ParamImpl<Object> M_EXPRF_EFF = new ParamImpl<Object>('M', 0X00000002, "EXPRF_EFF");

   ParamImpl<Object> V_EXPRF_ACT = new ParamImpl<Object>('V', 0X00000002, "EXPRF_ACT");

   ParamImpl<Object> M_EXPRF_ACT = new ParamImpl<Object>('M', 0X00000004, "EXPRF_ACT");

   ParamImpl<Object> V_EXPRF_SUM = new ParamImpl<Object>('V', 0X00000003, "EXPRF_SUM");

   ParamImpl<Object> M_EXPRF_SUM = new ParamImpl<Object>('M', 0X00000008, "EXPRF_SUM");

   ParamImpl<Object> V_EXPRF_PROP = new ParamImpl<Object>('V', 0X00000004, "EXPRF_PROP");

   ParamImpl<Object> M_EXPRF_PROP = new ParamImpl<Object>('M', 0X00000010, "EXPRF_PROP");

   ParamImpl<Object> V_EXPRF_UNK = new ParamImpl<Object>('V', 0X00000005, "EXPRF_UNK");

   ParamImpl<Object> M_EXPRF_UNK = new ParamImpl<Object>('M', 0X00000020, "EXPRF_UNK");

   ParamImpl<Object> V_EXPRF_REJ = new ParamImpl<Object>('V', 0X00000006, "EXPRF_REJ");

   ParamImpl<Object> M_EXPRF_REJ = new ParamImpl<Object>('M', 0X00000040, "EXPRF_REJ");

   ParamImpl<Object> V_EXPRF_INT = new ParamImpl<Object>('V', 0X00000007, "EXPRF_INT");

   ParamImpl<Object> M_EXPRF_INT = new ParamImpl<Object>('M', 0X00000080, "EXPRF_INT");

   ParamImpl<Object> V_EXPRF_MDA = new ParamImpl<Object>('V', 0X00000008, "EXPRF_MDA");

   ParamImpl<Object> M_EXPRF_MDA = new ParamImpl<Object>('M', 0X00000100, "EXPRF_MDA");

   ParamImpl<Object> V_EXPRF_MPC = new ParamImpl<Object>('V', 0X00000009, "EXPRF_MPC");

   ParamImpl<Object> M_EXPRF_MPC = new ParamImpl<Object>('M', 0X00000200, "EXPRF_MPC");

   ParamImpl<Object> V_EXPRF_POST = new ParamImpl<Object>('V', 0X0000000, "EXPRF_POST");

   ParamImpl<Object> M_EXPRF_POST = new ParamImpl<Object>('M', 0X00000400, "EXPRF_POST");

   ParamImpl<Object> V_EXPRF_BRF = new ParamImpl<Object>('V', 0X0000000, "EXPRF_BRF");

   ParamImpl<Object> M_EXPRF_BRF = new ParamImpl<Object>('M', 0X00000800, "EXPRF_BRF");

   ParamImpl<Object> V_EXPRF_FMPC = new ParamImpl<Object>('V', 0X0000000, "EXPRF_FMPC");

   ParamImpl<Object> M_EXPRF_FMPC = new ParamImpl<Object>('M', 0X00001000, "EXPRF_FMPC");

   ParamImpl<Object> V_EXPRF_EQV = new ParamImpl<Object>('V', 0X0000000, "EXPRF_EQV");

   ParamImpl<Object> M_EXPRF_EQV = new ParamImpl<Object>('M', 0X00002000, "EXPRF_EQV");

   ParamImpl<Object> V_EXPRF_SP1 = new ParamImpl<Object>('V', 0X0000000, "EXPRF_SP1");

   ParamImpl<Object> M_EXPRF_SP1 = new ParamImpl<Object>('M', 0X00004000, "EXPRF_SP1");

   ParamImpl<Object> V_EXPRF_SP2 = new ParamImpl<Object>('V', 0X0000000, "EXPRF_SP2");

   ParamImpl<Object> M_EXPRF_SP2 = new ParamImpl<Object>('M', 0X00008000, "EXPRF_SP2");

   ParamImpl<Object> V_EXPRF_SP3 = new ParamImpl<Object>('V', 0X00000010, "EXPRF_SP3");

   ParamImpl<Object> M_EXPRF_SP3 = new ParamImpl<Object>('M', 0X00010000, "EXPRF_SP3");

   ParamImpl<Object> V_EXPRF_SP4 = new ParamImpl<Object>('V', 0X00000011, "EXPRF_SP4");

   ParamImpl<Object> M_EXPRF_SP4 = new ParamImpl<Object>('M', 0X00020000, "EXPRF_SP4");

   ParamImpl<Object> V_EXPRF_SP5 = new ParamImpl<Object>('V', 0X00000012, "EXPRF_SP5");

   ParamImpl<Object> M_EXPRF_SP5 = new ParamImpl<Object>('M', 0X00040000, "EXPRF_SP5");

   ParamImpl<Object> V_EXPRF_SP6 = new ParamImpl<Object>('V', 0X00000013, "EXPRF_SP6");

   ParamImpl<Object> M_EXPRF_SP6 = new ParamImpl<Object>('M', 0X00080000, "EXPRF_SP6");

   ParamImpl<Object> V_EXPRF_TRL = new ParamImpl<Object>('V', 0X00000014, "EXPRF_TRL");

   ParamImpl<Object> M_EXPRF_TRL = new ParamImpl<Object>('M', 0X00100000, "EXPRF_TRL");

   ParamImpl<Object> V_EXPRF_SP7 = new ParamImpl<Object>('V', 0X00000015, "EXPRF_SP7");

   ParamImpl<Object> M_EXPRF_SP7 = new ParamImpl<Object>('M', 0X00200000, "EXPRF_SP7");

   ParamImpl<Object> V_EXPRF_SP8 = new ParamImpl<Object>('V', 0X00000016, "EXPRF_SP8");

   ParamImpl<Object> M_EXPRF_SP8 = new ParamImpl<Object>('M', 0X00400000, "EXPRF_SP8");

   ParamImpl<Object> V_EXPRF_SP9 = new ParamImpl<Object>('V', 0X00000017, "EXPRF_SP9");

   ParamImpl<Object> M_EXPRF_SP9 = new ParamImpl<Object>('M', 0X00800000, "EXPRF_SP9");

   ParamImpl<Object> V_EXPRF_SP10 = new ParamImpl<Object>('V', 0X00000018, "EXPRF_SP10");

   ParamImpl<Object> M_EXPRF_SP10 = new ParamImpl<Object>('M', 0X01000000, "EXPRF_SP10");

   ParamImpl<Object> V_EXPAF_EFF = new ParamImpl<Object>('V', 0X00000000, "EXPAF_EFF");

   ParamImpl<Object> M_EXPAF_EFF = new ParamImpl<Object>('M', 0X00000001, "EXPAF_EFF");

   ParamImpl<Object> V_EXPAF_BS = new ParamImpl<Object>('V', 0X00000001, "EXPAF_BS");

   ParamImpl<Object> M_EXPAF_BS = new ParamImpl<Object>('M', 0X00000002, "EXPAF_BS");

   ParamImpl<Object> V_EXPAF_PP = new ParamImpl<Object>('V', 0X00000002, "EXPAF_PP");

   ParamImpl<Object> M_EXPAF_PP = new ParamImpl<Object>('M', 0X00000004, "EXPAF_PP");

   ParamImpl<Object> V_EXPAF_NID = new ParamImpl<Object>('V', 0X00000003, "EXPAF_NID");

   ParamImpl<Object> M_EXPAF_NID = new ParamImpl<Object>('M', 0X00000008, "EXPAF_NID");

   ParamImpl<Object> V_EXPAF_INT = new ParamImpl<Object>('V', 0X00000004, "EXPAF_INT");

   ParamImpl<Object> M_EXPAF_INT = new ParamImpl<Object>('M', 0X00000010, "EXPAF_INT");

   ParamImpl<Object> V_EXPAF_WTM = new ParamImpl<Object>('V', 0X00000005, "EXPAF_WTM");

   ParamImpl<Object> M_EXPAF_WTM = new ParamImpl<Object>('M', 0X00000020, "EXPAF_WTM");

   ParamImpl<Object> V_EXPAF_DTL = new ParamImpl<Object>('V', 0X00000006, "EXPAF_DTL");

   ParamImpl<Object> M_EXPAF_DTL = new ParamImpl<Object>('M', 0X00000040, "EXPAF_DTL");

   ParamImpl<Object> V_EXPAF_DOSE = new ParamImpl<Object>('V', 0X00000007, "EXPAF_DOSE");

   ParamImpl<Object> M_EXPAF_DOSE = new ParamImpl<Object>('M', 0X00000080, "EXPAF_DOSE");

   ParamImpl<Object> V_RPF_NEWPAGE = new ParamImpl<Object>('V', 0X00000000, "RPF_NEWPAGE");

   ParamImpl<Object> M_RPF_NEWPAGE = new ParamImpl<Object>('M', 0X00000001, "RPF_NEWPAGE");

   ParamImpl<Object> V_RPF_INITPAGE = new ParamImpl<Object>('V', 0X00000001, "RPF_INITPAGE");

   ParamImpl<Object> M_RPF_INITPAGE = new ParamImpl<Object>('M', 0X00000002, "RPF_INITPAGE");

   ParamImpl<String> T_PTSSRCID = new ParamImpl<String>('T', 0X20110002, "PTSSRCID");

   ParamImpl<Float> F_PTSSHLFHGT = new ParamImpl<Float>('F', 0X20110003, "PTSSHLFHGT");

   ParamImpl<Date> X_PTSCNTIME = new ParamImpl<Date>('X', 0X20110004, "PTSCNTIME");

   ParamImpl<Date> X_PTSLSTPASS = new ParamImpl<Date>('X', 0X20110005, "PTSLSTPASS");

   ParamImpl<Float> F_PTSCONET = new ParamImpl<Float>('F', 0X20110006, "PTSCONET");

   ParamImpl<Date> X_PTSCODATE = new ParamImpl<Date>('X', 0X20110007, "PTSCODATE");

   ParamImpl<Float> F_PTSCOTHSIG = new ParamImpl<Float>('F', 0X20110008, "PTSCOTHSIG");

   ParamImpl<Float> F_PTSCOEXSIG = new ParamImpl<Float>('F', 0X20110009, "PTSCOEXSIG");

   ParamImpl<Float> F_PTSCOCNTLOW = new ParamImpl<Float>('F', 0X2011000, "PTSCOCNTLOW");

   ParamImpl<Float> F_PTSCOCNTUP = new ParamImpl<Float>('F', 0X2011000, "PTSCOCNTUP");

   ParamImpl<Float> F_PTSCOFWLOW = new ParamImpl<Float>('F', 0X2011000, "PTSCOFWLOW");

   ParamImpl<Float> F_PTSCOFWUP = new ParamImpl<Float>('F', 0X2011000, "PTSCOFWUP");

   ParamImpl<Float> F_PTSBANET = new ParamImpl<Float>('F', 0X2011000, "PTSBANET");

   ParamImpl<Date> X_PTSBADATE = new ParamImpl<Date>('X', 0X2011000, "PTSBADATE");

   ParamImpl<Float> F_PTSBATHSIG = new ParamImpl<Float>('F', 0X20110010, "PTSBATHSIG");

   ParamImpl<Float> F_PTSBAEXSIG = new ParamImpl<Float>('F', 0X20110011, "PTSBAEXSIG");

   ParamImpl<Float> F_PTSBACNTLOW = new ParamImpl<Float>('F', 0X20110012, "PTSBACNTLOW");

   ParamImpl<Float> F_PTSBACNTUP = new ParamImpl<Float>('F', 0X20110013, "PTSBACNTUP");

   ParamImpl<Date> X_PTSSTBPLT = new ParamImpl<Date>('X', 0X20110014, "PTSSTBPLT");

   ParamImpl<Date> X_PTSENBPLT = new ParamImpl<Date>('X', 0X20110015, "PTSENBPLT");

   ParamImpl<Long> L_PTSNPLTS = new ParamImpl<Long>('L', 0X20110016, "PTSNPLTS");

   ParamImpl<Long> L_PTSPLTFRQ = new ParamImpl<Long>('L', 0X20110017, "PTSPLTFRQ");

   ParamImpl<Long> L_PTSPLTDYS = new ParamImpl<Long>('L', 0X20110018, "PTSPLTDYS");

   ParamImpl<Date> X_PTSSTPLT = new ParamImpl<Date>('X', 0X20110019, "PTSSTPLT");

   ParamImpl<Date> X_PTSENPLT = new ParamImpl<Date>('X', 0X2011001, "PTSENPLT");

   ParamImpl<String> T_PTSPLTDEV = new ParamImpl<String>('T', 0X2011001, "PTSPLTDEV");

   ParamImpl<Long> L_PTSFLAG = new ParamImpl<Long>('L', 0X2011001, "PTSFLAG");

   ParamImpl<Long> L_PTSFBANET = new ParamImpl<Long>('L', 0X2011001, "PTSFBANET");

   ParamImpl<Long> L_PTSFBACNT = new ParamImpl<Long>('L', 0X2011001, "PTSFBACNT");

   ParamImpl<Long> L_PTSFCONET = new ParamImpl<Long>('L', 0X2011001, "PTSFCONET");

   ParamImpl<Long> L_PTSFCOCNT = new ParamImpl<Long>('L', 0X20110020, "PTSFCOCNT");

   ParamImpl<Long> L_PTSFCOFW = new ParamImpl<Long>('L', 0X20110021, "PTSFCOFW");

   ParamImpl<Long> L_PTSFPLTALL = new ParamImpl<Long>('L', 0X20110022, "PTSFPLTALL");

   ParamImpl<String> T_PTSINIT = new ParamImpl<String>('T', 0X20110023, "PTSINIT");

   ParamImpl<String> T_PTSREMARK = new ParamImpl<String>('T', 0X20110024, "PTSREMARK");

   ParamImpl<Date> X_PTSCHIST = new ParamImpl<Date>('X', 0X20110025, "PTSCHIST");

   ParamImpl<Date> X_PTSCHIEN = new ParamImpl<Date>('X', 0X20110026, "PTSCHIEN");

   ParamImpl<Long> L_PTSNCNTS = new ParamImpl<Long>('L', 0X20110027, "PTSNCNTS");

   ParamImpl<Long> L_PTSFBPLTALL = new ParamImpl<Long>('L', 0X20110028, "PTSFBPLTALL");

   ParamImpl<Long> L_PTSFTOTBKG = new ParamImpl<Long>('L', 0X20110029, "PTSFTOTBKG");

   ParamImpl<Long> L_PTSFBATPLT = new ParamImpl<Long>('L', 0X2011002, "PTSFBATPLT");

   ParamImpl<Float> F_PTSCONETLOW = new ParamImpl<Float>('F', 0X2011002, "PTSCONETLOW");

   ParamImpl<Float> F_PTSCONETHI = new ParamImpl<Float>('F', 0X2011002, "PTSCONETHI");

   ParamImpl<Float> F_PTSBANETLOW = new ParamImpl<Float>('F', 0X2011002, "PTSBANETLOW");

   ParamImpl<Float> F_PTSBANETHI = new ParamImpl<Float>('F', 0X2011002, "PTSBANETHI");

   ParamImpl<Long> L_PTSFFLOAT = new ParamImpl<Long>('L', 0X2011002, "PTSFFLOAT");

   ParamImpl<Object> V_PTSF_BANET = new ParamImpl<Object>('V', 0X00000000, "PTSF_BANET");

   ParamImpl<Object> M_PTSF_BANET = new ParamImpl<Object>('M', 0X00000001, "PTSF_BANET");

   ParamImpl<Object> V_PTSF_BACNT = new ParamImpl<Object>('V', 0X00000001, "PTSF_BACNT");

   ParamImpl<Object> M_PTSF_BACNT = new ParamImpl<Object>('M', 0X00000002, "PTSF_BACNT");

   ParamImpl<Object> V_PTSF_CONET = new ParamImpl<Object>('V', 0X00000002, "PTSF_CONET");

   ParamImpl<Object> M_PTSF_CONET = new ParamImpl<Object>('M', 0X00000004, "PTSF_CONET");

   ParamImpl<Object> V_PTSF_COCNT = new ParamImpl<Object>('V', 0X00000003, "PTSF_COCNT");

   ParamImpl<Object> M_PTSF_COCNT = new ParamImpl<Object>('M', 0X00000008, "PTSF_COCNT");

   ParamImpl<Object> V_PTSF_COFW = new ParamImpl<Object>('V', 0X00000004, "PTSF_COFW");

   ParamImpl<Object> M_PTSF_COFW = new ParamImpl<Object>('M', 0X00000010, "PTSF_COFW");

   ParamImpl<Object> V_PTSF_PLTALL = new ParamImpl<Object>('V', 0X00000005, "PTSF_PLTALL");

   ParamImpl<Object> M_PTSF_PLTALL = new ParamImpl<Object>('M', 0X00000020, "PTSF_PLTALL");

   ParamImpl<Object> V_PTSF_BPLTALL = new ParamImpl<Object>('V', 0X00000006, "PTSF_BPLTALL");

   ParamImpl<Object> M_PTSF_BPLTALL = new ParamImpl<Object>('M', 0X00000040, "PTSF_BPLTALL");

   ParamImpl<Object> V_PTSF_TOTBKG = new ParamImpl<Object>('V', 0X00000007, "PTSF_TOTBKG");

   ParamImpl<Object> M_PTSF_TOTBKG = new ParamImpl<Object>('M', 0X00000080, "PTSF_TOTBKG");

   ParamImpl<Object> V_PTSF_BATPLT = new ParamImpl<Object>('V', 0X00000008, "PTSF_BATPLT");

   ParamImpl<Object> M_PTSF_BATPLT = new ParamImpl<Object>('M', 0X00000100, "PTSF_BATPLT");

   ParamImpl<String> T_SECFULLNAME = new ParamImpl<String>('T', 0X20120002, "SECFULLNAME");

   ParamImpl<String> T_SECPASSWORD = new ParamImpl<String>('T', 0X20120003, "SECPASSWORD");

   ParamImpl<Long> L_SECMASK = new ParamImpl<Long>('L', 0X20120004, "SECMASK");

   ParamImpl<String> T_SECENTNAME = new ParamImpl<String>('T', 0X20120005, "SECENTNAME");

   ParamImpl<Long> L_SECBIT0 = new ParamImpl<Long>('L', 0X20120006, "SECBIT0");

   ParamImpl<Long> L_SECBIT1 = new ParamImpl<Long>('L', 0X20120007, "SECBIT1");

   ParamImpl<Long> L_SECBIT2 = new ParamImpl<Long>('L', 0X20120008, "SECBIT2");

   ParamImpl<Long> L_SECBIT3 = new ParamImpl<Long>('L', 0X20120009, "SECBIT3");

   ParamImpl<Long> L_SECBIT4 = new ParamImpl<Long>('L', 0X2012000, "SECBIT4");

   ParamImpl<Long> L_SECBIT5 = new ParamImpl<Long>('L', 0X2012000, "SECBIT5");

   ParamImpl<Long> L_SECBIT6 = new ParamImpl<Long>('L', 0X2012000, "SECBIT6");

   ParamImpl<Long> L_SECBIT7 = new ParamImpl<Long>('L', 0X2012000, "SECBIT7");

   ParamImpl<Long> L_SECBIT8 = new ParamImpl<Long>('L', 0X2012000, "SECBIT8");

   ParamImpl<Long> L_SECBIT9 = new ParamImpl<Long>('L', 0X2012000, "SECBIT9");

   ParamImpl<Long> L_SECBIT10 = new ParamImpl<Long>('L', 0X20120010, "SECBIT10");

   ParamImpl<Long> L_SECBIT11 = new ParamImpl<Long>('L', 0X20120011, "SECBIT11");

   ParamImpl<Long> L_SECBIT12 = new ParamImpl<Long>('L', 0X20120012, "SECBIT12");

   ParamImpl<Long> L_SECBIT13 = new ParamImpl<Long>('L', 0X20120013, "SECBIT13");

   ParamImpl<Long> L_SECBIT14 = new ParamImpl<Long>('L', 0X20120014, "SECBIT14");

   ParamImpl<Long> L_SECBIT15 = new ParamImpl<Long>('L', 0X20120015, "SECBIT15");

   ParamImpl<Long> L_SECBIT16 = new ParamImpl<Long>('L', 0X20120016, "SECBIT16");

   ParamImpl<Long> L_SECBIT17 = new ParamImpl<Long>('L', 0X20120017, "SECBIT17");

   ParamImpl<Long> L_SECBIT18 = new ParamImpl<Long>('L', 0X20120018, "SECBIT18");

   ParamImpl<Long> L_SECLEVEL = new ParamImpl<Long>('L', 0X20120019, "SECLEVEL");

   ParamImpl<Long> L_SECBIT19 = new ParamImpl<Long>('L', 0X2012001, "SECBIT19");

   ParamImpl<Long> L_SECBIT20 = new ParamImpl<Long>('L', 0X2012001, "SECBIT20");

   ParamImpl<Long> L_SECBIT21 = new ParamImpl<Long>('L', 0X2012001, "SECBIT21");

   ParamImpl<Long> L_SECBIT22 = new ParamImpl<Long>('L', 0X2012001, "SECBIT22");

   ParamImpl<Long> L_SECBIT23 = new ParamImpl<Long>('L', 0X2012001, "SECBIT23");

   ParamImpl<Long> L_SECBIT24 = new ParamImpl<Long>('L', 0X2012001, "SECBIT24");

   ParamImpl<Long> L_SECBIT25 = new ParamImpl<Long>('L', 0X20120020, "SECBIT25");

   ParamImpl<Long> L_SECBIT26 = new ParamImpl<Long>('L', 0X20120021, "SECBIT26");

   ParamImpl<Object> V_SEC_BIT0 = new ParamImpl<Object>('V', 0X00000000, "SEC_BIT0");

   ParamImpl<Object> M_SEC_BIT0 = new ParamImpl<Object>('M', 0X00000001, "SEC_BIT0");

   ParamImpl<Object> V_SEC_BIT1 = new ParamImpl<Object>('V', 0X00000001, "SEC_BIT1");

   ParamImpl<Object> M_SEC_BIT1 = new ParamImpl<Object>('M', 0X00000002, "SEC_BIT1");

   ParamImpl<Object> V_SEC_BIT2 = new ParamImpl<Object>('V', 0X00000002, "SEC_BIT2");

   ParamImpl<Object> M_SEC_BIT2 = new ParamImpl<Object>('M', 0X00000004, "SEC_BIT2");

   ParamImpl<Object> V_SEC_BIT3 = new ParamImpl<Object>('V', 0X00000003, "SEC_BIT3");

   ParamImpl<Object> M_SEC_BIT3 = new ParamImpl<Object>('M', 0X00000008, "SEC_BIT3");

   ParamImpl<Object> V_SEC_BIT4 = new ParamImpl<Object>('V', 0X00000004, "SEC_BIT4");

   ParamImpl<Object> M_SEC_BIT4 = new ParamImpl<Object>('M', 0X00000010, "SEC_BIT4");

   ParamImpl<Object> V_SEC_BIT5 = new ParamImpl<Object>('V', 0X00000005, "SEC_BIT5");

   ParamImpl<Object> M_SEC_BIT5 = new ParamImpl<Object>('M', 0X00000020, "SEC_BIT5");

   ParamImpl<Object> V_SEC_BIT6 = new ParamImpl<Object>('V', 0X00000006, "SEC_BIT6");

   ParamImpl<Object> M_SEC_BIT6 = new ParamImpl<Object>('M', 0X00000040, "SEC_BIT6");

   ParamImpl<Object> V_SEC_BIT7 = new ParamImpl<Object>('V', 0X00000007, "SEC_BIT7");

   ParamImpl<Object> M_SEC_BIT7 = new ParamImpl<Object>('M', 0X00000080, "SEC_BIT7");

   ParamImpl<Object> V_SEC_BIT8 = new ParamImpl<Object>('V', 0X00000008, "SEC_BIT8");

   ParamImpl<Object> M_SEC_BIT8 = new ParamImpl<Object>('M', 0X00000100, "SEC_BIT8");

   ParamImpl<Object> V_SEC_BIT9 = new ParamImpl<Object>('V', 0X00000009, "SEC_BIT9");

   ParamImpl<Object> M_SEC_BIT9 = new ParamImpl<Object>('M', 0X00000200, "SEC_BIT9");

   ParamImpl<Object> V_SEC_BIT10 = new ParamImpl<Object>('V', 0X0000000, "SEC_BIT10");

   ParamImpl<Object> M_SEC_BIT10 = new ParamImpl<Object>('M', 0X00000400, "SEC_BIT10");

   ParamImpl<Object> V_SEC_BIT11 = new ParamImpl<Object>('V', 0X0000000, "SEC_BIT11");

   ParamImpl<Object> M_SEC_BIT11 = new ParamImpl<Object>('M', 0X00000800, "SEC_BIT11");

   ParamImpl<Object> V_SEC_BIT12 = new ParamImpl<Object>('V', 0X0000000, "SEC_BIT12");

   ParamImpl<Object> M_SEC_BIT12 = new ParamImpl<Object>('M', 0X00001000, "SEC_BIT12");

   ParamImpl<Object> V_SEC_BIT13 = new ParamImpl<Object>('V', 0X0000000, "SEC_BIT13");

   ParamImpl<Object> M_SEC_BIT13 = new ParamImpl<Object>('M', 0X00002000, "SEC_BIT13");

   ParamImpl<Object> V_SEC_BIT14 = new ParamImpl<Object>('V', 0X0000000, "SEC_BIT14");

   ParamImpl<Object> M_SEC_BIT14 = new ParamImpl<Object>('M', 0X00004000, "SEC_BIT14");

   ParamImpl<Object> V_SEC_BIT15 = new ParamImpl<Object>('V', 0X0000000, "SEC_BIT15");

   ParamImpl<Object> M_SEC_BIT15 = new ParamImpl<Object>('M', 0X00008000, "SEC_BIT15");

   ParamImpl<Object> V_SEC_BIT16 = new ParamImpl<Object>('V', 0X00000010, "SEC_BIT16");

   ParamImpl<Object> M_SEC_BIT16 = new ParamImpl<Object>('M', 0X00010000, "SEC_BIT16");

   ParamImpl<Object> V_SEC_BIT17 = new ParamImpl<Object>('V', 0X00000011, "SEC_BIT17");

   ParamImpl<Object> M_SEC_BIT17 = new ParamImpl<Object>('M', 0X00020000, "SEC_BIT17");

   ParamImpl<Object> V_SEC_BIT18 = new ParamImpl<Object>('V', 0X00000012, "SEC_BIT18");

   ParamImpl<Object> M_SEC_BIT18 = new ParamImpl<Object>('M', 0X00040000, "SEC_BIT18");

   ParamImpl<Object> V_SEC_BIT19 = new ParamImpl<Object>('V', 0X00000013, "SEC_BIT19");

   ParamImpl<Object> M_SEC_BIT19 = new ParamImpl<Object>('M', 0X00080000, "SEC_BIT19");

   ParamImpl<Object> V_SEC_BIT20 = new ParamImpl<Object>('V', 0X00000014, "SEC_BIT20");

   ParamImpl<Object> M_SEC_BIT20 = new ParamImpl<Object>('M', 0X00100000, "SEC_BIT20");

   ParamImpl<Object> V_SEC_BIT21 = new ParamImpl<Object>('V', 0X00000015, "SEC_BIT21");

   ParamImpl<Object> M_SEC_BIT21 = new ParamImpl<Object>('M', 0X00200000, "SEC_BIT21");

   ParamImpl<Object> V_SEC_BIT22 = new ParamImpl<Object>('V', 0X00000016, "SEC_BIT22");

   ParamImpl<Object> M_SEC_BIT22 = new ParamImpl<Object>('M', 0X00400000, "SEC_BIT22");

   ParamImpl<Object> V_SEC_BIT23 = new ParamImpl<Object>('V', 0X00000017, "SEC_BIT23");

   ParamImpl<Object> M_SEC_BIT23 = new ParamImpl<Object>('M', 0X00800000, "SEC_BIT23");

   ParamImpl<Object> V_SEC_BIT24 = new ParamImpl<Object>('V', 0X00000018, "SEC_BIT24");

   ParamImpl<Object> M_SEC_BIT24 = new ParamImpl<Object>('M', 0X01000000, "SEC_BIT24");

   ParamImpl<Object> V_SEC_BIT25 = new ParamImpl<Object>('V', 0X00000019, "SEC_BIT25");

   ParamImpl<Object> M_SEC_BIT25 = new ParamImpl<Object>('M', 0X02000000, "SEC_BIT25");

   ParamImpl<Object> V_SEC_BIT26 = new ParamImpl<Object>('V', 0X0000001, "SEC_BIT26");

   ParamImpl<Object> M_SEC_BIT26 = new ParamImpl<Object>('M', 0X04000000, "SEC_BIT26");

   ParamImpl<String> T_SCOPNAME = new ParamImpl<String>('T', 0X20130002, "SCOPNAME");

   ParamImpl<String> T_SCALVERS = new ParamImpl<String>('T', 0X20130003, "SCALVERS");

   ParamImpl<Float> F_SCENERGY = new ParamImpl<Float>('F', 0X20130004, "SCENERGY");

   ParamImpl<Float> F_SCFWHM = new ParamImpl<Float>('F', 0X20130005, "SCFWHM");

   ParamImpl<Float> F_SCFWHMERR = new ParamImpl<Float>('F', 0X20130006, "SCFWHMERR");

   ParamImpl<Float> F_SCTAIL1 = new ParamImpl<Float>('F', 0X20130007, "SCTAIL1");

   ParamImpl<Float> F_SCTAIL1ERR = new ParamImpl<Float>('F', 0X20130008, "SCTAIL1ERR");

   ParamImpl<Float> F_SCTAIL2 = new ParamImpl<Float>('F', 0X20130009, "SCTAIL2");

   ParamImpl<Float> F_SCTAIL2ERR = new ParamImpl<Float>('F', 0X2013000, "SCTAIL2ERR");

   ParamImpl<Long> L_SCFLAGS = new ParamImpl<Long>('L', 0X2013000, "SCFLAGS");

   ParamImpl<Long> L_SCSTART = new ParamImpl<Long>('L', 0X2013000, "SCSTART");

   ParamImpl<Long> L_SCEND = new ParamImpl<Long>('L', 0X2013000, "SCEND");

   ParamImpl<Long> L_SCFPOORFIT = new ParamImpl<Long>('L', 0X2013000, "SCFPOORFIT");

   ParamImpl<Long> L_SCF511PEAK = new ParamImpl<Long>('L', 0X2013000, "SCF511PEAK");

   ParamImpl<Long> L_SCFREFPEAK = new ParamImpl<Long>('L', 0X20130010, "SCFREFPEAK");

   ParamImpl<Object> V_SCF_POORFIT = new ParamImpl<Object>('V', 0X00000000, "SCF_POORFIT");

   ParamImpl<Object> M_SCF_POORFIT = new ParamImpl<Object>('M', 0X00000001, "SCF_POORFIT");

   ParamImpl<Object> V_SCF_511PEAK = new ParamImpl<Object>('V', 0X00000001, "SCF_511PEAK");

   ParamImpl<Object> M_SCF_511PEAK = new ParamImpl<Object>('M', 0X00000002, "SCF_511PEAK");

   ParamImpl<Object> V_SCF_REFPEAK = new ParamImpl<Object>('V', 0X00000002, "SCF_REFPEAK");

   ParamImpl<Object> M_SCF_REFPEAK = new ParamImpl<Object>('M', 0X00000004, "SCF_REFPEAK");

   ParamImpl<String> T_SFGFAC = new ParamImpl<String>('T', 0X20140002, "SFGFAC");

   ParamImpl<String> T_RAWNAME1 = new ParamImpl<String>('T', 0X20140004, "RAWNAME1");

   ParamImpl<String> T_RAWNAME2 = new ParamImpl<String>('T', 0X20140005, "RAWNAME2");

   ParamImpl<String> T_EMQNAME = new ParamImpl<String>('T', 0X20140006, "EMQNAME");

   ParamImpl<String> T_AMQNAME = new ParamImpl<String>('T', 0X20140007, "AMQNAME");

   ParamImpl<String> T_DASID = new ParamImpl<String>('T', 0X20140008, "DASID");

   ParamImpl<String> T_DASLOC = new ParamImpl<String>('T', 0X20140009, "DASLOC");

   ParamImpl<Long> L_JSRVOLT = new ParamImpl<Long>('L', 0X2014000, "JSRVOLT");

   ParamImpl<Long> L_JSRGWIDTH = new ParamImpl<Long>('L', 0X2014000, "JSRGWIDTH");

   ParamImpl<Float> F_ADCULD = new ParamImpl<Float>('F', 0X2014000, "ADCULD");

   ParamImpl<Float> F_ADCLLD = new ParamImpl<Float>('F', 0X2014000, "ADCLLD");

   ParamImpl<Date> X_MAXCOUNT = new ParamImpl<Date>('X', 0X2014000, "MAXCOUNT");

   ParamImpl<String> T_FILESVCE1 = new ParamImpl<String>('T', 0X20140010, "FILESVCE1");

   ParamImpl<String> T_FILESVCE2 = new ParamImpl<String>('T', 0X20140011, "FILESVCE2");

   ParamImpl<Float> F_QCENERGY = new ParamImpl<Float>('F', 0X20140012, "QCENERGY");

   ParamImpl<Float> F_CENTLLIM = new ParamImpl<Float>('F', 0X20140013, "CENTLLIM");

   ParamImpl<Float> F_CENTULIM = new ParamImpl<Float>('F', 0X20140014, "CENTULIM");

   ParamImpl<Float> F_FWHMLLIM = new ParamImpl<Float>('F', 0X20140015, "FWHMLLIM");

   ParamImpl<Float> F_FWHMULIM = new ParamImpl<Float>('F', 0X20140016, "FWHMULIM");

   ParamImpl<Float> F_FWTMLLIM = new ParamImpl<Float>('F', 0X20140017, "FWTMLLIM");

   ParamImpl<Float> F_FWTMULIM = new ParamImpl<Float>('F', 0X20140018, "FWTMULIM");

   ParamImpl<String> T_UIDIR = new ParamImpl<String>('T', 0X20140019, "UIDIR");

   ParamImpl<Long> L_NUMEVCOMP = new ParamImpl<Long>('L', 0X2014001, "NUMEVCOMP");

   ParamImpl<String> T_GAMMADEF = new ParamImpl<String>('T', 0X2014001, "GAMMADEF");

   ParamImpl<Float> F_ADCZERO = new ParamImpl<Float>('F', 0X2014001, "ADCZERO");

   ParamImpl<Float> F_JSRPREDEL = new ParamImpl<Float>('F', 0X2014001, "JSRPREDEL");

   ParamImpl<Date> X_JSRCNTTIM = new ParamImpl<Date>('X', 0X2014001, "JSRCNTTIM");

   ParamImpl<Long> L_DASFLAGS = new ParamImpl<Long>('L', 0X2014001, "DASFLAGS");

   ParamImpl<Long> L_DASFCOMPRESS = new ParamImpl<Long>('L', 0X20140020, "DASFCOMPRESS");

   ParamImpl<Long> L_DASFUSENEUT = new ParamImpl<Long>('L', 0X20140021, "DASFUSENEUT");

   ParamImpl<Long> L_DASFUSEGAMMA = new ParamImpl<Long>('L', 0X20140022, "DASFUSEGAMMA");

   ParamImpl<Long> L_DASFUSESENS = new ParamImpl<Long>('L', 0X20140023, "DASFUSESENS");

   ParamImpl<Long> L_DASFUSESWD = new ParamImpl<Long>('L', 0X20140024, "DASFUSESWD");

   ParamImpl<Long> L_MAXDDPSIZE = new ParamImpl<Long>('L', 0X20140025, "MAXDDPSIZE");

   ParamImpl<Long> L_DASFPRIMARY = new ParamImpl<Long>('L', 0X20140026, "DASFPRIMARY");

   ParamImpl<Date> X_HDCTIMEOUT = new ParamImpl<Date>('X', 0X20140027, "HDCTIMEOUT");

   ParamImpl<Long> L_RETRYLIMIT = new ParamImpl<Long>('L', 0X20140028, "RETRYLIMIT");

   ParamImpl<Long> L_DASGAMMAMEM = new ParamImpl<Long>('L', 0X20140029, "DASGAMMAMEM");

   ParamImpl<Long> L_DASNEUTMEM = new ParamImpl<Long>('L', 0X2014002, "DASNEUTMEM");

   ParamImpl<Long> L_DASSENSORMEM = new ParamImpl<Long>('L', 0X2014002, "DASSENSORMEM");

   ParamImpl<Date> X_SWWTDOGTO = new ParamImpl<Date>('X', 0X2014002, "SWWTDOGTO");

   ParamImpl<Long> L_DASFCCADC = new ParamImpl<Long>('L', 0X2014002, "DASFCCADC");

   ParamImpl<Long> L_DASMINPTS = new ParamImpl<Long>('L', 0X2014002, "DASMINPTS");

   ParamImpl<Float> F_DASNEPT = new ParamImpl<Float>('F', 0X2014002, "DASNEPT");

   ParamImpl<Float> F_DASNEPDP = new ParamImpl<Float>('F', 0X20140030, "DASNEPDP");

   ParamImpl<Float> F_DASNBPT = new ParamImpl<Float>('F', 0X20140031, "DASNBPT");

   ParamImpl<Float> F_DASNBPDP = new ParamImpl<Float>('F', 0X20140032, "DASNBPDP");

   ParamImpl<Long> L_DASMTTPTS = new ParamImpl<Long>('L', 0X20140033, "DASMTTPTS");

   ParamImpl<Float> F_DASMTTTHR = new ParamImpl<Float>('F', 0X20140034, "DASMTTTHR");

   ParamImpl<Long> L_DASGSTART = new ParamImpl<Long>('L', 0X20140035, "DASGSTART");

   ParamImpl<Long> L_DASGEND = new ParamImpl<Long>('L', 0X20140036, "DASGEND");

   ParamImpl<Date> X_HDCHIBER = new ParamImpl<Date>('X', 0X20140037, "HDCHIBER");

   ParamImpl<Date> X_AMPHIBER = new ParamImpl<Date>('X', 0X20140038, "AMPHIBER");

   ParamImpl<Date> X_EMPHIBER = new ParamImpl<Date>('X', 0X20140039, "EMPHIBER");

   ParamImpl<Long> L_EMQRDMAX = new ParamImpl<Long>('L', 0X2014003, "EMQRDMAX");

   ParamImpl<Date> X_EMPWAITDEL = new ParamImpl<Date>('X', 0X2014003, "EMPWAITDEL");

   ParamImpl<Long> L_EMPNSTEVOB = new ParamImpl<Long>('L', 0X2014003, "EMPNSTEVOB");

   ParamImpl<Long> L_DASFSUMGAM = new ParamImpl<Long>('L', 0X2014003, "DASFSUMGAM");

   ParamImpl<Date> X_DASCMDTMR = new ParamImpl<Date>('X', 0X2014003, "DASCMDTMR");

   ParamImpl<Date> X_DASACKTMR = new ParamImpl<Date>('X', 0X2014003, "DASACKTMR");

   ParamImpl<Date> X_DASTRNTMR = new ParamImpl<Date>('X', 0X20140040, "DASTRNTMR");

   ParamImpl<Date> X_DASLFADUR = new ParamImpl<Date>('X', 0X20140041, "DASLFADUR");

   ParamImpl<Date> X_DASACKFRQ = new ParamImpl<Date>('X', 0X20140042, "DASACKFRQ");

   ParamImpl<Date> X_DASRTLTMR = new ParamImpl<Date>('X', 0X20140043, "DASRTLTMR");

   ParamImpl<Date> X_DASMPDEL = new ParamImpl<Date>('X', 0X20140044, "DASMPDEL");

   ParamImpl<Date> X_DASFSFTMR = new ParamImpl<Date>('X', 0X20140045, "DASFSFTMR");

   ParamImpl<Date> X_DASCSFTMR = new ParamImpl<Date>('X', 0X20140046, "DASCSFTMR");

   ParamImpl<Long> L_DASSTBPTS = new ParamImpl<Long>('L', 0X20140047, "DASSTBPTS");

   ParamImpl<Float> F_DASSIGMULT = new ParamImpl<Float>('F', 0X20140048, "DASSIGMULT");

   ParamImpl<Long> L_DASTMAXPTS = new ParamImpl<Long>('L', 0X20140049, "DASTMAXPTS");

   ParamImpl<Long> L_DASSTBXPTS = new ParamImpl<Long>('L', 0X2014004, "DASSTBXPTS");

   ParamImpl<Long> L_DASVMTTPTS = new ParamImpl<Long>('L', 0X2014004, "DASVMTTPTS");

   ParamImpl<Float> F_DASVMTTTHR = new ParamImpl<Float>('F', 0X2014004, "DASVMTTTHR");

   ParamImpl<Float> F_DASSTBMULT = new ParamImpl<Float>('F', 0X2014004, "DASSTBMULT");

   ParamImpl<Float> F_DASBCMPMULT = new ParamImpl<Float>('F', 0X2014004, "DASBCMPMULT");

   ParamImpl<Date> X_EMPNSTOPDUR = new ParamImpl<Date>('X', 0X2014004, "EMPNSTOPDUR");

   ParamImpl<Float> F_DETDTDEL1 = new ParamImpl<Float>('F', 0X20140050, "DETDTDEL1");

   ParamImpl<Float> F_EMPNMINGROW = new ParamImpl<Float>('F', 0X20140051, "EMPNMINGROW");

   ParamImpl<Date> X_EMPNMINDUROB = new ParamImpl<Date>('X', 0X20140052, "EMPNMINDUROB");

   ParamImpl<Date> X_EMPNMAXDUROB = new ParamImpl<Date>('X', 0X20140053, "EMPNMAXDUROB");

   ParamImpl<Date> X_EMPNMAXGAPOB = new ParamImpl<Date>('X', 0X20140054, "EMPNMAXGAPOB");

   ParamImpl<Date> X_EMPGAMMAXDUR = new ParamImpl<Date>('X', 0X20140055, "EMPGAMMAXDUR");

   ParamImpl<Date> X_EMPGAMMAXGAP = new ParamImpl<Date>('X', 0X20140056, "EMPGAMMAXGAP");

   ParamImpl<Long> L_EMPGIDSTCH = new ParamImpl<Long>('L', 0X20140057, "EMPGIDSTCH");

   ParamImpl<Long> L_EMPGIDENCH = new ParamImpl<Long>('L', 0X20140058, "EMPGIDENCH");

   ParamImpl<Float> F_EMPGIDTOL = new ParamImpl<Float>('F', 0X20140059, "EMPGIDTOL");

   ParamImpl<Float> F_EMPNIDTOL = new ParamImpl<Float>('F', 0X2014005, "EMPNIDTOL");

   ParamImpl<Float> F_EMPGQCETOL = new ParamImpl<Float>('F', 0X2014005, "EMPGQCETOL");

   ParamImpl<Float> F_NEFFMULT = new ParamImpl<Float>('F', 0X2014005, "NEFFMULT");

   ParamImpl<Float> F_DNEFFMULT = new ParamImpl<Float>('F', 0X2014005, "DNEFFMULT");

   ParamImpl<Float> F_DASGEPT = new ParamImpl<Float>('F', 0X2014005, "DASGEPT");

   ParamImpl<Float> F_DASGEPDP = new ParamImpl<Float>('F', 0X2014005, "DASGEPDP");

   ParamImpl<Long> L_DASGMINPTS = new ParamImpl<Long>('L', 0X20140060, "DASGMINPTS");

   ParamImpl<Float> F_DASGDTT = new ParamImpl<Float>('F', 0X20140061, "DASGDTT");

   ParamImpl<Date> X_DASGCNTTIM = new ParamImpl<Date>('X', 0X20140062, "DASGCNTTIM");

   ParamImpl<Long> L_DASGTMAXPTS = new ParamImpl<Long>('L', 0X20140063, "DASGTMAXPTS");

   ParamImpl<Float> F_DASGSIGMULT = new ParamImpl<Float>('F', 0X20140064, "DASGSIGMULT");

   ParamImpl<Float> F_DETDTDEL2 = new ParamImpl<Float>('F', 0X20140065, "DETDTDEL2");

   ParamImpl<Float> F_DETDTDEL3 = new ParamImpl<Float>('F', 0X20140066, "DETDTDEL3");

   ParamImpl<Float> F_DETDTDEL4 = new ParamImpl<Float>('F', 0X20140067, "DETDTDEL4");

   ParamImpl<Float> F_EMPMATCHTOL = new ParamImpl<Float>('F', 0X20140068, "EMPMATCHTOL");

   ParamImpl<Float> F_EMPNPHIT = new ParamImpl<Float>('F', 0X20140069, "EMPNPHIT");

   ParamImpl<Float> F_EMPNPHIR = new ParamImpl<Float>('F', 0X2014006, "EMPNPHIR");

   ParamImpl<Float> F_EMPNPHIA = new ParamImpl<Float>('F', 0X2014006, "EMPNPHIA");

   ParamImpl<Float> F_EMPNPHIT2G = new ParamImpl<Float>('F', 0X2014006, "EMPNPHIT2G");

   ParamImpl<Float> F_ALP238MULT = new ParamImpl<Float>('F', 0X2014006, "ALP238MULT");

   ParamImpl<Float> F_ALP239MULT = new ParamImpl<Float>('F', 0X2014006, "ALP239MULT");

   ParamImpl<Float> F_ALP240MULT = new ParamImpl<Float>('F', 0X2014006, "ALP240MULT");

   ParamImpl<Float> F_ALP241MULT = new ParamImpl<Float>('F', 0X20140070, "ALP241MULT");

   ParamImpl<Float> F_ALP242MULT = new ParamImpl<Float>('F', 0X20140071, "ALP242MULT");

   ParamImpl<Float> F_ALPAMMULT = new ParamImpl<Float>('F', 0X20140072, "ALPAMMULT");

   ParamImpl<Float> F_S238MULT = new ParamImpl<Float>('F', 0X20140073, "S238MULT");

   ParamImpl<Float> F_S240MULT = new ParamImpl<Float>('F', 0X20140074, "S240MULT");

   ParamImpl<Float> F_S242MULT = new ParamImpl<Float>('F', 0X20140075, "S242MULT");

   ParamImpl<Float> F_ALPDENMULT = new ParamImpl<Float>('F', 0X20140078, "ALPDENMULT");

   ParamImpl<Float> F_ENSROZERO = new ParamImpl<Float>('F', 0X20140079, "ENSROZERO");

   ParamImpl<Float> F_ENSNEUTMULT = new ParamImpl<Float>('F', 0X2014007, "ENSNEUTMULT");

   ParamImpl<Float> F_CFRTRATIO = new ParamImpl<Float>('F', 0X2014007, "CFRTRATIO");

   ParamImpl<Date> X_BACKSRCINT = new ParamImpl<Date>('X', 0X2014007, "BACKSRCINT");

   ParamImpl<Float> F_ENSRTCORR = new ParamImpl<Float>('F', 0X2014007, "ENSRTCORR");

   ParamImpl<Float> F_A238MULT = new ParamImpl<Float>('F', 0X2014007, "A238MULT");

   ParamImpl<Float> F_A240MULT = new ParamImpl<Float>('F', 0X2014007, "A240MULT");

   ParamImpl<Float> F_A242MULT = new ParamImpl<Float>('F', 0X20140080, "A242MULT");

   ParamImpl<Object> V_DASF_COMPRESS = new ParamImpl<Object>('V', 0X00000000, "DASF_COMPRESS");

   ParamImpl<Object> M_DASF_COMPRESS = new ParamImpl<Object>('M', 0X00000001, "DASF_COMPRESS");

   ParamImpl<Object> V_DASF_USENEUT = new ParamImpl<Object>('V', 0X00000001, "DASF_USENEUT");

   ParamImpl<Object> M_DASF_USENEUT = new ParamImpl<Object>('M', 0X00000002, "DASF_USENEUT");

   ParamImpl<Object> V_DASF_USEGAMMA = new ParamImpl<Object>('V', 0X00000002, "DASF_USEGAMMA");

   ParamImpl<Object> M_DASF_USEGAMMA = new ParamImpl<Object>('M', 0X00000004, "DASF_USEGAMMA");

   ParamImpl<Object> V_DASF_USESENS = new ParamImpl<Object>('V', 0X00000003, "DASF_USESENS");

   ParamImpl<Object> M_DASF_USESENS = new ParamImpl<Object>('M', 0X00000008, "DASF_USESENS");

   ParamImpl<Object> V_DASF_USEWDT = new ParamImpl<Object>('V', 0X00000004, "DASF_USEWDT");

   ParamImpl<Object> M_DASF_USEWDT = new ParamImpl<Object>('M', 0X00000010, "DASF_USEWDT");

   ParamImpl<Object> V_DASF_PRIMARY = new ParamImpl<Object>('V', 0X00000005, "DASF_PRIMARY");

   ParamImpl<Object> M_DASF_PRIMARY = new ParamImpl<Object>('M', 0X00000020, "DASF_PRIMARY");

   ParamImpl<Object> V_DASF_CCADC = new ParamImpl<Object>('V', 0X00000006, "DASF_CCADC");

   ParamImpl<Object> M_DASF_CCADC = new ParamImpl<Object>('M', 0X00000040, "DASF_CCADC");

   ParamImpl<Object> V_DASF_SUMGAM = new ParamImpl<Object>('V', 0X00000007, "DASF_SUMGAM");

   ParamImpl<Object> M_DASF_SUMGAM = new ParamImpl<Object>('M', 0X00000080, "DASF_SUMGAM");

   ParamImpl<Object> V_DASF_USEMCS = new ParamImpl<Object>('V', 0X00000008, "DASF_USEMCS");

   ParamImpl<Object> M_DASF_USEMCS = new ParamImpl<Object>('M', 0X00000100, "DASF_USEMCS");

   ParamImpl<Object> V_DASF_ASSOCSENS = new ParamImpl<Object>('V', 0X00000009, "DASF_ASSOCSENS");

   ParamImpl<Object> M_DASF_ASSOCSENS = new ParamImpl<Object>('M', 0X00000200, "DASF_ASSOCSENS");

   ParamImpl<Object> V_DASF_RADMONITOR = new ParamImpl<Object>('V', 0X0000000, "DASF_RADMONITOR");

   ParamImpl<Object> M_DASF_RADMONITOR = new ParamImpl<Object>('M', 0X00000400, "DASF_RADMONITOR");

   ParamImpl<Float> F_PUTHICK = new ParamImpl<Float>('F', 0X20150002, "PUTHICK");

   ParamImpl<Float> F_CDTHICK = new ParamImpl<Float>('F', 0X20150003, "CDTHICK");

   ParamImpl<Float> F_QFIT = new ParamImpl<Float>('F', 0X20150004, "QFIT");

   ParamImpl<Float> F_NQFIT = new ParamImpl<Float>('F', 0X20150005, "NQFIT");

   ParamImpl<Float> F_UTOPU = new ParamImpl<Float>('F', 0X20150006, "UTOPU");

   ParamImpl<Float> F_DUTOPU = new ParamImpl<Float>('F', 0X20150007, "DUTOPU");

   ParamImpl<Float> F_AMTOPU241 = new ParamImpl<Float>('F', 0X20150008, "AMTOPU241");

   ParamImpl<Float> F_DAMTOPU241 = new ParamImpl<Float>('F', 0X20150009, "DAMTOPU241");

   ParamImpl<Date> X_AMSEPTIME = new ParamImpl<Date>('X', 0X2015000, "AMSEPTIME");

   ParamImpl<Date> X_DAMSEPTIME = new ParamImpl<Date>('X', 0X2015000, "DAMSEPTIME");

   ParamImpl<Date> X_USEPTIME = new ParamImpl<Date>('X', 0X2015000, "USEPTIME");

   ParamImpl<Float> F_PU240EFF = new ParamImpl<Float>('F', 0X2015000, "PU240EFF");

   ParamImpl<Float> F_DPU240EFF = new ParamImpl<Float>('F', 0X2015000, "DPU240EFF");

   ParamImpl<Float> F_FWHM122 = new ParamImpl<Float>('F', 0X2015000, "FWHM122");

   ParamImpl<Float> F_FWHM208 = new ParamImpl<Float>('F', 0X20150010, "FWHM208");

   ParamImpl<Long> L_MGAFLAGS = new ParamImpl<Long>('L', 0X20150011, "MGAFLAGS");

   ParamImpl<Long> L_MFAM243NP239 = new ParamImpl<Long>('L', 0X20150012, "MFAM243NP239");

   ParamImpl<Float> F_PU241TOPU239 = new ParamImpl<Float>('F', 0X20150013, "PU241TOPU239");

   ParamImpl<Float> F_PUXRFINT = new ParamImpl<Float>('F', 0X20150014, "PUXRFINT");

   ParamImpl<Float> F_PUDXRFINT = new ParamImpl<Float>('F', 0X20150015, "PUDXRFINT");

   ParamImpl<String> T_VARNAME = new ParamImpl<String>('T', 0X20150016, "VARNAME");

   ParamImpl<Long> L_VARNUMBER = new ParamImpl<Long>('L', 0X20150017, "VARNUMBER");

   ParamImpl<Float> F_RELABN = new ParamImpl<Float>('F', 0X20150018, "RELABN");

   ParamImpl<Float> F_DRELABN = new ParamImpl<Float>('F', 0X20150019, "DRELABN");

   ParamImpl<Float> F_DRELABNR = new ParamImpl<Float>('F', 0X2015001, "DRELABNR");

   ParamImpl<Float> F_WGTPCTM = new ParamImpl<Float>('F', 0X2015001, "WGTPCTM");

   ParamImpl<Float> F_DWGTPCTM = new ParamImpl<Float>('F', 0X2015001, "DWGTPCTM");

   ParamImpl<Float> F_WGTPCTD = new ParamImpl<Float>('F', 0X2015001, "WGTPCTD");

   ParamImpl<Float> F_DWGTPCTD = new ParamImpl<Float>('F', 0X2015001, "DWGTPCTD");

   ParamImpl<Float> F_SPECPWR = new ParamImpl<Float>('F', 0X2015001, "SPECPWR");

   ParamImpl<Object> G_VCVM1 = new ParamImpl<Object>('G', 0X20150020, "VCVM1");

   ParamImpl<Object> G_VCVM2 = new ParamImpl<Object>('G', 0X20150021, "VCVM2");

   ParamImpl<Object> G_VCVM3 = new ParamImpl<Object>('G', 0X20150022, "VCVM3");

   ParamImpl<Object> G_VCVM4 = new ParamImpl<Object>('G', 0X20150023, "VCVM4");

   ParamImpl<Object> G_VCVM5 = new ParamImpl<Object>('G', 0X20150024, "VCVM5");

   ParamImpl<Object> G_VCVM6 = new ParamImpl<Object>('G', 0X20150025, "VCVM6");

   ParamImpl<Object> G_VCVM7 = new ParamImpl<Object>('G', 0X20150026, "VCVM7");

   ParamImpl<Object> G_VCVM8 = new ParamImpl<Object>('G', 0X20150027, "VCVM8");

   ParamImpl<Object> G_VCVM9 = new ParamImpl<Object>('G', 0X20150028, "VCVM9");

   ParamImpl<Object> G_VCVM10 = new ParamImpl<Object>('G', 0X20150029, "VCVM10");

   ParamImpl<Object> G_VCVM11 = new ParamImpl<Object>('G', 0X2015002, "VCVM11");

   ParamImpl<Object> G_VCVM12 = new ParamImpl<Object>('G', 0X2015002, "VCVM12");

   ParamImpl<Object> G_VCVM13 = new ParamImpl<Object>('G', 0X2015002, "VCVM13");

   ParamImpl<Object> G_VCVM14 = new ParamImpl<Object>('G', 0X2015002, "VCVM14");

   ParamImpl<Object> G_VCVM15 = new ParamImpl<Object>('G', 0X2015002, "VCVM15");

   ParamImpl<Object> G_VCVM16 = new ParamImpl<Object>('G', 0X2015002, "VCVM16");

   ParamImpl<Float> F_DTOTSPOW = new ParamImpl<Float>('F', 0X20150030, "DTOTSPOW");

   ParamImpl<String> T_MGAVERSION = new ParamImpl<String>('T', 0X20150031, "MGAVERSION");

   ParamImpl<Float> F_MGAPUSCONC = new ParamImpl<Float>('F', 0X20150032, "MGAPUSCONC");

   ParamImpl<Float> F_MGAPUSCERR = new ParamImpl<Float>('F', 0X20150033, "MGAPUSCERR");

   ParamImpl<Float> F_MGAPUSCFAC = new ParamImpl<Float>('F', 0X20150034, "MGAPUSCFAC");

   ParamImpl<Float> F_MGAZR95CONC = new ParamImpl<Float>('F', 0X20150035, "MGAZR95CONC");

   ParamImpl<Float> F_MGAZR95CERR = new ParamImpl<Float>('F', 0X20150036, "MGAZR95CERR");

   ParamImpl<Float> F_MGANB95CONC = new ParamImpl<Float>('F', 0X20150037, "MGANB95CONC");

   ParamImpl<Float> F_MGANB95CERR = new ParamImpl<Float>('F', 0X20150038, "MGANB95CERR");

   ParamImpl<Float> F_MGARU103CONC = new ParamImpl<Float>('F', 0X20150039, "MGARU103CONC");

   ParamImpl<Float> F_MGARU103CERR = new ParamImpl<Float>('F', 0X2015003, "MGARU103CERR");

   ParamImpl<Float> F_MGARU106CONC = new ParamImpl<Float>('F', 0X2015003, "MGARU106CONC");

   ParamImpl<Float> F_MGARU106CERR = new ParamImpl<Float>('F', 0X2015003, "MGARU106CERR");

   ParamImpl<Float> F_MGACS137CONC = new ParamImpl<Float>('F', 0X2015003, "MGACS137CONC");

   ParamImpl<Float> F_MGACS137CERR = new ParamImpl<Float>('F', 0X2015003, "MGACS137CERR");

   ParamImpl<Float> F_MGACE144CONC = new ParamImpl<Float>('F', 0X2015003, "MGACE144CONC");

   ParamImpl<Float> F_MGACE144CERR = new ParamImpl<Float>('F', 0X20150040, "MGACE144CERR");

   ParamImpl<Float> F_MGAPRWEIGHT = new ParamImpl<Float>('F', 0X20150041, "MGAPRWEIGHT");

   ParamImpl<Float> F_MGAPRWTERR = new ParamImpl<Float>('F', 0X20150042, "MGAPRWTERR");

   ParamImpl<Float> F_MGATOTSPOW = new ParamImpl<Float>('F', 0X20150043, "MGATOTSPOW");

   ParamImpl<Float> F_MGATOTCOUNTS = new ParamImpl<Float>('F', 0X20150044, "MGATOTCOUNTS");

   ParamImpl<String> T_MGALEFILE = new ParamImpl<String>('T', 0X20150045, "MGALEFILE");

   ParamImpl<String> T_MGAHEFILE = new ParamImpl<String>('T', 0X20150046, "MGAHEFILE");

   ParamImpl<Date> X_MGAHELIVE = new ParamImpl<Date>('X', 0X20150047, "MGAHELIVE");

   ParamImpl<Date> X_MGAHEREAL = new ParamImpl<Date>('X', 0X20150048, "MGAHEREAL");

   ParamImpl<Long> L_MGATYPE = new ParamImpl<Long>('L', 0X20150049, "MGATYPE");

   ParamImpl<Long> L_MGAU235REC = new ParamImpl<Long>('L', 0X2015004, "MGAU235REC");

   ParamImpl<Long> L_MGANP237REC = new ParamImpl<Long>('L', 0X2015004, "MGANP237REC");

   ParamImpl<Long> L_MGAU238REC = new ParamImpl<Long>('L', 0X2015004, "MGAU238REC");

   ParamImpl<Long> L_MGAAM243REC = new ParamImpl<Long>('L', 0X2015004, "MGAAM243REC");

   ParamImpl<Float> F_MGAAM100ABN = new ParamImpl<Float>('F', 0X2015004, "MGAAM100ABN");

   ParamImpl<Float> F_MGAAM100ABNE = new ParamImpl<Float>('F', 0X20150050, "MGAAM100ABNE");

   ParamImpl<Float> F_MGAAM300ABN = new ParamImpl<Float>('F', 0X20150051, "MGAAM300ABN");

   ParamImpl<Float> F_MGAAM300ABNE = new ParamImpl<Float>('F', 0X20150052, "MGAAM300ABNE");

   ParamImpl<Float> F_MGAAM600ABN = new ParamImpl<Float>('F', 0X20150053, "MGAAM600ABN");

   ParamImpl<Float> F_MGAAM600ABNE = new ParamImpl<Float>('F', 0X20150054, "MGAAM600ABNE");

   ParamImpl<Float> F_MGA100600DIF = new ParamImpl<Float>('F', 0X20150055, "MGA100600DIF");

   ParamImpl<Float> F_MGAAMSTDD = new ParamImpl<Float>('F', 0X20150056, "MGAAMSTDD");

   ParamImpl<Float> F_MGAAMBETA = new ParamImpl<Float>('F', 0X20150057, "MGAAMBETA");

   ParamImpl<Long> L_MGADONE = new ParamImpl<Long>('L', 0X20150058, "MGADONE");

   ParamImpl<Long> L_MGAERR01 = new ParamImpl<Long>('L', 0X20150059, "MGAERR01");

   ParamImpl<Long> L_MGAERR02 = new ParamImpl<Long>('L', 0X2015005, "MGAERR02");

   ParamImpl<Long> L_MGAERR03 = new ParamImpl<Long>('L', 0X2015005, "MGAERR03");

   ParamImpl<Long> L_MGAERR04 = new ParamImpl<Long>('L', 0X2015005, "MGAERR04");

   ParamImpl<Long> L_MGAERR05 = new ParamImpl<Long>('L', 0X2015005, "MGAERR05");

   ParamImpl<Long> L_MGAERR06 = new ParamImpl<Long>('L', 0X2015005, "MGAERR06");

   ParamImpl<Long> L_MGAERR07 = new ParamImpl<Long>('L', 0X2015005, "MGAERR07");

   ParamImpl<Long> L_MGAERR08 = new ParamImpl<Long>('L', 0X20150060, "MGAERR08");

   ParamImpl<Long> L_MGAERR09 = new ParamImpl<Long>('L', 0X20150061, "MGAERR09");

   ParamImpl<Long> L_MGAERR10 = new ParamImpl<Long>('L', 0X20150062, "MGAERR10");

   ParamImpl<Long> L_MGAERR11 = new ParamImpl<Long>('L', 0X20150063, "MGAERR11");

   ParamImpl<Long> L_MGAERR12 = new ParamImpl<Long>('L', 0X20150064, "MGAERR12");

   ParamImpl<Long> L_MGAERR13 = new ParamImpl<Long>('L', 0X20150065, "MGAERR13");

   ParamImpl<Long> L_MGAERR14 = new ParamImpl<Long>('L', 0X20150066, "MGAERR14");

   ParamImpl<Long> L_MGAERR15 = new ParamImpl<Long>('L', 0X20150067, "MGAERR15");

   ParamImpl<Long> L_MGAERR16 = new ParamImpl<Long>('L', 0X20150068, "MGAERR16");

   ParamImpl<Long> L_MGAERR17 = new ParamImpl<Long>('L', 0X20150069, "MGAERR17");

   ParamImpl<Long> L_MGAERR18 = new ParamImpl<Long>('L', 0X2015006, "MGAERR18");

   ParamImpl<Long> L_MGAERR19 = new ParamImpl<Long>('L', 0X2015006, "MGAERR19");

   ParamImpl<Long> L_MGAERR20 = new ParamImpl<Long>('L', 0X2015006, "MGAERR20");

   ParamImpl<Long> L_MGAERR21 = new ParamImpl<Long>('L', 0X2015006, "MGAERR21");

   ParamImpl<Long> L_MGAERR22 = new ParamImpl<Long>('L', 0X2015006, "MGAERR22");

   ParamImpl<Long> L_MGAERR23 = new ParamImpl<Long>('L', 0X2015006, "MGAERR23");

   ParamImpl<Long> L_MGAERR24 = new ParamImpl<Long>('L', 0X20150070, "MGAERR24");

   ParamImpl<Long> L_MGAERR25 = new ParamImpl<Long>('L', 0X20150071, "MGAERR25");

   ParamImpl<Float> F_MGAERRA = new ParamImpl<Float>('F', 0X20150072, "MGAERRA");

   ParamImpl<Float> F_MGAERRB = new ParamImpl<Float>('F', 0X20150073, "MGAERRB");

   ParamImpl<Float> F_MGAERRC = new ParamImpl<Float>('F', 0X20150074, "MGAERRC");

   ParamImpl<Float> F_MGA241RELABN = new ParamImpl<Float>('F', 0X20150075, "MGA241RELABN");

   ParamImpl<Float> F_MGA241RAE = new ParamImpl<Float>('F', 0X20150076, "MGA241RAE");

   ParamImpl<Long> L_MGAERR26 = new ParamImpl<Long>('L', 0X20150078, "MGAERR26");

   ParamImpl<Long> L_MGAERR27 = new ParamImpl<Long>('L', 0X20150079, "MGAERR27");

   ParamImpl<Long> L_MGAERR28 = new ParamImpl<Long>('L', 0X2015007, "MGAERR28");

   ParamImpl<Long> L_MGAERR29 = new ParamImpl<Long>('L', 0X2015007, "MGAERR29");

   ParamImpl<Long> L_MGAERR30 = new ParamImpl<Long>('L', 0X2015007, "MGAERR30");

   ParamImpl<Long> L_MGAERR31 = new ParamImpl<Long>('L', 0X2015007, "MGAERR31");

   ParamImpl<Float> F_MGAERRD = new ParamImpl<Float>('F', 0X2015007, "MGAERRD");

   ParamImpl<Float> F_MGAERRE = new ParamImpl<Float>('F', 0X2015007, "MGAERRE");

   ParamImpl<Float> F_MGAERRF = new ParamImpl<Float>('F', 0X20150080, "MGAERRF");

   ParamImpl<Float> F_MGAERRG = new ParamImpl<Float>('F', 0X20150081, "MGAERRG");

   ParamImpl<Float> F_MGAERRH = new ParamImpl<Float>('F', 0X20150082, "MGAERRH");

   ParamImpl<Float> F_MGAERRI = new ParamImpl<Float>('F', 0X20150083, "MGAERRI");

   ParamImpl<Float> F_MGAERRJ = new ParamImpl<Float>('F', 0X20150084, "MGAERRJ");

   ParamImpl<Long> L_MGAFLAGS2 = new ParamImpl<Long>('L', 0X20150085, "MGAFLAGS2");

   ParamImpl<Long> L_MGAERR33 = new ParamImpl<Long>('L', 0X20150086, "MGAERR33");

   ParamImpl<Long> L_MGAERR34 = new ParamImpl<Long>('L', 0X20150087, "MGAERR34");

   ParamImpl<Long> L_MGAERR35 = new ParamImpl<Long>('L', 0X20150088, "MGAERR35");

   ParamImpl<Long> L_MGAERR36 = new ParamImpl<Long>('L', 0X20150089, "MGAERR36");

   ParamImpl<Long> L_MGAERR37 = new ParamImpl<Long>('L', 0X2015008, "MGAERR37");

   ParamImpl<Long> L_MGAERR38 = new ParamImpl<Long>('L', 0X2015008, "MGAERR38");

   ParamImpl<Long> L_MGAERR39 = new ParamImpl<Long>('L', 0X2015008, "MGAERR39");

   ParamImpl<Long> L_MGAERR40 = new ParamImpl<Long>('L', 0X2015008, "MGAERR40");

   ParamImpl<Long> L_MGAERR41 = new ParamImpl<Long>('L', 0X2015008, "MGAERR41");

   ParamImpl<Long> L_MGAERR42 = new ParamImpl<Long>('L', 0X2015008, "MGAERR42");

   ParamImpl<Long> L_MGAERR32 = new ParamImpl<Long>('L', 0X20150090, "MGAERR32");

   ParamImpl<Long> L_MGAVCHECK = new ParamImpl<Long>('L', 0X20150091, "MGAVCHECK");

   ParamImpl<Long> L_MGAVCHECK0 = new ParamImpl<Long>('L', 0X20150092, "MGAVCHECK0");

   ParamImpl<Long> L_MGAVCHECK1 = new ParamImpl<Long>('L', 0X20150093, "MGAVCHECK1");

   ParamImpl<Long> L_MGAVCHECK2 = new ParamImpl<Long>('L', 0X20150094, "MGAVCHECK2");

   ParamImpl<Long> L_MGAVCHECK8 = new ParamImpl<Long>('L', 0X20150095, "MGAVCHECK8");

   ParamImpl<Long> L_MGAVCHECK9 = new ParamImpl<Long>('L', 0X20150096, "MGAVCHECK9");

   ParamImpl<Long> L_MGAVCHECK10 = new ParamImpl<Long>('L', 0X20150097, "MGAVCHECK10");

   ParamImpl<Long> L_MGAVCHECK16 = new ParamImpl<Long>('L', 0X20150098, "MGAVCHECK16");

   ParamImpl<Long> L_MGAISOFLAGS = new ParamImpl<Long>('L', 0X20150099, "MGAISOFLAGS");

   ParamImpl<Long> L_MGAISODECL = new ParamImpl<Long>('L', 0X2015009, "MGAISODECL");

   ParamImpl<Object> M_MGAF2_DECAYDONE = new ParamImpl<Object>('M', 0X00000800, "MGAF2_DECAYDONE");

   ParamImpl<Long> L_SUCFLAGS = new ParamImpl<Long>('L', 0X20160002, "SUCFLAGS");

   ParamImpl<Long> L_SUCINT1 = new ParamImpl<Long>('L', 0X20160003, "SUCINT1");

   ParamImpl<Long> L_SUCINT2 = new ParamImpl<Long>('L', 0X20160004, "SUCINT2");

   ParamImpl<Long> L_SUCINT3 = new ParamImpl<Long>('L', 0X20160005, "SUCINT3");

   ParamImpl<Long> L_SUCINT4 = new ParamImpl<Long>('L', 0X20160006, "SUCINT4");

   ParamImpl<Long> L_SUCINT5 = new ParamImpl<Long>('L', 0X20160007, "SUCINT5");

   ParamImpl<Long> L_SUCINT6 = new ParamImpl<Long>('L', 0X20160008, "SUCINT6");

   ParamImpl<Long> L_SUCINT7 = new ParamImpl<Long>('L', 0X20160009, "SUCINT7");

   ParamImpl<Long> L_SUCINT8 = new ParamImpl<Long>('L', 0X2016000, "SUCINT8");

   ParamImpl<Float> F_SUCREAL1 = new ParamImpl<Float>('F', 0X2016000, "SUCREAL1");

   ParamImpl<Float> F_SUCREAL2 = new ParamImpl<Float>('F', 0X2016000, "SUCREAL2");

   ParamImpl<Float> F_SUCREAL3 = new ParamImpl<Float>('F', 0X2016000, "SUCREAL3");

   ParamImpl<Float> F_SUCREAL4 = new ParamImpl<Float>('F', 0X2016000, "SUCREAL4");

   ParamImpl<Float> F_SUCREAL5 = new ParamImpl<Float>('F', 0X2016000, "SUCREAL5");

   ParamImpl<Float> F_SUCREAL6 = new ParamImpl<Float>('F', 0X20160010, "SUCREAL6");

   ParamImpl<Float> F_SUCREAL7 = new ParamImpl<Float>('F', 0X20160011, "SUCREAL7");

   ParamImpl<Float> F_SUCREAL8 = new ParamImpl<Float>('F', 0X20160012, "SUCREAL8");

   ParamImpl<String> T_SUCSTRING1 = new ParamImpl<String>('T', 0X20160013, "SUCSTRING1");

   ParamImpl<String> T_SUCSTRING2 = new ParamImpl<String>('T', 0X20160014, "SUCSTRING2");

   ParamImpl<String> T_SUCSTRING3 = new ParamImpl<String>('T', 0X20160015, "SUCSTRING3");

   ParamImpl<String> T_SUCSTRING4 = new ParamImpl<String>('T', 0X20160016, "SUCSTRING4");

   ParamImpl<String> T_SUCSTRING5 = new ParamImpl<String>('T', 0X20160017, "SUCSTRING5");

   ParamImpl<String> T_SUCSTRING6 = new ParamImpl<String>('T', 0X20160018, "SUCSTRING6");

   ParamImpl<String> T_SUCSTRING7 = new ParamImpl<String>('T', 0X20160019, "SUCSTRING7");

   ParamImpl<String> T_SUCSTRING8 = new ParamImpl<String>('T', 0X2016001, "SUCSTRING8");

   ParamImpl<Long> L_SURFLAGS = new ParamImpl<Long>('L', 0X2016001, "SURFLAGS");

   ParamImpl<Long> L_SURINT1 = new ParamImpl<Long>('L', 0X2016001, "SURINT1");

   ParamImpl<Long> L_SURINT2 = new ParamImpl<Long>('L', 0X2016001, "SURINT2");

   ParamImpl<Long> L_SURINT3 = new ParamImpl<Long>('L', 0X2016001, "SURINT3");

   ParamImpl<Long> L_SURINT4 = new ParamImpl<Long>('L', 0X2016001, "SURINT4");

   ParamImpl<Long> L_SURINT5 = new ParamImpl<Long>('L', 0X20160020, "SURINT5");

   ParamImpl<Long> L_SURINT6 = new ParamImpl<Long>('L', 0X20160021, "SURINT6");

   ParamImpl<Long> L_SURINT7 = new ParamImpl<Long>('L', 0X20160022, "SURINT7");

   ParamImpl<Long> L_SURINT8 = new ParamImpl<Long>('L', 0X20160023, "SURINT8");

   ParamImpl<Float> F_SURREAL1 = new ParamImpl<Float>('F', 0X20160024, "SURREAL1");

   ParamImpl<Float> F_SURREAL2 = new ParamImpl<Float>('F', 0X20160025, "SURREAL2");

   ParamImpl<Float> F_SURREAL3 = new ParamImpl<Float>('F', 0X20160026, "SURREAL3");

   ParamImpl<Float> F_SURREAL4 = new ParamImpl<Float>('F', 0X20160027, "SURREAL4");

   ParamImpl<Float> F_SURREAL5 = new ParamImpl<Float>('F', 0X20160028, "SURREAL5");

   ParamImpl<Float> F_SURREAL6 = new ParamImpl<Float>('F', 0X20160029, "SURREAL6");

   ParamImpl<Float> F_SURREAL7 = new ParamImpl<Float>('F', 0X2016002, "SURREAL7");

   ParamImpl<Float> F_SURREAL8 = new ParamImpl<Float>('F', 0X2016002, "SURREAL8");

   ParamImpl<String> T_SURSTRING1 = new ParamImpl<String>('T', 0X2016002, "SURSTRING1");

   ParamImpl<String> T_SURSTRING2 = new ParamImpl<String>('T', 0X2016002, "SURSTRING2");

   ParamImpl<String> T_SURSTRING3 = new ParamImpl<String>('T', 0X2016002, "SURSTRING3");

   ParamImpl<String> T_SURSTRING4 = new ParamImpl<String>('T', 0X2016002, "SURSTRING4");

   ParamImpl<Long> L_SUCFLAG0 = new ParamImpl<Long>('L', 0X20160030, "SUCFLAG0");

   ParamImpl<Long> L_SUCFLAG1 = new ParamImpl<Long>('L', 0X20160031, "SUCFLAG1");

   ParamImpl<Long> L_SUCFLAG2 = new ParamImpl<Long>('L', 0X20160032, "SUCFLAG2");

   ParamImpl<Long> L_SUCFLAG3 = new ParamImpl<Long>('L', 0X20160033, "SUCFLAG3");

   ParamImpl<Long> L_SUCFLAG4 = new ParamImpl<Long>('L', 0X20160034, "SUCFLAG4");

   ParamImpl<Long> L_SURFLAG0 = new ParamImpl<Long>('L', 0X20160035, "SURFLAG0");

   ParamImpl<Long> L_SURFLAG1 = new ParamImpl<Long>('L', 0X20160036, "SURFLAG1");

   ParamImpl<Long> L_SURFLAG2 = new ParamImpl<Long>('L', 0X20160037, "SURFLAG2");

   ParamImpl<Long> L_SURFLAG3 = new ParamImpl<Long>('L', 0X20160038, "SURFLAG3");

   ParamImpl<Long> L_SURFLAG4 = new ParamImpl<Long>('L', 0X20160039, "SURFLAG4");

   ParamImpl<Long> L_SURFLAG5 = new ParamImpl<Long>('L', 0X2016003, "SURFLAG5");

   ParamImpl<Long> L_SURFLAG6 = new ParamImpl<Long>('L', 0X2016003, "SURFLAG6");

   ParamImpl<Date> X_SUCDATE1 = new ParamImpl<Date>('X', 0X2016003, "SUCDATE1");

   ParamImpl<Date> X_SUCDATE2 = new ParamImpl<Date>('X', 0X2016003, "SUCDATE2");

   ParamImpl<Date> X_SUCDATE3 = new ParamImpl<Date>('X', 0X2016003, "SUCDATE3");

   ParamImpl<String> T_SUCSTRING9 = new ParamImpl<String>('T', 0X2016003, "SUCSTRING9");

   ParamImpl<Date> X_SUCTIME1 = new ParamImpl<Date>('X', 0X20160040, "SUCTIME1");

   ParamImpl<Date> X_SUCTIME2 = new ParamImpl<Date>('X', 0X20160041, "SUCTIME2");

   ParamImpl<Date> X_SUCTIME3 = new ParamImpl<Date>('X', 0X20160042, "SUCTIME3");

   ParamImpl<String> T_SUCSTRING10 = new ParamImpl<String>('T', 0X20160043, "SUCSTRING10");

   ParamImpl<String> T_SUCSTRING11 = new ParamImpl<String>('T', 0X20160044, "SUCSTRING11");

   ParamImpl<String> T_SUCSTRING12 = new ParamImpl<String>('T', 0X20160045, "SUCSTRING12");

   ParamImpl<String> T_SUCSTRING13 = new ParamImpl<String>('T', 0X20160046, "SUCSTRING13");

   ParamImpl<Date> X_SURTIME1 = new ParamImpl<Date>('X', 0X20160047, "SURTIME1");

   ParamImpl<Date> X_SURTIME2 = new ParamImpl<Date>('X', 0X20160048, "SURTIME2");

   ParamImpl<Date> X_SURTIME3 = new ParamImpl<Date>('X', 0X20160049, "SURTIME3");

   ParamImpl<Date> X_SURDATE1 = new ParamImpl<Date>('X', 0X2016004, "SURDATE1");

   ParamImpl<Float> F_SURREAL9 = new ParamImpl<Float>('F', 0X2016004, "SURREAL9");

   ParamImpl<Float> F_SURREAL10 = new ParamImpl<Float>('F', 0X2016004, "SURREAL10");

   ParamImpl<Float> F_SURREAL11 = new ParamImpl<Float>('F', 0X2016004, "SURREAL11");

   ParamImpl<Float> F_SURREAL12 = new ParamImpl<Float>('F', 0X2016004, "SURREAL12");

   ParamImpl<Long> L_SURINT9 = new ParamImpl<Long>('L', 0X2016004, "SURINT9");

   ParamImpl<Long> L_SURINT10 = new ParamImpl<Long>('L', 0X20160050, "SURINT10");

   ParamImpl<Long> L_SURINT11 = new ParamImpl<Long>('L', 0X20160051, "SURINT11");

   ParamImpl<Long> L_SURINT12 = new ParamImpl<Long>('L', 0X20160052, "SURINT12");

   ParamImpl<Long> L_SURINT13 = new ParamImpl<Long>('L', 0X20160053, "SURINT13");

   ParamImpl<String> T_SURSTRING5 = new ParamImpl<String>('T', 0X20160054, "SURSTRING5");

   ParamImpl<String> T_SURSTRING6 = new ParamImpl<String>('T', 0X20160055, "SURSTRING6");

   ParamImpl<String> T_SURSTRING7 = new ParamImpl<String>('T', 0X20160056, "SURSTRING7");

   ParamImpl<String> T_SURSTRING8 = new ParamImpl<String>('T', 0X20160057, "SURSTRING8");

   ParamImpl<String> T_SURSTRING9 = new ParamImpl<String>('T', 0X20160058, "SURSTRING9");

   ParamImpl<String> T_SURSTRING10 = new ParamImpl<String>('T', 0X20160059, "SURSTRING10");

   ParamImpl<String> T_SURSTRING11 = new ParamImpl<String>('T', 0X2016005, "SURSTRING11");

   ParamImpl<String> T_SURSTRING12 = new ParamImpl<String>('T', 0X2016005, "SURSTRING12");

   ParamImpl<Date> X_SURDATE2 = new ParamImpl<Date>('X', 0X2016005, "SURDATE2");

   ParamImpl<Float> F_SURREAL13 = new ParamImpl<Float>('F', 0X2016005, "SURREAL13");

   ParamImpl<Float> F_SURREAL14 = new ParamImpl<Float>('F', 0X2016005, "SURREAL14");

   ParamImpl<Float> F_SURREAL15 = new ParamImpl<Float>('F', 0X2016005, "SURREAL15");

   ParamImpl<Float> F_SURREAL16 = new ParamImpl<Float>('F', 0X20160060, "SURREAL16");

   ParamImpl<Float> F_SURREAL17 = new ParamImpl<Float>('F', 0X20160061, "SURREAL17");

   ParamImpl<Float> F_SURREAL18 = new ParamImpl<Float>('F', 0X20160062, "SURREAL18");

   ParamImpl<Date> X_SURDATE3 = new ParamImpl<Date>('X', 0X20160063, "SURDATE3");

   ParamImpl<Date> X_SURDATE4 = new ParamImpl<Date>('X', 0X20160064, "SURDATE4");

   ParamImpl<Date> X_SURTIME4 = new ParamImpl<Date>('X', 0X20160065, "SURTIME4");

   ParamImpl<Object> V_SUCF_FLAG0 = new ParamImpl<Object>('V', 0X00000000, "SUCF_FLAG0");

   ParamImpl<Object> M_SUCF_FLAG0 = new ParamImpl<Object>('M', 0X00000001, "SUCF_FLAG0");

   ParamImpl<Object> V_SUCF_FLAG1 = new ParamImpl<Object>('V', 0X00000001, "SUCF_FLAG1");

   ParamImpl<Object> M_SUCF_FLAG1 = new ParamImpl<Object>('M', 0X00000002, "SUCF_FLAG1");

   ParamImpl<Object> V_SUCF_FLAG2 = new ParamImpl<Object>('V', 0X00000002, "SUCF_FLAG2");

   ParamImpl<Object> M_SUCF_FLAG2 = new ParamImpl<Object>('M', 0X00000004, "SUCF_FLAG2");

   ParamImpl<Object> V_SUCF_FLAG3 = new ParamImpl<Object>('V', 0X00000003, "SUCF_FLAG3");

   ParamImpl<Object> M_SUCF_FLAG3 = new ParamImpl<Object>('M', 0X00000008, "SUCF_FLAG3");

   ParamImpl<Object> V_SUCF_FLAG4 = new ParamImpl<Object>('V', 0X00000004, "SUCF_FLAG4");

   ParamImpl<Object> M_SUCF_FLAG4 = new ParamImpl<Object>('M', 0X00000010, "SUCF_FLAG4");

   ParamImpl<Object> V_SURF_FLAG0 = new ParamImpl<Object>('V', 0X00000000, "SURF_FLAG0");

   ParamImpl<Object> M_SURF_FLAG0 = new ParamImpl<Object>('M', 0X00000001, "SURF_FLAG0");

   ParamImpl<Object> V_SURF_FLAG1 = new ParamImpl<Object>('V', 0X00000001, "SURF_FLAG1");

   ParamImpl<Object> M_SURF_FLAG1 = new ParamImpl<Object>('M', 0X00000002, "SURF_FLAG1");

   ParamImpl<Object> V_SURF_FLAG2 = new ParamImpl<Object>('V', 0X00000002, "SURF_FLAG2");

   ParamImpl<Object> M_SURF_FLAG2 = new ParamImpl<Object>('M', 0X00000004, "SURF_FLAG2");

   ParamImpl<Object> V_SURF_FLAG3 = new ParamImpl<Object>('V', 0X00000003, "SURF_FLAG3");

   ParamImpl<Object> M_SURF_FLAG3 = new ParamImpl<Object>('M', 0X00000008, "SURF_FLAG3");

   ParamImpl<Object> V_SURF_FLAG4 = new ParamImpl<Object>('V', 0X00000004, "SURF_FLAG4");

   ParamImpl<Object> M_SURF_FLAG4 = new ParamImpl<Object>('M', 0X00000010, "SURF_FLAG4");

   ParamImpl<Object> V_SURF_FLAG5 = new ParamImpl<Object>('V', 0X00000005, "SURF_FLAG5");

   ParamImpl<Object> M_SURF_FLAG5 = new ParamImpl<Object>('M', 0X00000020, "SURF_FLAG5");

   ParamImpl<Object> V_SURF_FLAG6 = new ParamImpl<Object>('V', 0X00000006, "SURF_FLAG6");

   ParamImpl<Object> M_SURF_FLAG6 = new ParamImpl<Object>('M', 0X00000040, "SURF_FLAG6");

   ParamImpl<Date> X_PENTRY = new ParamImpl<Date>('X', 0X20170002, "PENTRY");

   ParamImpl<Date> X_PEDIT = new ParamImpl<Date>('X', 0X20170003, "PEDIT");

   ParamImpl<String> T_PNAME = new ParamImpl<String>('T', 0X20170004, "PNAME");

   ParamImpl<String> T_PERRNAME = new ParamImpl<String>('T', 0X20170005, "PERRNAME");

   ParamImpl<String> T_PERRTYPE = new ParamImpl<String>('T', 0X20170006, "PERRTYPE");

   ParamImpl<String> T_PDESC = new ParamImpl<String>('T', 0X20170007, "PDESC");

   ParamImpl<Long> L_PPARIND = new ParamImpl<Long>('L', 0X20170008, "PPARIND");

   ParamImpl<String> T_PUNITS = new ParamImpl<String>('T', 0X20170009, "PUNITS");

   ParamImpl<Float> F_PCNVFCTR = new ParamImpl<Float>('F', 0X2017000, "PCNVFCTR");

   ParamImpl<String> T_PPTYPE = new ParamImpl<String>('T', 0X2017000, "PPTYPE");

   ParamImpl<String> T_PNUCLIDE = new ParamImpl<String>('T', 0X2017000, "PNUCLIDE");

   ParamImpl<Float> F_PENERGY = new ParamImpl<Float>('F', 0X2017000, "PENERGY");

   ParamImpl<Long> L_PSCHAN = new ParamImpl<Long>('L', 0X2017000, "PSCHAN");

   ParamImpl<Long> L_PECHAN = new ParamImpl<Long>('L', 0X2017000, "PECHAN");

   ParamImpl<Float> F_PINVEST = new ParamImpl<Float>('F', 0X20170010, "PINVEST");

   ParamImpl<Float> F_PACTION = new ParamImpl<Float>('F', 0X20170011, "PACTION");

   ParamImpl<Date> X_PSTARTDATE = new ParamImpl<Date>('X', 0X20170012, "PSTARTDATE");

   ParamImpl<Date> X_PENDDATE = new ParamImpl<Date>('X', 0X20170013, "PENDDATE");

   ParamImpl<Float> F_PSDMEAN = new ParamImpl<Float>('F', 0X20170014, "PSDMEAN");

   ParamImpl<Float> F_PSDSTDEV = new ParamImpl<Float>('F', 0X20170015, "PSDSTDEV");

   ParamImpl<Float> F_PBIASTRUE = new ParamImpl<Float>('F', 0X20170016, "PBIASTRUE");

   ParamImpl<Float> F_PUDMEAN = new ParamImpl<Float>('F', 0X20170017, "PUDMEAN");

   ParamImpl<Float> F_PUDSTDEV = new ParamImpl<Float>('F', 0X20170018, "PUDSTDEV");

   ParamImpl<Float> F_PLOLIM = new ParamImpl<Float>('F', 0X20170019, "PLOLIM");

   ParamImpl<Float> F_PUPLIM = new ParamImpl<Float>('F', 0X2017001, "PUPLIM");

   ParamImpl<Long> L_PSTARTREC = new ParamImpl<Long>('L', 0X2017001, "PSTARTREC");

   ParamImpl<Long> L_PENDREC = new ParamImpl<Long>('L', 0X2017001, "PENDREC");

   ParamImpl<Long> L_PDFLAGS = new ParamImpl<Long>('L', 0X2017001, "PDFLAGS");

   ParamImpl<Long> L_PDFSTDERROR = new ParamImpl<Long>('L', 0X2017001, "PDFSTDERROR");

   ParamImpl<Long> L_PDFBOUNDARY = new ParamImpl<Long>('L', 0X2017001, "PDFBOUNDARY");

   ParamImpl<Long> L_PDFSAMPLE = new ParamImpl<Long>('L', 0X20170020, "PDFSAMPLE");

   ParamImpl<Long> L_PDFUSER = new ParamImpl<Long>('L', 0X20170021, "PDFUSER");

   ParamImpl<Long> L_PDFBIAS = new ParamImpl<Long>('L', 0X20170022, "PDFBIAS");

   ParamImpl<String> T_PPTYPEDESC = new ParamImpl<String>('T', 0X20170023, "PPTYPEDESC");

   ParamImpl<Long> L_PDFBSINV = new ParamImpl<Long>('L', 0X20170024, "PDFBSINV");

   ParamImpl<Long> L_PDFBSACT = new ParamImpl<Long>('L', 0X20170025, "PDFBSACT");

   ParamImpl<Long> L_PDFDOBOUND = new ParamImpl<Long>('L', 0X20170026, "PDFDOBOUND");

   ParamImpl<Long> L_PDFDOSAMPLE = new ParamImpl<Long>('L', 0X20170027, "PDFDOSAMPLE");

   ParamImpl<Long> L_PDFDOUSER = new ParamImpl<Long>('L', 0X20170028, "PDFDOUSER");

   ParamImpl<Long> L_PDFDOBIAS = new ParamImpl<Long>('L', 0X20170029, "PDFDOBIAS");

   ParamImpl<Date> X_PBIASSTDATE = new ParamImpl<Date>('X', 0X2017002, "PBIASSTDATE");

   ParamImpl<Date> X_PBIASENDATE = new ParamImpl<Date>('X', 0X2017002, "PBIASENDATE");

   ParamImpl<Long> L_PDFTREND = new ParamImpl<Long>('L', 0X2017002, "PDFTREND");

   ParamImpl<Long> L_PDFDOTREND = new ParamImpl<Long>('L', 0X2017002, "PDFDOTREND");

   ParamImpl<Long> L_PNMEANSMPLS = new ParamImpl<Long>('L', 0X2017002, "PNMEANSMPLS");

   ParamImpl<Long> L_PMSLOPESMPLS = new ParamImpl<Long>('L', 0X2017002, "PMSLOPESMPLS");

   ParamImpl<Long> L_PDFTBIAS = new ParamImpl<Long>('L', 0X20170030, "PDFTBIAS");

   ParamImpl<Long> L_PDFTSLOPE = new ParamImpl<Long>('L', 0X20170031, "PDFTSLOPE");

   ParamImpl<Object> V_PDF_STDERROR = new ParamImpl<Object>('V', 0X00000000, "PDF_STDERROR");

   ParamImpl<Object> M_PDF_STDERROR = new ParamImpl<Object>('M', 0X00000001, "PDF_STDERROR");

   ParamImpl<Object> V_PDF_BOUNDARY = new ParamImpl<Object>('V', 0X00000001, "PDF_BOUNDARY");

   ParamImpl<Object> M_PDF_BOUNDARY = new ParamImpl<Object>('M', 0X00000002, "PDF_BOUNDARY");

   ParamImpl<Object> V_PDF_SAMPLE = new ParamImpl<Object>('V', 0X00000002, "PDF_SAMPLE");

   ParamImpl<Object> M_PDF_SAMPLE = new ParamImpl<Object>('M', 0X00000004, "PDF_SAMPLE");

   ParamImpl<Object> V_PDF_USER = new ParamImpl<Object>('V', 0X00000003, "PDF_USER");

   ParamImpl<Object> M_PDF_USER = new ParamImpl<Object>('M', 0X00000008, "PDF_USER");

   ParamImpl<Object> V_PDF_BIAS = new ParamImpl<Object>('V', 0X00000004, "PDF_BIAS");

   ParamImpl<Object> M_PDF_BIAS = new ParamImpl<Object>('M', 0X00000010, "PDF_BIAS");

   ParamImpl<Object> V_PDF_BSINV = new ParamImpl<Object>('V', 0X00000005, "PDF_BSINV");

   ParamImpl<Object> M_PDF_BSINV = new ParamImpl<Object>('M', 0X00000020, "PDF_BSINV");

   ParamImpl<Object> V_PDF_BSACT = new ParamImpl<Object>('V', 0X00000006, "PDF_BSACT");

   ParamImpl<Object> M_PDF_BSACT = new ParamImpl<Object>('M', 0X00000040, "PDF_BSACT");

   ParamImpl<Object> V_PDF_DOBOUND = new ParamImpl<Object>('V', 0X00000007, "PDF_DOBOUND");

   ParamImpl<Object> M_PDF_DOBOUND = new ParamImpl<Object>('M', 0X00000080, "PDF_DOBOUND");

   ParamImpl<Object> V_PDF_DOSAMPLE = new ParamImpl<Object>('V', 0X00000008, "PDF_DOSAMPLE");

   ParamImpl<Object> M_PDF_DOSAMPLE = new ParamImpl<Object>('M', 0X00000100, "PDF_DOSAMPLE");

   ParamImpl<Object> V_PDF_DOUSER = new ParamImpl<Object>('V', 0X00000009, "PDF_DOUSER");

   ParamImpl<Object> M_PDF_DOUSER = new ParamImpl<Object>('M', 0X00000200, "PDF_DOUSER");

   ParamImpl<Object> V_PDF_DOBIAS = new ParamImpl<Object>('V', 0X0000000, "PDF_DOBIAS");

   ParamImpl<Object> M_PDF_DOBIAS = new ParamImpl<Object>('M', 0X00000400, "PDF_DOBIAS");

   ParamImpl<Object> V_PDF_TREND = new ParamImpl<Object>('V', 0X0000000, "PDF_TREND");

   ParamImpl<Object> M_PDF_TREND = new ParamImpl<Object>('M', 0X00000800, "PDF_TREND");

   ParamImpl<Object> V_PDF_DOTREND = new ParamImpl<Object>('V', 0X0000000, "PDF_DOTREND");

   ParamImpl<Object> M_PDF_DOTREND = new ParamImpl<Object>('M', 0X00001000, "PDF_DOTREND");

   ParamImpl<Object> V_PDF_TBIAS = new ParamImpl<Object>('V', 0X0000000, "PDF_TBIAS");

   ParamImpl<Object> M_PDF_TBIAS = new ParamImpl<Object>('M', 0X00002000, "PDF_TBIAS");

   ParamImpl<Object> V_PDF_TSLOPE = new ParamImpl<Object>('V', 0X0000000, "PDF_TSLOPE");

   ParamImpl<Object> M_PDF_TSLOPE = new ParamImpl<Object>('M', 0X00004000, "PDF_TSLOPE");

   ParamImpl<Date> X_RMEASR = new ParamImpl<Date>('X', 0X20180002, "RMEASR");

   ParamImpl<Date> X_RENTRY = new ParamImpl<Date>('X', 0X20180003, "RENTRY");

   ParamImpl<Date> X_REDIT = new ParamImpl<Date>('X', 0X20180004, "REDIT");

   ParamImpl<String> T_RSAMPID = new ParamImpl<String>('T', 0X20180005, "RSAMPID");

   ParamImpl<Date> X_RDEPTIME = new ParamImpl<Date>('X', 0X20180006, "RDEPTIME");

   ParamImpl<String> T_RBUILDUPTYPE = new ParamImpl<String>('T', 0X20180007, "RBUILDUPTYPE");

   ParamImpl<Date> X_RSDATE = new ParamImpl<Date>('X', 0X20180008, "RSDATE");

   ParamImpl<Date> X_RELTIME = new ParamImpl<Date>('X', 0X20180009, "RELTIME");

   ParamImpl<Date> X_RERTIME = new ParamImpl<Date>('X', 0X2018000, "RERTIME");

   ParamImpl<Float> F_RSQUANT = new ParamImpl<Float>('F', 0X2018000, "RSQUANT");

   ParamImpl<String> T_RSUNITS = new ParamImpl<String>('T', 0X2018000, "RSUNITS");

   ParamImpl<String> T_RANALYST = new ParamImpl<String>('T', 0X2018000, "RANALYST");

   ParamImpl<Long> L_RRFLAGS = new ParamImpl<Long>('L', 0X2018000, "RRFLAGS");

   ParamImpl<Long> L_RRFREJECT = new ParamImpl<Long>('L', 0X2018000, "RRFREJECT");

   ParamImpl<Float> F_RVALUE = new ParamImpl<Float>('F', 0X20180010, "RVALUE");

   ParamImpl<Float> F_RDVALUE = new ParamImpl<Float>('F', 0X20180011, "RDVALUE");

   ParamImpl<Long> L_RVFLAGS = new ParamImpl<Long>('L', 0X20180012, "RVFLAGS");

   ParamImpl<Long> L_RVFSTORED = new ParamImpl<Long>('L', 0X20180013, "RVFSTORED");

   ParamImpl<Long> L_RVFEDITED = new ParamImpl<Long>('L', 0X20180014, "RVFEDITED");

   ParamImpl<Long> L_RVFREJECT = new ParamImpl<Long>('L', 0X20180015, "RVFREJECT");

   ParamImpl<Long> L_RVFRECREJ = new ParamImpl<Long>('L', 0X20180016, "RVFRECREJ");

   ParamImpl<Long> L_RVFSDINV = new ParamImpl<Long>('L', 0X20180017, "RVFSDINV");

   ParamImpl<Long> L_RVFSDACT = new ParamImpl<Long>('L', 0X20180018, "RVFSDACT");

   ParamImpl<Long> L_RVFUDINV = new ParamImpl<Long>('L', 0X20180019, "RVFUDINV");

   ParamImpl<Long> L_RVFUDACT = new ParamImpl<Long>('L', 0X2018001, "RVFUDACT");

   ParamImpl<Long> L_RVFLUABV = new ParamImpl<Long>('L', 0X2018001, "RVFLUABV");

   ParamImpl<Long> L_RVFLUBLW = new ParamImpl<Long>('L', 0X2018001, "RVFLUBLW");

   ParamImpl<Long> L_RVFBSINV = new ParamImpl<Long>('L', 0X2018001, "RVFBSINV");

   ParamImpl<Long> L_RVFBSACT = new ParamImpl<Long>('L', 0X2018001, "RVFBSACT");

   ParamImpl<Long> L_RRFTBIAS = new ParamImpl<Long>('L', 0X2018001, "RRFTBIAS");

   ParamImpl<Long> L_RRFTSLOPE = new ParamImpl<Long>('L', 0X20180020, "RRFTSLOPE");

   ParamImpl<String> T_RSAMPDESC = new ParamImpl<String>('T', 0X20180021, "RSAMPDESC");

   ParamImpl<Object> V_RRF_REJECT = new ParamImpl<Object>('V', 0X00000000, "RRF_REJECT");

   ParamImpl<Object> M_RRF_REJECT = new ParamImpl<Object>('M', 0X00000001, "RRF_REJECT");

   ParamImpl<Object> V_RRF_TBIAS = new ParamImpl<Object>('V', 0X00000001, "RRF_TBIAS");

   ParamImpl<Object> M_RRF_TBIAS = new ParamImpl<Object>('M', 0X00000002, "RRF_TBIAS");

   ParamImpl<Object> V_RRF_TSLOPE = new ParamImpl<Object>('V', 0X00000002, "RRF_TSLOPE");

   ParamImpl<Object> M_RRF_TSLOPE = new ParamImpl<Object>('M', 0X00000004, "RRF_TSLOPE");

   ParamImpl<Object> V_RVF_STORED = new ParamImpl<Object>('V', 0X00000000, "RVF_STORED");

   ParamImpl<Object> M_RVF_STORED = new ParamImpl<Object>('M', 0X00000001, "RVF_STORED");

   ParamImpl<Object> V_RVF_EDITED = new ParamImpl<Object>('V', 0X00000001, "RVF_EDITED");

   ParamImpl<Object> M_RVF_EDITED = new ParamImpl<Object>('M', 0X00000002, "RVF_EDITED");

   ParamImpl<Object> V_RVF_REJECT = new ParamImpl<Object>('V', 0X00000002, "RVF_REJECT");

   ParamImpl<Object> M_RVF_REJECT = new ParamImpl<Object>('M', 0X00000004, "RVF_REJECT");

   ParamImpl<Object> V_RVF_RECREJ = new ParamImpl<Object>('V', 0X00000003, "RVF_RECREJ");

   ParamImpl<Object> M_RVF_RECREJ = new ParamImpl<Object>('M', 0X00000008, "RVF_RECREJ");

   ParamImpl<Object> V_RVF_SDINV = new ParamImpl<Object>('V', 0X00000004, "RVF_SDINV");

   ParamImpl<Object> M_RVF_SDINV = new ParamImpl<Object>('M', 0X00000010, "RVF_SDINV");

   ParamImpl<Object> V_RVF_SDACT = new ParamImpl<Object>('V', 0X00000005, "RVF_SDACT");

   ParamImpl<Object> M_RVF_SDACT = new ParamImpl<Object>('M', 0X00000020, "RVF_SDACT");

   ParamImpl<Object> V_RVF_UDINV = new ParamImpl<Object>('V', 0X00000006, "RVF_UDINV");

   ParamImpl<Object> M_RVF_UDINV = new ParamImpl<Object>('M', 0X00000040, "RVF_UDINV");

   ParamImpl<Object> V_RVF_UDACT = new ParamImpl<Object>('V', 0X00000007, "RVF_UDACT");

   ParamImpl<Object> M_RVF_UDACT = new ParamImpl<Object>('M', 0X00000080, "RVF_UDACT");

   ParamImpl<Object> V_RVF_LUABV = new ParamImpl<Object>('V', 0X00000008, "RVF_LUABV");

   ParamImpl<Object> M_RVF_LUABV = new ParamImpl<Object>('M', 0X00000100, "RVF_LUABV");

   ParamImpl<Object> V_RVF_LUBLW = new ParamImpl<Object>('V', 0X00000009, "RVF_LUBLW");

   ParamImpl<Object> M_RVF_LUBLW = new ParamImpl<Object>('M', 0X00000200, "RVF_LUBLW");

   ParamImpl<Object> V_RVF_BSINV = new ParamImpl<Object>('V', 0X0000000, "RVF_BSINV");

   ParamImpl<Object> M_RVF_BSINV = new ParamImpl<Object>('M', 0X00000400, "RVF_BSINV");

   ParamImpl<Object> V_RVF_BSACT = new ParamImpl<Object>('V', 0X0000000, "RVF_BSACT");

   ParamImpl<Object> M_RVF_BSACT = new ParamImpl<Object>('M', 0X00000800, "RVF_BSACT");

   ParamImpl<String> T_DLCTITLE = new ParamImpl<String>('T', 0X20190002, "DLCTITLE");

   ParamImpl<Float> F_DLCWGTGON = new ParamImpl<Float>('F', 0X20190003, "DLCWGTGON");

   ParamImpl<Float> F_DLCWGTBOM = new ParamImpl<Float>('F', 0X20190004, "DLCWGTBOM");

   ParamImpl<Float> F_DLCWGTCOL = new ParamImpl<Float>('F', 0X20190005, "DLCWGTCOL");

   ParamImpl<Float> F_DLCWGTLUN = new ParamImpl<Float>('F', 0X20190006, "DLCWGTLUN");

   ParamImpl<Float> F_DLCWGTSTO = new ParamImpl<Float>('F', 0X20190007, "DLCWGTSTO");

   ParamImpl<Float> F_DLCWGTBLA = new ParamImpl<Float>('F', 0X20190008, "DLCWGTBLA");

   ParamImpl<Float> F_DLCWGTBRE = new ParamImpl<Float>('F', 0X20190009, "DLCWGTBRE");

   ParamImpl<Float> F_DLCWGTLIV = new ParamImpl<Float>('F', 0X2019000, "DLCWGTLIV");

   ParamImpl<Float> F_DLCWGTOES = new ParamImpl<Float>('F', 0X2019000, "DLCWGTOES");

   ParamImpl<Float> F_DLCWGTTHY = new ParamImpl<Float>('F', 0X2019000, "DLCWGTTHY");

   ParamImpl<Float> F_DLCWGTSKI = new ParamImpl<Float>('F', 0X2019000, "DLCWGTSKI");

   ParamImpl<Float> F_DLCWGTBOS = new ParamImpl<Float>('F', 0X2019000, "DLCWGTBOS");

   ParamImpl<Float> F_DLCWGTREM = new ParamImpl<Float>('F', 0X2019000, "DLCWGTREM");

   ParamImpl<Float> F_DLCWGTSP1 = new ParamImpl<Float>('F', 0X20190010, "DLCWGTSP1");

   ParamImpl<Float> F_DLCWGTSP2 = new ParamImpl<Float>('F', 0X20190011, "DLCWGTSP2");

   ParamImpl<Date> X_DLCSTART = new ParamImpl<Date>('X', 0X20190012, "DLCSTART");

   ParamImpl<Date> X_DLCSTOP = new ParamImpl<Date>('X', 0X20190013, "DLCSTOP");

   ParamImpl<String> T_DLCVERS = new ParamImpl<String>('T', 0X20190014, "DLCVERS");

   ParamImpl<String> T_DLCTYPE = new ParamImpl<String>('T', 0X20190015, "DLCTYPE");

   ParamImpl<String> T_DLRNAME = new ParamImpl<String>('T', 0X20190016, "DLRNAME");

   ParamImpl<String> T_DLRCLASS = new ParamImpl<String>('T', 0X20190017, "DLRCLASS");

   ParamImpl<Float> F_DLRUECONST1 = new ParamImpl<Float>('F', 0X20190018, "DLRUECONST1");

   ParamImpl<Float> F_DLRUECONST2 = new ParamImpl<Float>('F', 0X20190019, "DLRUECONST2");

   ParamImpl<Float> F_DLRUECONST3 = new ParamImpl<Float>('F', 0X2019001, "DLRUECONST3");

   ParamImpl<Float> F_DLRUEEXP1 = new ParamImpl<Float>('F', 0X2019001, "DLRUEEXP1");

   ParamImpl<Float> F_DLRUEEXP2 = new ParamImpl<Float>('F', 0X2019001, "DLRUEEXP2");

   ParamImpl<Float> F_DLRUEEXP3 = new ParamImpl<Float>('F', 0X2019001, "DLRUEEXP3");

   ParamImpl<Float> F_DLRFECONST1 = new ParamImpl<Float>('F', 0X2019001, "DLRFECONST1");

   ParamImpl<Float> F_DLRFECONST2 = new ParamImpl<Float>('F', 0X2019001, "DLRFECONST2");

   ParamImpl<Float> F_DLRFECONST3 = new ParamImpl<Float>('F', 0X20190020, "DLRFECONST3");

   ParamImpl<Float> F_DLRFEEXP1 = new ParamImpl<Float>('F', 0X20190021, "DLRFEEXP1");

   ParamImpl<Float> F_DLRFEEXP2 = new ParamImpl<Float>('F', 0X20190022, "DLRFEEXP2");

   ParamImpl<Float> F_DLRFEEXP3 = new ParamImpl<Float>('F', 0X20190023, "DLRFEEXP3");

   ParamImpl<Float> F_DLRDOSEGON = new ParamImpl<Float>('F', 0X20190024, "DLRDOSEGON");

   ParamImpl<Float> F_DLRDOSEBOM = new ParamImpl<Float>('F', 0X20190025, "DLRDOSEBOM");

   ParamImpl<Float> F_DLRDOSECOL = new ParamImpl<Float>('F', 0X20190026, "DLRDOSECOL");

   ParamImpl<Float> F_DLRDOSELUN = new ParamImpl<Float>('F', 0X20190027, "DLRDOSELUN");

   ParamImpl<Float> F_DLRDOSESTO = new ParamImpl<Float>('F', 0X20190028, "DLRDOSESTO");

   ParamImpl<Float> F_DLRDOSEBLA = new ParamImpl<Float>('F', 0X20190029, "DLRDOSEBLA");

   ParamImpl<Float> F_DLRDOSEBRE = new ParamImpl<Float>('F', 0X2019002, "DLRDOSEBRE");

   ParamImpl<Float> F_DLRDOSELIV = new ParamImpl<Float>('F', 0X2019002, "DLRDOSELIV");

   ParamImpl<Float> F_DLRDOSEOES = new ParamImpl<Float>('F', 0X2019002, "DLRDOSEOES");

   ParamImpl<Float> F_DLRDOSETHY = new ParamImpl<Float>('F', 0X2019002, "DLRDOSETHY");

   ParamImpl<Float> F_DLRDOSESKI = new ParamImpl<Float>('F', 0X2019002, "DLRDOSESKI");

   ParamImpl<Float> F_DLRDOSBOS = new ParamImpl<Float>('F', 0X2019002, "DLRDOSBOS");

   ParamImpl<Float> F_DLRDOSEREM = new ParamImpl<Float>('F', 0X20190030, "DLRDOSEREM");

   ParamImpl<Float> F_DLRDOSESP1 = new ParamImpl<Float>('F', 0X20190031, "DLRDOSESP1");

   ParamImpl<Float> F_DLRDOSESP2 = new ParamImpl<Float>('F', 0X20190032, "DLRDOSESP2");

   ParamImpl<String> T_DLSNAME = new ParamImpl<String>('T', 0X20190033, "DLSNAME");

   ParamImpl<Float> F_DLSCONST1 = new ParamImpl<Float>('F', 0X20190034, "DLSCONST1");

   ParamImpl<Float> F_DLSCONST2 = new ParamImpl<Float>('F', 0X20190035, "DLSCONST2");

   ParamImpl<Float> F_DLSCONST3 = new ParamImpl<Float>('F', 0X20190036, "DLSCONST3");

   ParamImpl<Float> F_DLSEXP1 = new ParamImpl<Float>('F', 0X20190037, "DLSEXP1");

   ParamImpl<Float> F_DLSEXP2 = new ParamImpl<Float>('F', 0X20190038, "DLSEXP2");

   ParamImpl<Float> F_DLSEXP3 = new ParamImpl<Float>('F', 0X20190039, "DLSEXP3");

   ParamImpl<Float> F_DLSSRC2GON = new ParamImpl<Float>('F', 0X2019003, "DLSSRC2GON");

   ParamImpl<Float> F_DLSSRC2BOM = new ParamImpl<Float>('F', 0X2019003, "DLSSRC2BOM");

   ParamImpl<Float> F_DLSSRC2COL = new ParamImpl<Float>('F', 0X2019003, "DLSSRC2COL");

   ParamImpl<Float> F_DLSSRC2LUN = new ParamImpl<Float>('F', 0X2019003, "DLSSRC2LUN");

   ParamImpl<Float> F_DLSSRC2STO = new ParamImpl<Float>('F', 0X2019003, "DLSSRC2STO");

   ParamImpl<Float> F_DLSSRC2BLA = new ParamImpl<Float>('F', 0X2019003, "DLSSRC2BLA");

   ParamImpl<Float> F_DLSSRC2BRE = new ParamImpl<Float>('F', 0X20190040, "DLSSRC2BRE");

   ParamImpl<Float> F_DLSSRC2LIV = new ParamImpl<Float>('F', 0X20190041, "DLSSRC2LIV");

   ParamImpl<Float> F_DLSSRC2OES = new ParamImpl<Float>('F', 0X20190042, "DLSSRC2OES");

   ParamImpl<Float> F_DLSSRC2THY = new ParamImpl<Float>('F', 0X20190043, "DLSSRC2THY");

   ParamImpl<Float> F_DLSSRC2SKI = new ParamImpl<Float>('F', 0X20190044, "DLSSRC2SKI");

   ParamImpl<Float> F_DLSSRC2BOS = new ParamImpl<Float>('F', 0X20190045, "DLSSRC2BOS");

   ParamImpl<Float> F_DLSSRC2REM = new ParamImpl<Float>('F', 0X20190046, "DLSSRC2REM");

   ParamImpl<Float> F_DLSSRC2SP1 = new ParamImpl<Float>('F', 0X20190047, "DLSSRC2SP1");

   ParamImpl<Float> F_DLSSRC2SP2 = new ParamImpl<Float>('F', 0X20190048, "DLSSRC2SP2");

   ParamImpl<Float> F_DLSUDF2SRC = new ParamImpl<Float>('F', 0X20190049, "DLSUDF2SRC");

   ParamImpl<Float> F_DLSFDF2SRC = new ParamImpl<Float>('F', 0X2019004, "DLSFDF2SRC");

   ParamImpl<Date> X_DCDASTIME = new ParamImpl<Date>('X', 0X201, "DCDASTIME");

   ParamImpl<Float> F_DCDACTIVITY = new ParamImpl<Float>('F', 0X201, "DCDACTIVITY");

   ParamImpl<Float> F_DCDERROR = new ParamImpl<Float>('F', 0X201, "DCDERROR");

   ParamImpl<String> T_DCDNAME = new ParamImpl<String>('T', 0X201, "DCDNAME");

   ParamImpl<Float> F_DCDCONC = new ParamImpl<Float>('F', 0X201, "DCDCONC");

   ParamImpl<Float> F_DCDFRA2LU = new ParamImpl<Float>('F', 0X201, "DCDFRA2LU");

   ParamImpl<Float> F_DCDFRA2GI = new ParamImpl<Float>('F', 0X201, "DCDFRA2GI");

   ParamImpl<Float> F_DCDFRA2TY = new ParamImpl<Float>('F', 0X201, "DCDFRA2TY");

   ParamImpl<Float> F_DCDFRA2TB = new ParamImpl<Float>('F', 0X201, "DCDFRA2TB");

   ParamImpl<Float> F_DCDFRA2OT = new ParamImpl<Float>('F', 0X201, "DCDFRA2OT");

   ParamImpl<String> T_NACQFILTER = new ParamImpl<String>('T', 0X201, "NACQFILTER");

   ParamImpl<String> T_NACQNEUTENG = new ParamImpl<String>('T', 0X201, "NACQNEUTENG");

   ParamImpl<Float> F_NACQMEANRERR = new ParamImpl<Float>('F', 0X201, "NACQMEANRERR");

   ParamImpl<Float> F_NACQMTSTDD = new ParamImpl<Float>('F', 0X201, "NACQMTSTDD");

   ParamImpl<String> T_NACQANALYST = new ParamImpl<String>('T', 0X201, "NACQANALYST");

   ParamImpl<Float> F_NACQPUMASS = new ParamImpl<Float>('F', 0X201, "NACQPUMASS");

   ParamImpl<Float> F_NACQPUMNERR = new ParamImpl<Float>('F', 0X201, "NACQPUMNERR");

   ParamImpl<Long> L_NACQSFLAGS = new ParamImpl<Long>('L', 0X201, "NACQSFLAGS");

   ParamImpl<Date> X_NACQSTIME = new ParamImpl<Date>('X', 0X201, "NACQSTIME");

   ParamImpl<Float> F_NACQSETIME = new ParamImpl<Float>('F', 0X201, "NACQSETIME");

   ParamImpl<Float> F_NACQSTOTALS = new ParamImpl<Float>('F', 0X201, "NACQSTOTALS");

   ParamImpl<Float> F_NACQSREALS = new ParamImpl<Float>('F', 0X201, "NACQSREALS");

   ParamImpl<Float> F_NACQSACC = new ParamImpl<Float>('F', 0X201, "NACQSACC");

   ParamImpl<Float> F_NACQPUMEERR = new ParamImpl<Float>('F', 0X201, "NACQPUMEERR");

   ParamImpl<Float> F_NACQPUMDIFF = new ParamImpl<Float>('F', 0X201, "NACQPUMDIFF");

   ParamImpl<Float> F_NACQPUMNSDIF = new ParamImpl<Float>('F', 0X201, "NACQPUMNSDIF");

   ParamImpl<Float> F_NACQPU240EFF = new ParamImpl<Float>('F', 0X201, "NACQPU240EFF");

   ParamImpl<Float> F_NACQSFACTOR = new ParamImpl<Float>('F', 0X201, "NACQSFACTOR");

   ParamImpl<Float> F_NACQPU240ERR = new ParamImpl<Float>('F', 0X201, "NACQPU240ERR");

   ParamImpl<Float> F_NACQMEANTERR = new ParamImpl<Float>('F', 0X201, "NACQMEANTERR");

   ParamImpl<Float> F_NACQALPHA = new ParamImpl<Float>('F', 0X201, "NACQALPHA");

   ParamImpl<Float> F_NACQMCREALS = new ParamImpl<Float>('F', 0X201, "NACQMCREALS");

   ParamImpl<Float> F_NACQMEANREAL = new ParamImpl<Float>('F', 0X201, "NACQMEANREAL");

   ParamImpl<Float> F_NACQMRSTDD = new ParamImpl<Float>('F', 0X201, "NACQMRSTDD");

   ParamImpl<Long> L_NACQFLAGS = new ParamImpl<Long>('L', 0X201, "NACQFLAGS");

   ParamImpl<Long> L_NACQSREJECT = new ParamImpl<Long>('L', 0X201, "NACQSREJECT");

   ParamImpl<Float> F_NACQMEANTOT = new ParamImpl<Float>('F', 0X201, "NACQMEANTOT");

   ParamImpl<Float> F_NACQMEANACC = new ParamImpl<Float>('F', 0X201, "NACQMEANACC");

   ParamImpl<Float> F_NACQMEANBCR = new ParamImpl<Float>('F', 0X201, "NACQMEANBCR");

   ParamImpl<Float> F_NACQMEANBCT = new ParamImpl<Float>('F', 0X201, "NACQMEANBCT");

   ParamImpl<Long> L_NACQUNREJM = new ParamImpl<Long>('L', 0X201, "NACQUNREJM");

   ParamImpl<Long> L_NACQNT2GREJ = new ParamImpl<Long>('L', 0X201, "NACQNT2GREJ");

   ParamImpl<Float> F_NACQMCREALER = new ParamImpl<Float>('F', 0X201, "NACQMCREALER");

   ParamImpl<Float> F_NACQMEANBCRE = new ParamImpl<Float>('F', 0X201, "NACQMEANBCRE");

   ParamImpl<Float> F_NACQMEANBCTE = new ParamImpl<Float>('F', 0X201, "NACQMEANBCTE");

   ParamImpl<Float> F_NACQMASTDD = new ParamImpl<Float>('F', 0X201, "NACQMASTDD");

   ParamImpl<Float> F_NACQMEANDTT = new ParamImpl<Float>('F', 0X201, "NACQMEANDTT");

   ParamImpl<Float> F_NACQMEANDTTE = new ParamImpl<Float>('F', 0X201, "NACQMEANDTTE");

   ParamImpl<Float> F_NACQMEANDTR = new ParamImpl<Float>('F', 0X201, "NACQMEANDTR");

   ParamImpl<Float> F_NACQMEANDTRE = new ParamImpl<Float>('F', 0X201, "NACQMEANDTRE");

   ParamImpl<Long> L_NACQSRREJECT = new ParamImpl<Long>('L', 0X201, "NACQSRREJECT");

   ParamImpl<Long> L_NACQST2GREJ = new ParamImpl<Long>('L', 0X201, "NACQST2GREJ");

   ParamImpl<Long> L_NACQNTOTREJ = new ParamImpl<Long>('L', 0X201, "NACQNTOTREJ");

   ParamImpl<Long> L_NACQNREALREJ = new ParamImpl<Long>('L', 0X201, "NACQNREALREJ");

   ParamImpl<Float> F_NACQCALCWR = new ParamImpl<Float>('F', 0X201, "NACQCALCWR");

   ParamImpl<Float> F_NACQPU240NER = new ParamImpl<Float>('F', 0X201, "NACQPU240NER");

   ParamImpl<Float> F_NACQTMEASTIM = new ParamImpl<Float>('F', 0X201, "NACQTMEASTIM");

   ParamImpl<Float> F_NACQMFACTOR = new ParamImpl<Float>('F', 0X201, "NACQMFACTOR");

   ParamImpl<Float> F_NACQPREDPUM = new ParamImpl<Float>('F', 0X201, "NACQPREDPUM");

   ParamImpl<Float> F_NACQPREDPUME = new ParamImpl<Float>('F', 0X201, "NACQPREDPUME");

   ParamImpl<Float> F_NACQMDA = new ParamImpl<Float>('F', 0X201, "NACQMDA");

   ParamImpl<String> T_NACQNORMVERS = new ParamImpl<String>('T', 0X201, "NACQNORMVERS");

   ParamImpl<String> T_NACQMEASVERS = new ParamImpl<String>('T', 0X201, "NACQMEASVERS");

   ParamImpl<String> T_NACQDECAYVER = new ParamImpl<String>('T', 0X201, "NACQDECAYVER");

   ParamImpl<Float> F_NACQMDAERR = new ParamImpl<Float>('F', 0X201, "NACQMDAERR");

   ParamImpl<Float> F_NACQPUMATDT = new ParamImpl<Float>('F', 0X201, "NACQPUMATDT");

   ParamImpl<Float> F_NACQPUMEATDT = new ParamImpl<Float>('F', 0X201, "NACQPUMEATDT");

   ParamImpl<Long> L_NACQACTIVEU = new ParamImpl<Long>('L', 0X201, "NACQACTIVEU");

   ParamImpl<Float> F_NACQSDOUBLES = new ParamImpl<Float>('F', 0X201, "NACQSDOUBLES");

   ParamImpl<Float> F_NACQSTRIPLES = new ParamImpl<Float>('F', 0X201, "NACQSTRIPLES");

   ParamImpl<Long> L_NACQSCHKREJ = new ParamImpl<Long>('L', 0X201, "NACQSCHKREJ");

   ParamImpl<Float> F_NACQAVGSGL = new ParamImpl<Float>('F', 0X201, "NACQAVGSGL");

   ParamImpl<Float> F_NACQAVGDBL = new ParamImpl<Float>('F', 0X201, "NACQAVGDBL");

   ParamImpl<Float> F_NACQAVGTPL = new ParamImpl<Float>('F', 0X201, "NACQAVGTPL");

   ParamImpl<Float> F_NACQAVGSERR = new ParamImpl<Float>('F', 0X201, "NACQAVGSERR");

   ParamImpl<Float> F_NACQAVGDERR = new ParamImpl<Float>('F', 0X201, "NACQAVGDERR");

   ParamImpl<Float> F_NACQAVGTERR = new ParamImpl<Float>('F', 0X201, "NACQAVGTERR");

   ParamImpl<Float> F_NACQAVGCSGL = new ParamImpl<Float>('F', 0X201, "NACQAVGCSGL");

   ParamImpl<Float> F_NACQAVGCDBL = new ParamImpl<Float>('F', 0X201, "NACQAVGCDBL");

   ParamImpl<Float> F_NACQAVGCTPL = new ParamImpl<Float>('F', 0X201, "NACQAVGCTPL");

   ParamImpl<Float> F_NACQAVGCSER = new ParamImpl<Float>('F', 0X201, "NACQAVGCSER");

   ParamImpl<Float> F_NACQAVGCDER = new ParamImpl<Float>('F', 0X201, "NACQAVGCDER");

   ParamImpl<Float> F_NACQAVGCTER = new ParamImpl<Float>('F', 0X201, "NACQAVGCTER");

   ParamImpl<Float> F_NACQMCDBLS = new ParamImpl<Float>('F', 0X201, "NACQMCDBLS");

   ParamImpl<Float> F_NACQMCDBLER = new ParamImpl<Float>('F', 0X201, "NACQMCDBLER");

   ParamImpl<Long> L_NACQNCHKREJ = new ParamImpl<Long>('L', 0X201, "NACQNCHKREJ");

   ParamImpl<Float> F_NACQMALPHA = new ParamImpl<Float>('F', 0X201, "NACQMALPHA");

   ParamImpl<Float> F_NACQMALPHAER = new ParamImpl<Float>('F', 0X201, "NACQMALPHAER");

   ParamImpl<Float> F_NACQMMFACT = new ParamImpl<Float>('F', 0X201, "NACQMMFACT");

   ParamImpl<Float> F_NACQMMFACTER = new ParamImpl<Float>('F', 0X201, "NACQMMFACTER");

   ParamImpl<Float> F_NACQMPU240EF = new ParamImpl<Float>('F', 0X201, "NACQMPU240EF");

   ParamImpl<Float> F_NACQMPU240ER = new ParamImpl<Float>('F', 0X201, "NACQMPU240ER");

   ParamImpl<Float> F_NACQMPUMASS = new ParamImpl<Float>('F', 0X201, "NACQMPUMASS");

   ParamImpl<Float> F_NACQMPUMNERR = new ParamImpl<Float>('F', 0X201, "NACQMPUMNERR");

   ParamImpl<Float> F_NACQMPUMEERR = new ParamImpl<Float>('F', 0X201, "NACQMPUMEERR");

   ParamImpl<Float> F_NACQPREDMPU = new ParamImpl<Float>('F', 0X201, "NACQPREDMPU");

   ParamImpl<Float> F_NACQPREDMPUE = new ParamImpl<Float>('F', 0X201, "NACQPREDMPUE");

   ParamImpl<Float> F_NACQMPUDIFF = new ParamImpl<Float>('F', 0X201, "NACQMPUDIFF");

   ParamImpl<Float> F_NACQMPUNSDIF = new ParamImpl<Float>('F', 0X201, "NACQMPUNSDIF");

   ParamImpl<Float> F_NACQMPU240NE = new ParamImpl<Float>('F', 0X201, "NACQMPU240NE");

   ParamImpl<Float> F_NACQMPUATDT = new ParamImpl<Float>('F', 0X201, "NACQMPUATDT");

   ParamImpl<Float> F_NACQMPUEATDT = new ParamImpl<Float>('F', 0X201, "NACQMPUEATDT");

   ParamImpl<Long> L_NACQNMULTI = new ParamImpl<Long>('L', 0X201, "NACQNMULTI");

   ParamImpl<Float> F_NACQ239FEG = new ParamImpl<Float>('F', 0X201, "NACQ239FEG");

   ParamImpl<Float> F_NACQ239FEGER = new ParamImpl<Float>('F', 0X201, "NACQ239FEGER");

   ParamImpl<Float> F_NACQ239EQACT = new ParamImpl<Float>('F', 0X201, "NACQ239EQACT");

   ParamImpl<Float> F_NACQ239EQAER = new ParamImpl<Float>('F', 0X201, "NACQ239EQAER");

   ParamImpl<Float> F_NACQDHEAT = new ParamImpl<Float>('F', 0X201, "NACQDHEAT");

   ParamImpl<Float> F_NACQDHEATER = new ParamImpl<Float>('F', 0X201, "NACQDHEATER");

   ParamImpl<Float> F_NACQAACTVTY = new ParamImpl<Float>('F', 0X201, "NACQAACTVTY");

   ParamImpl<Float> F_NACQAACTER = new ParamImpl<Float>('F', 0X201, "NACQAACTER");

   ParamImpl<Long> L_NACQSTPLREJ = new ParamImpl<Long>('L', 0X201, "NACQSTPLREJ");

   ParamImpl<Long> L_NACQNTPLREJ = new ParamImpl<Long>('L', 0X201, "NACQNTPLREJ");

   ParamImpl<Float> F_NACQM239FEG = new ParamImpl<Float>('F', 0X201, "NACQM239FEG");

   ParamImpl<Float> F_NACQM239FEGE = new ParamImpl<Float>('F', 0X201, "NACQM239FEGE");

   ParamImpl<Float> F_NACQM239EQAC = new ParamImpl<Float>('F', 0X201, "NACQM239EQAC");

   ParamImpl<Float> F_NACQM239EQAE = new ParamImpl<Float>('F', 0X201, "NACQM239EQAE");

   ParamImpl<Float> F_NACQMDHEAT = new ParamImpl<Float>('F', 0X201, "NACQMDHEAT");

   ParamImpl<Float> F_NACQMDHEATER = new ParamImpl<Float>('F', 0X201, "NACQMDHEATER");

   ParamImpl<Float> F_NACQMAACTVTY = new ParamImpl<Float>('F', 0X201, "NACQMAACTVTY");

   ParamImpl<Float> F_NACQMAACTER = new ParamImpl<Float>('F', 0X201, "NACQMAACTER");

   ParamImpl<Float> F_NACQAVGCSDC = new ParamImpl<Float>('F', 0X201, "NACQAVGCSDC");

   ParamImpl<Float> F_NACQAVGCSTC = new ParamImpl<Float>('F', 0X201, "NACQAVGCSTC");

   ParamImpl<Float> F_NACQAVGCDTC = new ParamImpl<Float>('F', 0X201, "NACQAVGCDTC");

   ParamImpl<String> T_NACQAASVERS = new ParamImpl<String>('T', 0X201, "NACQAASVERS");

   ParamImpl<String> T_NACQISOSRC = new ParamImpl<String>('T', 0X201, "NACQISOSRC");

   ParamImpl<Long> L_NACQFCFCMDET = new ParamImpl<Long>('L', 0X201, "NACQFCFCMDET");

   ParamImpl<Long> L_NACQFCFDET = new ParamImpl<Long>('L', 0X201, "NACQFCFDET");

   ParamImpl<Long> L_NACQFCMDET = new ParamImpl<Long>('L', 0X201, "NACQFCMDET");

   ParamImpl<Long> L_NACQFAASCFTH = new ParamImpl<Long>('L', 0X201, "NACQFAASCFTH");

   ParamImpl<Long> L_NACQFAASCFTL = new ParamImpl<Long>('L', 0X201, "NACQFAASCFTL");

   ParamImpl<Long> L_NACQFAWADONE = new ParamImpl<Long>('L', 0X201, "NACQFAWADONE");

   ParamImpl<Long> L_NACQFAWASTAT = new ParamImpl<Long>('L', 0X201, "NACQFAWASTAT");

   ParamImpl<Long> L_NACQFCFAVL = new ParamImpl<Long>('L', 0X201, "NACQFCFAVL");

   ParamImpl<Long> L_NACQFCMAVL = new ParamImpl<Long>('L', 0X201, "NACQFCMAVL");

   ParamImpl<Long> L_NACQFPUMTH = new ParamImpl<Long>('L', 0X201, "NACQFPUMTH");

   ParamImpl<Long> L_NACQFPUMTL = new ParamImpl<Long>('L', 0X201, "NACQFPUMTL");

   ParamImpl<Float> F_NACQFMDAERR = new ParamImpl<Float>('F', 0X201, "NACQFMDAERR");

   ParamImpl<Float> F_NACQFPUMERR = new ParamImpl<Float>('F', 0X201, "NACQFPUMERR");

   ParamImpl<Float> F_NACQFMDA = new ParamImpl<Float>('F', 0X201, "NACQFMDA");

   ParamImpl<Float> F_NACQFPUMASS = new ParamImpl<Float>('F', 0X201, "NACQFPUMASS");

   ParamImpl<Float> F_NACQFPU240EF = new ParamImpl<Float>('F', 0X201, "NACQFPU240EF");

   ParamImpl<Float> F_NACQSONES = new ParamImpl<Float>('F', 0X201, "NACQSONES");

   ParamImpl<Float> F_NACQSTRUNSGL = new ParamImpl<Float>('F', 0X201, "NACQSTRUNSGL");

   ParamImpl<Float> F_NACQSTRUNDBL = new ParamImpl<Float>('F', 0X201, "NACQSTRUNDBL");

   ParamImpl<Float> F_NACQSTRUNTPL = new ParamImpl<Float>('F', 0X201, "NACQSTRUNTPL");

   ParamImpl<Float> F_NACQAVGONES = new ParamImpl<Float>('F', 0X201, "NACQAVGONES");

   ParamImpl<Float> F_NACQAVGONEER = new ParamImpl<Float>('F', 0X201, "NACQAVGONEER");

   ParamImpl<Float> F_NACQAVGTRNS = new ParamImpl<Float>('F', 0X201, "NACQAVGTRNS");

   ParamImpl<Float> F_NACQAVGTRNSE = new ParamImpl<Float>('F', 0X201, "NACQAVGTRNSE");

   ParamImpl<Float> F_NACQAVGTRND = new ParamImpl<Float>('F', 0X201, "NACQAVGTRND");

   ParamImpl<Float> F_NACQAVGTRNDE = new ParamImpl<Float>('F', 0X201, "NACQAVGTRNDE");

   ParamImpl<Float> F_NACQAVGTRNT = new ParamImpl<Float>('F', 0X201, "NACQAVGTRNT");

   ParamImpl<Float> F_NACQAVGTRNTE = new ParamImpl<Float>('F', 0X201, "NACQAVGTRNTE");

   ParamImpl<Float> F_NACQAVGCONE = new ParamImpl<Float>('F', 0X201, "NACQAVGCONE");

   ParamImpl<Float> F_NACQAVGCOER = new ParamImpl<Float>('F', 0X201, "NACQAVGCOER");

   ParamImpl<Float> F_NACQAVGCTRNS = new ParamImpl<Float>('F', 0X201, "NACQAVGCTRNS");

   ParamImpl<Float> F_NACQAVGCTSE = new ParamImpl<Float>('F', 0X201, "NACQAVGCTSE");

   ParamImpl<Float> F_NACQAVGCTRND = new ParamImpl<Float>('F', 0X201, "NACQAVGCTRND");

   ParamImpl<Float> F_NACQAVGCTDE = new ParamImpl<Float>('F', 0X201, "NACQAVGCTDE");

   ParamImpl<Float> F_NACQAVGCTRNT = new ParamImpl<Float>('F', 0X201, "NACQAVGCTRNT");

   ParamImpl<Float> F_NACQAVGCTTE = new ParamImpl<Float>('F', 0X201, "NACQAVGCTTE");

   ParamImpl<Float> F_NACQAVGCTSDC = new ParamImpl<Float>('F', 0X201, "NACQAVGCTSDC");

   ParamImpl<Float> F_NACQAVGCTSTC = new ParamImpl<Float>('F', 0X201, "NACQAVGCTSTC");

   ParamImpl<Float> F_NACQAVGCTDTC = new ParamImpl<Float>('F', 0X201, "NACQAVGCTDTC");

   ParamImpl<Float> F_NACQONESTIME = new ParamImpl<Float>('F', 0X201, "NACQONESTIME");

   ParamImpl<Long> L_NACQONESREJ = new ParamImpl<Long>('L', 0X201, "NACQONESREJ");

   ParamImpl<Long> L_NACQSONESREJ = new ParamImpl<Long>('L', 0X201, "NACQSONESREJ");

   ParamImpl<Float> F_NACQPU240ONE = new ParamImpl<Float>('F', 0X201, "NACQPU240ONE");

   ParamImpl<Float> F_NACQP240ONER = new ParamImpl<Float>('F', 0X201, "NACQP240ONER");

   ParamImpl<Float> F_NACQONESMDA = new ParamImpl<Float>('F', 0X201, "NACQONESMDA");

   ParamImpl<Float> F_NACQONESMDAE = new ParamImpl<Float>('F', 0X201, "NACQONESMDAE");

   ParamImpl<Long> L_NACQONESDONE = new ParamImpl<Long>('L', 0X201, "NACQONESDONE");

   ParamImpl<Long> L_NACQONESSTAT = new ParamImpl<Long>('L', 0X201, "NACQONESSTAT");

   ParamImpl<Long> L_NACQFCRRDONE = new ParamImpl<Long>('L', 0X201, "NACQFCRRDONE");

   ParamImpl<Long> L_NACQCRRSTAT = new ParamImpl<Long>('L', 0X201, "NACQCRRSTAT");

   ParamImpl<Float> F_NACQNTHZMASS = new ParamImpl<Float>('F', 0X201, "NACQNTHZMASS");

   ParamImpl<Float> F_NACQNTHZMER = new ParamImpl<Float>('F', 0X201, "NACQNTHZMER");

   ParamImpl<Float> F_NACQCRNT240 = new ParamImpl<Float>('F', 0X201, "NACQCRNT240");

   ParamImpl<Float> F_NACQCRNT240E = new ParamImpl<Float>('F', 0X201, "NACQCRNT240E");

   ParamImpl<Float> F_NACQCRNTMDA = new ParamImpl<Float>('F', 0X201, "NACQCRNTMDA");

   ParamImpl<Float> F_NACQCRNTMDAE = new ParamImpl<Float>('F', 0X201, "NACQCRNTMDAE");

   ParamImpl<Float> F_NACQTHZMASS = new ParamImpl<Float>('F', 0X201, "NACQTHZMASS");

   ParamImpl<Float> F_NACQTHZMER = new ParamImpl<Float>('F', 0X201, "NACQTHZMER");

   ParamImpl<Float> F_NACQCRT240 = new ParamImpl<Float>('F', 0X201, "NACQCRT240");

   ParamImpl<Float> F_NACQCRT240E = new ParamImpl<Float>('F', 0X201, "NACQCRT240E");

   ParamImpl<Float> F_NACQCRTMDA = new ParamImpl<Float>('F', 0X201, "NACQCRTMDA");

   ParamImpl<Float> F_NACQCRTMDAE = new ParamImpl<Float>('F', 0X201, "NACQCRTMDAE");

   ParamImpl<Long> L_NACQCMCFDONE = new ParamImpl<Long>('L', 0X201, "NACQCMCFDONE");

   ParamImpl<Long> L_NACQCMCFSTAT = new ParamImpl<Long>('L', 0X201, "NACQCMCFSTAT");

   ParamImpl<Float> F_NACQCMCF240 = new ParamImpl<Float>('F', 0X201, "NACQCMCF240");

   ParamImpl<Float> F_NACQCMCF240E = new ParamImpl<Float>('F', 0X201, "NACQCMCF240E");

   ParamImpl<Float> F_NACQCMMASS = new ParamImpl<Float>('F', 0X201, "NACQCMMASS");

   ParamImpl<Float> F_NACQCMMASSER = new ParamImpl<Float>('F', 0X201, "NACQCMMASSER");

   ParamImpl<Float> F_NACQCFMASS = new ParamImpl<Float>('F', 0X201, "NACQCFMASS");

   ParamImpl<Float> F_NACQCFMASSER = new ParamImpl<Float>('F', 0X201, "NACQCFMASSER");

   ParamImpl<Float> F_NACQCMCFMDA = new ParamImpl<Float>('F', 0X201, "NACQCMCFMDA");

   ParamImpl<Float> F_NACQCMCFMDAE = new ParamImpl<Float>('F', 0X201, "NACQCMCFMDAE");

   ParamImpl<Float> F_NACQFPU240ER = new ParamImpl<Float>('F', 0X201, "NACQFPU240ER");

   ParamImpl<String> T_NACQAWAMASST = new ParamImpl<String>('T', 0X201, "NACQAWAMASST");

   ParamImpl<String> T_NACQAWAMDAT = new ParamImpl<String>('T', 0X201, "NACQAWAMDAT");

   ParamImpl<Float> F_NACQTDBL240 = new ParamImpl<Float>('F', 0X201, "NACQTDBL240");

   ParamImpl<Float> F_NACQTDBL240E = new ParamImpl<Float>('F', 0X201, "NACQTDBL240E");

   ParamImpl<Float> F_NACQTDBLMDA = new ParamImpl<Float>('F', 0X201, "NACQTDBLMDA");

   ParamImpl<Float> F_NACQTDBLMDAE = new ParamImpl<Float>('F', 0X201, "NACQTDBLMDAE");

   ParamImpl<Float> F_NACQSFACERR = new ParamImpl<Float>('F', 0X201, "NACQSFACERR");

   ParamImpl<Float> F_NACQCLRCF1 = new ParamImpl<Float>('F', 0X201, "NACQCLRCF1");

   ParamImpl<Float> F_NACQCLRCF1ER = new ParamImpl<Float>('F', 0X201, "NACQCLRCF1ER");

   ParamImpl<Float> F_NACQCLRCF2 = new ParamImpl<Float>('F', 0X201, "NACQCLRCF2");

   ParamImpl<Float> F_NACQCLRCF2ER = new ParamImpl<Float>('F', 0X201, "NACQCLRCF2ER");

   ParamImpl<Float> F_NACQCLRCF3 = new ParamImpl<Float>('F', 0X201, "NACQCLRCF3");

   ParamImpl<Float> F_NACQCLRCF3ER = new ParamImpl<Float>('F', 0X201, "NACQCLRCF3ER");

   ParamImpl<Float> F_NACQCLRMASS = new ParamImpl<Float>('F', 0X201, "NACQCLRMASS");

   ParamImpl<Float> F_NACQCLRMASSE = new ParamImpl<Float>('F', 0X201, "NACQCLRMASSE");

   ParamImpl<Float> F_NACQACPLNG = new ParamImpl<Float>('F', 0X201, "NACQACPLNG");

   ParamImpl<Float> F_NACQACPLNGER = new ParamImpl<Float>('F', 0X201, "NACQACPLNGER");

   ParamImpl<Float> F_NACQAFMASS = new ParamImpl<Float>('F', 0X201, "NACQAFMASS");

   ParamImpl<Float> F_NACQAFMASSER = new ParamImpl<Float>('F', 0X201, "NACQAFMASSER");

   ParamImpl<Float> F_NACQASNGLSC = new ParamImpl<Float>('F', 0X201, "NACQASNGLSC");

   ParamImpl<Float> F_NACQASNGLSCE = new ParamImpl<Float>('F', 0X201, "NACQASNGLSCE");

   ParamImpl<Long> L_NACQSSCALER1 = new ParamImpl<Long>('L', 0X201, "NACQSSCALER1");

   ParamImpl<Long> L_NACQSSCALER2 = new ParamImpl<Long>('L', 0X201, "NACQSSCALER2");

   ParamImpl<Long> L_NACQFLSTMODE = new ParamImpl<Long>('L', 0X201, "NACQFLSTMODE");

   ParamImpl<Long> L_NACQLSTHTYPE = new ParamImpl<Long>('L', 0X201, "NACQLSTHTYPE");

   ParamImpl<Long> L_NACQLSTSTAT = new ParamImpl<Long>('L', 0X201, "NACQLSTSTAT");

   ParamImpl<Float> F_NACQLSTFREQ = new ParamImpl<Float>('F', 0X201, "NACQLSTFREQ");

   ParamImpl<Object> M_NACQF_TFILTERED = new ParamImpl<Object>('M', 0X00000001, "NACQF_TFILTERED");

   ParamImpl<Object> M_NACQF_RFILTERED = new ParamImpl<Object>('M', 0X00000002, "NACQF_RFILTERED");

   ParamImpl<Object> M_NACQF_T2G = new ParamImpl<Object>('M', 0X00000004, "NACQF_T2G");

   ParamImpl<Object> M_NACQF_NEUTRONICS = new ParamImpl<Object>('M', 0X00000008, "NACQF_NEUTRONICS");

   ParamImpl<Object> M_NACQF_MEASCORR = new ParamImpl<Object>('M', 0X00000010, "NACQF_MEASCORR");

   ParamImpl<Object> M_NACQF_DECAYMULT = new ParamImpl<Object>('M', 0X00000020, "NACQF_DECAYMULT");

   ParamImpl<Object> M_NACQF_KFACCALC = new ParamImpl<Object>('M', 0X00000040, "NACQF_KFACCALC");

   ParamImpl<Object> M_NACQF_ACTIVEU = new ParamImpl<Object>('M', 0X00000080, "NACQF_ACTIVEU");

   ParamImpl<Object> M_NACQF_CHKSUM = new ParamImpl<Object>('M', 0X00000100, "NACQF_CHKSUM");

   ParamImpl<Object> M_NACQF_NMULTI = new ParamImpl<Object>('M', 0X00000200, "NACQF_NMULTI");

   ParamImpl<Object> M_NACQF_SDTCALC = new ParamImpl<Object>('M', 0X00000400, "NACQF_SDTCALC");

   ParamImpl<Object> M_NACQF_MULTIEFF = new ParamImpl<Object>('M', 0X00000800, "NACQF_MULTIEFF");

   ParamImpl<Object> M_NACQF_MULTINOROOTS = new ParamImpl<Object>('M', 0X00001000, "NACQF_MULTINOROOTS");

   ParamImpl<Object> M_NACQF_CFCMDET = new ParamImpl<Object>('M', 0X00002000, "NACQF_CFCMDET");

   ParamImpl<Object> M_NACQF_CFDET = new ParamImpl<Object>('M', 0X00004000, "NACQF_CFDET");

   ParamImpl<Object> M_NACQF_CMDET = new ParamImpl<Object>('M', 0X00008000, "NACQF_CMDET");

   ParamImpl<Object> M_NACQF_AASCFTH = new ParamImpl<Object>('M', 0X00010000, "NACQF_AASCFTH");

   ParamImpl<Object> M_NACQF_AASCFTL = new ParamImpl<Object>('M', 0X00020000, "NACQF_AASCFTL");

   ParamImpl<Object> M_NACQF_AWADONE = new ParamImpl<Object>('M', 0X00040000, "NACQF_AWADONE");

   ParamImpl<Object> M_NACQF_CFAVL = new ParamImpl<Object>('M', 0X00080000, "NACQF_CFAVL");

   ParamImpl<Object> M_NACQF_CMAVL = new ParamImpl<Object>('M', 0X00100000, "NACQF_CMAVL");

   ParamImpl<Object> M_NACQF_PUMTH = new ParamImpl<Object>('M', 0X00200000, "NACQF_PUMTH");

   ParamImpl<Object> M_NACQF_PUMTL = new ParamImpl<Object>('M', 0X00400000, "NACQF_PUMTL");

   ParamImpl<Object> M_NACQF_ONESDONE = new ParamImpl<Object>('M', 0X00800000, "NACQF_ONESDONE");

   ParamImpl<Object> M_NACQF_CRRDONE = new ParamImpl<Object>('M', 0X01000000, "NACQF_CRRDONE");

   ParamImpl<Object> M_NACQF_CMCFDONE = new ParamImpl<Object>('M', 0X02000000, "NACQF_CMCFDONE");

   ParamImpl<Object> M_NACQF_ONESFILT = new ParamImpl<Object>('M', 0X04000000, "NACQF_ONESFILT");

   ParamImpl<Object> M_NACQF_TRIPFILT = new ParamImpl<Object>('M', 0X08000000, "NACQF_TRIPFILT");

   ParamImpl<Object> M_NACQF_COINNOROOTS = new ParamImpl<Object>('M', 0X10000000, "NACQF_COINNOROOTS");

   ParamImpl<Object> M_NACQF_MULTI2ROOTS = new ParamImpl<Object>('M', 0X20000000, "NACQF_MULTI2ROOTS");

   ParamImpl<Object> M_NACQF_COIN2ROOTS = new ParamImpl<Object>('M', 0X40000000, "NACQF_COIN2ROOTS");

   ParamImpl<Object> M_NACQF_LSTMODE = new ParamImpl<Object>('M', 0X80000000, "NACQF_LSTMODE");

   ParamImpl<Object> V_NACQSF_TREJECT = new ParamImpl<Object>('V', 0X00000000, "NACQSF_TREJECT");

   ParamImpl<Object> M_NACQSF_TREJECT = new ParamImpl<Object>('M', 0X00000001, "NACQSF_TREJECT");

   ParamImpl<Object> V_NACQSF_RREJECT = new ParamImpl<Object>('V', 0X00000001, "NACQSF_RREJECT");

   ParamImpl<Object> M_NACQSF_RREJECT = new ParamImpl<Object>('M', 0X00000002, "NACQSF_RREJECT");

   ParamImpl<Object> V_NACQSF_T2GREJECT = new ParamImpl<Object>('V', 0X00000002, "NACQSF_T2GREJECT");

   ParamImpl<Object> M_NACQSF_T2GREJECT = new ParamImpl<Object>('M', 0X00000004, "NACQSF_T2GREJECT");

   ParamImpl<Object> V_NACQSF_CHKREJECT = new ParamImpl<Object>('V', 0X00000003, "NACQSF_CHKREJECT");

   ParamImpl<Object> M_NACQSF_CHKREJECT = new ParamImpl<Object>('M', 0X00000008, "NACQSF_CHKREJECT");

   ParamImpl<Object> V_NACQSF_TPLREJECT = new ParamImpl<Object>('V', 0X00000004, "NACQSF_TPLREJECT");

   ParamImpl<Object> M_NACQSF_TPLREJECT = new ParamImpl<Object>('M', 0X00000010, "NACQSF_TPLREJECT");

   ParamImpl<Object> V_NACQSF_ONESREJECT = new ParamImpl<Object>('V', 0X00000005, "NACQSF_ONESREJECT");

   ParamImpl<Object> M_NACQSF_ONESREJECT = new ParamImpl<Object>('M', 0X00000020, "NACQSF_ONESREJECT");

   ParamImpl<String> T_NEFFDETNAME = new ParamImpl<String>('T', 0X201, "NEFFDETNAME");

   ParamImpl<Date> X_NEFFCALDATE = new ParamImpl<Date>('X', 0X201, "NEFFCALDATE");

   ParamImpl<String> T_NEFFCURVEID = new ParamImpl<String>('T', 0X201, "NEFFCURVEID");

   ParamImpl<String> T_NEFFANALYST = new ParamImpl<String>('T', 0X201, "NEFFANALYST");

   ParamImpl<Float> F_NEFFMCOFF = new ParamImpl<Float>('F', 0X201, "NEFFMCOFF");

   ParamImpl<Float> F_NEFFMCOFFV = new ParamImpl<Float>('F', 0X201, "NEFFMCOFFV");

   ParamImpl<Float> F_NEFFMCSLOPE = new ParamImpl<Float>('F', 0X201, "NEFFMCSLOPE");

   ParamImpl<Float> F_NEFFMCSLOPEV = new ParamImpl<Float>('F', 0X201, "NEFFMCSLOPEV");

   ParamImpl<Float> F_NEFFMCCOVAR = new ParamImpl<Float>('F', 0X201, "NEFFMCCOVAR");

   ParamImpl<Float> F_NEFFMCRSS = new ParamImpl<Float>('F', 0X201, "NEFFMCRSS");

   ParamImpl<Float> F_NEFFNMCOFF = new ParamImpl<Float>('F', 0X201, "NEFFNMCOFF");

   ParamImpl<Float> F_NEFFNMCOFFV = new ParamImpl<Float>('F', 0X201, "NEFFNMCOFFV");

   ParamImpl<Float> F_NEFFNMCSLOPE = new ParamImpl<Float>('F', 0X201, "NEFFNMCSLOPE");

   ParamImpl<Float> F_NEFFNMCSLOPV = new ParamImpl<Float>('F', 0X201, "NEFFNMCSLOPV");

   ParamImpl<Float> F_NEFFNMCQUAD = new ParamImpl<Float>('F', 0X201, "NEFFNMCQUAD");

   ParamImpl<Float> F_NEFFNMCQUADV = new ParamImpl<Float>('F', 0X201, "NEFFNMCQUADV");

   ParamImpl<Float> F_NEFFNMCOSC = new ParamImpl<Float>('F', 0X201, "NEFFNMCOSC");

   ParamImpl<Float> F_NEFFNMCOQC = new ParamImpl<Float>('F', 0X201, "NEFFNMCOQC");

   ParamImpl<Float> F_NEFFNMCSQC = new ParamImpl<Float>('F', 0X201, "NEFFNMCSQC");

   ParamImpl<Float> F_NEFFNMCRSS = new ParamImpl<Float>('F', 0X201, "NEFFNMCRSS");

   ParamImpl<Float> F_NEFFR240EM = new ParamImpl<Float>('F', 0X201, "NEFFR240EM");

   ParamImpl<Float> F_NEFFR240EMER = new ParamImpl<Float>('F', 0X201, "NEFFR240EMER");

   ParamImpl<Float> F_NEFFRREALS = new ParamImpl<Float>('F', 0X201, "NEFFRREALS");

   ParamImpl<Float> F_NEFFRREALSER = new ParamImpl<Float>('F', 0X201, "NEFFRREALSER");

   ParamImpl<Float> F_NEFFRMCREALS = new ParamImpl<Float>('F', 0X201, "NEFFRMCREALS");

   ParamImpl<Float> F_NEFFRMCREALE = new ParamImpl<Float>('F', 0X201, "NEFFRMCREALE");

   ParamImpl<Float> F_NEFFTUWF = new ParamImpl<Float>('F', 0X201, "NEFFTUWF");

   ParamImpl<Float> F_NEFFRUWF = new ParamImpl<Float>('F', 0X201, "NEFFRUWF");

   ParamImpl<String> T_NEFFSTIDENT = new ParamImpl<String>('T', 0X201, "NEFFSTIDENT");

   ParamImpl<String> T_NEFFSTTITLE = new ParamImpl<String>('T', 0X201, "NEFFSTTITLE");

   ParamImpl<Float> F_NEFFLOWLIM = new ParamImpl<Float>('F', 0X201, "NEFFLOWLIM");

   ParamImpl<Float> F_NEFFHIGHLIM = new ParamImpl<Float>('F', 0X201, "NEFFHIGHLIM");

   ParamImpl<Float> F_NEFFMGAHFRAC = new ParamImpl<Float>('F', 0X201, "NEFFMGAHFRAC");

   ParamImpl<Float> F_NEFFRHO0 = new ParamImpl<Float>('F', 0X201, "NEFFRHO0");

   ParamImpl<Float> F_NEFFDIEAWAY = new ParamImpl<Float>('F', 0X201, "NEFFDIEAWAY");

   ParamImpl<Float> F_NEFFTNMCOFF = new ParamImpl<Float>('F', 0X201, "NEFFTNMCOFF");

   ParamImpl<Float> F_NEFFTNMCOFFV = new ParamImpl<Float>('F', 0X201, "NEFFTNMCOFFV");

   ParamImpl<Float> F_NEFFTNMCSL = new ParamImpl<Float>('F', 0X201, "NEFFTNMCSL");

   ParamImpl<Float> F_NEFFTNMCSLV = new ParamImpl<Float>('F', 0X201, "NEFFTNMCSLV");

   ParamImpl<Float> F_NEFFTNMCOSC = new ParamImpl<Float>('F', 0X201, "NEFFTNMCOSC");

   ParamImpl<Float> F_NEFFRTOTALS = new ParamImpl<Float>('F', 0X201, "NEFFRTOTALS");

   ParamImpl<Float> F_NEFFRTOTALSE = new ParamImpl<Float>('F', 0X201, "NEFFRTOTALSE");

   ParamImpl<Float> F_NEFFTNMCRSS = new ParamImpl<Float>('F', 0X201, "NEFFTNMCRSS");

   ParamImpl<Float> F_NEFFNMCCUB = new ParamImpl<Float>('F', 0X201, "NEFFNMCCUB");

   ParamImpl<Float> F_NEFFNMCCUBV = new ParamImpl<Float>('F', 0X201, "NEFFNMCCUBV");

   ParamImpl<Float> F_NEFFNMCOCC = new ParamImpl<Float>('F', 0X201, "NEFFNMCOCC");

   ParamImpl<Float> F_NEFFNMCSCC = new ParamImpl<Float>('F', 0X201, "NEFFNMCSCC");

   ParamImpl<Float> F_NEFFNMCQCC = new ParamImpl<Float>('F', 0X201, "NEFFNMCQCC");

   ParamImpl<Float> F_NEFFNMCPMAN = new ParamImpl<Float>('F', 0X201, "NEFFNMCPMAN");

   ParamImpl<Float> F_NEFFNMCPEXP = new ParamImpl<Float>('F', 0X201, "NEFFNMCPEXP");

   ParamImpl<Float> F_NEFFNMCPMANV = new ParamImpl<Float>('F', 0X201, "NEFFNMCPMANV");

   ParamImpl<Float> F_NEFFNMCPEXPV = new ParamImpl<Float>('F', 0X201, "NEFFNMCPEXPV");

   ParamImpl<Float> F_NEFFNMCPMEC = new ParamImpl<Float>('F', 0X201, "NEFFNMCPMEC");

   ParamImpl<Float> F_NEFFNMCPRSS = new ParamImpl<Float>('F', 0X201, "NEFFNMCPRSS");

   ParamImpl<Float> F_NEFFNMCEMAN = new ParamImpl<Float>('F', 0X201, "NEFFNMCEMAN");

   ParamImpl<Float> F_NEFFNMCEEXP = new ParamImpl<Float>('F', 0X201, "NEFFNMCEEXP");

   ParamImpl<Float> F_NEFFNMCEMANV = new ParamImpl<Float>('F', 0X201, "NEFFNMCEMANV");

   ParamImpl<Float> F_NEFFNMCEEXPV = new ParamImpl<Float>('F', 0X201, "NEFFNMCEEXPV");

   ParamImpl<Float> F_NEFFNMCEMEC = new ParamImpl<Float>('F', 0X201, "NEFFNMCEMEC");

   ParamImpl<Float> F_NEFFNMCERSS = new ParamImpl<Float>('F', 0X201, "NEFFNMCERSS");

   ParamImpl<Float> F_NEFFNMCRNUM = new ParamImpl<Float>('F', 0X201, "NEFFNMCRNUM");

   ParamImpl<Float> F_NEFFNMCRDEN = new ParamImpl<Float>('F', 0X201, "NEFFNMCRDEN");

   ParamImpl<Float> F_NEFFNMCRNUMV = new ParamImpl<Float>('F', 0X201, "NEFFNMCRNUMV");

   ParamImpl<Float> F_NEFFNMCRDENV = new ParamImpl<Float>('F', 0X201, "NEFFNMCRDENV");

   ParamImpl<Float> F_NEFFNMCRNDC = new ParamImpl<Float>('F', 0X201, "NEFFNMCRNDC");

   ParamImpl<Float> F_NEFFNMCRRSS = new ParamImpl<Float>('F', 0X201, "NEFFNMCRRSS");

   ParamImpl<Float> F_NEFFDETEFF = new ParamImpl<Float>('F', 0X201, "NEFFDETEFF");

   ParamImpl<Float> F_NEFFCORRFAC1 = new ParamImpl<Float>('F', 0X201, "NEFFCORRFAC1");

   ParamImpl<Float> F_NEFFCORRFAC2 = new ParamImpl<Float>('F', 0X201, "NEFFCORRFAC2");

   ParamImpl<Float> F_NEFFDETEFFER = new ParamImpl<Float>('F', 0X201, "NEFFDETEFFER");

   ParamImpl<Float> F_NEFFDETCEFF = new ParamImpl<Float>('F', 0X201, "NEFFDETCEFF");

   ParamImpl<Float> F_NEFFDETCEFER = new ParamImpl<Float>('F', 0X201, "NEFFDETCEFER");

   ParamImpl<Float> F_NEFFMMCSLOPE = new ParamImpl<Float>('F', 0X201, "NEFFMMCSLOPE");

   ParamImpl<Float> F_NEFFMMCOFF = new ParamImpl<Float>('F', 0X201, "NEFFMMCOFF");

   ParamImpl<Float> F_NEFFMMCSLOPV = new ParamImpl<Float>('F', 0X201, "NEFFMMCSLOPV");

   ParamImpl<Float> F_NEFFMMCOFFV = new ParamImpl<Float>('F', 0X201, "NEFFMMCOFFV");

   ParamImpl<Float> F_NEFFMMCCOVAR = new ParamImpl<Float>('F', 0X201, "NEFFMMCCOVAR");

   ParamImpl<Float> F_NEFFMMCRSS = new ParamImpl<Float>('F', 0X201, "NEFFMMCRSS");

   ParamImpl<Float> F_NEFFRMCDBLS = new ParamImpl<Float>('F', 0X201, "NEFFRMCDBLS");

   ParamImpl<Float> F_NEFFRMCDBLER = new ParamImpl<Float>('F', 0X201, "NEFFRMCDBLER");

   ParamImpl<Float> F_NEFFMCRCHI = new ParamImpl<Float>('F', 0X201, "NEFFMCRCHI");

   ParamImpl<Float> F_NEFFTNMRCHI = new ParamImpl<Float>('F', 0X201, "NEFFTNMRCHI");

   ParamImpl<Float> F_NEFFMMCRCHI = new ParamImpl<Float>('F', 0X201, "NEFFMMCRCHI");

   ParamImpl<Float> F_NEFFNMCRCHI = new ParamImpl<Float>('F', 0X201, "NEFFNMCRCHI");

   ParamImpl<Float> F_NEFFNMCPRCHI = new ParamImpl<Float>('F', 0X201, "NEFFNMCPRCHI");

   ParamImpl<Float> F_NEFFNMCERCHI = new ParamImpl<Float>('F', 0X201, "NEFFNMCERCHI");

   ParamImpl<Float> F_NEFFNMCRRCHI = new ParamImpl<Float>('F', 0X201, "NEFFNMCRRCHI");

   ParamImpl<Float> F_NEFFRACTMULT = new ParamImpl<Float>('F', 0X201, "NEFFRACTMULT");

   ParamImpl<Float> F_NEFFACTMULTE = new ParamImpl<Float>('F', 0X201, "NEFFACTMULTE");

   ParamImpl<Float> F_NEFFACTCPLG = new ParamImpl<Float>('F', 0X201, "NEFFACTCPLG");

   ParamImpl<Float> F_NEFFACTCPLGE = new ParamImpl<Float>('F', 0X201, "NEFFACTCPLGE");

   ParamImpl<Float> F_NEFFACTPARMA = new ParamImpl<Float>('F', 0X201, "NEFFACTPARMA");

   ParamImpl<Float> F_NEFFACTPARMB = new ParamImpl<Float>('F', 0X201, "NEFFACTPARMB");

   ParamImpl<Float> F_NEFFACTPARMC = new ParamImpl<Float>('F', 0X201, "NEFFACTPARMC");

   ParamImpl<Float> F_NEFFACTVARA = new ParamImpl<Float>('F', 0X201, "NEFFACTVARA");

   ParamImpl<Float> F_NEFFACTVARB = new ParamImpl<Float>('F', 0X201, "NEFFACTVARB");

   ParamImpl<Float> F_NEFFACTVARC = new ParamImpl<Float>('F', 0X201, "NEFFACTVARC");

   ParamImpl<Float> F_NEFFACTVARAB = new ParamImpl<Float>('F', 0X201, "NEFFACTVARAB");

   ParamImpl<Float> F_NEFFACTVARAC = new ParamImpl<Float>('F', 0X201, "NEFFACTVARAC");

   ParamImpl<Float> F_NEFFACTVARBC = new ParamImpl<Float>('F', 0X201, "NEFFACTVARBC");

   ParamImpl<Float> F_NEFFTRUNCL = new ParamImpl<Float>('F', 0X201, "NEFFTRUNCL");

   ParamImpl<Long> L_NEFFNMCORDER = new ParamImpl<Long>('L', 0X201, "NEFFNMCORDER");

   ParamImpl<Long> L_NEFFFLAGS = new ParamImpl<Long>('L', 0X201, "NEFFFLAGS");

   ParamImpl<String> T_NEFFRCNTFILE = new ParamImpl<String>('T', 0X201, "NEFFRCNTFILE");

   ParamImpl<Date> X_NEFFRCNTDATE = new ParamImpl<Date>('X', 0X201, "NEFFRCNTDATE");

   ParamImpl<String> T_NEFFCALDBR = new ParamImpl<String>('T', 0X201, "NEFFCALDBR");

   ParamImpl<Float> F_NONESPUSLP = new ParamImpl<Float>('F', 0X201, "NONESPUSLP");

   ParamImpl<Float> F_NONESZ1SLP = new ParamImpl<Float>('F', 0X201, "NONESZ1SLP");

   ParamImpl<Float> F_NONESZ2SLP = new ParamImpl<Float>('F', 0X201, "NONESZ2SLP");

   ParamImpl<Float> F_NONESPUSLPER = new ParamImpl<Float>('F', 0X201, "NONESPUSLPER");

   ParamImpl<Float> F_NONESZ1SLPER = new ParamImpl<Float>('F', 0X201, "NONESZ1SLPER");

   ParamImpl<Float> F_NONESZ2SLPER = new ParamImpl<Float>('F', 0X201, "NONESZ2SLPER");

   ParamImpl<Float> F_NEFFMMCTSLP = new ParamImpl<Float>('F', 0X201, "NEFFMMCTSLP");

   ParamImpl<Float> F_NEFFMMCTSLPV = new ParamImpl<Float>('F', 0X201, "NEFFMMCTSLPV");

   ParamImpl<Float> F_NEFFMMCDTCOV = new ParamImpl<Float>('F', 0X201, "NEFFMMCDTCOV");

   ParamImpl<Float> F_NEFFTRUNPUD = new ParamImpl<Float>('F', 0X201, "NEFFTRUNPUD");

   ParamImpl<Float> F_NEFFTRUNPUT = new ParamImpl<Float>('F', 0X201, "NEFFTRUNPUT");

   ParamImpl<Float> F_NEFFTRUNPUDE = new ParamImpl<Float>('F', 0X201, "NEFFTRUNPUDE");

   ParamImpl<Float> F_NEFFTRUNPUTE = new ParamImpl<Float>('F', 0X201, "NEFFTRUNPUTE");

   ParamImpl<Float> F_NEFFTPUDTCOV = new ParamImpl<Float>('F', 0X201, "NEFFTPUDTCOV");

   ParamImpl<Float> F_NEFFTRUNZ1D = new ParamImpl<Float>('F', 0X201, "NEFFTRUNZ1D");

   ParamImpl<Float> F_NEFFTRUNZ1T = new ParamImpl<Float>('F', 0X201, "NEFFTRUNZ1T");

   ParamImpl<Float> F_NEFFTRUNZ1DE = new ParamImpl<Float>('F', 0X201, "NEFFTRUNZ1DE");

   ParamImpl<Float> F_NEFFTRUNZ1TE = new ParamImpl<Float>('F', 0X201, "NEFFTRUNZ1TE");

   ParamImpl<Float> F_NEFFTRUNZ1CV = new ParamImpl<Float>('F', 0X201, "NEFFTRUNZ1CV");

   ParamImpl<Float> F_NEFFTRUNZ2D = new ParamImpl<Float>('F', 0X201, "NEFFTRUNZ2D");

   ParamImpl<Float> F_NEFFTRUNZ2T = new ParamImpl<Float>('F', 0X201, "NEFFTRUNZ2T");

   ParamImpl<Float> F_NEFFTRUNZ2DE = new ParamImpl<Float>('F', 0X201, "NEFFTRUNZ2DE");

   ParamImpl<Float> F_NEFFTRUNZ2TE = new ParamImpl<Float>('F', 0X201, "NEFFTRUNZ2TE");

   ParamImpl<Float> F_NEFFCMDCAL = new ParamImpl<Float>('F', 0X201, "NEFFCMDCAL");

   ParamImpl<Float> F_NEFFCMTCAL = new ParamImpl<Float>('F', 0X201, "NEFFCMTCAL");

   ParamImpl<Float> F_NEFFCMDCALER = new ParamImpl<Float>('F', 0X201, "NEFFCMDCALER");

   ParamImpl<Float> F_NEFFCMTCALER = new ParamImpl<Float>('F', 0X201, "NEFFCMTCALER");

   ParamImpl<Float> F_NEFFCMDTCOV = new ParamImpl<Float>('F', 0X201, "NEFFCMDTCOV");

   ParamImpl<Float> F_NEFFCFDCAL = new ParamImpl<Float>('F', 0X201, "NEFFCFDCAL");

   ParamImpl<Float> F_NEFFCFTCAL = new ParamImpl<Float>('F', 0X201, "NEFFCFTCAL");

   ParamImpl<Float> F_NEFFCFDCALER = new ParamImpl<Float>('F', 0X201, "NEFFCFDCALER");

   ParamImpl<Float> F_NEFFCFTCALER = new ParamImpl<Float>('F', 0X201, "NEFFCFTCALER");

   ParamImpl<Float> F_NEFFCFDTCOV = new ParamImpl<Float>('F', 0X201, "NEFFCFDTCOV");

   ParamImpl<Float> F_NEFFDDAZMMF = new ParamImpl<Float>('F', 0X201, "NEFFDDAZMMF");

   ParamImpl<Float> F_NEFFDDASAA0 = new ParamImpl<Float>('F', 0X201, "NEFFDDASAA0");

   ParamImpl<Float> F_NEFFDDASAA1 = new ParamImpl<Float>('F', 0X201, "NEFFDDASAA1");

   ParamImpl<Float> F_NEFFDDASAA2 = new ParamImpl<Float>('F', 0X201, "NEFFDDASAA2");

   ParamImpl<Float> F_NEFFDDASAA3 = new ParamImpl<Float>('F', 0X201, "NEFFDDASAA3");

   ParamImpl<Float> F_NEFFDDAZMV00 = new ParamImpl<Float>('F', 0X201, "NEFFDDAZMV00");

   ParamImpl<Float> F_NEFFDDASV00 = new ParamImpl<Float>('F', 0X201, "NEFFDDASV00");

   ParamImpl<Float> F_NEFFDDASV11 = new ParamImpl<Float>('F', 0X201, "NEFFDDASV11");

   ParamImpl<Float> F_NEFFDDASV22 = new ParamImpl<Float>('F', 0X201, "NEFFDDASV22");

   ParamImpl<Float> F_NEFFDDASV33 = new ParamImpl<Float>('F', 0X201, "NEFFDDASV33");

   ParamImpl<Float> F_NEFFDDAEQMLL = new ParamImpl<Float>('F', 0X201, "NEFFDDAEQMLL");

   ParamImpl<Float> F_NEFFDDAEQMHL = new ParamImpl<Float>('F', 0X201, "NEFFDDAEQMHL");

   ParamImpl<Float> F_NEFFMMCDSLP = new ParamImpl<Float>('F', 0X201, "NEFFMMCDSLP");

   ParamImpl<Float> F_NEFFMMCDSLPV = new ParamImpl<Float>('F', 0X201, "NEFFMMCDSLPV");

   ParamImpl<Float> F_NEFFCF1PARMA = new ParamImpl<Float>('F', 0X201, "NEFFCF1PARMA");

   ParamImpl<Float> F_NEFFCF1PARMB = new ParamImpl<Float>('F', 0X201, "NEFFCF1PARMB");

   ParamImpl<Float> F_NEFFCF1PARMC = new ParamImpl<Float>('F', 0X201, "NEFFCF1PARMC");

   ParamImpl<Float> F_NEFFCF1VARA = new ParamImpl<Float>('F', 0X201, "NEFFCF1VARA");

   ParamImpl<Float> F_NEFFCF1VARB = new ParamImpl<Float>('F', 0X201, "NEFFCF1VARB");

   ParamImpl<Float> F_NEFFCF1VARC = new ParamImpl<Float>('F', 0X201, "NEFFCF1VARC");

   ParamImpl<Float> F_NEFFCF1VARAB = new ParamImpl<Float>('F', 0X201, "NEFFCF1VARAB");

   ParamImpl<Float> F_NEFFCF1VARAC = new ParamImpl<Float>('F', 0X201, "NEFFCF1VARAC");

   ParamImpl<Float> F_NEFFCF1VARBC = new ParamImpl<Float>('F', 0X201, "NEFFCF1VARBC");

   ParamImpl<Float> F_NEFFCF2PARMA = new ParamImpl<Float>('F', 0X201, "NEFFCF2PARMA");

   ParamImpl<Float> F_NEFFCF2PARMB = new ParamImpl<Float>('F', 0X201, "NEFFCF2PARMB");

   ParamImpl<Float> F_NEFFCF2PARMC = new ParamImpl<Float>('F', 0X201, "NEFFCF2PARMC");

   ParamImpl<Float> F_NEFFCF2VARA = new ParamImpl<Float>('F', 0X201, "NEFFCF2VARA");

   ParamImpl<Float> F_NEFFCF2VARB = new ParamImpl<Float>('F', 0X201, "NEFFCF2VARB");

   ParamImpl<Float> F_NEFFCF2VARC = new ParamImpl<Float>('F', 0X201, "NEFFCF2VARC");

   ParamImpl<Float> F_NEFFCF2VARAB = new ParamImpl<Float>('F', 0X201, "NEFFCF2VARAB");

   ParamImpl<Float> F_NEFFCF2VARAC = new ParamImpl<Float>('F', 0X201, "NEFFCF2VARAC");

   ParamImpl<Float> F_NEFFCF2VARBC = new ParamImpl<Float>('F', 0X201, "NEFFCF2VARBC");

   ParamImpl<Float> F_NEFFCF1ERROR = new ParamImpl<Float>('F', 0X201, "NEFFCF1ERROR");

   ParamImpl<Float> F_NEFFCF2ERROR = new ParamImpl<Float>('F', 0X201, "NEFFCF2ERROR");

   ParamImpl<Float> F_NEFFSHFZMMF0 = new ParamImpl<Float>('F', 0X201, "NEFFSHFZMMF0");

   ParamImpl<Float> F_NEFFSHFZMV00 = new ParamImpl<Float>('F', 0X201, "NEFFSHFZMV00");

   ParamImpl<Object> V_NEFFF_FORCETHRU0 = new ParamImpl<Object>('V', 0X00000000, "NEFFF_FORCETHRU0");

   ParamImpl<Object> M_NEFFF_FORCETHRU0 = new ParamImpl<Object>('M', 0X00000001, "NEFFF_FORCETHRU0");

   ParamImpl<Object> V_NEFFF_CF = new ParamImpl<Object>('V', 0X00000001, "NEFFF_CF");

   ParamImpl<Object> M_NEFFF_CF = new ParamImpl<Object>('M', 0X00000002, "NEFFF_CF");

   ParamImpl<Object> V_NEFFF_CM = new ParamImpl<Object>('V', 0X00000002, "NEFFF_CM");

   ParamImpl<Object> M_NEFFF_CM = new ParamImpl<Object>('M', 0X00000004, "NEFFF_CM");

   ParamImpl<Object> V_NEFFF_AWAPU = new ParamImpl<Object>('V', 0X00000003, "NEFFF_AWAPU");

   ParamImpl<Object> M_NEFFF_AWAPU = new ParamImpl<Object>('M', 0X00000008, "NEFFF_AWAPU");

   ParamImpl<Object> V_NEFFF_HZZ1 = new ParamImpl<Object>('V', 0X00000004, "NEFFF_HZZ1");

   ParamImpl<Object> M_NEFFF_HZZ1 = new ParamImpl<Object>('M', 0X00000010, "NEFFF_HZZ1");

   ParamImpl<Object> V_NEFFF_HZZ2 = new ParamImpl<Object>('V', 0X00000005, "NEFFF_HZZ2");

   ParamImpl<Object> M_NEFFF_HZZ2 = new ParamImpl<Object>('M', 0X00000020, "NEFFF_HZZ2");

   ParamImpl<Object> V_NEFFF_PU = new ParamImpl<Object>('V', 0X00000006, "NEFFF_PU");

   ParamImpl<Object> M_NEFFF_PU = new ParamImpl<Object>('M', 0X00000040, "NEFFF_PU");

   ParamImpl<Object> V_NEFFF_U = new ParamImpl<Object>('V', 0X00000007, "NEFFF_U");

   ParamImpl<Object> M_NEFFF_U = new ParamImpl<Object>('M', 0X00000080, "NEFFF_U");

   ParamImpl<String> T_NDETNAME = new ParamImpl<String>('T', 0X201, "NDETNAME");

   ParamImpl<Date> X_NDETCALDATE = new ParamImpl<Date>('X', 0X201, "NDETCALDATE");

   ParamImpl<String> T_NDETANALYST = new ParamImpl<String>('T', 0X201, "NDETANALYST");

   ParamImpl<Float> F_NDETK1 = new ParamImpl<Float>('F', 0X201, "NDETK1");

   ParamImpl<Float> F_NDETK1ERR = new ParamImpl<Float>('F', 0X201, "NDETK1ERR");

   ParamImpl<Float> F_NDETDTCF1 = new ParamImpl<Float>('F', 0X201, "NDETDTCF1");

   ParamImpl<Float> F_NDETDTCF2 = new ParamImpl<Float>('F', 0X201, "NDETDTCF2");

   ParamImpl<Float> F_NDETDTCF3 = new ParamImpl<Float>('F', 0X201, "NDETDTCF3");

   ParamImpl<Float> F_NDETDTCF4 = new ParamImpl<Float>('F', 0X201, "NDETDTCF4");

   ParamImpl<Float> F_NDETENSRO0 = new ParamImpl<Float>('F', 0X201, "NDETENSRO0");

   ParamImpl<Float> F_NDETCDTHICK = new ParamImpl<Float>('F', 0X201, "NDETCDTHICK");

   ParamImpl<Float> F_NDETDIEAWAY = new ParamImpl<Float>('F', 0X201, "NDETDIEAWAY");

   ParamImpl<Float> F_NDETHICDTHK = new ParamImpl<Float>('F', 0X201, "NDETHICDTHK");

   ParamImpl<Float> F_NDETHICDCF = new ParamImpl<Float>('F', 0X201, "NDETHICDCF");

   ParamImpl<Float> F_NDETHIPBTHK = new ParamImpl<Float>('F', 0X201, "NDETHIPBTHK");

   ParamImpl<Float> F_NDETPROPK1 = new ParamImpl<Float>('F', 0X201, "NDETPROPK1");

   ParamImpl<Float> F_NDETPROPK1ER = new ParamImpl<Float>('F', 0X201, "NDETPROPK1ER");

   ParamImpl<Float> F_NDETK1DIFF = new ParamImpl<Float>('F', 0X201, "NDETK1DIFF");

   ParamImpl<Float> F_NDETMDELTA = new ParamImpl<Float>('F', 0X201, "NDETMDELTA");

   ParamImpl<Float> F_NDETMDBLDTCF = new ParamImpl<Float>('F', 0X201, "NDETMDBLDTCF");

   ParamImpl<Float> F_NDETMTPLDTCF = new ParamImpl<Float>('F', 0X201, "NDETMTPLDTCF");

   ParamImpl<Float> F_NDETMDELTAER = new ParamImpl<Float>('F', 0X201, "NDETMDELTAER");

   ParamImpl<Float> F_NDETDBLGATEF = new ParamImpl<Float>('F', 0X201, "NDETDBLGATEF");

   ParamImpl<Float> F_NDETDGATEFER = new ParamImpl<Float>('F', 0X201, "NDETDGATEFER");

   ParamImpl<Float> F_NDETTPLGATEF = new ParamImpl<Float>('F', 0X201, "NDETTPLGATEF");

   ParamImpl<Float> F_NDETTGATEFER = new ParamImpl<Float>('F', 0X201, "NDETTGATEFER");

   ParamImpl<String> T_NDCLPUMUNITS = new ParamImpl<String>('T', 0X201, "NDCLPUMUNITS");

   ParamImpl<Float> F_NDCLPUMCF = new ParamImpl<Float>('F', 0X201, "NDCLPUMCF");

   ParamImpl<Date> X_NDCLPUDATE = new ParamImpl<Date>('X', 0X201, "NDCLPUDATE");

   ParamImpl<String> T_NDCLPUSRC = new ParamImpl<String>('T', 0X201, "NDCLPUSRC");

   ParamImpl<Date> X_NDCLAMDATE = new ParamImpl<Date>('X', 0X201, "NDCLAMDATE");

   ParamImpl<String> T_NDCLAMSRC = new ParamImpl<String>('T', 0X201, "NDCLAMSRC");

   ParamImpl<Float> F_NDCLPUMASS = new ParamImpl<Float>('F', 0X201, "NDCLPUMASS");

   ParamImpl<Float> F_NDCLPUMASSER = new ParamImpl<Float>('F', 0X201, "NDCLPUMASSER");

   ParamImpl<String> T_NDCLISONAME = new ParamImpl<String>('T', 0X201, "NDCLISONAME");

   ParamImpl<Float> F_NDCLWEIGHT = new ParamImpl<Float>('F', 0X201, "NDCLWEIGHT");

   ParamImpl<Float> F_NDCLWEIGHTER = new ParamImpl<Float>('F', 0X201, "NDCLWEIGHTER");

   ParamImpl<String> T_NDCLTITLE = new ParamImpl<String>('T', 0X201, "NDCLTITLE");

   ParamImpl<Date> X_NDCLPUMDATE = new ParamImpl<Date>('X', 0X201, "NDCLPUMDATE");

   ParamImpl<Float> F_NDCLDCPUM = new ParamImpl<Float>('F', 0X201, "NDCLDCPUM");

   ParamImpl<Float> F_NDCLDCPUMERR = new ParamImpl<Float>('F', 0X201, "NDCLDCPUMERR");

   ParamImpl<Float> F_NDCLDCWEIGHT = new ParamImpl<Float>('F', 0X201, "NDCLDCWEIGHT");

   ParamImpl<Float> F_NDCLDCWTERR = new ParamImpl<Float>('F', 0X201, "NDCLDCWTERR");

   ParamImpl<Date> X_NDCLR2CSTIME = new ParamImpl<Date>('X', 0X201, "NDCLR2CSTIME");

   ParamImpl<String> T_NDCLIDENT = new ParamImpl<String>('T', 0X201, "NDCLIDENT");

   ParamImpl<Float> F_NDCLTREALS = new ParamImpl<Float>('F', 0X201, "NDCLTREALS");

   ParamImpl<Float> F_NDCLWGTFCTR = new ParamImpl<Float>('F', 0X201, "NDCLWGTFCTR");

   ParamImpl<String> T_NDCLSTYPE = new ParamImpl<String>('T', 0X201, "NDCLSTYPE");

   ParamImpl<Float> F_NDCLTREALSER = new ParamImpl<Float>('F', 0X201, "NDCLTREALSER");

   ParamImpl<Float> F_NDCLREFV = new ParamImpl<Float>('F', 0X201, "NDCLREFV");

   ParamImpl<Float> F_NDCLPRWEIGHT = new ParamImpl<Float>('F', 0X201, "NDCLPRWEIGHT");

   ParamImpl<Float> F_NDCLPRWTERR = new ParamImpl<Float>('F', 0X201, "NDCLPRWTERR");

   ParamImpl<Float> F_NDCLPRPUM = new ParamImpl<Float>('F', 0X201, "NDCLPRPUM");

   ParamImpl<Float> F_NDCLPRPUMERR = new ParamImpl<Float>('F', 0X201, "NDCLPRPUMERR");

   ParamImpl<Float> F_NDCLTDBL = new ParamImpl<Float>('F', 0X201, "NDCLTDBL");

   ParamImpl<Float> F_NDCLTDBLER = new ParamImpl<Float>('F', 0X201, "NDCLTDBLER");

   ParamImpl<String> T_NDCLNAME = new ParamImpl<String>('T', 0X201, "NDCLNAME");

   ParamImpl<Long> L_NDCLTYPE = new ParamImpl<Long>('L', 0X201, "NDCLTYPE");

   ParamImpl<Date> X_NDCLUDATE = new ParamImpl<Date>('X', 0X201, "NDCLUDATE");

   ParamImpl<Date> X_NDCLOIDATE = new ParamImpl<Date>('X', 0X201, "NDCLOIDATE");

   ParamImpl<Long> L_NDCLFLAGS = new ParamImpl<Long>('L', 0X201, "NDCLFLAGS");

   ParamImpl<Long> L_NDCLFVCISOOK = new ParamImpl<Long>('L', 0X201, "NDCLFVCISOOK");

   ParamImpl<Long> L_NDCLFVCISONG = new ParamImpl<Long>('L', 0X201, "NDCLFVCISONG");

   ParamImpl<Long> L_NDCLFCFPRES = new ParamImpl<Long>('L', 0X201, "NDCLFCFPRES");

   ParamImpl<Long> L_NDCLFCMPRES = new ParamImpl<Long>('L', 0X201, "NDCLFCMPRES");

   ParamImpl<Float> F_NDCLUMASS = new ParamImpl<Float>('F', 0X201, "NDCLUMASS");

   ParamImpl<Float> F_NDCLUMASSERR = new ParamImpl<Float>('F', 0X201, "NDCLUMASSERR");

   ParamImpl<Float> F_NDCLPOISFRAC = new ParamImpl<Float>('F', 0X201, "NDCLPOISFRAC");

   ParamImpl<Float> F_NDCLPOISFRER = new ParamImpl<Float>('F', 0X201, "NDCLPOISFRER");

   ParamImpl<Long> L_NDCLFUELRODS = new ParamImpl<Long>('L', 0X201, "NDCLFUELRODS");

   ParamImpl<Long> L_NDCLPOISRODS = new ParamImpl<Long>('L', 0X201, "NDCLPOISRODS");

   ParamImpl<Object> M_NDCLF_ISOOK = new ParamImpl<Object>('M', 0X00000001, "NDCLF_ISOOK");

   ParamImpl<Object> M_NDCLF_ISONG = new ParamImpl<Object>('M', 0X00000002, "NDCLF_ISONG");

   ParamImpl<Object> M_NDCLF_CFPRES = new ParamImpl<Object>('M', 0X00000004, "NDCLF_CFPRES");

   ParamImpl<Object> M_NDCLF_CMPRES = new ParamImpl<Object>('M', 0X00000008, "NDCLF_CMPRES");

   ParamImpl<Object> M_NDCLF_DECAYDONE = new ParamImpl<Object>('M', 0X00000010, "NDCLF_DECAYDONE");

   ParamImpl<String> T_NSPRTITLE = new ParamImpl<String>('T', 0X201, "NSPRTITLE");

   ParamImpl<String> T_NSPRIDENT = new ParamImpl<String>('T', 0X201, "NSPRIDENT");

   ParamImpl<Float> F_NSPRAPU238MF = new ParamImpl<Float>('F', 0X201, "NSPRAPU238MF");

   ParamImpl<Float> F_NSPRAPU239MF = new ParamImpl<Float>('F', 0X201, "NSPRAPU239MF");

   ParamImpl<Float> F_NSPRAPU240MF = new ParamImpl<Float>('F', 0X201, "NSPRAPU240MF");

   ParamImpl<Float> F_NSPRAPU241MF = new ParamImpl<Float>('F', 0X201, "NSPRAPU241MF");

   ParamImpl<Float> F_NSPRAPU242MF = new ParamImpl<Float>('F', 0X201, "NSPRAPU242MF");

   ParamImpl<Float> F_NSPRAAM241MF = new ParamImpl<Float>('F', 0X201, "NSPRAAM241MF");

   ParamImpl<Float> F_NSPRADENFAC = new ParamImpl<Float>('F', 0X201, "NSPRADENFAC");

   ParamImpl<Float> F_NSPRSPU238MF = new ParamImpl<Float>('F', 0X201, "NSPRSPU238MF");

   ParamImpl<Float> F_NSPRSPU240MF = new ParamImpl<Float>('F', 0X201, "NSPRSPU240MF");

   ParamImpl<Float> F_NSPRSPU242MF = new ParamImpl<Float>('F', 0X201, "NSPRSPU242MF");

   ParamImpl<Float> F_NSPRCFRTRAT = new ParamImpl<Float>('F', 0X201, "NSPRCFRTRAT");

   ParamImpl<Float> F_NSPRAPU238DF = new ParamImpl<Float>('F', 0X201, "NSPRAPU238DF");

   ParamImpl<Float> F_NSPRAPU240DF = new ParamImpl<Float>('F', 0X201, "NSPRAPU240DF");

   ParamImpl<Float> F_NSPRAPU242DF = new ParamImpl<Float>('F', 0X201, "NSPRAPU242DF");

   ParamImpl<Float> F_NSPRENSNMF = new ParamImpl<Float>('F', 0X201, "NSPRENSNMF");

   ParamImpl<Float> F_NSPRENSRTC = new ParamImpl<Float>('F', 0X201, "NSPRENSRTC");

   ParamImpl<Float> F_NSPRWA = new ParamImpl<Float>('F', 0X201, "NSPRWA");

   ParamImpl<Float> F_NSPRPUTHICK = new ParamImpl<Float>('F', 0X201, "NSPRPUTHICK");

   ParamImpl<Long> L_NSPRFLAGS = new ParamImpl<Long>('L', 0X201, "NSPRFLAGS");

   ParamImpl<Long> L_NSPRFUPRES = new ParamImpl<Long>('L', 0X201, "NSPRFUPRES");

   ParamImpl<Float> F_NSPRMGASTEEL = new ParamImpl<Float>('F', 0X201, "NSPRMGASTEEL");

   ParamImpl<Float> F_NSPRMGAPB = new ParamImpl<Float>('F', 0X201, "NSPRMGAPB");

   ParamImpl<Float> F_NSPRMGA242C0 = new ParamImpl<Float>('F', 0X201, "NSPRMGA242C0");

   ParamImpl<Float> F_NSPRMGA242C1 = new ParamImpl<Float>('F', 0X201, "NSPRMGA242C1");

   ParamImpl<Float> F_NSPRMGA242C2 = new ParamImpl<Float>('F', 0X201, "NSPRMGA242C2");

   ParamImpl<Float> F_NSPRMGA242C3 = new ParamImpl<Float>('F', 0X201, "NSPRMGA242C3");

   ParamImpl<Float> F_NSPRMGA242C4 = new ParamImpl<Float>('F', 0X201, "NSPRMGA242C4");

   ParamImpl<Float> F_NSPRMGA242C5 = new ParamImpl<Float>('F', 0X201, "NSPRMGA242C5");

   ParamImpl<Float> F_NSPRMGA242C6 = new ParamImpl<Float>('F', 0X201, "NSPRMGA242C6");

   ParamImpl<Float> F_NSPRMGA242C7 = new ParamImpl<Float>('F', 0X201, "NSPRMGA242C7");

   ParamImpl<Float> F_NSPRMGA242C8 = new ParamImpl<Float>('F', 0X201, "NSPRMGA242C8");

   ParamImpl<Float> F_NSPRMGA242C9 = new ParamImpl<Float>('F', 0X201, "NSPRMGA242C9");

   ParamImpl<Float> F_NSPSMOMENT1 = new ParamImpl<Float>('F', 0X201, "NSPSMOMENT1");

   ParamImpl<Float> F_NSPSMOMENT2 = new ParamImpl<Float>('F', 0X201, "NSPSMOMENT2");

   ParamImpl<Float> F_NSPSMOMENT3 = new ParamImpl<Float>('F', 0X201, "NSPSMOMENT3");

   ParamImpl<Float> F_NSPIMOMENT1 = new ParamImpl<Float>('F', 0X201, "NSPIMOMENT1");

   ParamImpl<Float> F_NSPIMOMENT2 = new ParamImpl<Float>('F', 0X201, "NSPIMOMENT2");

   ParamImpl<Float> F_NSPIMOMENT3 = new ParamImpl<Float>('F', 0X201, "NSPIMOMENT3");

   ParamImpl<Float> F_NSPPU240FR = new ParamImpl<Float>('F', 0X201, "NSPPU240FR");

   ParamImpl<Float> F_NSPSRCYEILD = new ParamImpl<Float>('F', 0X201, "NSPSRCYEILD");

   ParamImpl<Float> F_NSPCOUPLING = new ParamImpl<Float>('F', 0X201, "NSPCOUPLING");

   ParamImpl<Float> F_NSPK3PCFA = new ParamImpl<Float>('F', 0X201, "NSPK3PCFA");

   ParamImpl<Float> F_NSPK3PCFAERR = new ParamImpl<Float>('F', 0X201, "NSPK3PCFAERR");

   ParamImpl<Float> F_NSPK3PCFB = new ParamImpl<Float>('F', 0X201, "NSPK3PCFB");

   ParamImpl<Float> F_NSPK3PCFBERR = new ParamImpl<Float>('F', 0X201, "NSPK3PCFBERR");

   ParamImpl<Float> F_NSPK3PCFC = new ParamImpl<Float>('F', 0X201, "NSPK3PCFC");

   ParamImpl<Float> F_NSPK3PCFCERR = new ParamImpl<Float>('F', 0X201, "NSPK3PCFCERR");

   ParamImpl<Float> F_NSPK4HMFA = new ParamImpl<Float>('F', 0X201, "NSPK4HMFA");

   ParamImpl<Float> F_NSPK4HMFAERR = new ParamImpl<Float>('F', 0X201, "NSPK4HMFAERR");

   ParamImpl<Float> F_NSPK4HMFB = new ParamImpl<Float>('F', 0X201, "NSPK4HMFB");

   ParamImpl<Float> F_NSPK4HMFBERR = new ParamImpl<Float>('F', 0X201, "NSPK4HMFBERR");

   ParamImpl<Float> F_NSPK5MCFA = new ParamImpl<Float>('F', 0X201, "NSPK5MCFA");

   ParamImpl<Float> F_NSPK5MCFAERR = new ParamImpl<Float>('F', 0X201, "NSPK5MCFAERR");

   ParamImpl<Float> F_NSPPSVFA = new ParamImpl<Float>('F', 0X201, "NSPPSVFA");

   ParamImpl<Float> F_NSPPSVFAERR = new ParamImpl<Float>('F', 0X201, "NSPPSVFAERR");

   ParamImpl<Float> F_NSPPSVFB = new ParamImpl<Float>('F', 0X201, "NSPPSVFB");

   ParamImpl<Float> F_NSPPSVFBERR = new ParamImpl<Float>('F', 0X201, "NSPPSVFBERR");

   ParamImpl<Float> F_NSPPSVFC = new ParamImpl<Float>('F', 0X201, "NSPPSVFC");

   ParamImpl<Float> F_NSPPSVFCERR = new ParamImpl<Float>('F', 0X201, "NSPPSVFCERR");

   ParamImpl<Float> F_NSPPSVFD = new ParamImpl<Float>('F', 0X201, "NSPPSVFD");

   ParamImpl<Float> F_NSPPSVFDERR = new ParamImpl<Float>('F', 0X201, "NSPPSVFDERR");

   ParamImpl<Long> L_NSPACTVMODE = new ParamImpl<Long>('L', 0X201, "NSPACTVMODE");

   ParamImpl<Float> F_NSPCRFAC = new ParamImpl<Float>('F', 0X201, "NSPCRFAC");

   ParamImpl<Float> F_NSPCRFACERR = new ParamImpl<Float>('F', 0X201, "NSPCRFACERR");

   ParamImpl<Date> X_NSPCRFACDATE = new ParamImpl<Date>('X', 0X201, "NSPCRFACDATE");

   ParamImpl<String> T_NSPRNAME = new ParamImpl<String>('T', 0X201, "NSPRNAME");

   ParamImpl<Long> L_NSPRGROUP = new ParamImpl<Long>('L', 0X201, "NSPRGROUP");

   ParamImpl<Float> F_NSPRDDAMIA0 = new ParamImpl<Float>('F', 0X201, "NSPRDDAMIA0");

   ParamImpl<Float> F_NSPRDDAMIA1 = new ParamImpl<Float>('F', 0X201, "NSPRDDAMIA1");

   ParamImpl<Float> F_NSPRDDAMIA2 = new ParamImpl<Float>('F', 0X201, "NSPRDDAMIA2");

   ParamImpl<Float> F_NSPRDDAMIA3 = new ParamImpl<Float>('F', 0X201, "NSPRDDAMIA3");

   ParamImpl<Float> F_NSPRDDAMCFA0 = new ParamImpl<Float>('F', 0X201, "NSPRDDAMCFA0");

   ParamImpl<Float> F_NSPRDDAMCFA1 = new ParamImpl<Float>('F', 0X201, "NSPRDDAMCFA1");

   ParamImpl<Float> F_NSPRDDAACFA0 = new ParamImpl<Float>('F', 0X201, "NSPRDDAACFA0");

   ParamImpl<Float> F_NSPRDDAACFA1 = new ParamImpl<Float>('F', 0X201, "NSPRDDAACFA1");

   ParamImpl<Float> F_NSPRDDABKGSF = new ParamImpl<Float>('F', 0X201, "NSPRDDABKGSF");

   ParamImpl<Float> F_NSPRDDAIBKA0 = new ParamImpl<Float>('F', 0X201, "NSPRDDAIBKA0");

   ParamImpl<Float> F_NSPRDDAIBKA1 = new ParamImpl<Float>('F', 0X201, "NSPRDDAIBKA1");

   ParamImpl<Float> F_NSPRDDAEQBA0 = new ParamImpl<Float>('F', 0X201, "NSPRDDAEQBA0");

   ParamImpl<Float> F_NSPRDDAEQBA1 = new ParamImpl<Float>('F', 0X201, "NSPRDDAEQBA1");

   ParamImpl<Float> F_NSPRDDAMIV00 = new ParamImpl<Float>('F', 0X201, "NSPRDDAMIV00");

   ParamImpl<Float> F_NSPRDDAMIV11 = new ParamImpl<Float>('F', 0X201, "NSPRDDAMIV11");

   ParamImpl<Float> F_NSPRDDAMIV22 = new ParamImpl<Float>('F', 0X201, "NSPRDDAMIV22");

   ParamImpl<Float> F_NSPRDDAMIV33 = new ParamImpl<Float>('F', 0X201, "NSPRDDAMIV33");

   ParamImpl<Float> F_NSPRDDAMIV01 = new ParamImpl<Float>('F', 0X201, "NSPRDDAMIV01");

   ParamImpl<Float> F_NSPRDDAMIV02 = new ParamImpl<Float>('F', 0X201, "NSPRDDAMIV02");

   ParamImpl<Float> F_NSPRDDAMIV03 = new ParamImpl<Float>('F', 0X201, "NSPRDDAMIV03");

   ParamImpl<Float> F_NSPRDDAMIV12 = new ParamImpl<Float>('F', 0X201, "NSPRDDAMIV12");

   ParamImpl<Float> F_NSPRDDAMIV13 = new ParamImpl<Float>('F', 0X201, "NSPRDDAMIV13");

   ParamImpl<Float> F_NSPRDDAMIV23 = new ParamImpl<Float>('F', 0X201, "NSPRDDAMIV23");

   ParamImpl<Float> F_NSPRDDAMCV00 = new ParamImpl<Float>('F', 0X201, "NSPRDDAMCV00");

   ParamImpl<Float> F_NSPRDDAMCV11 = new ParamImpl<Float>('F', 0X201, "NSPRDDAMCV11");

   ParamImpl<Float> F_NSPRDDAMCV01 = new ParamImpl<Float>('F', 0X201, "NSPRDDAMCV01");

   ParamImpl<Float> F_NSPRDDAACV00 = new ParamImpl<Float>('F', 0X201, "NSPRDDAACV00");

   ParamImpl<Float> F_NSPRDDAACV11 = new ParamImpl<Float>('F', 0X201, "NSPRDDAACV11");

   ParamImpl<Float> F_NSPRDDAACV01 = new ParamImpl<Float>('F', 0X201, "NSPRDDAACV01");

   ParamImpl<Float> F_NSPRDDAIBV00 = new ParamImpl<Float>('F', 0X201, "NSPRDDAIBV00");

   ParamImpl<Float> F_NSPRDDAIBV11 = new ParamImpl<Float>('F', 0X201, "NSPRDDAIBV11");

   ParamImpl<Float> F_NSPRDDAIBV01 = new ParamImpl<Float>('F', 0X201, "NSPRDDAIBV01");

   ParamImpl<Float> F_NSPRDDAMBV00 = new ParamImpl<Float>('F', 0X201, "NSPRDDAMBV00");

   ParamImpl<Float> F_NSPRDDAMBV11 = new ParamImpl<Float>('F', 0X201, "NSPRDDAMBV11");

   ParamImpl<Float> F_NSPRDDAMBV22 = new ParamImpl<Float>('F', 0X201, "NSPRDDAMBV22");

   ParamImpl<Float> F_NSPRDDAEQBA2 = new ParamImpl<Float>('F', 0X201, "NSPRDDAEQBA2");

   ParamImpl<String> T_NSPRPOISDESC = new ParamImpl<String>('T', 0X201, "NSPRPOISDESC");

   ParamImpl<Float> F_NSPRPOISAFAC = new ParamImpl<Float>('F', 0X201, "NSPRPOISAFAC");

   ParamImpl<Long> L_NSPRFUELRODS = new ParamImpl<Long>('L', 0X201, "NSPRFUELRODS");

   ParamImpl<Float> F_NSPRDDAIBKA2 = new ParamImpl<Float>('F', 0X201, "NSPRDDAIBKA2");

   ParamImpl<Float> F_NSPRDDAIBKA3 = new ParamImpl<Float>('F', 0X201, "NSPRDDAIBKA3");

   ParamImpl<Float> F_NSPRDDAIBV22 = new ParamImpl<Float>('F', 0X201, "NSPRDDAIBV22");

   ParamImpl<Float> F_NSPRDDAIBV33 = new ParamImpl<Float>('F', 0X201, "NSPRDDAIBV33");

   ParamImpl<Float> F_NSPRDDAIBV02 = new ParamImpl<Float>('F', 0X201, "NSPRDDAIBV02");

   ParamImpl<Float> F_NSPRDDAIBV03 = new ParamImpl<Float>('F', 0X201, "NSPRDDAIBV03");

   ParamImpl<Float> F_NSPRDDAIBV12 = new ParamImpl<Float>('F', 0X201, "NSPRDDAIBV12");

   ParamImpl<Float> F_NSPRDDAIBV13 = new ParamImpl<Float>('F', 0X201, "NSPRDDAIBV13");

   ParamImpl<Float> F_NSPRDDAIBV23 = new ParamImpl<Float>('F', 0X201, "NSPRDDAIBV23");

   ParamImpl<Float> F_NSPRDDAIBKX1 = new ParamImpl<Float>('F', 0X201, "NSPRDDAIBKX1");

   ParamImpl<Float> F_NSPRDDAIBKX2 = new ParamImpl<Float>('F', 0X201, "NSPRDDAIBKX2");

   ParamImpl<Long> L_NSPRDDAIBKMO = new ParamImpl<Long>('L', 0X201, "NSPRDDAIBKMO");

   ParamImpl<Float> F_NSPRSHFMCFA0 = new ParamImpl<Float>('F', 0X201, "NSPRSHFMCFA0");

   ParamImpl<Float> F_NSPRSHFMCFA1 = new ParamImpl<Float>('F', 0X201, "NSPRSHFMCFA1");

   ParamImpl<Float> F_NSPRSHFMCFA2 = new ParamImpl<Float>('F', 0X201, "NSPRSHFMCFA2");

   ParamImpl<Float> F_NSPRSHFMCFA3 = new ParamImpl<Float>('F', 0X201, "NSPRSHFMCFA3");

   ParamImpl<Float> F_NSPRSHFMCFA4 = new ParamImpl<Float>('F', 0X201, "NSPRSHFMCFA4");

   ParamImpl<Float> F_NSPRSHFMCFA5 = new ParamImpl<Float>('F', 0X201, "NSPRSHFMCFA5");

   ParamImpl<Float> F_NSPRSHFMCV00 = new ParamImpl<Float>('F', 0X201, "NSPRSHFMCV00");

   ParamImpl<Float> F_NSPRSHFMCV11 = new ParamImpl<Float>('F', 0X201, "NSPRSHFMCV11");

   ParamImpl<Float> F_NSPRSHFMCV22 = new ParamImpl<Float>('F', 0X201, "NSPRSHFMCV22");

   ParamImpl<Float> F_NSPRSHFMCV33 = new ParamImpl<Float>('F', 0X201, "NSPRSHFMCV33");

   ParamImpl<Float> F_NSPRSHFMCV44 = new ParamImpl<Float>('F', 0X201, "NSPRSHFMCV44");

   ParamImpl<Float> F_NSPRSHFMCV55 = new ParamImpl<Float>('F', 0X201, "NSPRSHFMCV55");

   ParamImpl<Float> F_NSPRSHFMCV01 = new ParamImpl<Float>('F', 0X201, "NSPRSHFMCV01");

   ParamImpl<Float> F_NSPRSHFMCV02 = new ParamImpl<Float>('F', 0X201, "NSPRSHFMCV02");

   ParamImpl<Float> F_NSPRSHFMCV03 = new ParamImpl<Float>('F', 0X201, "NSPRSHFMCV03");

   ParamImpl<Float> F_NSPRSHFMCV04 = new ParamImpl<Float>('F', 0X201, "NSPRSHFMCV04");

   ParamImpl<Float> F_NSPRSHFMCV05 = new ParamImpl<Float>('F', 0X201, "NSPRSHFMCV05");

   ParamImpl<Float> F_NSPRSHFMCV12 = new ParamImpl<Float>('F', 0X201, "NSPRSHFMCV12");

   ParamImpl<Float> F_NSPRSHFMCV13 = new ParamImpl<Float>('F', 0X201, "NSPRSHFMCV13");

   ParamImpl<Float> F_NSPRSHFMCV14 = new ParamImpl<Float>('F', 0X201, "NSPRSHFMCV14");

   ParamImpl<Float> F_NSPRSHFMCV15 = new ParamImpl<Float>('F', 0X201, "NSPRSHFMCV15");

   ParamImpl<Float> F_NSPRSHFMCV23 = new ParamImpl<Float>('F', 0X201, "NSPRSHFMCV23");

   ParamImpl<Float> F_NSPRSHFMCV24 = new ParamImpl<Float>('F', 0X201, "NSPRSHFMCV24");

   ParamImpl<Float> F_NSPRSHFMCV25 = new ParamImpl<Float>('F', 0X201, "NSPRSHFMCV25");

   ParamImpl<Float> F_NSPRSHFMCV34 = new ParamImpl<Float>('F', 0X201, "NSPRSHFMCV34");

   ParamImpl<Float> F_NSPRSHFMCV35 = new ParamImpl<Float>('F', 0X201, "NSPRSHFMCV35");

   ParamImpl<Float> F_NSPRSHFMCV45 = new ParamImpl<Float>('F', 0X201, "NSPRSHFMCV45");

   ParamImpl<Float> F_NSPRSHFRMAX = new ParamImpl<Float>('F', 0X201, "NSPRSHFRMAX");

   ParamImpl<Float> F_NSPRSHFRMIN = new ParamImpl<Float>('F', 0X201, "NSPRSHFRMIN");

   ParamImpl<Float> F_NSPRSHFGCFA0 = new ParamImpl<Float>('F', 0X201, "NSPRSHFGCFA0");

   ParamImpl<Float> F_NSPRSHFGCFA1 = new ParamImpl<Float>('F', 0X201, "NSPRSHFGCFA1");

   ParamImpl<Float> F_NSPRSHFGCFA2 = new ParamImpl<Float>('F', 0X201, "NSPRSHFGCFA2");

   ParamImpl<Float> F_NSPRSHFGCV00 = new ParamImpl<Float>('F', 0X201, "NSPRSHFGCV00");

   ParamImpl<Float> F_NSPRSHFGCV11 = new ParamImpl<Float>('F', 0X201, "NSPRSHFGCV11");

   ParamImpl<Float> F_NSPRSHFGCV22 = new ParamImpl<Float>('F', 0X201, "NSPRSHFGCV22");

   ParamImpl<Float> F_NSPRSHFGCV01 = new ParamImpl<Float>('F', 0X201, "NSPRSHFGCV01");

   ParamImpl<Float> F_NSPRSHFGCV02 = new ParamImpl<Float>('F', 0X201, "NSPRSHFGCV02");

   ParamImpl<Float> F_NSPRSHFGCV12 = new ParamImpl<Float>('F', 0X201, "NSPRSHFGCV12");

   ParamImpl<Float> F_NSPRSHFRMAXE = new ParamImpl<Float>('F', 0X201, "NSPRSHFRMAXE");

   ParamImpl<Float> F_NSPRSHFRMINE = new ParamImpl<Float>('F', 0X201, "NSPRSHFRMINE");

   ParamImpl<Object> V_NSPRF_UPRES = new ParamImpl<Object>('V', 0X00000000, "NSPRF_UPRES");

   ParamImpl<Object> M_NSPRF_UPRES = new ParamImpl<Object>('M', 0X00000001, "NSPRF_UPRES");

   ParamImpl<Object> V_NSPRF_THERMAL = new ParamImpl<Object>('V', 0X00000000, "NSPRF_THERMAL");

   ParamImpl<Object> M_NSPRF_THERMAL = new ParamImpl<Object>('M', 0X00000001, "NSPRF_THERMAL");

   ParamImpl<Date> X_ACCCALTIME = new ParamImpl<Date>('X', 0X20200002, "ACCCALTIME");

   ParamImpl<String> T_ACCOPNAME = new ParamImpl<String>('T', 0X20200003, "ACCOPNAME");

   ParamImpl<String> T_ACCTITLE = new ParamImpl<String>('T', 0X20200004, "ACCTITLE");

   ParamImpl<String> T_ACCVERSION = new ParamImpl<String>('T', 0X20200005, "ACCVERSION");

   ParamImpl<Long> L_ACCDEGREE = new ParamImpl<Long>('L', 0X20200006, "ACCDEGREE");

   ParamImpl<Float> F_ACCCHISQ = new ParamImpl<Float>('F', 0X20200007, "ACCCHISQ");

   ParamImpl<Float> F_ACCCALFAC1 = new ParamImpl<Float>('F', 0X20200008, "ACCCALFAC1");

   ParamImpl<Float> F_ACCCALFAC2 = new ParamImpl<Float>('F', 0X20200009, "ACCCALFAC2");

   ParamImpl<Float> F_ACCCALFAC3 = new ParamImpl<Float>('F', 0X2020000, "ACCCALFAC3");

   ParamImpl<Float> F_ACCCALFAC4 = new ParamImpl<Float>('F', 0X2020000, "ACCCALFAC4");

   ParamImpl<Float> F_ACCCALFAC5 = new ParamImpl<Float>('F', 0X2020000, "ACCCALFAC5");

   ParamImpl<Float> F_ACCCALFAC6 = new ParamImpl<Float>('F', 0X2020000, "ACCCALFAC6");

   ParamImpl<Float> F_ACCCALFAC7 = new ParamImpl<Float>('F', 0X2020000, "ACCCALFAC7");

   ParamImpl<Float> F_ACCCALFAC8 = new ParamImpl<Float>('F', 0X2020000, "ACCCALFAC8");

   ParamImpl<Float> F_ACCCALFAC9 = new ParamImpl<Float>('F', 0X20200010, "ACCCALFAC9");

   ParamImpl<Float> F_ACCCALFAC10 = new ParamImpl<Float>('F', 0X20200011, "ACCCALFAC10");

   ParamImpl<Object> G_ACCERRMAT1 = new ParamImpl<Object>('G', 0X20200012, "ACCERRMAT1");

   ParamImpl<Object> G_ACCERRMAT2 = new ParamImpl<Object>('G', 0X20200013, "ACCERRMAT2");

   ParamImpl<Object> G_ACCERRMAT3 = new ParamImpl<Object>('G', 0X20200014, "ACCERRMAT3");

   ParamImpl<Object> G_ACCERRMAT4 = new ParamImpl<Object>('G', 0X20200015, "ACCERRMAT4");

   ParamImpl<Object> G_ACCERRMAT5 = new ParamImpl<Object>('G', 0X20200016, "ACCERRMAT5");

   ParamImpl<Object> G_ACCERRMAT6 = new ParamImpl<Object>('G', 0X20200017, "ACCERRMAT6");

   ParamImpl<Object> G_ACCERRMAT7 = new ParamImpl<Object>('G', 0X20200018, "ACCERRMAT7");

   ParamImpl<Object> G_ACCERRMAT8 = new ParamImpl<Object>('G', 0X20200019, "ACCERRMAT8");

   ParamImpl<Object> G_ACCERRMAT9 = new ParamImpl<Object>('G', 0X2020001, "ACCERRMAT9");

   ParamImpl<Object> G_ACCERRMAT10 = new ParamImpl<Object>('G', 0X2020001, "ACCERRMAT10");

   ParamImpl<Object> G_ACCERRMAT11 = new ParamImpl<Object>('G', 0X2020001, "ACCERRMAT11");

   ParamImpl<Object> G_ACCERRMAT12 = new ParamImpl<Object>('G', 0X2020001, "ACCERRMAT12");

   ParamImpl<Object> G_ACCERRMAT13 = new ParamImpl<Object>('G', 0X2020001, "ACCERRMAT13");

   ParamImpl<Object> G_ACCERRMAT14 = new ParamImpl<Object>('G', 0X2020001, "ACCERRMAT14");

   ParamImpl<Object> G_ACCERRMAT15 = new ParamImpl<Object>('G', 0X20200020, "ACCERRMAT15");

   ParamImpl<Object> G_ACCERRMAT16 = new ParamImpl<Object>('G', 0X20200021, "ACCERRMAT16");

   ParamImpl<Object> G_ACCERRMAT17 = new ParamImpl<Object>('G', 0X20200022, "ACCERRMAT17");

   ParamImpl<Object> G_ACCERRMAT18 = new ParamImpl<Object>('G', 0X20200023, "ACCERRMAT18");

   ParamImpl<Object> G_ACCERRMAT19 = new ParamImpl<Object>('G', 0X20200024, "ACCERRMAT19");

   ParamImpl<Float> F_ACCENERGY = new ParamImpl<Float>('F', 0X20200025, "ACCENERGY");

   ParamImpl<Float> F_ACCMU = new ParamImpl<Float>('F', 0X20200026, "ACCMU");

   ParamImpl<Float> F_ACCMUERR = new ParamImpl<Float>('F', 0X20200027, "ACCMUERR");

   ParamImpl<Long> L_AMRFLAGS = new ParamImpl<Long>('L', 0X20210002, "AMRFLAGS");

   ParamImpl<String> T_AMRDPVERS = new ParamImpl<String>('T', 0X20210003, "AMRDPVERS");

   ParamImpl<String> T_AMRTRVERS = new ParamImpl<String>('T', 0X20210004, "AMRTRVERS");

   ParamImpl<String> T_AMRADVERS = new ParamImpl<String>('T', 0X20210005, "AMRADVERS");

   ParamImpl<String> T_AMRCMVERS = new ParamImpl<String>('T', 0X20210006, "AMRCMVERS");

   ParamImpl<Date> X_AMRCALTIME = new ParamImpl<Date>('X', 0X20210007, "AMRCALTIME");

   ParamImpl<String> T_AMROPNAME = new ParamImpl<String>('T', 0X20210008, "AMROPNAME");

   ParamImpl<Float> F_AMRSEG1CFAC = new ParamImpl<Float>('F', 0X20210009, "AMRSEG1CFAC");

   ParamImpl<Float> F_AMRSEG2CFAC = new ParamImpl<Float>('F', 0X2021000, "AMRSEG2CFAC");

   ParamImpl<Float> F_AMRSEG3CFAC = new ParamImpl<Float>('F', 0X2021000, "AMRSEG3CFAC");

   ParamImpl<Float> F_AMRSEG4CFAC = new ParamImpl<Float>('F', 0X2021000, "AMRSEG4CFAC");

   ParamImpl<Float> F_AMRSEG5CFAC = new ParamImpl<Float>('F', 0X2021000, "AMRSEG5CFAC");

   ParamImpl<Float> F_AMRSEG6CFAC = new ParamImpl<Float>('F', 0X2021000, "AMRSEG6CFAC");

   ParamImpl<Float> F_AMRSEG7CFAC = new ParamImpl<Float>('F', 0X2021000, "AMRSEG7CFAC");

   ParamImpl<Float> F_AMRSEG8CFAC = new ParamImpl<Float>('F', 0X20210010, "AMRSEG8CFAC");

   ParamImpl<Float> F_AMRSEG9CFAC = new ParamImpl<Float>('F', 0X20210011, "AMRSEG9CFAC");

   ParamImpl<Float> F_AMRSEG10CFAC = new ParamImpl<Float>('F', 0X20210012, "AMRSEG10CFAC");

   ParamImpl<Float> F_AMRSEG11CFAC = new ParamImpl<Float>('F', 0X20210013, "AMRSEG11CFAC");

   ParamImpl<Float> F_AMRSEG12CFAC = new ParamImpl<Float>('F', 0X20210014, "AMRSEG12CFAC");

   ParamImpl<Float> F_AMRMRHOTDP = new ParamImpl<Float>('F', 0X20210015, "AMRMRHOTDP");

   ParamImpl<Float> F_AMRRHOTDPER = new ParamImpl<Float>('F', 0X20210016, "AMRRHOTDPER");

   ParamImpl<Float> F_AMRRHOTTR = new ParamImpl<Float>('F', 0X20210017, "AMRRHOTTR");

   ParamImpl<Float> F_AMRRHOTTRER = new ParamImpl<Float>('F', 0X20210018, "AMRRHOTTRER");

   ParamImpl<Float> F_AMRRHOTAD = new ParamImpl<Float>('F', 0X20210019, "AMRRHOTAD");

   ParamImpl<Float> F_AMRRHOTADER = new ParamImpl<Float>('F', 0X2021001, "AMRRHOTADER");

   ParamImpl<Float> F_AMRAVERHOT = new ParamImpl<Float>('F', 0X2021001, "AMRAVERHOT");

   ParamImpl<Float> F_AMRAVERHOTER = new ParamImpl<Float>('F', 0X2021001, "AMRAVERHOTER");

   ParamImpl<String> T_AMRNUCLIDE = new ParamImpl<String>('T', 0X2021001, "AMRNUCLIDE");

   ParamImpl<String> T_AMRRECTYPE = new ParamImpl<String>('T', 0X2021001, "AMRRECTYPE");

   ParamImpl<Float> F_AMRENERGY1 = new ParamImpl<Float>('F', 0X2021001, "AMRENERGY1");

   ParamImpl<Float> F_AMRENERGY2 = new ParamImpl<Float>('F', 0X20210020, "AMRENERGY2");

   ParamImpl<Float> F_AMREPAREARAT = new ParamImpl<Float>('F', 0X20210021, "AMREPAREARAT");

   ParamImpl<Float> F_AMREPRATERR = new ParamImpl<Float>('F', 0X20210022, "AMREPRATERR");

   ParamImpl<Float> F_AMRSPAREARAT = new ParamImpl<Float>('F', 0X20210023, "AMRSPAREARAT");

   ParamImpl<Float> F_AMRSPRATERR = new ParamImpl<Float>('F', 0X20210024, "AMRSPRATERR");

   ParamImpl<Float> F_AMRRHOT = new ParamImpl<Float>('F', 0X20210025, "AMRRHOT");

   ParamImpl<Float> F_AMRTENERGY = new ParamImpl<Float>('F', 0X20210026, "AMRTENERGY");

   ParamImpl<Float> F_AMRTEAREA = new ParamImpl<Float>('F', 0X20210027, "AMRTEAREA");

   ParamImpl<Float> F_AMRTEAREAERR = new ParamImpl<Float>('F', 0X20210028, "AMRTEAREAERR");

   ParamImpl<Float> F_AMRTSAREA = new ParamImpl<Float>('F', 0X20210029, "AMRTSAREA");

   ParamImpl<Float> F_AMRTSAREAERR = new ParamImpl<Float>('F', 0X2021002, "AMRTSAREAERR");

   ParamImpl<Float> F_AMRTRATIO = new ParamImpl<Float>('F', 0X2021002, "AMRTRATIO");

   ParamImpl<Float> F_AMRTRATIOERR = new ParamImpl<Float>('F', 0X2021002, "AMRTRATIOERR");

   ParamImpl<Float> F_AMRRHOTERR = new ParamImpl<Float>('F', 0X2021002, "AMRRHOTERR");

   ParamImpl<Float> F_AMRTLOWEN = new ParamImpl<Float>('F', 0X2021002, "AMRTLOWEN");

   ParamImpl<Float> F_AMRTHIGHEN = new ParamImpl<Float>('F', 0X2021002, "AMRTHIGHEN");

   ParamImpl<Date> X_AMRTRCALTIME = new ParamImpl<Date>('X', 0X20210030, "AMRTRCALTIME");

   ParamImpl<Date> X_AMRDPCALTIME = new ParamImpl<Date>('X', 0X20210031, "AMRDPCALTIME");

   ParamImpl<Long> L_AMRFDP = new ParamImpl<Long>('L', 0X20210032, "AMRFDP");

   ParamImpl<Long> L_AMRFTR = new ParamImpl<Long>('L', 0X20210033, "AMRFTR");

   ParamImpl<Long> L_AMRFAD = new ParamImpl<Long>('L', 0X20210034, "AMRFAD");

   ParamImpl<Long> L_AMRFCOMBINED = new ParamImpl<Long>('L', 0X20210035, "AMRFCOMBINED");

   ParamImpl<Long> L_AMRFDPFOVR = new ParamImpl<Long>('L', 0X20210036, "AMRFDPFOVR");

   ParamImpl<Long> L_AMRFTRFOVR = new ParamImpl<Long>('L', 0X20210037, "AMRFTRFOVR");

   ParamImpl<Long> L_AMRFDPREJECT = new ParamImpl<Long>('L', 0X20210038, "AMRFDPREJECT");

   ParamImpl<Long> L_AMRFTRREJECT = new ParamImpl<Long>('L', 0X20210039, "AMRFTRREJECT");

   ParamImpl<Long> L_AMRFTRMIN = new ParamImpl<Long>('L', 0X2021003, "AMRFTRMIN");

   ParamImpl<Date> X_AMRTNHL = new ParamImpl<Date>('X', 0X2021003, "AMRTNHL");

   ParamImpl<Long> L_AMRFDPSREJ = new ParamImpl<Long>('L', 0X2021003, "AMRFDPSREJ");

   ParamImpl<Long> L_AMRFTRSREJ = new ParamImpl<Long>('L', 0X2021003, "AMRFTRSREJ");

   ParamImpl<Long> L_AMRANALERROR = new ParamImpl<Long>('L', 0X2021003, "AMRANALERROR");

   ParamImpl<Date> X_TRNCCALTIME = new ParamImpl<Date>('X', 0X2021003, "TRNCCALTIME");

   ParamImpl<Date> X_TRNCCNTTIME = new ParamImpl<Date>('X', 0X20210040, "TRNCCNTTIME");

   ParamImpl<Float> F_AMRTNAREA = new ParamImpl<Float>('F', 0X20210041, "AMRTNAREA");

   ParamImpl<Float> F_AMRTNAREAERR = new ParamImpl<Float>('F', 0X20210042, "AMRTNAREAERR");

   ParamImpl<Float> F_AMRRECTRANS = new ParamImpl<Float>('F', 0X20210043, "AMRRECTRANS");

   ParamImpl<Float> F_AMRRECTRANSE = new ParamImpl<Float>('F', 0X20210044, "AMRRECTRANSE");

   ParamImpl<String> T_AMRTNHLU = new ParamImpl<String>('T', 0X20210045, "AMRTNHLU");

   ParamImpl<String> T_AMRTCDESC = new ParamImpl<String>('T', 0X20210046, "AMRTCDESC");

   ParamImpl<Long> L_AMRTCALCNTID = new ParamImpl<Long>('L', 0X20210047, "AMRTCALCNTID");

   ParamImpl<Long> L_AMRRFLAGS = new ParamImpl<Long>('L', 0X20210048, "AMRRFLAGS");

   ParamImpl<Long> L_AMRRFREJECT = new ParamImpl<Long>('L', 0X20210049, "AMRRFREJECT");

   ParamImpl<Long> L_AMRRFMINIMUM = new ParamImpl<Long>('L', 0X2021004, "AMRRFMINIMUM");

   ParamImpl<Long> L_AMRTRCORTYPE = new ParamImpl<Long>('L', 0X2021004, "AMRTRCORTYPE");

   ParamImpl<Object> M_AMRF_DP = new ParamImpl<Object>('M', 0X00000001, "AMRF_DP");

   ParamImpl<Object> M_AMRF_TR = new ParamImpl<Object>('M', 0X00000002, "AMRF_TR");

   ParamImpl<Object> M_AMRF_AD = new ParamImpl<Object>('M', 0X00000004, "AMRF_AD");

   ParamImpl<Object> M_AMRF_COMBINED = new ParamImpl<Object>('M', 0X00000008, "AMRF_COMBINED");

   ParamImpl<Object> M_AMRF_DPFOVR = new ParamImpl<Object>('M', 0X00000010, "AMRF_DPFOVR");

   ParamImpl<Object> M_AMRF_TRFOVR = new ParamImpl<Object>('M', 0X00000020, "AMRF_TRFOVR");

   ParamImpl<Object> M_AMRF_DPREJECT = new ParamImpl<Object>('M', 0X00000040, "AMRF_DPREJECT");

   ParamImpl<Object> M_AMRF_TRREJECT = new ParamImpl<Object>('M', 0X00000080, "AMRF_TRREJECT");

   ParamImpl<Object> M_AMRF_TRMIN = new ParamImpl<Object>('M', 0X00000100, "AMRF_TRMIN");

   ParamImpl<Object> M_AMRF_DPSREJ = new ParamImpl<Object>('M', 0X00000200, "AMRF_DPSREJ");

   ParamImpl<Object> M_AMRF_TRSREJ = new ParamImpl<Object>('M', 0X00000400, "AMRF_TRSREJ");

   ParamImpl<Object> M_AMRRF_REJECTED = new ParamImpl<Object>('M', 0X00000001, "AMRRF_REJECTED");

   ParamImpl<Object> M_AMRRF_MINIMUM = new ParamImpl<Object>('M', 0X00000002, "AMRRF_MINIMUM");

   ParamImpl<Object> V_CNVERR_SIGNAL = new ParamImpl<Object>('V', 0X00000000, "CNVERR_SIGNAL");

   ParamImpl<Object> M_CNVERR_SIGNAL = new ParamImpl<Object>('M', 0X00000001, "CNVERR_SIGNAL");

   ParamImpl<Long> L_AASFLAGS = new ParamImpl<Long>('L', 0X20220002, "AASFLAGS");

   ParamImpl<Date> X_AASCALDATE = new ParamImpl<Date>('X', 0X20220003, "AASCALDATE");

   ParamImpl<String> T_AASANALYST = new ParamImpl<String>('T', 0X20220004, "AASANALYST");

   ParamImpl<String> T_AASCONTAINER = new ParamImpl<String>('T', 0X20220005, "AASCONTAINER");

   ParamImpl<Long> L_AASCONTAINER = new ParamImpl<Long>('L', 0X20220005, "AASCONTAINER");

   ParamImpl<Long> L_AASCALDONE = new ParamImpl<Long>('L', 0X20220006, "AASCALDONE");

   ParamImpl<Long> L_AASNUMPOS = new ParamImpl<Long>('L', 0X20220007, "AASNUMPOS");

   ParamImpl<Float> F_AASREAAZERO = new ParamImpl<Float>('F', 0X20220008, "AASREAAZERO");

   ParamImpl<Float> F_AASREAAONE = new ParamImpl<Float>('F', 0X20220009, "AASREAAONE");

   ParamImpl<Float> F_AASREAATWO = new ParamImpl<Float>('F', 0X2022000, "AASREAATWO");

   ParamImpl<Float> F_AASREAATHREE = new ParamImpl<Float>('F', 0X2022000, "AASREAATHREE");

   ParamImpl<Float> F_AASREAVAR00 = new ParamImpl<Float>('F', 0X2022000, "AASREAVAR00");

   ParamImpl<Float> F_AASREAVAR11 = new ParamImpl<Float>('F', 0X2022000, "AASREAVAR11");

   ParamImpl<Float> F_AASREAVAR22 = new ParamImpl<Float>('F', 0X2022000, "AASREAVAR22");

   ParamImpl<Float> F_AASREAVAR33 = new ParamImpl<Float>('F', 0X2022000, "AASREAVAR33");

   ParamImpl<Float> F_AASREAVAR01 = new ParamImpl<Float>('F', 0X20220010, "AASREAVAR01");

   ParamImpl<Float> F_AASREAVAR02 = new ParamImpl<Float>('F', 0X20220011, "AASREAVAR02");

   ParamImpl<Float> F_AASREAVAR03 = new ParamImpl<Float>('F', 0X20220012, "AASREAVAR03");

   ParamImpl<Float> F_AASREAVAR12 = new ParamImpl<Float>('F', 0X20220013, "AASREAVAR12");

   ParamImpl<Float> F_AASREAVAR13 = new ParamImpl<Float>('F', 0X20220014, "AASREAVAR13");

   ParamImpl<Float> F_AASREAVAR23 = new ParamImpl<Float>('F', 0X20220015, "AASREAVAR23");

   ParamImpl<Float> F_AASTOTAZERO = new ParamImpl<Float>('F', 0X20220016, "AASTOTAZERO");

   ParamImpl<Float> F_AASTOTAONE = new ParamImpl<Float>('F', 0X20220017, "AASTOTAONE");

   ParamImpl<Float> F_AASTOTATWO = new ParamImpl<Float>('F', 0X20220018, "AASTOTATWO");

   ParamImpl<Float> F_AASTOTATHREE = new ParamImpl<Float>('F', 0X20220019, "AASTOTATHREE");

   ParamImpl<Float> F_AASTOTVAR00 = new ParamImpl<Float>('F', 0X2022001, "AASTOTVAR00");

   ParamImpl<Float> F_AASTOTVAR11 = new ParamImpl<Float>('F', 0X2022001, "AASTOTVAR11");

   ParamImpl<Float> F_AASTOTVAR22 = new ParamImpl<Float>('F', 0X2022001, "AASTOTVAR22");

   ParamImpl<Float> F_AASTOTVAR33 = new ParamImpl<Float>('F', 0X2022001, "AASTOTVAR33");

   ParamImpl<Float> F_AASTOTVAR01 = new ParamImpl<Float>('F', 0X2022001, "AASTOTVAR01");

   ParamImpl<Float> F_AASTOTVAR02 = new ParamImpl<Float>('F', 0X2022001, "AASTOTVAR02");

   ParamImpl<Float> F_AASTOTVAR03 = new ParamImpl<Float>('F', 0X20220020, "AASTOTVAR03");

   ParamImpl<Float> F_AASTOTVAR12 = new ParamImpl<Float>('F', 0X20220021, "AASTOTVAR12");

   ParamImpl<Float> F_AASTOTVAR13 = new ParamImpl<Float>('F', 0X20220022, "AASTOTVAR13");

   ParamImpl<Float> F_AASTOTVAR23 = new ParamImpl<Float>('F', 0X20220023, "AASTOTVAR23");

   ParamImpl<Float> F_AASREACALXR = new ParamImpl<Float>('F', 0X20220024, "AASREACALXR");

   ParamImpl<Float> F_AASREACALXRE = new ParamImpl<Float>('F', 0X20220025, "AASREACALXRE");

   ParamImpl<Float> F_AASREACALYR = new ParamImpl<Float>('F', 0X20220026, "AASREACALYR");

   ParamImpl<Float> F_AASREACALYRE = new ParamImpl<Float>('F', 0X20220027, "AASREACALYRE");

   ParamImpl<Float> F_AASTOTCALXR = new ParamImpl<Float>('F', 0X20220028, "AASTOTCALXR");

   ParamImpl<Float> F_AASTOTCALXRE = new ParamImpl<Float>('F', 0X20220029, "AASTOTCALXRE");

   ParamImpl<Float> F_AASTOTCALYR = new ParamImpl<Float>('F', 0X2022002, "AASTOTCALYR");

   ParamImpl<Float> F_AASTOTCALYRE = new ParamImpl<Float>('F', 0X2022002, "AASTOTCALYRE");

   ParamImpl<Float> F_AASTOTARCHI = new ParamImpl<Float>('F', 0X2022002, "AASTOTARCHI");

   ParamImpl<Float> F_AASREAARCHI = new ParamImpl<Float>('F', 0X2022002, "AASREAARCHI");

   ParamImpl<Float> F_AASRLOWLIM = new ParamImpl<Float>('F', 0X2022002, "AASRLOWLIM");

   ParamImpl<Float> F_AASRHIGHLIM = new ParamImpl<Float>('F', 0X2022002, "AASRHIGHLIM");

   ParamImpl<Float> F_AASTLOWLIM = new ParamImpl<Float>('F', 0X20220030, "AASTLOWLIM");

   ParamImpl<Float> F_AASTHIGHLIM = new ParamImpl<Float>('F', 0X20220031, "AASTHIGHLIM");

   ParamImpl<String> T_AASDETNAME = new ParamImpl<String>('T', 0X20220032, "AASDETNAME");

   ParamImpl<String> T_AASCURVEID = new ParamImpl<String>('T', 0X20220033, "AASCURVEID");

   ParamImpl<Long> L_AASNSIGREJ = new ParamImpl<Long>('L', 0X20220034, "AASNSIGREJ");

   ParamImpl<Long> L_AASFAILED = new ParamImpl<Long>('L', 0X20220035, "AASFAILED");

   ParamImpl<Float> F_AASREALSCF = new ParamImpl<Float>('F', 0X20220036, "AASREALSCF");

   ParamImpl<Float> F_AASREALSCFER = new ParamImpl<Float>('F', 0X20220037, "AASREALSCFER");

   ParamImpl<Float> F_AASTOTLSCF = new ParamImpl<Float>('F', 0X20220038, "AASTOTLSCF");

   ParamImpl<Float> F_AASTOTLSCFER = new ParamImpl<Float>('F', 0X20220039, "AASTOTLSCFER");

   ParamImpl<Float> F_AASRHZBPBOFF = new ParamImpl<Float>('F', 0X2022003, "AASRHZBPBOFF");

   ParamImpl<Float> F_AASRHZBPBLIN = new ParamImpl<Float>('F', 0X2022003, "AASRHZBPBLIN");

   ParamImpl<Float> F_AASRHZBPBV00 = new ParamImpl<Float>('F', 0X2022003, "AASRHZBPBV00");

   ParamImpl<Float> F_AASRHZBPBV11 = new ParamImpl<Float>('F', 0X2022003, "AASRHZBPBV11");

   ParamImpl<Float> F_AASRHZBPBV01 = new ParamImpl<Float>('F', 0X2022003, "AASRHZBPBV01");

   ParamImpl<Float> F_AASTHZBPBOFF = new ParamImpl<Float>('F', 0X2022003, "AASTHZBPBOFF");

   ParamImpl<Float> F_AASTHZBPBLIN = new ParamImpl<Float>('F', 0X20220040, "AASTHZBPBLIN");

   ParamImpl<Float> F_AASTHZBPBV00 = new ParamImpl<Float>('F', 0X20220041, "AASTHZBPBV00");

   ParamImpl<Float> F_AASTHZBPBV11 = new ParamImpl<Float>('F', 0X20220042, "AASTHZBPBV11");

   ParamImpl<Float> F_AASTHZBPBV01 = new ParamImpl<Float>('F', 0X20220043, "AASTHZBPBV01");

   ParamImpl<Float> F_AASRHZBFEOFF = new ParamImpl<Float>('F', 0X20220044, "AASRHZBFEOFF");

   ParamImpl<Float> F_AASRHZBFELIN = new ParamImpl<Float>('F', 0X20220045, "AASRHZBFELIN");

   ParamImpl<Float> F_AASRHZBFEV00 = new ParamImpl<Float>('F', 0X20220046, "AASRHZBFEV00");

   ParamImpl<Float> F_AASRHZBFEV11 = new ParamImpl<Float>('F', 0X20220047, "AASRHZBFEV11");

   ParamImpl<Float> F_AASRHZBFEV01 = new ParamImpl<Float>('F', 0X20220048, "AASRHZBFEV01");

   ParamImpl<Float> F_AASTHZBFEOFF = new ParamImpl<Float>('F', 0X20220049, "AASTHZBFEOFF");

   ParamImpl<Float> F_AASTHZBFELIN = new ParamImpl<Float>('F', 0X2022004, "AASTHZBFELIN");

   ParamImpl<Float> F_AASTHZBFEV00 = new ParamImpl<Float>('F', 0X2022004, "AASTHZBFEV00");

   ParamImpl<Float> F_AASTHZBFEV11 = new ParamImpl<Float>('F', 0X2022004, "AASTHZBFEV11");

   ParamImpl<Float> F_AASTHZBFEV01 = new ParamImpl<Float>('F', 0X2022004, "AASTHZBFEV01");

   ParamImpl<Float> F_AASRHZEPBOFF = new ParamImpl<Float>('F', 0X2022004, "AASRHZEPBOFF");

   ParamImpl<Float> F_AASRHZEPBLIN = new ParamImpl<Float>('F', 0X2022004, "AASRHZEPBLIN");

   ParamImpl<Float> F_AASRHZEPBQUD = new ParamImpl<Float>('F', 0X20220050, "AASRHZEPBQUD");

   ParamImpl<Float> F_AASRHZEPBV00 = new ParamImpl<Float>('F', 0X20220051, "AASRHZEPBV00");

   ParamImpl<Float> F_AASRHZEPBV11 = new ParamImpl<Float>('F', 0X20220052, "AASRHZEPBV11");

   ParamImpl<Float> F_AASRHZEPBV22 = new ParamImpl<Float>('F', 0X20220053, "AASRHZEPBV22");

   ParamImpl<Float> F_AASRHZEPBV01 = new ParamImpl<Float>('F', 0X20220054, "AASRHZEPBV01");

   ParamImpl<Float> F_AASRHZEPBV02 = new ParamImpl<Float>('F', 0X20220055, "AASRHZEPBV02");

   ParamImpl<Float> F_AASRHZEPBV12 = new ParamImpl<Float>('F', 0X20220056, "AASRHZEPBV12");

   ParamImpl<Float> F_AASRHZEFEOFF = new ParamImpl<Float>('F', 0X20220057, "AASRHZEFEOFF");

   ParamImpl<Float> F_AASRHZEFELIN = new ParamImpl<Float>('F', 0X20220058, "AASRHZEFELIN");

   ParamImpl<Float> F_AASRHZEFEQUD = new ParamImpl<Float>('F', 0X20220059, "AASRHZEFEQUD");

   ParamImpl<Float> F_AASRHZEFEV00 = new ParamImpl<Float>('F', 0X2022005, "AASRHZEFEV00");

   ParamImpl<Float> F_AASRHZEFEV11 = new ParamImpl<Float>('F', 0X2022005, "AASRHZEFEV11");

   ParamImpl<Float> F_AASRHZEFEV22 = new ParamImpl<Float>('F', 0X2022005, "AASRHZEFEV22");

   ParamImpl<Float> F_AASRHZEFEV01 = new ParamImpl<Float>('F', 0X2022005, "AASRHZEFEV01");

   ParamImpl<Float> F_AASRHZEFEV02 = new ParamImpl<Float>('F', 0X2022005, "AASRHZEFEV02");

   ParamImpl<Float> F_AASRHZEFEV12 = new ParamImpl<Float>('F', 0X2022005, "AASRHZEFEV12");

   ParamImpl<Float> F_AASREFFCF = new ParamImpl<Float>('F', 0X20220060, "AASREFFCF");

   ParamImpl<Float> F_AASREFFCFER = new ParamImpl<Float>('F', 0X20220061, "AASREFFCFER");

   ParamImpl<Float> F_AASTEFFCF = new ParamImpl<Float>('F', 0X20220062, "AASTEFFCF");

   ParamImpl<Float> F_AASTEFFCFER = new ParamImpl<Float>('F', 0X20220063, "AASTEFFCFER");

   ParamImpl<Float> F_AASRBKGCF = new ParamImpl<Float>('F', 0X20220064, "AASRBKGCF");

   ParamImpl<Float> F_AASRBKGCFER = new ParamImpl<Float>('F', 0X20220065, "AASRBKGCFER");

   ParamImpl<Float> F_AASTBKGCF = new ParamImpl<Float>('F', 0X20220066, "AASTBKGCF");

   ParamImpl<Float> F_AASTBKGCFER = new ParamImpl<Float>('F', 0X20220067, "AASTBKGCFER");

   ParamImpl<String> T_AASRPNTFILE = new ParamImpl<String>('T', 0X20220068, "AASRPNTFILE");

   ParamImpl<Date> X_AASRPNTFILE = new ParamImpl<Date>('X', 0X20220069, "AASRPNTFILE");

   ParamImpl<String> T_AASREFFILE = new ParamImpl<String>('T', 0X2022006, "AASREFFILE");

   ParamImpl<String> T_AASMATFILE = new ParamImpl<String>('T', 0X2022006, "AASMATFILE");

   ParamImpl<String> T_VOLREFFILE = new ParamImpl<String>('T', 0X2022006, "VOLREFFILE");

   ParamImpl<String> T_VOLMATFILE = new ParamImpl<String>('T', 0X2022006, "VOLMATFILE");

   ParamImpl<String> T_AASHZEFFDBR = new ParamImpl<String>('T', 0X2022006, "AASHZEFFDBR");

   ParamImpl<String> T_AASHZBCKDBR = new ParamImpl<String>('T', 0X2022006, "AASHZBCKDBR");

   ParamImpl<String> T_AASCALDBR = new ParamImpl<String>('T', 0X20220070, "AASCALDBR");

   ParamImpl<Long> L_AASNOAASFILE = new ParamImpl<Long>('L', 0X20220071, "AASNOAASFILE");

   ParamImpl<Long> L_AASNOREFFILE = new ParamImpl<Long>('L', 0X20220072, "AASNOREFFILE");

   ParamImpl<Long> L_AASCFLTUNITY = new ParamImpl<Long>('L', 0X20220073, "AASCFLTUNITY");

   ParamImpl<Long> L_AASCFCLAMPED = new ParamImpl<Long>('L', 0X20220074, "AASCFCLAMPED");

   ParamImpl<Long> L_AASLOWHIGHLM = new ParamImpl<Long>('L', 0X20220075, "AASLOWHIGHLM");

   ParamImpl<Float> F_AASDCREFTR = new ParamImpl<Float>('F', 0X20220076, "AASDCREFTR");

   ParamImpl<Float> F_AASDCREFTRE = new ParamImpl<Float>('F', 0X20220077, "AASDCREFTRE");

   ParamImpl<Float> F_AASDCREFRR = new ParamImpl<Float>('F', 0X20220078, "AASDCREFRR");

   ParamImpl<Float> F_AASDCREFRRE = new ParamImpl<Float>('F', 0X20220079, "AASDCREFRRE");

   ParamImpl<Float> F_AASXHZBFELIN = new ParamImpl<Float>('F', 0X2022007, "AASXHZBFELIN");

   ParamImpl<Float> F_AASXHZBFEV11 = new ParamImpl<Float>('F', 0X2022007, "AASXHZBFEV11");

   ParamImpl<Float> F_AASXHZBPBLIN = new ParamImpl<Float>('F', 0X2022007, "AASXHZBPBLIN");

   ParamImpl<Float> F_AASXHZBPBV11 = new ParamImpl<Float>('F', 0X2022007, "AASXHZBPBV11");

   ParamImpl<Float> F_AASHZBFERXCV = new ParamImpl<Float>('F', 0X2022007, "AASHZBFERXCV");

   ParamImpl<Float> F_AASREALSCFZ = new ParamImpl<Float>('F', 0X2022007, "AASREALSCFZ");

   ParamImpl<Float> F_AASREFTOT = new ParamImpl<Float>('F', 0X20220080, "AASREFTOT");

   ParamImpl<Float> F_AASREFTOTER = new ParamImpl<Float>('F', 0X20220081, "AASREFTOTER");

   ParamImpl<Float> F_AASREFREAL = new ParamImpl<Float>('F', 0X20220082, "AASREFREAL");

   ParamImpl<Float> F_AASREFREALER = new ParamImpl<Float>('F', 0X20220083, "AASREFREALER");

   ParamImpl<Date> X_AASREFSTIME = new ParamImpl<Date>('X', 0X20220084, "AASREFSTIME");

   ParamImpl<Float> F_AASTOTALSCFZ = new ParamImpl<Float>('F', 0X20220085, "AASTOTALSCFZ");

   ParamImpl<Object> V_AASF_CALDONE = new ParamImpl<Object>('V', 0X00000000, "AASF_CALDONE");

   ParamImpl<Object> M_AASF_CALDONE = new ParamImpl<Object>('M', 0X00000001, "AASF_CALDONE");

   ParamImpl<Object> V_AASF_NSIGREJ = new ParamImpl<Object>('V', 0X00000001, "AASF_NSIGREJ");

   ParamImpl<Object> M_AASF_NSIGREJ = new ParamImpl<Object>('M', 0X00000002, "AASF_NSIGREJ");

   ParamImpl<Object> V_AASF_FAILED = new ParamImpl<Object>('V', 0X00000002, "AASF_FAILED");

   ParamImpl<Object> M_AASF_FAILED = new ParamImpl<Object>('M', 0X00000004, "AASF_FAILED");

   ParamImpl<Object> V_AASF_NOAASFILE = new ParamImpl<Object>('V', 0X00000003, "AASF_NOAASFILE");

   ParamImpl<Object> M_AASF_NOAASFILE = new ParamImpl<Object>('M', 0X00000008, "AASF_NOAASFILE");

   ParamImpl<Object> V_AASF_NOREFFILE = new ParamImpl<Object>('V', 0X00000004, "AASF_NOREFFILE");

   ParamImpl<Object> M_AASF_NOREFFILE = new ParamImpl<Object>('M', 0X00000010, "AASF_NOREFFILE");

   ParamImpl<Object> V_AASF_CFLUNITY = new ParamImpl<Object>('V', 0X00000005, "AASF_CFLUNITY");

   ParamImpl<Object> M_AASF_CFLUNITY = new ParamImpl<Object>('M', 0X00000020, "AASF_CFLUNITY");

   ParamImpl<Object> V_AASF_CFCLAMPED = new ParamImpl<Object>('V', 0X00000006, "AASF_CFCLAMPED");

   ParamImpl<Object> M_AASF_CFCLAMPED = new ParamImpl<Object>('M', 0X00000040, "AASF_CFCLAMPED");

   ParamImpl<Object> V_AASF_LOWHIGHLIM = new ParamImpl<Object>('V', 0X00000007, "AASF_LOWHIGHLIM");

   ParamImpl<Object> M_AASF_LOWHIGHLIM = new ParamImpl<Object>('M', 0X00000080, "AASF_LOWHIGHLIM");

   ParamImpl<Object> V_AASF_FORCETHRU0 = new ParamImpl<Object>('V', 0X00000008, "AASF_FORCETHRU0");

   ParamImpl<Object> M_AASF_FORCETHRU0 = new ParamImpl<Object>('M', 0X00000100, "AASF_FORCETHRU0");

   ParamImpl<Float> F_MCSCDWELL = new ParamImpl<Float>('F', 0X20230002, "MCSCDWELL");

   ParamImpl<String> T_MCSCDSRC = new ParamImpl<String>('T', 0X20230003, "MCSCDSRC");

   ParamImpl<Long> L_MCSCCHANS = new ParamImpl<Long>('L', 0X20230004, "MCSCCHANS");

   ParamImpl<Long> L_MCSCCACHESIZ = new ParamImpl<Long>('L', 0X20230005, "MCSCCACHESIZ");

   ParamImpl<Long> L_MCSCFLAGS = new ParamImpl<Long>('L', 0X20230006, "MCSCFLAGS");

   ParamImpl<Long> L_MCSCEXTADV = new ParamImpl<Long>('L', 0X20230007, "MCSCEXTADV");

   ParamImpl<Long> L_MCSCCPSALRM = new ParamImpl<Long>('L', 0X20230008, "MCSCCPSALRM");

   ParamImpl<Long> L_MCSCPTIMEX = new ParamImpl<Long>('L', 0X20230009, "MCSCPTIMEX");

   ParamImpl<String> T_MCSCRGNDESC = new ParamImpl<String>('T', 0X2023000, "MCSCRGNDESC");

   ParamImpl<Float> F_MCSCRSTART = new ParamImpl<Float>('F', 0X2023000, "MCSCRSTART");

   ParamImpl<Float> F_MCSCREND = new ParamImpl<Float>('F', 0X2023000, "MCSCREND");

   ParamImpl<Long> L_MCSCRFLAGS = new ParamImpl<Long>('L', 0X2023000, "MCSCRFLAGS");

   ParamImpl<Long> L_MCSCNET = new ParamImpl<Long>('L', 0X2023000, "MCSCNET");

   ParamImpl<Float> F_MCSCCPSLEV = new ParamImpl<Float>('F', 0X2023000, "MCSCCPSLEV");

   ParamImpl<Float> F_MCSCGAIN = new ParamImpl<Float>('F', 0X20230010, "MCSCGAIN");

   ParamImpl<Float> F_MCSCOFFSET = new ParamImpl<Float>('F', 0X20230011, "MCSCOFFSET");

   ParamImpl<String> T_MCSCUNITS = new ParamImpl<String>('T', 0X20230012, "MCSCUNITS");

   ParamImpl<Object> V_MSCSF_EXTADV = new ParamImpl<Object>('V', 0X00000000, "MSCSF_EXTADV");

   ParamImpl<Object> M_MSCSF_EXTADV = new ParamImpl<Object>('M', 0X00000001, "MSCSF_EXTADV");

   ParamImpl<Object> V_MSCSF_CPSALRM = new ParamImpl<Object>('V', 0X00000001, "MSCSF_CPSALRM");

   ParamImpl<Object> M_MSCSF_CPSALRM = new ParamImpl<Object>('M', 0X00000002, "MSCSF_CPSALRM");

   ParamImpl<Object> V_MSCSF_PTIMEX = new ParamImpl<Object>('V', 0X00000002, "MSCSF_PTIMEX");

   ParamImpl<Object> M_MSCSF_PTIMEX = new ParamImpl<Object>('M', 0X00000004, "MSCSF_PTIMEX");

   ParamImpl<Object> V_MSCSRF_NET = new ParamImpl<Object>('V', 0X00000000, "MSCSRF_NET");

   ParamImpl<Object> M_MSCSRF_NET = new ParamImpl<Object>('M', 0X00000001, "MSCSRF_NET");

   ParamImpl<Object> V_MSCSRF_LATEGATE = new ParamImpl<Object>('V', 0X00000001, "MSCSRF_LATEGATE");

   ParamImpl<Object> M_MSCSRF_LATEGATE = new ParamImpl<Object>('M', 0X00000002, "MSCSRF_LATEGATE");

   ParamImpl<String> T_KCDESCRIP = new ParamImpl<String>('T', 0X20240002, "KCDESCRIP");

   ParamImpl<String> T_KCCALTIME = new ParamImpl<String>('T', 0X20240003, "KCCALTIME");

   ParamImpl<Float> F_KCDELMU1 = new ParamImpl<Float>('F', 0X20240004, "KCDELMU1");

   ParamImpl<Float> F_KCDELMU2 = new ParamImpl<Float>('F', 0X20240005, "KCDELMU2");

   ParamImpl<Float> F_KCDELMU12 = new ParamImpl<Float>('F', 0X20240006, "KCDELMU12");

   ParamImpl<Float> F_KCDELMU21 = new ParamImpl<Float>('F', 0X20240007, "KCDELMU21");

   ParamImpl<Float> F_KCDELMUX1 = new ParamImpl<Float>('F', 0X20240008, "KCDELMUX1");

   ParamImpl<Float> F_KCDELMUX2 = new ParamImpl<Float>('F', 0X20240009, "KCDELMUX2");

   ParamImpl<Float> F_KCPATHLEN = new ParamImpl<Float>('F', 0X2024000, "KCPATHLEN");

   ParamImpl<String> T_KCANALYST = new ParamImpl<String>('T', 0X2024000, "KCANALYST");

   ParamImpl<Long> L_KRFLAGS = new ParamImpl<Long>('L', 0X20250002, "KRFLAGS");

   ParamImpl<Long> L_KRFKEDDONE = new ParamImpl<Long>('L', 0X20250003, "KRFKEDDONE");

   ParamImpl<String> T_KRANALVERS = new ParamImpl<String>('T', 0X20250004, "KRANALVERS");

   ParamImpl<String> T_KRPROTOCOL = new ParamImpl<String>('T', 0X20250005, "KRPROTOCOL");

   ParamImpl<Float> F_KRREFCH1 = new ParamImpl<Float>('F', 0X20250006, "KRREFCH1");

   ParamImpl<Float> F_KRREFCH2 = new ParamImpl<Float>('F', 0X20250007, "KRREFCH2");

   ParamImpl<Float> F_KRCONC1 = new ParamImpl<Float>('F', 0X20250008, "KRCONC1");

   ParamImpl<Float> F_KRCONC2 = new ParamImpl<Float>('F', 0X20250009, "KRCONC2");

   ParamImpl<Float> F_KRCONC1ERR = new ParamImpl<Float>('F', 0X2025000, "KRCONC1ERR");

   ParamImpl<Float> F_KRCONC2ERR = new ParamImpl<Float>('F', 0X2025000, "KRCONC2ERR");

   ParamImpl<Float> F_KRXCONC1 = new ParamImpl<Float>('F', 0X2025000, "KRXCONC1");

   ParamImpl<Float> F_KRXCONC2 = new ParamImpl<Float>('F', 0X2025000, "KRXCONC2");

   ParamImpl<Float> F_KRACONC1 = new ParamImpl<Float>('F', 0X2025000, "KRACONC1");

   ParamImpl<Float> F_KRACONC2 = new ParamImpl<Float>('F', 0X2025000, "KRACONC2");

   ParamImpl<Float> F_KRACONC1SD = new ParamImpl<Float>('F', 0X20250010, "KRACONC1SD");

   ParamImpl<Float> F_KRACONC2SD = new ParamImpl<Float>('F', 0X20250011, "KRACONC2SD");

   ParamImpl<Float> F_KRCONC1RAT = new ParamImpl<Float>('F', 0X20250012, "KRCONC1RAT");

   ParamImpl<Float> F_KRCONC2RAT = new ParamImpl<Float>('F', 0X20250013, "KRCONC2RAT");

   ParamImpl<Float> F_KRCONC2RATER = new ParamImpl<Float>('F', 0X20250014, "KRCONC2RATER");

   ParamImpl<Float> F_KRCONC1RATER = new ParamImpl<Float>('F', 0X20250015, "KRCONC1RATER");

   ParamImpl<Float> F_KRKED1CH = new ParamImpl<Float>('F', 0X20250016, "KRKED1CH");

   ParamImpl<Float> F_KRKED2CH = new ParamImpl<Float>('F', 0X20250017, "KRKED2CH");

   ParamImpl<Float> F_KRREF1FWHM = new ParamImpl<Float>('F', 0X20250018, "KRREF1FWHM");

   ParamImpl<Float> F_KRREF2FWHM = new ParamImpl<Float>('F', 0X20250019, "KRREF2FWHM");

   ParamImpl<Float> F_KRTOTALCPS = new ParamImpl<Float>('F', 0X2025001, "KRTOTALCPS");

   ParamImpl<Float> F_KRHVCUTOFF = new ParamImpl<Float>('F', 0X2025001, "KRHVCUTOFF");

   ParamImpl<Float> F_KRSPNORMFAC = new ParamImpl<Float>('F', 0X2025001, "KRSPNORMFAC");

   ParamImpl<Float> F_KRTEMPCORFAC = new ParamImpl<Float>('F', 0X2025001, "KRTEMPCORFAC");

   ParamImpl<Float> F_KRROI1OFF = new ParamImpl<Float>('F', 0X2025001, "KRROI1OFF");

   ParamImpl<Float> F_KRROI1OFFERR = new ParamImpl<Float>('F', 0X2025001, "KRROI1OFFERR");

   ParamImpl<Float> F_KRROI1SLOPE = new ParamImpl<Float>('F', 0X20250020, "KRROI1SLOPE");

   ParamImpl<Float> F_KRROI2OFF = new ParamImpl<Float>('F', 0X20250021, "KRROI2OFF");

   ParamImpl<Float> F_KRROI2OFFERR = new ParamImpl<Float>('F', 0X20250022, "KRROI2OFFERR");

   ParamImpl<Float> F_KRROI2SLOPE = new ParamImpl<Float>('F', 0X20250023, "KRROI2SLOPE");

   ParamImpl<Float> F_KRROI3OFF = new ParamImpl<Float>('F', 0X20250024, "KRROI3OFF");

   ParamImpl<Float> F_KRROI3OFFERR = new ParamImpl<Float>('F', 0X20250025, "KRROI3OFFERR");

   ParamImpl<Float> F_KRROI3SLOPE = new ParamImpl<Float>('F', 0X20250026, "KRROI3SLOPE");

   ParamImpl<Float> F_KRXCONC1ERR = new ParamImpl<Float>('F', 0X20250027, "KRXCONC1ERR");

   ParamImpl<Float> F_KRXCONC2ERR = new ParamImpl<Float>('F', 0X20250028, "KRXCONC2ERR");

   ParamImpl<Float> F_KRROI4OFF = new ParamImpl<Float>('F', 0X20250029, "KRROI4OFF");

   ParamImpl<Float> F_KRROI4OFFERR = new ParamImpl<Float>('F', 0X2025002, "KRROI4OFFERR");

   ParamImpl<Float> F_KRROI4SLOPE = new ParamImpl<Float>('F', 0X2025002, "KRROI4SLOPE");

   ParamImpl<Object> V_KEDF_KEDDONE = new ParamImpl<Object>('V', 0X00000000, "KEDF_KEDDONE");

   ParamImpl<Object> M_KEDF_KEDDONE = new ParamImpl<Object>('M', 0X00000001, "KEDF_KEDDONE");

   ParamImpl<Float> F_NMULTRATOT = new ParamImpl<Float>('F', 0X20260002, "NMULTRATOT");

   ParamImpl<Float> F_NMULTRAS = new ParamImpl<Float>('F', 0X20260003, "NMULTRAS");

   ParamImpl<Float> F_NMULTACCS = new ParamImpl<Float>('F', 0X20260004, "NMULTACCS");

   ParamImpl<Long> L_NMULTNUMACC = new ParamImpl<Long>('L', 0X20260005, "NMULTNUMACC");

   ParamImpl<Float> F_NMULTPROB = new ParamImpl<Float>('F', 0X20260006, "NMULTPROB");

   ParamImpl<Long> L_NMULTBINNO = new ParamImpl<Long>('L', 0X20260007, "NMULTBINNO");

   ParamImpl<Float> F_NMULTATOT = new ParamImpl<Float>('F', 0X20260008, "NMULTATOT");

   ParamImpl<Long> L_NMULTNUMRA = new ParamImpl<Long>('L', 0X20260009, "NMULTNUMRA");

   ParamImpl<Long> L_NMULTNUMSCLR = new ParamImpl<Long>('L', 0X2026000, "NMULTNUMSCLR");

   ParamImpl<Long> L_NMULTTRUNC = new ParamImpl<Long>('L', 0X2026000, "NMULTTRUNC");

   ParamImpl<Float> F_NMULTRATRUNC = new ParamImpl<Float>('F', 0X2026000, "NMULTRATRUNC");

   ParamImpl<Float> F_NMULTATRUNC = new ParamImpl<Float>('F', 0X2026000, "NMULTATRUNC");

   ParamImpl<Long> L_NMULTFLAGS = new ParamImpl<Long>('L', 0X2026000, "NMULTFLAGS");

   ParamImpl<Long> L_NMULTFINT = new ParamImpl<Long>('L', 0X2026000, "NMULTFINT");

   ParamImpl<Long> L_NMULTBINVAL = new ParamImpl<Long>('L', 0X20260010, "NMULTBINVAL");

   ParamImpl<Long> L_NMULTFLSTMOD = new ParamImpl<Long>('L', 0X20260011, "NMULTFLSTMOD");

   ParamImpl<Long> L_NMULTLSTHTYP = new ParamImpl<Long>('L', 0X20260012, "NMULTLSTHTYP");

   ParamImpl<Float> F_NMULTLSTFREQ = new ParamImpl<Float>('F', 0X20260013, "NMULTLSTFREQ");

   ParamImpl<Long> L_NMULTNUMROAL = new ParamImpl<Long>('L', 0X20260014, "NMULTNUMROAL");

   ParamImpl<Long> L_NMULTNUMFEYN = new ParamImpl<Long>('L', 0X20260015, "NMULTNUMFEYN");

   ParamImpl<Object> M_NMULTF_INT = new ParamImpl<Object>('M', 0X00000001, "NMULTF_INT");

   ParamImpl<Object> V_NMULTF_INT = new ParamImpl<Object>('V', 0X00000000, "NMULTF_INT");

   ParamImpl<Object> M_NMULTF_LSTMODE = new ParamImpl<Object>('M', 0X00000002, "NMULTF_LSTMODE");

   ParamImpl<Object> V_NMULTF_LSTMODE = new ParamImpl<Object>('V', 0X00000001, "NMULTF_LSTMODE");

   ParamImpl<String> T_ASTMCALMATER = new ParamImpl<String>('T', 0X20270002, "ASTMCALMATER");

   ParamImpl<String> T_ASTMCALMATRX = new ParamImpl<String>('T', 0X20270003, "ASTMCALMATRX");

   ParamImpl<Date> X_ASTMCALDATE = new ParamImpl<Date>('X', 0X20270004, "ASTMCALDATE");

   ParamImpl<String> T_ASTMCANALYST = new ParamImpl<String>('T', 0X20270005, "ASTMCANALYST");

   ParamImpl<Float> F_ASTMCLOMASS = new ParamImpl<Float>('F', 0X20270006, "ASTMCLOMASS");

   ParamImpl<Float> F_ASTMCHIMASS = new ParamImpl<Float>('F', 0X20270007, "ASTMCHIMASS");

   ParamImpl<String> T_ASTMCNUCLIDE = new ParamImpl<String>('T', 0X20270008, "ASTMCNUCLIDE");

   ParamImpl<Float> F_ASTMCENERGY = new ParamImpl<Float>('F', 0X20270009, "ASTMCENERGY");

   ParamImpl<Float> F_ASTMCOFF = new ParamImpl<Float>('F', 0X2027000, "ASTMCOFF");

   ParamImpl<Float> F_ASTMCSLOPE = new ParamImpl<Float>('F', 0X2027000, "ASTMCSLOPE");

   ParamImpl<Float> F_ASTMCQUAD = new ParamImpl<Float>('F', 0X2027000, "ASTMCQUAD");

   ParamImpl<Float> F_ASTMCOFFVAR = new ParamImpl<Float>('F', 0X2027000, "ASTMCOFFVAR");

   ParamImpl<Float> F_ASTMCSLOPEV = new ParamImpl<Float>('F', 0X2027000, "ASTMCSLOPEV");

   ParamImpl<Float> F_ASTMCQUADVAR = new ParamImpl<Float>('F', 0X2027000, "ASTMCQUADVAR");

   ParamImpl<Float> F_ASTMCOSCOV = new ParamImpl<Float>('F', 0X20270010, "ASTMCOSCOV");

   ParamImpl<Float> F_ASTMCOQCOV = new ParamImpl<Float>('F', 0X20270011, "ASTMCOQCOV");

   ParamImpl<Float> F_ASTMCSQCOV = new ParamImpl<Float>('F', 0X20270012, "ASTMCSQCOV");

   ParamImpl<Float> F_ASTMCMASS = new ParamImpl<Float>('F', 0X20270013, "ASTMCMASS");

   ParamImpl<Float> F_ASTMCMASSERR = new ParamImpl<Float>('F', 0X20270014, "ASTMCMASSERR");

   ParamImpl<Float> F_ASTMCRATE = new ParamImpl<Float>('F', 0X20270015, "ASTMCRATE");

   ParamImpl<Float> F_ASTMCRATEERR = new ParamImpl<Float>('F', 0X20270016, "ASTMCRATEERR");

   ParamImpl<Float> F_ASTMCDCRATE = new ParamImpl<Float>('F', 0X20270017, "ASTMCDCRATE");

   ParamImpl<Float> F_ASTMCDCRATEE = new ParamImpl<Float>('F', 0X20270018, "ASTMCDCRATEE");

   ParamImpl<Long> L_ASTMCORDER = new ParamImpl<Long>('L', 0X20270019, "ASTMCORDER");

   ParamImpl<Long> L_ASTMCMFLAGS = new ParamImpl<Long>('L', 0X2027001, "ASTMCMFLAGS");

   ParamImpl<Long> L_ASTMCNFLAGS = new ParamImpl<Long>('L', 0X2027001, "ASTMCNFLAGS");

   ParamImpl<Long> L_ASTMCFZERO = new ParamImpl<Long>('L', 0X2027001, "ASTMCFZERO");

   ParamImpl<Long> L_ASTMCSEQNUM = new ParamImpl<Long>('L', 0X2027001, "ASTMCSEQNUM");

   ParamImpl<Object> V_ASTMCM_REJECT = new ParamImpl<Object>('V', 0X00000000, "ASTMCM_REJECT");

   ParamImpl<Object> M_ASTMCM_REJECT = new ParamImpl<Object>('M', 0X00000001, "ASTMCM_REJECT");

   ParamImpl<Object> V_ASTMCN_FZERO = new ParamImpl<Object>('V', 0X00000000, "ASTMCN_FZERO");

   ParamImpl<Object> M_ASTMCN_FZERO = new ParamImpl<Object>('M', 0X00000001, "ASTMCN_FZERO");

   ParamImpl<Long> L_NUCGSRCREC = new ParamImpl<Long>('L', 0X20280002, "NUCGSRCREC");

   ParamImpl<Float> F_NUCGDETDIST = new ParamImpl<Float>('F', 0X20280003, "NUCGDETDIST");

   ParamImpl<Float> F_NUCGDETTHETA = new ParamImpl<Float>('F', 0X20280004, "NUCGDETTHETA");

   ParamImpl<Float> F_NUCGDETPHI = new ParamImpl<Float>('F', 0X20280005, "NUCGDETPHI");

   ParamImpl<Float> F_NUCGDIST = new ParamImpl<Float>('F', 0X20280006, "NUCGDIST");

   ParamImpl<Long> L_NUCGPORTION = new ParamImpl<Long>('L', 0X20280007, "NUCGPORTION");

   ParamImpl<Long> L_NUCGSEGMENT = new ParamImpl<Long>('L', 0X20280008, "NUCGSEGMENT");

   ParamImpl<Long> L_NUCGNUMSRCP = new ParamImpl<Long>('L', 0X20280009, "NUCGNUMSRCP");

   ParamImpl<Long> L_NUCGNUMSRC = new ParamImpl<Long>('L', 0X2028000, "NUCGNUMSRC");

   ParamImpl<Long> L_NUCGLASTSRC = new ParamImpl<Long>('L', 0X2028000, "NUCGLASTSRC");

   ParamImpl<String> T_PTCVERS = new ParamImpl<String>('T', 0X20290002, "PTCVERS");

   ParamImpl<Float> F_PTCCROSSOVER = new ParamImpl<Float>('F', 0X20290003, "PTCCROSSOVER");

   ParamImpl<Long> L_PTCLDEGREE = new ParamImpl<Long>('L', 0X20290004, "PTCLDEGREE");

   ParamImpl<Long> L_PTCHDEGREE = new ParamImpl<Long>('L', 0X20290005, "PTCHDEGREE");

   ParamImpl<Float> F_PTCLCALFAC1 = new ParamImpl<Float>('F', 0X20290006, "PTCLCALFAC1");

   ParamImpl<Float> F_PTCLCALFAC2 = new ParamImpl<Float>('F', 0X20290007, "PTCLCALFAC2");

   ParamImpl<Float> F_PTCLCALFAC3 = new ParamImpl<Float>('F', 0X20290008, "PTCLCALFAC3");

   ParamImpl<Float> F_PTCLCALFAC4 = new ParamImpl<Float>('F', 0X20290009, "PTCLCALFAC4");

   ParamImpl<Float> F_PTCLCALFAC5 = new ParamImpl<Float>('F', 0X2029000, "PTCLCALFAC5");

   ParamImpl<Float> F_PTCLCALFAC6 = new ParamImpl<Float>('F', 0X2029000, "PTCLCALFAC6");

   ParamImpl<Float> F_PTCLCALCHI = new ParamImpl<Float>('F', 0X2029000, "PTCLCALCHI");

   ParamImpl<Float> F_PTCHCALFAC1 = new ParamImpl<Float>('F', 0X2029000, "PTCHCALFAC1");

   ParamImpl<Float> F_PTCHCALFAC2 = new ParamImpl<Float>('F', 0X2029000, "PTCHCALFAC2");

   ParamImpl<Float> F_PTCHCALFAC3 = new ParamImpl<Float>('F', 0X2029000, "PTCHCALFAC3");

   ParamImpl<Float> F_PTCHCALFAC4 = new ParamImpl<Float>('F', 0X20290010, "PTCHCALFAC4");

   ParamImpl<Float> F_PTCHCALFAC5 = new ParamImpl<Float>('F', 0X20290011, "PTCHCALFAC5");

   ParamImpl<Float> F_PTCHCALFAC6 = new ParamImpl<Float>('F', 0X20290012, "PTCHCALFAC6");

   ParamImpl<Float> F_PTCHCALFAC7 = new ParamImpl<Float>('F', 0X20290013, "PTCHCALFAC7");

   ParamImpl<Float> F_PTCHCALFAC8 = new ParamImpl<Float>('F', 0X20290014, "PTCHCALFAC8");

   ParamImpl<Float> F_PTCHCALFAC9 = new ParamImpl<Float>('F', 0X20290015, "PTCHCALFAC9");

   ParamImpl<Float> F_PTCHCALFAC10 = new ParamImpl<Float>('F', 0X20290016, "PTCHCALFAC10");

   ParamImpl<Float> F_PTCHCALCHI = new ParamImpl<Float>('F', 0X20290017, "PTCHCALCHI");

   ParamImpl<Object> G_PTCLERRMAT1 = new ParamImpl<Object>('G', 0X20290018, "PTCLERRMAT1");

   ParamImpl<Object> G_PTCLERRMAT2 = new ParamImpl<Object>('G', 0X20290019, "PTCLERRMAT2");

   ParamImpl<Object> G_PTCLERRMAT3 = new ParamImpl<Object>('G', 0X2029001, "PTCLERRMAT3");

   ParamImpl<Object> G_PTCLERRMAT4 = new ParamImpl<Object>('G', 0X2029001, "PTCLERRMAT4");

   ParamImpl<Object> G_PTCLERRMAT5 = new ParamImpl<Object>('G', 0X2029001, "PTCLERRMAT5");

   ParamImpl<Object> G_PTCLERRMAT6 = new ParamImpl<Object>('G', 0X2029001, "PTCLERRMAT6");

   ParamImpl<Object> G_PTCLERRMAT7 = new ParamImpl<Object>('G', 0X2029001, "PTCLERRMAT7");

   ParamImpl<Object> G_PTCLERRMAT8 = new ParamImpl<Object>('G', 0X2029001, "PTCLERRMAT8");

   ParamImpl<Object> G_PTCLERRMAT9 = new ParamImpl<Object>('G', 0X20290020, "PTCLERRMAT9");

   ParamImpl<Object> G_PTCLERRMAT10 = new ParamImpl<Object>('G', 0X20290021, "PTCLERRMAT10");

   ParamImpl<Object> G_PTCLERRMAT11 = new ParamImpl<Object>('G', 0X20290022, "PTCLERRMAT11");

   ParamImpl<Object> G_PTCHERRMAT1 = new ParamImpl<Object>('G', 0X20290023, "PTCHERRMAT1");

   ParamImpl<Object> G_PTCHERRMAT2 = new ParamImpl<Object>('G', 0X20290024, "PTCHERRMAT2");

   ParamImpl<Object> G_PTCHERRMAT3 = new ParamImpl<Object>('G', 0X20290025, "PTCHERRMAT3");

   ParamImpl<Object> G_PTCHERRMAT4 = new ParamImpl<Object>('G', 0X20290026, "PTCHERRMAT4");

   ParamImpl<Object> G_PTCHERRMAT5 = new ParamImpl<Object>('G', 0X20290027, "PTCHERRMAT5");

   ParamImpl<Object> G_PTCHERRMAT6 = new ParamImpl<Object>('G', 0X20290028, "PTCHERRMAT6");

   ParamImpl<Object> G_PTCHERRMAT7 = new ParamImpl<Object>('G', 0X20290029, "PTCHERRMAT7");

   ParamImpl<Object> G_PTCHERRMAT8 = new ParamImpl<Object>('G', 0X2029002, "PTCHERRMAT8");

   ParamImpl<Object> G_PTCHERRMAT9 = new ParamImpl<Object>('G', 0X2029002, "PTCHERRMAT9");

   ParamImpl<Object> G_PTCHERRMAT10 = new ParamImpl<Object>('G', 0X2029002, "PTCHERRMAT10");

   ParamImpl<Object> G_PTCHERRMAT11 = new ParamImpl<Object>('G', 0X2029002, "PTCHERRMAT11");

   ParamImpl<Object> G_PTCHERRMAT12 = new ParamImpl<Object>('G', 0X2029002, "PTCHERRMAT12");

   ParamImpl<Object> G_PTCHERRMAT13 = new ParamImpl<Object>('G', 0X2029002, "PTCHERRMAT13");

   ParamImpl<Object> G_PTCHERRMAT14 = new ParamImpl<Object>('G', 0X20290030, "PTCHERRMAT14");

   ParamImpl<Object> G_PTCHERRMAT15 = new ParamImpl<Object>('G', 0X20290031, "PTCHERRMAT15");

   ParamImpl<Object> G_PTCHERRMAT16 = new ParamImpl<Object>('G', 0X20290032, "PTCHERRMAT16");

   ParamImpl<Object> G_PTCHERRMAT17 = new ParamImpl<Object>('G', 0X20290033, "PTCHERRMAT17");

   ParamImpl<Object> G_PTCHERRMAT18 = new ParamImpl<Object>('G', 0X20290034, "PTCHERRMAT18");

   ParamImpl<Object> G_PTCHERRMAT19 = new ParamImpl<Object>('G', 0X20290035, "PTCHERRMAT19");

   ParamImpl<Float> F_PTCENERGY = new ParamImpl<Float>('F', 0X20290036, "PTCENERGY");

   ParamImpl<Float> F_PTCEFF = new ParamImpl<Float>('F', 0X20290037, "PTCEFF");

   ParamImpl<Float> F_PTCDEFF = new ParamImpl<Float>('F', 0X20290038, "PTCDEFF");

   ParamImpl<Date> X_PTCALDATE = new ParamImpl<Date>('X', 0X20290039, "PTCALDATE");

   ParamImpl<String> T_COILIBVERS = new ParamImpl<String>('T', 0X202, "COILIBVERS");

   ParamImpl<Float> F_COILENERGY = new ParamImpl<Float>('F', 0X202, "COILENERGY");

   ParamImpl<Long> L_COILCODE = new ParamImpl<Long>('L', 0X202, "COILCODE");

   ParamImpl<Float> F_COILBRANCH = new ParamImpl<Float>('F', 0X202, "COILBRANCH");

   ParamImpl<Float> F_COILCONVER = new ParamImpl<Float>('F', 0X202, "COILCONVER");

   ParamImpl<Float> F_COILYIELD = new ParamImpl<Float>('F', 0X202, "COILYIELD");

   ParamImpl<Long> L_COILFLAGS = new ParamImpl<Long>('L', 0X202, "COILFLAGS");

   ParamImpl<Long> L_COICCODE = new ParamImpl<Long>('L', 0X202, "COICCODE");

   ParamImpl<Float> F_COICL0 = new ParamImpl<Float>('F', 0X202, "COICL0");

   ParamImpl<Float> F_COICL1 = new ParamImpl<Float>('F', 0X202, "COICL1");

   ParamImpl<Float> F_COICL2 = new ParamImpl<Float>('F', 0X202, "COICL2");

   ParamImpl<Float> F_COICL3 = new ParamImpl<Float>('F', 0X202, "COICL3");

   ParamImpl<Float> F_COICL4 = new ParamImpl<Float>('F', 0X202, "COICL4");

   ParamImpl<Float> F_COICL5 = new ParamImpl<Float>('F', 0X202, "COICL5");

   ParamImpl<Long> L_COICTYPE = new ParamImpl<Long>('L', 0X202, "COICTYPE");

   ParamImpl<String> T_PMNCLNAME = new ParamImpl<String>('T', 0X202, "PMNCLNAME");

   ParamImpl<String> T_PMTNIDVERS = new ParamImpl<String>('T', 0X202, "PMTNIDVERS");

   ParamImpl<Long> L_PMPEAKORIGIN = new ParamImpl<Long>('L', 0X202, "PMPEAKORIGIN");

   ParamImpl<Long> L_DIFPFLAGS = new ParamImpl<Long>('L', 0X202, "DIFPFLAGS");

   ParamImpl<Float> F_DIFPRHOTDP = new ParamImpl<Float>('F', 0X202, "DIFPRHOTDP");

   ParamImpl<Float> F_DIFPRHOTDPER = new ParamImpl<Float>('F', 0X202, "DIFPRHOTDPER");

   ParamImpl<Float> F_DIFPRHOTAD = new ParamImpl<Float>('F', 0X202, "DIFPRHOTAD");

   ParamImpl<Float> F_DIFPRHOTADER = new ParamImpl<Float>('F', 0X202, "DIFPRHOTADER");

   ParamImpl<String> T_DIFPVERS = new ParamImpl<String>('T', 0X202, "DIFPVERS");

   ParamImpl<Date> X_DIFPCALTIME = new ParamImpl<Date>('X', 0X202, "DIFPCALTIME");

   ParamImpl<String> T_DIFPOPNAME = new ParamImpl<String>('T', 0X202, "DIFPOPNAME");

   ParamImpl<Float> F_DIFPAVERHOT = new ParamImpl<Float>('F', 0X202, "DIFPAVERHOT");

   ParamImpl<Float> F_DIFPAVERHOTE = new ParamImpl<Float>('F', 0X202, "DIFPAVERHOTE");

   ParamImpl<String> T_DIFPNUCLIDE = new ParamImpl<String>('T', 0X202, "DIFPNUCLIDE");

   ParamImpl<Float> F_DIFPENERGY1 = new ParamImpl<Float>('F', 0X202, "DIFPENERGY1");

   ParamImpl<Float> F_DIFPENERGY2 = new ParamImpl<Float>('F', 0X202, "DIFPENERGY2");

   ParamImpl<Float> F_DIFPEPRAT = new ParamImpl<Float>('F', 0X202, "DIFPEPRAT");

   ParamImpl<Float> F_DIFPEPRATERR = new ParamImpl<Float>('F', 0X202, "DIFPEPRATERR");

   ParamImpl<Float> F_DIFPSPRAT = new ParamImpl<Float>('F', 0X202, "DIFPSPRAT");

   ParamImpl<Float> F_DIFPSPRATERR = new ParamImpl<Float>('F', 0X202, "DIFPSPRATERR");

   ParamImpl<Float> F_DIFPRHOT = new ParamImpl<Float>('F', 0X202, "DIFPRHOT");

   ParamImpl<Float> F_DIFPRHOTERR = new ParamImpl<Float>('F', 0X202, "DIFPRHOTERR");

   ParamImpl<String> T_DIFPCDESC = new ParamImpl<String>('T', 0X202, "DIFPCDESC");

   ParamImpl<Long> L_DIFPANALERR = new ParamImpl<Long>('L', 0X202, "DIFPANALERR");

   ParamImpl<Long> L_DIFPFAD = new ParamImpl<Long>('L', 0X202, "DIFPFAD");

   ParamImpl<Long> L_DIFPFDONE = new ParamImpl<Long>('L', 0X202, "DIFPFDONE");

   ParamImpl<Long> L_DIFPFDPSREJ = new ParamImpl<Long>('L', 0X202, "DIFPFDPSREJ");

   ParamImpl<Long> L_DIFPDPSREJ = new ParamImpl<Long>('L', 0X202, "DIFPDPSREJ");

   ParamImpl<Long> L_DIFPFDPREJEC = new ParamImpl<Long>('L', 0X202, "DIFPFDPREJEC");

   ParamImpl<Long> L_DIFPDPREJECT = new ParamImpl<Long>('L', 0X202, "DIFPDPREJECT");

   ParamImpl<Long> L_DIFPCALCNTID = new ParamImpl<Long>('L', 0X202, "DIFPCALCNTID");

   ParamImpl<Object> V_DIFPF_DONE = new ParamImpl<Object>('V', 0X00000000, "DIFPF_DONE");

   ParamImpl<Object> M_DIFPF_DONE = new ParamImpl<Object>('M', 0X00000001, "DIFPF_DONE");

   ParamImpl<Object> V_DIFPF_AD = new ParamImpl<Object>('V', 0X00000001, "DIFPF_AD");

   ParamImpl<Object> M_DIFPF_AD = new ParamImpl<Object>('M', 0X00000002, "DIFPF_AD");

   ParamImpl<Object> V_DIFPF_SREJECT = new ParamImpl<Object>('V', 0X00000002, "DIFPF_SREJECT");

   ParamImpl<Object> M_DIFPF_SREJECT = new ParamImpl<Object>('M', 0X00000004, "DIFPF_SREJECT");

   ParamImpl<Object> V_DIFPF_REJECT = new ParamImpl<Object>('V', 0X00000003, "DIFPF_REJECT");

   ParamImpl<Object> M_DIFPF_REJECT = new ParamImpl<Object>('M', 0X00000008, "DIFPF_REJECT");

   ParamImpl<Long> L_WNRFLAGS = new ParamImpl<Long>('L', 0X202, "WNRFLAGS");

   ParamImpl<Long> L_WNRFDATAAVL = new ParamImpl<Long>('L', 0X202, "WNRFDATAAVL");

   ParamImpl<Long> L_WNRFDREVIEW = new ParamImpl<Long>('L', 0X202, "WNRFDREVIEW");

   ParamImpl<Long> L_WNRFDONE = new ParamImpl<Long>('L', 0X202, "WNRFDONE");

   ParamImpl<Long> L_WNRRVWFLG0 = new ParamImpl<Long>('L', 0X202, "WNRRVWFLG0");

   ParamImpl<Long> L_WNRRVWFLG1 = new ParamImpl<Long>('L', 0X202, "WNRRVWFLG1");

   ParamImpl<Long> L_WNRRVWFLG2 = new ParamImpl<Long>('L', 0X202, "WNRRVWFLG2");

   ParamImpl<Long> L_WNRRVWFLG3 = new ParamImpl<Long>('L', 0X202, "WNRRVWFLG3");

   ParamImpl<Long> L_WNRRVWFLG4 = new ParamImpl<Long>('L', 0X202, "WNRRVWFLG4");

   ParamImpl<Long> L_WNRRVWFLG5 = new ParamImpl<Long>('L', 0X202, "WNRRVWFLG5");

   ParamImpl<Long> L_WNRRVWFLG6 = new ParamImpl<Long>('L', 0X202, "WNRRVWFLG6");

   ParamImpl<Long> L_WNRRVWFLG7 = new ParamImpl<Long>('L', 0X202, "WNRRVWFLG7");

   ParamImpl<Long> L_WNRSTATUS = new ParamImpl<Long>('L', 0X202, "WNRSTATUS");

   ParamImpl<String> T_WNRVERSION = new ParamImpl<String>('T', 0X202, "WNRVERSION");

   ParamImpl<Float> F_WNRBKGERR = new ParamImpl<Float>('F', 0X202, "WNRBKGERR");

   ParamImpl<Float> F_WNRDHEATERR = new ParamImpl<Float>('F', 0X202, "WNRDHEATERR");

   ParamImpl<Float> F_WNRFGEERR = new ParamImpl<Float>('F', 0X202, "WNRFGEERR");

   ParamImpl<Float> F_WNRPUMDAERR = new ParamImpl<Float>('F', 0X202, "WNRPUMDAERR");

   ParamImpl<Float> F_WNRMLTERR = new ParamImpl<Float>('F', 0X202, "WNRMLTERR");

   ParamImpl<Float> F_WNRPUMASSERR = new ParamImpl<Float>('F', 0X202, "WNRPUMASSERR");

   ParamImpl<Float> F_WNRPU239EAER = new ParamImpl<Float>('F', 0X202, "WNRPU239EAER");

   ParamImpl<Float> F_WNRPTERR = new ParamImpl<Float>('F', 0X202, "WNRPTERR");

   ParamImpl<Float> F_WNRAACTERR = new ParamImpl<Float>('F', 0X202, "WNRAACTERR");

   ParamImpl<Float> F_WNRTRUACTERR = new ParamImpl<Float>('F', 0X202, "WNRTRUACTERR");

   ParamImpl<Float> F_WNRAACT = new ParamImpl<Float>('F', 0X202, "WNRAACT");

   ParamImpl<Float> F_WNRTRUACT = new ParamImpl<Float>('F', 0X202, "WNRTRUACT");

   ParamImpl<Float> F_WNRDHEAT = new ParamImpl<Float>('F', 0X202, "WNRDHEAT");

   ParamImpl<Float> F_WNRFGE = new ParamImpl<Float>('F', 0X202, "WNRFGE");

   ParamImpl<Float> F_WNRPUMDA = new ParamImpl<Float>('F', 0X202, "WNRPUMDA");

   ParamImpl<Float> F_WNRPUMASS = new ParamImpl<Float>('F', 0X202, "WNRPUMASS");

   ParamImpl<Float> F_WNRUMASS = new ParamImpl<Float>('F', 0X202, "WNRUMASS");

   ParamImpl<Float> F_WNRPU239EA = new ParamImpl<Float>('F', 0X202, "WNRPU239EA");

   ParamImpl<Long> L_WNRWCLASS = new ParamImpl<Long>('L', 0X202, "WNRWCLASS");

   ParamImpl<Float> F_WNRISOACT = new ParamImpl<Float>('F', 0X202, "WNRISOACT");

   ParamImpl<Float> F_WNRISOACTERR = new ParamImpl<Float>('F', 0X202, "WNRISOACTERR");

   ParamImpl<Float> F_WNRISOMDA = new ParamImpl<Float>('F', 0X202, "WNRISOMDA");

   ParamImpl<Float> F_WNRISOMDAERR = new ParamImpl<Float>('F', 0X202, "WNRISOMDAERR");

   ParamImpl<Float> F_WNRSPECACT = new ParamImpl<Float>('F', 0X202, "WNRSPECACT");

   ParamImpl<String> T_WNRISONAME = new ParamImpl<String>('T', 0X202, "WNRISONAME");

   ParamImpl<Float> F_WNRUMASSERR = new ParamImpl<Float>('F', 0X202, "WNRUMASSERR");

   ParamImpl<Long> L_WNRISOACTSRC = new ParamImpl<Long>('L', 0X202, "WNRISOACTSRC");

   ParamImpl<Float> F_WNRFGEMDA = new ParamImpl<Float>('F', 0X202, "WNRFGEMDA");

   ParamImpl<Float> F_WNRRMAX = new ParamImpl<Float>('F', 0X202, "WNRRMAX");

   ParamImpl<Float> F_WNRRMIN = new ParamImpl<Float>('F', 0X202, "WNRRMIN");

   ParamImpl<Long> L_WNRRVWFLG8 = new ParamImpl<Long>('L', 0X202, "WNRRVWFLG8");

   ParamImpl<Long> L_WNRRVWFLG9 = new ParamImpl<Long>('L', 0X202, "WNRRVWFLG9");

   ParamImpl<Object> V_WNRF_DATAAVL = new ParamImpl<Object>('V', 0X00000000, "WNRF_DATAAVL");

   ParamImpl<Object> M_WNRF_DATAAVL = new ParamImpl<Object>('M', 0X00000001, "WNRF_DATAAVL");

   ParamImpl<Object> V_WNRF_REVIEW = new ParamImpl<Object>('V', 0X00000001, "WNRF_REVIEW");

   ParamImpl<Object> M_WNRF_REVIEW = new ParamImpl<Object>('M', 0X00000002, "WNRF_REVIEW");

   ParamImpl<Object> V_WNRF_DONE = new ParamImpl<Object>('V', 0X00000002, "WNRF_DONE");

   ParamImpl<Object> M_WNRF_DONE = new ParamImpl<Object>('M', 0X00000004, "WNRF_DONE");

   ParamImpl<Object> V_WNRF_RVWFLG0 = new ParamImpl<Object>('V', 0X00000003, "WNRF_RVWFLG0");

   ParamImpl<Object> M_WNRF_RVWFLG0 = new ParamImpl<Object>('M', 0X00000008, "WNRF_RVWFLG0");

   ParamImpl<Object> V_WNRF_RVWFLG1 = new ParamImpl<Object>('V', 0X00000004, "WNRF_RVWFLG1");

   ParamImpl<Object> M_WNRF_RVWFLG1 = new ParamImpl<Object>('M', 0X00000010, "WNRF_RVWFLG1");

   ParamImpl<Object> V_WNRF_RVWFLG2 = new ParamImpl<Object>('V', 0X00000005, "WNRF_RVWFLG2");

   ParamImpl<Object> M_WNRF_RVWFLG2 = new ParamImpl<Object>('M', 0X00000020, "WNRF_RVWFLG2");

   ParamImpl<Object> V_WNRF_RVWFLG3 = new ParamImpl<Object>('V', 0X00000006, "WNRF_RVWFLG3");

   ParamImpl<Object> M_WNRF_RVWFLG3 = new ParamImpl<Object>('M', 0X00000040, "WNRF_RVWFLG3");

   ParamImpl<Object> V_WNRF_RVWFLG4 = new ParamImpl<Object>('V', 0X00000007, "WNRF_RVWFLG4");

   ParamImpl<Object> M_WNRF_RVWFLG4 = new ParamImpl<Object>('M', 0X00000080, "WNRF_RVWFLG4");

   ParamImpl<Object> V_WNRF_RVWFLG5 = new ParamImpl<Object>('V', 0X00000008, "WNRF_RVWFLG5");

   ParamImpl<Object> M_WNRF_RVWFLG5 = new ParamImpl<Object>('M', 0X00000100, "WNRF_RVWFLG5");

   ParamImpl<Object> V_WNRF_RVWFLG6 = new ParamImpl<Object>('V', 0X00000009, "WNRF_RVWFLG6");

   ParamImpl<Object> M_WNRF_RVWFLG6 = new ParamImpl<Object>('M', 0X00000200, "WNRF_RVWFLG6");

   ParamImpl<Object> V_WNRF_RVWFLG7 = new ParamImpl<Object>('V', 0X0000000, "WNRF_RVWFLG7");

   ParamImpl<Object> M_WNRF_RVWFLG7 = new ParamImpl<Object>('M', 0X00000400, "WNRF_RVWFLG7");

   ParamImpl<Object> V_WNRF_RVWFLG8 = new ParamImpl<Object>('V', 0X0000000, "WNRF_RVWFLG8");

   ParamImpl<Object> M_WNRF_RVWFLG8 = new ParamImpl<Object>('M', 0X00000800, "WNRF_RVWFLG8");

   ParamImpl<Object> V_WNRF_RVWFLG9 = new ParamImpl<Object>('V', 0X0000000, "WNRF_RVWFLG9");

   ParamImpl<Object> M_WNRF_RVWFLG9 = new ParamImpl<Object>('M', 0X00001000, "WNRF_RVWFLG9");

   ParamImpl<Long> L_WGRFLAGS = new ParamImpl<Long>('L', 0X202, "WGRFLAGS");

   ParamImpl<Long> L_WGRFPDATAAVL = new ParamImpl<Long>('L', 0X202, "WGRFPDATAAVL");

   ParamImpl<Long> L_WGRFUDATAAVL = new ParamImpl<Long>('L', 0X202, "WGRFUDATAAVL");

   ParamImpl<Long> L_WGRFDREVIEW = new ParamImpl<Long>('L', 0X202, "WGRFDREVIEW");

   ParamImpl<Long> L_WGRFDONE = new ParamImpl<Long>('L', 0X202, "WGRFDONE");

   ParamImpl<Long> L_WGRRVWFLG0 = new ParamImpl<Long>('L', 0X202, "WGRRVWFLG0");

   ParamImpl<Long> L_WGRRVWFLG1 = new ParamImpl<Long>('L', 0X202, "WGRRVWFLG1");

   ParamImpl<Long> L_WGRRVWFLG2 = new ParamImpl<Long>('L', 0X202, "WGRRVWFLG2");

   ParamImpl<Long> L_WGRRVWFLG3 = new ParamImpl<Long>('L', 0X202, "WGRRVWFLG3");

   ParamImpl<Long> L_WGRRVWFLG4 = new ParamImpl<Long>('L', 0X202, "WGRRVWFLG4");

   ParamImpl<Long> L_WGRRVWFLG5 = new ParamImpl<Long>('L', 0X202, "WGRRVWFLG5");

   ParamImpl<Long> L_WGRRVWFLG6 = new ParamImpl<Long>('L', 0X202, "WGRRVWFLG6");

   ParamImpl<Long> L_WGRRVWFLG7 = new ParamImpl<Long>('L', 0X202, "WGRRVWFLG7");

   ParamImpl<Long> L_WGRRVWFLG8 = new ParamImpl<Long>('L', 0X202, "WGRRVWFLG8");

   ParamImpl<Long> L_WGRFFNIDENT = new ParamImpl<Long>('L', 0X202, "WGRFFNIDENT");

   ParamImpl<Long> L_WGRFPUIDENT = new ParamImpl<Long>('L', 0X202, "WGRFPUIDENT");

   ParamImpl<Long> L_WGRFUIDENT = new ParamImpl<Long>('L', 0X202, "WGRFUIDENT");

   ParamImpl<Long> L_WGRSTATUS = new ParamImpl<Long>('L', 0X202, "WGRSTATUS");

   ParamImpl<String> T_WGRVERSION = new ParamImpl<String>('T', 0X202, "WGRVERSION");

   ParamImpl<Float> F_WGRSRCERR = new ParamImpl<Float>('F', 0X202, "WGRSRCERR");

   ParamImpl<Float> F_WGRDHEATERR = new ParamImpl<Float>('F', 0X202, "WGRDHEATERR");

   ParamImpl<Float> F_WGRFGEERR = new ParamImpl<Float>('F', 0X202, "WGRFGEERR");

   ParamImpl<Float> F_WGRRMAX = new ParamImpl<Float>('F', 0X202, "WGRRMAX");

   ParamImpl<Float> F_WGRPUMASSERR = new ParamImpl<Float>('F', 0X202, "WGRPUMASSERR");

   ParamImpl<Float> F_WGRPU239EAER = new ParamImpl<Float>('F', 0X202, "WGRPU239EAER");

   ParamImpl<Float> F_WGRLUMPERR = new ParamImpl<Float>('F', 0X202, "WGRLUMPERR");

   ParamImpl<Float> F_WGRAACTERR = new ParamImpl<Float>('F', 0X202, "WGRAACTERR");

   ParamImpl<Float> F_WGRTRUACTERR = new ParamImpl<Float>('F', 0X202, "WGRTRUACTERR");

   ParamImpl<Float> F_WGRAACT = new ParamImpl<Float>('F', 0X202, "WGRAACT");

   ParamImpl<Float> F_WGRTRUACT = new ParamImpl<Float>('F', 0X202, "WGRTRUACT");

   ParamImpl<Float> F_WGRDHEAT = new ParamImpl<Float>('F', 0X202, "WGRDHEAT");

   ParamImpl<Float> F_WGRFGE = new ParamImpl<Float>('F', 0X202, "WGRFGE");

   ParamImpl<Float> F_WGRRMIN = new ParamImpl<Float>('F', 0X202, "WGRRMIN");

   ParamImpl<Float> F_WGRPUMASS = new ParamImpl<Float>('F', 0X202, "WGRPUMASS");

   ParamImpl<Float> F_WGRUMASS = new ParamImpl<Float>('F', 0X202, "WGRUMASS");

   ParamImpl<Float> F_WGRPU239EA = new ParamImpl<Float>('F', 0X202, "WGRPU239EA");

   ParamImpl<Float> F_WGRUMASSERR = new ParamImpl<Float>('F', 0X202, "WGRUMASSERR");

   ParamImpl<Long> L_WGRWCLASS = new ParamImpl<Long>('L', 0X202, "WGRWCLASS");

   ParamImpl<Float> F_WGRTMUACT = new ParamImpl<Float>('F', 0X202, "WGRTMUACT");

   ParamImpl<Float> F_WGRTMUACTERR = new ParamImpl<Float>('F', 0X202, "WGRTMUACTERR");

   ParamImpl<Float> F_WGRTMUMDA = new ParamImpl<Float>('F', 0X202, "WGRTMUMDA");

   ParamImpl<Float> F_WGRTMUMDAERR = new ParamImpl<Float>('F', 0X202, "WGRTMUMDAERR");

   ParamImpl<Float> F_WGRSPECACT = new ParamImpl<Float>('F', 0X202, "WGRSPECACT");

   ParamImpl<String> T_WGRTMUNAME = new ParamImpl<String>('T', 0X202, "WGRTMUNAME");

   ParamImpl<Long> L_WGRTMUACTSRC = new ParamImpl<Long>('L', 0X202, "WGRTMUACTSRC");

   ParamImpl<Float> F_WGRFGEMDA = new ParamImpl<Float>('F', 0X202, "WGRFGEMDA");

   ParamImpl<Long> L_WGRRVWFLG9 = new ParamImpl<Long>('L', 0X202, "WGRRVWFLG9");

   ParamImpl<Long> L_WGRRVWFLG10 = new ParamImpl<Long>('L', 0X202, "WGRRVWFLG10");

   ParamImpl<Long> L_WGRRVWFLG11 = new ParamImpl<Long>('L', 0X202, "WGRRVWFLG11");

   ParamImpl<Long> L_WGRFCSNOINTF = new ParamImpl<Long>('L', 0X202, "WGRFCSNOINTF");

   ParamImpl<Long> L_WGRFCSAMINTF = new ParamImpl<Long>('L', 0X202, "WGRFCSAMINTF");

   ParamImpl<Long> L_WGRFHEATSOUR = new ParamImpl<Long>('L', 0X202, "WGRFHEATSOUR");

   ParamImpl<Long> L_WGRFXSPU239 = new ParamImpl<Long>('L', 0X202, "WGRFXSPU239");

   ParamImpl<Object> V_WGRF_PDATAAVL = new ParamImpl<Object>('V', 0X00000000, "WGRF_PDATAAVL");

   ParamImpl<Object> M_WGRF_PDATAAVL = new ParamImpl<Object>('M', 0X00000001, "WGRF_PDATAAVL");

   ParamImpl<Object> V_WGRF_UDATAAVL = new ParamImpl<Object>('V', 0X00000001, "WGRF_UDATAAVL");

   ParamImpl<Object> M_WGRF_UDATAAVL = new ParamImpl<Object>('M', 0X00000002, "WGRF_UDATAAVL");

   ParamImpl<Object> V_WGRF_REVIEW = new ParamImpl<Object>('V', 0X00000002, "WGRF_REVIEW");

   ParamImpl<Object> M_WGRF_REVIEW = new ParamImpl<Object>('M', 0X00000004, "WGRF_REVIEW");

   ParamImpl<Object> V_WGRF_DONE = new ParamImpl<Object>('V', 0X00000003, "WGRF_DONE");

   ParamImpl<Object> M_WGRF_DONE = new ParamImpl<Object>('M', 0X00000008, "WGRF_DONE");

   ParamImpl<Object> V_WGRF_RVWFLG0 = new ParamImpl<Object>('V', 0X00000004, "WGRF_RVWFLG0");

   ParamImpl<Object> M_WGRF_RVWFLG0 = new ParamImpl<Object>('M', 0X00000010, "WGRF_RVWFLG0");

   ParamImpl<Object> V_WGRF_RVWFLG1 = new ParamImpl<Object>('V', 0X00000005, "WGRF_RVWFLG1");

   ParamImpl<Object> M_WGRF_RVWFLG1 = new ParamImpl<Object>('M', 0X00000020, "WGRF_RVWFLG1");

   ParamImpl<Object> V_WGRF_RVWFLG2 = new ParamImpl<Object>('V', 0X00000006, "WGRF_RVWFLG2");

   ParamImpl<Object> M_WGRF_RVWFLG2 = new ParamImpl<Object>('M', 0X00000040, "WGRF_RVWFLG2");

   ParamImpl<Object> V_WGRF_RVWFLG3 = new ParamImpl<Object>('V', 0X00000007, "WGRF_RVWFLG3");

   ParamImpl<Object> M_WGRF_RVWFLG3 = new ParamImpl<Object>('M', 0X00000080, "WGRF_RVWFLG3");

   ParamImpl<Object> V_WGRF_RVWFLG4 = new ParamImpl<Object>('V', 0X00000008, "WGRF_RVWFLG4");

   ParamImpl<Object> M_WGRF_RVWFLG4 = new ParamImpl<Object>('M', 0X00000100, "WGRF_RVWFLG4");

   ParamImpl<Object> V_WGRF_RVWFLG5 = new ParamImpl<Object>('V', 0X00000009, "WGRF_RVWFLG5");

   ParamImpl<Object> M_WGRF_RVWFLG5 = new ParamImpl<Object>('M', 0X00000200, "WGRF_RVWFLG5");

   ParamImpl<Object> V_WGRF_RVWFLG6 = new ParamImpl<Object>('V', 0X0000000, "WGRF_RVWFLG6");

   ParamImpl<Object> M_WGRF_RVWFLG6 = new ParamImpl<Object>('M', 0X00000400, "WGRF_RVWFLG6");

   ParamImpl<Object> V_WGRF_RVWFLG7 = new ParamImpl<Object>('V', 0X0000000, "WGRF_RVWFLG7");

   ParamImpl<Object> M_WGRF_RVWFLG7 = new ParamImpl<Object>('M', 0X00000800, "WGRF_RVWFLG7");

   ParamImpl<Object> V_WGRF_RVWFLG8 = new ParamImpl<Object>('V', 0X0000000, "WGRF_RVWFLG8");

   ParamImpl<Object> M_WGRF_RVWFLG8 = new ParamImpl<Object>('M', 0X00001000, "WGRF_RVWFLG8");

   ParamImpl<Object> V_WGRF_FNIDENT = new ParamImpl<Object>('V', 0X0000000, "WGRF_FNIDENT");

   ParamImpl<Object> M_WGRF_FNIDENT = new ParamImpl<Object>('M', 0X00002000, "WGRF_FNIDENT");

   ParamImpl<Object> V_WGRF_PUIDENT = new ParamImpl<Object>('V', 0X0000000, "WGRF_PUIDENT");

   ParamImpl<Object> M_WGRF_PUIDENT = new ParamImpl<Object>('M', 0X00004000, "WGRF_PUIDENT");

   ParamImpl<Object> V_WGRF_UIDENT = new ParamImpl<Object>('V', 0X0000000, "WGRF_UIDENT");

   ParamImpl<Object> M_WGRF_UIDENT = new ParamImpl<Object>('M', 0X00008000, "WGRF_UIDENT");

   ParamImpl<Object> V_WGRF_RVWFLG9 = new ParamImpl<Object>('V', 0X00000010, "WGRF_RVWFLG9");

   ParamImpl<Object> M_WGRF_RVWFLG9 = new ParamImpl<Object>('M', 0X00010000, "WGRF_RVWFLG9");

   ParamImpl<Object> V_WGRF_RVWFLG10 = new ParamImpl<Object>('V', 0X00000011, "WGRF_RVWFLG10");

   ParamImpl<Object> M_WGRF_RVWFLG10 = new ParamImpl<Object>('M', 0X00020000, "WGRF_RVWFLG10");

   ParamImpl<Object> V_WGRF_RVWFLG11 = new ParamImpl<Object>('V', 0X00000012, "WGRF_RVWFLG11");

   ParamImpl<Object> M_WGRF_RVWFLG11 = new ParamImpl<Object>('M', 0X00040000, "WGRF_RVWFLG11");

   ParamImpl<Object> V_WGRF_CSNOINTF = new ParamImpl<Object>('V', 0X00000013, "WGRF_CSNOINTF");

   ParamImpl<Object> M_WGRF_CSNOINTF = new ParamImpl<Object>('M', 0X00080000, "WGRF_CSNOINTF");

   ParamImpl<Object> V_WGRF_CSAMINTF = new ParamImpl<Object>('V', 0X00000014, "WGRF_CSAMINTF");

   ParamImpl<Object> M_WGRF_CSAMINTF = new ParamImpl<Object>('M', 0X00100000, "WGRF_CSAMINTF");

   ParamImpl<Object> V_WGRF_HEATSOUR = new ParamImpl<Object>('V', 0X00000015, "WGRF_HEATSOUR");

   ParamImpl<Object> M_WGRF_HEATSOUR = new ParamImpl<Object>('M', 0X00200000, "WGRF_HEATSOUR");

   ParamImpl<Object> V_WGRF_XSPU239 = new ParamImpl<Object>('V', 0X00000016, "WGRF_XSPU239");

   ParamImpl<Object> M_WGRF_XSPU239 = new ParamImpl<Object>('M', 0X00400000, "WGRF_XSPU239");

   ParamImpl<Long> L_MCRFLAGS = new ParamImpl<Long>('L', 0X20300002, "MCRFLAGS");

   ParamImpl<Long> L_MCRFREVIEW = new ParamImpl<Long>('L', 0X20300003, "MCRFREVIEW");

   ParamImpl<Long> L_MCRFDONE = new ParamImpl<Long>('L', 0X20300004, "MCRFDONE");

   ParamImpl<Long> L_MCRFRESCOMPF = new ParamImpl<Long>('L', 0X20300005, "MCRFRESCOMPF");

   ParamImpl<Long> L_MCRSTATUS = new ParamImpl<Long>('L', 0X20300006, "MCRSTATUS");

   ParamImpl<String> T_MCRVERSION = new ParamImpl<String>('T', 0X20300007, "MCRVERSION");

   ParamImpl<Long> L_MCRINPCOMB = new ParamImpl<Long>('L', 0X20300008, "MCRINPCOMB");

   ParamImpl<Long> L_MCROUTCOMB = new ParamImpl<Long>('L', 0X20300009, "MCROUTCOMB");

   ParamImpl<Float> F_MCRDHEATERR = new ParamImpl<Float>('F', 0X2030000, "MCRDHEATERR");

   ParamImpl<Float> F_MCRFGEERR = new ParamImpl<Float>('F', 0X2030000, "MCRFGEERR");

   ParamImpl<Float> F_MCRPUMASSERR = new ParamImpl<Float>('F', 0X2030000, "MCRPUMASSERR");

   ParamImpl<Float> F_MCRPU239EAER = new ParamImpl<Float>('F', 0X2030000, "MCRPU239EAER");

   ParamImpl<Float> F_MCRAACTERR = new ParamImpl<Float>('F', 0X2030000, "MCRAACTERR");

   ParamImpl<Float> F_MCRTRUACTERR = new ParamImpl<Float>('F', 0X2030000, "MCRTRUACTERR");

   ParamImpl<Float> F_MCRAACT = new ParamImpl<Float>('F', 0X20300010, "MCRAACT");

   ParamImpl<Float> F_MCRTRUACT = new ParamImpl<Float>('F', 0X20300011, "MCRTRUACT");

   ParamImpl<Float> F_MCRDHEAT = new ParamImpl<Float>('F', 0X20300012, "MCRDHEAT");

   ParamImpl<Float> F_MCRFGE = new ParamImpl<Float>('F', 0X20300013, "MCRFGE");

   ParamImpl<Float> F_MCRPUMASS = new ParamImpl<Float>('F', 0X20300014, "MCRPUMASS");

   ParamImpl<Float> F_MCRUMASS = new ParamImpl<Float>('F', 0X20300015, "MCRUMASS");

   ParamImpl<Float> F_MCRPU239EA = new ParamImpl<Float>('F', 0X20300016, "MCRPU239EA");

   ParamImpl<Float> F_MCRUMASSERR = new ParamImpl<Float>('F', 0X20300017, "MCRUMASSERR");

   ParamImpl<Long> L_MCRWCLASS = new ParamImpl<Long>('L', 0X20300018, "MCRWCLASS");

   ParamImpl<Float> F_MCRISOACT = new ParamImpl<Float>('F', 0X20300019, "MCRISOACT");

   ParamImpl<Float> F_MCRISOACTERR = new ParamImpl<Float>('F', 0X2030001, "MCRISOACTERR");

   ParamImpl<Float> F_MCRISOMDA = new ParamImpl<Float>('F', 0X2030001, "MCRISOMDA");

   ParamImpl<Float> F_MCRISOMDAERR = new ParamImpl<Float>('F', 0X2030001, "MCRISOMDAERR");

   ParamImpl<Float> F_MCRSPECACT = new ParamImpl<Float>('F', 0X2030001, "MCRSPECACT");

   ParamImpl<String> T_MCRISONAME = new ParamImpl<String>('T', 0X2030001, "MCRISONAME");

   ParamImpl<Long> L_MCRISOACTSRC = new ParamImpl<Long>('L', 0X2030001, "MCRISOACTSRC");

   ParamImpl<Float> F_MCRFGEMDA = new ParamImpl<Float>('F', 0X20300020, "MCRFGEMDA");

   ParamImpl<Long> L_MCRFGEMAX = new ParamImpl<Long>('L', 0X20300021, "MCRFGEMAX");

   ParamImpl<Object> V_MCRF_DONE = new ParamImpl<Object>('V', 0X00000000, "MCRF_DONE");

   ParamImpl<Object> M_MCRF_DONE = new ParamImpl<Object>('M', 0X00000001, "MCRF_DONE");

   ParamImpl<Object> V_MCRF_REVIEW = new ParamImpl<Object>('V', 0X00000001, "MCRF_REVIEW");

   ParamImpl<Object> M_MCRF_REVIEW = new ParamImpl<Object>('M', 0X00000002, "MCRF_REVIEW");

   ParamImpl<Object> V_MCRF_RESCOMPF = new ParamImpl<Object>('V', 0X00000002, "MCRF_RESCOMPF");

   ParamImpl<Object> M_MCRF_RESCOMPF = new ParamImpl<Object>('M', 0X00000004, "MCRF_RESCOMPF");

   ParamImpl<Object> V_MCRF_GFNNOTID = new ParamImpl<Object>('V', 0X00000003, "MCRF_GFNNOTID");

   ParamImpl<Object> M_MCRF_GFNNOTID = new ParamImpl<Object>('M', 0X00000008, "MCRF_GFNNOTID");

   ParamImpl<Object> V_MCRF_MAXFGE = new ParamImpl<Object>('V', 0X00000004, "MCRF_MAXFGE");

   ParamImpl<Object> M_MCRF_MAXFGE = new ParamImpl<Object>('M', 0X00000010, "MCRF_MAXFGE");

   ParamImpl<Long> L_DDAFLAGS = new ParamImpl<Long>('L', 0X20310002, "DDAFLAGS");

   ParamImpl<Long> L_DDAFMASSTL = new ParamImpl<Long>('L', 0X20310003, "DDAFMASSTL");

   ParamImpl<Long> L_DDAFMASSTH = new ParamImpl<Long>('L', 0X20310004, "DDAFMASSTH");

   ParamImpl<Long> L_DDAFCRTL = new ParamImpl<Long>('L', 0X20310005, "DDAFCRTL");

   ParamImpl<Long> L_DDAFCRTH = new ParamImpl<Long>('L', 0X20310006, "DDAFCRTH");

   ParamImpl<Long> L_DDAFDONE = new ParamImpl<Long>('L', 0X20310007, "DDAFDONE");

   ParamImpl<Long> L_DDASTATUS = new ParamImpl<Long>('L', 0X20310008, "DDASTATUS");

   ParamImpl<String> T_DDAVERSION = new ParamImpl<String>('T', 0X20310009, "DDAVERSION");

   ParamImpl<Float> F_DDAMODINDEX = new ParamImpl<Float>('F', 0X2031000, "DDAMODINDEX");

   ParamImpl<Float> F_DDAABSINDEX = new ParamImpl<Float>('F', 0X2031000, "DDAABSINDEX");

   ParamImpl<Float> F_DDAMODCF = new ParamImpl<Float>('F', 0X2031000, "DDAMODCF");

   ParamImpl<Float> F_DDAABSCF = new ParamImpl<Float>('F', 0X2031000, "DDAABSCF");

   ParamImpl<Float> F_DDAAMATRIXCF = new ParamImpl<Float>('F', 0X2031000, "DDAAMATRIXCF");

   ParamImpl<Float> F_DDAINTERRBKG = new ParamImpl<Float>('F', 0X2031000, "DDAINTERRBKG");

   ParamImpl<Float> F_DDAEQMASSINI = new ParamImpl<Float>('F', 0X20310010, "DDAEQMASSINI");

   ParamImpl<Float> F_DDASELFABSCF = new ParamImpl<Float>('F', 0X20310011, "DDASELFABSCF");

   ParamImpl<Float> F_DDAEQMASSSAC = new ParamImpl<Float>('F', 0X20310012, "DDAEQMASSSAC");

   ParamImpl<Float> F_DDAEQMASSBC = new ParamImpl<Float>('F', 0X20310013, "DDAEQMASSBC");

   ParamImpl<Float> F_DDAEQMASSBCE = new ParamImpl<Float>('F', 0X20310014, "DDAEQMASSBCE");

   ParamImpl<Float> F_DDAPUMASS = new ParamImpl<Float>('F', 0X20310015, "DDAPUMASS");

   ParamImpl<Float> F_DDAPUMASSE = new ParamImpl<Float>('F', 0X20310016, "DDAPUMASSE");

   ParamImpl<Float> F_DDACHMBBLRAT = new ParamImpl<Float>('F', 0X20310017, "DDACHMBBLRAT");

   ParamImpl<Float> F_DDACHMBBLRAE = new ParamImpl<Float>('F', 0X20310018, "DDACHMBBLRAE");

   ParamImpl<Float> F_DDACHMBBARAT = new ParamImpl<Float>('F', 0X20310019, "DDACHMBBARAT");

   ParamImpl<Float> F_DDACHMBBARAE = new ParamImpl<Float>('F', 0X2031001, "DDACHMBBARAE");

   ParamImpl<Float> F_DDACHMBSHRAT = new ParamImpl<Float>('F', 0X2031001, "DDACHMBSHRAT");

   ParamImpl<Float> F_DDACHMBSHRAE = new ParamImpl<Float>('F', 0X2031001, "DDACHMBSHRAE");

   ParamImpl<Long> L_DDASOURCETYP = new ParamImpl<Long>('L', 0X2031001, "DDASOURCETYP");

   ParamImpl<Float> F_DDAREALELAPS = new ParamImpl<Float>('F', 0X2031001, "DDAREALELAPS");

   ParamImpl<Float> F_DDANSRATE = new ParamImpl<Float>('F', 0X2031001, "DDANSRATE");

   ParamImpl<Float> F_DDANSRATEERR = new ParamImpl<Float>('F', 0X20310020, "DDANSRATEERR");

   ParamImpl<Float> F_DDAINVDWELL = new ParamImpl<Float>('F', 0X20310021, "DDAINVDWELL");

   ParamImpl<Float> F_DDATRIGFREQ = new ParamImpl<Float>('F', 0X20310022, "DDATRIGFREQ");

   ParamImpl<Long> L_DDAGATETYPE = new ParamImpl<Long>('L', 0X20310023, "DDAGATETYPE");

   ParamImpl<Float> F_DDAGATEDELAY = new ParamImpl<Float>('F', 0X20310024, "DDAGATEDELAY");

   ParamImpl<Float> F_DDAGATEFSTRT = new ParamImpl<Float>('F', 0X20310025, "DDAGATEFSTRT");

   ParamImpl<Float> F_DDAGATEFSTOP = new ParamImpl<Float>('F', 0X20310026, "DDAGATEFSTOP");

   ParamImpl<Long> L_DDAGATEISTRT = new ParamImpl<Long>('L', 0X20310027, "DDAGATEISTRT");

   ParamImpl<Long> L_DDAGATEISTOP = new ParamImpl<Long>('L', 0X20310028, "DDAGATEISTOP");

   ParamImpl<Float> F_DDAEFFELAPS = new ParamImpl<Float>('F', 0X20310029, "DDAEFFELAPS");

   ParamImpl<Float> F_DDASRATE = new ParamImpl<Float>('F', 0X2031002, "DDASRATE");

   ParamImpl<Float> F_DDASRATEERR = new ParamImpl<Float>('F', 0X2031002, "DDASRATEERR");

   ParamImpl<Float> F_DDAGATEWIDTH = new ParamImpl<Float>('F', 0X2031002, "DDAGATEWIDTH");

   ParamImpl<Long> L_DDAFMITL = new ParamImpl<Long>('L', 0X2031002, "DDAFMITL");

   ParamImpl<Long> L_DDAFMITH = new ParamImpl<Long>('L', 0X2031002, "DDAFMITH");

   ParamImpl<Long> L_DDAFAITL = new ParamImpl<Long>('L', 0X2031002, "DDAFAITL");

   ParamImpl<Long> L_DDAFAITH = new ParamImpl<Long>('L', 0X20310030, "DDAFAITH");

   ParamImpl<Float> F_DDAEQMASSMDA = new ParamImpl<Float>('F', 0X20310031, "DDAEQMASSMDA");

   ParamImpl<Float> F_DDAPUMASSMDA = new ParamImpl<Float>('F', 0X20310032, "DDAPUMASSMDA");

   ParamImpl<String> T_DDAISOSRC = new ParamImpl<String>('T', 0X20310033, "DDAISOSRC");

   ParamImpl<Float> F_DDACHMBRATE = new ParamImpl<Float>('F', 0X20310034, "DDACHMBRATE");

   ParamImpl<Float> F_DDACHMBRATEE = new ParamImpl<Float>('F', 0X20310035, "DDACHMBRATEE");

   ParamImpl<Float> F_DDAUMASS = new ParamImpl<Float>('F', 0X20310036, "DDAUMASS");

   ParamImpl<Float> F_DDAUMASSE = new ParamImpl<Float>('F', 0X20310037, "DDAUMASSE");

   ParamImpl<Float> F_DDAUMASSMDA = new ParamImpl<Float>('F', 0X20310038, "DDAUMASSMDA");

   ParamImpl<Object> V_DDAF_MASSTL = new ParamImpl<Object>('V', 0X00000000, "DDAF_MASSTL");

   ParamImpl<Object> M_DDAF_MASSTL = new ParamImpl<Object>('M', 0X00000001, "DDAF_MASSTL");

   ParamImpl<Object> V_DDAF_MASSTH = new ParamImpl<Object>('V', 0X00000001, "DDAF_MASSTH");

   ParamImpl<Object> M_DDAF_MASSTH = new ParamImpl<Object>('M', 0X00000002, "DDAF_MASSTH");

   ParamImpl<Object> V_DDAF_CRTL = new ParamImpl<Object>('V', 0X00000002, "DDAF_CRTL");

   ParamImpl<Object> M_DDAF_CRTL = new ParamImpl<Object>('M', 0X00000004, "DDAF_CRTL");

   ParamImpl<Object> V_DDAF_CRTH = new ParamImpl<Object>('V', 0X00000003, "DDAF_CRTH");

   ParamImpl<Object> M_DDAF_CRTH = new ParamImpl<Object>('M', 0X00000008, "DDAF_CRTH");

   ParamImpl<Object> V_DDAF_DONE = new ParamImpl<Object>('V', 0X00000004, "DDAF_DONE");

   ParamImpl<Object> M_DDAF_DONE = new ParamImpl<Object>('M', 0X00000010, "DDAF_DONE");

   ParamImpl<Object> V_DDAF_MITL = new ParamImpl<Object>('V', 0X00000005, "DDAF_MITL");

   ParamImpl<Object> M_DDAF_MITL = new ParamImpl<Object>('M', 0X00000020, "DDAF_MITL");

   ParamImpl<Object> V_DDAF_MITH = new ParamImpl<Object>('V', 0X00000006, "DDAF_MITH");

   ParamImpl<Object> M_DDAF_MITH = new ParamImpl<Object>('M', 0X00000040, "DDAF_MITH");

   ParamImpl<Object> V_DDAF_AITL = new ParamImpl<Object>('V', 0X00000007, "DDAF_AITL");

   ParamImpl<Object> M_DDAF_AITL = new ParamImpl<Object>('M', 0X00000080, "DDAF_AITL");

   ParamImpl<Object> V_DDAF_AITH = new ParamImpl<Object>('V', 0X00000008, "DDAF_AITH");

   ParamImpl<Object> M_DDAF_AITH = new ParamImpl<Object>('M', 0X00000100, "DDAF_AITH");

   ParamImpl<Object> V_DDAF_RATESDONE = new ParamImpl<Object>('V', 0X00000009, "DDAF_RATESDONE");

   ParamImpl<Object> M_DDAF_RATESDONE = new ParamImpl<Object>('M', 0X00000200, "DDAF_RATESDONE");

   ParamImpl<Object> M_DDAF_NOPASSIVEBKGD = new ParamImpl<Object>('M', 0X00000400, "DDAF_NOPASSIVEBKGD");

   ParamImpl<Object> M_DDAF_DEFABSINDEXUSED = new ParamImpl<Object>('M', 0X00000800, "DDAF_DEFABSINDEXUSED");

   ParamImpl<Object> M_DDAF_MODINDEXCALCAAS = new ParamImpl<Object>('M', 0X00001000, "DDAF_MODINDEXCALCAAS");

   ParamImpl<Object> M_DDAF_DEFMODINDEXUSED = new ParamImpl<Object>('M', 0X00002000, "DDAF_DEFMODINDEXUSED");

   ParamImpl<Object> M_DDAF_DEFMODCFUSED = new ParamImpl<Object>('M', 0X00004000, "DDAF_DEFMODCFUSED");

   ParamImpl<Object> M_DDAF_DEFABSCFUSED = new ParamImpl<Object>('M', 0X00008000, "DDAF_DEFABSCFUSED");

   ParamImpl<Object> M_DDAF_SUPPACTVMTXCFUSED = new ParamImpl<Object>('M', 0X00010000, "DDAF_SUPPACTVMTXCFUSED");

   ParamImpl<Object> M_DDAF_BKINTSETTOZERO = new ParamImpl<Object>('M', 0X00020000, "DDAF_BKINTSETTOZERO");

   ParamImpl<Object> M_DDAF_SACFSETTOUNITY = new ParamImpl<Object>('M', 0X00040000, "DDAF_SACFSETTOUNITY");

   ParamImpl<Object> M_DDAF_BIASCFSETTOUNITY = new ParamImpl<Object>('M', 0X00080000, "DDAF_BIASCFSETTOUNITY");

   ParamImpl<Long> L_WDRFLAGS = new ParamImpl<Long>('L', 0X20320002, "WDRFLAGS");

   ParamImpl<Long> L_WDRFDATAAVL = new ParamImpl<Long>('L', 0X20320003, "WDRFDATAAVL");

   ParamImpl<Long> L_WDRFDREVIEW = new ParamImpl<Long>('L', 0X20320004, "WDRFDREVIEW");

   ParamImpl<Long> L_WDRFDONE = new ParamImpl<Long>('L', 0X20320005, "WDRFDONE");

   ParamImpl<Long> L_WDRRVWFLG0 = new ParamImpl<Long>('L', 0X20320006, "WDRRVWFLG0");

   ParamImpl<Long> L_WDRSTATUS = new ParamImpl<Long>('L', 0X20320007, "WDRSTATUS");

   ParamImpl<String> T_WDRVERSION = new ParamImpl<String>('T', 0X20320008, "WDRVERSION");

   ParamImpl<Float> F_WDRDHEATERR = new ParamImpl<Float>('F', 0X20320009, "WDRDHEATERR");

   ParamImpl<Float> F_WDRFGEERR = new ParamImpl<Float>('F', 0X2032000, "WDRFGEERR");

   ParamImpl<Float> F_WDRUMASSERR = new ParamImpl<Float>('F', 0X2032000, "WDRUMASSERR");

   ParamImpl<Float> F_WDRPUMASSERR = new ParamImpl<Float>('F', 0X2032000, "WDRPUMASSERR");

   ParamImpl<Float> F_WDRPU239EAER = new ParamImpl<Float>('F', 0X2032000, "WDRPU239EAER");

   ParamImpl<Float> F_WDRAACTERR = new ParamImpl<Float>('F', 0X2032000, "WDRAACTERR");

   ParamImpl<Float> F_WDRTRUACTERR = new ParamImpl<Float>('F', 0X2032000, "WDRTRUACTERR");

   ParamImpl<Float> F_WDRAACT = new ParamImpl<Float>('F', 0X20320010, "WDRAACT");

   ParamImpl<Float> F_WDRTRUACT = new ParamImpl<Float>('F', 0X20320011, "WDRTRUACT");

   ParamImpl<Float> F_WDRDHEAT = new ParamImpl<Float>('F', 0X20320012, "WDRDHEAT");

   ParamImpl<Float> F_WDRFGE = new ParamImpl<Float>('F', 0X20320013, "WDRFGE");

   ParamImpl<Float> F_WDREQMASSERR = new ParamImpl<Float>('F', 0X20320014, "WDREQMASSERR");

   ParamImpl<Float> F_WDRMATRIXERR = new ParamImpl<Float>('F', 0X20320015, "WDRMATRIXERR");

   ParamImpl<Float> F_WDRUMASS = new ParamImpl<Float>('F', 0X20320016, "WDRUMASS");

   ParamImpl<Float> F_WDRPU239EA = new ParamImpl<Float>('F', 0X20320017, "WDRPU239EA");

   ParamImpl<Long> L_WDRWCLASS = new ParamImpl<Long>('L', 0X20320018, "WDRWCLASS");

   ParamImpl<Float> F_WDRFGEMDA = new ParamImpl<Float>('F', 0X20320019, "WDRFGEMDA");

   ParamImpl<Float> F_WDRISOACT = new ParamImpl<Float>('F', 0X2032001, "WDRISOACT");

   ParamImpl<Float> F_WDRISOACTERR = new ParamImpl<Float>('F', 0X2032001, "WDRISOACTERR");

   ParamImpl<Float> F_WDRISOMDA = new ParamImpl<Float>('F', 0X2032001, "WDRISOMDA");

   ParamImpl<Float> F_WDRISOMDAERR = new ParamImpl<Float>('F', 0X2032001, "WDRISOMDAERR");

   ParamImpl<Float> F_WDRSPECACT = new ParamImpl<Float>('F', 0X2032001, "WDRSPECACT");

   ParamImpl<String> T_WDRISONAME = new ParamImpl<String>('T', 0X2032001, "WDRISONAME");

   ParamImpl<Long> L_WDRISOACTSRC = new ParamImpl<Long>('L', 0X20320020, "WDRISOACTSRC");

   ParamImpl<Float> F_WDRPTERROR = new ParamImpl<Float>('F', 0X20320021, "WDRPTERROR");

   ParamImpl<Float> F_WDRSSERROR = new ParamImpl<Float>('F', 0X20320022, "WDRSSERROR");

   ParamImpl<Float> F_WDRRMAX = new ParamImpl<Float>('F', 0X20320023, "WDRRMAX");

   ParamImpl<Float> F_WDRRMIN = new ParamImpl<Float>('F', 0X20320024, "WDRRMIN");

   ParamImpl<Long> L_WDRRVWFLG5 = new ParamImpl<Long>('L', 0X20320025, "WDRRVWFLG5");

   ParamImpl<Object> V_WDRF_DATAAVL = new ParamImpl<Object>('V', 0X00000000, "WDRF_DATAAVL");

   ParamImpl<Object> M_WDRF_DATAAVL = new ParamImpl<Object>('M', 0X00000001, "WDRF_DATAAVL");

   ParamImpl<Object> V_WDRF_REVIEW = new ParamImpl<Object>('V', 0X00000001, "WDRF_REVIEW");

   ParamImpl<Object> M_WDRF_REVIEW = new ParamImpl<Object>('M', 0X00000002, "WDRF_REVIEW");

   ParamImpl<Object> V_WDRF_DONE = new ParamImpl<Object>('V', 0X00000002, "WDRF_DONE");

   ParamImpl<Object> M_WDRF_DONE = new ParamImpl<Object>('M', 0X00000004, "WDRF_DONE");

   ParamImpl<Object> V_WDRF_RVWFLG0 = new ParamImpl<Object>('V', 0X00000003, "WDRF_RVWFLG0");

   ParamImpl<Object> M_WDRF_RVWFLG0 = new ParamImpl<Object>('M', 0X00000008, "WDRF_RVWFLG0");

   ParamImpl<Object> V_WDRF_RVWFLG1 = new ParamImpl<Object>('V', 0X00000004, "WDRF_RVWFLG1");

   ParamImpl<Object> M_WDRF_RVWFLG1 = new ParamImpl<Object>('M', 0X00000010, "WDRF_RVWFLG1");

   ParamImpl<Object> V_WDRF_RVWFLG2 = new ParamImpl<Object>('V', 0X00000005, "WDRF_RVWFLG2");

   ParamImpl<Object> M_WDRF_RVWFLG2 = new ParamImpl<Object>('M', 0X00000020, "WDRF_RVWFLG2");

   ParamImpl<Object> V_WDRF_RVWFLG3 = new ParamImpl<Object>('V', 0X00000006, "WDRF_RVWFLG3");

   ParamImpl<Object> M_WDRF_RVWFLG3 = new ParamImpl<Object>('M', 0X00000040, "WDRF_RVWFLG3");

   ParamImpl<Object> V_WDRF_RVWFLG4 = new ParamImpl<Object>('V', 0X00000007, "WDRF_RVWFLG4");

   ParamImpl<Object> M_WDRF_RVWFLG4 = new ParamImpl<Object>('M', 0X00000080, "WDRF_RVWFLG4");

   ParamImpl<Object> V_WDRF_RVWFLG5 = new ParamImpl<Object>('V', 0X00000008, "WDRF_RVWFLG5");

   ParamImpl<Object> M_WDRF_RVWFLG5 = new ParamImpl<Object>('M', 0X00000100, "WDRF_RVWFLG5");

   ParamImpl<Long> L_TROIDFLAGS = new ParamImpl<Long>('L', 0X20330002, "TROIDFLAGS");

   ParamImpl<Long> L_TROIDFTYPE = new ParamImpl<Long>('L', 0X20330003, "TROIDFTYPE");

   ParamImpl<String> T_TROIDCOMMENT = new ParamImpl<String>('T', 0X20330004, "TROIDCOMMENT");

   ParamImpl<Long> L_TROIDROITYPE = new ParamImpl<Long>('L', 0X20330005, "TROIDROITYPE");

   ParamImpl<String> T_TROIDNUCLIDE = new ParamImpl<String>('T', 0X20330006, "TROIDNUCLIDE");

   ParamImpl<Float> F_TROIDENERGY = new ParamImpl<Float>('F', 0X20330007, "TROIDENERGY");

   ParamImpl<Float> F_TROIDCALFACT = new ParamImpl<Float>('F', 0X20330008, "TROIDCALFACT");

   ParamImpl<Float> F_TROIDLSTART = new ParamImpl<Float>('F', 0X20330009, "TROIDLSTART");

   ParamImpl<Float> F_TROIDLEND = new ParamImpl<Float>('F', 0X2033000, "TROIDLEND");

   ParamImpl<Float> F_TROIDPSTART = new ParamImpl<Float>('F', 0X2033000, "TROIDPSTART");

   ParamImpl<Float> F_TROIDPEND = new ParamImpl<Float>('F', 0X2033000, "TROIDPEND");

   ParamImpl<Float> F_TROIDRSTART = new ParamImpl<Float>('F', 0X2033000, "TROIDRSTART");

   ParamImpl<Float> F_TROIDREND = new ParamImpl<Float>('F', 0X2033000, "TROIDREND");

   ParamImpl<Date> X_TROIDEDITDAT = new ParamImpl<Date>('X', 0X2033000, "TROIDEDITDAT");

   ParamImpl<Float> F_TROIDFIDU = new ParamImpl<Float>('F', 0X20330010, "TROIDFIDU");

   ParamImpl<Float> F_TROIDCALFACE = new ParamImpl<Float>('F', 0X20330011, "TROIDCALFACE");

   ParamImpl<Float> F_TROIDATTEN = new ParamImpl<Float>('F', 0X20330012, "TROIDATTEN");

   ParamImpl<Long> L_TROIDROIFLAG = new ParamImpl<Long>('L', 0X20330013, "TROIDROIFLAG");

   ParamImpl<Long> L_TROIDFMULTM = new ParamImpl<Long>('L', 0X20330014, "TROIDFMULTM");

   ParamImpl<Long> L_TROIDFNOEVAL = new ParamImpl<Long>('L', 0X20330015, "TROIDFNOEVAL");

   ParamImpl<Long> L_TROIDFNOSUM = new ParamImpl<Long>('L', 0X20330016, "TROIDFNOSUM");

   ParamImpl<Object> V_TROI_FTYPE = new ParamImpl<Object>('V', 0X00000000, "TROI_FTYPE");

   ParamImpl<Object> M_TROI_FTYPE = new ParamImpl<Object>('M', 0X00000001, "TROI_FTYPE");

   ParamImpl<Object> V_TROI_MULTIPLET = new ParamImpl<Object>('V', 0X00000000, "TROI_MULTIPLET");

   ParamImpl<Object> M_TROI_MULTIPLET = new ParamImpl<Object>('M', 0X00000001, "TROI_MULTIPLET");

   ParamImpl<Object> V_TROI_NOEVALUATE = new ParamImpl<Object>('V', 0X00000001, "TROI_NOEVALUATE");

   ParamImpl<Object> M_TROI_NOEVALUATE = new ParamImpl<Object>('M', 0X00000002, "TROI_NOEVALUATE");

   ParamImpl<Object> V_TROI_NOSUM = new ParamImpl<Object>('V', 0X00000002, "TROI_NOSUM");

   ParamImpl<Object> M_TROI_NOSUM = new ParamImpl<Object>('M', 0X00000004, "TROI_NOSUM");

   ParamImpl<Long> L_TROIRROINUMB = new ParamImpl<Long>('L', 0X20340002, "TROIRROINUMB");

   ParamImpl<Long> L_TROIRVIEWNUM = new ParamImpl<Long>('L', 0X20340003, "TROIRVIEWNUM");

   ParamImpl<Float> F_TROIRLEFT = new ParamImpl<Float>('F', 0X20340004, "TROIRLEFT");

   ParamImpl<Float> F_TROIRPEAK = new ParamImpl<Float>('F', 0X20340005, "TROIRPEAK");

   ParamImpl<Float> F_TROIRRIGHT = new ParamImpl<Float>('F', 0X20340006, "TROIRRIGHT");

   ParamImpl<Long> L_TROIREREAL = new ParamImpl<Long>('L', 0X20340007, "TROIREREAL");

   ParamImpl<Long> L_TROIRELIVE = new ParamImpl<Long>('L', 0X20340008, "TROIRELIVE");

   ParamImpl<Long> L_TROIRFLAGS = new ParamImpl<Long>('L', 0X20340009, "TROIRFLAGS");

   ParamImpl<Long> L_TROIRFREFPK = new ParamImpl<Long>('L', 0X2034000, "TROIRFREFPK");

   ParamImpl<Long> L_TROIRFTRANS = new ParamImpl<Long>('L', 0X2034000, "TROIRFTRANS");

   ParamImpl<Object> V_TROI_REFPK = new ParamImpl<Object>('V', 0X00000000, "TROI_REFPK");

   ParamImpl<Object> M_TROI_REFPK = new ParamImpl<Object>('M', 0X00000001, "TROI_REFPK");

   ParamImpl<Object> V_TROI_TRANS = new ParamImpl<Object>('V', 0X00000001, "TROI_TRANS");

   ParamImpl<Object> M_TROI_TRANS = new ParamImpl<Object>('M', 0X00000002, "TROI_TRANS");

   ParamImpl<Long> L_VOXXDIM = new ParamImpl<Long>('L', 0X20350002, "VOXXDIM");

   ParamImpl<Long> L_VOXYDIM = new ParamImpl<Long>('L', 0X20350003, "VOXYDIM");

   ParamImpl<Long> L_VOXZDIM = new ParamImpl<Long>('L', 0X20350004, "VOXZDIM");

   ParamImpl<Long> L_VOXRECTYPE = new ParamImpl<Long>('L', 0X20350005, "VOXRECTYPE");

   ParamImpl<String> T_VOXRECID1 = new ParamImpl<String>('T', 0X20350006, "VOXRECID1");

   ParamImpl<Float> F_VOXRECID2 = new ParamImpl<Float>('F', 0X20350007, "VOXRECID2");

   ParamImpl<Float> F_VOXRECID3 = new ParamImpl<Float>('F', 0X20350008, "VOXRECID3");

   ParamImpl<Float> F_VOXVALUE = new ParamImpl<Float>('F', 0X20350009, "VOXVALUE");

   ParamImpl<Float> F_VOXVALUEUNC = new ParamImpl<Float>('F', 0X2035000, "VOXVALUEUNC");

   ParamImpl<Float> F_VOXRVALUE1 = new ParamImpl<Float>('F', 0X2035000, "VOXRVALUE1");

   ParamImpl<Float> F_VOXRVALUE2 = new ParamImpl<Float>('F', 0X2035000, "VOXRVALUE2");

   ParamImpl<Float> F_VOXRVALUE3 = new ParamImpl<Float>('F', 0X2035000, "VOXRVALUE3");

   ParamImpl<Float> F_VOXRVALUE4 = new ParamImpl<Float>('F', 0X2035000, "VOXRVALUE4");

   ParamImpl<Float> F_VOXRVALUE5 = new ParamImpl<Float>('F', 0X2035000, "VOXRVALUE5");

   ParamImpl<Float> F_VOXRVALUE6 = new ParamImpl<Float>('F', 0X20350010, "VOXRVALUE6");

   ParamImpl<Float> F_VOXRVALUE7 = new ParamImpl<Float>('F', 0X20350011, "VOXRVALUE7");

   ParamImpl<Float> F_VOXRVALUE8 = new ParamImpl<Float>('F', 0X20350012, "VOXRVALUE8");

   ParamImpl<Float> F_VOXRVALUE9 = new ParamImpl<Float>('F', 0X20350013, "VOXRVALUE9");

   ParamImpl<Float> F_VOXRVALUE10 = new ParamImpl<Float>('F', 0X20350014, "VOXRVALUE10");

   ParamImpl<Long> L_NITFLAGS = new ParamImpl<Long>('L', 0X20360002, "NITFLAGS");

   ParamImpl<Float> F_NITGEOMCF = new ParamImpl<Float>('F', 0X20360003, "NITGEOMCF");

   ParamImpl<Float> F_NITGEOMCFERR = new ParamImpl<Float>('F', 0X20360004, "NITGEOMCFERR");

   ParamImpl<Date> X_NITCALDATE = new ParamImpl<Date>('X', 0X20360005, "NITCALDATE");

   ParamImpl<String> T_NITENGVERS = new ParamImpl<String>('T', 0X20360006, "NITENGVERS");

   ParamImpl<Long> L_NITCALDONE = new ParamImpl<Long>('L', 0X20360007, "NITCALDONE");

   ParamImpl<Long> L_NITENGDONE = new ParamImpl<Long>('L', 0X20360008, "NITENGDONE");

   ParamImpl<String> T_NITRSRCID = new ParamImpl<String>('T', 0X20360009, "NITRSRCID");

   ParamImpl<Float> F_NITRSRCKDP = new ParamImpl<Float>('F', 0X2036000, "NITRSRCKDP");

   ParamImpl<Float> F_NITRSRCCF = new ParamImpl<Float>('F', 0X2036000, "NITRSRCCF");

   ParamImpl<Float> F_NITRSRCERR = new ParamImpl<Float>('F', 0X2036000, "NITRSRCERR");

   ParamImpl<Float> F_NITRSRCRPOS = new ParamImpl<Float>('F', 0X2036000, "NITRSRCRPOS");

   ParamImpl<Float> F_NITRSRCVPOS = new ParamImpl<Float>('F', 0X2036000, "NITRSRCVPOS");

   ParamImpl<Long> L_NITRSRCFLAGS = new ParamImpl<Long>('L', 0X2036000, "NITRSRCFLAGS");

   ParamImpl<Long> L_NITRFACTIVE = new ParamImpl<Long>('L', 0X20360010, "NITRFACTIVE");

   ParamImpl<Long> L_NITRGEOMID = new ParamImpl<Long>('L', 0X20360011, "NITRGEOMID");

   ParamImpl<Long> L_NITRDWELLID = new ParamImpl<Long>('L', 0X20360012, "NITRDWELLID");

   ParamImpl<Float> F_NITRRATE = new ParamImpl<Float>('F', 0X20360013, "NITRRATE");

   ParamImpl<Float> F_NITRRATEERR = new ParamImpl<Float>('F', 0X20360014, "NITRRATEERR");

   ParamImpl<Long> L_NITGEOMCFTYP = new ParamImpl<Long>('L', 0X20360015, "NITGEOMCFTYP");

   ParamImpl<Object> V_NITF_CALDONE = new ParamImpl<Object>('V', 0X00000000, "NITF_CALDONE");

   ParamImpl<Object> M_NITF_CALDONE = new ParamImpl<Object>('M', 0X00000001, "NITF_CALDONE");

   ParamImpl<Object> V_NITF_ENGDONE = new ParamImpl<Object>('V', 0X00000001, "NITF_ENGDONE");

   ParamImpl<Object> M_NITF_ENGDONE = new ParamImpl<Object>('M', 0X00000002, "NITF_ENGDONE");

   ParamImpl<Object> V_NITRF_ACTIVE = new ParamImpl<Object>('V', 0X00000000, "NITRF_ACTIVE");

   ParamImpl<Object> M_NITRF_ACTIVE = new ParamImpl<Object>('M', 0X00000001, "NITRF_ACTIVE");

   ParamImpl<Long> L_SHFFLAGS = new ParamImpl<Long>('L', 0X20370002, "SHFFLAGS");

   ParamImpl<String> T_SHFVERSION = new ParamImpl<String>('T', 0X20370003, "SHFVERSION");

   ParamImpl<Float> F_SHFU235MASS = new ParamImpl<Float>('F', 0X20370004, "SHFU235MASS");

   ParamImpl<Float> F_SHFU235MASSE = new ParamImpl<Float>('F', 0X20370005, "SHFU235MASSE");

   ParamImpl<Float> F_SHFMATRIXCF = new ParamImpl<Float>('F', 0X20370006, "SHFMATRIXCF");

   ParamImpl<Float> F_SHFMATRIXCFE = new ParamImpl<Float>('F', 0X20370007, "SHFMATRIXCFE");

   ParamImpl<Float> F_SHFAXIALCF = new ParamImpl<Float>('F', 0X20370008, "SHFAXIALCF");

   ParamImpl<Float> F_SHFAXIALCFE = new ParamImpl<Float>('F', 0X20370009, "SHFAXIALCFE");

   ParamImpl<Float> F_SHFRINGRAT = new ParamImpl<Float>('F', 0X2037000, "SHFRINGRAT");

   ParamImpl<Float> F_SHFRINGRATE = new ParamImpl<Float>('F', 0X2037000, "SHFRINGRATE");

   ParamImpl<String> T_SHFRDSRCNAME = new ParamImpl<String>('T', 0X2037000, "SHFRDSRCNAME");

   ParamImpl<Long> L_SHFRDSRCGEOM = new ParamImpl<Long>('L', 0X2037000, "SHFRDSRCGEOM");

   ParamImpl<Float> F_SHFRRATE = new ParamImpl<Float>('F', 0X2037000, "SHFRRATE");

   ParamImpl<Float> F_SHFRRATEE = new ParamImpl<Float>('F', 0X2037000, "SHFRRATEE");

   ParamImpl<Float> F_SHFRRELAPSED = new ParamImpl<Float>('F', 0X20370010, "SHFRRELAPSED");

   ParamImpl<Float> F_SHFRINVDWELL = new ParamImpl<Float>('F', 0X20370011, "SHFRINVDWELL");

   ParamImpl<Float> F_SHFRTRIGFREQ = new ParamImpl<Float>('F', 0X20370012, "SHFRTRIGFREQ");

   ParamImpl<Long> L_SHFRTROITYPE = new ParamImpl<Long>('L', 0X20370013, "SHFRTROITYPE");

   ParamImpl<Long> L_SHFRTROIGEOM = new ParamImpl<Long>('L', 0X20370014, "SHFRTROIGEOM");

   ParamImpl<Float> F_SHFRTROIDELY = new ParamImpl<Float>('F', 0X20370015, "SHFRTROIDELY");

   ParamImpl<Float> F_SHFRTROIWIDT = new ParamImpl<Float>('F', 0X20370016, "SHFRTROIWIDT");

   ParamImpl<Float> F_SHFRTROISTAR = new ParamImpl<Float>('F', 0X20370017, "SHFRTROISTAR");

   ParamImpl<Float> F_SHFRTROIEND = new ParamImpl<Float>('F', 0X20370018, "SHFRTROIEND");

   ParamImpl<Long> L_SHFRTROIISTA = new ParamImpl<Long>('L', 0X20370019, "SHFRTROIISTA");

   ParamImpl<Long> L_SHFRTROIIEND = new ParamImpl<Long>('L', 0X2037001, "SHFRTROIIEND");

   ParamImpl<Float> F_SHFRTROIERT = new ParamImpl<Float>('F', 0X2037001, "SHFRTROIERT");

   ParamImpl<Long> L_SHFRTROICNTS = new ParamImpl<Long>('L', 0X2037001, "SHFRTROICNTS");

   ParamImpl<Float> F_SHFRTROINCR = new ParamImpl<Float>('F', 0X2037001, "SHFRTROINCR");

   ParamImpl<Float> F_SHFRTROINCRE = new ParamImpl<Float>('F', 0X2037001, "SHFRTROINCRE");

   ParamImpl<Float> F_SHFU235MDA = new ParamImpl<Float>('F', 0X2037001, "SHFU235MDA");

   ParamImpl<Float> F_SHFFSTTHRRT = new ParamImpl<Float>('F', 0X20370020, "SHFFSTTHRRT");

   ParamImpl<Float> F_SHFFSTTHRRM = new ParamImpl<Float>('F', 0X20370021, "SHFFSTTHRRM");

   ParamImpl<Float> F_SHFFSTTHRRB = new ParamImpl<Float>('F', 0X20370022, "SHFFSTTHRRB");

   ParamImpl<String> T_DSNNAME = new ParamImpl<String>('T', 0X20380002, "DSNNAME");

   ParamImpl<Long> L_DSNINT1 = new ParamImpl<Long>('L', 0X20380003, "DSNINT1");

   ParamImpl<Float> F_HCPARMA = new ParamImpl<Float>('F', 0X20390002, "HCPARMA");

   ParamImpl<Float> F_HCPARMB = new ParamImpl<Float>('F', 0X20390003, "HCPARMB");

   ParamImpl<Float> F_HCPARMC = new ParamImpl<Float>('F', 0X20390004, "HCPARMC");

   ParamImpl<Float> F_HCCOVAA = new ParamImpl<Float>('F', 0X20390005, "HCCOVAA");

   ParamImpl<Float> F_HCCOVBB = new ParamImpl<Float>('F', 0X20390006, "HCCOVBB");

   ParamImpl<Float> F_HCCOVCC = new ParamImpl<Float>('F', 0X20390007, "HCCOVCC");

   ParamImpl<Float> F_HCCOVAB = new ParamImpl<Float>('F', 0X20390008, "HCCOVAB");

   ParamImpl<Float> F_HCCOVAC = new ParamImpl<Float>('F', 0X20390009, "HCCOVAC");

   ParamImpl<Float> F_HCCOVBC = new ParamImpl<Float>('F', 0X2039000, "HCCOVBC");

   ParamImpl<Float> F_HCREFRATIO = new ParamImpl<Float>('F', 0X2039000, "HCREFRATIO");

   ParamImpl<Float> F_HCREFRATIOER = new ParamImpl<Float>('F', 0X2039000, "HCREFRATIOER");

   ParamImpl<Float> F_HCCORRFACT = new ParamImpl<Float>('F', 0X2039000, "HCCORRFACT");

   ParamImpl<Float> F_HCCORRFACTER = new ParamImpl<Float>('F', 0X2039000, "HCCORRFACTER");
}
