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

package cx.jbzdak.diesIrae.genieConnector;

import cx.jbzdak.diesIrae.genieConnector.enums.param.Parameter;

import java.math.BigInteger;

/**
 * Created by IntelliJ IDEA.
 * User: Jacek Bzdak jbzdak@gmail.com
 */
class QuadWordParam extends ParameterType<BigInteger> {

   QuadWordParam() {
      super("QUAD_WORD", 'Q');
   }

   @Override
   public BigInteger readParam(GenieLibrary library, DscPointer dscPointer, Parameter param, short usRecord, short usEntry) throws ConnectorException {
      throw new UnsupportedOperationException();
   }

   @Override
   public void writeParam(GenieLibrary library, BigInteger value, DscPointer dscPointer, Parameter param, short usRecord, short usEntry) throws ConnectorException {
      throw new UnsupportedOperationException();
   }
}