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
CMAKE_SOURCE_DIR = D:\00_UnderGraduate-Code\HomeWork\C_CLion

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = D:\00_UnderGraduate-Code\HomeWork\C_CLion\cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/t1.dir/depend.make
# Include the progress variables for this target.
include CMakeFiles/t1.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/t1.dir/flags.make

CMakeFiles/t1.dir/hello.c.obj: CMakeFiles/t1.dir/flags.make
CMakeFiles/t1.dir/hello.c.obj: ../hello.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=D:\00_UnderGraduate-Code\HomeWork\C_CLion\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building C object CMakeFiles/t1.dir/hello.c.obj"
	D:\adeveloperTools\MinGW\MinGW\MinGW\bin\gcc.exe $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles\t1.dir\hello.c.obj -c D:\00_UnderGraduate-Code\HomeWork\C_CLion\hello.c

CMakeFiles/t1.dir/hello.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/t1.dir/hello.c.i"
	D:\adeveloperTools\MinGW\MinGW\MinGW\bin\gcc.exe $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E D:\00_UnderGraduate-Code\HomeWork\C_CLion\hello.c > CMakeFiles\t1.dir\hello.c.i

CMakeFiles/t1.dir/hello.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/t1.dir/hello.c.s"
	D:\adeveloperTools\MinGW\MinGW\MinGW\bin\gcc.exe $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S D:\00_UnderGraduate-Code\HomeWork\C_CLion\hello.c -o CMakeFiles\t1.dir\hello.c.s

# Object files for target t1
t1_OBJECTS = \
"CMakeFiles/t1.dir/hello.c.obj"

# External object files for target t1
t1_EXTERNAL_OBJECTS =

t1.exe: CMakeFiles/t1.dir/hello.c.obj
t1.exe: CMakeFiles/t1.dir/build.make
t1.exe: CMakeFiles/t1.dir/linklibs.rsp
t1.exe: CMakeFiles/t1.dir/objects1.rsp
t1.exe: CMakeFiles/t1.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=D:\00_UnderGraduate-Code\HomeWork\C_CLion\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking C executable t1.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\t1.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/t1.dir/build: t1.exe
.PHONY : CMakeFiles/t1.dir/build

CMakeFiles/t1.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\t1.dir\cmake_clean.cmake
.PHONY : CMakeFiles/t1.dir/clean

CMakeFiles/t1.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" D:\00_UnderGraduate-Code\HomeWork\C_CLion D:\00_UnderGraduate-Code\HomeWork\C_CLion D:\00_UnderGraduate-Code\HomeWork\C_CLion\cmake-build-debug D:\00_UnderGraduate-Code\HomeWork\C_CLion\cmake-build-debug D:\00_UnderGraduate-Code\HomeWork\C_CLion\cmake-build-debug\CMakeFiles\t1.dir\DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/t1.dir/depend

