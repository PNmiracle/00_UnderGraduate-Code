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
CMAKE_SOURCE_DIR = D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04\N10_scanf_loop_input

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04\N10_scanf_loop_input\cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/N10_scanf_loop_input.dir/depend.make
# Include the progress variables for this target.
include CMakeFiles/N10_scanf_loop_input.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/N10_scanf_loop_input.dir/flags.make

CMakeFiles/N10_scanf_loop_input.dir/main.c.obj: CMakeFiles/N10_scanf_loop_input.dir/flags.make
CMakeFiles/N10_scanf_loop_input.dir/main.c.obj: ../main.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04\N10_scanf_loop_input\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building C object CMakeFiles/N10_scanf_loop_input.dir/main.c.obj"
	D:\adeveloperTools\MinGW\MinGW\MinGW\bin\gcc.exe $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles\N10_scanf_loop_input.dir\main.c.obj -c D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04\N10_scanf_loop_input\main.c

CMakeFiles/N10_scanf_loop_input.dir/main.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/N10_scanf_loop_input.dir/main.c.i"
	D:\adeveloperTools\MinGW\MinGW\MinGW\bin\gcc.exe $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04\N10_scanf_loop_input\main.c > CMakeFiles\N10_scanf_loop_input.dir\main.c.i

CMakeFiles/N10_scanf_loop_input.dir/main.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/N10_scanf_loop_input.dir/main.c.s"
	D:\adeveloperTools\MinGW\MinGW\MinGW\bin\gcc.exe $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04\N10_scanf_loop_input\main.c -o CMakeFiles\N10_scanf_loop_input.dir\main.c.s

# Object files for target N10_scanf_loop_input
N10_scanf_loop_input_OBJECTS = \
"CMakeFiles/N10_scanf_loop_input.dir/main.c.obj"

# External object files for target N10_scanf_loop_input
N10_scanf_loop_input_EXTERNAL_OBJECTS =

libN10_scanf_loop_input.a: CMakeFiles/N10_scanf_loop_input.dir/main.c.obj
libN10_scanf_loop_input.a: CMakeFiles/N10_scanf_loop_input.dir/build.make
libN10_scanf_loop_input.a: CMakeFiles/N10_scanf_loop_input.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04\N10_scanf_loop_input\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking C static library libN10_scanf_loop_input.a"
	$(CMAKE_COMMAND) -P CMakeFiles\N10_scanf_loop_input.dir\cmake_clean_target.cmake
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\N10_scanf_loop_input.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/N10_scanf_loop_input.dir/build: libN10_scanf_loop_input.a
.PHONY : CMakeFiles/N10_scanf_loop_input.dir/build

CMakeFiles/N10_scanf_loop_input.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\N10_scanf_loop_input.dir\cmake_clean.cmake
.PHONY : CMakeFiles/N10_scanf_loop_input.dir/clean

CMakeFiles/N10_scanf_loop_input.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04\N10_scanf_loop_input D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04\N10_scanf_loop_input D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04\N10_scanf_loop_input\cmake-build-debug D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04\N10_scanf_loop_input\cmake-build-debug D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\Ch04\N10_scanf_loop_input\cmake-build-debug\CMakeFiles\N10_scanf_loop_input.dir\DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/N10_scanf_loop_input.dir/depend

