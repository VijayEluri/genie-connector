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

import java.math.BigInteger;
import java.util.Date;


/**
 * Created by IntelliJ IDEA.
 * User: Jacek Bzdak jbzdak@gmail.com
 */
@SuppressWarnings({"ALL"}) interface Param2 {
   ParamImpl<String> T_CTITLE = new ParamImpl<String>('T', 0X20000002, "CTITLE");

   ParamImpl<String> T_ACQOPNAME = new ParamImpl<String>('T', 0X20000002, "ACQOPNAME");

   ParamImpl<String> T_CPNAME = new ParamImpl<String>('T', 0X20000003, "CPNAME");

   ParamImpl<String> T_ACQMOD = new ParamImpl<String>('T', 0X20000004, "ACQMOD");

   ParamImpl<Long> L_CMASK = new ParamImpl<Long>('L', 0X20000005, "CMASK");

   ParamImpl<Long> L_BYTES = new ParamImpl<Long>('L', 0X20000006, "BYTES");

   ParamImpl<Long> L_CHANNELS = new ParamImpl<Long>('L', 0X20000007, "CHANNELS");

   ParamImpl<Long> L_ROWS = new ParamImpl<Long>('L', 0X20000008, "ROWS");

   ParamImpl<Long> L_GROUPS = new ParamImpl<Long>('L', 0X20000009, "GROUPS");

   ParamImpl<Long> L_PMODE = new ParamImpl<Long>('L', 0X2000000, "PMODE");

   ParamImpl<Date> X_PREAL = new ParamImpl<Date>('X', 0X2000000, "PREAL");

   ParamImpl<Date> X_PLIVE = new ParamImpl<Date>('X', 0X2000000, "PLIVE");

   ParamImpl<Long> L_PTOTAL = new ParamImpl<Long>('L', 0X2000000, "PTOTAL");

   ParamImpl<Long> L_PSWEEPS = new ParamImpl<Long>('L', 0X2000000, "PSWEEPS");

   ParamImpl<Long> L_PLEVEL = new ParamImpl<Long>('L', 0X2000000, "PLEVEL");

   ParamImpl<Long> L_PTSCHAN = new ParamImpl<Long>('L', 0X20000010, "PTSCHAN");

   ParamImpl<Long> L_PTSROW = new ParamImpl<Long>('L', 0X20000011, "PTSROW");

   ParamImpl<Long> L_PTECHAN = new ParamImpl<Long>('L', 0X20000012, "PTECHAN");

   ParamImpl<Long> L_PTEROW = new ParamImpl<Long>('L', 0X20000013, "PTEROW");

   ParamImpl<Float> F_DWELL = new ParamImpl<Float>('F', 0X20000014, "DWELL");

   ParamImpl<Date> X_ASTIME = new ParamImpl<Date>('X', 0X20000015, "ASTIME");

   ParamImpl<Date> X_EREAL = new ParamImpl<Date>('X', 0X20000016, "EREAL");

   ParamImpl<Date> X_ELIVE = new ParamImpl<Date>('X', 0X20000017, "ELIVE");

   ParamImpl<Long> L_ACQMFLGS = new ParamImpl<Long>('L', 0X20000018, "ACQMFLGS");

   ParamImpl<Float> F_ECALCHISQ = new ParamImpl<Float>('F', 0X20000019, "ECALCHISQ");

   ParamImpl<Float> F_FWHMCHISQ = new ParamImpl<Float>('F', 0X2000001, "FWHMCHISQ");

   ParamImpl<Long> L_ACQINTVEC = new ParamImpl<Long>('L', 0X2000001, "ACQINTVEC");

   ParamImpl<Long> L_SCHANGER = new ParamImpl<Long>('L', 0X2000001, "SCHANGER");

   ParamImpl<Long> L_PARAMSEVENT = new ParamImpl<Long>('L', 0X2000001, "PARAMSEVENT");

   ParamImpl<String> T_ADCPNAME = new ParamImpl<String>('T', 0X2000001, "ADCPNAME");

   ParamImpl<Long> L_ECALFLAGS = new ParamImpl<Long>('L', 0X2000001, "ECALFLAGS");

   ParamImpl<Float> F_ECOFFSET = new ParamImpl<Float>('F', 0X20000020, "ECOFFSET");

   ParamImpl<Float> F_ECSLOPE = new ParamImpl<Float>('F', 0X20000021, "ECSLOPE");

   ParamImpl<Float> F_ECQUAD = new ParamImpl<Float>('F', 0X20000022, "ECQUAD");

   ParamImpl<Float> F_ECALFAC1 = new ParamImpl<Float>('F', 0X20000023, "ECALFAC1");

   ParamImpl<Float> F_ECALFAC2 = new ParamImpl<Float>('F', 0X20000024, "ECALFAC2");

   ParamImpl<Float> F_ECALFAC3 = new ParamImpl<Float>('F', 0X20000025, "ECALFAC3");

   ParamImpl<String> T_ECALUNITS = new ParamImpl<String>('T', 0X20000026, "ECALUNITS");

   ParamImpl<Long> L_ADCFLAGS = new ParamImpl<Long>('L', 0X20000027, "ADCFLAGS");

   ParamImpl<Float> F_LLD = new ParamImpl<Float>('F', 0X20000028, "LLD");

   ParamImpl<Float> F_ULD = new ParamImpl<Float>('F', 0X20000029, "ULD");

   ParamImpl<Long> L_CNVGAIN = new ParamImpl<Long>('L', 0X2000002, "CNVGAIN");

   ParamImpl<Float> F_ZERO = new ParamImpl<Float>('F', 0X2000002, "ZERO");

   ParamImpl<Long> L_DIGOFF = new ParamImpl<Long>('L', 0X2000002, "DIGOFF");

   ParamImpl<Long> L_STABWIN1C = new ParamImpl<Long>('L', 0X2000002, "STABWIN1C");

   ParamImpl<Long> L_STABWIN1R = new ParamImpl<Long>('L', 0X2000002, "STABWIN1R");

   ParamImpl<Long> L_STABWIN2C = new ParamImpl<Long>('L', 0X2000002, "STABWIN2C");

   ParamImpl<Long> L_STABWIN2R = new ParamImpl<Long>('L', 0X20000030, "STABWIN2R");

   ParamImpl<Float> F_STROBE = new ParamImpl<Float>('F', 0X20000031, "STROBE");

   ParamImpl<Float> F_STABRATE = new ParamImpl<Float>('F', 0X20000032, "STABRATE");

   ParamImpl<String> T_ADCTYPE = new ParamImpl<String>('T', 0X20000033, "ADCTYPE");

   ParamImpl<String> T_AMPTYPE = new ParamImpl<String>('T', 0X20000034, "AMPTYPE");

   ParamImpl<String> T_ADCID = new ParamImpl<String>('T', 0X20000035, "ADCID");

   ParamImpl<Long> L_AMPFLAGS = new ParamImpl<Long>('L', 0X20000036, "AMPFLAGS");

   ParamImpl<Float> F_AMPGAIN = new ParamImpl<Float>('F', 0X20000037, "AMPGAIN");

   ParamImpl<Float> F_AMPTC = new ParamImpl<Float>('F', 0X20000038, "AMPTC");

   ParamImpl<String> T_AMPID = new ParamImpl<String>('T', 0X20000039, "AMPID");

   ParamImpl<Float> F_VOLTAGE = new ParamImpl<Float>('F', 0X2000003, "VOLTAGE");

   ParamImpl<Long> L_PMLIVE = new ParamImpl<Long>('L', 0X2000003, "PMLIVE");

   ParamImpl<Long> L_PMREAL = new ParamImpl<Long>('L', 0X2000003, "PMREAL");

   ParamImpl<Long> L_PMSWEEPS = new ParamImpl<Long>('L', 0X2000003, "PMSWEEPS");

   ParamImpl<Long> L_PMTOTALS = new ParamImpl<Long>('L', 0X2000003, "PMTOTALS");

   ParamImpl<Long> L_PMLEVEL = new ParamImpl<Long>('L', 0X2000003, "PMLEVEL");

   ParamImpl<Float> F_ASP1 = new ParamImpl<Float>('F', 0X20000040, "ASP1");

   ParamImpl<Float> F_ASP2 = new ParamImpl<Float>('F', 0X20000041, "ASP2");

   ParamImpl<Float> F_ASP3 = new ParamImpl<Float>('F', 0X20000042, "ASP3");

   ParamImpl<Float> F_ASP4 = new ParamImpl<Float>('F', 0X20000043, "ASP4");

   ParamImpl<Float> F_ASP5 = new ParamImpl<Float>('F', 0X20000044, "ASP5");

   ParamImpl<Long> L_EXTRA = new ParamImpl<Long>('L', 0X20000045, "EXTRA");

   ParamImpl<Date> X_ECALTIME = new ParamImpl<Date>('X', 0X20000046, "ECALTIME");

   ParamImpl<Float> F_ECALCNV = new ParamImpl<Float>('F', 0X20000047, "ECALCNV");

   ParamImpl<Float> F_FWHMOFF = new ParamImpl<Float>('F', 0X20000048, "FWHMOFF");

   ParamImpl<Float> F_FWHMSLOPE = new ParamImpl<Float>('F', 0X20000049, "FWHMSLOPE");

   ParamImpl<String> T_ASPSTR = new ParamImpl<String>('T', 0X2000004, "ASPSTR");

   ParamImpl<Float> F_PILEUP = new ParamImpl<Float>('F', 0X2000004, "PILEUP");

   ParamImpl<String> T_DETNAME = new ParamImpl<String>('T', 0X2000004, "DETNAME");

   ParamImpl<Float> F_ECALLCOF = new ParamImpl<Float>('F', 0X2000004, "ECALLCOF");

   ParamImpl<Float> F_ECALLCSL = new ParamImpl<Float>('F', 0X2000004, "ECALLCSL");

   ParamImpl<Long> L_ECALLCCH = new ParamImpl<Long>('L', 0X2000004, "ECALLCCH");

   ParamImpl<Float> F_ECALLCDE = new ParamImpl<Float>('F', 0X20000050, "ECALLCDE");

   ParamImpl<Long> L_ACQUIRE = new ParamImpl<Long>('L', 0X20000051, "ACQUIRE");

   ParamImpl<Long> L_AGROUP = new ParamImpl<Long>('L', 0X20000052, "AGROUP");

   ParamImpl<Long> L_ASTATUS = new ParamImpl<Long>('L', 0X20000053, "ASTATUS");

   ParamImpl<Long> L_UPPERGATE = new ParamImpl<Long>('L', 0X20000054, "UPPERGATE");

   ParamImpl<Float> F_FWHMCONST = new ParamImpl<Float>('F', 0X20000055, "FWHMCONST");

   ParamImpl<Long> L_ACQPHYSADDR = new ParamImpl<Long>('L', 0X20000056, "ACQPHYSADDR");

   ParamImpl<BigInteger> Q_TOTALEVENTS = new ParamImpl<BigInteger>('Q', 0X20000057, "TOTALEVENTS");

   ParamImpl<Long> L_FIRSTMUXINP = new ParamImpl<Long>('L', 0X20000058, "FIRSTMUXINP");

   ParamImpl<Long> L_BACKGNDCHNS = new ParamImpl<Long>('L', 0X20000059, "BACKGNDCHNS");

   ParamImpl<String> T_ADCADDRESS = new ParamImpl<String>('T', 0X2000005, "ADCADDRESS");

   ParamImpl<String> T_AMPADDRESS = new ParamImpl<String>('T', 0X2000005, "AMPADDRESS");

   ParamImpl<String> T_DSSADDRESS = new ParamImpl<String>('T', 0X2000005, "DSSADDRESS");

   ParamImpl<String> T_LFCADDRESS = new ParamImpl<String>('T', 0X2000005, "LFCADDRESS");

   ParamImpl<String> T_HVPSADDRESS = new ParamImpl<String>('T', 0X2000005, "HVPSADDRESS");

   ParamImpl<String> T_SCADDRESS = new ParamImpl<String>('T', 0X2000005, "SCADDRESS");

   ParamImpl<Float> F_PNETENG = new ParamImpl<Float>('F', 0X20000060, "PNETENG");

   ParamImpl<String> T_ECALTYPE = new ParamImpl<String>('T', 0X20000061, "ECALTYPE");

   ParamImpl<Float> F_PAREA = new ParamImpl<Float>('F', 0X20000062, "PAREA");

   ParamImpl<Float> F_PPERR = new ParamImpl<Float>('F', 0X20000063, "PPERR");

   ParamImpl<Date> X_SCALTIME = new ParamImpl<Date>('X', 0X20000064, "SCALTIME");

   ParamImpl<Float> F_C1TAIL1 = new ParamImpl<Float>('F', 0X20000065, "C1TAIL1");

   ParamImpl<Float> F_C2TAIL1 = new ParamImpl<Float>('F', 0X20000066, "C2TAIL1");

   ParamImpl<Float> F_TAIL1CHISQ = new ParamImpl<Float>('F', 0X20000067, "TAIL1CHISQ");

   ParamImpl<Float> F_C1TAIL2 = new ParamImpl<Float>('F', 0X20000068, "C1TAIL2");

   ParamImpl<Float> F_C2TAIL2 = new ParamImpl<Float>('F', 0X20000069, "C2TAIL2");

   ParamImpl<Float> F_TAIL2CHISQ = new ParamImpl<Float>('F', 0X2000006, "TAIL2CHISQ");

   ParamImpl<String> T_FWCALTYPE = new ParamImpl<String>('T', 0X2000006, "FWCALTYPE");

   ParamImpl<Long> L_ECALTERMS = new ParamImpl<Long>('L', 0X2000006, "ECALTERMS");

   ParamImpl<Float> F_C1FWHM = new ParamImpl<Float>('F', 0X2000006, "C1FWHM");

   ParamImpl<Float> F_C2FWHM = new ParamImpl<Float>('F', 0X2000006, "C2FWHM");

   ParamImpl<Float> F_C3FWHM = new ParamImpl<Float>('F', 0X2000006, "C3FWHM");

   ParamImpl<Float> F_FW511 = new ParamImpl<Float>('F', 0X20000070, "FW511");

   ParamImpl<Float> F_T1511 = new ParamImpl<Float>('F', 0X20000071, "T1511");

   ParamImpl<Float> F_T2511 = new ParamImpl<Float>('F', 0X20000072, "T2511");

   ParamImpl<Float> F_FWREF = new ParamImpl<Float>('F', 0X20000073, "FWREF");

   ParamImpl<Float> F_T1REF = new ParamImpl<Float>('F', 0X20000074, "T1REF");

   ParamImpl<Float> F_T2REF = new ParamImpl<Float>('F', 0X20000075, "T2REF");

   ParamImpl<Float> F_FWPOLYCHISQ = new ParamImpl<Float>('F', 0X20000076, "FWPOLYCHISQ");

   ParamImpl<String> T_MIDPATH = new ParamImpl<String>('T', 0X20000077, "MIDPATH");

   ParamImpl<Long> L_AMPFDIFF = new ParamImpl<Long>('L', 0X20000078, "AMPFDIFF");

   ParamImpl<Long> L_AMPFNEGPOL = new ParamImpl<Long>('L', 0X20000079, "AMPFNEGPOL");

   ParamImpl<Long> L_AMPFCOMPINH = new ParamImpl<Long>('L', 0X2000007, "AMPFCOMPINH");

   ParamImpl<Long> L_AMPFPUREJ = new ParamImpl<Long>('L', 0X2000007, "AMPFPUREJ");

   ParamImpl<Long> L_ADCFANTIC = new ParamImpl<Long>('L', 0X2000007, "ADCFANTIC");

   ParamImpl<Long> L_ADCFLATEC = new ParamImpl<Long>('L', 0X2000007, "ADCFLATEC");

   ParamImpl<Long> L_ADCFDELPK = new ParamImpl<Long>('L', 0X2000007, "ADCFDELPK");

   ParamImpl<Long> L_ADCFCIMCAIF = new ParamImpl<Long>('L', 0X2000007, "ADCFCIMCAIF");

   ParamImpl<Long> L_ADCFNONOV = new ParamImpl<Long>('L', 0X20000080, "ADCFNONOV");

   ParamImpl<Float> F_ECOMP = new ParamImpl<Float>('F', 0X20000081, "ECOMP");

   ParamImpl<Long> L_ESWEEPS = new ParamImpl<Long>('L', 0X20000082, "ESWEEPS");

   ParamImpl<String> T_MCATYPE = new ParamImpl<String>('T', 0X20000083, "MCATYPE");

   ParamImpl<String> T_MCAID = new ParamImpl<String>('T', 0X20000084, "MCAID");

   ParamImpl<String> T_CHANGERTYPE = new ParamImpl<String>('T', 0X20000085, "CHANGERTYPE");

   ParamImpl<String> T_CHANGERID = new ParamImpl<String>('T', 0X20000086, "CHANGERID");

   ParamImpl<Float> F_AMPHWGAIN1 = new ParamImpl<Float>('F', 0X20000087, "AMPHWGAIN1");

   ParamImpl<Float> F_AMPHWGAIN2 = new ParamImpl<Float>('F', 0X20000088, "AMPHWGAIN2");

   ParamImpl<Float> F_AMPHWGAIN3 = new ParamImpl<Float>('F', 0X20000089, "AMPHWGAIN3");

   ParamImpl<String> T_AMPSHAPEMODE = new ParamImpl<String>('T', 0X2000008, "AMPSHAPEMODE");

   ParamImpl<Long> L_AMPPZ = new ParamImpl<Long>('L', 0X2000008, "AMPPZ");

   ParamImpl<String> T_AMPBLRTYPE = new ParamImpl<String>('T', 0X2000008, "AMPBLRTYPE");

   ParamImpl<String> T_AMPDTCTYPE = new ParamImpl<String>('T', 0X2000008, "AMPDTCTYPE");

   ParamImpl<Long> L_ADCRANGE = new ParamImpl<Long>('L', 0X2000008, "ADCRANGE");

   ParamImpl<Long> L_ADCOFFSET = new ParamImpl<Long>('L', 0X2000008, "ADCOFFSET");

   ParamImpl<String> T_ADCACQMODE = new ParamImpl<String>('T', 0X20000090, "ADCACQMODE");

   ParamImpl<String> T_MCSTYPE = new ParamImpl<String>('T', 0X20000091, "MCSTYPE");

   ParamImpl<String> T_MCSID = new ParamImpl<String>('T', 0X20000092, "MCSID");

   ParamImpl<Long> L_MCSFLAGS = new ParamImpl<Long>('L', 0X20000093, "MCSFLAGS");

   ParamImpl<Long> L_MCSFEXTCLOCK = new ParamImpl<Long>('L', 0X20000094, "MCSFEXTCLOCK");

   ParamImpl<String> T_LFCTYPE = new ParamImpl<String>('T', 0X20000095, "LFCTYPE");

   ParamImpl<String> T_LFCID = new ParamImpl<String>('T', 0X20000096, "LFCID");

   ParamImpl<Long> L_LFCFLAGS = new ParamImpl<Long>('L', 0X20000097, "LFCFLAGS");

   ParamImpl<String> T_MUXTYPE = new ParamImpl<String>('T', 0X20000098, "MUXTYPE");

   ParamImpl<String> T_MUXID = new ParamImpl<String>('T', 0X20000099, "MUXID");

   ParamImpl<Long> L_MUXFLAGS = new ParamImpl<Long>('L', 0X2000009, "MUXFLAGS");

   ParamImpl<Long> L_MUXFDEPMUX = new ParamImpl<Long>('L', 0X2000009, "MUXFDEPMUX");

   ParamImpl<String> T_MUXMODE = new ParamImpl<String>('T', 0X2000009, "MUXMODE");

   ParamImpl<Long> L_MUXINPUTS = new ParamImpl<Long>('L', 0X2000009, "MUXINPUTS");

   ParamImpl<String> T_DSSTYPE = new ParamImpl<String>('T', 0X2000009, "DSSTYPE");

   ParamImpl<String> T_DSSID = new ParamImpl<String>('T', 0X2000009, "DSSID");

   ParamImpl<Long> L_DSSFLAGS = new ParamImpl<Long>('L', 0X200000, "DSSFLAGS");

   ParamImpl<Float> F_DSSWIN1AR = new ParamImpl<Float>('F', 0X200000, "DSSWIN1AR");

   ParamImpl<Float> F_DSSWIN2AR = new ParamImpl<Float>('F', 0X200000, "DSSWIN2AR");

   ParamImpl<String> T_DSSWIN1MODE = new ParamImpl<String>('T', 0X200000, "DSSWIN1MODE");

   ParamImpl<String> T_DSSWIN2MODE = new ParamImpl<String>('T', 0X200000, "DSSWIN2MODE");

   ParamImpl<String> T_HVPSTYPE = new ParamImpl<String>('T', 0X200000, "HVPSTYPE");

   ParamImpl<String> T_HVPSID = new ParamImpl<String>('T', 0X200000, "HVPSID");

   ParamImpl<Long> L_HVPSFLAGS = new ParamImpl<Long>('L', 0X200000, "HVPSFLAGS");

   ParamImpl<Float> F_HVPSVOLTLIM = new ParamImpl<Float>('F', 0X200000, "HVPSVOLTLIM");

   ParamImpl<Long> L_HVPSFOVLE = new ParamImpl<Long>('L', 0X200000, "HVPSFOVLE");

   ParamImpl<Long> L_HVPSFINHLE = new ParamImpl<Long>('L', 0X200000, "HVPSFINHLE");

   ParamImpl<Long> L_HVPSFLVINH = new ParamImpl<Long>('L', 0X200000, "HVPSFLVINH");

   ParamImpl<Long> L_HVPSFPOL = new ParamImpl<Long>('L', 0X200000, "HVPSFPOL");

   ParamImpl<Long> L_HVPSFINH = new ParamImpl<Long>('L', 0X200000, "HVPSFINH");

   ParamImpl<Long> L_HVPSFOV = new ParamImpl<Long>('L', 0X200000, "HVPSFOV");

   ParamImpl<Long> L_WAITACQCOMP = new ParamImpl<Long>('L', 0X200000, "WAITACQCOMP");

   ParamImpl<Long> L_DETNOTAVAIL = new ParamImpl<Long>('L', 0X200000, "DETNOTAVAIL");

   ParamImpl<Long> L_ASTFCCFEMOD = new ParamImpl<Long>('L', 0X200000, "ASTFCCFEMOD");

   ParamImpl<Long> L_HVPSFSTAT = new ParamImpl<Long>('L', 0X200000, "HVPSFSTAT");

   ParamImpl<String> T_PRAMPTYPE = new ParamImpl<String>('T', 0X200000, "PRAMPTYPE");

   ParamImpl<Long> L_PMAREA = new ParamImpl<Long>('L', 0X200000, "PMAREA");

   ParamImpl<Long> L_PMPERR = new ParamImpl<Long>('L', 0X200000, "PMPERR");

   ParamImpl<Long> L_ASTFBADCAL = new ParamImpl<Long>('L', 0X200000, "ASTFBADCAL");

   ParamImpl<Long> L_ASTFCCERR = new ParamImpl<Long>('L', 0X200000, "ASTFCCERR");

   ParamImpl<Long> L_ECFENCAL = new ParamImpl<Long>('L', 0X200000, "ECFENCAL");

   ParamImpl<Long> L_ECFFWCAL = new ParamImpl<Long>('L', 0X200000, "ECFFWCAL");

   ParamImpl<Long> L_ECFT1CAL = new ParamImpl<Long>('L', 0X200000, "ECFT1CAL");

   ParamImpl<Long> L_ECFT2CAL = new ParamImpl<Long>('L', 0X200000, "ECFT2CAL");

   ParamImpl<Float> F_THRESHOLD = new ParamImpl<Float>('F', 0X200000, "THRESHOLD");

   ParamImpl<Float> F_CHSP1 = new ParamImpl<Float>('F', 0X200000, "CHSP1");

   ParamImpl<Float> F_CHSP2 = new ParamImpl<Float>('F', 0X200000, "CHSP2");

   ParamImpl<Float> F_CHSP3 = new ParamImpl<Float>('F', 0X200000, "CHSP3");

   ParamImpl<Float> F_CHSP4 = new ParamImpl<Float>('F', 0X200000, "CHSP4");

   ParamImpl<Float> F_CHSP5 = new ParamImpl<Float>('F', 0X200000, "CHSP5");

   ParamImpl<Long> L_SCMAXSAMPLES = new ParamImpl<Long>('L', 0X200000, "SCMAXSAMPLES");

   ParamImpl<Long> L_DETHASSC = new ParamImpl<Long>('L', 0X200000, "DETHASSC");

   ParamImpl<Long> L_SCMANUAL = new ParamImpl<Long>('L', 0X200000, "SCMANUAL");

   ParamImpl<Long> L_ADCFLTCPUR = new ParamImpl<Long>('L', 0X200000, "ADCFLTCPUR");

   ParamImpl<Long> L_SCIGNORETO = new ParamImpl<Long>('L', 0X200000, "SCIGNORETO");

   ParamImpl<Long> L_AMPFONLINE = new ParamImpl<Long>('L', 0X200000, "AMPFONLINE");

   ParamImpl<Long> L_HVPSFONLINE = new ParamImpl<Long>('L', 0X200000, "HVPSFONLINE");

   ParamImpl<Long> L_HVPSFOVINRES = new ParamImpl<Long>('L', 0X200000, "HVPSFOVINRES");

   ParamImpl<Long> L_ADCFONLINE = new ParamImpl<Long>('L', 0X200000, "ADCFONLINE");

   ParamImpl<Long> L_AMPFMOTRBUSY = new ParamImpl<Long>('L', 0X200000, "AMPFMOTRBUSY");

   ParamImpl<Long> L_AMPFPZBUSY = new ParamImpl<Long>('L', 0X200000, "AMPFPZBUSY");

   ParamImpl<Long> L_HVPSFATTEN = new ParamImpl<Long>('L', 0X200000, "HVPSFATTEN");

   ParamImpl<Long> L_ADCFATTEN = new ParamImpl<Long>('L', 0X200000, "ADCFATTEN");

   ParamImpl<Long> L_AMPFATTEN = new ParamImpl<Long>('L', 0X200000, "AMPFATTEN");

   ParamImpl<Long> L_AMPFPZSTART = new ParamImpl<Long>('L', 0X200000, "AMPFPZSTART");

   ParamImpl<Long> L_AMPFPZFAIL = new ParamImpl<Long>('L', 0X200000, "AMPFPZFAIL");

   ParamImpl<Long> L_AMPFMOTRFAIL = new ParamImpl<Long>('L', 0X200000, "AMPFMOTRFAIL");

   ParamImpl<Long> L_HVPSVFLAGS = new ParamImpl<Long>('L', 0X200000, "HVPSVFLAGS");

   ParamImpl<Long> L_AMPVFLAGS = new ParamImpl<Long>('L', 0X200000, "AMPVFLAGS");

   ParamImpl<Long> L_ADCVFLAGS = new ParamImpl<Long>('L', 0X200000, "ADCVFLAGS");

   ParamImpl<Long> L_HVPSVFID = new ParamImpl<Long>('L', 0X200000, "HVPSVFID");

   ParamImpl<Long> L_HVPSVFVOLT = new ParamImpl<Long>('L', 0X200000, "HVPSVFVOLT");

   ParamImpl<Long> L_HVPSVFOVLE = new ParamImpl<Long>('L', 0X200000, "HVPSVFOVLE");

   ParamImpl<Long> L_HVPSVFINHLE = new ParamImpl<Long>('L', 0X200000, "HVPSVFINHLE");

   ParamImpl<Long> L_HVPSVFLVINH = new ParamImpl<Long>('L', 0X200000, "HVPSVFLVINH");

   ParamImpl<Long> L_HVPSVFPOL = new ParamImpl<Long>('L', 0X200000, "HVPSVFPOL");

   ParamImpl<Long> L_HVPSVFSTAT = new ParamImpl<Long>('L', 0X200000, "HVPSVFSTAT");

   ParamImpl<Long> L_AMPVFID = new ParamImpl<Long>('L', 0X200000, "AMPVFID");

   ParamImpl<Long> L_AMPVFPRAMPT = new ParamImpl<Long>('L', 0X200000, "AMPVFPRAMPT");

   ParamImpl<Long> L_AMPVFHWGAIN1 = new ParamImpl<Long>('L', 0X200000, "AMPVFHWGAIN1");

   ParamImpl<Long> L_AMPVFHWGAIN2 = new ParamImpl<Long>('L', 0X200000, "AMPVFHWGAIN2");

   ParamImpl<Long> L_AMPVFHWGAIN3 = new ParamImpl<Long>('L', 0X200000, "AMPVFHWGAIN3");

   ParamImpl<Long> L_AMPVFSHAPEM = new ParamImpl<Long>('L', 0X200000, "AMPVFSHAPEM");

   ParamImpl<Long> L_AMPVFPZ = new ParamImpl<Long>('L', 0X200000, "AMPVFPZ");

   ParamImpl<Long> L_AMPVFBLRTYPE = new ParamImpl<Long>('L', 0X200000, "AMPVFBLRTYPE");

   ParamImpl<Long> L_AMPVFDTCTYPE = new ParamImpl<Long>('L', 0X200000, "AMPVFDTCTYPE");

   ParamImpl<Long> L_AMPVFTC = new ParamImpl<Long>('L', 0X200000, "AMPVFTC");

   ParamImpl<Long> L_AMPVFNEGPOL = new ParamImpl<Long>('L', 0X200000, "AMPVFNEGPOL");

   ParamImpl<Long> L_AMPVFCOMPINH = new ParamImpl<Long>('L', 0X200000, "AMPVFCOMPINH");

   ParamImpl<Long> L_AMPVFPUREJ = new ParamImpl<Long>('L', 0X200000, "AMPVFPUREJ");

   ParamImpl<Long> L_ADCVFID = new ParamImpl<Long>('L', 0X200000, "ADCVFID");

   ParamImpl<Long> L_ADCVFRANGE = new ParamImpl<Long>('L', 0X200000, "ADCVFRANGE");

   ParamImpl<Long> L_ADCVFOFFSET = new ParamImpl<Long>('L', 0X200000, "ADCVFOFFSET");

   ParamImpl<Long> L_ADCVFACQMODE = new ParamImpl<Long>('L', 0X200000, "ADCVFACQMODE");

   ParamImpl<Long> L_ADCVFCNVGAIN = new ParamImpl<Long>('L', 0X200000, "ADCVFCNVGAIN");

   ParamImpl<Long> L_ADCVFLLD = new ParamImpl<Long>('L', 0X200000, "ADCVFLLD");

   ParamImpl<Long> L_ADCVFULD = new ParamImpl<Long>('L', 0X200000, "ADCVFULD");

   ParamImpl<Long> L_ADCVFZERO = new ParamImpl<Long>('L', 0X200000, "ADCVFZERO");

   ParamImpl<Long> L_ADCVFANTIC = new ParamImpl<Long>('L', 0X200000, "ADCVFANTIC");

   ParamImpl<Long> L_ADCVFLATEC = new ParamImpl<Long>('L', 0X200000, "ADCVFLATEC");

   ParamImpl<Long> L_ADCVFDELPK = new ParamImpl<Long>('L', 0X200000, "ADCVFDELPK");

   ParamImpl<Long> L_ADCVFNONOV = new ParamImpl<Long>('L', 0X200000, "ADCVFNONOV");

   ParamImpl<Long> L_AMPVFDIFF = new ParamImpl<Long>('L', 0X200000, "AMPVFDIFF");

   ParamImpl<Long> L_ADCVFLTCPUR = new ParamImpl<Long>('L', 0X200000, "ADCVFLTCPUR");

   ParamImpl<Long> L_HVPSFASTRAMP = new ParamImpl<Long>('L', 0X200000, "HVPSFASTRAMP");

   ParamImpl<Long> L_HVPSFBUSY = new ParamImpl<Long>('L', 0X200000, "HVPSFBUSY");

   ParamImpl<Long> L_MEETMDA = new ParamImpl<Long>('L', 0X200000, "MEETMDA");

   ParamImpl<Date> X_MAXPLIVE = new ParamImpl<Date>('X', 0X200000, "MAXPLIVE");

   ParamImpl<Long> L_SRHVPS = new ParamImpl<Long>('L', 0X200000, "SRHVPS");

   ParamImpl<Float> F_SRGATEWIDTH = new ParamImpl<Float>('F', 0X200000, "SRGATEWIDTH");

   ParamImpl<Float> F_SRPREDELAY = new ParamImpl<Float>('F', 0X200000, "SRPREDELAY");

   ParamImpl<Date> X_SRCOUNTTIME = new ParamImpl<Date>('X', 0X200000, "SRCOUNTTIME");

   ParamImpl<String> T_SRIDENT = new ParamImpl<String>('T', 0X20000100, "SRIDENT");

   ParamImpl<Date> X_SRPRESETTIME = new ParamImpl<Date>('X', 0X20000101, "SRPRESETTIME");

   ParamImpl<String> T_SRGAMDETNAME = new ParamImpl<String>('T', 0X20000102, "SRGAMDETNAME");

   ParamImpl<String> T_SRADDRESS = new ParamImpl<String>('T', 0X20000103, "SRADDRESS");

   ParamImpl<Long> L_AMPINTERNAL = new ParamImpl<Long>('L', 0X20000104, "AMPINTERNAL");

   ParamImpl<Float> F_HVPSRANGE = new ParamImpl<Float>('F', 0X20000105, "HVPSRANGE");

   ParamImpl<Long> L_DSSFRNGWIN1 = new ParamImpl<Long>('L', 0X20000106, "DSSFRNGWIN1");

   ParamImpl<Long> L_DSSFRNGWIN2 = new ParamImpl<Long>('L', 0X20000107, "DSSFRNGWIN2");

   ParamImpl<Float> F_STABRATE2 = new ParamImpl<Float>('F', 0X20000108, "STABRATE2");

   ParamImpl<Long> L_STABWIN1S = new ParamImpl<Long>('L', 0X20000109, "STABWIN1S");

   ParamImpl<Long> L_STABWIN2S = new ParamImpl<Long>('L', 0X2000010, "STABWIN2S");

   ParamImpl<Float> F_STABCORR1 = new ParamImpl<Float>('F', 0X2000010, "STABCORR1");

   ParamImpl<Float> F_STABCORR2 = new ParamImpl<Float>('F', 0X2000010, "STABCORR2");

   ParamImpl<String> T_PWRMTYPE = new ParamImpl<String>('T', 0X2000010, "PWRMTYPE");

   ParamImpl<String> T_PWRMID = new ParamImpl<String>('T', 0X2000010, "PWRMID");

   ParamImpl<Long> L_PWRMSTBYDELY = new ParamImpl<Long>('L', 0X2000010, "PWRMSTBYDELY");

   ParamImpl<Long> L_ACQSTRTDELAY = new ParamImpl<Long>('L', 0X20000110, "ACQSTRTDELAY");

   ParamImpl<String> T_PWRMMODE = new ParamImpl<String>('T', 0X20000111, "PWRMMODE");

   ParamImpl<Long> L_PWRMBATTERY = new ParamImpl<Long>('L', 0X20000112, "PWRMBATTERY");

   ParamImpl<Long> L_AMPFINPATT = new ParamImpl<Long>('L', 0X20000113, "AMPFINPATT");

   ParamImpl<Long> L_DSSEVMULT1 = new ParamImpl<Long>('L', 0X20000114, "DSSEVMULT1");

   ParamImpl<Long> L_DSSEVMULT2 = new ParamImpl<Long>('L', 0X20000115, "DSSEVMULT2");

   ParamImpl<Long> L_DODTTEST = new ParamImpl<Long>('L', 0X20000116, "DODTTEST");

   ParamImpl<Float> F_DTLIMIT = new ParamImpl<Float>('F', 0X20000117, "DTLIMIT");

   ParamImpl<String> T_PWRMBATA = new ParamImpl<String>('T', 0X20000118, "PWRMBATA");

   ParamImpl<String> T_PWRMBATB = new ParamImpl<String>('T', 0X20000119, "PWRMBATB");

   ParamImpl<Long> L_ASTFRAMBACK = new ParamImpl<Long>('L', 0X2000011, "ASTFRAMBACK");

   ParamImpl<Long> L_DSSFOVERRNG = new ParamImpl<Long>('L', 0X2000011, "DSSFOVERRNG");

   ParamImpl<Float> F_ACQDETVOL = new ParamImpl<Float>('F', 0X2000011, "ACQDETVOL");

   ParamImpl<Float> F_ACQDETTC = new ParamImpl<Float>('F', 0X2000011, "ACQDETTC");

   ParamImpl<Float> F_ACQDETDEPTH = new ParamImpl<Float>('F', 0X2000011, "ACQDETDEPTH");

   ParamImpl<Float> F_ACQMGAEFSL = new ParamImpl<Float>('F', 0X2000011, "ACQMGAEFSL");

   ParamImpl<Float> F_ACQMGAEFCV = new ParamImpl<Float>('F', 0X20000120, "ACQMGAEFCV");

   ParamImpl<Float> F_PWRMBATAVOLT = new ParamImpl<Float>('F', 0X20000121, "PWRMBATAVOLT");

   ParamImpl<Float> F_PWRMBATBVOLT = new ParamImpl<Float>('F', 0X20000122, "PWRMBATBVOLT");

   ParamImpl<Long> L_PWRMFLAGS = new ParamImpl<Long>('L', 0X20000123, "PWRMFLAGS");

   ParamImpl<Long> L_PWRMFBATS = new ParamImpl<Long>('L', 0X20000124, "PWRMFBATS");

   ParamImpl<Long> L_PWRMFCOMM = new ParamImpl<Long>('L', 0X20000125, "PWRMFCOMM");

   ParamImpl<Long> L_PWRMFBATSEL = new ParamImpl<Long>('L', 0X20000126, "PWRMFBATSEL");

   ParamImpl<Long> L_PWRMFRESET = new ParamImpl<Long>('L', 0X20000127, "PWRMFRESET");

   ParamImpl<Long> L_WACQNSEG = new ParamImpl<Long>('L', 0X20000128, "WACQNSEG");

   ParamImpl<Float> F_WACQSEGWIDTH = new ParamImpl<Float>('F', 0X20000129, "WACQSEGWIDTH");

   ParamImpl<Float> F_WACQSEGCTIME = new ParamImpl<Float>('F', 0X2000012, "WACQSEGCTIME");

   ParamImpl<Float> F_WACQTRCTIME = new ParamImpl<Float>('F', 0X2000012, "WACQTRCTIME");

   ParamImpl<Float> F_WACQOFFSET = new ParamImpl<Float>('F', 0X2000012, "WACQOFFSET");

   ParamImpl<Float> F_WACQSTEPLEN = new ParamImpl<Float>('F', 0X2000012, "WACQSTEPLEN");

   ParamImpl<String> T_WACQADDRESS = new ParamImpl<String>('T', 0X2000012, "WACQADDRESS");

   ParamImpl<String> T_WACQMCTYPE = new ParamImpl<String>('T', 0X2000012, "WACQMCTYPE");

   ParamImpl<Float> F_WACQROTSPEED = new ParamImpl<Float>('F', 0X20000130, "WACQROTSPEED");

   ParamImpl<Long> L_ACQFWACQREAL = new ParamImpl<Long>('L', 0X20000131, "ACQFWACQREAL");

   ParamImpl<Long> L_HVPSFAULT = new ParamImpl<Long>('L', 0X20000132, "HVPSFAULT");

   ParamImpl<Float> F_ACQDETDIAM = new ParamImpl<Float>('F', 0X20000133, "ACQDETDIAM");

   ParamImpl<Float> F_ACQDETWIDTH = new ParamImpl<Float>('F', 0X20000134, "ACQDETWIDTH");

   ParamImpl<Long> L_DSSFOVERRNG1 = new ParamImpl<Long>('L', 0X20000135, "DSSFOVERRNG1");

   ParamImpl<Long> L_PWRMFFAULT = new ParamImpl<Long>('L', 0X20000136, "PWRMFFAULT");

   ParamImpl<String> T_DETTYPE = new ParamImpl<String>('T', 0X20000137, "DETTYPE");

   ParamImpl<Long> L_ACQFW2MDAACT = new ParamImpl<Long>('L', 0X20000138, "ACQFW2MDAACT");

   ParamImpl<Float> F_DET1PERCENTS = new ParamImpl<Float>('F', 0X20000139, "DET1PERCENTS");

   ParamImpl<Float> F_DET2PERCENTS = new ParamImpl<Float>('F', 0X2000013, "DET2PERCENTS");

   ParamImpl<Float> F_DET3PERCENTS = new ParamImpl<Float>('F', 0X2000013, "DET3PERCENTS");

   ParamImpl<Float> F_DET4PERCENTS = new ParamImpl<Float>('F', 0X2000013, "DET4PERCENTS");

   ParamImpl<Float> F_DET5PERCENTS = new ParamImpl<Float>('F', 0X2000013, "DET5PERCENTS");

   ParamImpl<Float> F_DET6PERCENTS = new ParamImpl<Float>('F', 0X2000013, "DET6PERCENTS");

   ParamImpl<Float> F_DET7PERCENTS = new ParamImpl<Float>('F', 0X2000013, "DET7PERCENTS");

   ParamImpl<Float> F_DET8PERCENTS = new ParamImpl<Float>('F', 0X20000140, "DET8PERCENTS");

   ParamImpl<Long> L_MCSDATA1ST = new ParamImpl<Long>('L', 0X20000141, "MCSDATA1ST");

   ParamImpl<Long> L_MCSINPUT = new ParamImpl<Long>('L', 0X20000142, "MCSINPUT");

   ParamImpl<String> T_MCSADDRESS = new ParamImpl<String>('T', 0X20000143, "MCSADDRESS");

   ParamImpl<Long> L_MCSGROUPS = new ParamImpl<Long>('L', 0X20000144, "MCSGROUPS");

   ParamImpl<Long> L_MCSEXTADV = new ParamImpl<Long>('L', 0X20000145, "MCSEXTADV");

   ParamImpl<String> T_VACDEVTYPE = new ParamImpl<String>('T', 0X20000146, "VACDEVTYPE");

   ParamImpl<String> T_VACADDRESS = new ParamImpl<String>('T', 0X20000147, "VACADDRESS");

   ParamImpl<String> T_VACDEVID = new ParamImpl<String>('T', 0X20000148, "VACDEVID");

   ParamImpl<Float> F_VACAIRTHICK = new ParamImpl<Float>('F', 0X20000149, "VACAIRTHICK");

   ParamImpl<Float> F_VACPRESSET = new ParamImpl<Float>('F', 0X2000014, "VACPRESSET");

   ParamImpl<Float> F_VACPRESREAD = new ParamImpl<Float>('F', 0X2000014, "VACPRESREAD");

   ParamImpl<Float> F_VACMINTHRESH = new ParamImpl<Float>('F', 0X2000014, "VACMINTHRESH");

   ParamImpl<Float> F_VACMAXTHRESH = new ParamImpl<Float>('F', 0X2000014, "VACMAXTHRESH");

   ParamImpl<String> T_VACVALVE = new ParamImpl<String>('T', 0X2000014, "VACVALVE");

   ParamImpl<String> T_VACSTATUS = new ParamImpl<String>('T', 0X2000014, "VACSTATUS");

   ParamImpl<Long> L_VACFLAGS = new ParamImpl<Long>('L', 0X20000150, "VACFLAGS");

   ParamImpl<Long> L_VACFREG = new ParamImpl<Long>('L', 0X20000151, "VACFREG");

   ParamImpl<Float> F_AMPPENERGY = new ParamImpl<Float>('F', 0X20000152, "AMPPENERGY");

   ParamImpl<Float> F_AMPPGAIN = new ParamImpl<Float>('F', 0X20000153, "AMPPGAIN");

   ParamImpl<Long> L_AMPFPULSER = new ParamImpl<Long>('L', 0X20000154, "AMPFPULSER");

   ParamImpl<Float> F_HVPSLEAKAGE = new ParamImpl<Float>('F', 0X20000155, "HVPSLEAKAGE");

   ParamImpl<Long> L_ALARMCOUNTS = new ParamImpl<Long>('L', 0X20000156, "ALARMCOUNTS");

   ParamImpl<Date> X_ALARMTIME = new ParamImpl<Date>('X', 0X20000157, "ALARMTIME");

   ParamImpl<Long> L_MCAFLAGS = new ParamImpl<Long>('L', 0X20000158, "MCAFLAGS");

   ParamImpl<Long> L_MCAFCRARMED = new ParamImpl<Long>('L', 0X20000159, "MCAFCRARMED");

   ParamImpl<Float> F_ACQAIRTEMP = new ParamImpl<Float>('F', 0X2000015, "ACQAIRTEMP");

   ParamImpl<String> T_ACQINPUTID = new ParamImpl<String>('T', 0X2000015, "ACQINPUTID");

   ParamImpl<String> T_CHAMBERSTAT = new ParamImpl<String>('T', 0X2000015, "CHAMBERSTAT");

   ParamImpl<String> T_WACQPASSMODE = new ParamImpl<String>('T', 0X2000015, "WACQPASSMODE");

   ParamImpl<Float> F_WACQDELTA = new ParamImpl<Float>('F', 0X2000015, "WACQDELTA");

   ParamImpl<Long> L_WACQNPOS = new ParamImpl<Long>('L', 0X2000015, "WACQNPOS");

   ParamImpl<Long> L_WACQPOS = new ParamImpl<Long>('L', 0X20000160, "WACQPOS");

   ParamImpl<Long> L_WACQDET = new ParamImpl<Long>('L', 0X20000161, "WACQDET");

   ParamImpl<Long> L_ACQFSCAN = new ParamImpl<Long>('L', 0X20000162, "ACQFSCAN");

   ParamImpl<Long> L_ACQFSEG = new ParamImpl<Long>('L', 0X20000163, "ACQFSEG");

   ParamImpl<Long> L_ACQFMSS = new ParamImpl<Long>('L', 0X20000164, "ACQFMSS");

   ParamImpl<Long> L_ACQFTRANS = new ParamImpl<Long>('L', 0X20000165, "ACQFTRANS");

   ParamImpl<Long> L_ECFPULSER = new ParamImpl<Long>('L', 0X20000166, "ECFPULSER");

   ParamImpl<Long> L_WACQTRANSRC = new ParamImpl<Long>('L', 0X20000167, "WACQTRANSRC");

   ParamImpl<Long> L_WACQCOLPOS = new ParamImpl<Long>('L', 0X20000168, "WACQCOLPOS");

   ParamImpl<Long> L_WACQSEGMENT = new ParamImpl<Long>('L', 0X20000169, "WACQSEGMENT");

   ParamImpl<Float> F_WACQAVEDOSE = new ParamImpl<Float>('F', 0X2000016, "WACQAVEDOSE");

   ParamImpl<Float> F_WACQMAXDOSE = new ParamImpl<Float>('F', 0X2000016, "WACQMAXDOSE");

   ParamImpl<Long> L_ACQFCOLLIMAT = new ParamImpl<Long>('L', 0X2000016, "ACQFCOLLIMAT");

   ParamImpl<Long> L_ACQFAUTOCOL = new ParamImpl<Long>('L', 0X2000016, "ACQFAUTOCOL");

   ParamImpl<Long> L_ACQFSEPSEG = new ParamImpl<Long>('L', 0X2000016, "ACQFSEPSEG");

   ParamImpl<Float> F_AREFENG = new ParamImpl<Float>('F', 0X2000016, "AREFENG");

   ParamImpl<Float> F_AREFRATE = new ParamImpl<Float>('F', 0X20000170, "AREFRATE");

   ParamImpl<Float> F_ADREFRATE = new ParamImpl<Float>('F', 0X20000171, "ADREFRATE");

   ParamImpl<Date> X_AREFDATE = new ParamImpl<Date>('X', 0X20000172, "AREFDATE");

   ParamImpl<Date> X_AREFHLF = new ParamImpl<Date>('X', 0X20000173, "AREFHLF");

   ParamImpl<String> T_AREFHLFUNITS = new ParamImpl<String>('T', 0X20000174, "AREFHLFUNITS");

   ParamImpl<Float> F_DETTEMP = new ParamImpl<Float>('F', 0X20000175, "DETTEMP");

   ParamImpl<Long> L_VACFFAULT = new ParamImpl<Long>('L', 0X20000176, "VACFFAULT");

   ParamImpl<Long> L_ACQNUMMEAS = new ParamImpl<Long>('L', 0X20000177, "ACQNUMMEAS");

   ParamImpl<Long> L_ACQNUMMEASA = new ParamImpl<Long>('L', 0X20000178, "ACQNUMMEASA");

   ParamImpl<Long> L_WACQSKIPSEGS = new ParamImpl<Long>('L', 0X20000179, "WACQSKIPSEGS");

   ParamImpl<Long> L_PLCHERROR = new ParamImpl<Long>('L', 0X2000017, "PLCHERROR");

   ParamImpl<Long> L_PLCSERROR = new ParamImpl<Long>('L', 0X2000017, "PLCSERROR");

   ParamImpl<Long> L_PLCOOSREASON = new ParamImpl<Long>('L', 0X2000017, "PLCOOSREASON");

   ParamImpl<Float> F_WACQAVEDOSED = new ParamImpl<Float>('F', 0X2000017, "WACQAVEDOSED");

   ParamImpl<Float> F_WACQMAXDOSED = new ParamImpl<Float>('F', 0X2000017, "WACQMAXDOSED");

   ParamImpl<Float> F_AMPPOFFSET = new ParamImpl<Float>('F', 0X2000017, "AMPPOFFSET");

   ParamImpl<String> T_DETID = new ParamImpl<String>('T', 0X20000180, "DETID");

   ParamImpl<Float> F_ENRICHCAL93 = new ParamImpl<Float>('F', 0X20000181, "ENRICHCAL93");

   ParamImpl<Float> F_ENRICHCAL186 = new ParamImpl<Float>('F', 0X20000182, "ENRICHCAL186");

   ParamImpl<Long> L_WACQDOSEDONE = new ParamImpl<Long>('L', 0X20000183, "WACQDOSEDONE");

   ParamImpl<Float> F_AMPFILTERRT = new ParamImpl<Float>('F', 0X20000185, "AMPFILTERRT");

   ParamImpl<Float> F_AMPFILTERFT = new ParamImpl<Float>('F', 0X20000186, "AMPFILTERFT");

   ParamImpl<String> T_AMPFDMODE = new ParamImpl<String>('T', 0X20000187, "AMPFDMODE");

   ParamImpl<Float> F_AMPFD = new ParamImpl<Float>('F', 0X20000188, "AMPFD");

   ParamImpl<Float> F_AMPPURG = new ParamImpl<Float>('F', 0X20000189, "AMPPURG");

   ParamImpl<Long> L_AMPLTTRIM = new ParamImpl<Long>('L', 0X2000018, "AMPLTTRIM");

   ParamImpl<Float> F_AMPICR = new ParamImpl<Float>('F', 0X2000018, "AMPICR");

   ParamImpl<Long> L_AMPINHTRPMOD = new ParamImpl<Long>('L', 0X2000018, "AMPINHTRPMOD");

   ParamImpl<String> T_GAINADDRESS = new ParamImpl<String>('T', 0X2000018, "GAINADDRESS");

   ParamImpl<String> T_GAINTYPE = new ParamImpl<String>('T', 0X2000018, "GAINTYPE");

   ParamImpl<String> T_GAINID = new ParamImpl<String>('T', 0X2000018, "GAINID");

   ParamImpl<String> T_FLTADDRESS = new ParamImpl<String>('T', 0X20000190, "FLTADDRESS");

   ParamImpl<String> T_FLTTYPE = new ParamImpl<String>('T', 0X20000191, "FLTTYPE");

   ParamImpl<String> T_FLTID = new ParamImpl<String>('T', 0X20000192, "FLTID");

   ParamImpl<Float> F_DSSZERORATIO = new ParamImpl<Float>('F', 0X20000193, "DSSZERORATIO");

   ParamImpl<Float> F_DSSGAINRATIO = new ParamImpl<Float>('F', 0X20000194, "DSSGAINRATIO");

   ParamImpl<Long> L_AMPVFDMODE = new ParamImpl<Long>('L', 0X20000195, "AMPVFDMODE");

   ParamImpl<Long> L_AMPVFD = new ParamImpl<Long>('L', 0X20000196, "AMPVFD");

   ParamImpl<Long> L_AMPVPURG = new ParamImpl<Long>('L', 0X20000197, "AMPVPURG");

   ParamImpl<Long> L_AMPVINHTRPMD = new ParamImpl<Long>('L', 0X20000198, "AMPVINHTRPMD");

   ParamImpl<Long> L_AMPVLTTRIM = new ParamImpl<Long>('L', 0X20000199, "AMPVLTTRIM");

   ParamImpl<Long> L_AMPVFILTERRT = new ParamImpl<Long>('L', 0X2000019, "AMPVFILTERRT");

   ParamImpl<Long> L_AMPVFILTERFT = new ParamImpl<Long>('L', 0X2000019, "AMPVFILTERFT");

   ParamImpl<Long> L_AMPVGAINID = new ParamImpl<Long>('L', 0X2000019, "AMPVGAINID");

   ParamImpl<Long> L_DSSVFLAGS = new ParamImpl<Long>('L', 0X2000019, "DSSVFLAGS");

   ParamImpl<Long> L_DSSVWIN1C = new ParamImpl<Long>('L', 0X2000019, "DSSVWIN1C");

   ParamImpl<Long> L_DSSVWIN1R = new ParamImpl<Long>('L', 0X2000019, "DSSVWIN1R");

   ParamImpl<Long> L_DSSVWIN1S = new ParamImpl<Long>('L', 0X200001, "DSSVWIN1S");

   ParamImpl<Long> L_DSSVEVMULT1 = new ParamImpl<Long>('L', 0X200001, "DSSVEVMULT1");

   ParamImpl<Long> L_DSSVFRNGWIN1 = new ParamImpl<Long>('L', 0X200001, "DSSVFRNGWIN1");

   ParamImpl<Long> L_DSSVWIN1MODE = new ParamImpl<Long>('L', 0X200001, "DSSVWIN1MODE");

   ParamImpl<Long> L_DSSVWIN2C = new ParamImpl<Long>('L', 0X200001, "DSSVWIN2C");

   ParamImpl<Long> L_DSSVWIN2R = new ParamImpl<Long>('L', 0X200001, "DSSVWIN2R");

   ParamImpl<Long> L_DSSVWIN2S = new ParamImpl<Long>('L', 0X200001, "DSSVWIN2S");

   ParamImpl<Long> L_DSSVEVMULT2 = new ParamImpl<Long>('L', 0X200001, "DSSVEVMULT2");

   ParamImpl<Long> L_DSSVFRNGWIN2 = new ParamImpl<Long>('L', 0X200001, "DSSVFRNGWIN2");

   ParamImpl<Long> L_DSSVWIN2MODE = new ParamImpl<Long>('L', 0X200001, "DSSVWIN2MODE");

   ParamImpl<Long> L_DSSVZERORAT = new ParamImpl<Long>('L', 0X200001, "DSSVZERORAT");

   ParamImpl<Long> L_DSSVGAINRAT = new ParamImpl<Long>('L', 0X200001, "DSSVGAINRAT");

   ParamImpl<Long> L_AMPFBDCSTART = new ParamImpl<Long>('L', 0X200001, "AMPFBDCSTART");

   ParamImpl<Long> L_AMPFBDCBUSY = new ParamImpl<Long>('L', 0X200001, "AMPFBDCBUSY");

   ParamImpl<Long> L_AMPFBDCFAIL = new ParamImpl<Long>('L', 0X200001, "AMPFBDCFAIL");

   ParamImpl<Float> F_ASAMPDIST = new ParamImpl<Float>('F', 0X200001, "ASAMPDIST");

   ParamImpl<Long> L_ACQMPHAPORT = new ParamImpl<Long>('L', 0X200001, "ACQMPHAPORT");

   ParamImpl<Long> L_ACQMMCSPORT = new ParamImpl<Long>('L', 0X200001, "ACQMMCSPORT");

   ParamImpl<Long> L_ACQMSCPOL = new ParamImpl<Long>('L', 0X200001, "ACQMSCPOL");

   ParamImpl<String> T_PULSERADDR = new ParamImpl<String>('T', 0X200001, "PULSERADDR");

   ParamImpl<String> T_PULSERTYPE = new ParamImpl<String>('T', 0X200001, "PULSERTYPE");

   ParamImpl<String> T_PULSERID = new ParamImpl<String>('T', 0X200001, "PULSERID");

   ParamImpl<String> T_PULSERMODE = new ParamImpl<String>('T', 0X200001, "PULSERMODE");

   ParamImpl<Long> L_PULSERBUFSIZ = new ParamImpl<Long>('L', 0X200001, "PULSERBUFSIZ");

   ParamImpl<Long> L_PULSERLOFF = new ParamImpl<Long>('L', 0X200001, "PULSERLOFF");

   ParamImpl<Long> L_PULSERHOFF = new ParamImpl<Long>('L', 0X200001, "PULSERHOFF");

   ParamImpl<Long> L_PULSERLTIM = new ParamImpl<Long>('L', 0X200001, "PULSERLTIM");

   ParamImpl<Long> L_PULSERHTIM = new ParamImpl<Long>('L', 0X200001, "PULSERHTIM");

   ParamImpl<Long> L_PULSERRATE = new ParamImpl<Long>('L', 0X200001, "PULSERRATE");

   ParamImpl<Long> L_PULSERFLAGS = new ParamImpl<Long>('L', 0X200001, "PULSERFLAGS");

   ParamImpl<Long> L_PULSERFPOL = new ParamImpl<Long>('L', 0X200001, "PULSERFPOL");

   ParamImpl<Long> L_MCSFSWMODE = new ParamImpl<Long>('L', 0X200001, "MCSFSWMODE");

   ParamImpl<Long> L_MCSROISTART = new ParamImpl<Long>('L', 0X200001, "MCSROISTART");

   ParamImpl<Long> L_MCSROIEND = new ParamImpl<Long>('L', 0X200001, "MCSROIEND");

   ParamImpl<String> T_MCSDISCMODE = new ParamImpl<String>('T', 0X200001, "MCSDISCMODE");

   ParamImpl<Long> L_MCSFEXTSTART = new ParamImpl<Long>('L', 0X200001, "MCSFEXTSTART");

   ParamImpl<Long> L_MCSFEXTSTOP = new ParamImpl<Long>('L', 0X200001, "MCSFEXTSTOP");

   ParamImpl<Long> L_MCSFSWDONE = new ParamImpl<Long>('L', 0X200001, "MCSFSWDONE");

   ParamImpl<Long> L_MCAFEXTSTART = new ParamImpl<Long>('L', 0X200001, "MCAFEXTSTART");

   ParamImpl<Long> L_MCAFEXTSTOP = new ParamImpl<Long>('L', 0X200001, "MCAFEXTSTOP");

   ParamImpl<Long> L_HVPSVFRANGE = new ParamImpl<Long>('L', 0X200001, "HVPSVFRANGE");

   ParamImpl<Long> L_PULSERVFLAGS = new ParamImpl<Long>('L', 0X200001, "PULSERVFLAGS");

   ParamImpl<Long> L_PULSERVFMODE = new ParamImpl<Long>('L', 0X200001, "PULSERVFMODE");

   ParamImpl<Long> L_PULSERVFBSIZ = new ParamImpl<Long>('L', 0X200001, "PULSERVFBSIZ");

   ParamImpl<Long> L_PULSERVFLOFF = new ParamImpl<Long>('L', 0X200001, "PULSERVFLOFF");

   ParamImpl<Long> L_PULSERVFHOFF = new ParamImpl<Long>('L', 0X200001, "PULSERVFHOFF");

   ParamImpl<Long> L_PULSERVFLTIM = new ParamImpl<Long>('L', 0X200001, "PULSERVFLTIM");

   ParamImpl<Long> L_PULSERVFHTIM = new ParamImpl<Long>('L', 0X200001, "PULSERVFHTIM");

   ParamImpl<Long> L_PULSERVFRATE = new ParamImpl<Long>('L', 0X200001, "PULSERVFRATE");

   ParamImpl<Long> L_PULSERVFPOL = new ParamImpl<Long>('L', 0X200001, "PULSERVFPOL");

   ParamImpl<Long> L_ACQMVFLGS = new ParamImpl<Long>('L', 0X200001, "ACQMVFLGS");

   ParamImpl<Long> L_ACQMVFSCPOL = new ParamImpl<Long>('L', 0X200001, "ACQMVFSCPOL");

   ParamImpl<Long> L_MCAVFLAGS = new ParamImpl<Long>('L', 0X200001, "MCAVFLAGS");

   ParamImpl<Long> L_MCAVFEXTSTR = new ParamImpl<Long>('L', 0X200001, "MCAVFEXTSTR");

   ParamImpl<Long> L_MCAVFEXTSTP = new ParamImpl<Long>('L', 0X200001, "MCAVFEXTSTP");

   ParamImpl<Long> L_MCSVFLAGS = new ParamImpl<Long>('L', 0X200001, "MCSVFLAGS");

   ParamImpl<Long> L_MCSVFDSCMOD = new ParamImpl<Long>('L', 0X200001, "MCSVFDSCMOD");

   ParamImpl<Long> L_MCSVFROISTR = new ParamImpl<Long>('L', 0X200001, "MCSVFROISTR");

   ParamImpl<Long> L_MCSVFROIEND = new ParamImpl<Long>('L', 0X200001, "MCSVFROIEND");

   ParamImpl<Long> L_MCSVFEXTSTR = new ParamImpl<Long>('L', 0X200001, "MCSVFEXTSTR");

   ParamImpl<Long> L_MCSVFEXTSTP = new ParamImpl<Long>('L', 0X200001, "MCSVFEXTSTP");

   ParamImpl<Long> L_DWELLRANGE = new ParamImpl<Long>('L', 0X200001, "DWELLRANGE");

   ParamImpl<Long> L_DWELLVALUE = new ParamImpl<Long>('L', 0X200001, "DWELLVALUE");

   ParamImpl<Long> L_MCSVFDWLRNG = new ParamImpl<Long>('L', 0X200001, "MCSVFDWLRNG");

   ParamImpl<Long> L_MCSVFDWLVAL = new ParamImpl<Long>('L', 0X200001, "MCSVFDWLVAL");

   ParamImpl<Float> F_MCSSCANWSIZE = new ParamImpl<Float>('F', 0X200001, "MCSSCANWSIZE");

   ParamImpl<Float> F_MCSSCANSTART = new ParamImpl<Float>('F', 0X200001, "MCSSCANSTART");

   ParamImpl<Float> F_MCSSCANEND = new ParamImpl<Float>('F', 0X200001, "MCSSCANEND");

   ParamImpl<Float> F_MCSLLD = new ParamImpl<Float>('F', 0X200001, "MCSLLD");

   ParamImpl<Float> F_MCSULD = new ParamImpl<Float>('F', 0X200001, "MCSULD");

   ParamImpl<Long> L_ACQMISGAMMA = new ParamImpl<Long>('L', 0X200001, "ACQMISGAMMA");

   ParamImpl<Long> L_ACQMISNEUT = new ParamImpl<Long>('L', 0X200001, "ACQMISNEUT");

   ParamImpl<String> T_DETENGTYPE = new ParamImpl<String>('T', 0X200001, "DETENGTYPE");

   ParamImpl<Long> L_LLDAUTOMODE = new ParamImpl<Long>('L', 0X200001, "LLDAUTOMODE");

   ParamImpl<Long> L_GAINATTMODE = new ParamImpl<Long>('L', 0X200001, "GAINATTMODE");

   ParamImpl<Float> F_GAININHIBIT = new ParamImpl<Float>('F', 0X200001, "GAININHIBIT");

   ParamImpl<String> T_MCAHWVERSION = new ParamImpl<String>('T', 0X200001, "MCAHWVERSION");

   ParamImpl<String> T_DSPVERSION = new ParamImpl<String>('T', 0X200001, "DSPVERSION");

   ParamImpl<Long> L_DSCOPESFAC = new ParamImpl<Long>('L', 0X200001, "DSCOPESFAC");

   ParamImpl<Float> F_AZETARATE = new ParamImpl<Float>('F', 0X200001, "AZETARATE");

   ParamImpl<Long> L_AMPINPUTCTRL = new ParamImpl<Long>('L', 0X200001, "AMPINPUTCTRL");

   ParamImpl<Long> L_AMPDISCRIM = new ParamImpl<Long>('L', 0X200001, "AMPDISCRIM");

   ParamImpl<Long> L_HVPSFALARMS = new ParamImpl<Long>('L', 0X200001, "HVPSFALARMS");

   ParamImpl<Long> L_HVPSFSHUTDN = new ParamImpl<Long>('L', 0X200001, "HVPSFSHUTDN");

   ParamImpl<Long> L_WACQSEGVIEWS = new ParamImpl<Long>('L', 0X200001, "WACQSEGVIEWS");

   ParamImpl<Long> L_WACQSEGCELLS = new ParamImpl<Long>('L', 0X200001, "WACQSEGCELLS");

   ParamImpl<Long> L_ATGSSCANMODE = new ParamImpl<Long>('L', 0X200001, "ATGSSCANMODE");

   ParamImpl<Float> F_ATGSREFRATE = new ParamImpl<Float>('F', 0X200001, "ATGSREFRATE");

   ParamImpl<Float> F_ADBIFACA = new ParamImpl<Float>('F', 0X200001, "ADBIFACA");

   ParamImpl<Float> F_ADBIFACB = new ParamImpl<Float>('F', 0X200001, "ADBIFACB");

   ParamImpl<Float> F_ADBIFACC = new ParamImpl<Float>('F', 0X200001, "ADBIFACC");

   ParamImpl<Float> F_ADBIFACD = new ParamImpl<Float>('F', 0X200001, "ADBIFACD");

   ParamImpl<Float> F_ADBIFACE = new ParamImpl<Float>('F', 0X200001, "ADBIFACE");

   ParamImpl<Float> F_AFSDFACA = new ParamImpl<Float>('F', 0X200001, "AFSDFACA");

   ParamImpl<Float> F_AFSDFACB = new ParamImpl<Float>('F', 0X200001, "AFSDFACB");

   ParamImpl<Float> F_AFSDFACC = new ParamImpl<Float>('F', 0X200001, "AFSDFACC");

   ParamImpl<Float> F_AFSDFACD = new ParamImpl<Float>('F', 0X20000200, "AFSDFACD");

   ParamImpl<Float> F_AFSDFACE = new ParamImpl<Float>('F', 0X20000201, "AFSDFACE");

   ParamImpl<Float> F_AFSDFACF = new ParamImpl<Float>('F', 0X20000202, "AFSDFACF");

   ParamImpl<Float> F_AFSDFACG = new ParamImpl<Float>('F', 0X20000203, "AFSDFACG");

   ParamImpl<Float> F_APMNOMTHRESH = new ParamImpl<Float>('F', 0X20000204, "APMNOMTHRESH");

   ParamImpl<Float> F_APMHYSTFAC = new ParamImpl<Float>('F', 0X20000205, "APMHYSTFAC");

   ParamImpl<Float> F_SRLONGDELAY = new ParamImpl<Float>('F', 0X20000206, "SRLONGDELAY");

   ParamImpl<Long> L_WACQDOSETYP1 = new ParamImpl<Long>('L', 0X20000207, "WACQDOSETYP1");

   ParamImpl<Long> L_WACQDOSETYP2 = new ParamImpl<Long>('L', 0X20000208, "WACQDOSETYP2");

   ParamImpl<Float> F_WACQAVEDOSE2 = new ParamImpl<Float>('F', 0X20000209, "WACQAVEDOSE2");

   ParamImpl<Float> F_WACQMAXDOSE2 = new ParamImpl<Float>('F', 0X2000020, "WACQMAXDOSE2");

   ParamImpl<Long> L_WACQDOSETYP3 = new ParamImpl<Long>('L', 0X2000020, "WACQDOSETYP3");

   ParamImpl<Float> F_WACQAVEDOSE3 = new ParamImpl<Float>('F', 0X2000020, "WACQAVEDOSE3");

   ParamImpl<Float> F_WACQMAXDOSE3 = new ParamImpl<Float>('F', 0X2000020, "WACQMAXDOSE3");

   ParamImpl<Long> L_WACQDOSETYP4 = new ParamImpl<Long>('L', 0X2000020, "WACQDOSETYP4");

   ParamImpl<Float> F_WACQAVEDOSE4 = new ParamImpl<Float>('F', 0X2000020, "WACQAVEDOSE4");

   ParamImpl<Float> F_WACQMAXDOSE4 = new ParamImpl<Float>('F', 0X20000210, "WACQMAXDOSE4");

   ParamImpl<Long> L_WACQDOSETYP5 = new ParamImpl<Long>('L', 0X20000211, "WACQDOSETYP5");

   ParamImpl<Float> F_WACQAVEDOSE5 = new ParamImpl<Float>('F', 0X20000212, "WACQAVEDOSE5");

   ParamImpl<Float> F_WACQMAXDOSE5 = new ParamImpl<Float>('F', 0X20000213, "WACQMAXDOSE5");

   ParamImpl<Long> L_WACQDOSETYP6 = new ParamImpl<Long>('L', 0X20000214, "WACQDOSETYP6");

   ParamImpl<Float> F_WACQAVEDOSE6 = new ParamImpl<Float>('F', 0X20000215, "WACQAVEDOSE6");

   ParamImpl<Float> F_WACQMAXDOSE6 = new ParamImpl<Float>('F', 0X20000216, "WACQMAXDOSE6");

   ParamImpl<Long> L_WACQDOSETYP7 = new ParamImpl<Long>('L', 0X20000217, "WACQDOSETYP7");

   ParamImpl<Float> F_WACQAVEDOSE7 = new ParamImpl<Float>('F', 0X20000218, "WACQAVEDOSE7");

   ParamImpl<Float> F_WACQMAXDOSE7 = new ParamImpl<Float>('F', 0X20000219, "WACQMAXDOSE7");

   ParamImpl<Long> L_WACQDOSETYP8 = new ParamImpl<Long>('L', 0X2000021, "WACQDOSETYP8");

   ParamImpl<Float> F_WACQAVEDOSE8 = new ParamImpl<Float>('F', 0X2000021, "WACQAVEDOSE8");

   ParamImpl<Float> F_WACQMAXDOSE8 = new ParamImpl<Float>('F', 0X2000021, "WACQMAXDOSE8");

   ParamImpl<Float> F_AGAMDOSERATE = new ParamImpl<Float>('F', 0X2000021, "AGAMDOSERATE");

   ParamImpl<Float> F_ANEUTDOSERAT = new ParamImpl<Float>('F', 0X2000021, "ANEUTDOSERAT");

   ParamImpl<Float> F_AGAMCOUNTRAT = new ParamImpl<Float>('F', 0X2000021, "AGAMCOUNTRAT");

   ParamImpl<Float> F_ANEUTCOUNTRA = new ParamImpl<Float>('F', 0X20000220, "ANEUTCOUNTRA");

   ParamImpl<Float> F_SHFDWELLHOME = new ParamImpl<Float>('F', 0X20000221, "SHFDWELLHOME");

   ParamImpl<Float> F_SHFDWELLITEM = new ParamImpl<Float>('F', 0X20000222, "SHFDWELLITEM");

   ParamImpl<Long> L_PSHUFFLES = new ParamImpl<Long>('L', 0X20000223, "PSHUFFLES");

   ParamImpl<Long> L_ESHUFFLES = new ParamImpl<Long>('L', 0X20000224, "ESHUFFLES");

   ParamImpl<Long> L_ACQFGAINSTBL = new ParamImpl<Long>('L', 0X20000225, "ACQFGAINSTBL");

   ParamImpl<Long> L_WACQFREVSCAN = new ParamImpl<Long>('L', 0X20000226, "WACQFREVSCAN");

   ParamImpl<Float> F_WACQDUALGSEP = new ParamImpl<Float>('F', 0X20000227, "WACQDUALGSEP");

   ParamImpl<Long> L_WACQDUALGMOD = new ParamImpl<Long>('L', 0X20000228, "WACQDUALGMOD");

   ParamImpl<Long> L_WACQDETGEOM = new ParamImpl<Long>('L', 0X20000229, "WACQDETGEOM");

   ParamImpl<Float> F_ACQHUMIDITY = new ParamImpl<Float>('F', 0X2000022, "ACQHUMIDITY");

   ParamImpl<Float> F_ACQAIRPRESS = new ParamImpl<Float>('F', 0X2000022, "ACQAIRPRESS");

   ParamImpl<Long> L_SCSAMPLENUM = new ParamImpl<Long>('L', 0X2000022, "SCSAMPLENUM");

   ParamImpl<Object> V_ACQMF_WAITACQCOMP = new ParamImpl<Object>('V', 0X00000000, "ACQMF_WAITACQCOMP");

   ParamImpl<Object> M_ACQMF_WAITACQCOMP = new ParamImpl<Object>('M', 0X00000001, "ACQMF_WAITACQCOMP");

   ParamImpl<Object> V_ACQMF_DETNOTAVAIL = new ParamImpl<Object>('V', 0X00000001, "ACQMF_DETNOTAVAIL");

   ParamImpl<Object> M_ACQMF_DETNOTAVAIL = new ParamImpl<Object>('M', 0X00000002, "ACQMF_DETNOTAVAIL");

   ParamImpl<Object> V_ACQMF_DETHASSC = new ParamImpl<Object>('V', 0X00000002, "ACQMF_DETHASSC");

   ParamImpl<Object> M_ACQMF_DETHASSC = new ParamImpl<Object>('M', 0X00000004, "ACQMF_DETHASSC");

   ParamImpl<Object> V_ACQMF_SCMANUAL = new ParamImpl<Object>('V', 0X00000003, "ACQMF_SCMANUAL");

   ParamImpl<Object> M_ACQMF_SCMANUAL = new ParamImpl<Object>('M', 0X00000008, "ACQMF_SCMANUAL");

   ParamImpl<Object> V_ACQMF_SCIGNORETO = new ParamImpl<Object>('V', 0X00000004, "ACQMF_SCIGNORETO");

   ParamImpl<Object> M_ACQMF_SCIGNORETO = new ParamImpl<Object>('M', 0X00000010, "ACQMF_SCIGNORETO");

   ParamImpl<Object> V_ACQMF_MEETMDA = new ParamImpl<Object>('V', 0X00000005, "ACQMF_MEETMDA");

   ParamImpl<Object> M_ACQMF_MEETMDA = new ParamImpl<Object>('M', 0X00000020, "ACQMF_MEETMDA");

   ParamImpl<Object> V_ACQMF_DODTTEST = new ParamImpl<Object>('V', 0X00000006, "ACQMF_DODTTEST");

   ParamImpl<Object> M_ACQMF_DODTTEST = new ParamImpl<Object>('M', 0X00000040, "ACQMF_DODTTEST");

   ParamImpl<Object> V_ACQMF_WACQREAL = new ParamImpl<Object>('V', 0X00000007, "ACQMF_WACQREAL");

   ParamImpl<Object> M_ACQMF_WACQREAL = new ParamImpl<Object>('M', 0X00000080, "ACQMF_WACQREAL");

   ParamImpl<Object> V_ACQMF_W2MDAACT = new ParamImpl<Object>('V', 0X00000008, "ACQMF_W2MDAACT");

   ParamImpl<Object> M_ACQMF_W2MDAACT = new ParamImpl<Object>('M', 0X00000100, "ACQMF_W2MDAACT");

   ParamImpl<Object> V_ACQMF_SCAN = new ParamImpl<Object>('V', 0X00000009, "ACQMF_SCAN");

   ParamImpl<Object> M_ACQMF_SCAN = new ParamImpl<Object>('M', 0X00000200, "ACQMF_SCAN");

   ParamImpl<Object> V_ACQMF_SEG = new ParamImpl<Object>('V', 0X0000000, "ACQMF_SEG");

   ParamImpl<Object> M_ACQMF_SEG = new ParamImpl<Object>('M', 0X00000400, "ACQMF_SEG");

   ParamImpl<Object> V_ACQMF_MSS = new ParamImpl<Object>('V', 0X0000000, "ACQMF_MSS");

   ParamImpl<Object> M_ACQMF_MSS = new ParamImpl<Object>('M', 0X00000800, "ACQMF_MSS");

   ParamImpl<Object> V_ACQMF_TRANS = new ParamImpl<Object>('V', 0X0000000, "ACQMF_TRANS");

   ParamImpl<Object> M_ACQMF_TRANS = new ParamImpl<Object>('M', 0X00001000, "ACQMF_TRANS");

   ParamImpl<Object> V_ACQMF_COLLIMATOR = new ParamImpl<Object>('V', 0X0000000, "ACQMF_COLLIMATOR");

   ParamImpl<Object> M_ACQMF_COLLIMATOR = new ParamImpl<Object>('M', 0X00002000, "ACQMF_COLLIMATOR");

   ParamImpl<Object> V_ACQMF_AUTOCOL = new ParamImpl<Object>('V', 0X0000000, "ACQMF_AUTOCOL");

   ParamImpl<Object> M_ACQMF_AUTOCOL = new ParamImpl<Object>('M', 0X00004000, "ACQMF_AUTOCOL");

   ParamImpl<Object> V_ACQMF_SEPSEG = new ParamImpl<Object>('V', 0X0000000, "ACQMF_SEPSEG");

   ParamImpl<Object> M_ACQMF_SEPSEG = new ParamImpl<Object>('M', 0X00008000, "ACQMF_SEPSEG");

   ParamImpl<Object> V_ACQMF_DOSEDONE = new ParamImpl<Object>('V', 0X00000010, "ACQMF_DOSEDONE");

   ParamImpl<Object> M_ACQMF_DOSEDONE = new ParamImpl<Object>('M', 0X00010000, "ACQMF_DOSEDONE");

   ParamImpl<Object> V_ACQMF_HELSCAN = new ParamImpl<Object>('V', 0X00000011, "ACQMF_HELSCAN");

   ParamImpl<Object> M_ACQMF_HELSCAN = new ParamImpl<Object>('M', 0X00020000, "ACQMF_HELSCAN");

   ParamImpl<Object> V_ACQMF_PHAPORT = new ParamImpl<Object>('V', 0X00000012, "ACQMF_PHAPORT");

   ParamImpl<Object> M_ACQMF_PHAPORT = new ParamImpl<Object>('M', 0X00040000, "ACQMF_PHAPORT");

   ParamImpl<Object> V_ACQMF_MCSPORT = new ParamImpl<Object>('V', 0X00000013, "ACQMF_MCSPORT");

   ParamImpl<Object> M_ACQMF_MCSPORT = new ParamImpl<Object>('M', 0X00080000, "ACQMF_MCSPORT");

   ParamImpl<Object> V_ACQMF_SCPOL = new ParamImpl<Object>('V', 0X00000014, "ACQMF_SCPOL");

   ParamImpl<Object> M_ACQMF_SCPOL = new ParamImpl<Object>('M', 0X00100000, "ACQMF_SCPOL");

   ParamImpl<Object> V_ACQMF_ISGAMMA = new ParamImpl<Object>('V', 0X00000015, "ACQMF_ISGAMMA");

   ParamImpl<Object> M_ACQMF_ISGAMMA = new ParamImpl<Object>('M', 0X00200000, "ACQMF_ISGAMMA");

   ParamImpl<Object> V_ACQMF_ISNEUT = new ParamImpl<Object>('V', 0X00000016, "ACQMF_ISNEUT");

   ParamImpl<Object> M_ACQMF_ISNEUT = new ParamImpl<Object>('M', 0X00400000, "ACQMF_ISNEUT");

   ParamImpl<Object> V_ACQMF_ISDDAMCS = new ParamImpl<Object>('V', 0X00000017, "ACQMF_ISDDAMCS");

   ParamImpl<Object> M_ACQMF_ISDDAMCS = new ParamImpl<Object>('M', 0X00800000, "ACQMF_ISDDAMCS");

   ParamImpl<Object> V_ACQMF_ISQUANTG = new ParamImpl<Object>('V', 0X00000018, "ACQMF_ISQUANTG");

   ParamImpl<Object> M_ACQMF_ISQUANTG = new ParamImpl<Object>('M', 0X01000000, "ACQMF_ISQUANTG");

   ParamImpl<Object> V_ACQMF_ISMEASISO = new ParamImpl<Object>('V', 0X00000019, "ACQMF_ISMEASISO");

   ParamImpl<Object> M_ACQMF_ISMEASISO = new ParamImpl<Object>('M', 0X02000000, "ACQMF_ISMEASISO");

   ParamImpl<Object> V_ACQMF_ISMEASHEISO = new ParamImpl<Object>('V', 0X0000001, "ACQMF_ISMEASHEISO");

   ParamImpl<Object> M_ACQMF_ISMEASHEISO = new ParamImpl<Object>('M', 0X04000000, "ACQMF_ISMEASHEISO");

   ParamImpl<Object> V_ACQMF_GAINSTBL = new ParamImpl<Object>('V', 0X0000001, "ACQMF_GAINSTBL");

   ParamImpl<Object> M_ACQMF_GAINSTBL = new ParamImpl<Object>('M', 0X08000000, "ACQMF_GAINSTBL");

   ParamImpl<Object> V_ACQMF_REVSCAN = new ParamImpl<Object>('V', 0X0000001, "ACQMF_REVSCAN");

   ParamImpl<Object> M_ACQMF_REVSCAN = new ParamImpl<Object>('M', 0X10000000, "ACQMF_REVSCAN");

   ParamImpl<Object> V_ACQMF_ISSHUFFMCS = new ParamImpl<Object>('V', 0X0000001, "ACQMF_ISSHUFFMCS");

   ParamImpl<Object> M_ACQMF_ISSHUFFMVS = new ParamImpl<Object>('M', 0X20000000, "ACQMF_ISSHUFFMVS");

   ParamImpl<Object> V_ASTF_ACQUIRE = new ParamImpl<Object>('V', 0X00000000, "ASTF_ACQUIRE");

   ParamImpl<Object> M_ASTF_ACQUIRE = new ParamImpl<Object>('M', 0X00000001, "ASTF_ACQUIRE");

   ParamImpl<Object> V_ASTF_CCFEMOD = new ParamImpl<Object>('V', 0X00000001, "ASTF_CCFEMOD");

   ParamImpl<Object> M_ASTF_CCFEMOD = new ParamImpl<Object>('M', 0X00000002, "ASTF_CCFEMOD");

   ParamImpl<Object> V_ASTF_BADCAL = new ParamImpl<Object>('V', 0X00000002, "ASTF_BADCAL");

   ParamImpl<Object> M_ASTF_BADCAL = new ParamImpl<Object>('M', 0X00000004, "ASTF_BADCAL");

   ParamImpl<Object> V_ASTF_CCERR = new ParamImpl<Object>('V', 0X00000003, "ASTF_CCERR");

   ParamImpl<Object> M_ASTF_CCERR = new ParamImpl<Object>('M', 0X00000008, "ASTF_CCERR");

   ParamImpl<Object> V_ASTF_RAMBACK = new ParamImpl<Object>('V', 0X00000004, "ASTF_RAMBACK");

   ParamImpl<Object> M_ASTF_RAMBACK = new ParamImpl<Object>('M', 0X00000010, "ASTF_RAMBACK");

   ParamImpl<Object> V_PMOD_LIVE = new ParamImpl<Object>('V', 0X00000000, "PMOD_LIVE");

   ParamImpl<Object> M_PMOD_LIVE = new ParamImpl<Object>('M', 0X00000001, "PMOD_LIVE");

   ParamImpl<Object> V_PMOD_REAL = new ParamImpl<Object>('V', 0X00000001, "PMOD_REAL");

   ParamImpl<Object> M_PMOD_REAL = new ParamImpl<Object>('M', 0X00000002, "PMOD_REAL");

   ParamImpl<Object> V_PMOD_TOTAL = new ParamImpl<Object>('V', 0X00000002, "PMOD_TOTAL");

   ParamImpl<Object> M_PMOD_TOTAL = new ParamImpl<Object>('M', 0X00000004, "PMOD_TOTAL");

   ParamImpl<Object> V_PMOD_LEVEL = new ParamImpl<Object>('V', 0X00000003, "PMOD_LEVEL");

   ParamImpl<Object> M_PMOD_LEVEL = new ParamImpl<Object>('M', 0X00000008, "PMOD_LEVEL");

   ParamImpl<Object> V_PMOD_SWEEP = new ParamImpl<Object>('V', 0X00000004, "PMOD_SWEEP");

   ParamImpl<Object> M_PMOD_SWEEP = new ParamImpl<Object>('M', 0X00000010, "PMOD_SWEEP");

   ParamImpl<Object> V_PMOD_AREA = new ParamImpl<Object>('V', 0X00000005, "PMOD_AREA");

   ParamImpl<Object> M_PMOD_AREA = new ParamImpl<Object>('M', 0X00000020, "PMOD_AREA");

   ParamImpl<Object> V_PMOD_PERR = new ParamImpl<Object>('V', 0X00000006, "PMOD_PERR");

   ParamImpl<Object> M_PMOD_PERR = new ParamImpl<Object>('M', 0X00000040, "PMOD_PERR");

   ParamImpl<Object> V_ECF_ENCAL = new ParamImpl<Object>('V', 0X00000000, "ECF_ENCAL");

   ParamImpl<Object> M_ECF_ENCAL = new ParamImpl<Object>('M', 0X00000001, "ECF_ENCAL");

   ParamImpl<Object> V_ECF_FWCAL = new ParamImpl<Object>('V', 0X00000001, "ECF_FWCAL");

   ParamImpl<Object> M_ECF_FWCAL = new ParamImpl<Object>('M', 0X00000002, "ECF_FWCAL");

   ParamImpl<Object> V_ECF_T1CAL = new ParamImpl<Object>('V', 0X00000002, "ECF_T1CAL");

   ParamImpl<Object> M_ECF_T1CAL = new ParamImpl<Object>('M', 0X00000004, "ECF_T1CAL");

   ParamImpl<Object> V_ECF_T2CAL = new ParamImpl<Object>('V', 0X00000003, "ECF_T2CAL");

   ParamImpl<Object> M_ECF_T2CAL = new ParamImpl<Object>('M', 0X00000008, "ECF_T2CAL");

   ParamImpl<Object> V_ECF_PULSER = new ParamImpl<Object>('V', 0X00000004, "ECF_PULSER");

   ParamImpl<Object> M_ECF_PULSER = new ParamImpl<Object>('M', 0X00000010, "ECF_PULSER");

   ParamImpl<Object> V_AMPF_DIFF = new ParamImpl<Object>('V', 0X00000000, "AMPF_DIFF");

   ParamImpl<Object> M_AMPF_DIFF = new ParamImpl<Object>('M', 0X00000001, "AMPF_DIFF");

   ParamImpl<Object> V_AMPF_NEGPOL = new ParamImpl<Object>('V', 0X00000001, "AMPF_NEGPOL");

   ParamImpl<Object> M_AMPF_NEGPOL = new ParamImpl<Object>('M', 0X00000002, "AMPF_NEGPOL");

   ParamImpl<Object> V_AMPF_COMPINH = new ParamImpl<Object>('V', 0X00000002, "AMPF_COMPINH");

   ParamImpl<Object> M_AMPF_COMPINH = new ParamImpl<Object>('M', 0X00000004, "AMPF_COMPINH");

   ParamImpl<Object> V_AMPF_PUREJ = new ParamImpl<Object>('V', 0X00000003, "AMPF_PUREJ");

   ParamImpl<Object> M_AMPF_PUREJ = new ParamImpl<Object>('M', 0X00000008, "AMPF_PUREJ");

   ParamImpl<Object> V_AMPF_ONLINE = new ParamImpl<Object>('V', 0X00000004, "AMPF_ONLINE");

   ParamImpl<Object> M_AMPF_ONLINE = new ParamImpl<Object>('M', 0X00000010, "AMPF_ONLINE");

   ParamImpl<Object> V_AMPF_MOTRBUSY = new ParamImpl<Object>('V', 0X00000005, "AMPF_MOTRBUSY");

   ParamImpl<Object> M_AMPF_MOTRBUSY = new ParamImpl<Object>('M', 0X00000020, "AMPF_MOTRBUSY");

   ParamImpl<Object> V_AMPF_PZBUSY = new ParamImpl<Object>('V', 0X00000006, "AMPF_PZBUSY");

   ParamImpl<Object> M_AMPF_PZBUSY = new ParamImpl<Object>('M', 0X00000040, "AMPF_PZBUSY");

   ParamImpl<Object> V_AMPF_ATTEN = new ParamImpl<Object>('V', 0X00000007, "AMPF_ATTEN");

   ParamImpl<Object> M_AMPF_ATTEN = new ParamImpl<Object>('M', 0X00000080, "AMPF_ATTEN");

   ParamImpl<Object> V_AMPF_PZSTART = new ParamImpl<Object>('V', 0X00000008, "AMPF_PZSTART");

   ParamImpl<Object> M_AMPF_PZSTART = new ParamImpl<Object>('M', 0X00000100, "AMPF_PZSTART");

   ParamImpl<Object> V_AMPF_PZFAIL = new ParamImpl<Object>('V', 0X00000009, "AMPF_PZFAIL");

   ParamImpl<Object> M_AMPF_PZFAIL = new ParamImpl<Object>('M', 0X00000200, "AMPF_PZFAIL");

   ParamImpl<Object> V_AMPF_MOTRFAIL = new ParamImpl<Object>('V', 0X0000000, "AMPF_MOTRFAIL");

   ParamImpl<Object> M_AMPF_MOTRFAIL = new ParamImpl<Object>('M', 0X00000400, "AMPF_MOTRFAIL");

   ParamImpl<Object> V_AMPF_INPATT = new ParamImpl<Object>('V', 0X0000000, "AMPF_INPATT");

   ParamImpl<Object> M_AMPF_INPATT = new ParamImpl<Object>('M', 0X00000800, "AMPF_INPATT");

   ParamImpl<Object> V_AMPF_PULSER = new ParamImpl<Object>('V', 0X0000000, "AMPF_PULSER");

   ParamImpl<Object> M_AMPF_PULSER = new ParamImpl<Object>('M', 0X00001000, "AMPF_PULSER");

   ParamImpl<Object> V_AMPF_INHTRP = new ParamImpl<Object>('V', 0X0000000, "AMPF_INHTRP");

   ParamImpl<Object> M_AMPF_INHTRP = new ParamImpl<Object>('M', 0X00002000, "AMPF_INHTRP");

   ParamImpl<Object> V_AMPF_BDCSTART = new ParamImpl<Object>('V', 0X0000000, "AMPF_BDCSTART");

   ParamImpl<Object> M_AMPF_BDCSTART = new ParamImpl<Object>('M', 0X00004000, "AMPF_BDCSTART");

   ParamImpl<Object> V_AMPF_BDCBUSY = new ParamImpl<Object>('V', 0X0000000, "AMPF_BDCBUSY");

   ParamImpl<Object> M_AMPF_BDCBUSY = new ParamImpl<Object>('M', 0X00008000, "AMPF_BDCBUSY");

   ParamImpl<Object> V_AMPF_BDCFAIL = new ParamImpl<Object>('V', 0X00000010, "AMPF_BDCFAIL");

   ParamImpl<Object> M_AMPF_BDCFAIL = new ParamImpl<Object>('M', 0X00010000, "AMPF_BDCFAIL");

   ParamImpl<Object> V_AMPF_LLDAUTO = new ParamImpl<Object>('V', 0X00000011, "AMPF_LLDAUTO");

   ParamImpl<Object> M_AMPF_LLDAUTO = new ParamImpl<Object>('M', 0X00020000, "AMPF_LLDAUTO");

   ParamImpl<Object> V_AMPF_ATTMODE = new ParamImpl<Object>('V', 0X00000012, "AMPF_ATTMODE");

   ParamImpl<Object> M_AMPF_ATTMODE = new ParamImpl<Object>('M', 0X00040000, "AMPF_ATTMODE");

   ParamImpl<Object> V_ADCF_ANTIC = new ParamImpl<Object>('V', 0X00000000, "ADCF_ANTIC");

   ParamImpl<Object> M_ADCF_ANTIC = new ParamImpl<Object>('M', 0X00000001, "ADCF_ANTIC");

   ParamImpl<Object> V_ADCF_LATEC = new ParamImpl<Object>('V', 0X00000001, "ADCF_LATEC");

   ParamImpl<Object> M_ADCF_LATEC = new ParamImpl<Object>('M', 0X00000002, "ADCF_LATEC");

   ParamImpl<Object> V_ADCF_DELPK = new ParamImpl<Object>('V', 0X00000002, "ADCF_DELPK");

   ParamImpl<Object> M_ADCF_DELPK = new ParamImpl<Object>('M', 0X00000004, "ADCF_DELPK");

   ParamImpl<Object> V_ADCF_CIMCAIF = new ParamImpl<Object>('V', 0X00000003, "ADCF_CIMCAIF");

   ParamImpl<Object> M_ADCF_CIMCAIF = new ParamImpl<Object>('M', 0X00000008, "ADCF_CIMCAIF");

   ParamImpl<Object> V_ADCF_NONOV = new ParamImpl<Object>('V', 0X00000004, "ADCF_NONOV");

   ParamImpl<Object> M_ADCF_NONOV = new ParamImpl<Object>('M', 0X00000010, "ADCF_NONOV");

   ParamImpl<Object> V_ADCF_LTCPUR = new ParamImpl<Object>('V', 0X00000005, "ADCF_LTCPUR");

   ParamImpl<Object> M_ADCF_LTCPUR = new ParamImpl<Object>('M', 0X00000020, "ADCF_LTCPUR");

   ParamImpl<Object> V_ADCF_ONLINE = new ParamImpl<Object>('V', 0X00000006, "ADCF_ONLINE");

   ParamImpl<Object> M_ADCF_ONLINE = new ParamImpl<Object>('M', 0X00000040, "ADCF_ONLINE");

   ParamImpl<Object> V_ADCF_ATTEN = new ParamImpl<Object>('V', 0X00000007, "ADCF_ATTEN");

   ParamImpl<Object> M_ADCF_ATTEN = new ParamImpl<Object>('M', 0X00000080, "ADCF_ATTEN");

   ParamImpl<Object> V_ADCF_AMPINTERNAL = new ParamImpl<Object>('V', 0X00000008, "ADCF_AMPINTERNAL");

   ParamImpl<Object> M_ADCF_AMPINTERNAL = new ParamImpl<Object>('M', 0X00000100, "ADCF_AMPINTERNAL");

   ParamImpl<Object> V_MCSF_EXTCLOCK = new ParamImpl<Object>('V', 0X00000000, "MCSF_EXTCLOCK");

   ParamImpl<Object> M_MCSF_EXTCLOCK = new ParamImpl<Object>('M', 0X00000001, "MCSF_EXTCLOCK");

   ParamImpl<Object> V_MCSF_DATA1ST = new ParamImpl<Object>('V', 0X00000001, "MCSF_DATA1ST");

   ParamImpl<Object> M_MCSF_DATA1ST = new ParamImpl<Object>('M', 0X00000002, "MCSF_DATA1ST");

   ParamImpl<Object> V_MCSF_EXTADV = new ParamImpl<Object>('V', 0X00000002, "MCSF_EXTADV");

   ParamImpl<Object> M_MCSF_EXTADV = new ParamImpl<Object>('M', 0X00000004, "MCSF_EXTADV");

   ParamImpl<Object> V_MCSF_SWMODE = new ParamImpl<Object>('V', 0X00000003, "MCSF_SWMODE");

   ParamImpl<Object> M_MCSF_SWMODE = new ParamImpl<Object>('M', 0X00000008, "MCSF_SWMODE");

   ParamImpl<Object> V_MCSF_EXTSTART = new ParamImpl<Object>('V', 0X00000004, "MCSF_EXTSTART");

   ParamImpl<Object> M_MCSF_EXTSTART = new ParamImpl<Object>('M', 0X00000010, "MCSF_EXTSTART");

   ParamImpl<Object> V_MCSF_EXTSTOP = new ParamImpl<Object>('V', 0X00000005, "MCSF_EXTSTOP");

   ParamImpl<Object> M_MCSF_EXTSTOP = new ParamImpl<Object>('M', 0X00000020, "MCSF_EXTSTOP");

   ParamImpl<Object> V_MCSF_SWDONE = new ParamImpl<Object>('V', 0X00000006, "MCSF_SWDONE");

   ParamImpl<Object> M_MCSF_SWDONE = new ParamImpl<Object>('M', 0X00000040, "MCSF_SWDONE");

   ParamImpl<Object> V_MUXF_DEPMUX = new ParamImpl<Object>('V', 0X00000000, "MUXF_DEPMUX");

   ParamImpl<Object> M_MUXF_DEPMUX = new ParamImpl<Object>('M', 0X00000001, "MUXF_DEPMUX");

   ParamImpl<Object> V_HVPSF_OVLE = new ParamImpl<Object>('V', 0X00000000, "HVPSF_OVLE");

   ParamImpl<Object> M_HVPSF_OVLE = new ParamImpl<Object>('M', 0X00000001, "HVPSF_OVLE");

   ParamImpl<Object> V_HVPSF_INHLE = new ParamImpl<Object>('V', 0X00000001, "HVPSF_INHLE");

   ParamImpl<Object> M_HVPSF_INHLE = new ParamImpl<Object>('M', 0X00000002, "HVPSF_INHLE");

   ParamImpl<Object> V_HVPSF_LVINH = new ParamImpl<Object>('V', 0X00000002, "HVPSF_LVINH");

   ParamImpl<Object> M_HVPSF_LVINH = new ParamImpl<Object>('M', 0X00000004, "HVPSF_LVINH");

   ParamImpl<Object> V_HVPSF_POL = new ParamImpl<Object>('V', 0X00000003, "HVPSF_POL");

   ParamImpl<Object> M_HVPSF_POL = new ParamImpl<Object>('M', 0X00000008, "HVPSF_POL");

   ParamImpl<Object> V_HVPSF_INH = new ParamImpl<Object>('V', 0X00000004, "HVPSF_INH");

   ParamImpl<Object> M_HVPSF_INH = new ParamImpl<Object>('M', 0X00000010, "HVPSF_INH");

   ParamImpl<Object> V_HVPSF_OV = new ParamImpl<Object>('V', 0X00000005, "HVPSF_OV");

   ParamImpl<Object> M_HVPSF_OV = new ParamImpl<Object>('M', 0X00000020, "HVPSF_OV");

   ParamImpl<Object> V_HVPSF_STAT = new ParamImpl<Object>('V', 0X00000006, "HVPSF_STAT");

   ParamImpl<Object> M_HVPSF_STAT = new ParamImpl<Object>('M', 0X00000040, "HVPSF_STAT");

   ParamImpl<Object> V_HVPSF_ONLINE = new ParamImpl<Object>('V', 0X00000007, "HVPSF_ONLINE");

   ParamImpl<Object> M_HVPSF_ONLINE = new ParamImpl<Object>('M', 0X00000080, "HVPSF_ONLINE");

   ParamImpl<Object> V_HVPSF_OVINRES = new ParamImpl<Object>('V', 0X00000008, "HVPSF_OVINRES");

   ParamImpl<Object> M_HVPSF_OVINRES = new ParamImpl<Object>('M', 0X00000100, "HVPSF_OVINRES");

   ParamImpl<Object> V_HVPSF_ATTEN = new ParamImpl<Object>('V', 0X00000009, "HVPSF_ATTEN");

   ParamImpl<Object> M_HVPSF_ATTEN = new ParamImpl<Object>('M', 0X00000200, "HVPSF_ATTEN");

   ParamImpl<Object> V_HVPSF_FASTRAMP = new ParamImpl<Object>('V', 0X0000000, "HVPSF_FASTRAMP");

   ParamImpl<Object> M_HVPSF_FASTRAMP = new ParamImpl<Object>('M', 0X00000400, "HVPSF_FASTRAMP");

   ParamImpl<Object> V_HVPSF_BUSY = new ParamImpl<Object>('V', 0X0000000, "HVPSF_BUSY");

   ParamImpl<Object> M_HVPSF_BUSY = new ParamImpl<Object>('M', 0X00000800, "HVPSF_BUSY");

   ParamImpl<Object> V_HVPSF_FAULT = new ParamImpl<Object>('V', 0X0000000, "HVPSF_FAULT");

   ParamImpl<Object> M_HVPSF_FAULT = new ParamImpl<Object>('M', 0X00001000, "HVPSF_FAULT");

   ParamImpl<Object> V_HVPSF_ALARMS = new ParamImpl<Object>('V', 0X0000000, "HVPSF_ALARMS");

   ParamImpl<Object> M_HVPSF_ALARMS = new ParamImpl<Object>('M', 0X00002000, "HVPSF_ALARMS");

   ParamImpl<Object> V_HVPSF_SHUTDN = new ParamImpl<Object>('V', 0X0000000, "HVPSF_SHUTDN");

   ParamImpl<Object> M_HVPSF_SHUTDN = new ParamImpl<Object>('M', 0X00004000, "HVPSF_SHUTDN");

   ParamImpl<Object> V_HVPSVF_ID = new ParamImpl<Object>('V', 0X00000000, "HVPSVF_ID");

   ParamImpl<Object> M_HVPSVF_ID = new ParamImpl<Object>('M', 0X00000001, "HVPSVF_ID");

   ParamImpl<Object> V_HVPSVF_VOLT = new ParamImpl<Object>('V', 0X00000001, "HVPSVF_VOLT");

   ParamImpl<Object> M_HVPSVF_VOLT = new ParamImpl<Object>('M', 0X00000002, "HVPSVF_VOLT");

   ParamImpl<Object> V_HVPSVF_OVLE = new ParamImpl<Object>('V', 0X00000002, "HVPSVF_OVLE");

   ParamImpl<Object> M_HVPSVF_OVLE = new ParamImpl<Object>('M', 0X00000004, "HVPSVF_OVLE");

   ParamImpl<Object> V_HVPSVF_INHLE = new ParamImpl<Object>('V', 0X00000003, "HVPSVF_INHLE");

   ParamImpl<Object> M_HVPSVF_INHLE = new ParamImpl<Object>('M', 0X00000008, "HVPSVF_INHLE");

   ParamImpl<Object> V_HVPSVF_LVINH = new ParamImpl<Object>('V', 0X00000004, "HVPSVF_LVINH");

   ParamImpl<Object> M_HVPSVF_LVINH = new ParamImpl<Object>('M', 0X00000010, "HVPSVF_LVINH");

   ParamImpl<Object> V_HVPSVF_POL = new ParamImpl<Object>('V', 0X00000005, "HVPSVF_POL");

   ParamImpl<Object> M_HVPSVF_POL = new ParamImpl<Object>('M', 0X00000020, "HVPSVF_POL");

   ParamImpl<Object> V_HVPSVF_STAT = new ParamImpl<Object>('V', 0X00000006, "HVPSVF_STAT");

   ParamImpl<Object> M_HVPSVF_STAT = new ParamImpl<Object>('M', 0X00000040, "HVPSVF_STAT");

   ParamImpl<Object> V_HVPSVF_RANGE = new ParamImpl<Object>('V', 0X00000007, "HVPSVF_RANGE");

   ParamImpl<Object> M_HVPSVF_RANGE = new ParamImpl<Object>('M', 0X00000080, "HVPSVF_RANGE");

   ParamImpl<Object> V_AMPVF_ID = new ParamImpl<Object>('V', 0X00000000, "AMPVF_ID");

   ParamImpl<Object> M_AMPVF_ID = new ParamImpl<Object>('M', 0X00000001, "AMPVF_ID");

   ParamImpl<Object> V_AMPVF_PRAMPT = new ParamImpl<Object>('V', 0X00000001, "AMPVF_PRAMPT");

   ParamImpl<Object> M_AMPVF_PRAMPT = new ParamImpl<Object>('M', 0X00000002, "AMPVF_PRAMPT");

   ParamImpl<Object> V_AMPVF_HWGAIN1 = new ParamImpl<Object>('V', 0X00000002, "AMPVF_HWGAIN1");

   ParamImpl<Object> M_AMPVF_HWGAIN1 = new ParamImpl<Object>('M', 0X00000004, "AMPVF_HWGAIN1");

   ParamImpl<Object> V_AMPVF_HWGAIN2 = new ParamImpl<Object>('V', 0X00000003, "AMPVF_HWGAIN2");

   ParamImpl<Object> M_AMPVF_HWGAIN2 = new ParamImpl<Object>('M', 0X00000008, "AMPVF_HWGAIN2");

   ParamImpl<Object> V_AMPVF_HWGAIN3 = new ParamImpl<Object>('V', 0X00000004, "AMPVF_HWGAIN3");

   ParamImpl<Object> M_AMPVF_HWGAIN3 = new ParamImpl<Object>('M', 0X00000010, "AMPVF_HWGAIN3");

   ParamImpl<Object> V_AMPVF_SHAPEM = new ParamImpl<Object>('V', 0X00000005, "AMPVF_SHAPEM");

   ParamImpl<Object> M_AMPVF_SHAPEM = new ParamImpl<Object>('M', 0X00000020, "AMPVF_SHAPEM");

   ParamImpl<Object> V_AMPVF_PZ = new ParamImpl<Object>('V', 0X00000006, "AMPVF_PZ");

   ParamImpl<Object> M_AMPVF_PZ = new ParamImpl<Object>('M', 0X00000040, "AMPVF_PZ");

   ParamImpl<Object> V_AMPVF_BLRTYPE = new ParamImpl<Object>('V', 0X00000007, "AMPVF_BLRTYPE");

   ParamImpl<Object> M_AMPVF_BLRTYPE = new ParamImpl<Object>('M', 0X00000080, "AMPVF_BLRTYPE");

   ParamImpl<Object> V_AMPVF_DTCTYPE = new ParamImpl<Object>('V', 0X00000008, "AMPVF_DTCTYPE");

   ParamImpl<Object> M_AMPVF_DTCTYPE = new ParamImpl<Object>('M', 0X00000100, "AMPVF_DTCTYPE");

   ParamImpl<Object> V_AMPVF_TC = new ParamImpl<Object>('V', 0X00000009, "AMPVF_TC");

   ParamImpl<Object> M_AMPVF_TC = new ParamImpl<Object>('M', 0X00000200, "AMPVF_TC");

   ParamImpl<Object> V_AMPVF_NEGPOL = new ParamImpl<Object>('V', 0X0000000, "AMPVF_NEGPOL");

   ParamImpl<Object> M_AMPVF_NEGPOL = new ParamImpl<Object>('M', 0X00000400, "AMPVF_NEGPOL");

   ParamImpl<Object> V_AMPVF_COMPINH = new ParamImpl<Object>('V', 0X0000000, "AMPVF_COMPINH");

   ParamImpl<Object> M_AMPVF_COMPINH = new ParamImpl<Object>('M', 0X00000800, "AMPVF_COMPINH");

   ParamImpl<Object> V_AMPVF_PUREJ = new ParamImpl<Object>('V', 0X0000000, "AMPVF_PUREJ");

   ParamImpl<Object> M_AMPVF_PUREJ = new ParamImpl<Object>('M', 0X00001000, "AMPVF_PUREJ");

   ParamImpl<Object> V_AMPVF_DIFF = new ParamImpl<Object>('V', 0X0000000, "AMPVF_DIFF");

   ParamImpl<Object> M_AMPVF_DIFF = new ParamImpl<Object>('M', 0X00002000, "AMPVF_DIFF");

   ParamImpl<Object> V_AMPVF_FDMODE = new ParamImpl<Object>('V', 0X0000000, "AMPVF_FDMODE");

   ParamImpl<Object> M_AMPVF_FDMODE = new ParamImpl<Object>('M', 0X00004000, "AMPVF_FDMODE");

   ParamImpl<Object> V_AMPVF_FD = new ParamImpl<Object>('V', 0X0000000, "AMPVF_FD");

   ParamImpl<Object> M_AMPVF_FD = new ParamImpl<Object>('M', 0X00008000, "AMPVF_FD");

   ParamImpl<Object> V_AMPVF_PURG = new ParamImpl<Object>('V', 0X00000010, "AMPVF_PURG");

   ParamImpl<Object> M_AMPVF_PURG = new ParamImpl<Object>('M', 0X00010000, "AMPVF_PURG");

   ParamImpl<Object> V_AMPVF_INHTRPMD = new ParamImpl<Object>('V', 0X00000011, "AMPVF_INHTRPMD");

   ParamImpl<Object> M_AMPVF_INHTRPMD = new ParamImpl<Object>('M', 0X00020000, "AMPVF_INHTRPMD");

   ParamImpl<Object> V_AMPVF_LTTRIM = new ParamImpl<Object>('V', 0X00000012, "AMPVF_LTTRIM");

   ParamImpl<Object> M_AMPVF_LTTRIM = new ParamImpl<Object>('M', 0X00040000, "AMPVF_LTTRIM");

   ParamImpl<Object> V_AMPVF_FILTERRT = new ParamImpl<Object>('V', 0X00000013, "AMPVF_FILTERRT");

   ParamImpl<Object> M_AMPVF_FILTERRT = new ParamImpl<Object>('M', 0X00080000, "AMPVF_FILTERRT");

   ParamImpl<Object> V_AMPVF_FILTERFT = new ParamImpl<Object>('V', 0X00000014, "AMPVF_FILTERFT");

   ParamImpl<Object> M_AMPVF_FILTERFT = new ParamImpl<Object>('M', 0X00100000, "AMPVF_FILTERFT");

   ParamImpl<Object> V_AMPVF_GAINID = new ParamImpl<Object>('V', 0X00000015, "AMPVF_GAINID");

   ParamImpl<Object> M_AMPVF_GAINID = new ParamImpl<Object>('M', 0X00200000, "AMPVF_GAINID");

   ParamImpl<Object> V_ADCVF_ID = new ParamImpl<Object>('V', 0X00000000, "ADCVF_ID");

   ParamImpl<Object> M_ADCVF_ID = new ParamImpl<Object>('M', 0X00000001, "ADCVF_ID");

   ParamImpl<Object> V_ADCVF_RANGE = new ParamImpl<Object>('V', 0X00000001, "ADCVF_RANGE");

   ParamImpl<Object> M_ADCVF_RANGE = new ParamImpl<Object>('M', 0X00000002, "ADCVF_RANGE");

   ParamImpl<Object> V_ADCVF_OFFSET = new ParamImpl<Object>('V', 0X00000002, "ADCVF_OFFSET");

   ParamImpl<Object> M_ADCVF_OFFSET = new ParamImpl<Object>('M', 0X00000004, "ADCVF_OFFSET");

   ParamImpl<Object> V_ADCVF_ACQMODE = new ParamImpl<Object>('V', 0X00000003, "ADCVF_ACQMODE");

   ParamImpl<Object> M_ADCVF_ACQMODE = new ParamImpl<Object>('M', 0X00000008, "ADCVF_ACQMODE");

   ParamImpl<Object> V_ADCVF_CNVGAIN = new ParamImpl<Object>('V', 0X00000004, "ADCVF_CNVGAIN");

   ParamImpl<Object> M_ADCVF_CNVGAIN = new ParamImpl<Object>('M', 0X00000010, "ADCVF_CNVGAIN");

   ParamImpl<Object> V_ADCVF_LLD = new ParamImpl<Object>('V', 0X00000005, "ADCVF_LLD");

   ParamImpl<Object> M_ADCVF_LLD = new ParamImpl<Object>('M', 0X00000020, "ADCVF_LLD");

   ParamImpl<Object> V_ADCVF_ULD = new ParamImpl<Object>('V', 0X00000006, "ADCVF_ULD");

   ParamImpl<Object> M_ADCVF_ULD = new ParamImpl<Object>('M', 0X00000040, "ADCVF_ULD");

   ParamImpl<Object> V_ADCVF_ZERO = new ParamImpl<Object>('V', 0X00000007, "ADCVF_ZERO");

   ParamImpl<Object> M_ADCVF_ZERO = new ParamImpl<Object>('M', 0X00000080, "ADCVF_ZERO");

   ParamImpl<Object> V_ADCVF_ANTIC = new ParamImpl<Object>('V', 0X00000008, "ADCVF_ANTIC");

   ParamImpl<Object> M_ADCVF_ANTIC = new ParamImpl<Object>('M', 0X00000100, "ADCVF_ANTIC");

   ParamImpl<Object> V_ADCVF_LATEC = new ParamImpl<Object>('V', 0X00000009, "ADCVF_LATEC");

   ParamImpl<Object> M_ADCVF_LATEC = new ParamImpl<Object>('M', 0X00000200, "ADCVF_LATEC");

   ParamImpl<Object> V_ADCVF_DELPK = new ParamImpl<Object>('V', 0X0000000, "ADCVF_DELPK");

   ParamImpl<Object> M_ADCVF_DELPK = new ParamImpl<Object>('M', 0X00000400, "ADCVF_DELPK");

   ParamImpl<Object> V_ADCVF_NONOV = new ParamImpl<Object>('V', 0X0000000, "ADCVF_NONOV");

   ParamImpl<Object> M_ADCVF_NONOV = new ParamImpl<Object>('M', 0X00000800, "ADCVF_NONOV");

   ParamImpl<Object> V_ADCVF_LTCPUR = new ParamImpl<Object>('V', 0X0000000, "ADCVF_LTCPUR");

   ParamImpl<Object> M_ADCVF_LTCPUR = new ParamImpl<Object>('M', 0X00001000, "ADCVF_LTCPUR");

   ParamImpl<Object> V_DSSF_W1RNG = new ParamImpl<Object>('V', 0X00000000, "DSSF_W1RNG");

   ParamImpl<Object> M_DSSF_W1RNG = new ParamImpl<Object>('M', 0X00000001, "DSSF_W1RNG");

   ParamImpl<Object> V_DSSF_W2RNG = new ParamImpl<Object>('V', 0X00000001, "DSSF_W2RNG");

   ParamImpl<Object> M_DSSF_W2RNG = new ParamImpl<Object>('M', 0X00000002, "DSSF_W2RNG");

   ParamImpl<Object> V_DSSF_OVERRNG = new ParamImpl<Object>('V', 0X00000002, "DSSF_OVERRNG");

   ParamImpl<Object> M_DSSF_OVERRNG = new ParamImpl<Object>('M', 0X00000004, "DSSF_OVERRNG");

   ParamImpl<Object> V_DSSF_OVERRNG1 = new ParamImpl<Object>('V', 0X00000003, "DSSF_OVERRNG1");

   ParamImpl<Object> M_DSSF_OVERRNG1 = new ParamImpl<Object>('M', 0X00000008, "DSSF_OVERRNG1");

   ParamImpl<Object> V_DSSVF_WIN1C = new ParamImpl<Object>('V', 0X00000000, "DSSVF_WIN1C");

   ParamImpl<Object> M_DSSVF_WIN1C = new ParamImpl<Object>('M', 0X00000001, "DSSVF_WIN1C");

   ParamImpl<Object> V_DSSVF_WIN1R = new ParamImpl<Object>('V', 0X00000001, "DSSVF_WIN1R");

   ParamImpl<Object> M_DSSVF_WIN1R = new ParamImpl<Object>('M', 0X00000002, "DSSVF_WIN1R");

   ParamImpl<Object> V_DSSVF_WIN1S = new ParamImpl<Object>('V', 0X00000002, "DSSVF_WIN1S");

   ParamImpl<Object> M_DSSVF_WIN1S = new ParamImpl<Object>('M', 0X00000004, "DSSVF_WIN1S");

   ParamImpl<Object> V_DSSVF_EVMULT1 = new ParamImpl<Object>('V', 0X00000003, "DSSVF_EVMULT1");

   ParamImpl<Object> M_DSSVF_EVMULT1 = new ParamImpl<Object>('M', 0X00000008, "DSSVF_EVMULT1");

   ParamImpl<Object> V_DSSVF_FRNGWIN1 = new ParamImpl<Object>('V', 0X00000004, "DSSVF_FRNGWIN1");

   ParamImpl<Object> M_DSSVF_FRNGWIN1 = new ParamImpl<Object>('M', 0X00000010, "DSSVF_FRNGWIN1");

   ParamImpl<Object> V_DSSVF_WIN1MODE = new ParamImpl<Object>('V', 0X00000005, "DSSVF_WIN1MODE");

   ParamImpl<Object> M_DSSVF_WIN1MODE = new ParamImpl<Object>('M', 0X00000020, "DSSVF_WIN1MODE");

   ParamImpl<Object> V_DSSVF_WIN2C = new ParamImpl<Object>('V', 0X00000006, "DSSVF_WIN2C");

   ParamImpl<Object> M_DSSVF_WIN2C = new ParamImpl<Object>('M', 0X00000040, "DSSVF_WIN2C");

   ParamImpl<Object> V_DSSVF_WIN2R = new ParamImpl<Object>('V', 0X00000007, "DSSVF_WIN2R");

   ParamImpl<Object> M_DSSVF_WIN2R = new ParamImpl<Object>('M', 0X00000080, "DSSVF_WIN2R");

   ParamImpl<Object> V_DSSVF_WIN2S = new ParamImpl<Object>('V', 0X00000008, "DSSVF_WIN2S");

   ParamImpl<Object> M_DSSVF_WIN2S = new ParamImpl<Object>('M', 0X00000100, "DSSVF_WIN2S");

   ParamImpl<Object> V_DSSVF_EVMULT2 = new ParamImpl<Object>('V', 0X00000009, "DSSVF_EVMULT2");

   ParamImpl<Object> M_DSSVF_EVMULT2 = new ParamImpl<Object>('M', 0X00000200, "DSSVF_EVMULT2");

   ParamImpl<Object> V_DSSVF_FRNGWIN2 = new ParamImpl<Object>('V', 0X0000000, "DSSVF_FRNGWIN2");

   ParamImpl<Object> M_DSSVF_FRNGWIN2 = new ParamImpl<Object>('M', 0X00000400, "DSSVF_FRNGWIN2");

   ParamImpl<Object> V_DSSVF_WIN2MODE = new ParamImpl<Object>('V', 0X0000000, "DSSVF_WIN2MODE");

   ParamImpl<Object> M_DSSVF_WIN2MODE = new ParamImpl<Object>('M', 0X00000800, "DSSVF_WIN2MODE");

   ParamImpl<Object> V_DSSVF_ZERORAT = new ParamImpl<Object>('V', 0X0000000, "DSSVF_ZERORAT");

   ParamImpl<Object> M_DSSVF_ZERORAT = new ParamImpl<Object>('M', 0X00001000, "DSSVF_ZERORAT");

   ParamImpl<Object> V_DSSVF_GAINRAT = new ParamImpl<Object>('V', 0X0000000, "DSSVF_GAINRAT");

   ParamImpl<Object> M_DSSVF_GAINRAT = new ParamImpl<Object>('M', 0X00002000, "DSSVF_GAINRAT");

   ParamImpl<Object> V_PWRM_BATS = new ParamImpl<Object>('V', 0X00000000, "PWRM_BATS");

   ParamImpl<Object> M_PWRM_BATS = new ParamImpl<Object>('M', 0X00000001, "PWRM_BATS");

   ParamImpl<Object> V_PWRM_COMM = new ParamImpl<Object>('V', 0X00000001, "PWRM_COMM");

   ParamImpl<Object> M_PWRM_COMM = new ParamImpl<Object>('M', 0X00000002, "PWRM_COMM");

   ParamImpl<Object> V_PWRM_BATSEL = new ParamImpl<Object>('V', 0X00000002, "PWRM_BATSEL");

   ParamImpl<Object> M_PWRM_BATSEL = new ParamImpl<Object>('M', 0X00000004, "PWRM_BATSEL");

   ParamImpl<Object> V_PWRM_RESET = new ParamImpl<Object>('V', 0X00000003, "PWRM_RESET");

   ParamImpl<Object> M_PWRM_RESET = new ParamImpl<Object>('M', 0X00000008, "PWRM_RESET");

   ParamImpl<Object> V_PWRM_FAULT = new ParamImpl<Object>('V', 0X00000004, "PWRM_FAULT");

   ParamImpl<Object> M_PWRM_FAULT = new ParamImpl<Object>('M', 0X00000010, "PWRM_FAULT");

   ParamImpl<Object> V_VACF_REGULATED = new ParamImpl<Object>('V', 0X00000000, "VACF_REGULATED");

   ParamImpl<Object> M_VACF_REGULATED = new ParamImpl<Object>('M', 0X00000001, "VACF_REGULATED");

   ParamImpl<Object> V_VACF_FAULT = new ParamImpl<Object>('V', 0X00000001, "VACF_FAULT");

   ParamImpl<Object> M_VACF_FAULT = new ParamImpl<Object>('M', 0X00000002, "VACF_FAULT");

   ParamImpl<Object> V_MCAF_CRARMED = new ParamImpl<Object>('V', 0X00000000, "MCAF_CRARMED");

   ParamImpl<Object> M_MCAF_CRARMED = new ParamImpl<Object>('M', 0X00000001, "MCAF_CRARMED");

   ParamImpl<Object> V_MCAF_EXTSTART = new ParamImpl<Object>('V', 0X00000001, "MCAF_EXTSTART");

   ParamImpl<Object> M_MCAF_EXTSTART = new ParamImpl<Object>('M', 0X00000002, "MCAF_EXTSTART");

   ParamImpl<Object> V_MCAF_EXTSTOP = new ParamImpl<Object>('V', 0X00000002, "MCAF_EXTSTOP");

   ParamImpl<Object> M_MCAF_EXTSTOP = new ParamImpl<Object>('M', 0X00000004, "MCAF_EXTSTOP");

   ParamImpl<Object> V_PULSERF_POL = new ParamImpl<Object>('V', 0X00000000, "PULSERF_POL");

   ParamImpl<Object> M_PULSERF_POL = new ParamImpl<Object>('M', 0X00000001, "PULSERF_POL");

   ParamImpl<Object> V_PLSRVF_MODE = new ParamImpl<Object>('V', 0X00000000, "PLSRVF_MODE");

   ParamImpl<Object> M_PLSRVF_MODE = new ParamImpl<Object>('M', 0X00000001, "PLSRVF_MODE");

   ParamImpl<Object> V_PLSRVF_BSIZ = new ParamImpl<Object>('V', 0X00000001, "PLSRVF_BSIZ");

   ParamImpl<Object> M_PLSRVF_BSIZ = new ParamImpl<Object>('M', 0X00000002, "PLSRVF_BSIZ");

   ParamImpl<Object> V_PLSRVF_LOFF = new ParamImpl<Object>('V', 0X00000002, "PLSRVF_LOFF");

   ParamImpl<Object> M_PLSRVF_LOFF = new ParamImpl<Object>('M', 0X00000004, "PLSRVF_LOFF");

   ParamImpl<Object> V_PLSRVF_HOFF = new ParamImpl<Object>('V', 0X00000003, "PLSRVF_HOFF");

   ParamImpl<Object> M_PLSRVF_HOFF = new ParamImpl<Object>('M', 0X00000008, "PLSRVF_HOFF");

   ParamImpl<Object> V_PLSRVF_LTIM = new ParamImpl<Object>('V', 0X00000004, "PLSRVF_LTIM");

   ParamImpl<Object> M_PLSRVF_LTIM = new ParamImpl<Object>('M', 0X00000010, "PLSRVF_LTIM");

   ParamImpl<Object> V_PLSRVF_HTIM = new ParamImpl<Object>('V', 0X00000005, "PLSRVF_HTIM");

   ParamImpl<Object> M_PLSRVF_HTIM = new ParamImpl<Object>('M', 0X00000020, "PLSRVF_HTIM");

   ParamImpl<Object> V_PLSRVF_RATE = new ParamImpl<Object>('V', 0X00000006, "PLSRVF_RATE");

   ParamImpl<Object> M_PLSRVF_RATE = new ParamImpl<Object>('M', 0X00000040, "PLSRVF_RATE");

   ParamImpl<Object> V_PLSRVF_POL = new ParamImpl<Object>('V', 0X00000007, "PLSRVF_POL");

   ParamImpl<Object> M_PLSRVF_POL = new ParamImpl<Object>('M', 0X00000080, "PLSRVF_POL");

   ParamImpl<Object> V_ACQMVF_SCPOL = new ParamImpl<Object>('V', 0X00000000, "ACQMVF_SCPOL");

   ParamImpl<Object> M_ACQMVF_SCPOL = new ParamImpl<Object>('M', 0X00000001, "ACQMVF_SCPOL");

   ParamImpl<Object> V_MCAVF_EXTSTR = new ParamImpl<Object>('V', 0X00000000, "MCAVF_EXTSTR");

   ParamImpl<Object> M_MCAVF_EXTSTR = new ParamImpl<Object>('M', 0X00000001, "MCAVF_EXTSTR");

   ParamImpl<Object> V_MCAVF_EXTSTP = new ParamImpl<Object>('V', 0X00000001, "MCAVF_EXTSTP");

   ParamImpl<Object> M_MCAVF_EXTSTP = new ParamImpl<Object>('M', 0X00000002, "MCAVF_EXTSTP");

   ParamImpl<Object> V_MCSVF_DSCMOD = new ParamImpl<Object>('V', 0X00000000, "MCSVF_DSCMOD");

   ParamImpl<Object> M_MCSVF_DSCMOD = new ParamImpl<Object>('M', 0X00000001, "MCSVF_DSCMOD");

   ParamImpl<Object> V_MCSVF_ROISTR = new ParamImpl<Object>('V', 0X00000001, "MCSVF_ROISTR");

   ParamImpl<Object> M_MCSVF_ROISTR = new ParamImpl<Object>('M', 0X00000002, "MCSVF_ROISTR");

   ParamImpl<Object> V_MCSVF_ROIEND = new ParamImpl<Object>('V', 0X00000002, "MCSVF_ROIEND");

   ParamImpl<Object> M_MCSVF_ROIEND = new ParamImpl<Object>('M', 0X00000004, "MCSVF_ROIEND");

   ParamImpl<Object> V_MCSVF_EXTSTR = new ParamImpl<Object>('V', 0X00000003, "MCSVF_EXTSTR");

   ParamImpl<Object> M_MCSVF_EXTSTR = new ParamImpl<Object>('M', 0X00000008, "MCSVF_EXTSTR");

   ParamImpl<Object> V_MCSVF_EXTSTP = new ParamImpl<Object>('V', 0X00000004, "MCSVF_EXTSTP");

   ParamImpl<Object> M_MCSVF_EXTSTP = new ParamImpl<Object>('M', 0X00000010, "MCSVF_EXTSTP");

   ParamImpl<Object> V_MCSVF_DWLRNG = new ParamImpl<Object>('V', 0X00000005, "MCSVF_DWLRNG");

   ParamImpl<Object> M_MCSVF_DWLRNG = new ParamImpl<Object>('M', 0X00000020, "MCSVF_DWLRNG");

   ParamImpl<Object> V_MCSVF_DWLVAL = new ParamImpl<Object>('V', 0X00000006, "MCSVF_DWLVAL");

   ParamImpl<Object> M_MCSVF_DWLVAL = new ParamImpl<Object>('M', 0X00000040, "MCSVF_DWLVAL");

   ParamImpl<String> T_STITLE = new ParamImpl<String>('T', 0X20010002, "STITLE");

   ParamImpl<String> T_SIDENT = new ParamImpl<String>('T', 0X20010003, "SIDENT");

   ParamImpl<String> T_STYPE = new ParamImpl<String>('T', 0X20010004, "STYPE");

   ParamImpl<Float> F_SQUANT = new ParamImpl<Float>('F', 0X20010005, "SQUANT");

   ParamImpl<String> T_SUNITS = new ParamImpl<String>('T', 0X20010006, "SUNITS");

   ParamImpl<String> T_SGEOMTRY = new ParamImpl<String>('T', 0X20010007, "SGEOMTRY");

   ParamImpl<Date> X_STIME = new ParamImpl<Date>('X', 0X20010008, "STIME");

   ParamImpl<Float> F_SSP1 = new ParamImpl<Float>('F', 0X20010009, "SSP1");

   ParamImpl<Float> F_SSP2 = new ParamImpl<Float>('F', 0X2001000, "SSP2");

   ParamImpl<Date> X_SSPTIME = new ParamImpl<Date>('X', 0X2001000, "SSPTIME");

   ParamImpl<Date> X_SSPDTIME = new ParamImpl<Date>('X', 0X2001000, "SSPDTIME");

   ParamImpl<String> T_SEMPNAME = new ParamImpl<String>('T', 0X2001000, "SEMPNAME");

   ParamImpl<String> T_SEMPID = new ParamImpl<String>('T', 0X2001000, "SEMPID");

   ParamImpl<String> T_STLDNUM = new ParamImpl<String>('T', 0X2001000, "STLDNUM");

   ParamImpl<String> T_SWBCID = new ParamImpl<String>('T', 0X20010010, "SWBCID");

   ParamImpl<String> T_SSTHGT = new ParamImpl<String>('T', 0X20010011, "SSTHGT");

   ParamImpl<String> T_SFTBPOS = new ParamImpl<String>('T', 0X20010012, "SFTBPOS");

   ParamImpl<String> T_STHYPOS = new ParamImpl<String>('T', 0X20010013, "STHYPOS");

   ParamImpl<Date> X_SUPTKDAT = new ParamImpl<Date>('X', 0X20010014, "SUPTKDAT");

   ParamImpl<String> T_SOPINIT = new ParamImpl<String>('T', 0X20010015, "SOPINIT");

   ParamImpl<Date> X_SDEPOSIT = new ParamImpl<Date>('X', 0X20010016, "SDEPOSIT");

   ParamImpl<String> T_SPLTNAME = new ParamImpl<String>('T', 0X20010017, "SPLTNAME");

   ParamImpl<String> T_SLOCTN = new ParamImpl<String>('T', 0X20010018, "SLOCTN");

   ParamImpl<String> T_SSPRSTR1 = new ParamImpl<String>('T', 0X20010019, "SSPRSTR1");

   ParamImpl<String> T_SSPRSTR2 = new ParamImpl<String>('T', 0X2001001, "SSPRSTR2");

   ParamImpl<String> T_SSPRSTR3 = new ParamImpl<String>('T', 0X2001001, "SSPRSTR3");

   ParamImpl<String> T_SSPRSTR4 = new ParamImpl<String>('T', 0X2001001, "SSPRSTR4");

   ParamImpl<String> T_SSPRSTR5 = new ParamImpl<String>('T', 0X2001001, "SSPRSTR5");

   ParamImpl<Float> F_SPARTSIZE = new ParamImpl<Float>('F', 0X2001001, "SPARTSIZE");

   ParamImpl<Float> F_SSYSERR = new ParamImpl<Float>('F', 0X2001001, "SSYSERR");

   ParamImpl<Float> F_SHEIGHT = new ParamImpl<Float>('F', 0X20010020, "SHEIGHT");

   ParamImpl<Float> F_SWEIGHT = new ParamImpl<Float>('F', 0X20010021, "SWEIGHT");

   ParamImpl<Float> F_SCWT = new ParamImpl<Float>('F', 0X20010022, "SCWT");

   ParamImpl<Float> F_SSP3 = new ParamImpl<Float>('F', 0X20010023, "SSP3");

   ParamImpl<Float> F_SSP4 = new ParamImpl<Float>('F', 0X20010024, "SSP4");

   ParamImpl<Float> F_SSP5 = new ParamImpl<Float>('F', 0X20010025, "SSP5");

   ParamImpl<Float> F_SSP6 = new ParamImpl<Float>('F', 0X20010026, "SSP6");

   ParamImpl<Float> F_SSP7 = new ParamImpl<Float>('F', 0X20010027, "SSP7");

   ParamImpl<Float> F_SSP8 = new ParamImpl<Float>('F', 0X20010028, "SSP8");

   ParamImpl<Float> F_SSP9 = new ParamImpl<Float>('F', 0X20010029, "SSP9");

   ParamImpl<Float> F_SSP10 = new ParamImpl<Float>('F', 0X2001002, "SSP10");

   ParamImpl<Float> F_SSP11 = new ParamImpl<Float>('F', 0X2001002, "SSP11");

   ParamImpl<Float> F_SSP12 = new ParamImpl<Float>('F', 0X2001002, "SSP12");

   ParamImpl<Float> F_SSP13 = new ParamImpl<Float>('F', 0X2001002, "SSP13");

   ParamImpl<Float> F_SSP14 = new ParamImpl<Float>('F', 0X2001002, "SSP14");

   ParamImpl<Float> F_SSP15 = new ParamImpl<Float>('F', 0X2001002, "SSP15");

   ParamImpl<Float> F_SSP16 = new ParamImpl<Float>('F', 0X20010030, "SSP16");

   ParamImpl<Float> F_SSP17 = new ParamImpl<Float>('F', 0X20010031, "SSP17");

   ParamImpl<Float> F_SSP18 = new ParamImpl<Float>('F', 0X20010032, "SSP18");

   ParamImpl<Float> F_SSP19 = new ParamImpl<Float>('F', 0X20010033, "SSP19");

   ParamImpl<Float> F_SSP20 = new ParamImpl<Float>('F', 0X20010034, "SSP20");

   ParamImpl<Float> F_SSP21 = new ParamImpl<Float>('F', 0X20010035, "SSP21");

   ParamImpl<Float> F_SSP22 = new ParamImpl<Float>('F', 0X20010036, "SSP22");

   ParamImpl<Float> F_SSP23 = new ParamImpl<Float>('F', 0X20010037, "SSP23");

   ParamImpl<Float> F_SSP24 = new ParamImpl<Float>('F', 0X20010038, "SSP24");

   ParamImpl<Float> F_SSP25 = new ParamImpl<Float>('F', 0X20010039, "SSP25");

   ParamImpl<Float> F_SSP26 = new ParamImpl<Float>('F', 0X2001003, "SSP26");

   ParamImpl<Float> F_SSP27 = new ParamImpl<Float>('F', 0X2001003, "SSP27");

   ParamImpl<Float> F_SSP28 = new ParamImpl<Float>('F', 0X2001003, "SSP28");

   ParamImpl<Float> F_SSP29 = new ParamImpl<Float>('F', 0X2001003, "SSP29");

   ParamImpl<Float> F_SSP30 = new ParamImpl<Float>('F', 0X2001003, "SSP30");

   ParamImpl<Float> F_SSP31 = new ParamImpl<Float>('F', 0X2001003, "SSP31");

   ParamImpl<Float> F_SSP32 = new ParamImpl<Float>('F', 0X20010040, "SSP32");

   ParamImpl<Float> F_SONFLOW = new ParamImpl<Float>('F', 0X20010041, "SONFLOW");

   ParamImpl<Float> F_SOFFFLOW = new ParamImpl<Float>('F', 0X20010042, "SOFFFLOW");

   ParamImpl<Float> F_SMWT = new ParamImpl<Float>('F', 0X20010043, "SMWT");

   ParamImpl<Float> F_SPRES = new ParamImpl<Float>('F', 0X20010044, "SPRES");

   ParamImpl<Float> F_STEMP = new ParamImpl<Float>('F', 0X20010045, "STEMP");

   ParamImpl<Float> F_SPOWER = new ParamImpl<Float>('F', 0X20010046, "SPOWER");

   ParamImpl<Long> L_SSPI1 = new ParamImpl<Long>('L', 0X20010047, "SSPI1");

   ParamImpl<Long> L_SSPI2 = new ParamImpl<Long>('L', 0X20010048, "SSPI2");

   ParamImpl<Long> L_SSPI3 = new ParamImpl<Long>('L', 0X20010049, "SSPI3");

   ParamImpl<String> T_SCOLLINIT = new ParamImpl<String>('T', 0X2001004, "SCOLLINIT");

   ParamImpl<String> T_SSPRSTR6 = new ParamImpl<String>('T', 0X2001004, "SSPRSTR6");

   ParamImpl<String> T_SSPRSTR7 = new ParamImpl<String>('T', 0X2001004, "SSPRSTR7");

   ParamImpl<String> T_SSPBSTR1 = new ParamImpl<String>('T', 0X2001004, "SSPBSTR1");

   ParamImpl<Long> L_SFLAGS = new ParamImpl<Long>('L', 0X2001004, "SFLAGS");

   ParamImpl<Long> L_SFSP1 = new ParamImpl<Long>('L', 0X2001004, "SFSP1");

   ParamImpl<String> T_SCOLLNAME = new ParamImpl<String>('T', 0X20010050, "SCOLLNAME");

   ParamImpl<String> T_SANALNAME = new ParamImpl<String>('T', 0X20010051, "SANALNAME");

   ParamImpl<Long> L_SAMPNUM = new ParamImpl<Long>('L', 0X20010052, "SAMPNUM");

   ParamImpl<String> T_SSPRSTR8 = new ParamImpl<String>('T', 0X20010053, "SSPRSTR8");

   ParamImpl<String> T_SSPRSTR9 = new ParamImpl<String>('T', 0X20010054, "SSPRSTR9");

   ParamImpl<String> T_SSPRSTR10 = new ParamImpl<String>('T', 0X20010055, "SSPRSTR10");

   ParamImpl<String> T_SSPRSTR11 = new ParamImpl<String>('T', 0X20010056, "SSPRSTR11");

   ParamImpl<String> T_SAMPLEPT = new ParamImpl<String>('T', 0X20010057, "SAMPLEPT");

   ParamImpl<Float> F_SU235ENRICH = new ParamImpl<Float>('F', 0X20010058, "SU235ENRICH");

   ParamImpl<String> T_SDESC1 = new ParamImpl<String>('T', 0X20010059, "SDESC1");

   ParamImpl<String> T_SDESC2 = new ParamImpl<String>('T', 0X2001005, "SDESC2");

   ParamImpl<String> T_SDESC3 = new ParamImpl<String>('T', 0X2001005, "SDESC3");

   ParamImpl<String> T_SDESC4 = new ParamImpl<String>('T', 0X2001005, "SDESC4");

   ParamImpl<String> T_SSHELF = new ParamImpl<String>('T', 0X2001005, "SSHELF");

   ParamImpl<Long> L_SREACTORUNIT = new ParamImpl<Long>('L', 0X2001005, "SREACTORUNIT");

   ParamImpl<String> T_SAMPLERID = new ParamImpl<String>('T', 0X2001005, "SAMPLERID");

   ParamImpl<Float> F_SCOLEFF = new ParamImpl<Float>('F', 0X20010060, "SCOLEFF");

   ParamImpl<String> T_SREASON = new ParamImpl<String>('T', 0X20010061, "SREASON");

   ParamImpl<String> T_SRWP = new ParamImpl<String>('T', 0X20010062, "SRWP");

   ParamImpl<Float> F_SSTVACPRES = new ParamImpl<Float>('F', 0X20010063, "SSTVACPRES");

   ParamImpl<Float> F_SENDVACPRES = new ParamImpl<Float>('F', 0X20010064, "SENDVACPRES");

   ParamImpl<Date> X_SSPDTIME2 = new ParamImpl<Date>('X', 0X20010065, "SSPDTIME2");

   ParamImpl<Date> X_SSPDTIME3 = new ParamImpl<Date>('X', 0X20010066, "SSPDTIME3");

   ParamImpl<Date> X_SSPDTIME4 = new ParamImpl<Date>('X', 0X20010067, "SSPDTIME4");

   ParamImpl<Date> X_SSPDTIME5 = new ParamImpl<Date>('X', 0X20010068, "SSPDTIME5");

   ParamImpl<Date> X_SSPDTIME6 = new ParamImpl<Date>('X', 0X20010069, "SSPDTIME6");

   ParamImpl<Date> X_SSPDTIME7 = new ParamImpl<Date>('X', 0X2001006, "SSPDTIME7");

   ParamImpl<Date> X_SSPDTIME8 = new ParamImpl<Date>('X', 0X2001006, "SSPDTIME8");

   ParamImpl<String> T_SEMPLOYER = new ParamImpl<String>('T', 0X2001006, "SEMPLOYER");

   ParamImpl<String> T_SJOBCODE = new ParamImpl<String>('T', 0X2001006, "SJOBCODE");

   ParamImpl<Date> X_SBIRTHDATE = new ParamImpl<Date>('X', 0X2001006, "SBIRTHDATE");

   ParamImpl<String> T_SFREQUENCY = new ParamImpl<String>('T', 0X2001006, "SFREQUENCY");

   ParamImpl<Long> L_SFSHOWER = new ParamImpl<Long>('L', 0X20010070, "SFSHOWER");

   ParamImpl<Long> L_SFSPECIAL = new ParamImpl<Long>('L', 0X20010071, "SFSPECIAL");

   ParamImpl<Float> F_SWBCCR1 = new ParamImpl<Float>('F', 0X20010072, "SWBCCR1");

   ParamImpl<Float> F_SWBCCR2 = new ParamImpl<Float>('F', 0X20010073, "SWBCCR2");

   ParamImpl<Float> F_SWBCCR3 = new ParamImpl<Float>('F', 0X20010074, "SWBCCR3");

   ParamImpl<Float> F_SWBCCR4 = new ParamImpl<Float>('F', 0X20010075, "SWBCCR4");

   ParamImpl<Float> F_SWBCCR5 = new ParamImpl<Float>('F', 0X20010076, "SWBCCR5");

   ParamImpl<Float> F_SWBCCR6 = new ParamImpl<Float>('F', 0X20010077, "SWBCCR6");

   ParamImpl<Float> F_SWBCCR7 = new ParamImpl<Float>('F', 0X20010078, "SWBCCR7");

   ParamImpl<Float> F_SWBCCR8 = new ParamImpl<Float>('F', 0X20010079, "SWBCCR8");

   ParamImpl<String> T_SSEX = new ParamImpl<String>('T', 0X2001007, "SSEX");

   ParamImpl<Long> L_SSPI4 = new ParamImpl<Long>('L', 0X2001007, "SSPI4");

   ParamImpl<Long> L_SSPI5 = new ParamImpl<Long>('L', 0X2001007, "SSPI5");

   ParamImpl<Long> L_SSPI6 = new ParamImpl<Long>('L', 0X2001007, "SSPI6");

   ParamImpl<Long> L_SSPI7 = new ParamImpl<Long>('L', 0X2001007, "SSPI7");

   ParamImpl<Long> L_SSPI8 = new ParamImpl<Long>('L', 0X2001007, "SSPI8");

   ParamImpl<Long> L_SSPI9 = new ParamImpl<Long>('L', 0X20010080, "SSPI9");

   ParamImpl<Long> L_SSPI10 = new ParamImpl<Long>('L', 0X20010081, "SSPI10");

   ParamImpl<Long> L_SSPI11 = new ParamImpl<Long>('L', 0X20010082, "SSPI11");

   ParamImpl<Long> L_SSPI12 = new ParamImpl<Long>('L', 0X20010083, "SSPI12");

   ParamImpl<Long> L_SSPI13 = new ParamImpl<Long>('L', 0X20010084, "SSPI13");

   ParamImpl<Long> L_SSPI14 = new ParamImpl<Long>('L', 0X20010085, "SSPI14");

   ParamImpl<Long> L_SSPI15 = new ParamImpl<Long>('L', 0X20010086, "SSPI15");

   ParamImpl<Long> L_SSPI16 = new ParamImpl<Long>('L', 0X20010087, "SSPI16");

   ParamImpl<Long> L_SFSP2 = new ParamImpl<Long>('L', 0X20010088, "SFSP2");

   ParamImpl<Long> L_SFSP3 = new ParamImpl<Long>('L', 0X20010089, "SFSP3");

   ParamImpl<Long> L_SFSP4 = new ParamImpl<Long>('L', 0X2001008, "SFSP4");

   ParamImpl<Long> L_SFSP5 = new ParamImpl<Long>('L', 0X2001008, "SFSP5");

   ParamImpl<Long> L_SFSP6 = new ParamImpl<Long>('L', 0X2001008, "SFSP6");

   ParamImpl<Long> L_SFSP7 = new ParamImpl<Long>('L', 0X2001008, "SFSP7");

   ParamImpl<Date> X_SREPTIME = new ParamImpl<Date>('X', 0X2001008, "SREPTIME");

   ParamImpl<Long> L_SSTATION = new ParamImpl<Long>('L', 0X2001008, "SSTATION");

   ParamImpl<String> T_SASID = new ParamImpl<String>('T', 0X20010090, "SASID");

   ParamImpl<String> T_SRWPLIST = new ParamImpl<String>('T', 0X20010091, "SRWPLIST");

   ParamImpl<Date> X_SCOVSTART = new ParamImpl<Date>('X', 0X20010092, "SCOVSTART");

   ParamImpl<Date> X_SCOVEND = new ParamImpl<Date>('X', 0X20010093, "SCOVEND");

   ParamImpl<String> T_SSURVID = new ParamImpl<String>('T', 0X20010094, "SSURVID");

   ParamImpl<Date> X_SSURVDATE = new ParamImpl<Date>('X', 0X20010095, "SSURVDATE");

   ParamImpl<String> T_SSURVLOC = new ParamImpl<String>('T', 0X20010096, "SSURVLOC");

   ParamImpl<String> T_SSURVENT = new ParamImpl<String>('T', 0X20010097, "SSURVENT");

   ParamImpl<Float> F_SWCONTEW = new ParamImpl<Float>('F', 0X20010098, "SWCONTEW");

   ParamImpl<Float> F_SWCONTGW = new ParamImpl<Float>('F', 0X20010099, "SWCONTGW");

   ParamImpl<Float> F_SWCONTNW = new ParamImpl<Float>('F', 0X2001009, "SWCONTNW");

   ParamImpl<Float> F_SWCONTNWERR = new ParamImpl<Float>('F', 0X2001009, "SWCONTNWERR");

   ParamImpl<Float> F_SWCONTVOL = new ParamImpl<Float>('F', 0X2001009, "SWCONTVOL");

   ParamImpl<Float> F_SWCONTVOLERR = new ParamImpl<Float>('F', 0X2001009, "SWCONTVOLERR");

   ParamImpl<Float> F_SWCONTUDENS = new ParamImpl<Float>('F', 0X2001009, "SWCONTUDENS");

   ParamImpl<String> T_SWCONTSHAPE = new ParamImpl<String>('T', 0X2001009, "SWCONTSHAPE");

   ParamImpl<Float> F_SWCONTLEN = new ParamImpl<Float>('F', 0X200100, "SWCONTLEN");

   ParamImpl<Float> F_SWCONTGCF = new ParamImpl<Float>('F', 0X200100, "SWCONTGCF");

   ParamImpl<String> T_SWCONTMATRIX = new ParamImpl<String>('T', 0X200100, "SWCONTMATRIX");

   ParamImpl<Float> F_SWCONTFULL = new ParamImpl<Float>('F', 0X200100, "SWCONTFULL");

   ParamImpl<Float> F_SQUANTERR = new ParamImpl<Float>('F', 0X200100, "SQUANTERR");

   ParamImpl<Float> F_SSYSTERR = new ParamImpl<Float>('F', 0X200100, "SSYSTERR");

   ParamImpl<Float> F_STRACEAMT = new ParamImpl<Float>('F', 0X200100, "STRACEAMT");

   ParamImpl<Float> F_SCWTERROR = new ParamImpl<Float>('F', 0X200100, "SCWTERROR");

   ParamImpl<String> T_SCTRNAME = new ParamImpl<String>('T', 0X200100, "SCTRNAME");

   ParamImpl<String> T_SCTRDESC = new ParamImpl<String>('T', 0X200100, "SCTRDESC");

   ParamImpl<String> T_SARRNAME = new ParamImpl<String>('T', 0X200100, "SARRNAME");

   ParamImpl<String> T_SARRDESC = new ParamImpl<String>('T', 0X200100, "SARRDESC");

   ParamImpl<String> T_SGRPNAME = new ParamImpl<String>('T', 0X200100, "SGRPNAME");

   ParamImpl<String> T_SGRPDESC = new ParamImpl<String>('T', 0X200100, "SGRPDESC");

   ParamImpl<String> T_SINFOFDS = new ParamImpl<String>('T', 0X200100, "SINFOFDS");

   ParamImpl<String> T_SINFOTYPE = new ParamImpl<String>('T', 0X200100, "SINFOTYPE");

   ParamImpl<Long> L_SINFOSEQ = new ParamImpl<Long>('L', 0X200100, "SINFOSEQ");

   ParamImpl<String> T_SPROCTYPE = new ParamImpl<String>('T', 0X200100, "SPROCTYPE");

   ParamImpl<String> T_SAMPASF1 = new ParamImpl<String>('T', 0X200100, "SAMPASF1");

   ParamImpl<String> T_SAMPASF2 = new ParamImpl<String>('T', 0X200100, "SAMPASF2");

   ParamImpl<Long> L_SFREPPLT = new ParamImpl<Long>('L', 0X200100, "SFREPPLT");

   ParamImpl<String> T_SUNITTYPE = new ParamImpl<String>('T', 0X200100, "SUNITTYPE");

   ParamImpl<String> T_SLENUNITS = new ParamImpl<String>('T', 0X200100, "SLENUNITS");

   ParamImpl<Float> F_SLENCONV = new ParamImpl<Float>('F', 0X200100, "SLENCONV");

   ParamImpl<String> T_SWTUNITS = new ParamImpl<String>('T', 0X200100, "SWTUNITS");

   ParamImpl<Float> F_SWTCONV = new ParamImpl<Float>('F', 0X200100, "SWTCONV");

   ParamImpl<String> T_SVOLUNITS = new ParamImpl<String>('T', 0X200100, "SVOLUNITS");

   ParamImpl<Float> F_SVOLCONV = new ParamImpl<Float>('F', 0X200100, "SVOLCONV");

   ParamImpl<String> T_SBATCHID = new ParamImpl<String>('T', 0X200100, "SBATCHID");

   ParamImpl<String> T_SELEMENT = new ParamImpl<String>('T', 0X200100, "SELEMENT");

   ParamImpl<String> T_SMATRIX = new ParamImpl<String>('T', 0X200100, "SMATRIX");

   ParamImpl<String> T_SPROTOCOL = new ParamImpl<String>('T', 0X200100, "SPROTOCOL");

   ParamImpl<String> T_SSTATUS = new ParamImpl<String>('T', 0X200100, "SSTATUS");

   ParamImpl<String> T_SPROTOFILE = new ParamImpl<String>('T', 0X200100, "SPROTOFILE");

   ParamImpl<Long> L_SMATRIXNUM = new ParamImpl<Long>('L', 0X200100, "SMATRIXNUM");

   ParamImpl<Long> L_SELEMENTNUM = new ParamImpl<Long>('L', 0X200100, "SELEMENTNUM");

   ParamImpl<Long> L_SGEOMNUM = new ParamImpl<Long>('L', 0X200100, "SGEOMNUM");

   ParamImpl<Long> L_SFCHAMSPEC = new ParamImpl<Long>('L', 0X200100, "SFCHAMSPEC");

   ParamImpl<Long> L_SFINTERRUPT = new ParamImpl<Long>('L', 0X200100, "SFINTERRUPT");

   ParamImpl<Long> L_SFABORTED = new ParamImpl<Long>('L', 0X200100, "SFABORTED");

   ParamImpl<Long> L_SFCALCOUNT = new ParamImpl<Long>('L', 0X200100, "SFCALCOUNT");

   ParamImpl<Float> F_EXTCHEMYIELD = new ParamImpl<Float>('F', 0X200100, "EXTCHEMYIELD");

   ParamImpl<Float> F_EXTCHEMYERR = new ParamImpl<Float>('F', 0X200100, "EXTCHEMYERR");

   ParamImpl<Float> F_CONTROLVOL = new ParamImpl<Float>('F', 0X200100, "CONTROLVOL");

   ParamImpl<String> T_SNODENAME = new ParamImpl<String>('T', 0X200100, "SNODENAME");

   ParamImpl<Float> F_SHZWEIGHT = new ParamImpl<Float>('F', 0X200100, "SHZWEIGHT");

   ParamImpl<Float> F_SHZPBFRAC = new ParamImpl<Float>('F', 0X200100, "SHZPBFRAC");

   ParamImpl<Float> F_SHZFEFRAC = new ParamImpl<Float>('F', 0X200100, "SHZFEFRAC");

   ParamImpl<Float> F_SUNITSCF = new ParamImpl<Float>('F', 0X200100, "SUNITSCF");

   ParamImpl<Float> F_SWCONTHEIGHT = new ParamImpl<Float>('F', 0X200100, "SWCONTHEIGHT");

   ParamImpl<String> T_SCARRIDENT = new ParamImpl<String>('T', 0X200100, "SCARRIDENT");

   ParamImpl<Object> V_SF_SP1 = new ParamImpl<Object>('V', 0X00000000, "SF_SP1");

   ParamImpl<Object> M_SF_SP1 = new ParamImpl<Object>('M', 0X00000001, "SF_SP1");

   ParamImpl<Object> V_SF_SHOWER = new ParamImpl<Object>('V', 0X00000001, "SF_SHOWER");

   ParamImpl<Object> M_SF_SHOWER = new ParamImpl<Object>('M', 0X00000002, "SF_SHOWER");

   ParamImpl<Object> V_SF_SPECIAL = new ParamImpl<Object>('V', 0X00000002, "SF_SPECIAL");

   ParamImpl<Object> M_SF_SPECIAL = new ParamImpl<Object>('M', 0X00000004, "SF_SPECIAL");

   ParamImpl<Object> V_SF_SP2 = new ParamImpl<Object>('V', 0X00000003, "SF_SP2");

   ParamImpl<Object> M_SF_SP2 = new ParamImpl<Object>('M', 0X00000008, "SF_SP2");

   ParamImpl<Object> V_SF_SP3 = new ParamImpl<Object>('V', 0X00000004, "SF_SP3");

   ParamImpl<Object> M_SF_SP3 = new ParamImpl<Object>('M', 0X00000010, "SF_SP3");

   ParamImpl<Object> V_SF_SP4 = new ParamImpl<Object>('V', 0X00000005, "SF_SP4");

   ParamImpl<Object> M_SF_SP4 = new ParamImpl<Object>('M', 0X00000020, "SF_SP4");

   ParamImpl<Object> V_SF_FREPPLT = new ParamImpl<Object>('V', 0X00000006, "SF_FREPPLT");

   ParamImpl<Object> M_SF_FREPPLT = new ParamImpl<Object>('M', 0X00000040, "SF_FREPPLT");

   ParamImpl<Object> V_SF_METRIC = new ParamImpl<Object>('V', 0X00000006, "SF_METRIC");

   ParamImpl<Object> M_SF_METRIC = new ParamImpl<Object>('M', 0X00000040, "SF_METRIC");

   ParamImpl<Object> V_SF_CHAMSPEC = new ParamImpl<Object>('V', 0X0000000, "SF_CHAMSPEC");

   ParamImpl<Object> M_SF_CHAMSPEC = new ParamImpl<Object>('M', 0X00000800, "SF_CHAMSPEC");

   ParamImpl<Object> V_SF_INTERRUPT = new ParamImpl<Object>('V', 0X0000000, "SF_INTERRUPT");

   ParamImpl<Object> M_SF_INTERRUPT = new ParamImpl<Object>('M', 0X00001000, "SF_INTERRUPT");

   ParamImpl<Object> V_SF_ABORTED = new ParamImpl<Object>('V', 0X0000000, "SF_ABORTED");

   ParamImpl<Object> M_SF_ABORTED = new ParamImpl<Object>('M', 0X00002000, "SF_ABORTED");

   ParamImpl<Object> V_SF_CALCOUNT = new ParamImpl<Object>('V', 0X0000000, "SF_CALCOUNT");

   ParamImpl<Object> M_SF_CALCOUNT = new ParamImpl<Object>('M', 0X00004000, "SF_CALCOUNT");

   ParamImpl<Long> L_PSFLAGS = new ParamImpl<Long>('L', 0X20060002, "PSFLAGS");

   ParamImpl<Date> X_PPELIVE = new ParamImpl<Date>('X', 0X20060003, "PPELIVE");

   ParamImpl<String> T_PEAKVERS = new ParamImpl<String>('T', 0X20060004, "PEAKVERS");

   ParamImpl<Long> L_PSITER = new ParamImpl<Long>('L', 0X20060005, "PSITER");

   ParamImpl<Float> F_PSCENTRD = new ParamImpl<Float>('F', 0X20060006, "PSCENTRD");

   ParamImpl<Long> L_PSLEFT = new ParamImpl<Long>('L', 0X20060007, "PSLEFT");

   ParamImpl<Long> L_PSWIDTH = new ParamImpl<Long>('L', 0X20060008, "PSWIDTH");

   ParamImpl<Float> F_PSBACKGND = new ParamImpl<Float>('F', 0X20060009, "PSBACKGND");

   ParamImpl<Float> F_PSFWHM = new ParamImpl<Float>('F', 0X2006000, "PSFWHM");

   ParamImpl<Float> F_PSENERGY = new ParamImpl<Float>('F', 0X2006000, "PSENERGY");

   ParamImpl<Float> F_PSCTSS = new ParamImpl<Float>('F', 0X2006000, "PSCTSS");

   ParamImpl<Float> F_PSCERR = new ParamImpl<Float>('F', 0X2006000, "PSCERR");

   ParamImpl<Float> F_PSEFF = new ParamImpl<Float>('F', 0X2006000, "PSEFF");

   ParamImpl<Float> F_PSFIT = new ParamImpl<Float>('F', 0X2006000, "PSFIT");

   ParamImpl<Long> L_PSPFLG = new ParamImpl<Long>('L', 0X20060010, "PSPFLG");

   ParamImpl<Float> F_PSSP1 = new ParamImpl<Float>('F', 0X20060011, "PSSP1");

   ParamImpl<Float> F_PSSP2 = new ParamImpl<Float>('F', 0X20060012, "PSSP2");

   ParamImpl<Float> F_PSAREA = new ParamImpl<Float>('F', 0X20060013, "PSAREA");

   ParamImpl<Float> F_PSEFERR = new ParamImpl<Float>('F', 0X20060014, "PSEFERR");

   ParamImpl<String> T_PILEUPVERS = new ParamImpl<String>('T', 0X20060015, "PILEUPVERS");

   ParamImpl<String> T_SPLINVERS = new ParamImpl<String>('T', 0X20060016, "SPLINVERS");

   ParamImpl<String> T_ENBACKVERS = new ParamImpl<String>('T', 0X20060017, "ENBACKVERS");

   ParamImpl<Long> L_PSGROUP = new ParamImpl<Long>('L', 0X20060018, "PSGROUP");

   ParamImpl<String> T_NAAINTFVERS = new ParamImpl<String>('T', 0X20060019, "NAAINTFVERS");

   ParamImpl<Long> L_PSBKCHAN = new ParamImpl<Long>('L', 0X2006001, "PSBKCHAN");

   ParamImpl<Date> X_PSDATE = new ParamImpl<Date>('X', 0X2006001, "PSDATE");

   ParamImpl<Float> F_REFPKRATIO = new ParamImpl<Float>('F', 0X2006001, "REFPKRATIO");

   ParamImpl<Float> F_DREFPKRAT = new ParamImpl<Float>('F', 0X2006001, "DREFPKRAT");

   ParamImpl<Float> F_PSLOCCENT = new ParamImpl<Float>('F', 0X2006001, "PSLOCCENT");

   ParamImpl<Float> F_PSDLOCCENT = new ParamImpl<Float>('F', 0X2006001, "PSDLOCCENT");

   ParamImpl<Float> F_PSDCENTRD = new ParamImpl<Float>('F', 0X20060020, "PSDCENTRD");

   ParamImpl<Float> F_PSDFWHM = new ParamImpl<Float>('F', 0X20060021, "PSDFWHM");

   ParamImpl<Float> F_PSTAIL1 = new ParamImpl<Float>('F', 0X20060022, "PSTAIL1");

   ParamImpl<Float> F_PSDTAIL1 = new ParamImpl<Float>('F', 0X20060023, "PSDTAIL1");

   ParamImpl<Float> F_PSTAIL2 = new ParamImpl<Float>('F', 0X20060024, "PSTAIL2");

   ParamImpl<Float> F_PSDTAIL2 = new ParamImpl<Float>('F', 0X20060025, "PSDTAIL2");

   ParamImpl<Float> F_PSSIGNIF = new ParamImpl<Float>('F', 0X20060026, "PSSIGNIF");

   ParamImpl<Float> F_PSGROSS = new ParamImpl<Float>('F', 0X20060027, "PSGROSS");

   ParamImpl<Float> F_PSDBACK = new ParamImpl<Float>('F', 0X20060028, "PSDBACK");

   ParamImpl<Float> F_PSAMBBACK = new ParamImpl<Float>('F', 0X20060029, "PSAMBBACK");

   ParamImpl<Float> F_PSDAMBBACK = new ParamImpl<Float>('F', 0X2006002, "PSDAMBBACK");

   ParamImpl<String> T_PKANALVERS = new ParamImpl<String>('T', 0X2006002, "PKANALVERS");

   ParamImpl<Float> F_PSUDFWRATIO = new ParamImpl<Float>('F', 0X2006002, "PSUDFWRATIO");

   ParamImpl<Float> F_PSFWXM = new ParamImpl<Float>('F', 0X2006002, "PSFWXM");

   ParamImpl<Float> F_PSDFWXM = new ParamImpl<Float>('F', 0X2006002, "PSDFWXM");

   ParamImpl<Float> F_PSPTCRATIO = new ParamImpl<Float>('F', 0X2006002, "PSPTCRATIO");

   ParamImpl<Float> F_PSGAINSHFT = new ParamImpl<Float>('F', 0X20060030, "PSGAINSHFT");

   ParamImpl<Float> F_PSDAREA = new ParamImpl<Float>('F', 0X20060031, "PSDAREA");

   ParamImpl<Float> F_PSDENERGY = new ParamImpl<Float>('F', 0X20060032, "PSDENERGY");

   ParamImpl<Float> F_PSORIGAREA = new ParamImpl<Float>('F', 0X20060033, "PSORIGAREA");

   ParamImpl<Float> F_PSORIGERR = new ParamImpl<Float>('F', 0X20060034, "PSORIGERR");

   ParamImpl<Date> X_PSBKELIVE = new ParamImpl<Date>('X', 0X20060035, "PSBKELIVE");

   ParamImpl<Date> X_PADATE = new ParamImpl<Date>('X', 0X20060036, "PADATE");

   ParamImpl<Long> L_PSFPILEUP = new ParamImpl<Long>('L', 0X20060037, "PSFPILEUP");

   ParamImpl<Long> L_PSFSPLIN = new ParamImpl<Long>('L', 0X20060038, "PSFSPLIN");

   ParamImpl<Long> L_PSFENBACK = new ParamImpl<Long>('L', 0X20060039, "PSFENBACK");

   ParamImpl<Long> L_PSFSETEFF = new ParamImpl<Long>('L', 0X2006003, "PSFSETEFF");

   ParamImpl<Long> L_PSFNAAINTF = new ParamImpl<Long>('L', 0X2006003, "PSFNAAINTF");

   ParamImpl<Long> L_PSFPEAKANAL = new ParamImpl<Long>('L', 0X2006003, "PSFPEAKANAL");

   ParamImpl<Long> L_PSPKNOWN = new ParamImpl<Long>('L', 0X2006003, "PSPKNOWN");

   ParamImpl<Long> L_PSPPFIT = new ParamImpl<Long>('L', 0X2006003, "PSPPFIT");

   ParamImpl<Long> L_PSPENBACK = new ParamImpl<Long>('L', 0X2006003, "PSPENBACK");

   ParamImpl<Long> L_PSPMANADD = new ParamImpl<Long>('L', 0X20060040, "PSPMANADD");

   ParamImpl<Long> L_PSPMANDEL = new ParamImpl<Long>('L', 0X20060041, "PSPMANDEL");

   ParamImpl<Long> L_PSPREFPK = new ParamImpl<Long>('L', 0X20060042, "PSPREFPK");

   ParamImpl<Long> L_PSPABERR = new ParamImpl<Long>('L', 0X20060043, "PSPABERR");

   ParamImpl<Long> L_PSPMANEDIT = new ParamImpl<Long>('L', 0X20060044, "PSPMANEDIT");

   ParamImpl<Long> L_PSPFITROI = new ParamImpl<Long>('L', 0X20060045, "PSPFITROI");

   ParamImpl<Long> L_PSPFITCONV = new ParamImpl<Long>('L', 0X20060046, "PSPFITCONV");

   ParamImpl<Long> L_PSPPARANGEL = new ParamImpl<Long>('L', 0X20060047, "PSPPARANGEL");

   ParamImpl<Long> L_PSPPARANGER = new ParamImpl<Long>('L', 0X20060048, "PSPPARANGER");

   ParamImpl<Long> L_PSPPADONE = new ParamImpl<Long>('L', 0X20060049, "PSPPADONE");

   ParamImpl<Long> L_PSPEFFINT = new ParamImpl<Long>('L', 0X2006004, "PSPEFFINT");

   ParamImpl<Date> X_PSBKASTIME = new ParamImpl<Date>('X', 0X2006004, "PSBKASTIME");

   ParamImpl<Long> L_PSPMULT = new ParamImpl<Long>('L', 0X2006004, "PSPMULT");

   ParamImpl<Float> F_PSKVAL = new ParamImpl<Float>('F', 0X2006004, "PSKVAL");

   ParamImpl<String> T_PSFITENGNAME = new ParamImpl<String>('T', 0X2006004, "PSFITENGNAME");

   ParamImpl<String> T_PSBACKTYPE = new ParamImpl<String>('T', 0X2006004, "PSBACKTYPE");

   ParamImpl<Long> L_PSPVARYENG = new ParamImpl<Long>('L', 0X20060050, "PSPVARYENG");

   ParamImpl<Long> L_PSPVARYAREA = new ParamImpl<Long>('L', 0X20060051, "PSPVARYAREA");

   ParamImpl<Long> L_PSPVARYFWHM = new ParamImpl<Long>('L', 0X20060052, "PSPVARYFWHM");

   ParamImpl<Long> L_PSPVARYLTAIL = new ParamImpl<Long>('L', 0X20060053, "PSPVARYLTAIL");

   ParamImpl<Long> L_PSPVARYHTAIL = new ParamImpl<Long>('L', 0X20060054, "PSPVARYHTAIL");

   ParamImpl<Long> L_PSLBACKST = new ParamImpl<Long>('L', 0X20060055, "PSLBACKST");

   ParamImpl<Long> L_PSLBACKEN = new ParamImpl<Long>('L', 0X20060056, "PSLBACKEN");

   ParamImpl<Long> L_PSRBACKST = new ParamImpl<Long>('L', 0X20060057, "PSRBACKST");

   ParamImpl<Long> L_PSRBACKEN = new ParamImpl<Long>('L', 0X20060058, "PSRBACKEN");

   ParamImpl<Float> F_PSPEAKATTN = new ParamImpl<Float>('F', 0X20060059, "PSPEAKATTN");

   ParamImpl<Float> F_PSPEAKATTNER = new ParamImpl<Float>('F', 0X2006005, "PSPEAKATTNER");

   ParamImpl<Float> F_PSORIGEFF = new ParamImpl<Float>('F', 0X2006005, "PSORIGEFF");

   ParamImpl<Float> F_PSORIGEFFER = new ParamImpl<Float>('F', 0X2006005, "PSORIGEFFER");

   ParamImpl<Float> F_PSCHEMYIELD = new ParamImpl<Float>('F', 0X2006005, "PSCHEMYIELD");

   ParamImpl<Float> F_PSDCHEMYIELD = new ParamImpl<Float>('F', 0X2006005, "PSDCHEMYIELD");

   ParamImpl<String> T_REAGENTVERS = new ParamImpl<String>('T', 0X2006005, "REAGENTVERS");

   ParamImpl<Float> F_PSRBACK = new ParamImpl<Float>('F', 0X20060060, "PSRBACK");

   ParamImpl<Float> F_PSDRBACK = new ParamImpl<Float>('F', 0X20060061, "PSDRBACK");

   ParamImpl<Long> L_PSPREAGENT = new ParamImpl<Long>('L', 0X20060062, "PSPREAGENT");

   ParamImpl<Long> L_PSFREAGENT = new ParamImpl<Long>('L', 0X20060063, "PSFREAGENT");

   ParamImpl<Long> L_PSPTRACERPK = new ParamImpl<Long>('L', 0X20060064, "PSPTRACERPK");

   ParamImpl<Long> L_PSNUDSDONE = new ParamImpl<Long>('L', 0X20060065, "PSNUDSDONE");

   ParamImpl<Long> L_PSNUDSMCL = new ParamImpl<Long>('L', 0X20060066, "PSNUDSMCL");

   ParamImpl<Long> L_PSNUDSMNF = new ParamImpl<Long>('L', 0X20060067, "PSNUDSMNF");

   ParamImpl<Long> L_PSNUDSSCL = new ParamImpl<Long>('L', 0X20060068, "PSNUDSSCL");

   ParamImpl<Long> L_PSNUDSSNF = new ParamImpl<Long>('L', 0X20060069, "PSNUDSSNF");

   ParamImpl<String> T_PSNUDSVERS = new ParamImpl<String>('T', 0X2006006, "PSNUDSVERS");

   ParamImpl<Float> F_PSNUDSMRATL = new ParamImpl<Float>('F', 0X2006006, "PSNUDSMRATL");

   ParamImpl<Float> F_PSNUDSMCSQL = new ParamImpl<Float>('F', 0X2006006, "PSNUDSMCSQL");

   ParamImpl<Float> F_PSNUDSMRATV = new ParamImpl<Float>('F', 0X2006006, "PSNUDSMRATV");

   ParamImpl<Float> F_PSNUDSMCSQV = new ParamImpl<Float>('F', 0X2006006, "PSNUDSMCSQV");

   ParamImpl<Float> F_PSNUDSSRATL = new ParamImpl<Float>('F', 0X2006006, "PSNUDSSRATL");

   ParamImpl<Float> F_PSNUDSSCSQL = new ParamImpl<Float>('F', 0X20060070, "PSNUDSSCSQL");

   ParamImpl<Float> F_PSNUDSSRATV = new ParamImpl<Float>('F', 0X20060071, "PSNUDSSRATV");

   ParamImpl<Float> F_PSNUDSSCSQV = new ParamImpl<Float>('F', 0X20060072, "PSNUDSSCSQV");

   ParamImpl<Long> L_PSREFPEAK = new ParamImpl<Long>('L', 0X20060073, "PSREFPEAK");

   ParamImpl<Long> L_PSREFPEAKERR = new ParamImpl<Long>('L', 0X20060074, "PSREFPEAKERR");

   ParamImpl<Long> L_PSNUDSERROR = new ParamImpl<Long>('L', 0X20060075, "PSNUDSERROR");

   ParamImpl<Long> L_PSREFPKAERR = new ParamImpl<Long>('L', 0X20060076, "PSREFPKAERR");

   ParamImpl<Long> L_PSASTMSUMDON = new ParamImpl<Long>('L', 0X20060077, "PSASTMSUMDON");

   ParamImpl<Float> F_PSACCPS = new ParamImpl<Float>('F', 0X20060078, "PSACCPS");

   ParamImpl<Float> F_PSCPSERR = new ParamImpl<Float>('F', 0X20060079, "PSCPSERR");

   ParamImpl<Float> F_PSCRITLEVEL = new ParamImpl<Float>('F', 0X2006007, "PSCRITLEVEL");

   ParamImpl<Long> L_PSTNIDDONE = new ParamImpl<Long>('L', 0X2006007, "PSTNIDDONE");

   ParamImpl<Long> L_PSPADJPEAK = new ParamImpl<Long>('L', 0X2006007, "PSPADJPEAK");

   ParamImpl<Long> L_PSFVCHECK = new ParamImpl<Long>('L', 0X2006007, "PSFVCHECK");

   ParamImpl<Long> L_PSFVCHECKRVW = new ParamImpl<Long>('L', 0X2006007, "PSFVCHECKRVW");

   ParamImpl<Long> L_PSFVCHECKREF = new ParamImpl<Long>('L', 0X2006007, "PSFVCHECKREF");

   ParamImpl<Long> L_PSFVCHECKFID = new ParamImpl<Long>('L', 0X20060080, "PSFVCHECKFID");

   ParamImpl<Long> L_PSFVCHECKMDT = new ParamImpl<Long>('L', 0X20060081, "PSFVCHECKMDT");

   ParamImpl<Long> L_PSFVCHECKFIT = new ParamImpl<Long>('L', 0X20060082, "PSFVCHECKFIT");

   ParamImpl<Long> L_PSAGANLINE = new ParamImpl<Long>('L', 0X20060083, "PSAGANLINE");

   ParamImpl<Float> F_PSAGAGCF = new ParamImpl<Float>('F', 0X20060084, "PSAGAGCF");

   ParamImpl<Float> F_PSAGAGCFERR = new ParamImpl<Float>('F', 0X20060085, "PSAGAGCFERR");

   ParamImpl<Float> F_PSOGAINSHIFT = new ParamImpl<Float>('F', 0X20060086, "PSOGAINSHIFT");

   ParamImpl<Float> F_PSOSHAPEERR = new ParamImpl<Float>('F', 0X20060087, "PSOSHAPEERR");

   ParamImpl<Float> F_PSOFESHLDTHK = new ParamImpl<Float>('F', 0X20060088, "PSOFESHLDTHK");

   ParamImpl<Float> F_PSCORRNIDXSQ = new ParamImpl<Float>('F', 0X20060089, "PSCORRNIDXSQ");

   ParamImpl<Long> L_PSSTRIPBACK = new ParamImpl<Long>('L', 0X2006008, "PSSTRIPBACK");

   ParamImpl<Long> L_PSPPRESENT = new ParamImpl<Long>('L', 0X2006008, "PSPPRESENT");

   ParamImpl<Long> L_PSPUNKNOWN = new ParamImpl<Long>('L', 0X2006008, "PSPUNKNOWN");

   ParamImpl<Long> L_PSPUSEDINSUM = new ParamImpl<Long>('L', 0X2006008, "PSPUSEDINSUM");

   ParamImpl<Object> V_PSF_PILEUP = new ParamImpl<Object>('V', 0X00000000, "PSF_PILEUP");

   ParamImpl<Object> M_PSF_PILEUP = new ParamImpl<Object>('M', 0X00000001, "PSF_PILEUP");

   ParamImpl<Object> V_PSF_SPLIN = new ParamImpl<Object>('V', 0X00000001, "PSF_SPLIN");

   ParamImpl<Object> M_PSF_SPLIN = new ParamImpl<Object>('M', 0X00000002, "PSF_SPLIN");

   ParamImpl<Object> V_PSF_ENBACK = new ParamImpl<Object>('V', 0X00000002, "PSF_ENBACK");

   ParamImpl<Object> M_PSF_ENBACK = new ParamImpl<Object>('M', 0X00000004, "PSF_ENBACK");

   ParamImpl<Object> V_PSF_SETEFF = new ParamImpl<Object>('V', 0X00000003, "PSF_SETEFF");

   ParamImpl<Object> M_PSF_SETEFF = new ParamImpl<Object>('M', 0X00000008, "PSF_SETEFF");

   ParamImpl<Object> V_PSF_NAAINTF = new ParamImpl<Object>('V', 0X00000004, "PSF_NAAINTF");

   ParamImpl<Object> M_PSF_NAAINTF = new ParamImpl<Object>('M', 0X00000010, "PSF_NAAINTF");

   ParamImpl<Object> V_PSF_PEAKANAL = new ParamImpl<Object>('V', 0X00000005, "PSF_PEAKANAL");

   ParamImpl<Object> M_PSF_PEAKANAL = new ParamImpl<Object>('M', 0X00000020, "PSF_PEAKANAL");

   ParamImpl<Object> V_PSF_REAGENT = new ParamImpl<Object>('V', 0X00000006, "PSF_REAGENT");

   ParamImpl<Object> M_PSF_REAGENT = new ParamImpl<Object>('M', 0X00000040, "PSF_REAGENT");

   ParamImpl<Object> V_PSF_NUDSDONE = new ParamImpl<Object>('V', 0X00000007, "PSF_NUDSDONE");

   ParamImpl<Object> M_PSF_NUDSDONE = new ParamImpl<Object>('M', 0X00000080, "PSF_NUDSDONE");

   ParamImpl<Object> V_PSF_NUDSMCL = new ParamImpl<Object>('V', 0X00000008, "PSF_NUDSMCL");

   ParamImpl<Object> M_PSF_NUDSMCL = new ParamImpl<Object>('M', 0X00000100, "PSF_NUDSMCL");

   ParamImpl<Object> V_PSF_NUDSMNF = new ParamImpl<Object>('V', 0X00000009, "PSF_NUDSMNF");

   ParamImpl<Object> M_PSF_NUDSMNF = new ParamImpl<Object>('M', 0X00000200, "PSF_NUDSMNF");

   ParamImpl<Object> V_PSF_NUDSSCL = new ParamImpl<Object>('V', 0X0000000, "PSF_NUDSSCL");

   ParamImpl<Object> M_PSF_NUDSSCL = new ParamImpl<Object>('M', 0X00000400, "PSF_NUDSSCL");

   ParamImpl<Object> V_PSF_NUDSSNF = new ParamImpl<Object>('V', 0X0000000, "PSF_NUDSSNF");

   ParamImpl<Object> M_PSF_NUDSSNF = new ParamImpl<Object>('M', 0X00000800, "PSF_NUDSSNF");

   ParamImpl<Object> V_PSF_REFPEAK = new ParamImpl<Object>('V', 0X0000000, "PSF_REFPEAK");

   ParamImpl<Object> M_PSF_REFPEAK = new ParamImpl<Object>('M', 0X00001000, "PSF_REFPEAK");

   ParamImpl<Object> V_PSF_REFPEAKERR = new ParamImpl<Object>('V', 0X0000000, "PSF_REFPEAKERR");

   ParamImpl<Object> M_PSF_REFPEAKERR = new ParamImpl<Object>('M', 0X00002000, "PSF_REFPEAKERR");

   ParamImpl<Object> V_PSF_ASTMSUMDONE = new ParamImpl<Object>('V', 0X0000000, "PSF_ASTMSUMDONE");

   ParamImpl<Object> M_PSF_ASTMSUMDONE = new ParamImpl<Object>('M', 0X00004000, "PSF_ASTMSUMDONE");

   ParamImpl<Object> V_PSF_TNIDDONE = new ParamImpl<Object>('V', 0X0000000, "PSF_TNIDDONE");

   ParamImpl<Object> M_PSF_TNIDDONE = new ParamImpl<Object>('M', 0X00008000, "PSF_TNIDDONE");

   ParamImpl<Object> V_PSF_VCHECK = new ParamImpl<Object>('V', 0X00000010, "PSF_VCHECK");

   ParamImpl<Object> M_PSF_VCHECK = new ParamImpl<Object>('M', 0X00010000, "PSF_VCHECK");

   ParamImpl<Object> V_PSF_VCHECKRVW = new ParamImpl<Object>('V', 0X00000011, "PSF_VCHECKRVW");

   ParamImpl<Object> M_PSF_VCHECKRVW = new ParamImpl<Object>('M', 0X00020000, "PSF_VCHECKRVW");

   ParamImpl<Object> V_PSF_VCHECKREF = new ParamImpl<Object>('V', 0X00000012, "PSF_VCHECKREF");

   ParamImpl<Object> M_PSF_VCHECKREF = new ParamImpl<Object>('M', 0X00040000, "PSF_VCHECKREF");

   ParamImpl<Object> V_PSF_VCHECKFID = new ParamImpl<Object>('V', 0X00000013, "PSF_VCHECKFID");

   ParamImpl<Object> M_PSF_VCHECKFID = new ParamImpl<Object>('M', 0X00080000, "PSF_VCHECKFID");

   ParamImpl<Object> V_PSF_VCHECKMDT = new ParamImpl<Object>('V', 0X00000014, "PSF_VCHECKMDT");

   ParamImpl<Object> M_PSF_VCHECKMDT = new ParamImpl<Object>('M', 0X00100000, "PSF_VCHECKMDT");

   ParamImpl<Object> V_PSF_VCHECKFIT = new ParamImpl<Object>('V', 0X00000015, "PSF_VCHECKFIT");

   ParamImpl<Object> M_PSF_VCHECKFIT = new ParamImpl<Object>('M', 0X00200000, "PSF_VCHECKFIT");

   ParamImpl<Object> V_PSF_STRIPBACK = new ParamImpl<Object>('V', 0X00000016, "PSF_STRIPBACK");

   ParamImpl<Object> M_PSF_STRIPBACK = new ParamImpl<Object>('M', 0X00400000, "PSF_STRIPBACK");

   ParamImpl<Object> V_PSP_KNOWN = new ParamImpl<Object>('V', 0X00000000, "PSP_KNOWN");

   ParamImpl<Object> M_PSP_KNOWN = new ParamImpl<Object>('M', 0X00000001, "PSP_KNOWN");

   ParamImpl<Object> V_PSP_PFIT = new ParamImpl<Object>('V', 0X00000001, "PSP_PFIT");

   ParamImpl<Object> M_PSP_PFIT = new ParamImpl<Object>('M', 0X00000002, "PSP_PFIT");

   ParamImpl<Object> V_PSP_ENBACK = new ParamImpl<Object>('V', 0X00000002, "PSP_ENBACK");

   ParamImpl<Object> M_PSP_ENBACK = new ParamImpl<Object>('M', 0X00000004, "PSP_ENBACK");

   ParamImpl<Object> V_PSP_MANADD = new ParamImpl<Object>('V', 0X00000003, "PSP_MANADD");

   ParamImpl<Object> M_PSP_MANADD = new ParamImpl<Object>('M', 0X00000008, "PSP_MANADD");

   ParamImpl<Object> V_PSP_MANDEL = new ParamImpl<Object>('V', 0X00000004, "PSP_MANDEL");

   ParamImpl<Object> M_PSP_MANDEL = new ParamImpl<Object>('M', 0X00000010, "PSP_MANDEL");

   ParamImpl<Object> V_PSP_REFPK = new ParamImpl<Object>('V', 0X00000005, "PSP_REFPK");

   ParamImpl<Object> M_PSP_REFPK = new ParamImpl<Object>('M', 0X00000020, "PSP_REFPK");

   ParamImpl<Object> V_PSP_ABERR = new ParamImpl<Object>('V', 0X00000006, "PSP_ABERR");

   ParamImpl<Object> M_PSP_ABERR = new ParamImpl<Object>('M', 0X00000040, "PSP_ABERR");

   ParamImpl<Object> V_PSP_MANEDIT = new ParamImpl<Object>('V', 0X00000007, "PSP_MANEDIT");

   ParamImpl<Object> M_PSP_MANEDIT = new ParamImpl<Object>('M', 0X00000080, "PSP_MANEDIT");

   ParamImpl<Object> V_PSP_FITROI = new ParamImpl<Object>('V', 0X00000008, "PSP_FITROI");

   ParamImpl<Object> M_PSP_FITROI = new ParamImpl<Object>('M', 0X00000100, "PSP_FITROI");

   ParamImpl<Object> V_PSP_FITCONVERGE = new ParamImpl<Object>('V', 0X00000009, "PSP_FITCONVERGE");

   ParamImpl<Object> M_PSP_FITCONVERGE = new ParamImpl<Object>('M', 0X00000200, "PSP_FITCONVERGE");

   ParamImpl<Object> V_PSP_PARANGEL = new ParamImpl<Object>('V', 0X0000000, "PSP_PARANGEL");

   ParamImpl<Object> M_PSP_PARANGEL = new ParamImpl<Object>('M', 0X00000400, "PSP_PARANGEL");

   ParamImpl<Object> V_PSP_PARANGER = new ParamImpl<Object>('V', 0X0000000, "PSP_PARANGER");

   ParamImpl<Object> M_PSP_PARANGER = new ParamImpl<Object>('M', 0X00000800, "PSP_PARANGER");

   ParamImpl<Object> V_PSP_PADONE = new ParamImpl<Object>('V', 0X0000000, "PSP_PADONE");

   ParamImpl<Object> M_PSP_PADONE = new ParamImpl<Object>('M', 0X00001000, "PSP_PADONE");

   ParamImpl<Object> V_PSP_EFFINT = new ParamImpl<Object>('V', 0X0000000, "PSP_EFFINT");

   ParamImpl<Object> M_PSP_EFFINT = new ParamImpl<Object>('M', 0X00002000, "PSP_EFFINT");

   ParamImpl<Object> V_PSP_MULT = new ParamImpl<Object>('V', 0X0000000, "PSP_MULT");

   ParamImpl<Object> M_PSP_MULT = new ParamImpl<Object>('M', 0X00004000, "PSP_MULT");

   ParamImpl<Object> V_PSP_VARYENG = new ParamImpl<Object>('V', 0X0000000, "PSP_VARYENG");

   ParamImpl<Object> M_PSP_VARYENG = new ParamImpl<Object>('M', 0X00008000, "PSP_VARYENG");

   ParamImpl<Object> V_PSP_VARYAREA = new ParamImpl<Object>('V', 0X00000010, "PSP_VARYAREA");

   ParamImpl<Object> M_PSP_VARYAREA = new ParamImpl<Object>('M', 0X00010000, "PSP_VARYAREA");

   ParamImpl<Object> V_PSP_VARYFWHM = new ParamImpl<Object>('V', 0X00000011, "PSP_VARYFWHM");

   ParamImpl<Object> M_PSP_VARYFWHM = new ParamImpl<Object>('M', 0X00020000, "PSP_VARYFWHM");

   ParamImpl<Object> V_PSP_VARYLTAIL = new ParamImpl<Object>('V', 0X00000012, "PSP_VARYLTAIL");

   ParamImpl<Object> M_PSP_VARYLTAIL = new ParamImpl<Object>('M', 0X00040000, "PSP_VARYLTAIL");

   ParamImpl<Object> V_PSP_VARYHTAIL = new ParamImpl<Object>('V', 0X00000013, "PSP_VARYHTAIL");

   ParamImpl<Object> M_PSP_VARYHTAIL = new ParamImpl<Object>('M', 0X00080000, "PSP_VARYHTAIL");

   ParamImpl<Object> V_PSP_FROMLIBR = new ParamImpl<Object>('V', 0X00000014, "PSP_FROMLIBR");

   ParamImpl<Object> M_PSP_FROMLIBR = new ParamImpl<Object>('M', 0X00100000, "PSP_FROMLIBR");

   ParamImpl<Object> V_PSP_REAGENT = new ParamImpl<Object>('V', 0X00000015, "PSP_REAGENT");

   ParamImpl<Object> M_PSP_REAGENT = new ParamImpl<Object>('M', 0X00200000, "PSP_REAGENT");

   ParamImpl<Object> V_PSP_TRACERPK = new ParamImpl<Object>('V', 0X00000016, "PSP_TRACERPK");

   ParamImpl<Object> M_PSP_TRACERPK = new ParamImpl<Object>('M', 0X00400000, "PSP_TRACERPK");

   ParamImpl<Object> V_PSP_ADJPEAK = new ParamImpl<Object>('V', 0X00000017, "PSP_ADJPEAK");

   ParamImpl<Object> M_PSP_ADJPEAK = new ParamImpl<Object>('M', 0X00800000, "PSP_ADJPEAK");

   ParamImpl<Object> V_PSP_PRESENT = new ParamImpl<Object>('V', 0X00000018, "PSP_PRESENT");

   ParamImpl<Object> M_PSP_PRESENT = new ParamImpl<Object>('M', 0X01000000, "PSP_PRESENT");

   ParamImpl<Object> V_PSP_UNKNOWN = new ParamImpl<Object>('V', 0X00000019, "PSP_UNKNOWN");

   ParamImpl<Object> M_PSP_UNKNOWN = new ParamImpl<Object>('M', 0X02000000, "PSP_UNKNOWN");

   ParamImpl<Object> V_PSP_USEDINSUM = new ParamImpl<Object>('V', 0X0000001, "PSP_USEDINSUM");

   ParamImpl<Object> M_PSP_USEDINSUM = new ParamImpl<Object>('M', 0X04000000, "PSP_USEDINSUM");

   ParamImpl<String> T_NCLNAME = new ParamImpl<String>('T', 0X20070002, "NCLNAME");

   ParamImpl<String> T_NCLSBHDR = new ParamImpl<String>('T', 0X20070003, "NCLSBHDR");

   ParamImpl<Date> X_NCLHLFLIFE = new ParamImpl<Date>('X', 0X20070004, "NCLHLFLIFE");

   ParamImpl<Float> F_NCLMPC = new ParamImpl<Float>('F', 0X20070005, "NCLMPC");

   ParamImpl<Object> G_NCLMDA = new ParamImpl<Object>('G', 0X20070006, "NCLMDA");

   ParamImpl<Float> F_NCLGAMMA = new ParamImpl<Float>('F', 0X20070007, "NCLGAMMA");

   ParamImpl<Float> F_NCLBETA = new ParamImpl<Float>('F', 0X20070008, "NCLBETA");

   ParamImpl<Float> F_NCLABNLIM = new ParamImpl<Float>('F', 0X20070009, "NCLABNLIM");

   ParamImpl<Float> F_NCLMAC = new ParamImpl<Float>('F', 0X2007000, "NCLMAC");

   ParamImpl<Float> F_NCLAFRAC = new ParamImpl<Float>('F', 0X2007000, "NCLAFRAC");

   ParamImpl<Object> G_NCLDECAY = new ParamImpl<Object>('G', 0X2007000, "NCLDECAY");

   ParamImpl<Long> L_NCLFLAGS = new ParamImpl<Long>('L', 0X2007000, "NCLFLAGS");

   ParamImpl<Float> F_NCLSP1 = new ParamImpl<Float>('F', 0X2007000, "NCLSP1");

   ParamImpl<Float> F_NCLSP2 = new ParamImpl<Float>('F', 0X2007000, "NCLSP2");

   ParamImpl<Long> L_NCLLINE = new ParamImpl<Long>('L', 0X20070010, "NCLLINE");

   ParamImpl<Long> L_NCLFAPPEARS = new ParamImpl<Long>('L', 0X20070011, "NCLFAPPEARS");

   ParamImpl<Long> L_NCLFIDENT = new ParamImpl<Long>('L', 0X20070011, "NCLFIDENT");

   ParamImpl<Long> L_NCLFFDECAY = new ParamImpl<Long>('L', 0X20070012, "NCLFFDECAY");

   ParamImpl<Long> L_NCLFFABUN = new ParamImpl<Long>('L', 0X20070013, "NCLFFABUN");

   ParamImpl<String> T_NCLTITLE = new ParamImpl<String>('T', 0X20070014, "NCLTITLE");

   ParamImpl<Long> L_NCLFWTMEAN = new ParamImpl<Long>('L', 0X20070015, "NCLFWTMEAN");

   ParamImpl<Long> L_NCLFMDA = new ParamImpl<Long>('L', 0X20070016, "NCLFMDA");

   ParamImpl<Long> L_NCLFKEYOUT = new ParamImpl<Long>('L', 0X20070017, "NCLFKEYOUT");

   ParamImpl<Long> L_NCLFSHORTHL = new ParamImpl<Long>('L', 0X20070018, "NCLFSHORTHL");

   ParamImpl<Long> L_NIDFLAGS = new ParamImpl<Long>('L', 0X20070019, "NIDFLAGS");

   ParamImpl<String> T_NIDVERS = new ParamImpl<String>('T', 0X2007001, "NIDVERS");

   ParamImpl<String> T_MDAVERS = new ParamImpl<String>('T', 0X2007001, "MDAVERS");

   ParamImpl<String> T_INTERFVERS = new ParamImpl<String>('T', 0X2007001, "INTERFVERS");

   ParamImpl<String> T_WTMEANVERS = new ParamImpl<String>('T', 0X2007001, "WTMEANVERS");

   ParamImpl<Object> G_NCLWTMEAN = new ParamImpl<Object>('G', 0X2007001, "NCLWTMEAN");

   ParamImpl<Long> L_NCLKEY = new ParamImpl<Long>('L', 0X2007001, "NCLKEY");

   ParamImpl<String> T_NCLHLFUNITS = new ParamImpl<String>('T', 0X20070020, "NCLHLFUNITS");

   ParamImpl<Object> G_NCLWTMERR = new ParamImpl<Object>('G', 0X20070021, "NCLWTMERR");

   ParamImpl<Float> F_MDABKGND = new ParamImpl<Float>('F', 0X20070022, "MDABKGND");

   ParamImpl<Float> F_NCLEQUFAC = new ParamImpl<Float>('F', 0X20070023, "NCLEQUFAC");

   ParamImpl<Object> G_NCLSUMACT = new ParamImpl<Object>('G', 0X20070024, "NCLSUMACT");

   ParamImpl<Float> F_NCLSUMACTERF = new ParamImpl<Float>('F', 0X20070025, "NCLSUMACTERF");

   ParamImpl<Float> F_NCLRPTLEV = new ParamImpl<Float>('F', 0X20070026, "NCLRPTLEV");

   ParamImpl<Long> L_NCLFNOAUTO = new ParamImpl<Long>('L', 0X20070027, "NCLFNOAUTO");

   ParamImpl<Long> L_NCLFNORPTMDA = new ParamImpl<Long>('L', 0X20070028, "NCLFNORPTMDA");

   ParamImpl<Long> L_NCLFEBAR = new ParamImpl<Long>('L', 0X20070029, "NCLFEBAR");

   ParamImpl<Long> L_NCLFNOEBAR = new ParamImpl<Long>('L', 0X2007002, "NCLFNOEBAR");

   ParamImpl<String> T_NCLMPCLAB2 = new ParamImpl<String>('T', 0X20070038, "NCLMPCLAB2");

   ParamImpl<String> T_NCLMPCLAB3 = new ParamImpl<String>('T', 0X20070039, "NCLMPCLAB3");

   ParamImpl<String> T_NCLMPCLAB4 = new ParamImpl<String>('T', 0X2007003, "NCLMPCLAB4");

   ParamImpl<String> T_NCLMPCLAB5 = new ParamImpl<String>('T', 0X2007003, "NCLMPCLAB5");

   ParamImpl<String> T_NCLMPCLAB6 = new ParamImpl<String>('T', 0X2007003, "NCLMPCLAB6");

   ParamImpl<String> T_NCLMPCLAB7 = new ParamImpl<String>('T', 0X2007003, "NCLMPCLAB7");

   ParamImpl<String> T_NCLMPCLAB8 = new ParamImpl<String>('T', 0X2007003, "NCLMPCLAB8");

   ParamImpl<String> T_NCLPARENT = new ParamImpl<String>('T', 0X2007003, "NCLPARENT");

   ParamImpl<String> T_NCLDAUGHT = new ParamImpl<String>('T', 0X20070040, "NCLDAUGHT");

   ParamImpl<Float> F_NCLCONFID = new ParamImpl<Float>('F', 0X20070041, "NCLCONFID");

   ParamImpl<Float> F_NCLMETMDA = new ParamImpl<Float>('F', 0X20070043, "NCLMETMDA");

   ParamImpl<Date> X_NCLHLFERR = new ParamImpl<Date>('X', 0X20070044, "NCLHLFERR");

   ParamImpl<Float> F_NCLDECAYERR = new ParamImpl<Float>('F', 0X20070045, "NCLDECAYERR");

   ParamImpl<Float> F_NCLSP3 = new ParamImpl<Float>('F', 0X20070046, "NCLSP3");

   ParamImpl<Float> F_NCLSP4 = new ParamImpl<Float>('F', 0X20070047, "NCLSP4");

   ParamImpl<Float> F_NCLSP5 = new ParamImpl<Float>('F', 0X20070048, "NCLSP5");

   ParamImpl<Float> F_NCLSP6 = new ParamImpl<Float>('F', 0X20070049, "NCLSP6");

   ParamImpl<Float> F_NCLMPC2 = new ParamImpl<Float>('F', 0X2007004, "NCLMPC2");

   ParamImpl<Float> F_NCLMPC3 = new ParamImpl<Float>('F', 0X2007004, "NCLMPC3");

   ParamImpl<Float> F_NCLMPC4 = new ParamImpl<Float>('F', 0X2007004, "NCLMPC4");

   ParamImpl<Float> F_NCLMPC5 = new ParamImpl<Float>('F', 0X20070050, "NCLMPC5");

   ParamImpl<Float> F_NCLMPC6 = new ParamImpl<Float>('F', 0X20070051, "NCLMPC6");

   ParamImpl<Float> F_NCLMPC7 = new ParamImpl<Float>('F', 0X20070052, "NCLMPC7");

   ParamImpl<Float> F_NCLMPC8 = new ParamImpl<Float>('F', 0X20070053, "NCLMPC8");

   ParamImpl<String> T_NCLMPCLAB1 = new ParamImpl<String>('T', 0X20070054, "NCLMPCLAB1");

   ParamImpl<Float> F_DEQACTI = new ParamImpl<Float>('F', 0X20070055, "DEQACTI");

   ParamImpl<Float> F_DEQACTXE = new ParamImpl<Float>('F', 0X20070056, "DEQACTXE");

   ParamImpl<Long> L_NIDFNID = new ParamImpl<Long>('L', 0X20070057, "NIDFNID");

   ParamImpl<Long> L_NIDFMDA = new ParamImpl<Long>('L', 0X20070058, "NIDFMDA");

   ParamImpl<Long> L_NIDFINTERF = new ParamImpl<Long>('L', 0X20070059, "NIDFINTERF");

   ParamImpl<Long> L_NIDFWTMEAN = new ParamImpl<Long>('L', 0X2007005, "NIDFWTMEAN");

   ParamImpl<Long> L_NIDFEBAR = new ParamImpl<Long>('L', 0X2007005, "NIDFEBAR");

   ParamImpl<Long> L_NIDFVARDT = new ParamImpl<Long>('L', 0X2007005, "NIDFVARDT");

   ParamImpl<Long> L_NCLFMREJECT = new ParamImpl<Long>('L', 0X2007005, "NCLFMREJECT");

   ParamImpl<Long> L_NCLFMEDIT = new ParamImpl<Long>('L', 0X2007005, "NCLFMEDIT");

   ParamImpl<Long> L_NCLFVARDT = new ParamImpl<Long>('L', 0X2007005, "NCLFVARDT");

   ParamImpl<Long> L_NCLFMACCEPT = new ParamImpl<Long>('L', 0X20070060, "NCLFMACCEPT");

   ParamImpl<Long> L_NCLFINTFREJ = new ParamImpl<Long>('L', 0X20070061, "NCLFINTFREJ");

   ParamImpl<String> T_NCLMPC1AU = new ParamImpl<String>('T', 0X20070062, "NCLMPC1AU");

   ParamImpl<String> T_NCLMPC2AU = new ParamImpl<String>('T', 0X20070063, "NCLMPC2AU");

   ParamImpl<String> T_NCLMPC3AU = new ParamImpl<String>('T', 0X20070064, "NCLMPC3AU");

   ParamImpl<String> T_NCLMPC4AU = new ParamImpl<String>('T', 0X20070065, "NCLMPC4AU");

   ParamImpl<String> T_NCLMPC5AU = new ParamImpl<String>('T', 0X20070066, "NCLMPC5AU");

   ParamImpl<String> T_NCLMPC6AU = new ParamImpl<String>('T', 0X20070067, "NCLMPC6AU");

   ParamImpl<String> T_NCLMPC7AU = new ParamImpl<String>('T', 0X20070068, "NCLMPC7AU");

   ParamImpl<String> T_NCLMPC8AU = new ParamImpl<String>('T', 0X20070069, "NCLMPC8AU");

   ParamImpl<String> T_NCLMPC1QU = new ParamImpl<String>('T', 0X2007006, "NCLMPC1QU");

   ParamImpl<String> T_NCLMPC2QU = new ParamImpl<String>('T', 0X2007006, "NCLMPC2QU");

   ParamImpl<String> T_NCLMPC3QU = new ParamImpl<String>('T', 0X2007006, "NCLMPC3QU");

   ParamImpl<String> T_NCLMPC4QU = new ParamImpl<String>('T', 0X2007006, "NCLMPC4QU");

   ParamImpl<String> T_NCLMPC5QU = new ParamImpl<String>('T', 0X2007006, "NCLMPC5QU");

   ParamImpl<String> T_NCLMPC6QU = new ParamImpl<String>('T', 0X2007006, "NCLMPC6QU");

   ParamImpl<String> T_NCLMPC7QU = new ParamImpl<String>('T', 0X20070070, "NCLMPC7QU");

   ParamImpl<String> T_NCLMPC8QU = new ParamImpl<String>('T', 0X20070071, "NCLMPC8QU");

   ParamImpl<Float> F_NCLMPC1QCF = new ParamImpl<Float>('F', 0X20070072, "NCLMPC1QCF");

   ParamImpl<Float> F_NCLMPC2QCF = new ParamImpl<Float>('F', 0X20070073, "NCLMPC2QCF");

   ParamImpl<Float> F_NCLMPC3QCF = new ParamImpl<Float>('F', 0X20070074, "NCLMPC3QCF");

   ParamImpl<Float> F_NCLMPC4QCF = new ParamImpl<Float>('F', 0X20070075, "NCLMPC4QCF");

   ParamImpl<Float> F_NCLMPC5QCF = new ParamImpl<Float>('F', 0X20070076, "NCLMPC5QCF");

   ParamImpl<Float> F_NCLMPC6QCF = new ParamImpl<Float>('F', 0X20070077, "NCLMPC6QCF");

   ParamImpl<Float> F_NCLMPC7QCF = new ParamImpl<Float>('F', 0X20070078, "NCLMPC7QCF");

   ParamImpl<Float> F_NCLMPC8QCF = new ParamImpl<Float>('F', 0X20070079, "NCLMPC8QCF");

   ParamImpl<Long> L_NCLMPCFLAGS = new ParamImpl<Long>('L', 0X2007007, "NCLMPCFLAGS");

   ParamImpl<Long> L_NCLMPCSQF1 = new ParamImpl<Long>('L', 0X2007007, "NCLMPCSQF1");

   ParamImpl<Long> L_NCLMPCSQF2 = new ParamImpl<Long>('L', 0X2007007, "NCLMPCSQF2");

   ParamImpl<Long> L_NCLMPCSQF3 = new ParamImpl<Long>('L', 0X2007007, "NCLMPCSQF3");

   ParamImpl<Long> L_NCLMPCSQF4 = new ParamImpl<Long>('L', 0X2007007, "NCLMPCSQF4");

   ParamImpl<Long> L_NCLMPCSQF5 = new ParamImpl<Long>('L', 0X2007007, "NCLMPCSQF5");

   ParamImpl<Long> L_NCLMPCSQF6 = new ParamImpl<Long>('L', 0X20070080, "NCLMPCSQF6");

   ParamImpl<Long> L_NCLMPCSQF7 = new ParamImpl<Long>('L', 0X20070081, "NCLMPCSQF7");

   ParamImpl<Long> L_NCLMPCSQF8 = new ParamImpl<Long>('L', 0X20070082, "NCLMPCSQF8");

   ParamImpl<Float> F_NCLDACD = new ParamImpl<Float>('F', 0X20070083, "NCLDACD");

   ParamImpl<Float> F_NCLDACW = new ParamImpl<Float>('F', 0X20070084, "NCLDACW");

   ParamImpl<Float> F_NCLDACY = new ParamImpl<Float>('F', 0X20070085, "NCLDACY");

   ParamImpl<String> T_NCLDACTYPE = new ParamImpl<String>('T', 0X20070086, "NCLDACTYPE");

   ParamImpl<Long> L_LIBFLAGS = new ParamImpl<Long>('L', 0X20070087, "LIBFLAGS");

   ParamImpl<Long> L_LIBFNOSORT = new ParamImpl<Long>('L', 0X20070088, "LIBFNOSORT");

   ParamImpl<Long> L_NCLFUNRESINT = new ParamImpl<Long>('L', 0X20070089, "NCLFUNRESINT");

   ParamImpl<Float> F_NCLMRL = new ParamImpl<Float>('F', 0X2007008, "NCLMRL");

   ParamImpl<Float> F_NCLERRREJ = new ParamImpl<Float>('F', 0X2007008, "NCLERRREJ");

   ParamImpl<Float> F_NCLMDAENG = new ParamImpl<Float>('F', 0X2007008, "NCLMDAENG");

   ParamImpl<Long> L_NCLFERRREJ = new ParamImpl<Long>('L', 0X2007008, "NCLFERRREJ");

   ParamImpl<Long> L_NCLFMRLREJ = new ParamImpl<Long>('L', 0X2007008, "NCLFMRLREJ");

   ParamImpl<Float> F_NCLMDAERR = new ParamImpl<Float>('F', 0X2007008, "NCLMDAERR");

   ParamImpl<String> T_NCLECATYPE = new ParamImpl<String>('T', 0X20070090, "NCLECATYPE");

   ParamImpl<String> T_NCLECWTYPE = new ParamImpl<String>('T', 0X20070091, "NCLECWTYPE");

   ParamImpl<String> T_NCLRSTYPE = new ParamImpl<String>('T', 0X20070092, "NCLRSTYPE");

   ParamImpl<Float> F_NCLECAD = new ParamImpl<Float>('F', 0X20070093, "NCLECAD");

   ParamImpl<Float> F_NCLECAW = new ParamImpl<Float>('F', 0X20070094, "NCLECAW");

   ParamImpl<Float> F_NCLECAY = new ParamImpl<Float>('F', 0X20070095, "NCLECAY");

   ParamImpl<Float> F_NCLECWD = new ParamImpl<Float>('F', 0X20070096, "NCLECWD");

   ParamImpl<Float> F_NCLECWW = new ParamImpl<Float>('F', 0X20070097, "NCLECWW");

   ParamImpl<Float> F_NCLECWY = new ParamImpl<Float>('F', 0X20070098, "NCLECWY");

   ParamImpl<Float> F_NCLRSD = new ParamImpl<Float>('F', 0X20070099, "NCLRSD");

   ParamImpl<Float> F_NCLRSW = new ParamImpl<Float>('F', 0X2007009, "NCLRSW");

   ParamImpl<Float> F_NCLRSY = new ParamImpl<Float>('F', 0X2007009, "NCLRSY");

   ParamImpl<String> T_NCLPT20AU = new ParamImpl<String>('T', 0X2007009, "NCLPT20AU");

   ParamImpl<String> T_NCLPT20QU = new ParamImpl<String>('T', 0X2007009, "NCLPT20QU");

   ParamImpl<Float> F_NCLPT20QCF = new ParamImpl<Float>('F', 0X2007009, "NCLPT20QCF");

   ParamImpl<Long> L_NCLPT20SQF = new ParamImpl<Long>('L', 0X2007009, "NCLPT20SQF");

   ParamImpl<Long> L_NCLPT20DAYS = new ParamImpl<Long>('L', 0X200700, "NCLPT20DAYS");

   ParamImpl<Long> L_NCLPT20WEEKS = new ParamImpl<Long>('L', 0X200700, "NCLPT20WEEKS");

   ParamImpl<Long> L_NCLPT20YEARS = new ParamImpl<Long>('L', 0X200700, "NCLPT20YEARS");

   ParamImpl<Long> L_NCLPT20EAD = new ParamImpl<Long>('L', 0X200700, "NCLPT20EAD");

   ParamImpl<Long> L_NCLPT20EAW = new ParamImpl<Long>('L', 0X200700, "NCLPT20EAW");

   ParamImpl<Long> L_NCLPT20EAY = new ParamImpl<Long>('L', 0X200700, "NCLPT20EAY");

   ParamImpl<Long> L_NCLPT20EWD = new ParamImpl<Long>('L', 0X200700, "NCLPT20EWD");

   ParamImpl<Long> L_NCLPT20EWW = new ParamImpl<Long>('L', 0X200700, "NCLPT20EWW");

   ParamImpl<Long> L_NCLPT20EWY = new ParamImpl<Long>('L', 0X200700, "NCLPT20EWY");

   ParamImpl<Long> L_NCLPT20RSD = new ParamImpl<Long>('L', 0X200700, "NCLPT20RSD");

   ParamImpl<Long> L_NCLPT20RSW = new ParamImpl<Long>('L', 0X200700, "NCLPT20RSW");

   ParamImpl<Long> L_NCLPT20RSY = new ParamImpl<Long>('L', 0X200700, "NCLPT20RSY");

   ParamImpl<Long> L_NCLFLAGS2 = new ParamImpl<Long>('L', 0X200700, "NCLFLAGS2");

   ParamImpl<Float> F_NCLATMMASS = new ParamImpl<Float>('F', 0X200700, "NCLATMMASS");

   ParamImpl<String> T_ACTADJVERS = new ParamImpl<String>('T', 0X200700, "ACTADJVERS");

   ParamImpl<Long> L_NIDFACTADJ = new ParamImpl<Long>('L', 0X200700, "NIDFACTADJ");

   ParamImpl<String> T_ACTLVLVERS = new ParamImpl<String>('T', 0X200700, "ACTLVLVERS");

   ParamImpl<Long> L_NIDFACTLVL = new ParamImpl<Long>('L', 0X200700, "NIDFACTLVL");

   ParamImpl<Long> L_NCLPUNKNOWN = new ParamImpl<Long>('L', 0X200700, "NCLPUNKNOWN");

   ParamImpl<Object> G_NCLSUMACT2 = new ParamImpl<Object>('G', 0X200700, "NCLSUMACT2");

   ParamImpl<Float> F_NCLLEV1SUM = new ParamImpl<Float>('F', 0X200700, "NCLLEV1SUM");

   ParamImpl<Float> F_NCLLEV2SUM = new ParamImpl<Float>('F', 0X200700, "NCLLEV2SUM");

   ParamImpl<Long> L_NIDLEV1CON = new ParamImpl<Long>('L', 0X200700, "NIDLEV1CON");

   ParamImpl<Long> L_NIDLEV2CON = new ParamImpl<Long>('L', 0X200700, "NIDLEV2CON");

   ParamImpl<Float> F_NCLLEV1UCONV = new ParamImpl<Float>('F', 0X200700, "NCLLEV1UCONV");

   ParamImpl<Float> F_NCLLEV2UCONV = new ParamImpl<Float>('F', 0X200700, "NCLLEV2UCONV");

   ParamImpl<String> T_NCLLEV1UNITS = new ParamImpl<String>('T', 0X200700, "NCLLEV1UNITS");

   ParamImpl<String> T_NCLLEV2UNITS = new ParamImpl<String>('T', 0X200700, "NCLLEV2UNITS");

   ParamImpl<Long> L_NCLNUMFOUND = new ParamImpl<Long>('L', 0X200700, "NCLNUMFOUND");

   ParamImpl<String> T_NCLGRPNAME = new ParamImpl<String>('T', 0X200700, "NCLGRPNAME");

   ParamImpl<Float> F_NCLLEVEL1 = new ParamImpl<Float>('F', 0X200700, "NCLLEVEL1");

   ParamImpl<Float> F_NCLLEVEL2 = new ParamImpl<Float>('F', 0X200700, "NCLLEVEL2");

   ParamImpl<Float> F_NCLACTLEVEL1 = new ParamImpl<Float>('F', 0X200700, "NCLACTLEVEL1");

   ParamImpl<Float> F_NCLACTLEVEL2 = new ParamImpl<Float>('F', 0X200700, "NCLACTLEVEL2");

   ParamImpl<Float> F_NCLADJFAC1 = new ParamImpl<Float>('F', 0X200700, "NCLADJFAC1");

   ParamImpl<Float> F_NCLADJFAC2 = new ParamImpl<Float>('F', 0X200700, "NCLADJFAC2");

   ParamImpl<Float> F_NCLADJFAC3 = new ParamImpl<Float>('F', 0X200700, "NCLADJFAC3");

   ParamImpl<Float> F_NCLERRADJ = new ParamImpl<Float>('F', 0X200700, "NCLERRADJ");

   ParamImpl<String> T_NCLOBSERVED = new ParamImpl<String>('T', 0X200700, "NCLOBSERVED");

   ParamImpl<Long> L_NCLACT1ALRM1 = new ParamImpl<Long>('L', 0X200700, "NCLACT1ALRM1");

   ParamImpl<Long> L_NCLACT2ALRM1 = new ParamImpl<Long>('L', 0X200700, "NCLACT2ALRM1");

   ParamImpl<Long> L_NCLACT1ALRM2 = new ParamImpl<Long>('L', 0X200700, "NCLACT1ALRM2");

   ParamImpl<Long> L_NCLACT2ALRM2 = new ParamImpl<Long>('L', 0X200700, "NCLACT2ALRM2");

   ParamImpl<Long> L_NCLFADJUSTED = new ParamImpl<Long>('L', 0X200700, "NCLFADJUSTED");

   ParamImpl<String> T_MGANIDVERS = new ParamImpl<String>('T', 0X200700, "MGANIDVERS");

   ParamImpl<String> T_NIDCOMBVERS = new ParamImpl<String>('T', 0X200700, "NIDCOMBVERS");

   ParamImpl<Long> L_NIDFNIDCOMB = new ParamImpl<Long>('L', 0X200700, "NIDFNIDCOMB");

   ParamImpl<Long> L_NIDFMGANID = new ParamImpl<Long>('L', 0X200700, "NIDFMGANID");

   ParamImpl<String> T_NCLRESSRC = new ParamImpl<String>('T', 0X200700, "NCLRESSRC");

   ParamImpl<Long> L_NIDFMGANIDP = new ParamImpl<Long>('L', 0X200700, "NIDFMGANIDP");

   ParamImpl<Float> F_NCLSPECACT = new ParamImpl<Float>('F', 0X200700, "NCLSPECACT");

   ParamImpl<Long> L_ASTMMASSANAE = new ParamImpl<Long>('L', 0X200700, "ASTMMASSANAE");

   ParamImpl<Long> L_ASTMMASSDONE = new ParamImpl<Long>('L', 0X200700, "ASTMMASSDONE");

   ParamImpl<Float> F_NCLCTRLRECOV = new ParamImpl<Float>('F', 0X200700, "NCLCTRLRECOV");

   ParamImpl<String> T_NCLCONTROLDS = new ParamImpl<String>('T', 0X200700, "NCLCONTROLDS");

   ParamImpl<Float> F_NCLOSRELDIF = new ParamImpl<Float>('F', 0X200700, "NCLOSRELDIF");

   ParamImpl<Long> L_NIDFCRECOVDN = new ParamImpl<Long>('L', 0X200700, "NIDFCRECOVDN");

   ParamImpl<Date> X_NCLCOOLDATE = new ParamImpl<Date>('X', 0X200700, "NCLCOOLDATE");

   ParamImpl<Date> X_NCLCOOLDATEN = new ParamImpl<Date>('X', 0X200700, "NCLCOOLDATEN");

   ParamImpl<String> T_NCLNUCSVERS = new ParamImpl<String>('T', 0X200700, "NCLNUCSVERS");

   ParamImpl<Long> L_NCLPDCANAERR = new ParamImpl<Long>('L', 0X200700, "NCLPDCANAERR");

   ParamImpl<Object> G_NCLORGWTM = new ParamImpl<Object>('G', 0X200700, "NCLORGWTM");

   ParamImpl<Object> G_NCLORGWTMERR = new ParamImpl<Object>('G', 0X200700, "NCLORGWTMERR");

   ParamImpl<Long> L_NCLSABSCE = new ParamImpl<Long>('L', 0X200700, "NCLSABSCE");

   ParamImpl<Long> L_NCLSABSDONE = new ParamImpl<Long>('L', 0X200700, "NCLSABSDONE");

   ParamImpl<Object> G_NCLNSAWTM = new ParamImpl<Object>('G', 0X200700, "NCLNSAWTM");

   ParamImpl<Object> G_NCLNSAWTME = new ParamImpl<Object>('G', 0X200700, "NCLNSAWTME");

   ParamImpl<Float> F_NCLSABSBETA = new ParamImpl<Float>('F', 0X200700, "NCLSABSBETA");

   ParamImpl<Float> F_NCLSABSBETAE = new ParamImpl<Float>('F', 0X200700, "NCLSABSBETAE");

   ParamImpl<Float> F_NCLSABSALPHA = new ParamImpl<Float>('F', 0X200700, "NCLSABSALPHA");

   ParamImpl<Float> F_NCLSABSALPHE = new ParamImpl<Float>('F', 0X200700, "NCLSABSALPHE");

   ParamImpl<Long> L_NCLSABSNPKS = new ParamImpl<Long>('L', 0X200700, "NCLSABSNPKS");

   ParamImpl<String> T_NCLDACLAB = new ParamImpl<String>('T', 0X200700, "NCLDACLAB");

   ParamImpl<String> T_NCLCSCVERS = new ParamImpl<String>('T', 0X200700, "NCLCSCVERS");

   ParamImpl<Long> L_NIDFCSCDONE = new ParamImpl<Long>('L', 0X200700, "NIDFCSCDONE");

   ParamImpl<Long> L_NIDFPDCDONE = new ParamImpl<Long>('L', 0X200700, "NIDFPDCDONE");

   ParamImpl<String> T_NCLPDCVERS = new ParamImpl<String>('T', 0X200700, "NCLPDCVERS");

   ParamImpl<Long> L_NCLFPDCORRDN = new ParamImpl<Long>('L', 0X200700, "NCLFPDCORRDN");

   ParamImpl<Float> F_NCLPARENTRAT = new ParamImpl<Float>('F', 0X200700, "NCLPARENTRAT");

   ParamImpl<Float> F_NCLPARENTRER = new ParamImpl<Float>('F', 0X200700, "NCLPARENTRER");

   ParamImpl<Long> L_NCLFUSETRU = new ParamImpl<Long>('L', 0X200700, "NCLFUSETRU");

   ParamImpl<Long> L_NCLFUSETAA = new ParamImpl<Long>('L', 0X200700, "NCLFUSETAA");

   ParamImpl<Long> L_NCLFWIPP = new ParamImpl<Long>('L', 0X200700, "NCLFWIPP");

   ParamImpl<Long> L_NCLFUSEASFID = new ParamImpl<Long>('L', 0X200700, "NCLFUSEASFID");

   ParamImpl<Long> L_NCLFUSEISO = new ParamImpl<Long>('L', 0X200700, "NCLFUSEISO");

   ParamImpl<Float> F_NCLSPECPWR = new ParamImpl<Float>('F', 0X200700, "NCLSPECPWR");

   ParamImpl<Float> F_NCLFGEFAC = new ParamImpl<Float>('F', 0X200700, "NCLFGEFAC");

   ParamImpl<Float> F_NCLPEFAC = new ParamImpl<Float>('F', 0X200700, "NCLPEFAC");

   ParamImpl<String> T_LACEVERS = new ParamImpl<String>('T', 0X200700, "LACEVERS");

   ParamImpl<Long> L_NIDFLACE = new ParamImpl<Long>('L', 0X200700, "NIDFLACE");

   ParamImpl<Long> L_NCLLCPROC = new ParamImpl<Long>('L', 0X200700, "NCLLCPROC");

   ParamImpl<Long> L_NCLLCKEYREJ = new ParamImpl<Long>('L', 0X200700, "NCLLCKEYREJ");

   ParamImpl<Long> L_NCLLCSINGREJ = new ParamImpl<Long>('L', 0X200700, "NCLLCSINGREJ");

   ParamImpl<Float> F_NCLLCKEYOFF = new ParamImpl<Float>('F', 0X200700, "NCLLCKEYOFF");

   ParamImpl<Float> F_NCLLCKEYOFFE = new ParamImpl<Float>('F', 0X20070100, "NCLLCKEYOFFE");

   ParamImpl<Float> F_NCLLCKEYSLO = new ParamImpl<Float>('F', 0X20070101, "NCLLCKEYSLO");

   ParamImpl<Float> F_NCLLCKEYSLOE = new ParamImpl<Float>('F', 0X20070102, "NCLLCKEYSLOE");

   ParamImpl<Float> F_NCLLCKEYOSCO = new ParamImpl<Float>('F', 0X20070103, "NCLLCKEYOSCO");

   ParamImpl<Float> F_NCLLCWMOFF = new ParamImpl<Float>('F', 0X20070104, "NCLLCWMOFF");

   ParamImpl<Float> F_NCLLCWMOFFE = new ParamImpl<Float>('F', 0X20070105, "NCLLCWMOFFE");

   ParamImpl<Float> F_NCLLCWMSLO = new ParamImpl<Float>('F', 0X20070106, "NCLLCWMSLO");

   ParamImpl<Float> F_NCLLCWMSLOE = new ParamImpl<Float>('F', 0X20070107, "NCLLCWMSLOE");

   ParamImpl<Float> F_NCLLCWMOSCO = new ParamImpl<Float>('F', 0X20070108, "NCLLCWMOSCO");

   ParamImpl<Float> F_NCLDOTADJFAC = new ParamImpl<Float>('F', 0X20070109, "NCLDOTADJFAC");

   ParamImpl<Long> L_NCLFHAZNUCL = new ParamImpl<Long>('L', 0X2007010, "NCLFHAZNUCL");

   ParamImpl<Float> F_NCLTOTCON = new ParamImpl<Float>('F', 0X2007010, "NCLTOTCON");

   ParamImpl<Float> F_NCLTOTCONERR = new ParamImpl<Float>('F', 0X2007010, "NCLTOTCONERR");

   ParamImpl<Date> X_NCLCOOL2CLSA = new ParamImpl<Date>('X', 0X2007010, "NCLCOOL2CLSA");

   ParamImpl<Date> X_NCLCOOL2CLSB = new ParamImpl<Date>('X', 0X2007010, "NCLCOOL2CLSB");

   ParamImpl<Date> X_NCLCOOL2CLSC = new ParamImpl<Date>('X', 0X2007010, "NCLCOOL2CLSC");

   ParamImpl<Long> L_NCLWCSTAT = new ParamImpl<Long>('L', 0X20070110, "NCLWCSTAT");

   ParamImpl<Long> L_NIDFWCDONE = new ParamImpl<Long>('L', 0X20070111, "NIDFWCDONE");

   ParamImpl<String> T_NCLWCLASS = new ParamImpl<String>('T', 0X20070112, "NCLWCLASS");

   ParamImpl<Float> F_NCLTENTNSIG = new ParamImpl<Float>('F', 0X20070113, "NCLTENTNSIG");

   ParamImpl<Float> F_NCLOPTNSIG = new ParamImpl<Float>('F', 0X20070114, "NCLOPTNSIG");

   ParamImpl<Float> F_NCLCORRCOEFF = new ParamImpl<Float>('F', 0X20070115, "NCLCORRCOEFF");

   ParamImpl<Long> L_NCLFCANDIDAT = new ParamImpl<Long>('L', 0X20070116, "NCLFCANDIDAT");

   ParamImpl<Float> F_NCLATMWGT = new ParamImpl<Float>('F', 0X200700, "NCLATMWGT");

   ParamImpl<Float> F_NCLCRSEC = new ParamImpl<Float>('F', 0X200700, "NCLCRSEC");

   ParamImpl<String> T_NFLUXVERS = new ParamImpl<String>('T', 0X200700, "NFLUXVERS");

   ParamImpl<String> T_NAAVERS = new ParamImpl<String>('T', 0X200700, "NAAVERS");

   ParamImpl<Float> F_NCLCONC = new ParamImpl<Float>('F', 0X200700, "NCLCONC");

   ParamImpl<Float> F_NCLCONCERR = new ParamImpl<Float>('F', 0X200700, "NCLCONCERR");

   ParamImpl<String> T_NCLCONCUNITS = new ParamImpl<String>('T', 0X200700, "NCLCONCUNITS");

   ParamImpl<Long> L_NCLFFLUX = new ParamImpl<Long>('L', 0X200700, "NCLFFLUX");

   ParamImpl<String> T_NCLFLUX = new ParamImpl<String>('T', 0X200700, "NCLFLUX");

   ParamImpl<Float> F_ELTNFLUX = new ParamImpl<Float>('F', 0X200700, "ELTNFLUX");

   ParamImpl<Float> F_ELENFLUX = new ParamImpl<Float>('F', 0X200700, "ELENFLUX");

   ParamImpl<Float> F_ELFNFLUX = new ParamImpl<Float>('F', 0X200700, "ELFNFLUX");

   ParamImpl<Date> X_ELIRTIME = new ParamImpl<Date>('X', 0X200700, "ELIRTIME");

   ParamImpl<String> T_ELSUNIT = new ParamImpl<String>('T', 0X200700, "ELSUNIT");

   ParamImpl<Date> X_ELSTIME = new ParamImpl<Date>('X', 0X200700, "ELSTIME");

   ParamImpl<Date> X_ELSDATE = new ParamImpl<Date>('X', 0X200700, "ELSDATE");

   ParamImpl<Float> F_NCLPFRAC = new ParamImpl<Float>('F', 0X200700, "NCLPFRAC");

   ParamImpl<Float> F_NCLCRSEC1 = new ParamImpl<Float>('F', 0X200700, "NCLCRSEC1");

   ParamImpl<Float> F_NCLCRSEC2 = new ParamImpl<Float>('F', 0X200700, "NCLCRSEC2");

   ParamImpl<String> T_NCLFLUX1 = new ParamImpl<String>('T', 0X200700, "NCLFLUX1");

   ParamImpl<String> T_NCLFLUX2 = new ParamImpl<String>('T', 0X200700, "NCLFLUX2");

   ParamImpl<String> T_WBCDVERS = new ParamImpl<String>('T', 0X200700, "WBCDVERS");

   ParamImpl<Long> L_NCLRPTMDA = new ParamImpl<Long>('L', 0X200700, "NCLRPTMDA");

   ParamImpl<Float> F_NCLMPBTH = new ParamImpl<Float>('F', 0X200700, "NCLMPBTH");

   ParamImpl<Float> F_NCLMPBLU = new ParamImpl<Float>('F', 0X200700, "NCLMPBLU");

   ParamImpl<Float> F_NCLMPBLT = new ParamImpl<Float>('F', 0X200700, "NCLMPBLT");

   ParamImpl<Float> F_NCLAVGSTH = new ParamImpl<Float>('F', 0X200700, "NCLAVGSTH");

   ParamImpl<Float> F_NCLAVGSLU = new ParamImpl<Float>('F', 0X200700, "NCLAVGSLU");

   ParamImpl<Float> F_NCLAVGSLT = new ParamImpl<Float>('F', 0X200700, "NCLAVGSLT");

   ParamImpl<Float> F_NCLAVGQ50TH = new ParamImpl<Float>('F', 0X200700, "NCLAVGQ50TH");

   ParamImpl<Float> F_NCLAVGQ50LU = new ParamImpl<Float>('F', 0X200700, "NCLAVGQ50LU");

   ParamImpl<Float> F_NCLAVGQ50LT = new ParamImpl<Float>('F', 0X200700, "NCLAVGQ50LT");

   ParamImpl<Float> F_NCLFRUPTH = new ParamImpl<Float>('F', 0X200700, "NCLFRUPTH");

   ParamImpl<Float> F_NCLFRUPLU = new ParamImpl<Float>('F', 0X200700, "NCLFRUPLU");

   ParamImpl<Float> F_NCLFRUPLT = new ParamImpl<Float>('F', 0X200700, "NCLFRUPLT");

   ParamImpl<Float> F_NCLADLMTTH = new ParamImpl<Float>('F', 0X200700, "NCLADLMTTH");

   ParamImpl<Float> F_NCLADLMTLU = new ParamImpl<Float>('F', 0X200700, "NCLADLMTLU");

   ParamImpl<Float> F_NCLADLMTLT = new ParamImpl<Float>('F', 0X200700, "NCLADLMTLT");

   ParamImpl<Float> F_NCLOBMPBTH = new ParamImpl<Float>('F', 0X200700, "NCLOBMPBTH");

   ParamImpl<Float> F_NCLOBMPBLU = new ParamImpl<Float>('F', 0X200700, "NCLOBMPBLU");

   ParamImpl<Float> F_NCLOBMPBLT = new ParamImpl<Float>('F', 0X200700, "NCLOBMPBLT");

   ParamImpl<Float> F_NCLMPCHRTH = new ParamImpl<Float>('F', 0X200700, "NCLMPCHRTH");

   ParamImpl<Float> F_NCLMPCHRLU = new ParamImpl<Float>('F', 0X200700, "NCLMPCHRLU");

   ParamImpl<Float> F_NCLMPCHRLT = new ParamImpl<Float>('F', 0X200700, "NCLMPCHRLT");

   ParamImpl<Float> F_NCLD50TH = new ParamImpl<Float>('F', 0X200700, "NCLD50TH");

   ParamImpl<Float> F_NCLD50LU = new ParamImpl<Float>('F', 0X200700, "NCLD50LU");

   ParamImpl<Date> X_NCLHLEFFTH = new ParamImpl<Date>('X', 0X200700, "NCLHLEFFTH");

   ParamImpl<Date> X_NCLHLEFFLU = new ParamImpl<Date>('X', 0X200700, "NCLHLEFFLU");

   ParamImpl<Date> X_NCLHLEFFLT = new ParamImpl<Date>('X', 0X200700, "NCLHLEFFLT");

   ParamImpl<Float> F_NCLD50LT = new ParamImpl<Float>('F', 0X200700, "NCLD50LT");

   ParamImpl<String> T_NCLHLUNTH = new ParamImpl<String>('T', 0X200700, "NCLHLUNTH");

   ParamImpl<String> T_NCLHLUNLU = new ParamImpl<String>('T', 0X200700, "NCLHLUNLU");

   ParamImpl<String> T_NCLHLUNLT = new ParamImpl<String>('T', 0X200700, "NCLHLUNLT");

   ParamImpl<String> T_NCLSOLCLASS = new ParamImpl<String>('T', 0X20070100, "NCLSOLCLASS");

   ParamImpl<Float> F_NCLALI = new ParamImpl<Float>('F', 0X20070101, "NCLALI");

   ParamImpl<Float> F_NCLINTAKE = new ParamImpl<Float>('F', 0X20070102, "NCLINTAKE");

   ParamImpl<Float> F_NCLRATE1 = new ParamImpl<Float>('F', 0X20070103, "NCLRATE1");

   ParamImpl<Float> F_NCLRATE2 = new ParamImpl<Float>('F', 0X20070104, "NCLRATE2");

   ParamImpl<Float> F_NCLRATE3 = new ParamImpl<Float>('F', 0X20070105, "NCLRATE3");

   ParamImpl<Float> F_NCLRATE4 = new ParamImpl<Float>('F', 0X20070106, "NCLRATE4");

   ParamImpl<Float> F_NCLRATE5 = new ParamImpl<Float>('F', 0X20070107, "NCLRATE5");

   ParamImpl<Long> L_NCLINTDET = new ParamImpl<Long>('L', 0X20070108, "NCLINTDET");

   ParamImpl<Float> F_NCLDAC = new ParamImpl<Float>('F', 0X20070109, "NCLDAC");

   ParamImpl<Float> F_NCLRATE6 = new ParamImpl<Float>('F', 0X2007010, "NCLRATE6");

   ParamImpl<Float> F_NCLRATE7 = new ParamImpl<Float>('F', 0X2007010, "NCLRATE7");

   ParamImpl<Float> F_NCLRATE8 = new ParamImpl<Float>('F', 0X2007010, "NCLRATE8");

   ParamImpl<Float> F_NCLRATE9 = new ParamImpl<Float>('F', 0X2007010, "NCLRATE9");

   ParamImpl<Float> F_NCLCDE = new ParamImpl<Float>('F', 0X2007010, "NCLCDE");

   ParamImpl<Float> F_NCLWCDE = new ParamImpl<Float>('F', 0X2007010, "NCLWCDE");

   ParamImpl<Float> F_NCLICRP2F2 = new ParamImpl<Float>('F', 0X20070110, "NCLICRP2F2");

   ParamImpl<Float> F_NCLEFAEPD = new ParamImpl<Float>('F', 0X20070111, "NCLEFAEPD");

   ParamImpl<Float> F_NCLORGMASS = new ParamImpl<Float>('F', 0X20070112, "NCLORGMASS");

   ParamImpl<String> T_NCLORGNAME = new ParamImpl<String>('T', 0X20070113, "NCLORGNAME");

   ParamImpl<Date> X_NCLHLEFFWB = new ParamImpl<Date>('X', 0X20070114, "NCLHLEFFWB");

   ParamImpl<String> T_NCLHLUNWB = new ParamImpl<String>('T', 0X20070115, "NCLHLUNWB");

   ParamImpl<Float> F_NCLMPBWB = new ParamImpl<Float>('F', 0X20070116, "NCLMPBWB");

   ParamImpl<Float> F_NCLADLMTWB = new ParamImpl<Float>('F', 0X20070117, "NCLADLMTWB");

   ParamImpl<Float> F_NCLINPOWARN1 = new ParamImpl<Float>('F', 0X20070118, "NCLINPOWARN1");

   ParamImpl<Float> F_NCLINPOWARN2 = new ParamImpl<Float>('F', 0X20070119, "NCLINPOWARN2");

   ParamImpl<Float> F_NCLFRUPWB = new ParamImpl<Float>('F', 0X2007011, "NCLFRUPWB");

   ParamImpl<Date> X_NCLHLEFFCO = new ParamImpl<Date>('X', 0X2007011, "NCLHLEFFCO");

   ParamImpl<String> T_NCLHLUNCO = new ParamImpl<String>('T', 0X2007011, "NCLHLUNCO");

   ParamImpl<Float> F_NCLCDG = new ParamImpl<Float>('F', 0X2007011, "NCLCDG");

   ParamImpl<Float> F_NCLCDB = new ParamImpl<Float>('F', 0X2007011, "NCLCDB");

   ParamImpl<Float> F_NCLCDL = new ParamImpl<Float>('F', 0X2007011, "NCLCDL");

   ParamImpl<Float> F_NCLCDM = new ParamImpl<Float>('F', 0X20070120, "NCLCDM");

   ParamImpl<Float> F_NCLCDS = new ParamImpl<Float>('F', 0X20070121, "NCLCDS");

   ParamImpl<Float> F_NCLCDT = new ParamImpl<Float>('F', 0X20070122, "NCLCDT");

   ParamImpl<Float> F_NCLCDR = new ParamImpl<Float>('F', 0X20070123, "NCLCDR");

   ParamImpl<Object> V_LIBF_NOSORT = new ParamImpl<Object>('V', 0X00000000, "LIBF_NOSORT");

   ParamImpl<Object> M_LIBF_NOSORT = new ParamImpl<Object>('M', 0X00000001, "LIBF_NOSORT");

   ParamImpl<Object> V_NIDF_NID = new ParamImpl<Object>('V', 0X00000000, "NIDF_NID");

   ParamImpl<Object> M_NIDF_NID = new ParamImpl<Object>('M', 0X00000001, "NIDF_NID");

   ParamImpl<Object> V_NIDF_MDA = new ParamImpl<Object>('V', 0X00000001, "NIDF_MDA");

   ParamImpl<Object> M_NIDF_MDA = new ParamImpl<Object>('M', 0X00000002, "NIDF_MDA");

   ParamImpl<Object> V_NIDF_INTERF = new ParamImpl<Object>('V', 0X00000002, "NIDF_INTERF");

   ParamImpl<Object> M_NIDF_INTERF = new ParamImpl<Object>('M', 0X00000004, "NIDF_INTERF");

   ParamImpl<Object> V_NIDF_WTMEAN = new ParamImpl<Object>('V', 0X00000003, "NIDF_WTMEAN");

   ParamImpl<Object> M_NIDF_WTMEAN = new ParamImpl<Object>('M', 0X00000008, "NIDF_WTMEAN");

   ParamImpl<Object> V_NIDF_NFLUX = new ParamImpl<Object>('V', 0X00000004, "NIDF_NFLUX");

   ParamImpl<Object> M_NIDF_NFLUX = new ParamImpl<Object>('M', 0X00000010, "NIDF_NFLUX");

   ParamImpl<Object> V_NIDF_NAA = new ParamImpl<Object>('V', 0X00000005, "NIDF_NAA");

   ParamImpl<Object> M_NIDF_NAA = new ParamImpl<Object>('M', 0X00000020, "NIDF_NAA");

   ParamImpl<Object> V_NIDF_SETABUN = new ParamImpl<Object>('V', 0X00000006, "NIDF_SETABUN");

   ParamImpl<Object> M_NIDF_SETABUN = new ParamImpl<Object>('M', 0X00000040, "NIDF_SETABUN");

   ParamImpl<Object> V_NIDF_WBCDOSE = new ParamImpl<Object>('V', 0X00000007, "NIDF_WBCDOSE");

   ParamImpl<Object> M_NIDF_WBCDOSE = new ParamImpl<Object>('M', 0X00000080, "NIDF_WBCDOSE");

   ParamImpl<Object> V_NIDF_EBAR = new ParamImpl<Object>('V', 0X00000008, "NIDF_EBAR");

   ParamImpl<Object> M_NIDF_EBAR = new ParamImpl<Object>('M', 0X00000100, "NIDF_EBAR");

   ParamImpl<Object> V_NIDF_PMTORSO = new ParamImpl<Object>('V', 0X00000009, "NIDF_PMTORSO");

   ParamImpl<Object> M_NIDF_PMTORSO = new ParamImpl<Object>('M', 0X00000200, "NIDF_PMTORSO");

   ParamImpl<Object> V_NIDF_PMLUNGS = new ParamImpl<Object>('V', 0X0000000, "NIDF_PMLUNGS");

   ParamImpl<Object> M_NIDF_PMLUNGS = new ParamImpl<Object>('M', 0X00000400, "NIDF_PMLUNGS");

   ParamImpl<Object> V_NIDF_WBCICRP30 = new ParamImpl<Object>('V', 0X0000000, "NIDF_WBCICRP30");

   ParamImpl<Object> M_NIDF_WBCICRP30 = new ParamImpl<Object>('M', 0X00000800, "NIDF_WBCICRP30");

   ParamImpl<Object> V_NIDF_VARDTCORR = new ParamImpl<Object>('V', 0X0000000, "NIDF_VARDTCORR");

   ParamImpl<Object> M_NIDF_VARDTCORR = new ParamImpl<Object>('M', 0X00001000, "NIDF_VARDTCORR");

   ParamImpl<Object> V_NIDF_PROPAGATE = new ParamImpl<Object>('V', 0X0000000, "NIDF_PROPAGATE");

   ParamImpl<Object> M_NIDF_PROPAGATE = new ParamImpl<Object>('M', 0X00002000, "NIDF_PROPAGATE");

   ParamImpl<Object> V_NIDF_ACTADJ = new ParamImpl<Object>('V', 0X0000000, "NIDF_ACTADJ");

   ParamImpl<Object> M_NIDF_ACTADJ = new ParamImpl<Object>('M', 0X00004000, "NIDF_ACTADJ");

   ParamImpl<Object> V_NIDF_ACTLVL = new ParamImpl<Object>('V', 0X0000000, "NIDF_ACTLVL");

   ParamImpl<Object> M_NIDF_ACTLVL = new ParamImpl<Object>('M', 0X00008000, "NIDF_ACTLVL");

   ParamImpl<Object> V_NIDF_LEV1CONC = new ParamImpl<Object>('V', 0X00000010, "NIDF_LEV1CONC");

   ParamImpl<Object> M_NIDF_LEV1CONC = new ParamImpl<Object>('M', 0X00010000, "NIDF_LEV1CONC");

   ParamImpl<Object> V_NIDF_LEV2CONC = new ParamImpl<Object>('V', 0X00000011, "NIDF_LEV2CONC");

   ParamImpl<Object> M_NIDF_LEV2CONC = new ParamImpl<Object>('M', 0X00020000, "NIDF_LEV2CONC");

   ParamImpl<Object> V_NIDF_CRECOV = new ParamImpl<Object>('V', 0X00000012, "NIDF_CRECOV");

   ParamImpl<Object> M_NIDF_CRECOV = new ParamImpl<Object>('M', 0X00040000, "NIDF_CRECOV");

   ParamImpl<Object> V_NIDF_CSCDONE = new ParamImpl<Object>('V', 0X00000013, "NIDF_CSCDONE");

   ParamImpl<Object> M_NIDF_CSCDONE = new ParamImpl<Object>('M', 0X00080000, "NIDF_CSCDONE");

   ParamImpl<Object> V_NIDF_PDCDONE = new ParamImpl<Object>('V', 0X00000014, "NIDF_PDCDONE");

   ParamImpl<Object> M_NIDF_PDCDONE = new ParamImpl<Object>('M', 0X00100000, "NIDF_PDCDONE");

   ParamImpl<Object> V_NIDF_LACEDONE = new ParamImpl<Object>('V', 0X00000015, "NIDF_LACEDONE");

   ParamImpl<Object> M_NIDF_LACEDONE = new ParamImpl<Object>('M', 0X00200000, "NIDF_LACEDONE");

   ParamImpl<Object> V_NCLF_ACT1ALRM1 = new ParamImpl<Object>('V', 0X00000016, "NCLF_ACT1ALRM1");

   ParamImpl<Object> M_NCLF_ACT1ALRM1 = new ParamImpl<Object>('M', 0X00400000, "NCLF_ACT1ALRM1");

   ParamImpl<Object> V_NCLF_ACT2ALRM1 = new ParamImpl<Object>('V', 0X00000017, "NCLF_ACT2ALRM1");

   ParamImpl<Object> M_NCLF_ACT2ALRM1 = new ParamImpl<Object>('M', 0X00800000, "NCLF_ACT2ALRM1");

   ParamImpl<Object> V_NCLF_ACT1ALRM2 = new ParamImpl<Object>('V', 0X00000018, "NCLF_ACT1ALRM2");

   ParamImpl<Object> M_NCLF_ACT1ALRM2 = new ParamImpl<Object>('M', 0X01000000, "NCLF_ACT1ALRM2");

   ParamImpl<Object> V_NCLF_ACT2ALRM2 = new ParamImpl<Object>('V', 0X00000019, "NCLF_ACT2ALRM2");

   ParamImpl<Object> M_NCLF_ACT2ALRM2 = new ParamImpl<Object>('M', 0X02000000, "NCLF_ACT2ALRM2");

   ParamImpl<Object> V_NIDF_NIDCOMB = new ParamImpl<Object>('V', 0X0000001, "NIDF_NIDCOMB");

   ParamImpl<Object> M_NIDF_NIDCOMB = new ParamImpl<Object>('M', 0X04000000, "NIDF_NIDCOMB");

   ParamImpl<Object> V_NIDF_MGANID = new ParamImpl<Object>('V', 0X0000001, "NIDF_MGANID");

   ParamImpl<Object> M_NIDF_MGANID = new ParamImpl<Object>('M', 0X08000000, "NIDF_MGANID");

   ParamImpl<Object> V_NIDF_MGANIDP = new ParamImpl<Object>('V', 0X0000001, "NIDF_MGANIDP");

   ParamImpl<Object> M_NIDF_MGANIDP = new ParamImpl<Object>('M', 0X10000000, "NIDF_MGANIDP");

   ParamImpl<Object> V_NIDF_ASTMMASS = new ParamImpl<Object>('V', 0X0000001, "NIDF_ASTMMASS");

   ParamImpl<Object> M_NIDF_ASTMMASS = new ParamImpl<Object>('M', 0X20000000, "NIDF_ASTMMASS");

   ParamImpl<Object> V_NIDF_WCDONE = new ParamImpl<Object>('V', 0X0000001, "NIDF_WCDONE");

   ParamImpl<Object> M_NIDF_WCDONE = new ParamImpl<Object>('M', 0X40000000, "NIDF_WCDONE");

   ParamImpl<Object> V_NIDF_NEWRESULTS = new ParamImpl<Object>('V', 0X0000001, "NIDF_NEWRESULTS");

   ParamImpl<Object> M_NIDF_NEWRESULTS = new ParamImpl<Object>('M', 0X80000000, "NIDF_NEWRESULTS");

   ParamImpl<Object> V_NCLF_APPEARS = new ParamImpl<Object>('V', 0X00000000, "NCLF_APPEARS");

   ParamImpl<Object> M_NCLF_APPEARS = new ParamImpl<Object>('M', 0X00000001, "NCLF_APPEARS");

   ParamImpl<Object> V_NCLF_IDENT = new ParamImpl<Object>('V', 0X00000000, "NCLF_IDENT");

   ParamImpl<Object> M_NCLF_IDENT = new ParamImpl<Object>('M', 0X00000001, "NCLF_IDENT");

   ParamImpl<Object> V_NCLF_FDECAY = new ParamImpl<Object>('V', 0X00000001, "NCLF_FDECAY");

   ParamImpl<Object> M_NCLF_FDECAY = new ParamImpl<Object>('M', 0X00000002, "NCLF_FDECAY");

   ParamImpl<Object> V_NCLF_FABUN = new ParamImpl<Object>('V', 0X00000002, "NCLF_FABUN");

   ParamImpl<Object> M_NCLF_FABUN = new ParamImpl<Object>('M', 0X00000004, "NCLF_FABUN");

   ParamImpl<Object> V_NCLF_FWTMEAN = new ParamImpl<Object>('V', 0X00000004, "NCLF_FWTMEAN");

   ParamImpl<Object> M_NCLF_FWTMEAN = new ParamImpl<Object>('M', 0X00000010, "NCLF_FWTMEAN");

   ParamImpl<Object> V_NCLF_MDA = new ParamImpl<Object>('V', 0X00000005, "NCLF_MDA");

   ParamImpl<Object> M_NCLF_MDA = new ParamImpl<Object>('M', 0X00000020, "NCLF_MDA");

   ParamImpl<Object> V_NCLF_KEYOUT = new ParamImpl<Object>('V', 0X00000006, "NCLF_KEYOUT");

   ParamImpl<Object> M_NCLF_KEYOUT = new ParamImpl<Object>('M', 0X00000040, "NCLF_KEYOUT");

   ParamImpl<Object> V_NCLF_SHORTHL = new ParamImpl<Object>('V', 0X00000007, "NCLF_SHORTHL");

   ParamImpl<Object> M_NCLF_SHORTHL = new ParamImpl<Object>('M', 0X00000080, "NCLF_SHORTHL");

   ParamImpl<Object> V_NCLF_SUBHEAD = new ParamImpl<Object>('V', 0X00000008, "NCLF_SUBHEAD");

   ParamImpl<Object> M_NCLF_SUBHEAD = new ParamImpl<Object>('M', 0X00000100, "NCLF_SUBHEAD");

   ParamImpl<Object> V_NCLF_FLUX = new ParamImpl<Object>('V', 0X00000009, "NCLF_FLUX");

   ParamImpl<Object> M_NCLF_FLUX = new ParamImpl<Object>('M', 0X00000200, "NCLF_FLUX");

   ParamImpl<Object> V_NCLF_RPTMDA = new ParamImpl<Object>('V', 0X0000000, "NCLF_RPTMDA");

   ParamImpl<Object> M_NCLF_RPTMDA = new ParamImpl<Object>('M', 0X00000400, "NCLF_RPTMDA");

   ParamImpl<Object> V_NCLF_NORPTMDA = new ParamImpl<Object>('V', 0X0000000, "NCLF_NORPTMDA");

   ParamImpl<Object> M_NCLF_NORPTMDA = new ParamImpl<Object>('M', 0X00000400, "NCLF_NORPTMDA");

   ParamImpl<Object> V_NCLF_EBAR = new ParamImpl<Object>('V', 0X0000000, "NCLF_EBAR");

   ParamImpl<Object> M_NCLF_EBAR = new ParamImpl<Object>('M', 0X00000800, "NCLF_EBAR");

   ParamImpl<Object> V_NCLF_MREJECT = new ParamImpl<Object>('V', 0X0000000, "NCLF_MREJECT");

   ParamImpl<Object> M_NCLF_MREJECT = new ParamImpl<Object>('M', 0X00001000, "NCLF_MREJECT");

   ParamImpl<Object> V_NCLF_MEDIT = new ParamImpl<Object>('V', 0X0000000, "NCLF_MEDIT");

   ParamImpl<Object> M_NCLF_MEDIT = new ParamImpl<Object>('M', 0X00002000, "NCLF_MEDIT");

   ParamImpl<Object> V_NCLF_NOAUTO = new ParamImpl<Object>('V', 0X0000000, "NCLF_NOAUTO");

   ParamImpl<Object> M_NCLF_NOAUTO = new ParamImpl<Object>('M', 0X00004000, "NCLF_NOAUTO");

   ParamImpl<Object> V_NCLF_VARDTCORR = new ParamImpl<Object>('V', 0X0000000, "NCLF_VARDTCORR");

   ParamImpl<Object> M_NCLF_VARDTCORR = new ParamImpl<Object>('M', 0X00008000, "NCLF_VARDTCORR");

   ParamImpl<Object> V_NCLF_MACCEPT = new ParamImpl<Object>('V', 0X00000010, "NCLF_MACCEPT");

   ParamImpl<Object> M_NCLF_MACCEPT = new ParamImpl<Object>('M', 0X00010000, "NCLF_MACCEPT");

   ParamImpl<Object> V_NCLF_NOEBAR = new ParamImpl<Object>('V', 0X00000011, "NCLF_NOEBAR");

   ParamImpl<Object> M_NCLF_NOEBAR = new ParamImpl<Object>('M', 0X00020000, "NCLF_NOEBAR");

   ParamImpl<Object> V_NCLF_INTFREJ = new ParamImpl<Object>('V', 0X00000012, "NCLF_INTFREJ");

   ParamImpl<Object> M_NCLF_INTFREJ = new ParamImpl<Object>('M', 0X00040000, "NCLF_INTFREJ");

   ParamImpl<Object> V_NCLF_NCLFUNRESINT = new ParamImpl<Object>('V', 0X00000013, "NCLF_NCLFUNRESINT");

   ParamImpl<Object> M_NCLF_NCLFUNRESINT = new ParamImpl<Object>('M', 0X00080000, "NCLF_NCLFUNRESINT");

   ParamImpl<Object> V_NCLF_ERRREJ = new ParamImpl<Object>('V', 0X00000014, "NCLF_ERRREJ");

   ParamImpl<Object> M_NCLF_ERRREJ = new ParamImpl<Object>('M', 0X00100000, "NCLF_ERRREJ");

   ParamImpl<Object> V_NCLF_MRLREJ = new ParamImpl<Object>('V', 0X00000015, "NCLF_MRLREJ");

   ParamImpl<Object> M_NCLF_MRLREJ = new ParamImpl<Object>('M', 0X00200000, "NCLF_MRLREJ");

   ParamImpl<Object> V_NCLF_ADJUSTED = new ParamImpl<Object>('V', 0X00000016, "NCLF_ADJUSTED");

   ParamImpl<Object> M_NCLF_ADJUSTED = new ParamImpl<Object>('M', 0X00400000, "NCLF_ADJUSTED");

   ParamImpl<Object> V_NCLF_SABSDONE = new ParamImpl<Object>('V', 0X00000017, "NCLF_SABSDONE");

   ParamImpl<Object> M_NCLF_SABSDONE = new ParamImpl<Object>('M', 0X00800000, "NCLF_SABSDONE");

   ParamImpl<Object> V_NCLF_PDCORRDN = new ParamImpl<Object>('V', 0X00000018, "NCLF_PDCORRDN");

   ParamImpl<Object> M_NCLF_PDCORRDN = new ParamImpl<Object>('M', 0X01000000, "NCLF_PDCORRDN");

   ParamImpl<Object> V_NCLF_USETRU = new ParamImpl<Object>('V', 0X00000019, "NCLF_USETRU");

   ParamImpl<Object> M_NCLF_USETRU = new ParamImpl<Object>('M', 0X02000000, "NCLF_USETRU");

   ParamImpl<Object> V_NCLF_USETAA = new ParamImpl<Object>('V', 0X0000001, "NCLF_USETAA");

   ParamImpl<Object> M_NCLF_USETAA = new ParamImpl<Object>('M', 0X04000000, "NCLF_USETAA");

   ParamImpl<Object> V_NCLF_WIPP = new ParamImpl<Object>('V', 0X0000001, "NCLF_WIPP");

   ParamImpl<Object> M_NCLF_WIPP = new ParamImpl<Object>('M', 0X08000000, "NCLF_WIPP");

   ParamImpl<Object> V_NCLF_USEASFID = new ParamImpl<Object>('V', 0X0000001, "NCLF_USEASFID");

   ParamImpl<Object> M_NCLF_USEASFID = new ParamImpl<Object>('M', 0X10000000, "NCLF_USEASFID");

   ParamImpl<Object> V_NCLF_USEISO = new ParamImpl<Object>('V', 0X0000001, "NCLF_USEISO");

   ParamImpl<Object> M_NCLF_USEISO = new ParamImpl<Object>('M', 0X20000000, "NCLF_USEISO");

   ParamImpl<Object> V_NCLF_LACED = new ParamImpl<Object>('V', 0X0000001, "NCLF_LACED");

   ParamImpl<Object> M_NCLF_LACED = new ParamImpl<Object>('M', 0X40000000, "NCLF_LACED");

   ParamImpl<Object> V_NCLF_LCKEYREJ = new ParamImpl<Object>('V', 0X0000001, "NCLF_LCKEYREJ");

   ParamImpl<Object> M_NCLF_LCKEYREJ = new ParamImpl<Object>('M', 0X80000000, "NCLF_LCKEYREJ");

   ParamImpl<Object> V_NCLF2_LCSINGREJ = new ParamImpl<Object>('V', 0X0000000, "NCLF2_LCSINGREJ");

   ParamImpl<Object> M_NCLF2_LCSINGREJ = new ParamImpl<Object>('M', 0X00001000, "NCLF2_LCSINGREJ");

   ParamImpl<Object> V_NCLF2_CANDIDATE = new ParamImpl<Object>('V', 0X0000000, "NCLF2_CANDIDATE");

   ParamImpl<Object> M_NCLF2_CANDIDATE = new ParamImpl<Object>('M', 0X00004000, "NCLF2_CANDIDATE");

   ParamImpl<Float> F_NLENERGY = new ParamImpl<Float>('F', 0X20080002, "NLENERGY");

   ParamImpl<Float> F_NLABUN = new ParamImpl<Float>('F', 0X20080003, "NLABUN");

   ParamImpl<Long> L_NLPEAK = new ParamImpl<Long>('L', 0X20080004, "NLPEAK");

   ParamImpl<Object> G_NLACTVTY = new ParamImpl<Object>('G', 0X20080005, "NLACTVTY");

   ParamImpl<Object> G_NLERR = new ParamImpl<Object>('G', 0X20080006, "NLERR");

   ParamImpl<Long> L_NLNUCL = new ParamImpl<Long>('L', 0X20080007, "NLNUCL");

   ParamImpl<Long> L_NLFLAGS = new ParamImpl<Long>('L', 0X20080008, "NLFLAGS");

   ParamImpl<Long> L_NLHOME = new ParamImpl<Long>('L', 0X20080009, "NLHOME");

   ParamImpl<Long> L_NLSESC = new ParamImpl<Long>('L', 0X2008000, "NLSESC");

   ParamImpl<Long> L_NLDESC = new ParamImpl<Long>('L', 0X2008000, "NLDESC");

   ParamImpl<Long> L_NLBCKSCTR = new ParamImpl<Long>('L', 0X2008000, "NLBCKSCTR");

   ParamImpl<Long> L_NLCOMPTON = new ParamImpl<Long>('L', 0X2008000, "NLCOMPTON");

   ParamImpl<Long> L_NLSUM = new ParamImpl<Long>('L', 0X2008000, "NLSUM");

   ParamImpl<Float> F_NLSP1 = new ParamImpl<Float>('F', 0X2008000, "NLSP1");

   ParamImpl<Long> L_NLFPHOTO = new ParamImpl<Long>('L', 0X20080011, "NLFPHOTO");

   ParamImpl<Long> L_NLFKEYLINE = new ParamImpl<Long>('L', 0X20080012, "NLFKEYLINE");

   ParamImpl<Long> L_NLFACCSUM = new ParamImpl<Long>('L', 0X20080013, "NLFACCSUM");

   ParamImpl<Long> L_NLFCOINSUM = new ParamImpl<Long>('L', 0X20080014, "NLFCOINSUM");

   ParamImpl<Long> L_NLFBACKGND = new ParamImpl<Long>('L', 0X20080015, "NLFBACKGND");

   ParamImpl<Long> L_NLFBCKSCTR = new ParamImpl<Long>('L', 0X20080016, "NLFBCKSCTR");

   ParamImpl<Long> L_NLFCOMPTON = new ParamImpl<Long>('L', 0X20080017, "NLFCOMPTON");

   ParamImpl<Long> L_NLFSESC = new ParamImpl<Long>('L', 0X20080018, "NLFSESC");

   ParamImpl<Long> L_NLFDESC = new ParamImpl<Long>('L', 0X20080019, "NLFDESC");

   ParamImpl<Long> L_NLFIDENT = new ParamImpl<Long>('L', 0X2008001, "NLFIDENT");

   ParamImpl<Long> L_NLFWTMEAN = new ParamImpl<Long>('L', 0X2008001, "NLFWTMEAN");

   ParamImpl<String> T_NLECUNITS = new ParamImpl<String>('T', 0X2008001, "NLECUNITS");

   ParamImpl<Float> F_NLECCNV = new ParamImpl<Float>('F', 0X2008001, "NLECCNV");

   ParamImpl<Float> F_NLECCNVFAC = new ParamImpl<Float>('F', 0X2008001, "NLECCNVFAC");

   ParamImpl<Float> F_NLCONST = new ParamImpl<Float>('F', 0X2008001, "NLCONST");

   ParamImpl<Float> F_NLCONSTERR = new ParamImpl<Float>('F', 0X2008001, "NLCONSTERR");

   ParamImpl<Float> F_NLCONC = new ParamImpl<Float>('F', 0X20080020, "NLCONC");

   ParamImpl<Float> F_NLCONCERR = new ParamImpl<Float>('F', 0X20080021, "NLCONCERR");

   ParamImpl<Float> F_NLSUMWGTDATA = new ParamImpl<Float>('F', 0X20080022, "NLSUMWGTDATA");

   ParamImpl<Float> F_NLSUMWGTS = new ParamImpl<Float>('F', 0X20080023, "NLSUMWGTS");

   ParamImpl<String> T_NLCONCUNITS = new ParamImpl<String>('T', 0X20080024, "NLCONCUNITS");

   ParamImpl<Object> G_NLMDA = new ParamImpl<Object>('G', 0X20080025, "NLMDA");

   ParamImpl<Float> F_NLMDABKGND = new ParamImpl<Float>('F', 0X20080026, "NLMDABKGND");

   ParamImpl<Float> F_NLEFFICIENCY = new ParamImpl<Float>('F', 0X20080027, "NLEFFICIENCY");

   ParamImpl<Float> F_NLEFFERR = new ParamImpl<Float>('F', 0X20080028, "NLEFFERR");

   ParamImpl<Float> F_NLABUNERR = new ParamImpl<Float>('F', 0X20080029, "NLABUNERR");

   ParamImpl<Float> F_NLENGERR = new ParamImpl<Float>('F', 0X2008002, "NLENGERR");

   ParamImpl<Long> L_NLFFINTERF = new ParamImpl<Long>('L', 0X2008002, "NLFFINTERF");

   ParamImpl<Float> F_NLMDAERR = new ParamImpl<Float>('F', 0X2008002, "NLMDAERR");

   ParamImpl<String> T_NLPEAKORIGIN = new ParamImpl<String>('T', 0X2008002, "NLPEAKORIGIN");

   ParamImpl<Long> L_NLFNOUSEWTM = new ParamImpl<Long>('L', 0X2008002, "NLFNOUSEWTM");

   ParamImpl<Object> G_NLDETLIMIT = new ParamImpl<Object>('G', 0X2008002, "NLDETLIMIT");

   ParamImpl<Object> G_NLNUCSMIN = new ParamImpl<Object>('G', 0X20080030, "NLNUCSMIN");

   ParamImpl<Long> L_NLCORRACT = new ParamImpl<Long>('L', 0X20080031, "NLCORRACT");

   ParamImpl<Object> G_NLNUCSMAX = new ParamImpl<Object>('G', 0X20080032, "NLNUCSMAX");

   ParamImpl<Float> F_NLMDABKGERR = new ParamImpl<Float>('F', 0X20080033, "NLMDABKGERR");

   ParamImpl<Float> F_NLMDANET = new ParamImpl<Float>('F', 0X20080034, "NLMDANET");

   ParamImpl<Float> F_NLMDANETERR = new ParamImpl<Float>('F', 0X20080035, "NLMDANETERR");

   ParamImpl<Float> F_NLMDADECLVL = new ParamImpl<Float>('F', 0X20080036, "NLMDADECLVL");

   ParamImpl<Long> L_NLMDALREGST = new ParamImpl<Long>('L', 0X20080037, "NLMDALREGST");

   ParamImpl<Long> L_NLMDALREGEND = new ParamImpl<Long>('L', 0X20080038, "NLMDALREGEND");

   ParamImpl<Long> L_NLMDARREGST = new ParamImpl<Long>('L', 0X20080039, "NLMDARREGST");

   ParamImpl<Long> L_NLMDARREGEND = new ParamImpl<Long>('L', 0X2008003, "NLMDARREGEND");

   ParamImpl<Long> L_NLFUSEBCK = new ParamImpl<Long>('L', 0X2008003, "NLFUSEBCK");

   ParamImpl<Float> F_NLCOICF = new ParamImpl<Float>('F', 0X2008003, "NLCOICF");

   ParamImpl<Float> F_NLCOIDCF = new ParamImpl<Float>('F', 0X2008003, "NLCOIDCF");

   ParamImpl<Float> F_NLDCOICF = new ParamImpl<Float>('F', 0X2008003, "NLDCOICF");

   ParamImpl<Long> L_NLCOIAPP = new ParamImpl<Long>('L', 0X2008003, "NLCOIAPP");

   ParamImpl<Long> L_NLCOINOTI = new ParamImpl<Long>('L', 0X2008003, "NLCOINOTI");

   ParamImpl<Float> F_NLLCWMRAT = new ParamImpl<Float>('F', 0X20080040, "NLLCWMRAT");

   ParamImpl<Float> F_NLLCWMRATERR = new ParamImpl<Float>('F', 0X20080041, "NLLCWMRATERR");

   ParamImpl<Float> F_NLLCKLRAT = new ParamImpl<Float>('F', 0X20080042, "NLLCKLRAT");

   ParamImpl<Float> F_NLLCKLRATERR = new ParamImpl<Float>('F', 0X20080043, "NLLCKLRATERR");

   ParamImpl<Long> L_NLAGAUSED = new ParamImpl<Long>('L', 0X20080044, "NLAGAUSED");

   ParamImpl<Object> V_NLF_PHOTO = new ParamImpl<Object>('V', 0X00000001, "NLF_PHOTO");

   ParamImpl<Object> M_NLF_PHOTO = new ParamImpl<Object>('M', 0X00000002, "NLF_PHOTO");

   ParamImpl<Object> V_NLF_KEYLINE = new ParamImpl<Object>('V', 0X00000002, "NLF_KEYLINE");

   ParamImpl<Object> M_NLF_KEYLINE = new ParamImpl<Object>('M', 0X00000004, "NLF_KEYLINE");

   ParamImpl<Object> V_NLF_ACCSUM = new ParamImpl<Object>('V', 0X00000003, "NLF_ACCSUM");

   ParamImpl<Object> M_NLF_ACCSUM = new ParamImpl<Object>('M', 0X00000008, "NLF_ACCSUM");

   ParamImpl<Object> V_NLF_COINSUM = new ParamImpl<Object>('V', 0X00000004, "NLF_COINSUM");

   ParamImpl<Object> M_NLF_COINSUM = new ParamImpl<Object>('M', 0X00000010, "NLF_COINSUM");

   ParamImpl<Object> V_NLF_BACKGND = new ParamImpl<Object>('V', 0X00000005, "NLF_BACKGND");

   ParamImpl<Object> M_NLF_BACKGND = new ParamImpl<Object>('M', 0X00000020, "NLF_BACKGND");

   ParamImpl<Object> V_NLF_BCKSCTR = new ParamImpl<Object>('V', 0X00000006, "NLF_BCKSCTR");

   ParamImpl<Object> M_NLF_BCKSCTR = new ParamImpl<Object>('M', 0X00000040, "NLF_BCKSCTR");

   ParamImpl<Object> V_NLF_COMPTON = new ParamImpl<Object>('V', 0X00000007, "NLF_COMPTON");

   ParamImpl<Object> M_NLF_COMPTON = new ParamImpl<Object>('M', 0X00000080, "NLF_COMPTON");

   ParamImpl<Object> V_NLF_SESC = new ParamImpl<Object>('V', 0X00000008, "NLF_SESC");

   ParamImpl<Object> M_NLF_SESC = new ParamImpl<Object>('M', 0X00000100, "NLF_SESC");

   ParamImpl<Object> V_NLF_DESC = new ParamImpl<Object>('V', 0X00000009, "NLF_DESC");

   ParamImpl<Object> M_NLF_DESC = new ParamImpl<Object>('M', 0X00000200, "NLF_DESC");

   ParamImpl<Object> V_NLF_IDENT = new ParamImpl<Object>('V', 0X0000000, "NLF_IDENT");

   ParamImpl<Object> M_NLF_IDENT = new ParamImpl<Object>('M', 0X00000400, "NLF_IDENT");

   ParamImpl<Object> V_NLF_FWTMEAN = new ParamImpl<Object>('V', 0X0000000, "NLF_FWTMEAN");

   ParamImpl<Object> M_NLF_FWTMEAN = new ParamImpl<Object>('M', 0X00000800, "NLF_FWTMEAN");

   ParamImpl<Object> V_NLF_FINTERF = new ParamImpl<Object>('V', 0X0000000, "NLF_FINTERF");

   ParamImpl<Object> M_NLF_FINTERF = new ParamImpl<Object>('M', 0X00001000, "NLF_FINTERF");

   ParamImpl<Object> V_NLF_ELOUT = new ParamImpl<Object>('V', 0X0000000, "NLF_ELOUT");

   ParamImpl<Object> M_NLF_ELOUT = new ParamImpl<Object>('M', 0X00002000, "NLF_ELOUT");

   ParamImpl<Object> V_NLF_MDA = new ParamImpl<Object>('V', 0X0000000, "NLF_MDA");

   ParamImpl<Object> M_NLF_MDA = new ParamImpl<Object>('M', 0X00004000, "NLF_MDA");

   ParamImpl<Object> V_NLF_OUTOFRNG = new ParamImpl<Object>('V', 0X0000000, "NLF_OUTOFRNG");

   ParamImpl<Object> M_NLF_OUTOFRNG = new ParamImpl<Object>('M', 0X00008000, "NLF_OUTOFRNG");

   ParamImpl<Object> V_NLF_WTMINTREJ = new ParamImpl<Object>('V', 0X00000010, "NLF_WTMINTREJ");

   ParamImpl<Object> M_NLF_WTMINTREJ = new ParamImpl<Object>('M', 0X00010000, "NLF_WTMINTREJ");

   ParamImpl<Object> V_NLF_NOUSEWTM = new ParamImpl<Object>('V', 0X00000011, "NLF_NOUSEWTM");

   ParamImpl<Object> M_NLF_NOUSEWTM = new ParamImpl<Object>('M', 0X00020000, "NLF_NOUSEWTM");

   ParamImpl<Object> V_NLF_NLCORRACT = new ParamImpl<Object>('V', 0X00000012, "NLF_NLCORRACT");

   ParamImpl<Object> M_NLF_NLCORRACT = new ParamImpl<Object>('M', 0X00040000, "NLF_NLCORRACT");

   ParamImpl<Object> V_NLF_USEBCK = new ParamImpl<Object>('V', 0X00000013, "NLF_USEBCK");

   ParamImpl<Object> M_NLF_USEBCK = new ParamImpl<Object>('M', 0X00080000, "NLF_USEBCK");

   ParamImpl<Object> V_NLF_COIAPPLIED = new ParamImpl<Object>('V', 0X00000014, "NLF_COIAPPLIED");

   ParamImpl<Object> M_NLF_COIAPPLIED = new ParamImpl<Object>('M', 0X00100000, "NLF_COIAPPLIED");

   ParamImpl<Object> V_NLF_COINOTINVLVD = new ParamImpl<Object>('V', 0X00000015, "NLF_COINOTINVLVD");

   ParamImpl<Object> M_NLF_COINOTINVLVD = new ParamImpl<Object>('M', 0X00200000, "NLF_COINOTINVLVD");

   ParamImpl<Object> V_NLF_LACED = new ParamImpl<Object>('V', 0X00000016, "NLF_LACED");

   ParamImpl<Object> M_NLF_LACED = new ParamImpl<Object>('M', 0X00400000, "NLF_LACED");

   ParamImpl<Object> V_NLF_AGA = new ParamImpl<Object>('V', 0X00000017, "NLF_AGA");

   ParamImpl<Object> M_NLF_AGA = new ParamImpl<Object>('M', 0X00800000, "NLF_AGA");

   ParamImpl<String> T_ACTIVUNITS = new ParamImpl<String>('T', 0X20030002, "ACTIVUNITS");

   ParamImpl<Float> F_ACTIVMULT = new ParamImpl<Float>('F', 0X20030003, "ACTIVMULT");

   ParamImpl<Long> L_PROCFLAGS = new ParamImpl<Long>('L', 0X20030004, "PROCFLAGS");

   ParamImpl<Float> F_SENSITVTY = new ParamImpl<Float>('F', 0X20030005, "SENSITVTY");

   ParamImpl<Float> F_GSENSITVTY = new ParamImpl<Float>('F', 0X20030006, "GSENSITVTY");

   ParamImpl<Long> L_ITERATIONS = new ParamImpl<Long>('L', 0X20030007, "ITERATIONS");

   ParamImpl<Long> L_PEAKSTART = new ParamImpl<Long>('L', 0X20030008, "PEAKSTART");

   ParamImpl<Long> L_PEAKEND = new ParamImpl<Long>('L', 0X20030009, "PEAKEND");

   ParamImpl<Float> F_HALFLIFERAT = new ParamImpl<Float>('F', 0X2003000, "HALFLIFERAT");

   ParamImpl<Float> F_ABUNDANLIM = new ParamImpl<Float>('F', 0X2003000, "ABUNDANLIM");

   ParamImpl<Float> F_TOLERANCE = new ParamImpl<Float>('F', 0X2003000, "TOLERANCE");

   ParamImpl<String> T_DOSEUNITS = new ParamImpl<String>('T', 0X2003000, "DOSEUNITS");

   ParamImpl<Float> F_DOSEMULT = new ParamImpl<Float>('F', 0X2003000, "DOSEMULT");

   ParamImpl<Float> F_WBCDIL = new ParamImpl<Float>('F', 0X2003000, "WBCDIL");

   ParamImpl<Long> L_PRFIT = new ParamImpl<Long>('L', 0X20030010, "PRFIT");

   ParamImpl<Float> F_WTMLIMIT = new ParamImpl<Float>('F', 0X20030011, "WTMLIMIT");

   ParamImpl<Float> F_VPWIDTH = new ParamImpl<Float>('F', 0X20030012, "VPWIDTH");

   ParamImpl<Float> F_MDACONFID = new ParamImpl<Float>('F', 0X20030013, "MDACONFID");

   ParamImpl<Long> L_PRVARDT = new ParamImpl<Long>('L', 0X20030014, "PRVARDT");

   ParamImpl<Long> L_PRCOLLTIME = new ParamImpl<Long>('L', 0X20030015, "PRCOLLTIME");

   ParamImpl<Float> F_PRSP1 = new ParamImpl<Float>('F', 0X20030016, "PRSP1");

   ParamImpl<Float> F_PRSP2 = new ParamImpl<Float>('F', 0X20030017, "PRSP2");

   ParamImpl<Float> F_PRSP3 = new ParamImpl<Float>('F', 0X20030018, "PRSP3");

   ParamImpl<Long> L_NSIGMA = new ParamImpl<Long>('L', 0X20030019, "NSIGMA");

   ParamImpl<Float> F_RSENSITVTY = new ParamImpl<Float>('F', 0X2003001, "RSENSITVTY");

   ParamImpl<Float> F_CHISENSITVTY = new ParamImpl<Float>('F', 0X2003001, "CHISENSITVTY");

   ParamImpl<Float> F_SUMSENSITVTY = new ParamImpl<Float>('F', 0X2003001, "SUMSENSITVTY");

   ParamImpl<Long> L_DOALPHA = new ParamImpl<Long>('L', 0X2003001, "DOALPHA");

   ParamImpl<Long> L_CRITLEVEL = new ParamImpl<Long>('L', 0X2003001, "CRITLEVEL");

   ParamImpl<Long> L_PROPAGATE = new ParamImpl<Long>('L', 0X2003001, "PROPAGATE");

   ParamImpl<Long> L_MSCHANS = new ParamImpl<Long>('L', 0X20030020, "MSCHANS");

   ParamImpl<Float> F_SECSENS = new ParamImpl<Float>('F', 0X20030021, "SECSENS");

   ParamImpl<Long> L_DOLIBEFF = new ParamImpl<Long>('L', 0X20030022, "DOLIBEFF");

   ParamImpl<Long> L_PRKEYLINE = new ParamImpl<Long>('L', 0X20030023, "PRKEYLINE");

   ParamImpl<Long> L_PRLLDCONST = new ParamImpl<Long>('L', 0X20030024, "PRLLDCONST");

   ParamImpl<Long> L_PRCALCMDA = new ParamImpl<Long>('L', 0X20030025, "PRCALCMDA");

   ParamImpl<Long> L_PRNBKCHN = new ParamImpl<Long>('L', 0X20030026, "PRNBKCHN");

   ParamImpl<String> T_ROIPSTYP = new ParamImpl<String>('T', 0X20030027, "ROIPSTYP");

   ParamImpl<String> T_ROIPSBTYP = new ParamImpl<String>('T', 0X20030028, "ROIPSBTYP");

   ParamImpl<Float> F_SQUANTMULT = new ParamImpl<Float>('F', 0X20030029, "SQUANTMULT");

   ParamImpl<String> T_GAINSHIFT = new ParamImpl<String>('T', 0X2003002, "GAINSHIFT");

   ParamImpl<String> T_WEIGHTING = new ParamImpl<String>('T', 0X2003002, "WEIGHTING");

   ParamImpl<Float> F_SIGMAREJ = new ParamImpl<Float>('F', 0X2003002, "SIGMAREJ");

   ParamImpl<Long> L_CALCWGT = new ParamImpl<Long>('L', 0X2003002, "CALCWGT");

   ParamImpl<Long> L_THRSHFT = new ParamImpl<Long>('L', 0X2003002, "THRSHFT");

   ParamImpl<String> T_PSTYPE = new ParamImpl<String>('T', 0X2003002, "PSTYPE");

   ParamImpl<Long> L_ANALCNT = new ParamImpl<Long>('L', 0X20030030, "ANALCNT");

   ParamImpl<Long> L_INCREP = new ParamImpl<Long>('L', 0X20030031, "INCREP");

   ParamImpl<String> T_LIBNAME = new ParamImpl<String>('T', 0X20030032, "LIBNAME");

   ParamImpl<Float> F_AREAWIND1 = new ParamImpl<Float>('F', 0X20030033, "AREAWIND1");

   ParamImpl<Float> F_AREAWIND2 = new ParamImpl<Float>('F', 0X20030034, "AREAWIND2");

   ParamImpl<Float> F_INTFWIND1 = new ParamImpl<Float>('F', 0X20030035, "INTFWIND1");

   ParamImpl<Float> F_INTFWIND2 = new ParamImpl<Float>('F', 0X20030036, "INTFWIND2");

   ParamImpl<Float> F_OVERWIND1 = new ParamImpl<Float>('F', 0X20030037, "OVERWIND1");

   ParamImpl<Float> F_OVERWIND2 = new ParamImpl<Float>('F', 0X20030038, "OVERWIND2");

   ParamImpl<Long> L_NBACKTERMS = new ParamImpl<Long>('L', 0X20030039, "NBACKTERMS");

   ParamImpl<Float> F_BACKREJ = new ParamImpl<Float>('F', 0X2003003, "BACKREJ");

   ParamImpl<Float> F_VARREJ = new ParamImpl<Float>('F', 0X2003003, "VARREJ");

   ParamImpl<Long> L_MAXGAINPASS = new ParamImpl<Long>('L', 0X2003003, "MAXGAINPASS");

   ParamImpl<Float> F_GAINREJ = new ParamImpl<Float>('F', 0X2003003, "GAINREJ");

   ParamImpl<Float> F_REJMDASIG = new ParamImpl<Float>('F', 0X2003003, "REJMDASIG");

   ParamImpl<Float> F_REJMDACONST = new ParamImpl<Float>('F', 0X2003003, "REJMDACONST");

   ParamImpl<Float> F_UNIDETOL = new ParamImpl<Float>('F', 0X20030040, "UNIDETOL");

   ParamImpl<Float> F_UNIDREJ = new ParamImpl<Float>('F', 0X20030041, "UNIDREJ");

   ParamImpl<Float> F_UNIDCONST = new ParamImpl<Float>('F', 0X20030042, "UNIDCONST");

   ParamImpl<Long> L_MPCTYPE = new ParamImpl<Long>('L', 0X20030043, "MPCTYPE");

   ParamImpl<Float> F_LOCSMTH = new ParamImpl<Float>('F', 0X20030044, "LOCSMTH");

   ParamImpl<Float> F_MULTSMTH = new ParamImpl<Float>('F', 0X20030045, "MULTSMTH");

   ParamImpl<Long> L_PASTART = new ParamImpl<Long>('L', 0X20030046, "PASTART");

   ParamImpl<Long> L_PAEND = new ParamImpl<Long>('L', 0X20030047, "PAEND");

   ParamImpl<Float> F_CONFID = new ParamImpl<Float>('F', 0X20030048, "CONFID");

   ParamImpl<Float> F_SIGMA = new ParamImpl<Float>('F', 0X20030049, "SIGMA");

   ParamImpl<Float> F_REFENG = new ParamImpl<Float>('F', 0X2003004, "REFENG");

   ParamImpl<Float> F_REFRATE = new ParamImpl<Float>('F', 0X2003004, "REFRATE");

   ParamImpl<Float> F_DREFRATE = new ParamImpl<Float>('F', 0X2003004, "DREFRATE");

   ParamImpl<Date> X_REFDATE = new ParamImpl<Date>('X', 0X2003004, "REFDATE");

   ParamImpl<Date> X_REFHLF = new ParamImpl<Date>('X', 0X2003004, "REFHLF");

   ParamImpl<String> T_REFHLFUNITS = new ParamImpl<String>('T', 0X2003004, "REFHLFUNITS");

   ParamImpl<Long> L_PRGAINSHFT = new ParamImpl<Long>('L', 0X20030050, "PRGAINSHFT");

   ParamImpl<Long> L_PRSYSERRDTL = new ParamImpl<Long>('L', 0X20030051, "PRSYSERRDTL");

   ParamImpl<Long> L_PRREFCORR = new ParamImpl<Long>('L', 0X20030052, "PRREFCORR");

   ParamImpl<String> T_BUILDUPTYPE = new ParamImpl<String>('T', 0X20030053, "BUILDUPTYPE");

   ParamImpl<Long> L_PRENBNEGAR = new ParamImpl<Long>('L', 0X20030054, "PRENBNEGAR");

   ParamImpl<Long> L_PRROIPSMID = new ParamImpl<Long>('L', 0X20030055, "PRROIPSMID");

   ParamImpl<Float> F_ECALTOL = new ParamImpl<Float>('F', 0X20030056, "ECALTOL");

   ParamImpl<Float> F_VARTOLERANCE = new ParamImpl<Float>('F', 0X20030057, "VARTOLERANCE");

   ParamImpl<Float> F_VARECALTOL = new ParamImpl<Float>('F', 0X20030058, "VARECALTOL");

   ParamImpl<Long> L_USEVARETOL = new ParamImpl<Long>('L', 0X20030059, "USEVARETOL");

   ParamImpl<Long> L_DOSCOLEFF = new ParamImpl<Long>('L', 0X2003005, "DOSCOLEFF");

   ParamImpl<Long> L_DOCHEMYIELD = new ParamImpl<Long>('L', 0X2003005, "DOCHEMYIELD");

   ParamImpl<Float> F_PWARNFIT = new ParamImpl<Float>('F', 0X2003005, "PWARNFIT");

   ParamImpl<Float> F_PWARNACT = new ParamImpl<Float>('F', 0X2003005, "PWARNACT");

   ParamImpl<Float> F_DOSETIME = new ParamImpl<Float>('F', 0X2003005, "DOSETIME");

   ParamImpl<Float> F_ECALSMOOTH = new ParamImpl<Float>('F', 0X2003005, "ECALSMOOTH");

   ParamImpl<Float> F_MGAFCDABS = new ParamImpl<Float>('F', 0X20030060, "MGAFCDABS");

   ParamImpl<Long> L_PRMGAFIXCD = new ParamImpl<Long>('L', 0X20030061, "PRMGAFIXCD");

   ParamImpl<Float> F_MGAFPUABS = new ParamImpl<Float>('F', 0X20030062, "MGAFPUABS");

   ParamImpl<Long> L_PRMGAFIXPU = new ParamImpl<Long>('L', 0X20030063, "PRMGAFIXPU");

   ParamImpl<Long> L_PRMGASAM241 = new ParamImpl<Long>('L', 0X20030064, "PRMGASAM241");

   ParamImpl<Long> L_PRMGAUSELOW = new ParamImpl<Long>('L', 0X20030065, "PRMGAUSELOW");

   ParamImpl<Long> L_PRMGAUPRES = new ParamImpl<Long>('L', 0X20030066, "PRMGAUPRES");

   ParamImpl<String> T_MGAPU242TYP = new ParamImpl<String>('T', 0X20030067, "MGAPU242TYP");

   ParamImpl<Float> F_MGADECPU242 = new ParamImpl<Float>('F', 0X20030068, "MGADECPU242");

   ParamImpl<Date> X_MGARCTOCHEM = new ParamImpl<Date>('X', 0X20030069, "MGARCTOCHEM");

   ParamImpl<Long> L_SHOWROIS = new ParamImpl<Long>('L', 0X2003006, "SHOWROIS");

   ParamImpl<Float> F_WBCDOSECOMIT = new ParamImpl<Float>('F', 0X2003006, "WBCDOSECOMIT");

   ParamImpl<Long> L_PRDOUSERPL = new ParamImpl<Long>('L', 0X2003006, "PRDOUSERPL");

   ParamImpl<Long> L_PRFWHMREJ = new ParamImpl<Long>('L', 0X2003006, "PRFWHMREJ");

   ParamImpl<Float> F_FWHMREJRATIO = new ParamImpl<Float>('F', 0X2003006, "FWHMREJRATIO");

   ParamImpl<Long> L_PRFIXFWHM = new ParamImpl<Long>('L', 0X2003006, "PRFIXFWHM");

   ParamImpl<Long> L_PARENTWDGT = new ParamImpl<Long>('L', 0X20030070, "PARENTWDGT");

   ParamImpl<String> T_PLOTSCALE = new ParamImpl<String>('T', 0X20030071, "PLOTSCALE");

   ParamImpl<Long> L_SHOWROIMCA = new ParamImpl<Long>('L', 0X20030072, "SHOWROIMCA");

   ParamImpl<Long> L_ENERGYFLTR = new ParamImpl<Long>('L', 0X20030073, "ENERGYFLTR");

   ParamImpl<Float> F_ENERGYPKFLTR = new ParamImpl<Float>('F', 0X20030074, "ENERGYPKFLTR");

   ParamImpl<Long> L_NUCLFLTR = new ParamImpl<Long>('L', 0X20030075, "NUCLFLTR");

   ParamImpl<Long> L_CHISQFLTR = new ParamImpl<Long>('L', 0X20030076, "CHISQFLTR");

   ParamImpl<String> T_NUCLPKFLTR = new ParamImpl<String>('T', 0X20030077, "NUCLPKFLTR");

   ParamImpl<Float> F_CHISQPKFLTR = new ParamImpl<Float>('F', 0X20030078, "CHISQPKFLTR");

   ParamImpl<Long> L_FWRATFLTR = new ParamImpl<Long>('L', 0X20030079, "FWRATFLTR");

   ParamImpl<Float> F_FWRATPKFLTR = new ParamImpl<Float>('F', 0X2003007, "FWRATPKFLTR");

   ParamImpl<Long> L_MLTPLTPKFLTR = new ParamImpl<Long>('L', 0X2003007, "MLTPLTPKFLTR");

   ParamImpl<Long> L_NOFLTR = new ParamImpl<Long>('L', 0X2003007, "NOFLTR");

   ParamImpl<Long> L_PROCFLAGS2 = new ParamImpl<Long>('L', 0X2003007, "PROCFLAGS2");

   ParamImpl<Long> L_PRERRREJ = new ParamImpl<Long>('L', 0X2003007, "PRERRREJ");

   ParamImpl<Long> L_PRMRLREJ = new ParamImpl<Long>('L', 0X2003007, "PRMRLREJ");

   ParamImpl<Long> L_PRMINMDA = new ParamImpl<Long>('L', 0X20030080, "PRMINMDA");

   ParamImpl<Long> L_PRRPTCL = new ParamImpl<Long>('L', 0X20030081, "PRRPTCL");

   ParamImpl<Float> F_MDAADDCONST = new ParamImpl<Float>('F', 0X20030082, "MDAADDCONST");

   ParamImpl<Float> F_MDAMULTCONST = new ParamImpl<Float>('F', 0X20030083, "MDAMULTCONST");

   ParamImpl<Long> L_USEMDACONSTS = new ParamImpl<Long>('L', 0X20030084, "USEMDACONSTS");

   ParamImpl<Long> L_DOUNKSRCH = new ParamImpl<Long>('L', 0X20030085, "DOUNKSRCH");

   ParamImpl<Long> L_DISACQDECAY = new ParamImpl<Long>('L', 0X20030086, "DISACQDECAY");

   ParamImpl<String> T_PRSSP1 = new ParamImpl<String>('T', 0X20030087, "PRSSP1");

   ParamImpl<String> T_PRSSP2 = new ParamImpl<String>('T', 0X20030088, "PRSSP2");

   ParamImpl<String> T_PRSSP3 = new ParamImpl<String>('T', 0X20030089, "PRSSP3");

   ParamImpl<String> T_PRPUMUNITS = new ParamImpl<String>('T', 0X2003008, "PRPUMUNITS");

   ParamImpl<Float> F_PRPUMCF = new ParamImpl<Float>('F', 0X2003008, "PRPUMCF");

   ParamImpl<Float> F_PRNEUTSFTMLL = new ParamImpl<Float>('F', 0X2003008, "PRNEUTSFTMLL");

   ParamImpl<Float> F_NEUTT2GNSIG = new ParamImpl<Float>('F', 0X2003008, "NEUTT2GNSIG");

   ParamImpl<Float> F_NEUTT2GTMLL = new ParamImpl<Float>('F', 0X2003008, "NEUTT2GTMLL");

   ParamImpl<Long> L_PRNONEUTBC = new ParamImpl<Long>('L', 0X2003008, "PRNONEUTBC");

   ParamImpl<Float> F_PRNEURNSIGMA = new ParamImpl<Float>('F', 0X20030090, "PRNEURNSIGMA");

   ParamImpl<String> T_PRNEUTISOSRC = new ParamImpl<String>('T', 0X20030091, "PRNEUTISOSRC");

   ParamImpl<Long> L_PRNERRMLIM = new ParamImpl<Long>('L', 0X20030092, "PRNERRMLIM");

   ParamImpl<Long> L_PRNEUTDOMC = new ParamImpl<Long>('L', 0X20030093, "PRNEUTDOMC");

   ParamImpl<Long> L_SHELLHNDL = new ParamImpl<Long>('L', 0X20030094, "SHELLHNDL");

   ParamImpl<String> T_SADCHAR = new ParamImpl<String>('T', 0X20030095, "SADCHAR");

   ParamImpl<String> T_PRMGAANALTYP = new ParamImpl<String>('T', 0X20030096, "PRMGAANALTYP");

   ParamImpl<Long> L_PRMGAFIXPB = new ParamImpl<Long>('L', 0X20030097, "PRMGAFIXPB");

   ParamImpl<Long> L_PRMGANSPEC = new ParamImpl<Long>('L', 0X20030098, "PRMGANSPEC");

   ParamImpl<Long> L_PRMGAAMHETRO = new ParamImpl<Long>('L', 0X20030099, "PRMGAAMHETRO");

   ParamImpl<String> T_PRVOLUNITS = new ParamImpl<String>('T', 0X2003009, "PRVOLUNITS");

   ParamImpl<Float> F_PRNEUTNSIGMA = new ParamImpl<Float>('F', 0X2003009, "PRNEUTNSIGMA");

   ParamImpl<Long> L_PRDOINTERF = new ParamImpl<Long>('L', 0X2003009, "PRDOINTERF");

   ParamImpl<Float> F_PRVOLCF = new ParamImpl<Float>('F', 0X2003009, "PRVOLCF");

   ParamImpl<String> T_PRDENSUNITS = new ParamImpl<String>('T', 0X2003009, "PRDENSUNITS");

   ParamImpl<Float> F_PRDENSCF = new ParamImpl<Float>('F', 0X2003009, "PRDENSCF");

   ParamImpl<Float> F_PRDPRATERLIM = new ParamImpl<Float>('F', 0X200300, "PRDPRATERLIM");

   ParamImpl<Float> F_PRTRRATERLIM = new ParamImpl<Float>('F', 0X200300, "PRTRRATERLIM");

   ParamImpl<Float> F_PRP2AFAILOVR = new ParamImpl<Float>('F', 0X200300, "PRP2AFAILOVR");

   ParamImpl<String> T_PRCOMBMATMOD = new ParamImpl<String>('T', 0X200300, "PRCOMBMATMOD");

   ParamImpl<Date> X_PRNEUTPRDATE = new ParamImpl<Date>('X', 0X200300, "PRNEUTPRDATE");

   ParamImpl<Long> L_PRNEUTAIST2G = new ParamImpl<Long>('L', 0X200300, "PRNEUTAIST2G");

   ParamImpl<Long> L_PRCLRB4ACQ = new ParamImpl<Long>('L', 0X200300, "PRCLRB4ACQ");

   ParamImpl<Long> L_PRNEUTUSETOT = new ParamImpl<Long>('L', 0X200300, "PRNEUTUSETOT");

   ParamImpl<Long> L_PRNEUTFITZZ = new ParamImpl<Long>('L', 0X200300, "PRNEUTFITZZ");

   ParamImpl<Long> L_PRNEUTMLT1OK = new ParamImpl<Long>('L', 0X200300, "PRNEUTMLT1OK");

   ParamImpl<Float> F_PRNEUTT2GPLM = new ParamImpl<Float>('F', 0X200300, "PRNEUTT2GPLM");

   ParamImpl<Float> F_PRMGAMINCNTS = new ParamImpl<Float>('F', 0X200300, "PRMGAMINCNTS");

   ParamImpl<Float> F_PRMGALEDETLM = new ParamImpl<Float>('F', 0X200300, "PRMGALEDETLM");

   ParamImpl<Float> F_PRMGAHEDETLM = new ParamImpl<Float>('F', 0X200300, "PRMGAHEDETLM");

   ParamImpl<Float> F_PRMGAUCALFAC = new ParamImpl<Float>('F', 0X200300, "PRMGAUCALFAC");

   ParamImpl<Long> L_PRUSEROIFILE = new ParamImpl<Long>('L', 0X200300, "PRUSEROIFILE");

   ParamImpl<Float> F_PRFWHMPKMULT = new ParamImpl<Float>('F', 0X200300, "PRFWHMPKMULT");

   ParamImpl<Float> F_PRFWHMPKLEFT = new ParamImpl<Float>('F', 0X200300, "PRFWHMPKLEFT");

   ParamImpl<Float> F_PRFWHMPKRGHT = new ParamImpl<Float>('F', 0X200300, "PRFWHMPKRGHT");

   ParamImpl<Long> L_PRREJECT0PKS = new ParamImpl<Long>('L', 0X200300, "PRREJECT0PKS");

   ParamImpl<Long> L_PRVARYLTAIL = new ParamImpl<Long>('L', 0X200300, "PRVARYLTAIL");

   ParamImpl<Long> L_PRADDPKRES = new ParamImpl<Long>('L', 0X200300, "PRADDPKRES");

   ParamImpl<Float> F_PRTRACERAMT = new ParamImpl<Float>('F', 0X200300, "PRTRACERAMT");

   ParamImpl<Long> L_PRSAXFRNOXTR = new ParamImpl<Long>('L', 0X200300, "PRSAXFRNOXTR");

   ParamImpl<Float> F_PRMINPEAKSEP = new ParamImpl<Float>('F', 0X200300, "PRMINPEAKSEP");

   ParamImpl<Long> L_PRDORESID = new ParamImpl<Long>('L', 0X200300, "PRDORESID");

   ParamImpl<Long> L_PRLEVUSEMDA = new ParamImpl<Long>('L', 0X200300, "PRLEVUSEMDA");

   ParamImpl<Long> L_PRLEVBOUNDS = new ParamImpl<Long>('L', 0X200300, "PRLEVBOUNDS");

   ParamImpl<Float> F_PRLEV1ALARM1 = new ParamImpl<Float>('F', 0X200300, "PRLEV1ALARM1");

   ParamImpl<Float> F_PRLEV1ALARM2 = new ParamImpl<Float>('F', 0X200300, "PRLEV1ALARM2");

   ParamImpl<Float> F_PRLEV2ALARM1 = new ParamImpl<Float>('F', 0X200300, "PRLEV2ALARM1");

   ParamImpl<Float> F_PRLEV2ALARM2 = new ParamImpl<Float>('F', 0X200300, "PRLEV2ALARM2");

   ParamImpl<Long> L_PROCFLAGS3 = new ParamImpl<Long>('L', 0X200300, "PROCFLAGS3");

   ParamImpl<Long> L_PRDOMDATEST = new ParamImpl<Long>('L', 0X200300, "PRDOMDATEST");

   ParamImpl<Long> L_PRUSEVBKCHN = new ParamImpl<Long>('L', 0X200300, "PRUSEVBKCHN");

   ParamImpl<Float> F_PRVBKCHN = new ParamImpl<Float>('F', 0X200300, "PRVBKCHN");

   ParamImpl<Long> L_PRUSEVPWIDTH = new ParamImpl<Long>('L', 0X200300, "PRUSEVPWIDTH");

   ParamImpl<Long> L_PRMGAALWAYS = new ParamImpl<Long>('L', 0X200300, "PRMGAALWAYS");

   ParamImpl<Long> L_PRCOMBAVE = new ParamImpl<Long>('L', 0X200300, "PRCOMBAVE");

   ParamImpl<String> T_PRMGAREFNUCL = new ParamImpl<String>('T', 0X200300, "PRMGAREFNUCL");

   ParamImpl<Long> L_PRSHIFTSTART = new ParamImpl<Long>('L', 0X200300, "PRSHIFTSTART");

   ParamImpl<Long> L_PRSHIFTCHANS = new ParamImpl<Long>('L', 0X200300, "PRSHIFTCHANS");

   ParamImpl<Long> L_PRSSNOSHIFT = new ParamImpl<Long>('L', 0X200300, "PRSSNOSHIFT");

   ParamImpl<Long> L_PRSSNOLTCORR = new ParamImpl<Long>('L', 0X200300, "PRSSNOLTCORR");

   ParamImpl<Long> L_PRSSSERIAL = new ParamImpl<Long>('L', 0X200300, "PRSSSERIAL");

   ParamImpl<String> T_PRMGAAVEPEAK = new ParamImpl<String>('T', 0X200300, "PRMGAAVEPEAK");

   ParamImpl<String> T_PRNEFFTYPE = new ParamImpl<String>('T', 0X200300, "PRNEFFTYPE");

   ParamImpl<String> T_PRSSLTCTYPE = new ParamImpl<String>('T', 0X200300, "PRSSLTCTYPE");

   ParamImpl<Float> F_PRNUDSENERG = new ParamImpl<Float>('F', 0X200300, "PRNUDSENERG");

   ParamImpl<String> T_PRNUDSNUCL = new ParamImpl<String>('T', 0X200300, "PRNUDSNUCL");

   ParamImpl<Float> F_PRT2AFAILOVR = new ParamImpl<Float>('F', 0X200300, "PRT2AFAILOVR");

   ParamImpl<Float> F_PRMINTRANS = new ParamImpl<Float>('F', 0X200300, "PRMINTRANS");

   ParamImpl<Long> L_PRMGANOABORT = new ParamImpl<Long>('L', 0X200300, "PRMGANOABORT");

   ParamImpl<Long> L_PRMGAUUSEMGA = new ParamImpl<Long>('L', 0X200300, "PRMGAUUSEMGA");

   ParamImpl<Float> F_PRKEDBLIMLL = new ParamImpl<Float>('F', 0X200300, "PRKEDBLIMLL");

   ParamImpl<Float> F_PRKEDBLIMLU = new ParamImpl<Float>('F', 0X200300, "PRKEDBLIMLU");

   ParamImpl<Float> F_PRKEDBLIMUL = new ParamImpl<Float>('F', 0X200300, "PRKEDBLIMUL");

   ParamImpl<Float> F_PRKEDBLIMUU = new ParamImpl<Float>('F', 0X200300, "PRKEDBLIMUU");

   ParamImpl<Float> F_PRKEDREF1ENG = new ParamImpl<Float>('F', 0X200300, "PRKEDREF1ENG");

   ParamImpl<Float> F_PRKEDREF2ENG = new ParamImpl<Float>('F', 0X200300, "PRKEDREF2ENG");

   ParamImpl<Float> F_PRKEDNORMENG = new ParamImpl<Float>('F', 0X200300, "PRKEDNORMENG");

   ParamImpl<String> T_PRKEDELEMNT1 = new ParamImpl<String>('T', 0X200300, "PRKEDELEMNT1");

   ParamImpl<String> T_PRKEDELEMNT2 = new ParamImpl<String>('T', 0X200300, "PRKEDELEMNT2");

   ParamImpl<Float> F_PRKEDMUNORM1 = new ParamImpl<Float>('F', 0X200300, "PRKEDMUNORM1");

   ParamImpl<Float> F_PRKEDMUNORM2 = new ParamImpl<Float>('F', 0X200300, "PRKEDMUNORM2");

   ParamImpl<Float> F_PRKEDDCL235 = new ParamImpl<Float>('F', 0X200300, "PRKEDDCL235");

   ParamImpl<Float> F_PRKEDDPUAWT = new ParamImpl<Float>('F', 0X200300, "PRKEDDPUAWT");

   ParamImpl<Float> F_PRKEDDNORMV = new ParamImpl<Float>('F', 0X200300, "PRKEDDNORMV");

   ParamImpl<Float> F_PRKEDKEDE1 = new ParamImpl<Float>('F', 0X200300, "PRKEDKEDE1");

   ParamImpl<Float> F_PRKEDKEDE2 = new ParamImpl<Float>('F', 0X200300, "PRKEDKEDE2");

   ParamImpl<Float> F_PRKEDFTLL1 = new ParamImpl<Float>('F', 0X200300, "PRKEDFTLL1");

   ParamImpl<Float> F_PRKEDFTLU1 = new ParamImpl<Float>('F', 0X200300, "PRKEDFTLU1");

   ParamImpl<Float> F_PRKEDFTUL1 = new ParamImpl<Float>('F', 0X200300, "PRKEDFTUL1");

   ParamImpl<Float> F_PRKEDFTUU1 = new ParamImpl<Float>('F', 0X200300, "PRKEDFTUU1");

   ParamImpl<Float> F_PRKEDFTLL2 = new ParamImpl<Float>('F', 0X200300, "PRKEDFTLL2");

   ParamImpl<Float> F_PRKEDFTLU2 = new ParamImpl<Float>('F', 0X200300, "PRKEDFTLU2");

   ParamImpl<Float> F_PRKEDFTUL2 = new ParamImpl<Float>('F', 0X200300, "PRKEDFTUL2");

   ParamImpl<Float> F_PRKEDFTUU2 = new ParamImpl<Float>('F', 0X200300, "PRKEDFTUU2");

   ParamImpl<Long> L_NEUTMULTI = new ParamImpl<Long>('L', 0X200300, "NEUTMULTI");

   ParamImpl<Long> L_NEUTDOALPHA = new ParamImpl<Long>('L', 0X200300, "NEUTDOALPHA");

   ParamImpl<Long> L_NEUTDOMFACT = new ParamImpl<Long>('L', 0X200300, "NEUTDOMFACT");

   ParamImpl<Long> L_NEUTDOEFF = new ParamImpl<Long>('L', 0X200300, "NEUTDOEFF");

   ParamImpl<Float> F_PRNMFLOWLIM = new ParamImpl<Float>('F', 0X200300, "PRNMFLOWLIM");

   ParamImpl<Float> F_PRNMFHIGHLIM = new ParamImpl<Float>('F', 0X200300, "PRNMFHIGHLIM");

   ParamImpl<Float> F_PRNEUTALPHA = new ParamImpl<Float>('F', 0X200300, "PRNEUTALPHA");

   ParamImpl<Float> F_PRNEUTMFACT = new ParamImpl<Float>('F', 0X200300, "PRNEUTMFACT");

   ParamImpl<Long> L_NEUTDOSDTAVG = new ParamImpl<Long>('L', 0X200300, "NEUTDOSDTAVG");

   ParamImpl<Float> F_PRREFPKETOL = new ParamImpl<Float>('F', 0X200300, "PRREFPKETOL");

   ParamImpl<Long> L_NEUTUSEKEFF = new ParamImpl<Long>('L', 0X200300, "NEUTUSEKEFF");

   ParamImpl<Long> L_PRNOREFPEAK = new ParamImpl<Long>('L', 0X200300, "PRNOREFPEAK");

   ParamImpl<Long> L_PRNOBACKCOR = new ParamImpl<Long>('L', 0X200300, "PRNOBACKCOR");

   ParamImpl<Long> L_NEUTDOEALPHA = new ParamImpl<Long>('L', 0X200300, "NEUTDOEALPHA");

   ParamImpl<Long> L_NEUTDOEMFACT = new ParamImpl<Long>('L', 0X200300, "NEUTDOEMFACT");

   ParamImpl<Float> F_PRNEUTALPHER = new ParamImpl<Float>('F', 0X200300, "PRNEUTALPHER");

   ParamImpl<Float> F_PRNEUTMFACER = new ParamImpl<Float>('F', 0X200300, "PRNEUTMFACER");

   ParamImpl<Float> F_PRNEUTEFF = new ParamImpl<Float>('F', 0X20030100, "PRNEUTEFF");

   ParamImpl<Float> F_PRNEUTEFFER = new ParamImpl<Float>('F', 0X20030101, "PRNEUTEFFER");

   ParamImpl<Long> L_PRCOMBAVENOW = new ParamImpl<Long>('L', 0X20030102, "PRCOMBAVENOW");

   ParamImpl<Long> L_PRMGAUMGAOUT = new ParamImpl<Long>('L', 0X20030103, "PRMGAUMGAOUT");

   ParamImpl<Long> L_PRNEUTDOMCD = new ParamImpl<Long>('L', 0X20030104, "PRNEUTDOMCD");

   ParamImpl<Long> L_PRNEUTUSERE = new ParamImpl<Long>('L', 0X20030105, "PRNEUTUSERE");

   ParamImpl<Long> L_PRMGAUMODE = new ParamImpl<Long>('L', 0X20030106, "PRMGAUMODE");

   ParamImpl<Float> F_PRMGAU235FCT = new ParamImpl<Float>('F', 0X20030107, "PRMGAU235FCT");

   ParamImpl<Float> F_PRMGAU238FCT = new ParamImpl<Float>('F', 0X20030108, "PRMGAU238FCT");

   ParamImpl<Float> F_PRMGAUFE = new ParamImpl<Float>('F', 0X20030109, "PRMGAUFE");

   ParamImpl<Float> F_PRMGAUFEDENS = new ParamImpl<Float>('F', 0X2003010, "PRMGAUFEDENS");

   ParamImpl<Float> F_PRMGAUAL = new ParamImpl<Float>('F', 0X2003010, "PRMGAUAL");

   ParamImpl<Long> L_PRMGAU186SR = new ParamImpl<Long>('L', 0X2003010, "PRMGAU186SR");

   ParamImpl<Float> F_PRMGAU93PKRT = new ParamImpl<Float>('F', 0X2003010, "PRMGAU93PKRT");

   ParamImpl<Float> F_PRMGAU122FW = new ParamImpl<Float>('F', 0X2003010, "PRMGAU122FW");

   ParamImpl<Float> F_PRMGAU208SEN = new ParamImpl<Float>('F', 0X2003010, "PRMGAU208SEN");

   ParamImpl<Float> F_PRUENRICH = new ParamImpl<Float>('F', 0X20030110, "PRUENRICH");

   ParamImpl<Float> F_PRUENRICHERR = new ParamImpl<Float>('F', 0X20030111, "PRUENRICHERR");

   ParamImpl<Long> L_PRCNUCMAXMTR = new ParamImpl<Long>('L', 0X20030112, "PRCNUCMAXMTR");

   ParamImpl<Float> F_PRCNUCTHRHO = new ParamImpl<Float>('F', 0X20030113, "PRCNUCTHRHO");

   ParamImpl<Float> F_PRCNUCCONFID = new ParamImpl<Float>('F', 0X20030114, "PRCNUCCONFID");

   ParamImpl<Float> F_PRCNUCNSIGMA = new ParamImpl<Float>('F', 0X20030115, "PRCNUCNSIGMA");

   ParamImpl<Float> F_PRCNUCERRPCT = new ParamImpl<Float>('F', 0X20030116, "PRCNUCERRPCT");

   ParamImpl<Long> L_PRCNUCEFFLIB = new ParamImpl<Long>('L', 0X20030117, "PRCNUCEFFLIB");

   ParamImpl<Long> L_PRCNUCUSEINT = new ParamImpl<Long>('L', 0X20030118, "PRCNUCUSEINT");

   ParamImpl<Long> L_PRCNUCOPTALL = new ParamImpl<Long>('L', 0X20030119, "PRCNUCOPTALL");

   ParamImpl<Long> L_PRCNUCMEARHO = new ParamImpl<Long>('L', 0X2003011, "PRCNUCMEARHO");

   ParamImpl<Long> L_PRCNUCANGEFF = new ParamImpl<Long>('L', 0X2003011, "PRCNUCANGEFF");

   ParamImpl<Long> L_PRCNUCUNIEFF = new ParamImpl<Long>('L', 0X2003011, "PRCNUCUNIEFF");

   ParamImpl<Float> F_PRCNUCSTRNEN = new ParamImpl<Float>('F', 0X2003011, "PRCNUCSTRNEN");

   ParamImpl<Long> L_PROCFLAGS4 = new ParamImpl<Long>('L', 0X2003011, "PROCFLAGS4");

   ParamImpl<Float> F_PRCNUCACTERR = new ParamImpl<Float>('F', 0X2003011, "PRCNUCACTERR");

   ParamImpl<Long> L_PRCNUCUSEMAX = new ParamImpl<Long>('L', 0X20030120, "PRCNUCUSEMAX");

   ParamImpl<Long> L_PRCNUCUSEMIN = new ParamImpl<Long>('L', 0X20030121, "PRCNUCUSEMIN");

   ParamImpl<Long> L_PRCNUCUSEAVG = new ParamImpl<Long>('L', 0X20030122, "PRCNUCUSEAVG");

   ParamImpl<Long> L_PRCNUCUSENON = new ParamImpl<Long>('L', 0X20030123, "PRCNUCUSENON");

   ParamImpl<Long> L_PRCAASREJECT = new ParamImpl<Long>('L', 0X20030124, "PRCAASREJECT");

   ParamImpl<Float> F_PRCONTROLVOL = new ParamImpl<Float>('F', 0X20030125, "PRCONTROLVOL");

   ParamImpl<Long> L_PRCNUCCTREFF = new ParamImpl<Long>('L', 0X20030126, "PRCNUCCTREFF");

   ParamImpl<Float> F_PRNMMASS = new ParamImpl<Float>('F', 0X20030127, "PRNMMASS");

   ParamImpl<Float> F_PRNMMASSERR = new ParamImpl<Float>('F', 0X20030128, "PRNMMASSERR");

   ParamImpl<Float> F_PRNMALOWLIM = new ParamImpl<Float>('F', 0X20030129, "PRNMALOWLIM");

   ParamImpl<Float> F_PRNMAHIGHLIM = new ParamImpl<Float>('F', 0X2003012, "PRNMAHIGHLIM");

   ParamImpl<Float> F_PRCNUCFFACT = new ParamImpl<Float>('F', 0X2003012, "PRCNUCFFACT");

   ParamImpl<Float> F_PRNEUTAASNSI = new ParamImpl<Float>('F', 0X2003012, "PRNEUTAASNSI");

   ParamImpl<Long> L_PRNEUTTRUNCM = new ParamImpl<Long>('L', 0X2003012, "PRNEUTTRUNCM");

   ParamImpl<Long> L_PRNEUTTRUNCL = new ParamImpl<Long>('L', 0X2003012, "PRNEUTTRUNCL");

   ParamImpl<String> T_SABSEQTYPE = new ParamImpl<String>('T', 0X2003012, "SABSEQTYPE");

   ParamImpl<Long> L_SABSMINPK = new ParamImpl<Long>('L', 0X20030130, "SABSMINPK");

   ParamImpl<Float> F_SABSBETAM = new ParamImpl<Float>('F', 0X20030131, "SABSBETAM");

   ParamImpl<Float> F_SABSALPHAM = new ParamImpl<Float>('F', 0X20030132, "SABSALPHAM");

   ParamImpl<Long> L_GROUPCENT = new ParamImpl<Long>('L', 0X20030133, "GROUPCENT");

   ParamImpl<Float> F_PRCAASRBRF = new ParamImpl<Float>('F', 0X20030134, "PRCAASRBRF");

   ParamImpl<Float> F_PRCAASRBRFER = new ParamImpl<Float>('F', 0X20030135, "PRCAASRBRFER");

   ParamImpl<Long> L_PRFORCEROI = new ParamImpl<Long>('L', 0X20030136, "PRFORCEROI");

   ParamImpl<Float> F_PRVROIWIDTH = new ParamImpl<Float>('F', 0X20030137, "PRVROIWIDTH");

   ParamImpl<Long> L_PRCHECKADJPK = new ParamImpl<Long>('L', 0X20030138, "PRCHECKADJPK");

   ParamImpl<Long> L_PRLROIBYENG = new ParamImpl<Long>('L', 0X20030139, "PRLROIBYENG");

   ParamImpl<Long> L_PRNOMCONSTT = new ParamImpl<Long>('L', 0X2003013, "PRNOMCONSTT");

   ParamImpl<String> T_PREFFDENSTYP = new ParamImpl<String>('T', 0X2003013, "PREFFDENSTYP");

   ParamImpl<Long> L_PRCSCTYPE = new ParamImpl<Long>('L', 0X2003013, "PRCSCTYPE");

   ParamImpl<Date> X_PRAMSEPLIMIT = new ParamImpl<Date>('X', 0X2003013, "PRAMSEPLIMIT");

   ParamImpl<Float> F_PRMGAMAXNQF = new ParamImpl<Float>('F', 0X2003013, "PRMGAMAXNQF");

   ParamImpl<Float> F_PRMAX122FWHM = new ParamImpl<Float>('F', 0X2003013, "PRMAX122FWHM");

   ParamImpl<Float> F_PRMAXMGAPUER = new ParamImpl<Float>('F', 0X20030140, "PRMAXMGAPUER");

   ParamImpl<Float> F_PRMAXDT = new ParamImpl<Float>('F', 0X20030141, "PRMAXDT");

   ParamImpl<Float> F_PRMINPU239 = new ParamImpl<Float>('F', 0X20030142, "PRMINPU239");

   ParamImpl<Float> F_PRMAXPU239 = new ParamImpl<Float>('F', 0X20030143, "PRMAXPU239");

   ParamImpl<Long> L_PRCHKFIDUTST = new ParamImpl<Long>('L', 0X20030144, "PRCHKFIDUTST");

   ParamImpl<String> T_PRFIDUPEAKS = new ParamImpl<String>('T', 0X20030145, "PRFIDUPEAKS");

   ParamImpl<String> T_PRCFFIDUPKS = new ParamImpl<String>('T', 0X20030146, "PRCFFIDUPKS");

   ParamImpl<String> T_PRCMFIDUPKS = new ParamImpl<String>('T', 0X20030147, "PRCMFIDUPKS");

   ParamImpl<Float> F_PRAASCORERR = new ParamImpl<Float>('F', 0X20030148, "PRAASCORERR");

   ParamImpl<Float> F_PRNMAXMFAC1 = new ParamImpl<Float>('F', 0X20030149, "PRNMAXMFAC1");

   ParamImpl<Float> F_PRNMAXMFAC2 = new ParamImpl<Float>('F', 0X2003014, "PRNMAXMFAC2");

   ParamImpl<Float> F_PRHZREALS = new ParamImpl<Float>('F', 0X2003014, "PRHZREALS");

   ParamImpl<Float> F_PRAASCFCTOF1 = new ParamImpl<Float>('F', 0X2003014, "PRAASCFCTOF1");

   ParamImpl<Float> F_PRAASCFCTOF2 = new ParamImpl<Float>('F', 0X2003014, "PRAASCFCTOF2");

   ParamImpl<Float> F_PRLLWLIM = new ParamImpl<Float>('F', 0X2003014, "PRLLWLIM");

   ParamImpl<Float> F_PRNMAXRMIN = new ParamImpl<Float>('F', 0X2003014, "PRNMAXRMIN");

   ParamImpl<Float> F_PRNMINRMAX = new ParamImpl<Float>('F', 0X20030150, "PRNMINRMAX");

   ParamImpl<Float> F_PRNRMAXFAC1 = new ParamImpl<Float>('F', 0X20030151, "PRNRMAXFAC1");

   ParamImpl<Float> F_PRNRMAXFAC2 = new ParamImpl<Float>('F', 0X20030152, "PRNRMAXFAC2");

   ParamImpl<Float> F_PRNRMINFAC1 = new ParamImpl<Float>('F', 0X20030153, "PRNRMINFAC1");

   ParamImpl<Float> F_PRNRMINFAC2 = new ParamImpl<Float>('F', 0X20030154, "PRNRMINFAC2");

   ParamImpl<Float> F_PRWCFAC = new ParamImpl<Float>('F', 0X20030155, "PRWCFAC");

   ParamImpl<Float> F_PRAASERRLIM = new ParamImpl<Float>('F', 0X20030156, "PRAASERRLIM");

   ParamImpl<Float> F_PR414129LIM = new ParamImpl<Float>('F', 0X20030157, "PR414129LIM");

   ParamImpl<Float> F_PRGMATRIXERR = new ParamImpl<Float>('F', 0X20030158, "PRGMATRIXERR");

   ParamImpl<Float> F_PRLUMPFAC1 = new ParamImpl<Float>('F', 0X20030159, "PRLUMPFAC1");

   ParamImpl<Float> F_PRLUMPFAC2 = new ParamImpl<Float>('F', 0X2003015, "PRLUMPFAC2");

   ParamImpl<Float> F_PRMAXGPUMASS = new ParamImpl<Float>('F', 0X2003015, "PRMAXGPUMASS");

   ParamImpl<Float> F_PRMAXGPU239 = new ParamImpl<Float>('F', 0X2003015, "PRMAXGPU239");

   ParamImpl<Float> F_PRMAXGUMASS = new ParamImpl<Float>('F', 0X2003015, "PRMAXGUMASS");

   ParamImpl<Float> F_PRMAXGU233 = new ParamImpl<Float>('F', 0X2003015, "PRMAXGU233");

   ParamImpl<Float> F_PRMAXGU235 = new ParamImpl<Float>('F', 0X2003015, "PRMAXGU235");

   ParamImpl<Float> F_PRGRMAXFAC1 = new ParamImpl<Float>('F', 0X20030160, "PRGRMAXFAC1");

   ParamImpl<Float> F_PRGRMAXFAC2 = new ParamImpl<Float>('F', 0X20030161, "PRGRMAXFAC2");

   ParamImpl<Float> F_PRGRMAXFAC3 = new ParamImpl<Float>('F', 0X20030162, "PRGRMAXFAC3");

   ParamImpl<Float> F_PRGRMINFAC1 = new ParamImpl<Float>('F', 0X20030163, "PRGRMINFAC1");

   ParamImpl<Float> F_PRGRMINFAC2 = new ParamImpl<Float>('F', 0X20030164, "PRGRMINFAC2");

   ParamImpl<Float> F_PRGRMINFAC3 = new ParamImpl<Float>('F', 0X20030165, "PRGRMINFAC3");

   ParamImpl<Float> F_PRMAXDENSITY = new ParamImpl<Float>('F', 0X20030166, "PRMAXDENSITY");

   ParamImpl<Long> L_PRDOAUTOWST = new ParamImpl<Long>('L', 0X20030167, "PRDOAUTOWST");

   ParamImpl<Float> F_PRAASLRGLIM = new ParamImpl<Float>('F', 0X20030168, "PRAASLRGLIM");

   ParamImpl<Float> F_PRAWAHZLIM = new ParamImpl<Float>('F', 0X20030169, "PRAWAHZLIM");

   ParamImpl<Float> F_PRCMCFNSIGMA = new ParamImpl<Float>('F', 0X2003016, "PRCMCFNSIGMA");

   ParamImpl<Float> F_PRNESTOTLIM = new ParamImpl<Float>('F', 0X2003016, "PRNESTOTLIM");

   ParamImpl<Float> F_PRTRUNTOTLIM = new ParamImpl<Float>('F', 0X2003016, "PRTRUNTOTLIM");

   ParamImpl<Float> F_PRAWAP240LIM = new ParamImpl<Float>('F', 0X2003016, "PRAWAP240LIM");

   ParamImpl<Long> L_PRHZFRACKNWN = new ParamImpl<Long>('L', 0X2003016, "PRHZFRACKNWN");

   ParamImpl<Float> F_PRONESNSIGMA = new ParamImpl<Float>('F', 0X2003016, "PRONESNSIGMA");

   ParamImpl<Long> L_PRMMOVERRIDE = new ParamImpl<Long>('L', 0X20030170, "PRMMOVERRIDE");

   ParamImpl<Float> F_PRDDAFLEGLLM = new ParamImpl<Float>('F', 0X20030171, "PRDDAFLEGLLM");

   ParamImpl<Float> F_PRDDAFLEGHLM = new ParamImpl<Float>('F', 0X20030172, "PRDDAFLEGHLM");

   ParamImpl<Float> F_PRDDADEFMI = new ParamImpl<Float>('F', 0X20030173, "PRDDADEFMI");

   ParamImpl<Float> F_PRDDADEFAI = new ParamImpl<Float>('F', 0X20030174, "PRDDADEFAI");

   ParamImpl<Float> F_PRDDAMAXMI = new ParamImpl<Float>('F', 0X20030175, "PRDDAMAXMI");

   ParamImpl<Float> F_PRDDAMINMI = new ParamImpl<Float>('F', 0X20030176, "PRDDAMINMI");

   ParamImpl<Float> F_PRDDATHRMI = new ParamImpl<Float>('F', 0X20030177, "PRDDATHRMI");

   ParamImpl<Float> F_PRDDAMINAI = new ParamImpl<Float>('F', 0X20030178, "PRDDAMINAI");

   ParamImpl<Float> F_PRDDATHRAI = new ParamImpl<Float>('F', 0X20030179, "PRDDATHRAI");

   ParamImpl<Float> F_PRDDADEFAMCF = new ParamImpl<Float>('F', 0X2003017, "PRDDADEFAMCF");

   ParamImpl<Float> F_PRDDASSCTOFF = new ParamImpl<Float>('F', 0X2003017, "PRDDASSCTOFF");

   ParamImpl<Float> F_PRGUDDACTOFF = new ParamImpl<Float>('F', 0X2003017, "PRGUDDACTOFF");

   ParamImpl<Float> F_PR240RSCTOFF = new ParamImpl<Float>('F', 0X2003017, "PR240RSCTOFF");

   ParamImpl<Float> F_PRGFDDACTOFF = new ParamImpl<Float>('F', 0X2003017, "PRGFDDACTOFF");

   ParamImpl<Float> F_PR240SSCTOFF = new ParamImpl<Float>('F', 0X2003017, "PR240SSCTOFF");

   ParamImpl<Float> F_PRDDAMAXAI = new ParamImpl<Float>('F', 0X20030180, "PRDDAMAXAI");

   ParamImpl<String> T_PRTMUISOSRC = new ParamImpl<String>('T', 0X20030181, "PRTMUISOSRC");

   ParamImpl<Float> F_PRDDAMAXRMIN = new ParamImpl<Float>('F', 0X20030182, "PRDDAMAXRMIN");

   ParamImpl<Float> F_PRDDAMINRMAX = new ParamImpl<Float>('F', 0X20030183, "PRDDAMINRMAX");

   ParamImpl<Float> F_PRDDATMUMCA = new ParamImpl<Float>('F', 0X20030184, "PRDDATMUMCA");

   ParamImpl<Float> F_PRDDATMUMCB = new ParamImpl<Float>('F', 0X20030185, "PRDDATMUMCB");

   ParamImpl<Float> F_PRDDATMUMCC = new ParamImpl<Float>('F', 0X20030186, "PRDDATMUMCC");

   ParamImpl<Float> F_PRDDATMUPTA = new ParamImpl<Float>('F', 0X20030187, "PRDDATMUPTA");

   ParamImpl<Float> F_PRDDATMUPTB = new ParamImpl<Float>('F', 0X20030188, "PRDDATMUPTB");

   ParamImpl<Float> F_PRDDATMUPTC = new ParamImpl<Float>('F', 0X20030189, "PRDDATMUPTC");

   ParamImpl<Float> F_PRDDATMUPTD = new ParamImpl<Float>('F', 0X2003018, "PRDDATMUPTD");

   ParamImpl<Float> F_PRDDATMUSSA = new ParamImpl<Float>('F', 0X2003018, "PRDDATMUSSA");

   ParamImpl<Float> F_PRDDATMUSSB = new ParamImpl<Float>('F', 0X2003018, "PRDDATMUSSB");

   ParamImpl<Float> F_PRDDATMUSSM0 = new ParamImpl<Float>('F', 0X2003018, "PRDDATMUSSM0");

   ParamImpl<Long> L_PRDOMGAVCHCK = new ParamImpl<Long>('L', 0X2003018, "PRDOMGAVCHCK");

   ParamImpl<Long> L_PRDOTMUWIPP = new ParamImpl<Long>('L', 0X2003018, "PRDOTMUWIPP");

   ParamImpl<Float> F_PRNBKGARAT = new ParamImpl<Float>('F', 0X20030190, "PRNBKGARAT");

   ParamImpl<Long> L_PRADDEFFERR = new ParamImpl<Long>('L', 0X20030191, "PRADDEFFERR");

   ParamImpl<Float> F_PRNSETIMEADJ = new ParamImpl<Float>('F', 0X20030192, "PRNSETIMEADJ");

   ParamImpl<Long> L_PRNOTRCLAMP = new ParamImpl<Long>('L', 0X20030193, "PRNOTRCLAMP");

   ParamImpl<Long> L_PRTRBKGSUB = new ParamImpl<Long>('L', 0X20030194, "PRTRBKGSUB");

   ParamImpl<Long> L_PRTGSCOLTYPE = new ParamImpl<Long>('L', 0X20030195, "PRTGSCOLTYPE");

   ParamImpl<Float> F_PRTGSCOLLEN = new ParamImpl<Float>('F', 0X20030196, "PRTGSCOLLEN");

   ParamImpl<Float> F_PRTGSCOLDIST = new ParamImpl<Float>('F', 0X20030197, "PRTGSCOLDIST");

   ParamImpl<Float> F_PRTGSCOLWDTH = new ParamImpl<Float>('F', 0X20030198, "PRTGSCOLWDTH");

   ParamImpl<Float> F_PRTGSCOLHGT = new ParamImpl<Float>('F', 0X20030199, "PRTGSCOLHGT");

   ParamImpl<Float> F_PRTGSDETDIAM = new ParamImpl<Float>('F', 0X2003019, "PRTGSDETDIAM");

   ParamImpl<Float> F_PRTGSCOLTRIM = new ParamImpl<Float>('F', 0X2003019, "PRTGSCOLTRIM");

   ParamImpl<Float> F_PRTGSCOLLOFF = new ParamImpl<Float>('F', 0X2003019, "PRTGSCOLLOFF");

   ParamImpl<Float> F_PRTGSLAYERCO = new ParamImpl<Float>('F', 0X2003019, "PRTGSLAYERCO");

   ParamImpl<Float> F_PRMATRIXZ1 = new ParamImpl<Float>('F', 0X2003019, "PRMATRIXZ1");

   ParamImpl<Float> F_PRMATRIXZ1FR = new ParamImpl<Float>('F', 0X2003019, "PRMATRIXZ1FR");

   ParamImpl<Float> F_PRMATRIXZ2 = new ParamImpl<Float>('F', 0X200301, "PRMATRIXZ2");

   ParamImpl<Float> F_PRMATRIXZ2FR = new ParamImpl<Float>('F', 0X200301, "PRMATRIXZ2FR");

   ParamImpl<Float> F_PRMATRIXZ3 = new ParamImpl<Float>('F', 0X200301, "PRMATRIXZ3");

   ParamImpl<Float> F_PRMATRIXZ3FR = new ParamImpl<Float>('F', 0X200301, "PRMATRIXZ3FR");

   ParamImpl<Float> F_PRTGSAREDAMP = new ParamImpl<Float>('F', 0X200301, "PRTGSAREDAMP");

   ParamImpl<Long> L_PRTGSAREITER = new ParamImpl<Long>('L', 0X200301, "PRTGSAREITER");

   ParamImpl<Float> F_PRTGSAREMAXV = new ParamImpl<Float>('F', 0X200301, "PRTGSAREMAXV");

   ParamImpl<Float> F_PRTGSAREMINV = new ParamImpl<Float>('F', 0X200301, "PRTGSAREMINV");

   ParamImpl<Long> L_PRTGSEMEITER = new ParamImpl<Long>('L', 0X200301, "PRTGSEMEITER");

   ParamImpl<Float> F_PRTGSEMEMINV = new ParamImpl<Float>('F', 0X200301, "PRTGSEMEMINV");

   ParamImpl<Float> F_PRTGSARTDAMP = new ParamImpl<Float>('F', 0X200301, "PRTGSARTDAMP");

   ParamImpl<Long> L_PRTGSARTITER = new ParamImpl<Long>('L', 0X200301, "PRTGSARTITER");

   ParamImpl<Float> F_PRTGSARTMAXV = new ParamImpl<Float>('F', 0X200301, "PRTGSARTMAXV");

   ParamImpl<Float> F_PRTGSARTMINV = new ParamImpl<Float>('F', 0X200301, "PRTGSARTMINV");

   ParamImpl<Float> F_PRTGSMINTCPS = new ParamImpl<Float>('F', 0X200301, "PRTGSMINTCPS");

   ParamImpl<Long> L_PRTGSMETHOD = new ParamImpl<Long>('L', 0X200301, "PRTGSMETHOD");

   ParamImpl<Long> L_PRTGSMFEMFIT = new ParamImpl<Long>('L', 0X200301, "PRTGSMFEMFIT");

   ParamImpl<Long> L_PRTGSMFARFIT = new ParamImpl<Long>('L', 0X200301, "PRTGSMFARFIT");

   ParamImpl<Long> L_PRTGSMFL0ZSI = new ParamImpl<Long>('L', 0X200301, "PRTGSMFL0ZSI");

   ParamImpl<Long> L_PRTGSMFNNLSU = new ParamImpl<Long>('L', 0X200301, "PRTGSMFNNLSU");

   ParamImpl<Long> L_PRTGSMFUNILF = new ParamImpl<Long>('L', 0X200301, "PRTGSMFUNILF");

   ParamImpl<Long> L_PRTGSMFUSEAR = new ParamImpl<Long>('L', 0X200301, "PRTGSMFUSEAR");

   ParamImpl<Long> L_PRTGSMFAREFL = new ParamImpl<Long>('L', 0X200301, "PRTGSMFAREFL");

   ParamImpl<Long> L_PRTGSAEFNLB = new ParamImpl<Long>('L', 0X200301, "PRTGSAEFNLB");

   ParamImpl<Long> L_PRTGSAEFNUB = new ParamImpl<Long>('L', 0X200301, "PRTGSAEFNUB");

   ParamImpl<Long> L_PRTGSAEFUCIM = new ParamImpl<Long>('L', 0X200301, "PRTGSAEFUCIM");

   ParamImpl<Long> L_PRTGSAEFRAND = new ParamImpl<Long>('L', 0X200301, "PRTGSAEFRAND");

   ParamImpl<Long> L_PRTGSAEFNOCT = new ParamImpl<Long>('L', 0X200301, "PRTGSAEFNOCT");

   ParamImpl<Long> L_PRTGSAEFSMIN = new ParamImpl<Long>('L', 0X200301, "PRTGSAEFSMIN");

   ParamImpl<Long> L_PRTGSAEFSMAX = new ParamImpl<Long>('L', 0X200301, "PRTGSAEFSMAX");

   ParamImpl<Long> L_PRTGSMFARTFL = new ParamImpl<Long>('L', 0X200301, "PRTGSMFARTFL");

   ParamImpl<Long> L_PRTGSATFNLB = new ParamImpl<Long>('L', 0X200301, "PRTGSATFNLB");

   ParamImpl<Long> L_PRTGSATFNUB = new ParamImpl<Long>('L', 0X200301, "PRTGSATFNUB");

   ParamImpl<Long> L_PRTGSATFUCIM = new ParamImpl<Long>('L', 0X200301, "PRTGSATFUCIM");

   ParamImpl<Long> L_PRTGSATFRAND = new ParamImpl<Long>('L', 0X200301, "PRTGSATFRAND");

   ParamImpl<Long> L_PRTGSATFNOCT = new ParamImpl<Long>('L', 0X200301, "PRTGSATFNOCT");

   ParamImpl<Long> L_PRTGSATFSMIN = new ParamImpl<Long>('L', 0X200301, "PRTGSATFSMIN");

   ParamImpl<Long> L_PRTGSATFSMAX = new ParamImpl<Long>('L', 0X200301, "PRTGSATFSMAX");

   ParamImpl<Float> F_PRMINGPU239 = new ParamImpl<Float>('F', 0X200301, "PRMINGPU239");

   ParamImpl<Float> F_PRMAXRPVSDTD = new ParamImpl<Float>('F', 0X200301, "PRMAXRPVSDTD");

   ParamImpl<Float> F_PRMAXFIDUFIT = new ParamImpl<Float>('F', 0X200301, "PRMAXFIDUFIT");

   ParamImpl<Float> F_PRMINAMRATIO = new ParamImpl<Float>('F', 0X200301, "PRMINAMRATIO");

   ParamImpl<Float> F_PRMINNPRATIO = new ParamImpl<Float>('F', 0X200301, "PRMINNPRATIO");

   ParamImpl<Float> F_PRMAXNCYCREJ = new ParamImpl<Float>('F', 0X200301, "PRMAXNCYCREJ");

   ParamImpl<Float> F_PRMAXFGE = new ParamImpl<Float>('F', 0X200301, "PRMAXFGE");

   ParamImpl<Float> F_PRMINPFULL = new ParamImpl<Float>('F', 0X200301, "PRMINPFULL");

   ParamImpl<Float> F_PRMINDENSITY = new ParamImpl<Float>('F', 0X200301, "PRMINDENSITY");

   ParamImpl<Float> F_PRISOCPUNSIG = new ParamImpl<Float>('F', 0X200301, "PRISOCPUNSIG");

   ParamImpl<Float> F_PRISOCAMNSIG = new ParamImpl<Float>('F', 0X200301, "PRISOCAMNSIG");

   ParamImpl<Float> F_PRMAXNALPHA = new ParamImpl<Float>('F', 0X200301, "PRMAXNALPHA");

   ParamImpl<Long> L_PRDOCOLLARAN = new ParamImpl<Long>('L', 0X200301, "PRDOCOLLARAN");

   ParamImpl<Long> L_PRDOACTMULT = new ParamImpl<Long>('L', 0X200301, "PRDOACTMULT");

   ParamImpl<Float> F_PRMGAMAXQFIT = new ParamImpl<Float>('F', 0X200301, "PRMGAMAXQFIT");

   ParamImpl<Long> L_PRMVCEDRONLY = new ParamImpl<Long>('L', 0X200301, "PRMVCEDRONLY");

   ParamImpl<Float> F_PRHEATSMASSR = new ParamImpl<Float>('F', 0X200301, "PRHEATSMASSR");

   ParamImpl<Long> L_PRNLSTHTYPE = new ParamImpl<Long>('L', 0X200301, "PRNLSTHTYPE");

   ParamImpl<Float> F_PRNLSTHFREQ = new ParamImpl<Float>('F', 0X200301, "PRNLSTHFREQ");

   ParamImpl<Float> F_PRNPREDELAY = new ParamImpl<Float>('F', 0X200301, "PRNPREDELAY");

   ParamImpl<Float> F_PRNGATEWIDTH = new ParamImpl<Float>('F', 0X200301, "PRNGATEWIDTH");

   ParamImpl<Float> F_PRNLONGDELAY = new ParamImpl<Float>('F', 0X200301, "PRNLONGDELAY");

   ParamImpl<Float> F_PRNLSTCYCTIM = new ParamImpl<Float>('F', 0X200301, "PRNLSTCYCTIM");

   ParamImpl<Long> L_PRFNNOIDACT0 = new ParamImpl<Long>('L', 0X200301, "PRFNNOIDACT0");

   ParamImpl<Long> L_PRDOKNWNMASS = new ParamImpl<Long>('L', 0X200301, "PRDOKNWNMASS");

   ParamImpl<Float> F_PRTGSXOFFSET = new ParamImpl<Float>('F', 0X200301, "PRTGSXOFFSET");

   ParamImpl<Float> F_PRTGSCOLXOFF = new ParamImpl<Float>('F', 0X200301, "PRTGSCOLXOFF");

   ParamImpl<Long> L_PRTGSMCITER = new ParamImpl<Long>('L', 0X200301, "PRTGSMCITER");

   ParamImpl<Long> L_PRUSESTRLIB = new ParamImpl<Long>('L', 0X200301, "PRUSESTRLIB");

   ParamImpl<Float> F_PRTGSEFFDPTH = new ParamImpl<Float>('F', 0X200301, "PRTGSEFFDPTH");

   ParamImpl<Long> L_PRTGSMBSEXEC = new ParamImpl<Long>('L', 0X200301, "PRTGSMBSEXEC");

   ParamImpl<Long> L_PRNITAPPLYCF = new ParamImpl<Long>('L', 0X200301, "PRNITAPPLYCF");

   ParamImpl<Long> L_PRNITCFTYPE = new ParamImpl<Long>('L', 0X200301, "PRNITCFTYPE");

   ParamImpl<Long> L_PRCLRB4IACQ = new ParamImpl<Long>('L', 0X200301, "PRCLRB4IACQ");

   ParamImpl<Float> F_PRSHAPCORTHR = new ParamImpl<Float>('F', 0X200301, "PRSHAPCORTHR");

   ParamImpl<Float> F_PRSENSTHRESH = new ParamImpl<Float>('F', 0X200301, "PRSENSTHRESH");

   ParamImpl<Float> F_PRGAINSHTOL = new ParamImpl<Float>('F', 0X200301, "PRGAINSHTOL");

   ParamImpl<Float> F_PRSHAPERRTOL = new ParamImpl<Float>('F', 0X200301, "PRSHAPERRTOL");

   ParamImpl<Float> F_PRFESHLDTOL = new ParamImpl<Float>('F', 0X200301, "PRFESHLDTOL");

   ParamImpl<Long> L_PRDISPGERES = new ParamImpl<Long>('L', 0X200301, "PRDISPGERES");

   ParamImpl<Long> L_PRLBSOPTCAL = new ParamImpl<Long>('L', 0X200301, "PRLBSOPTCAL");

   ParamImpl<Float> F_PRHCAASTHRES = new ParamImpl<Float>('F', 0X200301, "PRHCAASTHRES");

   ParamImpl<Long> L_PRHCAPPLYCF = new ParamImpl<Long>('L', 0X200301, "PRHCAPPLYCF");

   ParamImpl<Object> V_PROC_FIT = new ParamImpl<Object>('V', 0X00000000, "PROC_FIT");

   ParamImpl<Object> M_PROC_FIT = new ParamImpl<Object>('M', 0X00000001, "PROC_FIT");

   ParamImpl<Object> V_PROC_ALPHA = new ParamImpl<Object>('V', 0X00000001, "PROC_ALPHA");

   ParamImpl<Object> M_PROC_ALPHA = new ParamImpl<Object>('M', 0X00000002, "PROC_ALPHA");

   ParamImpl<Object> V_PROC_NOSMOOTH = new ParamImpl<Object>('V', 0X00000002, "PROC_NOSMOOTH");

   ParamImpl<Object> M_PROC_NOSMOOTH = new ParamImpl<Object>('M', 0X00000004, "PROC_NOSMOOTH");

   ParamImpl<Object> V_PROC_CRITLEVEL = new ParamImpl<Object>('V', 0X00000003, "PROC_CRITLEVEL");

   ParamImpl<Object> M_PROC_CRITLEVEL = new ParamImpl<Object>('M', 0X00000008, "PROC_CRITLEVEL");

   ParamImpl<Object> V_PROC_PROPAGATE = new ParamImpl<Object>('V', 0X00000004, "PROC_PROPAGATE");

   ParamImpl<Object> M_PROC_PROPAGATE = new ParamImpl<Object>('M', 0X00000010, "PROC_PROPAGATE");

   ParamImpl<Object> V_PROC_VARDT = new ParamImpl<Object>('V', 0X00000005, "PROC_VARDT");

   ParamImpl<Object> M_PROC_VARDT = new ParamImpl<Object>('M', 0X00000020, "PROC_VARDT");

   ParamImpl<Object> V_PROC_COLLTIME = new ParamImpl<Object>('V', 0X00000006, "PROC_COLLTIME");

   ParamImpl<Object> M_PROC_COLLTIME = new ParamImpl<Object>('M', 0X00000040, "PROC_COLLTIME");

   ParamImpl<Object> V_PROC_DOLIBEFF = new ParamImpl<Object>('V', 0X00000007, "PROC_DOLIBEFF");

   ParamImpl<Object> M_PROC_DOLIBEFF = new ParamImpl<Object>('M', 0X00000080, "PROC_DOLIBEFF");

   ParamImpl<Object> V_PROC_KEYLINE = new ParamImpl<Object>('V', 0X00000008, "PROC_KEYLINE");

   ParamImpl<Object> M_PROC_KEYLINE = new ParamImpl<Object>('M', 0X00000100, "PROC_KEYLINE");

   ParamImpl<Object> V_PROC_LLDCONST = new ParamImpl<Object>('V', 0X00000009, "PROC_LLDCONST");

   ParamImpl<Object> M_PROC_LLDCONST = new ParamImpl<Object>('M', 0X00000200, "PROC_LLDCONST");

   ParamImpl<Object> V_PROC_CALCMDA = new ParamImpl<Object>('V', 0X0000000, "PROC_CALCMDA");

   ParamImpl<Object> M_PROC_CALCMDA = new ParamImpl<Object>('M', 0X00000400, "PROC_CALCMDA");

   ParamImpl<Object> V_PROC_CALCWGT = new ParamImpl<Object>('V', 0X0000000, "PROC_CALCWGT");

   ParamImpl<Object> M_PROC_CALCWGT = new ParamImpl<Object>('M', 0X00000800, "PROC_CALCWGT");

   ParamImpl<Object> V_PROC_THRSHFT = new ParamImpl<Object>('V', 0X0000000, "PROC_THRSHFT");

   ParamImpl<Object> M_PROC_THRSHFT = new ParamImpl<Object>('M', 0X00001000, "PROC_THRSHFT");

   ParamImpl<Object> V_PROC_ANALCNT = new ParamImpl<Object>('V', 0X0000000, "PROC_ANALCNT");

   ParamImpl<Object> M_PROC_ANALCNT = new ParamImpl<Object>('M', 0X00002000, "PROC_ANALCNT");

   ParamImpl<Object> V_PROC_INCREP = new ParamImpl<Object>('V', 0X0000000, "PROC_INCREP");

   ParamImpl<Object> M_PROC_INCREP = new ParamImpl<Object>('M', 0X00004000, "PROC_INCREP");

   ParamImpl<Object> V_PROC_GAINSHFT = new ParamImpl<Object>('V', 0X0000000, "PROC_GAINSHFT");

   ParamImpl<Object> M_PROC_GAINSHFT = new ParamImpl<Object>('M', 0X00008000, "PROC_GAINSHFT");

   ParamImpl<Object> V_PROC_SYSERRDTL = new ParamImpl<Object>('V', 0X00000010, "PROC_SYSERRDTL");

   ParamImpl<Object> M_PROC_SYSERRDTL = new ParamImpl<Object>('M', 0X00010000, "PROC_SYSERRDTL");

   ParamImpl<Object> V_PROC_REFCORR = new ParamImpl<Object>('V', 0X00000011, "PROC_REFCORR");

   ParamImpl<Object> M_PROC_REFCORR = new ParamImpl<Object>('M', 0X00020000, "PROC_REFCORR");

   ParamImpl<Object> V_PROC_ENBNEGAR = new ParamImpl<Object>('V', 0X00000012, "PROC_ENBNEGAR");

   ParamImpl<Object> M_PROC_ENBNEGAR = new ParamImpl<Object>('M', 0X00040000, "PROC_ENBNEGAR");

   ParamImpl<Object> V_PROC_ROIPSMID = new ParamImpl<Object>('V', 0X00000013, "PROC_ROIPSMID");

   ParamImpl<Object> M_PROC_ROIPSMID = new ParamImpl<Object>('M', 0X00080000, "PROC_ROIPSMID");

   ParamImpl<Object> V_PROC_USEVARETOL = new ParamImpl<Object>('V', 0X00000014, "PROC_USEVARETOL");

   ParamImpl<Object> M_PROC_USEVARETOL = new ParamImpl<Object>('M', 0X00100000, "PROC_USEVARETOL");

   ParamImpl<Object> V_PROC_DOSCOLEFF = new ParamImpl<Object>('V', 0X00000015, "PROC_DOSCOLEFF");

   ParamImpl<Object> M_PROC_DOSCOLEFF = new ParamImpl<Object>('M', 0X00200000, "PROC_DOSCOLEFF");

   ParamImpl<Object> V_PROC_DOCHEMYIELD = new ParamImpl<Object>('V', 0X00000016, "PROC_DOCHEMYIELD");

   ParamImpl<Object> M_PROC_DOCHEMYIELD = new ParamImpl<Object>('M', 0X00400000, "PROC_DOCHEMYIELD");

   ParamImpl<Object> V_PROC_MGAFIXCD = new ParamImpl<Object>('V', 0X00000017, "PROC_MGAFIXCD");

   ParamImpl<Object> M_PROC_MGAFIXCD = new ParamImpl<Object>('M', 0X00800000, "PROC_MGAFIXCD");

   ParamImpl<Object> V_PROC_MGAFIXPU = new ParamImpl<Object>('V', 0X00000018, "PROC_MGAFIXPU");

   ParamImpl<Object> M_PROC_MGAFIXPU = new ParamImpl<Object>('M', 0X01000000, "PROC_MGAFIXPU");

   ParamImpl<Object> V_PROC_MGASAM241 = new ParamImpl<Object>('V', 0X00000019, "PROC_MGASAM241");

   ParamImpl<Object> M_PROC_MGASAM241 = new ParamImpl<Object>('M', 0X02000000, "PROC_MGASAM241");

   ParamImpl<Object> V_PROC_MGAUSELOW = new ParamImpl<Object>('V', 0X0000001, "PROC_MGAUSELOW");

   ParamImpl<Object> M_PROC_MGAUSELOW = new ParamImpl<Object>('M', 0X04000000, "PROC_MGAUSELOW");

   ParamImpl<Object> V_PROC_MGAUPRES = new ParamImpl<Object>('V', 0X0000001, "PROC_MGAUPRES");

   ParamImpl<Object> M_PROC_MGAUPRES = new ParamImpl<Object>('M', 0X08000000, "PROC_MGAUPRES");

   ParamImpl<Object> V_PROC_SHOWROIS = new ParamImpl<Object>('V', 0X0000001, "PROC_SHOWROIS");

   ParamImpl<Object> M_PROC_SHOWROIS = new ParamImpl<Object>('M', 0X10000000, "PROC_SHOWROIS");

   ParamImpl<Object> V_PROC_DOUSERPL = new ParamImpl<Object>('V', 0X0000001, "PROC_DOUSERPL");

   ParamImpl<Object> M_PROC_DOUSERPL = new ParamImpl<Object>('M', 0X20000000, "PROC_DOUSERPL");

   ParamImpl<Object> V_PROC_FWHMREJ = new ParamImpl<Object>('V', 0X0000001, "PROC_FWHMREJ");

   ParamImpl<Object> M_PROC_FWHMREJ = new ParamImpl<Object>('M', 0X40000000, "PROC_FWHMREJ");

   ParamImpl<Object> V_PROC_FIXFWHM = new ParamImpl<Object>('V', 0X0000001, "PROC_FIXFWHM");

   ParamImpl<Object> M_PROC_FIXFWHM = new ParamImpl<Object>('M', 0X80000000, "PROC_FIXFWHM");

   ParamImpl<Object> V_PROC2_ROIMCA = new ParamImpl<Object>('V', 0X00000000, "PROC2_ROIMCA");

   ParamImpl<Object> M_PROC2_ROIMCA = new ParamImpl<Object>('M', 0X00000001, "PROC2_ROIMCA");

   ParamImpl<Object> V_PROC2_ENERGYFLTR = new ParamImpl<Object>('V', 0X00000001, "PROC2_ENERGYFLTR");

   ParamImpl<Object> M_PROC2_ENERGYFLTR = new ParamImpl<Object>('M', 0X00000002, "PROC2_ENERGYFLTR");

   ParamImpl<Object> V_PROC2_NUCLFLTR = new ParamImpl<Object>('V', 0X00000002, "PROC2_NUCLFLTR");

   ParamImpl<Object> M_PROC2_NUCLFLTR = new ParamImpl<Object>('M', 0X00000004, "PROC2_NUCLFLTR");

   ParamImpl<Object> V_PROC2_CHISQFLTR = new ParamImpl<Object>('V', 0X00000003, "PROC2_CHISQFLTR");

   ParamImpl<Object> M_PROC2_CHISQFLTR = new ParamImpl<Object>('M', 0X00000008, "PROC2_CHISQFLTR");

   ParamImpl<Object> V_PROC2_FWRATFLTR = new ParamImpl<Object>('V', 0X00000004, "PROC2_FWRATFLTR");

   ParamImpl<Object> M_PROC2_FWRATFLTR = new ParamImpl<Object>('M', 0X00000010, "PROC2_FWRATFLTR");

   ParamImpl<Object> V_PROC2_MLTPLTFLTR = new ParamImpl<Object>('V', 0X00000005, "PROC2_MLTPLTFLTR");

   ParamImpl<Object> M_PROC2_MLTPLTFLTR = new ParamImpl<Object>('M', 0X00000020, "PROC2_MLTPLTFLTR");

   ParamImpl<Object> V_PROC2_NOFLTR = new ParamImpl<Object>('V', 0X00000006, "PROC2_NOFLTR");

   ParamImpl<Object> M_PROC2_NOFLTR = new ParamImpl<Object>('M', 0X00000040, "PROC2_NOFLTR");

   ParamImpl<Object> V_PROC2_ERRREJ = new ParamImpl<Object>('V', 0X00000007, "PROC2_ERRREJ");

   ParamImpl<Object> M_PROC2_ERRREJ = new ParamImpl<Object>('M', 0X00000080, "PROC2_ERRREJ");

   ParamImpl<Object> V_PROC2_MRLREJ = new ParamImpl<Object>('V', 0X00000008, "PROC2_MRLREJ");

   ParamImpl<Object> M_PROC2_MRLREJ = new ParamImpl<Object>('M', 0X00000100, "PROC2_MRLREJ");

   ParamImpl<Object> V_PROC2_MINMDA = new ParamImpl<Object>('V', 0X00000009, "PROC2_MINMDA");

   ParamImpl<Object> M_PROC2_MINMDA = new ParamImpl<Object>('M', 0X00000200, "PROC2_MINMDA");

   ParamImpl<Object> V_PROC2_RPTCL = new ParamImpl<Object>('V', 0X0000000, "PROC2_RPTCL");

   ParamImpl<Object> M_PROC2_RPTCL = new ParamImpl<Object>('M', 0X00000400, "PROC2_RPTCL");

   ParamImpl<Object> V_PROC2_USEMDACONSTS = new ParamImpl<Object>('V', 0X0000000, "PROC2_USEMDACONSTS");

   ParamImpl<Object> M_PROC2_USEMDACONSTS = new ParamImpl<Object>('M', 0X00000800, "PROC2_USEMDACONSTS");

   ParamImpl<Object> V_PROC2_DOUNKSRCH = new ParamImpl<Object>('V', 0X0000000, "PROC2_DOUNKSRCH");

   ParamImpl<Object> M_PROC2_DOUNKSRCH = new ParamImpl<Object>('M', 0X00001000, "PROC2_DOUNKSRCH");

   ParamImpl<Object> V_PROC2_DISACQDECAY = new ParamImpl<Object>('V', 0X0000000, "PROC2_DISACQDECAY");

   ParamImpl<Object> M_PROC2_DISACQDECAY = new ParamImpl<Object>('M', 0X00002000, "PROC2_DISACQDECAY");

   ParamImpl<Object> V_PROC2_NONEUTBC = new ParamImpl<Object>('V', 0X0000000, "PROC2_NONEUTBC");

   ParamImpl<Object> M_PROC2_NONEUTBC = new ParamImpl<Object>('M', 0X00004000, "PROC2_NONEUTBC");

   ParamImpl<Object> V_PROC2_NEUTDOMC = new ParamImpl<Object>('V', 0X0000000, "PROC2_NEUTDOMC");

   ParamImpl<Object> M_PROC2_NEUTDOMC = new ParamImpl<Object>('M', 0X00008000, "PROC2_NEUTDOMC");

   ParamImpl<Object> V_PROC2_DONEUTMC = new ParamImpl<Object>('V', 0X0000000, "PROC2_DONEUTMC");

   ParamImpl<Object> M_PROC2_DONEUTMC = new ParamImpl<Object>('M', 0X00008000, "PROC2_DONEUTMC");

   ParamImpl<Object> V_PROC2_MGAFIXPB = new ParamImpl<Object>('V', 0X00000010, "PROC2_MGAFIXPB");

   ParamImpl<Object> M_PROC2_MGAFIXPB = new ParamImpl<Object>('M', 0X00010000, "PROC2_MGAFIXPB");

   ParamImpl<Object> V_PROC2_MGAAMHETRO = new ParamImpl<Object>('V', 0X00000011, "PROC2_MGAAMHETRO");

   ParamImpl<Object> M_PROC2_MGAAMHETRO = new ParamImpl<Object>('M', 0X00020000, "PROC2_MGAAMHETRO");

   ParamImpl<Object> V_PROC2_DOINTERF = new ParamImpl<Object>('V', 0X00000012, "PROC2_DOINTERF");

   ParamImpl<Object> M_PROC2_DOINTERF = new ParamImpl<Object>('M', 0X00040000, "PROC2_DOINTERF");

   ParamImpl<Object> V_PROC2_AIST2G = new ParamImpl<Object>('V', 0X00000013, "PROC2_AIST2G");

   ParamImpl<Object> M_PROC2_AIST2G = new ParamImpl<Object>('M', 0X00080000, "PROC2_AIST2G");

   ParamImpl<Object> V_PROC2_CLRB4ACQ = new ParamImpl<Object>('V', 0X00000014, "PROC2_CLRB4ACQ");

   ParamImpl<Object> M_PROC2_CLRB4ACQ = new ParamImpl<Object>('M', 0X00100000, "PROC2_CLRB4ACQ");

   ParamImpl<Object> V_PROC2_NEUTUSETOT = new ParamImpl<Object>('V', 0X00000015, "PROC2_NEUTUSETOT");

   ParamImpl<Object> M_PROC2_NEUTUSETOT = new ParamImpl<Object>('M', 0X00200000, "PROC2_NEUTUSETOT");

   ParamImpl<Object> V_PROC2_NEUTFITZZ = new ParamImpl<Object>('V', 0X00000016, "PROC2_NEUTFITZZ");

   ParamImpl<Object> M_PROC2_NEUTFITZZ = new ParamImpl<Object>('M', 0X00400000, "PROC2_NEUTFITZZ");

   ParamImpl<Object> V_PROC2_NEUTMLT1OK = new ParamImpl<Object>('V', 0X00000017, "PROC2_NEUTMLT1OK");

   ParamImpl<Object> M_PROC2_NEUTMLT1OK = new ParamImpl<Object>('M', 0X00800000, "PROC2_NEUTMLT1OK");

   ParamImpl<Object> V_PROC2_USEROIFILE = new ParamImpl<Object>('V', 0X00000018, "PROC2_USEROIFILE");

   ParamImpl<Object> M_PROC2_USEROIFILE = new ParamImpl<Object>('M', 0X01000000, "PROC2_USEROIFILE");

   ParamImpl<Object> V_PROC2_REJECT0PKS = new ParamImpl<Object>('V', 0X00000019, "PROC2_REJECT0PKS");

   ParamImpl<Object> M_PROC2_REJECT0PKS = new ParamImpl<Object>('M', 0X02000000, "PROC2_REJECT0PKS");

   ParamImpl<Object> V_PROC2_VARYLTAIL = new ParamImpl<Object>('V', 0X0000001, "PROC2_VARYLTAIL");

   ParamImpl<Object> M_PROC2_VARYLTAIL = new ParamImpl<Object>('M', 0X04000000, "PROC2_VARYLTAIL");

   ParamImpl<Object> V_PROC2_ADDPKRES = new ParamImpl<Object>('V', 0X0000001, "PROC2_ADDPKRES");

   ParamImpl<Object> M_PROC2_ADDPKRES = new ParamImpl<Object>('M', 0X08000000, "PROC2_ADDPKRES");

   ParamImpl<Object> V_PROC2_SAXFRNOXTR = new ParamImpl<Object>('V', 0X0000001, "PROC2_SAXFRNOXTR");

   ParamImpl<Object> M_PROC2_SAXFRNOXTR = new ParamImpl<Object>('M', 0X10000000, "PROC2_SAXFRNOXTR");

   ParamImpl<Object> V_PROC2_DORESID = new ParamImpl<Object>('V', 0X0000001, "PROC2_DORESID");

   ParamImpl<Object> M_PROC2_DORESID = new ParamImpl<Object>('M', 0X20000000, "PROC2_DORESID");

   ParamImpl<Object> V_PROC2_LEVUSEMDA = new ParamImpl<Object>('V', 0X0000001, "PROC2_LEVUSEMDA");

   ParamImpl<Object> M_PROC2_LEVUSEMDA = new ParamImpl<Object>('M', 0X40000000, "PROC2_LEVUSEMDA");

   ParamImpl<Object> V_PROC2_LEVBOUNDS = new ParamImpl<Object>('V', 0X0000001, "PROC2_LEVBOUNDS");

   ParamImpl<Object> M_PROC2_LEVBOUNDS = new ParamImpl<Object>('M', 0X80000000, "PROC2_LEVBOUNDS");

   ParamImpl<Object> V_PROC3_DOMDATEST = new ParamImpl<Object>('V', 0X00000000, "PROC3_DOMDATEST");

   ParamImpl<Object> M_PROC3_DOMDATEST = new ParamImpl<Object>('M', 0X00000001, "PROC3_DOMDATEST");

   ParamImpl<Object> V_PROC3_USEVBKCHN = new ParamImpl<Object>('V', 0X00000001, "PROC3_USEVBKCHN");

   ParamImpl<Object> M_PROC3_USEVBKCHN = new ParamImpl<Object>('M', 0X00000002, "PROC3_USEVBKCHN");

   ParamImpl<Object> V_PROC3_USEVPWIDTH = new ParamImpl<Object>('V', 0X00000002, "PROC3_USEVPWIDTH");

   ParamImpl<Object> M_PROC3_USEVPWIDTH = new ParamImpl<Object>('M', 0X00000004, "PROC3_USEVPWIDTH");

   ParamImpl<Object> V_PROC3_MGAALWAYS = new ParamImpl<Object>('V', 0X00000003, "PROC3_MGAALWAYS");

   ParamImpl<Object> M_PROC3_MGAALWAYS = new ParamImpl<Object>('M', 0X00000008, "PROC3_MGAALWAYS");

   ParamImpl<Object> V_PROC3_COMBAVE = new ParamImpl<Object>('V', 0X00000004, "PROC3_COMBAVE");

   ParamImpl<Object> M_PROC3_COMBAVE = new ParamImpl<Object>('M', 0X00000010, "PROC3_COMBAVE");

   ParamImpl<Object> V_PROC3_SSNOSHIFT = new ParamImpl<Object>('V', 0X00000005, "PROC3_SSNOSHIFT");

   ParamImpl<Object> M_PROC3_SSNOSHIFT = new ParamImpl<Object>('M', 0X00000020, "PROC3_SSNOSHIFT");

   ParamImpl<Object> V_PROC3_SSNOLTCORR = new ParamImpl<Object>('V', 0X00000006, "PROC3_SSNOLTCORR");

   ParamImpl<Object> M_PROC3_SSNOLTCORR = new ParamImpl<Object>('M', 0X00000040, "PROC3_SSNOLTCORR");

   ParamImpl<Object> V_PROC3_SSSERIAL = new ParamImpl<Object>('V', 0X00000007, "PROC3_SSSERIAL");

   ParamImpl<Object> M_PROC3_SSSERIAL = new ParamImpl<Object>('M', 0X00000080, "PROC3_SSSERIAL");

   ParamImpl<Object> V_PROC3_MGANOABORT = new ParamImpl<Object>('V', 0X00000008, "PROC3_MGANOABORT");

   ParamImpl<Object> M_PROC3_MGANOABORT = new ParamImpl<Object>('M', 0X00000100, "PROC3_MGANOABORT");

   ParamImpl<Object> V_PROC3_MGAUUSEMGA = new ParamImpl<Object>('V', 0X00000009, "PROC3_MGAUUSEMGA");

   ParamImpl<Object> M_PROC3_MGAUUSEMGA = new ParamImpl<Object>('M', 0X00000200, "PROC3_MGAUUSEMGA");

   ParamImpl<Object> V_PROC3_NEUTMULTI = new ParamImpl<Object>('V', 0X0000000, "PROC3_NEUTMULTI");

   ParamImpl<Object> M_PROC3_NEUTMULTI = new ParamImpl<Object>('M', 0X00000400, "PROC3_NEUTMULTI");

   ParamImpl<Object> V_PROC3_NEUTDOALPHA = new ParamImpl<Object>('V', 0X0000000, "PROC3_NEUTDOALPHA");

   ParamImpl<Object> M_PROC3_NEUTDOALPHA = new ParamImpl<Object>('M', 0X00000800, "PROC3_NEUTDOALPHA");

   ParamImpl<Object> V_PROC3_NEUTDOMFACT = new ParamImpl<Object>('V', 0X0000000, "PROC3_NEUTDOMFACT");

   ParamImpl<Object> M_PROC3_NEUTDOMFACT = new ParamImpl<Object>('M', 0X00001000, "PROC3_NEUTDOMFACT");

   ParamImpl<Object> V_PROC3_NEUTDOEFF = new ParamImpl<Object>('V', 0X0000000, "PROC3_NEUTDOEFF");

   ParamImpl<Object> M_PROC3_NEUTDOEFF = new ParamImpl<Object>('M', 0X00002000, "PROC3_NEUTDOEFF");

   ParamImpl<Object> V_PROC3_NEUTDOSDTAV = new ParamImpl<Object>('V', 0X0000000, "PROC3_NEUTDOSDTAV");

   ParamImpl<Object> M_PROC3_NEUTDOSDTAV = new ParamImpl<Object>('M', 0X00004000, "PROC3_NEUTDOSDTAV");

   ParamImpl<Object> V_PROC3_NEUTUSEKEFF = new ParamImpl<Object>('V', 0X0000000, "PROC3_NEUTUSEKEFF");

   ParamImpl<Object> M_PROC3_NEUTUSEKEFF = new ParamImpl<Object>('M', 0X00008000, "PROC3_NEUTUSEKEFF");

   ParamImpl<Object> V_PROC3_NOREFPEAK = new ParamImpl<Object>('V', 0X00000010, "PROC3_NOREFPEAK");

   ParamImpl<Object> M_PROC3_NOREFPEAK = new ParamImpl<Object>('M', 0X00010000, "PROC3_NOREFPEAK");

   ParamImpl<Object> V_PROC3_NOBACKCOR = new ParamImpl<Object>('V', 0X00000011, "PROC3_NOBACKCOR");

   ParamImpl<Object> M_PROC3_NOBACKCOR = new ParamImpl<Object>('M', 0X00020000, "PROC3_NOBACKCOR");

   ParamImpl<Object> V_PROC3_NEUTDOEALPHA = new ParamImpl<Object>('V', 0X00000012, "PROC3_NEUTDOEALPHA");

   ParamImpl<Object> M_PROC3_NEUTDOEALPHA = new ParamImpl<Object>('M', 0X00040000, "PROC3_NEUTDOEALPHA");

   ParamImpl<Object> V_PROC3_NEUTDOEMFACT = new ParamImpl<Object>('V', 0X00000013, "PROC3_NEUTDOEMFACT");

   ParamImpl<Object> M_PROC3_NEUTDOEMFACT = new ParamImpl<Object>('M', 0X00080000, "PROC3_NEUTDOEMFACT");

   ParamImpl<Object> V_PROC3_COMBAVENOW = new ParamImpl<Object>('V', 0X00000014, "PROC3_COMBAVENOW");

   ParamImpl<Object> M_PROC3_COMBAVENOW = new ParamImpl<Object>('M', 0X00100000, "PROC3_COMBAVENOW");

   ParamImpl<Object> V_PROC3_MGAUMGAOUT = new ParamImpl<Object>('V', 0X00000015, "PROC3_MGAUMGAOUT");

   ParamImpl<Object> M_PROC3_MGAUMGAOUT = new ParamImpl<Object>('M', 0X00200000, "PROC3_MGAUMGAOUT");

   ParamImpl<Object> V_PROC3_PRNEUTDOMCD = new ParamImpl<Object>('V', 0X00000016, "PROC3_PRNEUTDOMCD");

   ParamImpl<Object> M_PROC3_PRNEUTDOMCD = new ParamImpl<Object>('M', 0X00400000, "PROC3_PRNEUTDOMCD");

   ParamImpl<Object> V_PROC3_PRNEUTUSERE = new ParamImpl<Object>('V', 0X00000017, "PROC3_PRNEUTUSERE");

   ParamImpl<Object> M_PROC3_PRNEUTUSERE = new ParamImpl<Object>('M', 0X00800000, "PROC3_PRNEUTUSERE");

   ParamImpl<Object> V_PROC3_PRCNUCUSEINT = new ParamImpl<Object>('V', 0X00000018, "PROC3_PRCNUCUSEINT");

   ParamImpl<Object> M_PROC3_PRCNUCUSEINT = new ParamImpl<Object>('M', 0X01000000, "PROC3_PRCNUCUSEINT");

   ParamImpl<Object> V_PROC3_PRCNUCOPTALL = new ParamImpl<Object>('V', 0X00000019, "PROC3_PRCNUCOPTALL");

   ParamImpl<Object> M_PROC3_PRCNUCOPTALL = new ParamImpl<Object>('M', 0X02000000, "PROC3_PRCNUCOPTALL");

   ParamImpl<Object> V_PROC3_PRCNUCMEARHO = new ParamImpl<Object>('V', 0X0000001, "PROC3_PRCNUCMEARHO");

   ParamImpl<Object> M_PROC3_PRCNUCMEARHO = new ParamImpl<Object>('M', 0X04000000, "PROC3_PRCNUCMEARHO");

   ParamImpl<Object> V_PROC3_PRCNUCANGEFF = new ParamImpl<Object>('V', 0X0000001, "PROC3_PRCNUCANGEFF");

   ParamImpl<Object> M_PROC3_PRCNUCANGEFF = new ParamImpl<Object>('M', 0X08000000, "PROC3_PRCNUCANGEFF");

   ParamImpl<Object> V_PROC3_PRCNUCUNIEFF = new ParamImpl<Object>('V', 0X0000001, "PROC3_PRCNUCUNIEFF");

   ParamImpl<Object> M_PROC3_PRCNUCUNIEFF = new ParamImpl<Object>('M', 0X10000000, "PROC3_PRCNUCUNIEFF");

   ParamImpl<Object> V_PROC3_PRCNUCUSEMAX = new ParamImpl<Object>('V', 0X0000001, "PROC3_PRCNUCUSEMAX");

   ParamImpl<Object> M_PROC3_PRCNUCUSEMAX = new ParamImpl<Object>('M', 0X20000000, "PROC3_PRCNUCUSEMAX");

   ParamImpl<Object> V_PROC3_PRCNUCUSEMIN = new ParamImpl<Object>('V', 0X0000001, "PROC3_PRCNUCUSEMIN");

   ParamImpl<Object> M_PROC3_PRCNUCUSEMIN = new ParamImpl<Object>('M', 0X40000000, "PROC3_PRCNUCUSEMIN");

   ParamImpl<Object> V_PROC3_PRCNUCUSEAVG = new ParamImpl<Object>('V', 0X0000001, "PROC3_PRCNUCUSEAVG");

   ParamImpl<Object> M_PROC3_PRCNUCUSEAVG = new ParamImpl<Object>('M', 0X80000000, "PROC3_PRCNUCUSEAVG");

   ParamImpl<Object> V_PROC4_PRCNUCUSENON = new ParamImpl<Object>('V', 0X00000000, "PROC4_PRCNUCUSENON");

   ParamImpl<Object> M_PROC4_PRCNUCUSENON = new ParamImpl<Object>('M', 0X00000001, "PROC4_PRCNUCUSENON");

   ParamImpl<Object> V_PROC4_PRCAASREJECT = new ParamImpl<Object>('V', 0X00000001, "PROC4_PRCAASREJECT");

   ParamImpl<Object> M_PROC4_PRCAASREJECT = new ParamImpl<Object>('M', 0X00000002, "PROC4_PRCAASREJECT");

   ParamImpl<Object> V_PROC4_PRCNUCCTREFF = new ParamImpl<Object>('V', 0X00000002, "PROC4_PRCNUCCTREFF");

   ParamImpl<Object> M_PROC4_PRCNUCCTREFF = new ParamImpl<Object>('M', 0X00000004, "PROC4_PRCNUCCTREFF");

   ParamImpl<Object> V_PROC4_PRCNMULTIREFF = new ParamImpl<Object>('V', 0X00000003, "PROC4_PRCNMULTIREFF");

   ParamImpl<Object> M_PROC4_PRCNMULTIEFF = new ParamImpl<Object>('M', 0X00000008, "PROC4_PRCNMULTIEFF");

   ParamImpl<Object> V_PROC4_PRCNEUTTRUNCM = new ParamImpl<Object>('V', 0X00000004, "PROC4_PRCNEUTTRUNCM");

   ParamImpl<Object> M_PROC4_PRCNEUTTRUNCM = new ParamImpl<Object>('M', 0X00000010, "PROC4_PRCNEUTTRUNCM");

   ParamImpl<Object> V_PROC4_PRCGROUPCENT = new ParamImpl<Object>('V', 0X00000005, "PROC4_PRCGROUPCENT");

   ParamImpl<Object> M_PROC4_PRCGROUPCENT = new ParamImpl<Object>('M', 0X00000020, "PROC4_PRCGROUPCENT");

   ParamImpl<Object> V_PROC4_FORCEROI = new ParamImpl<Object>('V', 0X00000006, "PROC4_FORCEROI");

   ParamImpl<Object> M_PROC4_FORCEROI = new ParamImpl<Object>('M', 0X00000040, "PROC4_FORCEROI");

   ParamImpl<Object> V_PROC4_CHECKADJPK = new ParamImpl<Object>('V', 0X00000007, "PROC4_CHECKADJPK");

   ParamImpl<Object> M_PROC4_CHECKADJPK = new ParamImpl<Object>('M', 0X00000080, "PROC4_CHECKADJPK");

   ParamImpl<Object> V_PROC4_LROIBYENG = new ParamImpl<Object>('V', 0X00000008, "PROC4_LROIBYENG");

   ParamImpl<Object> M_PROC4_LROIBYENG = new ParamImpl<Object>('M', 0X00000100, "PROC4_LROIBYENG");

   ParamImpl<Object> V_PROC4_NOMCONSTT = new ParamImpl<Object>('V', 0X00000009, "PROC4_NOMCONSTT");

   ParamImpl<Object> M_PROC4_NOMCONSTT = new ParamImpl<Object>('M', 0X00000200, "PROC4_NOMCONSTT");

   ParamImpl<Object> V_PROC4_DOFIDUTST = new ParamImpl<Object>('V', 0X0000000, "PROC4_DOFIDUTST");

   ParamImpl<Object> M_PROC4_DOFIDUTST = new ParamImpl<Object>('M', 0X00000400, "PROC4_DOFIDUTST");

   ParamImpl<Object> V_PROC4_DOAUTOWST = new ParamImpl<Object>('V', 0X0000000, "PROC4_DOAUTOWST");

   ParamImpl<Object> M_PROC4_DOAUTOWST = new ParamImpl<Object>('M', 0X00000800, "PROC4_DOAUTOWST");

   ParamImpl<Object> V_PROC4_HZFRACKNWN = new ParamImpl<Object>('V', 0X0000000, "PROC4_HZFRACKNWN");

   ParamImpl<Object> M_PROC4_HZFRACKNWN = new ParamImpl<Object>('M', 0X00001000, "PROC4_HZFRACKNWN");

   ParamImpl<Object> V_PROC4_DOMGAVCHCK = new ParamImpl<Object>('V', 0X0000000, "PROC4_DOMGAVCHCK");

   ParamImpl<Object> M_PROC4_DOMGAVCHCK = new ParamImpl<Object>('M', 0X00002000, "PROC4_DOMGAVCHCK");

   ParamImpl<Object> V_PROC4_DOTMUWIPP = new ParamImpl<Object>('V', 0X0000000, "PROC4_DOTMUWIPP");

   ParamImpl<Object> M_PROC4_DOTMUWIPP = new ParamImpl<Object>('M', 0X00004000, "PROC4_DOTMUWIPP");

   ParamImpl<Object> V_PROC4_ADDEFFERR = new ParamImpl<Object>('V', 0X0000000, "PROC4_ADDEFFERR");

   ParamImpl<Object> M_PROC4_ADDEFFERR = new ParamImpl<Object>('M', 0X00008000, "PROC4_ADDEFFERR");

   ParamImpl<Object> V_PROC4_NOTRCLAMP = new ParamImpl<Object>('V', 0X00000010, "PROC4_NOTRCLAMP");

   ParamImpl<Object> M_PROC4_NOTRCLAMP = new ParamImpl<Object>('M', 0X00010000, "PROC4_NOTRCLAMP");

   ParamImpl<Object> V_PROC4_TRBKGSUB = new ParamImpl<Object>('V', 0X00000011, "PROC4_TRBKGSUB");

   ParamImpl<Object> M_PROC4_TRBKGSUB = new ParamImpl<Object>('M', 0X00020000, "PROC4_TRBKGSUB");

   ParamImpl<Object> V_PROC4_DOCOLLAR = new ParamImpl<Object>('V', 0X00000012, "PROC4_DOCOLLAR");

   ParamImpl<Object> M_PROC4_DOCOLLAR = new ParamImpl<Object>('M', 0X00040000, "PROC4_DOCOLLAR");

   ParamImpl<Object> V_PROC4_DOACTMULT = new ParamImpl<Object>('V', 0X00000013, "PROC4_DOACTMULT");

   ParamImpl<Object> M_PROC4_DOACTMULT = new ParamImpl<Object>('M', 0X00080000, "PROC4_DOACTMULT");

   ParamImpl<Object> V_PROC4_MVCEDRONLY = new ParamImpl<Object>('V', 0X00000014, "PROC4_MVCEDRONLY");

   ParamImpl<Object> M_PROC4_MVCEDRONLY = new ParamImpl<Object>('M', 0X00100000, "PROC4_MVCEDRONLY");

   ParamImpl<Object> V_PROC4_FNNOIDACT0 = new ParamImpl<Object>('V', 0X00000015, "PROC4_FNNOIDACT0");

   ParamImpl<Object> M_PROC4_FNNOIDACT0 = new ParamImpl<Object>('M', 0X00200000, "PROC4_FNNOIDACT0");

   ParamImpl<Object> V_PROC4_DOKNWNMASS = new ParamImpl<Object>('V', 0X00000016, "PROC4_DOKNWNMASS");

   ParamImpl<Object> M_PROC4_DOKNWNMASS = new ParamImpl<Object>('M', 0X00400000, "PROC4_DOKNWNMASS");

   ParamImpl<Object> V_PROC4_USESTRLIB = new ParamImpl<Object>('V', 0X00000017, "PROC4_USESTRLIB");

   ParamImpl<Object> M_PROC4_USESTRLIB = new ParamImpl<Object>('M', 0X00800000, "PROC4_USESTRLIB");

   ParamImpl<Object> V_PROC4_TGSMBSEXEC = new ParamImpl<Object>('V', 0X00000018, "PROC4_TGSMBSEXEC");

   ParamImpl<Object> M_PROC4_TGSMBSEXEC = new ParamImpl<Object>('M', 0X01000000, "PROC4_TGSMBSEXEC");

   ParamImpl<Object> V_PROC4_NITAPPLYCF = new ParamImpl<Object>('V', 0X00000019, "PROC4_NITAPPLYCF");

   ParamImpl<Object> M_PROC4_NITAPPLYCF = new ParamImpl<Object>('M', 0X02000000, "PROC4_NITAPPLYCF");

   ParamImpl<Object> V_PROC4_CLRB4IACQ = new ParamImpl<Object>('V', 0X0000001, "PROC4_CLRB4IACQ");

   ParamImpl<Object> M_PROC4_CLRB4IACQ = new ParamImpl<Object>('M', 0X04000000, "PROC4_CLRB4IACQ");

   ParamImpl<Object> V_PROC4_DISPGERES = new ParamImpl<Object>('V', 0X0000001, "PROC4_DISPGERES");

   ParamImpl<Object> M_PROC4_DISPGERES = new ParamImpl<Object>('M', 0X08000000, "PROC4_DISPGERES");

   ParamImpl<Object> V_PROC4_LBSOPTCAL = new ParamImpl<Object>('V', 0X0000001, "PROC4_LBSOPTCAL");

   ParamImpl<Object> M_PROC4_LBSOPTCAL = new ParamImpl<Object>('M', 0X10000000, "PROC4_LBSOPTCAL");

   ParamImpl<Object> V_MGAF_AM243NP239 = new ParamImpl<Object>('V', 0X00000000, "MGAF_AM243NP239");

   ParamImpl<Object> M_MGAF_AM243NP239 = new ParamImpl<Object>('M', 0X00000001, "MGAF_AM243NP239");

   ParamImpl<Date> X_DCALTIME = new ParamImpl<Date>('X', 0X20020002, "DCALTIME");

   ParamImpl<String> T_SHELF = new ParamImpl<String>('T', 0X20020003, "SHELF");

   ParamImpl<String> T_GEOMETRY = new ParamImpl<String>('T', 0X20020004, "GEOMETRY");

   ParamImpl<String> T_DETECTOR = new ParamImpl<String>('T', 0X20020005, "DETECTOR");

   ParamImpl<String> T_CHAIR = new ParamImpl<String>('T', 0X20020006, "CHAIR");

   ParamImpl<Float> F_DCALFAC5 = new ParamImpl<Float>('F', 0X20020007, "DCALFAC5");

   ParamImpl<Float> F_DCALFAC6 = new ParamImpl<Float>('F', 0X20020008, "DCALFAC6");

   ParamImpl<Long> L_DCALFLAGS = new ParamImpl<Long>('L', 0X20020009, "DCALFLAGS");

   ParamImpl<Float> F_DCALFAC1 = new ParamImpl<Float>('F', 0X2002000, "DCALFAC1");

   ParamImpl<Float> F_DCALFAC2 = new ParamImpl<Float>('F', 0X2002000, "DCALFAC2");

   ParamImpl<Float> F_DCALFAC3 = new ParamImpl<Float>('F', 0X2002000, "DCALFAC3");

   ParamImpl<Float> F_DCALFAC4 = new ParamImpl<Float>('F', 0X2002000, "DCALFAC4");

   ParamImpl<Float> F_DSP1 = new ParamImpl<Float>('F', 0X2002000, "DSP1");

   ParamImpl<Float> F_DSP2 = new ParamImpl<Float>('F', 0X2002000, "DSP2");

   ParamImpl<Float> F_DCREFDIST = new ParamImpl<Float>('F', 0X20020010, "DCREFDIST");

   ParamImpl<Float> F_DCSAMPDIST = new ParamImpl<Float>('F', 0X20020011, "DCSAMPDIST");

   ParamImpl<Float> F_AVRGEFF = new ParamImpl<Float>('F', 0X20020012, "AVRGEFF");

   ParamImpl<Long> L_USEEMPEFF = new ParamImpl<Long>('L', 0X20020013, "USEEMPEFF");

   ParamImpl<Float> F_EFFAVERR = new ParamImpl<Float>('F', 0X20020014, "EFFAVERR");

   ParamImpl<Float> F_DENERGY = new ParamImpl<Float>('F', 0X20020015, "DENERGY");

   ParamImpl<Float> F_DEFF = new ParamImpl<Float>('F', 0X20020016, "DEFF");

   ParamImpl<Float> F_DEFFERR = new ParamImpl<Float>('F', 0X20020017, "DEFFERR");

   ParamImpl<Float> F_DCALFAC7 = new ParamImpl<Float>('F', 0X20020018, "DCALFAC7");

   ParamImpl<Long> L_EMPDEGREE = new ParamImpl<Long>('L', 0X20020019, "EMPDEGREE");

   ParamImpl<Float> F_EMPCHISQ = new ParamImpl<Float>('F', 0X2002001, "EMPCHISQ");

   ParamImpl<Float> F_AVRGEFFERR = new ParamImpl<Float>('F', 0X2002001, "AVRGEFFERR");

   ParamImpl<Float> F_DEFFEFAC = new ParamImpl<Float>('F', 0X2002001, "DEFFEFAC");

   ParamImpl<Float> F_LCENERGY = new ParamImpl<Float>('F', 0X2002001, "LCENERGY");

   ParamImpl<Float> F_LCCONST = new ParamImpl<Float>('F', 0X20020020, "LCCONST");

   ParamImpl<Float> F_LCEXP = new ParamImpl<Float>('F', 0X20020021, "LCEXP");

   ParamImpl<Float> F_LCGOF = new ParamImpl<Float>('F', 0X20020022, "LCGOF");

   ParamImpl<String> T_DETYP = new ParamImpl<String>('T', 0X20020023, "DETYP");

   ParamImpl<Float> F_SCANST = new ParamImpl<Float>('F', 0X20020024, "SCANST");

   ParamImpl<Float> F_SCANEND = new ParamImpl<Float>('F', 0X20020025, "SCANEND");

   ParamImpl<Date> X_LASTCALD = new ParamImpl<Date>('X', 0X20020026, "LASTCALD");

   ParamImpl<Long> L_GEOMNOTAPP = new ParamImpl<Long>('L', 0X20020027, "GEOMNOTAPP");

   ParamImpl<String> T_EFFTYPE = new ParamImpl<String>('T', 0X20020028, "EFFTYPE");

   ParamImpl<String> T_EFOPNAME = new ParamImpl<String>('T', 0X20020029, "EFOPNAME");

   ParamImpl<Float> F_DLCALFAC1 = new ParamImpl<Float>('F', 0X2002002, "DLCALFAC1");

   ParamImpl<Float> F_DLCALFAC2 = new ParamImpl<Float>('F', 0X2002002, "DLCALFAC2");

   ParamImpl<Float> F_DLCALFAC3 = new ParamImpl<Float>('F', 0X2002002, "DLCALFAC3");

   ParamImpl<Float> F_DHCALFAC1 = new ParamImpl<Float>('F', 0X2002002, "DHCALFAC1");

   ParamImpl<Float> F_DHCALFAC2 = new ParamImpl<Float>('F', 0X2002002, "DHCALFAC2");

   ParamImpl<Float> F_DHCALFAC3 = new ParamImpl<Float>('F', 0X2002002, "DHCALFAC3");

   ParamImpl<Float> F_DHCALFAC4 = new ParamImpl<Float>('F', 0X20020030, "DHCALFAC4");

   ParamImpl<Float> F_DHCALFAC5 = new ParamImpl<Float>('F', 0X20020031, "DHCALFAC5");

   ParamImpl<Float> F_DHCALFAC6 = new ParamImpl<Float>('F', 0X20020032, "DHCALFAC6");

   ParamImpl<Object> G_LERRMAT1 = new ParamImpl<Object>('G', 0X20020033, "LERRMAT1");

   ParamImpl<Object> G_LERRMAT2 = new ParamImpl<Object>('G', 0X20020034, "LERRMAT2");

   ParamImpl<Object> G_LERRMAT3 = new ParamImpl<Object>('G', 0X20020035, "LERRMAT3");

   ParamImpl<Object> G_LERRMAT4 = new ParamImpl<Object>('G', 0X20020036, "LERRMAT4");

   ParamImpl<Object> G_LERRMAT5 = new ParamImpl<Object>('G', 0X20020037, "LERRMAT5");

   ParamImpl<Object> G_LERRMAT6 = new ParamImpl<Object>('G', 0X20020038, "LERRMAT6");

   ParamImpl<Object> G_LERRMAT7 = new ParamImpl<Object>('G', 0X20020039, "LERRMAT7");

   ParamImpl<Object> G_HERRMAT1 = new ParamImpl<Object>('G', 0X2002003, "HERRMAT1");

   ParamImpl<Object> G_HERRMAT2 = new ParamImpl<Object>('G', 0X2002003, "HERRMAT2");

   ParamImpl<Object> G_HERRMAT3 = new ParamImpl<Object>('G', 0X2002003, "HERRMAT3");

   ParamImpl<Object> G_HERRMAT4 = new ParamImpl<Object>('G', 0X2002003, "HERRMAT4");

   ParamImpl<Object> G_HERRMAT5 = new ParamImpl<Object>('G', 0X2002003, "HERRMAT5");

   ParamImpl<Object> G_HERRMAT6 = new ParamImpl<Object>('G', 0X2002003, "HERRMAT6");

   ParamImpl<Object> G_HERRMAT7 = new ParamImpl<Object>('G', 0X20020040, "HERRMAT7");

   ParamImpl<Object> G_HERRMAT8 = new ParamImpl<Object>('G', 0X20020041, "HERRMAT8");

   ParamImpl<Object> G_HERRMAT9 = new ParamImpl<Object>('G', 0X20020042, "HERRMAT9");

   ParamImpl<Float> F_CROSSOVER = new ParamImpl<Float>('F', 0X20020043, "CROSSOVER");

   ParamImpl<Long> L_DHDEGREE = new ParamImpl<Long>('L', 0X20020044, "DHDEGREE");

   ParamImpl<Float> F_DLCALCHI = new ParamImpl<Float>('F', 0X20020045, "DLCALCHI");

   ParamImpl<Float> F_DHCALCHI = new ParamImpl<Float>('F', 0X20020046, "DHCALCHI");

   ParamImpl<String> T_EFCALVERS = new ParamImpl<String>('T', 0X20020047, "EFCALVERS");

   ParamImpl<String> T_EFAPNAME = new ParamImpl<String>('T', 0X20020048, "EFAPNAME");

   ParamImpl<String> T_DETSTATUS = new ParamImpl<String>('T', 0X20020049, "DETSTATUS");

   ParamImpl<Float> F_DLCALFAC4 = new ParamImpl<Float>('F', 0X2002004, "DLCALFAC4");

   ParamImpl<Float> F_DLCALFAC5 = new ParamImpl<Float>('F', 0X2002004, "DLCALFAC5");

   ParamImpl<Float> F_DLCALFAC6 = new ParamImpl<Float>('F', 0X2002004, "DLCALFAC6");

   ParamImpl<Object> G_LERRMAT8 = new ParamImpl<Object>('G', 0X2002004, "LERRMAT8");

   ParamImpl<Object> G_LERRMAT9 = new ParamImpl<Object>('G', 0X2002004, "LERRMAT9");

   ParamImpl<Object> G_LERRMAT10 = new ParamImpl<Object>('G', 0X2002004, "LERRMAT10");

   ParamImpl<Object> G_LERRMAT11 = new ParamImpl<Object>('G', 0X20020050, "LERRMAT11");

   ParamImpl<Float> F_DHCALFAC7 = new ParamImpl<Float>('F', 0X20020051, "DHCALFAC7");

   ParamImpl<Float> F_DHCALFAC8 = new ParamImpl<Float>('F', 0X20020052, "DHCALFAC8");

   ParamImpl<Float> F_DHCALFAC9 = new ParamImpl<Float>('F', 0X20020053, "DHCALFAC9");

   ParamImpl<Float> F_DHCALFAC10 = new ParamImpl<Float>('F', 0X20020054, "DHCALFAC10");

   ParamImpl<Object> G_HERRMAT10 = new ParamImpl<Object>('G', 0X20020055, "HERRMAT10");

   ParamImpl<Object> G_HERRMAT11 = new ParamImpl<Object>('G', 0X20020056, "HERRMAT11");

   ParamImpl<Object> G_HERRMAT12 = new ParamImpl<Object>('G', 0X20020057, "HERRMAT12");

   ParamImpl<Object> G_HERRMAT13 = new ParamImpl<Object>('G', 0X20020058, "HERRMAT13");

   ParamImpl<Object> G_HERRMAT14 = new ParamImpl<Object>('G', 0X20020059, "HERRMAT14");

   ParamImpl<Object> G_HERRMAT15 = new ParamImpl<Object>('G', 0X2002005, "HERRMAT15");

   ParamImpl<Object> G_HERRMAT16 = new ParamImpl<Object>('G', 0X2002005, "HERRMAT16");

   ParamImpl<Object> G_HERRMAT17 = new ParamImpl<Object>('G', 0X2002005, "HERRMAT17");

   ParamImpl<Object> G_HERRMAT18 = new ParamImpl<Object>('G', 0X2002005, "HERRMAT18");

   ParamImpl<Object> G_HERRMAT19 = new ParamImpl<Object>('G', 0X2002005, "HERRMAT19");

   ParamImpl<Long> L_LNDEGREE = new ParamImpl<Long>('L', 0X2002005, "LNDEGREE");

   ParamImpl<Float> F_LNCALFAC1 = new ParamImpl<Float>('F', 0X20020060, "LNCALFAC1");

   ParamImpl<Float> F_LNCALFAC2 = new ParamImpl<Float>('F', 0X20020061, "LNCALFAC2");

   ParamImpl<Float> F_LNCALFAC3 = new ParamImpl<Float>('F', 0X20020062, "LNCALFAC3");

   ParamImpl<Float> F_LNCALFAC4 = new ParamImpl<Float>('F', 0X20020063, "LNCALFAC4");

   ParamImpl<Float> F_LNCALFAC5 = new ParamImpl<Float>('F', 0X20020064, "LNCALFAC5");

   ParamImpl<Float> F_LNCALFAC6 = new ParamImpl<Float>('F', 0X20020065, "LNCALFAC6");

   ParamImpl<Float> F_LNCALFAC7 = new ParamImpl<Float>('F', 0X20020066, "LNCALFAC7");

   ParamImpl<Float> F_LNCALFAC8 = new ParamImpl<Float>('F', 0X20020067, "LNCALFAC8");

   ParamImpl<Float> F_LNCALFAC9 = new ParamImpl<Float>('F', 0X20020068, "LNCALFAC9");

   ParamImpl<Float> F_LNCALFAC10 = new ParamImpl<Float>('F', 0X20020069, "LNCALFAC10");

   ParamImpl<Float> F_LNCHISQ = new ParamImpl<Float>('F', 0X2002006, "LNCHISQ");

   ParamImpl<Object> G_LNERRMAT1 = new ParamImpl<Object>('G', 0X2002006, "LNERRMAT1");

   ParamImpl<Object> G_LNERRMAT2 = new ParamImpl<Object>('G', 0X2002006, "LNERRMAT2");

   ParamImpl<Object> G_LNERRMAT3 = new ParamImpl<Object>('G', 0X2002006, "LNERRMAT3");

   ParamImpl<Object> G_LNERRMAT4 = new ParamImpl<Object>('G', 0X2002006, "LNERRMAT4");

   ParamImpl<Object> G_LNERRMAT5 = new ParamImpl<Object>('G', 0X2002006, "LNERRMAT5");

   ParamImpl<Object> G_LNERRMAT6 = new ParamImpl<Object>('G', 0X20020070, "LNERRMAT6");

   ParamImpl<Object> G_LNERRMAT7 = new ParamImpl<Object>('G', 0X20020071, "LNERRMAT7");

   ParamImpl<Object> G_LNERRMAT8 = new ParamImpl<Object>('G', 0X20020072, "LNERRMAT8");

   ParamImpl<Object> G_LNERRMAT9 = new ParamImpl<Object>('G', 0X20020073, "LNERRMAT9");

   ParamImpl<Object> G_LNERRMAT10 = new ParamImpl<Object>('G', 0X20020074, "LNERRMAT10");

   ParamImpl<Object> G_LNERRMAT11 = new ParamImpl<Object>('G', 0X20020075, "LNERRMAT11");

   ParamImpl<Object> G_LNERRMAT12 = new ParamImpl<Object>('G', 0X20020076, "LNERRMAT12");

   ParamImpl<Object> G_LNERRMAT13 = new ParamImpl<Object>('G', 0X20020077, "LNERRMAT13");

   ParamImpl<Object> G_LNERRMAT14 = new ParamImpl<Object>('G', 0X20020078, "LNERRMAT14");

   ParamImpl<Object> G_LNERRMAT15 = new ParamImpl<Object>('G', 0X20020079, "LNERRMAT15");

   ParamImpl<Object> G_LNERRMAT16 = new ParamImpl<Object>('G', 0X2002007, "LNERRMAT16");

   ParamImpl<Object> G_LNERRMAT17 = new ParamImpl<Object>('G', 0X2002007, "LNERRMAT17");

   ParamImpl<Object> G_LNERRMAT18 = new ParamImpl<Object>('G', 0X2002007, "LNERRMAT18");

   ParamImpl<Object> G_LNERRMAT19 = new ParamImpl<Object>('G', 0X2002007, "LNERRMAT19");

   ParamImpl<Long> L_DLDEGREE = new ParamImpl<Long>('L', 0X2002007, "DLDEGREE");

   ParamImpl<Date> X_EFAPDATE = new ParamImpl<Date>('X', 0X2002007, "EFAPDATE");

   ParamImpl<Long> L_USEAVRG = new ParamImpl<Long>('L', 0X20020080, "USEAVRG");

   ParamImpl<Float> F_CWTORDENSI = new ParamImpl<Float>('F', 0X20020081, "CWTORDENSI");

   ParamImpl<Float> F_CWTORDENSIER = new ParamImpl<Float>('F', 0X20020082, "CWTORDENSIER");

   ParamImpl<String> T_ISOCSFILE = new ParamImpl<String>('T', 0X20020083, "ISOCSFILE");

   ParamImpl<String> T_EFFDENSTYP = new ParamImpl<String>('T', 0X20020084, "EFFDENSTYP");

   ParamImpl<Long> L_DEFFPTID = new ParamImpl<Long>('L', 0X20020085, "DEFFPTID");

   ParamImpl<Long> L_DEFFFLAGS = new ParamImpl<Long>('L', 0X20020086, "DEFFFLAGS");

   ParamImpl<Long> L_DEFFCSCDONE = new ParamImpl<Long>('L', 0X20020087, "DEFFCSCDONE");

   ParamImpl<Float> F_DEFFCOICF = new ParamImpl<Float>('F', 0X20020088, "DEFFCOICF");

   ParamImpl<Float> F_DEFFCOICFERR = new ParamImpl<Float>('F', 0X20020089, "DEFFCOICFERR");

   ParamImpl<Long> L_DCALFDEFAULT = new ParamImpl<Long>('L', 0X2002008, "DCALFDEFAULT");

   ParamImpl<Object> V_DCAL_USEAVRG = new ParamImpl<Object>('V', 0X00000000, "DCAL_USEAVRG");

   ParamImpl<Object> M_DCAL_USEAVRG = new ParamImpl<Object>('M', 0X00000001, "DCAL_USEAVRG");

   ParamImpl<Object> V_DCAL_USEEMPEFF = new ParamImpl<Object>('V', 0X00000001, "DCAL_USEEMPEFF");

   ParamImpl<Object> M_DCAL_USEEMPEFF = new ParamImpl<Object>('M', 0X00000002, "DCAL_USEEMPEFF");

   ParamImpl<Object> V_DCAL_USELUNGCNT = new ParamImpl<Object>('V', 0X00000002, "DCAL_USELUNGCNT");

   ParamImpl<Object> M_DCAL_USELUNGCNT = new ParamImpl<Object>('M', 0X00000004, "DCAL_USELUNGCNT");

   ParamImpl<Object> V_DCAL_GEOMNOTAPP = new ParamImpl<Object>('V', 0X00000003, "DCAL_GEOMNOTAPP");

   ParamImpl<Object> M_DCAL_GEOMNOTAPP = new ParamImpl<Object>('M', 0X00000008, "DCAL_GEOMNOTAPP");

   ParamImpl<Object> V_DCAL_MCFITFAIL = new ParamImpl<Object>('V', 0X00000004, "DCAL_MCFITFAIL");

   ParamImpl<Object> M_DCAL_MCFITFAIL = new ParamImpl<Object>('M', 0X00000010, "DCAL_MCFITFAIL");

   ParamImpl<Object> V_DCAL_DLILLCON = new ParamImpl<Object>('V', 0X00000005, "DCAL_DLILLCON");

   ParamImpl<Object> M_DCAL_DLILLCON = new ParamImpl<Object>('M', 0X00000020, "DCAL_DLILLCON");

   ParamImpl<Object> V_DCAL_DHILLCON = new ParamImpl<Object>('V', 0X00000006, "DCAL_DHILLCON");

   ParamImpl<Object> M_DCAL_DHILLCON = new ParamImpl<Object>('M', 0X00000040, "DCAL_DHILLCON");

   ParamImpl<Object> V_DCAL_LINILLCON = new ParamImpl<Object>('V', 0X00000007, "DCAL_LINILLCON");

   ParamImpl<Object> M_DCAL_LINILLCON = new ParamImpl<Object>('M', 0X00000080, "DCAL_LINILLCON");

   ParamImpl<Object> V_DCAL_EMPILLCON = new ParamImpl<Object>('V', 0X00000008, "DCAL_EMPILLCON");

   ParamImpl<Object> M_DCAL_EMPILLCON = new ParamImpl<Object>('M', 0X00000100, "DCAL_EMPILLCON");

   ParamImpl<Object> V_DCAL_DLOVERFIT = new ParamImpl<Object>('V', 0X00000009, "DCAL_DLOVERFIT");

   ParamImpl<Object> M_DCAL_DLOVERFIT = new ParamImpl<Object>('M', 0X00000200, "DCAL_DLOVERFIT");

   ParamImpl<Object> V_DCAL_DHOVERFIT = new ParamImpl<Object>('V', 0X0000000, "DCAL_DHOVERFIT");

   ParamImpl<Object> M_DCAL_DHOVERFIT = new ParamImpl<Object>('M', 0X00000400, "DCAL_DHOVERFIT");

   ParamImpl<Object> V_DCAL_LINOVERFIT = new ParamImpl<Object>('V', 0X0000000, "DCAL_LINOVERFIT");

   ParamImpl<Object> M_DCAL_LINOVERFIT = new ParamImpl<Object>('M', 0X00000800, "DCAL_LINOVERFIT");

   ParamImpl<Object> V_DCAL_EMPOVERFIT = new ParamImpl<Object>('V', 0X0000000, "DCAL_EMPOVERFIT");

   ParamImpl<Object> M_DCAL_EMPOVERFIT = new ParamImpl<Object>('M', 0X00001000, "DCAL_EMPOVERFIT");

   ParamImpl<Object> V_DCAL_DEFAULT = new ParamImpl<Object>('V', 0X0000000, "DCAL_DEFAULT");

   ParamImpl<Object> M_DCAL_DEFAULT = new ParamImpl<Object>('M', 0X00002000, "DCAL_DEFAULT");

   ParamImpl<Object> V_DEFF_CSCDONE = new ParamImpl<Object>('V', 0X00000000, "DEFF_CSCDONE");

   ParamImpl<Object> M_DEFF_CSCDONE = new ParamImpl<Object>('M', 0X00000001, "DEFF_CSCDONE");

   ParamImpl<Long> L_DISPFLAGS = new ParamImpl<Long>('L', 0X20040002, "DISPFLAGS");

   ParamImpl<Long> L_DISPSCH = new ParamImpl<Long>('L', 0X20040003, "DISPSCH");

   ParamImpl<Float> F_DISPSCHEN = new ParamImpl<Float>('F', 0X20040004, "DISPSCHEN");

   ParamImpl<Long> L_DISPSROW = new ParamImpl<Long>('L', 0X20040005, "DISPSROW");

   ParamImpl<Float> F_DISPSROWEN = new ParamImpl<Float>('F', 0X20040006, "DISPSROWEN");

   ParamImpl<Long> L_DISPECH = new ParamImpl<Long>('L', 0X20040007, "DISPECH");

   ParamImpl<Float> F_DISPECHEN = new ParamImpl<Float>('F', 0X20040008, "DISPECHEN");

   ParamImpl<Long> L_DISPEROW = new ParamImpl<Long>('L', 0X20040009, "DISPEROW");

   ParamImpl<Float> F_DISPEROWEN = new ParamImpl<Float>('F', 0X2004000, "DISPEROWEN");

   ParamImpl<Long> L_DISPSCOUNT = new ParamImpl<Long>('L', 0X2004000, "DISPSCOUNT");

   ParamImpl<Long> L_DISPECOUNT = new ParamImpl<Long>('L', 0X2004000, "DISPECOUNT");

   ParamImpl<Long> L_DISPGROUP = new ParamImpl<Long>('L', 0X2004000, "DISPGROUP");

   ParamImpl<Long> L_DISPCRATE = new ParamImpl<Long>('L', 0X2004000, "DISPCRATE");

   ParamImpl<BigInteger> Q_DISPTCOUNT = new ParamImpl<BigInteger>('Q', 0X2004000, "DISPTCOUNT");

   ParamImpl<BigInteger> Q_DISPNETCOUNT = new ParamImpl<BigInteger>('Q', 0X20040010, "DISPNETCOUNT");

   ParamImpl<BigInteger> Q_DISPBCKCOUNT = new ParamImpl<BigInteger>('Q', 0X20040011, "DISPBCKCOUNT");

   ParamImpl<Long> L_LMARKCH = new ParamImpl<Long>('L', 0X20040012, "LMARKCH");

   ParamImpl<Float> F_LMARKCHEN = new ParamImpl<Float>('F', 0X20040013, "LMARKCHEN");

   ParamImpl<Long> L_LMARKROW = new ParamImpl<Long>('L', 0X20040014, "LMARKROW");

   ParamImpl<Float> F_LMARKROWEN = new ParamImpl<Float>('F', 0X20040015, "LMARKROWEN");

   ParamImpl<Long> L_RMARKCH = new ParamImpl<Long>('L', 0X20040016, "RMARKCH");

   ParamImpl<Float> F_RMARKCHEN = new ParamImpl<Float>('F', 0X20040017, "RMARKCHEN");

   ParamImpl<Long> L_RMARKROW = new ParamImpl<Long>('L', 0X20040018, "RMARKROW");

   ParamImpl<Float> F_RMARKROWEN = new ParamImpl<Float>('F', 0X20040019, "RMARKROWEN");

   ParamImpl<Long> L_CURSORCH = new ParamImpl<Long>('L', 0X2004001, "CURSORCH");

   ParamImpl<Float> F_CURSORCHEN = new ParamImpl<Float>('F', 0X2004001, "CURSORCHEN");

   ParamImpl<Long> L_CURSORROW = new ParamImpl<Long>('L', 0X2004001, "CURSORROW");

   ParamImpl<Float> F_CURSORROWEN = new ParamImpl<Float>('F', 0X2004001, "CURSORROWEN");
}
