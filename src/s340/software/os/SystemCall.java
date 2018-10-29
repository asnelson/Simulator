package s340.software.os;

/*
 * System call numbers for the operating system.
 */
public interface SystemCall 

{
	public final static int NUM_SYSTEM_CALLS = 2;
        public final static int SBRK = 0;
        public final static int WRITE_CONSOLE = 1;
}
