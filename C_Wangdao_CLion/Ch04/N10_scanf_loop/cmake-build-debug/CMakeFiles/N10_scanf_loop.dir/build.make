# CMAKE generated file: DO NOT EDIT!
# Generated by "MinGW Makefiles" Generator, CMake Version 3.20

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:

#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:

# Disable VCS-based implicit rules.
% : %,v

# Disable VCS-based implicit rules.
% : RCS/%

# Disable VCS-based implicit rules.
% : RCS/%,v

# Disable VCS-based implicit rules.
% : SCCS/s.%

# Disable VCS-based implicit rules.
% : s.%

.SUFFIXES: .hpux_make_needs_suffix_list

# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

#Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:
.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

SHELL = cmd.exe

# The CMake executable.
CMAKE_COMMAND = "E:\CLion\CLion 2021.2.3\bin\cmake\win\bin\cmake.exe"

# The command to remove a file.
RM = "E:\CLion\CLion 2021.2.3\bin\cmake\win\bin\cmake.exe" -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04\N10_scanf_loop

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04\N10_scanf_loop\cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/N10_scanf_loop.dir/depend.make
# Include the progress variables for this target.
include CMakeFiles/N10_scanf_loop.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/N10_scanf_loop.dir/flags.make

CMakeFiles/N10_scanf_loop.dir/main.c.obj: CMakeFiles/N10_scanf_loop.dir/flags.make
CMakeFiles/N10_scanf_loop.dir/main.c.obj: ../main.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04\N10_scanf_loop\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building C object CMakeFiles/N10_scanf_loop.dir/main.c.obj"
	D:\adeveloperTools\MinGW\MinGW\MinGW\bin\gcc.exe $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles\N10_scanf_loop.dir\main.c.obj -c D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04\N10_scanf_loop\main.c

CMakeFiles/N10_scanf_loop.dir/main.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/N10_scanf_loop.dir/main.c.i"
	D:\adeveloperTools\MinGW\MinGW\MinGW\bin\gcc.exe $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04\N10_scanf_loop\main.c > CMakeFiles\N10_scanf_loop.dir\main.c.i

CMakeFiles/N10_scanf_loop.dir/main.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/N10_scanf_loop.dir/main.c.s"
	D:\adeveloperTools\MinGW\MinGW\MinGW\bin\gcc.exe $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04\N10_scanf_loop\main.c -o CMakeFiles\N10_scanf_loop.dir\main.c.s

# Object files for target N10_scanf_loop
N10_scanf_loop_OBJECTS = \
"CMakeFiles/N10_scanf_loop.dir/main.c.obj"

# External object files for target N10_scanf_loop
N10_scanf_loop_EXTERNAL_OBJECTS =

N10_scanf_loop.exe: CMakeFiles/N10_scanf_loop.dir/main.c.obj
N10_scanf_loop.exe: CMakeFiles/N10_scanf_loop.dir/build.make
N10_scanf_loop.exe: CMakeFiles/N10_scanf_loop.dir/linklibs.rsp
N10_scanf_loop.exe: CMakeFiles/N10_scanf_loop.dir/objects1.rsp
N10_scanf_loop.exe: CMakeFiles/N10_scanf_loop.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04\N10_scanf_loop\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking C executable N10_scanf_loop.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\N10_scanf_loop.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/N10_scanf_loop.dir/build: N10_scanf_loop.exe
.PHONY : CMakeFiles/N10_scanf_loop.dir/build

CMakeFiles/N10_scanf_loop.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\N10_scanf_loop.dir\cmake_clean.cmake
.PHONY : CMakeFiles/N10_scanf_loop.dir/clean

CMakeFiles/N10_scanf_loop.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04\N10_scanf_loop D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04\N10_scanf_loop D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04\N10_scanf_loop\cmake-build-debug D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04\N10_scanf_loop\cmake-build-debug D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04\N10_scanf_loop\cmake-build-debug\CMakeFiles\N10_scanf_loop.dir\DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/N10_scanf_loop.dir/depend

