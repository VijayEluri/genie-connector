package cx.jbzdak.diesIrae.genieConnector.enums;

import com.sun.jna.Structure;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: jbzdak
 * Date: 2009-08-06
 * Time: 13:33:27
 */
public enum StructureType {
   DSPreset(cx.jbzdak.diesIrae.genieConnector.structs.DSPreset.class, (short)36);

   private final Class<? extends Structure> structureClass;

   private final short structureId;

   private static final Map<Class<? extends Structure>, Short> mappings;

   static{
      Map<Class<? extends Structure>, Short> mappings2 = new HashMap<Class<? extends Structure>, Short>();
      for(StructureType type : StructureType.values()){
         mappings2.put(type.getStructureClass(), type.getStructureId());
      }
      mappings = Collections.unmodifiableMap(mappings2);
   }

   public static short getStructureId(Structure structure){
      if(structure==null){
         throw new IllegalArgumentException();
      }
      Short result = mappings.get(structure.getClass());
      if(result == null){
         throw new IllegalArgumentException("Unknown structure id");
      }
      return result;        
   }

   StructureType(Class<? extends Structure> structureClass, short structureId) {
      this.structureClass = structureClass;
      this.structureId = structureId;
   }

   public Class<? extends Structure> getStructureClass() {
      return structureClass;
   }

   public short getStructureId() {
      return structureId;
   }
}