/**
 * This file is part of logisim-evolution.
 *
 * Logisim-evolution is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * Logisim-evolution is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * for more details.
 *
 * You should have received a copy of the GNU General Public License along 
 * with logisim-evolution. If not, see <http://www.gnu.org/licenses/>.
 *
 * Original code by Carl Burch (http://www.cburch.com), 2011.
 * Subsequent modifications by:
 *   + College of the Holy Cross
 *     http://www.holycross.edu
 *   + Haute École Spécialisée Bernoise/Berner Fachhochschule
 *     http://www.bfh.ch
 *   + Haute École du paysage, d'ingénierie et d'architecture de Genève
 *     http://hepia.hesge.ch/
 *   + Haute École d'Ingénierie et de Gestion du Canton de Vaud
 *     http://www.heig-vd.ch/
 */

package com.cburch.logisim.std.hdl;

import static com.cburch.logisim.vhdl.Strings.S;

import com.cburch.logisim.gui.icons.ArithmeticIcon;
import com.cburch.logisim.tools.FactoryDescription;
import com.cburch.logisim.tools.Library;
import com.cburch.logisim.tools.Tool;
import java.util.List;

public class Hdl extends Library {

  private static FactoryDescription[] DESCRIPTIONS = {
    new FactoryDescription("VHDL Entity", S.getter("vhdlComponent"), new ArithmeticIcon("VHDL"), 
    		"VhdlEntityComponent"),
  };

  private List<Tool> tools = null;

  public Hdl() {}

  @Override
  public String getDisplayName() {
    return S.get("hdlLibrary");
  }

  @Override
  public String getName() {
    return "HDL-IP";
  }

  @Override
  public List<Tool> getTools() {
    if (tools == null) {
      tools = FactoryDescription.getTools(Hdl.class, DESCRIPTIONS);
    }
    return tools;
  }

  public boolean removeLibrary(String Name) {
    return false;
  }
}
