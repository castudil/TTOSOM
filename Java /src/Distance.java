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
import weka.core.Instance;
import weka.core.Instances;

/**
 * This interface represents a new Strategy to calculate the distance. We 
 * are using the Strategy Pattern.
 */
public interface Distance {

    public double calculateDistance(Instance item1, Instance item2, Instances instances);
    
}
