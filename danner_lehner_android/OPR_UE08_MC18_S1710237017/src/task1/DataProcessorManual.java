package task1;


	import java.util.Comparator;
	import java.util.List;
	import java.util.Vector;
	import java.util.function.BiFunction;
	import java.util.function.BinaryOperator;
	import java.util.function.Consumer;
	import java.util.function.Function;
	import java.util.function.Predicate;

import at.fhhgb.mc.opr.backblazedata.loaders.LiveHardDiskDataSource;
import at.fhhgb.mc.opr.backblazedata.model.HardDisk;



	public class DataProcessorManual {

		private Vector<HardDisk> hardDisks; // var hardDisks is a vector of Type HardDisk

		public DataProcessorManual(Vector<HardDisk> hardDisks) { // constructor

			this.hardDisks = hardDisks;
		}
        
        
        public void thisisaNewFancemethod(){
		//jet fuel doesn't melt steel beams by the way
            //do stuff
        }

		// Can use Vector.sort internally, sorts the internal Vector
		public void sort(Comparator<HardDisk> comparator) {
			// vgl. obj1 mit obj2
			hardDisks.sort(comparator);
		}

		// Returns size of the internal vector
		public long count() {

			long john = 0;

			return john;
		}

		// Returns a Vector of HardDisks filtered by predicate
		public Vector<HardDisk> filter(Predicate<HardDisk> predicate) {


			return hardDisks;
		}

		// Returns the HardDisk with a specified maximum value
		public HardDisk max(Comparator<HardDisk> comparator) {
			return null;

		}

		// Returns the HardDisk with a specified minimum value
		public HardDisk min(Comparator<HardDisk> comparator) {
			return null;

		}

		// Returns a mean value specified by the function
		public double mean(Function<HardDisk, Long> comparator) {
			return 0;

		}

		// Returns a median value specified by the function
		public long median(Function<HardDisk, Long> comparator) {
			return 0;

		}

		// Performs a Function on every element of the internal Vector
		public void forEach(Consumer<HardDisk> consumer) {

		}

		// Returns a List with elements based on the given Function
		public List<Long> reduceToLongs(BiFunction<List<Long>, HardDisk, List<Long>> accumulator,
				BinaryOperator<List<Long>> combiner) {

			return null;
		}

		// Returns a List with elements based on the given Function
		public List<String> reduceToStrings(BiFunction<List<String>, HardDisk, List<String>> accumulator, BinaryOperator<List<String>> combiner) {

			return null;
		}


		public static void main(String[] args) {
			LiveHardDiskDataSource dataSource = new LiveHardDiskDataSource();
			Vector<HardDisk> hardDisks = new Vector<>();

			System.out.println(hardDisks.capacity());

			// Schleife bis dataSource.next() null wird
			// Jede HardDisk in den Vector speichern



//			while (dataSource.next() != null) {
//				hardDisks.addElement(dataSource);
//				//dataSource.next() = next;
//			}

//			HardDisk hdd = new HardDisk(null, null, null, 0, false, null);
//
//			hdd.getCapacityInBytes();
		}


}
