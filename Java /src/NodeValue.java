/**
 *   Tree-based Topology-Oriented SOM: Java implementation and R binding
 *   Copyright (C) 2013  Gonzalo Maldonado, Cesar A. Astudillo
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * This class represents a value into an ArrayList. It is used to 
 * create a Neuron with "key" id and "value" childrens.
 */
public class NodeValue {
    
    private int key;
    private int value;
    
    public NodeValue(int key, int value){
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

}
