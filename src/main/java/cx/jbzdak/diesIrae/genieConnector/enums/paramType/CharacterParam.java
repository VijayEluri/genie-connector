package cx.jbzdak.diesIrae.genieConnector.enums.paramType;

import com.sun.jna.Native;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Jacek Bzdak jbzdak@gmail.com
 */
@SuppressWarnings({"ALL"})
class CharacterParam extends ParameterType<String> {

    private static final Map<String, Integer> NAME_TO_LENGHT_MAPPER;

    
    private static final Charset ASCII = Charset.forName("ASCII");

    CharacterParam() {
        super("STRING", 'T', -1);
    }

    @Override
    public String readArray(byte[] inputBuffer) {
        return Native.toString(inputBuffer);
    }

    @Override
    public byte[] writeArray(String s) {
        return Native.toByteArray(s);
    }

    @Override
    public short getByteLenght(String paramName) {
        return NAME_TO_LENGHT_MAPPER.get(paramName).shortValue();
    }

    static {
        Map<String, Integer> mapper = new HashMap<String, Integer>();
        mapper.put("AASANALYST", 17);
        mapper.put("AASCALDBR", 9);
        mapper.put("AASCONTAINER", 17);
        mapper.put("AASCURVEID", 17);
        mapper.put("AASDETNAME", 17);
        mapper.put("AASFILE", 97);
        mapper.put("AASHZBCKDBR", 9);
        mapper.put("AASHZEFFDBR", 9);
        mapper.put("AASMATFILE", 129);
        mapper.put("AASREFFILE", 129);
        mapper.put("AASRPNTFILE", 97);
        mapper.put("ACARCHNAME", 97);
        mapper.put("ACARGS1", 33);
        mapper.put("ACARGS2", 33);
        mapper.put("ACARGS3", 33);
        mapper.put("ACARGS4", 33);
        mapper.put("ACBATCHQ", 33);
        mapper.put("ACCOPNAME", 17);
        mapper.put("ACCTITLE", 65);
        mapper.put("ACCVERSION", 17);
        mapper.put("ACENGNAME", 17);
        mapper.put("ACQINPUTID", 13);
        mapper.put("ACQMOD", 5);
        mapper.put("ACQMODE", 5);
        mapper.put("ACQOPNAME", 33);
        mapper.put("ACTADJVERS", 17);
        mapper.put("ACTARG1", 33);
        mapper.put("ACTARG2", 17);
        mapper.put("ACTARG3", 17);
        mapper.put("ACTEMPLATE", 97);
        mapper.put("ACTIVUNITS", 17);
        mapper.put("ACTLVLVERS", 17);
        mapper.put("ADCACQMODE", 9);
        mapper.put("ADCADDRESS", 11);
        mapper.put("ADCID", 9);
        mapper.put("ADCPNAME", 32);
        mapper.put("ADCTYPE", 9);
        mapper.put("ALPHMSTDS", 97);
        mapper.put("ALPMSTDS", 97);
        mapper.put("ALTINPUT1", 97);
        mapper.put("ALTINPUT10", 97);
        mapper.put("ALTINPUT11", 97);
        mapper.put("ALTINPUT12", 97);
        mapper.put("ALTINPUT13", 97);
        mapper.put("ALTINPUT14", 97);
        mapper.put("ALTINPUT15", 97);
        mapper.put("ALTINPUT16", 97);
        mapper.put("ALTINPUT17", 97);
        mapper.put("ALTINPUT18", 97);
        mapper.put("ALTINPUT19", 97);
        mapper.put("ALTINPUT2", 97);
        mapper.put("ALTINPUT20", 97);
        mapper.put("ALTINPUT21", 97);
        mapper.put("ALTINPUT22", 97);
        mapper.put("ALTINPUT23", 97);
        mapper.put("ALTINPUT24", 97);
        mapper.put("ALTINPUT25", 97);
        mapper.put("ALTINPUT26", 97);
        mapper.put("ALTINPUT27", 97);
        mapper.put("ALTINPUT28", 97);
        mapper.put("ALTINPUT29", 97);
        mapper.put("ALTINPUT3", 97);
        mapper.put("ALTINPUT30", 97);
        mapper.put("ALTINPUT31", 97);
        mapper.put("ALTINPUT32", 97);
        mapper.put("ALTINPUT33", 97);
        mapper.put("ALTINPUT34", 97);
        mapper.put("ALTINPUT35", 97);
        mapper.put("ALTINPUT36", 97);
        mapper.put("ALTINPUT4", 97);
        mapper.put("ALTINPUT5", 97);
        mapper.put("ALTINPUT6", 97);
        mapper.put("ALTINPUT7", 97);
        mapper.put("ALTINPUT8", 97);
        mapper.put("ALTINPUT9", 97);
        mapper.put("AMPADDRESS", 11);
        mapper.put("AMPBLRTYPE", 9);
        mapper.put("AMPDTCTYPE", 9);
        mapper.put("AMPFDMODE", 9);
        mapper.put("AMPID", 9);
        mapper.put("AMPSHAPEMODE", 9);
        mapper.put("AMPTYPE", 9);
        mapper.put("AMQNAME", 97);
        mapper.put("AMRADVERS", 17);
        mapper.put("AMRCMVERS", 17);
        mapper.put("AMRDPVERS", 17);
        mapper.put("AMRNUCLIDE", 9);
        mapper.put("AMROPNAME", 17);
        mapper.put("AMRRECTYPE", 9);
        mapper.put("AMRTCDESC", 65);
        mapper.put("AMRTNHLU", 2);
        mapper.put("AMRTRVERS", 17);
        mapper.put("AREFHLFUNITS", 2);
        mapper.put("ASPSTR", 33);
        mapper.put("ASTMCALMATER", 65);
        mapper.put("ASTMCALMATRX", 33);
        mapper.put("ASTMCANALYST", 17);
        mapper.put("ASTMCNUCLIDE", 9);
        mapper.put("ASTMNCCALFIL", 97);
        mapper.put("BUILDUPTYPE", 9);
        mapper.put("CALVERS", 17);
        mapper.put("CHAIR", 17);
        mapper.put("CHAMBERSTAT", 9);
        mapper.put("CHANGERID", 9);
        mapper.put("CHANGERTYPE", 9);
        mapper.put("CNUCLIB", 97);
        mapper.put("COILIBVERS", 17);
        mapper.put("CONTATTFILE", 97);
        mapper.put("CPNAME", 33);
        mapper.put("CTFASTMMATER", 65);
        mapper.put("CTFASTMMATRX", 33);
        mapper.put("CTFAUNITS", 5);
        mapper.put("CTFEUNITS", 5);
        mapper.put("CTFHLFUNITS", 3);
        mapper.put("CTFNAME", 65);
        mapper.put("CTFNUCL", 9);
        mapper.put("CTITLE", 33);
        mapper.put("DASID", 17);
        mapper.put("DASLOC", 17);
        mapper.put("DDAFILE", 97);
        mapper.put("DDAISOSRC", 9);
        mapper.put("DDAVERSION", 17);
        mapper.put("DETECTOR", 17);
        mapper.put("DETENGTYPE", 9);
        mapper.put("DETID", 13);
        mapper.put("DETNAME", 17);
        mapper.put("DETSTATUS", 33);
        mapper.put("DETTYPE", 9);
        mapper.put("DETYP", 9);
        mapper.put("DIFPCDESC", 65);
        mapper.put("DIFPNUCLIDE", 9);
        mapper.put("DIFPOPNAME", 17);
        mapper.put("DIFPVERS", 13);
        mapper.put("DISPMODE", 5);
        mapper.put("DISSTR1", 21);
        mapper.put("DISSTR2", 21);
        mapper.put("DISSTR3", 21);
        mapper.put("DISSTR4", 21);
        mapper.put("DISSTR5", 21);
        mapper.put("DISSTR6", 21);
        mapper.put("DOSEUNITS", 9);
        mapper.put("DSNNAME", 129);
        mapper.put("DSPVERSION", 9);
        mapper.put("DSSADDRESS", 11);
        mapper.put("DSSID", 9);
        mapper.put("DSSTYPE", 9);
        mapper.put("DSSWIN1MODE", 5);
        mapper.put("DSSWIN2MODE", 5);
        mapper.put("ECALTYPE", 9);
        mapper.put("ECALUNITS", 17);
        mapper.put("ECOPNAME", 25);
        mapper.put("EFAPNAME", 25);
        mapper.put("EFCALVERS", 17);
        mapper.put("EFFCALFILE", 97);
        mapper.put("EFFDENSTYP", 37);
        mapper.put("EFFTYPE", 9);
        mapper.put("EFOPNAME", 25);
        mapper.put("EMQNAME", 97);
        mapper.put("ENBACKVERS", 17);
        mapper.put("EXPBACK", 97);
        mapper.put("EXPCERT", 97);
        mapper.put("EXPCONTROL", 97);
        mapper.put("EXPDDFNAME", 33);
        mapper.put("EXPDSTUNITS", 5);
        mapper.put("EXPHCOUT", 11);
        mapper.put("EXPHDR1", 97);
        mapper.put("EXPHDR2", 97);
        mapper.put("EXPICRP", 5);
        mapper.put("EXPINT", 97);
        mapper.put("EXPLIB", 97);
        mapper.put("EXPNDARSECS", 251);
        mapper.put("EXPPLTDEV", 17);
        mapper.put("EXPTITLE", 41);
        mapper.put("FILESVCE1", 97);
        mapper.put("FILESVCE2", 97);
        mapper.put("FLTADDRESS", 11);
        mapper.put("FLTID", 9);
        mapper.put("FLTTYPE", 9);
        mapper.put("FWCALTYPE", 9);
        mapper.put("GAINADDRESS", 11);
        mapper.put("GAINID", 9);
        mapper.put("GAINSHIFT", 5);
        mapper.put("GAINTYPE", 9);
        mapper.put("GAMMADEF", 97);
        mapper.put("GEOMETRY", 17);
        mapper.put("GISFILE", 97);
        mapper.put("GUISAMPFPL", 97);
        mapper.put("HVPSADDRESS", 11);
        mapper.put("HVPSID", 9);
        mapper.put("HVPSTYPE", 9);
        mapper.put("INTERFRED", 9);
        mapper.put("INTERFRING", 9);
        mapper.put("INTERFVERS", 17);
        mapper.put("INTREDN", 9);
        mapper.put("INTRINGN", 9);
        mapper.put("ISOCSFILE", 97);
        mapper.put("KCANALYST", 17);
        mapper.put("KCDESCRIP", 65);
        mapper.put("KEDREFSPEC", 97);
        mapper.put("KRANALVERS", 65);
        mapper.put("KRPROTOCOL", 65);
        mapper.put("LACEVERS", 17);
        mapper.put("LDROIFILE", 97);
        mapper.put("LFCADDRESS", 11);
        mapper.put("LFCID", 9);
        mapper.put("LFCTYPE", 9);
        mapper.put("LIBNAME", 33);
        mapper.put("MACFILE", 97);
        mapper.put("MACFILE2", 97);
        mapper.put("MACFILE3", 97);
        mapper.put("MACFILE4", 97);
        mapper.put("MACFILE5", 97);
        mapper.put("MCAHWVERSION", 9);
        mapper.put("MCAID", 9);
        mapper.put("MCATYPE", 9);
        mapper.put("MCRISONAME", 9);
        mapper.put("MCRVERSION", 17);
        mapper.put("MCSADDRESS", 11);
        mapper.put("MCSCDSRC", 5);
        mapper.put("MCSCRGNDESC", 33);
        mapper.put("MCSCUNITS", 5);
        mapper.put("MCSDISCMODE", 9);
        mapper.put("MCSID", 9);
        mapper.put("MCSTYPE", 9);
        mapper.put("MDAVERS", 17);
        mapper.put("MEASISOFILE", 97);
        mapper.put("MGAHEFILE", 33);
        mapper.put("MGAHIGHFILE", 97);
        mapper.put("MGALEFILE", 33);
        mapper.put("MGANIDVERS", 17);
        mapper.put("MGAPU242TYP", 13);
        mapper.put("MGAUCALFILE", 97);
        mapper.put("MGAVERSION", 17);
        mapper.put("MIDPATH", 33);
        mapper.put("MUXID", 9);
        mapper.put("MUXMODE", 9);
        mapper.put("MUXTYPE", 9);
        mapper.put("NAAINTFVERS", 17);
        mapper.put("NACQAASVERS", 17);
        mapper.put("NACQANALYST", 17);
        mapper.put("NACQAWAMASST", 17);
        mapper.put("NACQAWAMDAT", 17);
        mapper.put("NACQDECAYVER", 17);
        mapper.put("NACQFILTER", 45);
        mapper.put("NACQISOSRC", 13);
        mapper.put("NACQMEASVERS", 17);
        mapper.put("NACQNEUTENG", 17);
        mapper.put("NACQNORMVERS", 17);
        mapper.put("NBAREMCSFILE", 97);
        mapper.put("NBARRMCSFILE", 97);
        mapper.put("NCLCONTROLDS", 33);
        mapper.put("NCLCSCVERS", 17);
        mapper.put("NCLDACLAB", 17);
        mapper.put("NCLDACTYPE", 3);
        mapper.put("NCLDAUGHT", 9);
        mapper.put("NCLECATYPE", 2);
        mapper.put("NCLECWTYPE", 2);
        mapper.put("NCLGRPNAME", 9);
        mapper.put("NCLHLFUNITS", 3);
        mapper.put("NCLLEV1UNITS", 9);
        mapper.put("NCLLEV2UNITS", 9);
        mapper.put("NCLMPC1AU", 9);
        mapper.put("NCLMPC1QU", 9);
        mapper.put("NCLMPC2AU", 9);
        mapper.put("NCLMPC2QU", 9);
        mapper.put("NCLMPC3AU", 9);
        mapper.put("NCLMPC3QU", 9);
        mapper.put("NCLMPC4AU", 9);
        mapper.put("NCLMPC4QU", 9);
        mapper.put("NCLMPC5AU", 9);
        mapper.put("NCLMPC5QU", 9);
        mapper.put("NCLMPC6AU", 9);
        mapper.put("NCLMPC6QU", 9);
        mapper.put("NCLMPC7AU", 9);
        mapper.put("NCLMPC7QU", 9);
        mapper.put("NCLMPC8AU", 9);
        mapper.put("NCLMPC8QU", 9);
        mapper.put("NCLMPCLAB1", 17);
        mapper.put("NCLMPCLAB2", 17);
        mapper.put("NCLMPCLAB3", 17);
        mapper.put("NCLMPCLAB4", 17);
        mapper.put("NCLMPCLAB5", 17);
        mapper.put("NCLMPCLAB6", 17);
        mapper.put("NCLMPCLAB7", 17);
        mapper.put("NCLMPCLAB8", 17);
        mapper.put("NCLNAME", 9);
        mapper.put("NCLNUCSVERS", 17);
        mapper.put("NCLOBSERVED", 9);
        mapper.put("NCLPARENT", 9);
        mapper.put("NCLPDCVERS", 17);
        mapper.put("NCLPT20AU", 9);
        mapper.put("NCLPT20QU", 9);
        mapper.put("NCLRESSRC", 5);
        mapper.put("NCLRSTYPE", 2);
        mapper.put("NCLSBHDR", 17);
        mapper.put("NCLTITLE", 65);
        mapper.put("NDCLAMSRC", 17);
        mapper.put("NDCLIDENT", 17);
        mapper.put("NDCLISONAME", 17);
        mapper.put("NDCLNAME", 9);
        mapper.put("NDCLPUMUNITS", 9);
        mapper.put("NDCLPUSRC", 17);
        mapper.put("NDCLSTYPE", 17);
        mapper.put("NDCLTITLE", 65);
        mapper.put("NDETANALYST", 17);
        mapper.put("NDETNAME", 17);
        mapper.put("NEFFANALYST", 17);
        mapper.put("NEFFCALDBR", 9);
        mapper.put("NEFFCURVEID", 17);
        mapper.put("NEFFDETNAME", 17);
        mapper.put("NEFFRCNTFILE", 97);
        mapper.put("NEFFSTIDENT", 17);
        mapper.put("NEFFSTTITLE", 65);
        mapper.put("NEUTBACKFILE", 97);
        mapper.put("NFLUXMONFILE", 97);
        mapper.put("NIDCOMBVERS", 17);
        mapper.put("NIDVERS", 17);
        mapper.put("NLECUNITS", 17);
        mapper.put("NLPEAKORIGIN", 2);
        mapper.put("NSHLDMCSFILE", 97);
        mapper.put("NSPRIDENT", 17);
        mapper.put("NSPRNAME", 9);
        mapper.put("NSPRTITLE", 65);
        mapper.put("NUCLPKFLTR", 13);
        mapper.put("PASSIVENFILE", 97);
        mapper.put("PDDAFILE", 97);
        mapper.put("PDESC", 33);
        mapper.put("PEAKASF", 97);
        mapper.put("PEAKLIB", 97);
        mapper.put("PEAKVERS", 17);
        mapper.put("PERRNAME", 17);
        mapper.put("PERRTYPE", 9);
        mapper.put("PILEUPVERS", 17);
        mapper.put("PKANALVERS", 17);
        mapper.put("PLOTSCALE", 5);
        mapper.put("PMNCLNAME", 13);
        mapper.put("PMTNIDVERS", 17);
        mapper.put("PNAME", 17);
        mapper.put("PNUCLIDE", 17);
        mapper.put("PPTYPE", 9);
        mapper.put("PPTYPEDESC", 17);
        mapper.put("PRAMPTYPE", 9);
        mapper.put("PRCFFIDUPKS", 33);
        mapper.put("PRCMFIDUPKS", 33);
        mapper.put("PRCOMBMATMOD", 9);
        mapper.put("PRDENSUNITS", 9);
        mapper.put("PREFFDENSTYP", 37);
        mapper.put("PRFIDUPEAKS", 81);
        mapper.put("PRKEDELEMNT1", 17);
        mapper.put("PRKEDELEMNT2", 17);
        mapper.put("PRMGAANALTYP", 9);
        mapper.put("PRMGAAVEPEAK", 9);
        mapper.put("PRMGAREFNUCL", 9);
        mapper.put("PRNEFFTYPE", 17);
        mapper.put("PRNEUTISOSRC", 13);
        mapper.put("PRNUDSNUCL", 9);
        mapper.put("PRPUMUNITS", 17);
        mapper.put("PRSSLTCTYPE", 17);
        mapper.put("PRSSP1", 17);
        mapper.put("PRSSP2", 17);
        mapper.put("PRSSP3", 17);
        mapper.put("PRTMUISOSRC", 9);
        mapper.put("PRVOLUNITS", 9);
        mapper.put("PSBACKTYPE", 2);
        mapper.put("PSFITENGNAME", 9);
        mapper.put("PSHUFFILE", 97);
        mapper.put("PSNUDSVERS", 17);
        mapper.put("PSTYPE", 9);
        mapper.put("PTCVERS", 17);
        mapper.put("PTSINIT", 5);
        mapper.put("PTSPLTDEV", 17);
        mapper.put("PTSREMARK", 65);
        mapper.put("PTSSRCID", 17);
        mapper.put("PULSERADDR", 13);
        mapper.put("PULSERID", 13);
        mapper.put("PULSERMODE", 9);
        mapper.put("PULSERTYPE", 9);
        mapper.put("PUNITS", 17);
        mapper.put("PWRMBATA", 5);
        mapper.put("PWRMBATB", 5);
        mapper.put("PWRMID", 9);
        mapper.put("PWRMMODE", 5);
        mapper.put("PWRMTYPE", 9);
        mapper.put("QAFILE", 97);
        mapper.put("QUANTGFILE", 97);
        mapper.put("RANALYST", 25);
        mapper.put("RAWNAME1", 97);
        mapper.put("RAWNAME2", 97);
        mapper.put("RBUILDUPTYPE", 9);
        mapper.put("RDFCNFNAME", 33);
        mapper.put("RDFILIBNAME", 33);
        mapper.put("RDFNLIBNAME", 33);
        mapper.put("RDFSIDENT", 17);
        mapper.put("RDFSTITLE", 65);
        mapper.put("RDFSTYPE", 2);
        mapper.put("RDFSUNITS", 17);
        mapper.put("RDFUNKNL", 33);
        mapper.put("RDFUSRSTR1", 9);
        mapper.put("REAGENTFILE", 97);
        mapper.put("REAGENTVERS", 17);
        mapper.put("REFHLFUNITS", 3);
        mapper.put("REPTEMPLATE", 97);
        mapper.put("ROIFILE", 83);
        mapper.put("ROIPSBTYP", 7);
        mapper.put("ROIPSTYP", 6);
        mapper.put("RPTSECTNAME", 17);
        mapper.put("RSAMPDESC", 64);
        mapper.put("RSAMPID", 17);
        mapper.put("RSUNITS", 17);
        mapper.put("SABSEQTYPE", 9);
        mapper.put("SADCHAR", 13);
        mapper.put("SADFILE", 97);
        mapper.put("SAMPASF1", 17);
        mapper.put("SAMPASF2", 17);
        mapper.put("SAMPFPL", 97);
        mapper.put("SAMPLEPT", 33);
        mapper.put("SAMPLERID", 17);
        mapper.put("SAMPLOG", 97);
        mapper.put("SANALNAME", 25);
        mapper.put("SARRDESC", 33);
        mapper.put("SARRNAME", 9);
        mapper.put("SASID", 17);
        mapper.put("SBATCHID", 17);
        mapper.put("SCADDRESS", 15);
        mapper.put("SCALVERS", 17);
        mapper.put("SCOLLINIT", 5);
        mapper.put("SCOLLNAME", 25);
        mapper.put("SCOPNAME", 25);
        mapper.put("SCTRDESC", 33);
        mapper.put("SCTRNAME", 9);
        mapper.put("SDESC1", 65);
        mapper.put("SDESC2", 65);
        mapper.put("SDESC3", 65);
        mapper.put("SDESC4", 65);
        mapper.put("SECENTNAME", 17);
        mapper.put("SECFULLNAME", 25);
        mapper.put("SECPASSWORD", 17);
        mapper.put("SELEMENT", 33);
        mapper.put("SEMPID", 13);
        mapper.put("SEMPLOYER", 33);
        mapper.put("SEMPNAME", 33);
        mapper.put("SFEACTUNITS", 17);
        mapper.put("SFEBACK", 33);
        mapper.put("SFECONFIG", 33);
        mapper.put("SFEHLFUNITS", 9);
        mapper.put("SFENUCLIDE", 9);
        mapper.put("SFGFAC", 65);
        mapper.put("SFREQUENCY", 17);
        mapper.put("SFTBPOS", 6);
        mapper.put("SGEOMTRY", 17);
        mapper.put("SGRPDESC", 33);
        mapper.put("SGRPNAME", 9);
        mapper.put("SHELF", 2);
        mapper.put("SIDENT", 17);
        mapper.put("SINFOFDS", 17);
        mapper.put("SINFOTYPE", 17);
        mapper.put("SJOBCODE", 33);
        mapper.put("SLENUNITS", 13);
        mapper.put("SLOCTN", 33);
        mapper.put("SMATRIX", 33);
        mapper.put("SNODENAME", 65);
        mapper.put("SOPINIT", 5);
        mapper.put("SPLINVERS", 17);
        mapper.put("SPLTNAME", 33);
        mapper.put("SPROCTYPE", 17);
        mapper.put("SPROTOCOL", 33);
        mapper.put("SPROTOFILE", 97);
        mapper.put("SRADDRESS", 11);
        mapper.put("SREASON", 61);
        mapper.put("SRGAMDETNAME", 17);
        mapper.put("SRIDENT", 17);
        mapper.put("SRWP", 17);
        mapper.put("SRWPLIST", 97);
        mapper.put("SSEX", 9);
        mapper.put("SSHELF", 9);
        mapper.put("SSPBSTR1", 65);
        mapper.put("SSPRSTR1", 17);
        mapper.put("SSPRSTR10", 17);
        mapper.put("SSPRSTR11", 17);
        mapper.put("SSPRSTR2", 17);
        mapper.put("SSPRSTR3", 17);
        mapper.put("SSPRSTR4", 17);
        mapper.put("SSPRSTR5", 17);
        mapper.put("SSPRSTR6", 17);
        mapper.put("SSPRSTR7", 17);
        mapper.put("SSPRSTR8", 17);
        mapper.put("SSPRSTR9", 17);
        mapper.put("SSTATUS", 9);
        mapper.put("SSTHGT", 6);
        mapper.put("SSURVENT", 25);
        mapper.put("SSURVID", 17);
        mapper.put("SSURVLOC", 17);
        mapper.put("STHYPOS", 6);
        mapper.put("STITLE", 65);
        mapper.put("STLDNUM", 6);
        mapper.put("STYPE", 17);
        mapper.put("SUCSTRING1", 256);
        mapper.put("SUCSTRING10", 33);
        mapper.put("SUCSTRING11", 33);
        mapper.put("SUCSTRING12", 17);
        mapper.put("SUCSTRING13", 17);
        mapper.put("SUCSTRING2", 256);
        mapper.put("SUCSTRING3", 256);
        mapper.put("SUCSTRING4", 256);
        mapper.put("SUCSTRING5", 17);
        mapper.put("SUCSTRING6", 17);
        mapper.put("SUCSTRING7", 17);
        mapper.put("SUCSTRING8", 17);
        mapper.put("SUCSTRING9", 256);
        mapper.put("SUNITS", 17);
        mapper.put("SURSTRING1", 256);
        mapper.put("SURSTRING10", 33);
        mapper.put("SURSTRING11", 65);
        mapper.put("SURSTRING12", 65);
        mapper.put("SURSTRING2", 256);
        mapper.put("SURSTRING3", 17);
        mapper.put("SURSTRING4", 17);
        mapper.put("SURSTRING5", 17);
        mapper.put("SURSTRING6", 17);
        mapper.put("SURSTRING7", 33);
        mapper.put("SURSTRING8", 33);
        mapper.put("SURSTRING9", 33);
        mapper.put("SVOLUNITS", 13);
        mapper.put("SWBCCTLR", 17);
        mapper.put("SWBCID", 6);
        mapper.put("SWBCSERPORT", 17);
        mapper.put("SWBCTYPE", 17);
        mapper.put("SWCONTMATRIX", 17);
        mapper.put("SWCONTSHAPE", 17);
        mapper.put("SWTUNITS", 13);
        mapper.put("TGSEMROIFILE", 97);
        mapper.put("TNIDLIB", 97);
        mapper.put("TRANSFILE", 97);
        mapper.put("UIDIR", 33);
        mapper.put("VACADDRESS", 13);
        mapper.put("VACDEVID", 13);
        mapper.put("VACDEVTYPE", 9);
        mapper.put("VACSTATUS", 9);
        mapper.put("VACVALVE", 9);
        mapper.put("VARNAME", 17);
        mapper.put("VOLMATFILE", 129);
        mapper.put("VOLREFFILE", 129);
        mapper.put("WACQADDRESS", 13);
        mapper.put("WACQMCTYPE", 9);
        mapper.put("WACQPASSMODE", 17);
        mapper.put("WBCOUNTER", 25);
        mapper.put("WDRISONAME", 9);
        mapper.put("WDRVERSION", 17);
        mapper.put("WEIGHTING", 8);
        mapper.put("WGRTMUNAME", 9);
        mapper.put("WGRVERSION", 17);
        mapper.put("WNRISONAME", 9);
        mapper.put("WNRVERSION", 17);
        mapper.put("WTMEANVERS", 17);
        NAME_TO_LENGHT_MAPPER = Collections.unmodifiableMap(mapper);
    }
}
