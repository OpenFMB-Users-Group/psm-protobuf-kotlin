// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: regulatormodule/regulatormodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.regulatormodule;

@kotlin.jvm.JvmName("-initializeregulatorControlATCC")
public inline fun regulatorControlATCC(block: openfmb.regulatormodule.RegulatorControlATCCKt.Dsl.() -> kotlin.Unit): openfmb.regulatormodule.RegulatorControlATCC =
  openfmb.regulatormodule.RegulatorControlATCCKt.Dsl._create(openfmb.regulatormodule.RegulatorControlATCC.newBuilder()).apply { block() }._build()
/**
 * ```
 * LN: Automatic tap changer controller   Name: ATCC
 * ```
 *
 * Protobuf type `regulatormodule.RegulatorControlATCC`
 */
public object RegulatorControlATCCKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.regulatormodule.RegulatorControlATCC.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.regulatormodule.RegulatorControlATCC.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.regulatormodule.RegulatorControlATCC = _builder.build()

    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.LogicalNodeForControl logicalNodeForControl = 1 [(.uml.option_parent_message) = true];`
     */
    public var logicalNodeForControl: openfmb.commonmodule.LogicalNodeForControl
      @JvmName("getLogicalNodeForControl")
      get() = _builder.getLogicalNodeForControl()
      @JvmName("setLogicalNodeForControl")
      set(value) {
        _builder.setLogicalNodeForControl(value)
      }
    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.LogicalNodeForControl logicalNodeForControl = 1 [(.uml.option_parent_message) = true];`
     */
    public fun clearLogicalNodeForControl() {
      _builder.clearLogicalNodeForControl()
    }
    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.LogicalNodeForControl logicalNodeForControl = 1 [(.uml.option_parent_message) = true];`
     * @return Whether the logicalNodeForControl field is set.
     */
    public fun hasLogicalNodeForControl(): kotlin.Boolean {
      return _builder.hasLogicalNodeForControl()
    }

    /**
     * ```
     * Forward voltage regulation
     * ```
     *
     * `.regulatormodule.DirectionalATCC DirFwd = 2;`
     */
    public var dirFwd: openfmb.regulatormodule.DirectionalATCC
      @JvmName("getDirFwd")
      get() = _builder.getDirFwd()
      @JvmName("setDirFwd")
      set(value) {
        _builder.setDirFwd(value)
      }
    /**
     * ```
     * Forward voltage regulation
     * ```
     *
     * `.regulatormodule.DirectionalATCC DirFwd = 2;`
     */
    public fun clearDirFwd() {
      _builder.clearDirFwd()
    }
    /**
     * ```
     * Forward voltage regulation
     * ```
     *
     * `.regulatormodule.DirectionalATCC DirFwd = 2;`
     * @return Whether the dirFwd field is set.
     */
    public fun hasDirFwd(): kotlin.Boolean {
      return _builder.hasDirFwd()
    }

    /**
     * ```
     * The control characteristics for power flow operation
     * ```
     *
     * `.commonmodule.Optional_DirectionModeKind DirMode = 3;`
     */
    public var dirMode: openfmb.commonmodule.Optional_DirectionModeKind
      @JvmName("getDirMode")
      get() = _builder.getDirMode()
      @JvmName("setDirMode")
      set(value) {
        _builder.setDirMode(value)
      }
    /**
     * ```
     * The control characteristics for power flow operation
     * ```
     *
     * `.commonmodule.Optional_DirectionModeKind DirMode = 3;`
     */
    public fun clearDirMode() {
      _builder.clearDirMode()
    }
    /**
     * ```
     * The control characteristics for power flow operation
     * ```
     *
     * `.commonmodule.Optional_DirectionModeKind DirMode = 3;`
     * @return Whether the dirMode field is set.
     */
    public fun hasDirMode(): kotlin.Boolean {
      return _builder.hasDirMode()
    }

    /**
     * ```
     * Reverse voltage regulation
     * ```
     *
     * `.regulatormodule.DirectionalATCC DirRev = 4;`
     */
    public var dirRev: openfmb.regulatormodule.DirectionalATCC
      @JvmName("getDirRev")
      get() = _builder.getDirRev()
      @JvmName("setDirRev")
      set(value) {
        _builder.setDirRev(value)
      }
    /**
     * ```
     * Reverse voltage regulation
     * ```
     *
     * `.regulatormodule.DirectionalATCC DirRev = 4;`
     */
    public fun clearDirRev() {
      _builder.clearDirRev()
    }
    /**
     * ```
     * Reverse voltage regulation
     * ```
     *
     * `.regulatormodule.DirectionalATCC DirRev = 4;`
     * @return Whether the dirRev field is set.
     */
    public fun hasDirRev(): kotlin.Boolean {
      return _builder.hasDirRev()
    }

    /**
     * ```
     * This is the percentage used to determine the current threshold at which the control recognizes
     * current flow direction. Below the threshold, the current flow is considered to be indeterminate.
     * ```
     *
     * `.commonmodule.PhaseAPC DirThd = 5;`
     */
    public var dirThd: openfmb.commonmodule.PhaseAPC
      @JvmName("getDirThd")
      get() = _builder.getDirThd()
      @JvmName("setDirThd")
      set(value) {
        _builder.setDirThd(value)
      }
    /**
     * ```
     * This is the percentage used to determine the current threshold at which the control recognizes
     * current flow direction. Below the threshold, the current flow is considered to be indeterminate.
     * ```
     *
     * `.commonmodule.PhaseAPC DirThd = 5;`
     */
    public fun clearDirThd() {
      _builder.clearDirThd()
    }
    /**
     * ```
     * This is the percentage used to determine the current threshold at which the control recognizes
     * current flow direction. Below the threshold, the current flow is considered to be indeterminate.
     * ```
     *
     * `.commonmodule.PhaseAPC DirThd = 5;`
     * @return Whether the dirThd field is set.
     */
    public fun hasDirThd(): kotlin.Boolean {
      return _builder.hasDirThd()
    }

    /**
     * ```
     * (controllable) If true, transformers operate in parallel, otherwise they operate independently.
     * ```
     *
     * `.commonmodule.PhaseSPC ParOp = 6;`
     */
    public var parOp: openfmb.commonmodule.PhaseSPC
      @JvmName("getParOp")
      get() = _builder.getParOp()
      @JvmName("setParOp")
      set(value) {
        _builder.setParOp(value)
      }
    /**
     * ```
     * (controllable) If true, transformers operate in parallel, otherwise they operate independently.
     * ```
     *
     * `.commonmodule.PhaseSPC ParOp = 6;`
     */
    public fun clearParOp() {
      _builder.clearParOp()
    }
    /**
     * ```
     * (controllable) If true, transformers operate in parallel, otherwise they operate independently.
     * ```
     *
     * `.commonmodule.PhaseSPC ParOp = 6;`
     * @return Whether the parOp field is set.
     */
    public fun hasParOp(): kotlin.Boolean {
      return _builder.hasParOp()
    }

    /**
     * ```
     * Ramp rates
     * ```
     *
     * `.commonmodule.RampRate rampRates = 7;`
     */
    public var rampRates: openfmb.commonmodule.RampRate
      @JvmName("getRampRates")
      get() = _builder.getRampRates()
      @JvmName("setRampRates")
      set(value) {
        _builder.setRampRates(value)
      }
    /**
     * ```
     * Ramp rates
     * ```
     *
     * `.commonmodule.RampRate rampRates = 7;`
     */
    public fun clearRampRates() {
      _builder.clearRampRates()
    }
    /**
     * ```
     * Ramp rates
     * ```
     *
     * `.commonmodule.RampRate rampRates = 7;`
     * @return Whether the rampRates field is set.
     */
    public fun hasRampRates(): kotlin.Boolean {
      return _builder.hasRampRates()
    }

    /**
     * ```
     * (controllable) Tap position change to the specified value.
     * ```
     *
     * `.commonmodule.Optional_StateKind state = 8;`
     */
    public var state: openfmb.commonmodule.Optional_StateKind
      @JvmName("getState")
      get() = _builder.getState()
      @JvmName("setState")
      set(value) {
        _builder.setState(value)
      }
    /**
     * ```
     * (controllable) Tap position change to the specified value.
     * ```
     *
     * `.commonmodule.Optional_StateKind state = 8;`
     */
    public fun clearState() {
      _builder.clearState()
    }
    /**
     * ```
     * (controllable) Tap position change to the specified value.
     * ```
     *
     * `.commonmodule.Optional_StateKind state = 8;`
     * @return Whether the state field is set.
     */
    public fun hasState(): kotlin.Boolean {
      return _builder.hasState()
    }

    /**
     * ```
     * If true, tap position shall be lowered.
     * ```
     *
     * `.commonmodule.PhaseSPC TapOpL = 9;`
     */
    public var tapOpL: openfmb.commonmodule.PhaseSPC
      @JvmName("getTapOpL")
      get() = _builder.getTapOpL()
      @JvmName("setTapOpL")
      set(value) {
        _builder.setTapOpL(value)
      }
    /**
     * ```
     * If true, tap position shall be lowered.
     * ```
     *
     * `.commonmodule.PhaseSPC TapOpL = 9;`
     */
    public fun clearTapOpL() {
      _builder.clearTapOpL()
    }
    /**
     * ```
     * If true, tap position shall be lowered.
     * ```
     *
     * `.commonmodule.PhaseSPC TapOpL = 9;`
     * @return Whether the tapOpL field is set.
     */
    public fun hasTapOpL(): kotlin.Boolean {
      return _builder.hasTapOpL()
    }

    /**
     * ```
     * If true, tap position shall be raised.
     * ```
     *
     * `.commonmodule.PhaseSPC TapOpR = 10;`
     */
    public var tapOpR: openfmb.commonmodule.PhaseSPC
      @JvmName("getTapOpR")
      get() = _builder.getTapOpR()
      @JvmName("setTapOpR")
      set(value) {
        _builder.setTapOpR(value)
      }
    /**
     * ```
     * If true, tap position shall be raised.
     * ```
     *
     * `.commonmodule.PhaseSPC TapOpR = 10;`
     */
    public fun clearTapOpR() {
      _builder.clearTapOpR()
    }
    /**
     * ```
     * If true, tap position shall be raised.
     * ```
     *
     * `.commonmodule.PhaseSPC TapOpR = 10;`
     * @return Whether the tapOpR field is set.
     */
    public fun hasTapOpR(): kotlin.Boolean {
      return _builder.hasTapOpR()
    }

    /**
     * ```
     * High voltage limit for Voltage Limiter
     * ```
     *
     * `.commonmodule.PhaseAPC VolLmtHi = 11;`
     */
    public var volLmtHi: openfmb.commonmodule.PhaseAPC
      @JvmName("getVolLmtHi")
      get() = _builder.getVolLmtHi()
      @JvmName("setVolLmtHi")
      set(value) {
        _builder.setVolLmtHi(value)
      }
    /**
     * ```
     * High voltage limit for Voltage Limiter
     * ```
     *
     * `.commonmodule.PhaseAPC VolLmtHi = 11;`
     */
    public fun clearVolLmtHi() {
      _builder.clearVolLmtHi()
    }
    /**
     * ```
     * High voltage limit for Voltage Limiter
     * ```
     *
     * `.commonmodule.PhaseAPC VolLmtHi = 11;`
     * @return Whether the volLmtHi field is set.
     */
    public fun hasVolLmtHi(): kotlin.Boolean {
      return _builder.hasVolLmtHi()
    }

    /**
     * ```
     * Low voltage limit for Voltage Limiter
     * ```
     *
     * `.commonmodule.PhaseAPC VolLmtLo = 12;`
     */
    public var volLmtLo: openfmb.commonmodule.PhaseAPC
      @JvmName("getVolLmtLo")
      get() = _builder.getVolLmtLo()
      @JvmName("setVolLmtLo")
      set(value) {
        _builder.setVolLmtLo(value)
      }
    /**
     * ```
     * Low voltage limit for Voltage Limiter
     * ```
     *
     * `.commonmodule.PhaseAPC VolLmtLo = 12;`
     */
    public fun clearVolLmtLo() {
      _builder.clearVolLmtLo()
    }
    /**
     * ```
     * Low voltage limit for Voltage Limiter
     * ```
     *
     * `.commonmodule.PhaseAPC VolLmtLo = 12;`
     * @return Whether the volLmtLo field is set.
     */
    public fun hasVolLmtLo(): kotlin.Boolean {
      return _builder.hasVolLmtLo()
    }

    /**
     * ```
     * Voltage-limiting types
     * ```
     *
     * `.commonmodule.Optional_VoltLimitModeKind VolLmtMode = 13;`
     */
    public var volLmtMode: openfmb.commonmodule.Optional_VoltLimitModeKind
      @JvmName("getVolLmtMode")
      get() = _builder.getVolLmtMode()
      @JvmName("setVolLmtMode")
      set(value) {
        _builder.setVolLmtMode(value)
      }
    /**
     * ```
     * Voltage-limiting types
     * ```
     *
     * `.commonmodule.Optional_VoltLimitModeKind VolLmtMode = 13;`
     */
    public fun clearVolLmtMode() {
      _builder.clearVolLmtMode()
    }
    /**
     * ```
     * Voltage-limiting types
     * ```
     *
     * `.commonmodule.Optional_VoltLimitModeKind VolLmtMode = 13;`
     * @return Whether the volLmtMode field is set.
     */
    public fun hasVolLmtMode(): kotlin.Boolean {
      return _builder.hasVolLmtMode()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.regulatormodule.RegulatorControlATCC.copy(block: openfmb.regulatormodule.RegulatorControlATCCKt.Dsl.() -> kotlin.Unit): openfmb.regulatormodule.RegulatorControlATCC =
  openfmb.regulatormodule.RegulatorControlATCCKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val openfmb.regulatormodule.RegulatorControlATCCOrBuilder.logicalNodeForControlOrNull: openfmb.commonmodule.LogicalNodeForControl?
  get() = if (hasLogicalNodeForControl()) getLogicalNodeForControl() else null

public val openfmb.regulatormodule.RegulatorControlATCCOrBuilder.dirFwdOrNull: openfmb.regulatormodule.DirectionalATCC?
  get() = if (hasDirFwd()) getDirFwd() else null

public val openfmb.regulatormodule.RegulatorControlATCCOrBuilder.dirModeOrNull: openfmb.commonmodule.Optional_DirectionModeKind?
  get() = if (hasDirMode()) getDirMode() else null

public val openfmb.regulatormodule.RegulatorControlATCCOrBuilder.dirRevOrNull: openfmb.regulatormodule.DirectionalATCC?
  get() = if (hasDirRev()) getDirRev() else null

public val openfmb.regulatormodule.RegulatorControlATCCOrBuilder.dirThdOrNull: openfmb.commonmodule.PhaseAPC?
  get() = if (hasDirThd()) getDirThd() else null

public val openfmb.regulatormodule.RegulatorControlATCCOrBuilder.parOpOrNull: openfmb.commonmodule.PhaseSPC?
  get() = if (hasParOp()) getParOp() else null

public val openfmb.regulatormodule.RegulatorControlATCCOrBuilder.rampRatesOrNull: openfmb.commonmodule.RampRate?
  get() = if (hasRampRates()) getRampRates() else null

public val openfmb.regulatormodule.RegulatorControlATCCOrBuilder.stateOrNull: openfmb.commonmodule.Optional_StateKind?
  get() = if (hasState()) getState() else null

public val openfmb.regulatormodule.RegulatorControlATCCOrBuilder.tapOpLOrNull: openfmb.commonmodule.PhaseSPC?
  get() = if (hasTapOpL()) getTapOpL() else null

public val openfmb.regulatormodule.RegulatorControlATCCOrBuilder.tapOpROrNull: openfmb.commonmodule.PhaseSPC?
  get() = if (hasTapOpR()) getTapOpR() else null

public val openfmb.regulatormodule.RegulatorControlATCCOrBuilder.volLmtHiOrNull: openfmb.commonmodule.PhaseAPC?
  get() = if (hasVolLmtHi()) getVolLmtHi() else null

public val openfmb.regulatormodule.RegulatorControlATCCOrBuilder.volLmtLoOrNull: openfmb.commonmodule.PhaseAPC?
  get() = if (hasVolLmtLo()) getVolLmtLo() else null

public val openfmb.regulatormodule.RegulatorControlATCCOrBuilder.volLmtModeOrNull: openfmb.commonmodule.Optional_VoltLimitModeKind?
  get() = if (hasVolLmtMode()) getVolLmtMode() else null

