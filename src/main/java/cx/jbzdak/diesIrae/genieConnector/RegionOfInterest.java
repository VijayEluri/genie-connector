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

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Created by IntelliJ IDEA.
 * User: Jacek Bzdak jbzdak@gmail.com
 */
public class RegionOfInterest {

   private final short startChannel;

   private final short endChannel;

   private final SpectrometricResult internal;

   public RegionOfInterest(short startChannel, short endChannel, SpectrometricResult internal) {
      this.startChannel = startChannel;
      this.endChannel = endChannel;
      this.internal = internal;
   }

   public short getStartChannel() {
      return startChannel;
   }

   public short getEndChannel() {
      return endChannel;
   }

   public SpectrometricResult getInternal() {
      return internal;
   }

   public int getCountForChannel(int channelNum) {
      if (channelNum < startChannel || channelNum > endChannel) {
         throw new IllegalArgumentException("Pobrano punkty spoza ROI za pośrednictwem ROI");
      }
      return internal.getCountForChannel(channelNum);
   }

   @Override
   public String toString() {
      return new ToStringBuilder(this).
              append("startChannel", startChannel).
              append("endChannel", endChannel).
              append("internal", internal).
              toString();
   }
}
