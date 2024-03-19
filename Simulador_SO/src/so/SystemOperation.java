package so;

import cpu.CpuManager;
import memory.MemoryManager;
import memory.Strategy;

public class SystemOperation {
	private static MemoryManager mm;
	private static CpuManager cm;
	
	public static Process systemCall(SystemCallType type, Process p) {
		if (type.equals(SystemCallType.CREATE_PROCESS)) {
			if (mm == null) {
				mm = new MemoryManager(Strategy.FIRST_FIT);
			}
			if (cm == null) {
				cm = new CpuManager();
			}
			return p;

		} else if (type.equals(SystemCallType.WRITE_PROCESS)) {
			mm.write(p);

		} else if (type.equals(SystemCallType.CLOSE_PROCESS) && p.getMa() != null) {
			mm.delete(p);

		}
		return null;
	}
}
