// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: commonmodule/commonmodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.commonmodule;

@kotlin.jvm.JvmName("-initializeschedulePoint")
public inline fun schedulePoint(block: openfmb.commonmodule.SchedulePointKt.Dsl.() -> kotlin.Unit): openfmb.commonmodule.SchedulePoint =
  openfmb.commonmodule.SchedulePointKt.Dsl._create(openfmb.commonmodule.SchedulePoint.newBuilder()).apply { block() }._build()
/**
 * ```
 * Point definition (Point)
 * ```
 *
 * Protobuf type `commonmodule.SchedulePoint`
 */
public object SchedulePointKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.commonmodule.SchedulePoint.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.commonmodule.SchedulePoint.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.commonmodule.SchedulePoint = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ScheduleParameterProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * ```
     * Schedule parameter
     * ```
     *
     * `repeated .commonmodule.ENG_ScheduleParameter scheduleParameter = 1 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
     public val scheduleParameter: com.google.protobuf.kotlin.DslList<openfmb.commonmodule.ENG_ScheduleParameter, ScheduleParameterProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getScheduleParameterList()
      )
    /**
     * ```
     * Schedule parameter
     * ```
     *
     * `repeated .commonmodule.ENG_ScheduleParameter scheduleParameter = 1 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     * @param value The scheduleParameter to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addScheduleParameter")
    public fun com.google.protobuf.kotlin.DslList<openfmb.commonmodule.ENG_ScheduleParameter, ScheduleParameterProxy>.add(value: openfmb.commonmodule.ENG_ScheduleParameter) {
      _builder.addScheduleParameter(value)
    }
    /**
     * ```
     * Schedule parameter
     * ```
     *
     * `repeated .commonmodule.ENG_ScheduleParameter scheduleParameter = 1 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     * @param value The scheduleParameter to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignScheduleParameter")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<openfmb.commonmodule.ENG_ScheduleParameter, ScheduleParameterProxy>.plusAssign(value: openfmb.commonmodule.ENG_ScheduleParameter) {
      add(value)
    }
    /**
     * ```
     * Schedule parameter
     * ```
     *
     * `repeated .commonmodule.ENG_ScheduleParameter scheduleParameter = 1 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     * @param values The scheduleParameter to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllScheduleParameter")
    public fun com.google.protobuf.kotlin.DslList<openfmb.commonmodule.ENG_ScheduleParameter, ScheduleParameterProxy>.addAll(values: kotlin.collections.Iterable<openfmb.commonmodule.ENG_ScheduleParameter>) {
      _builder.addAllScheduleParameter(values)
    }
    /**
     * ```
     * Schedule parameter
     * ```
     *
     * `repeated .commonmodule.ENG_ScheduleParameter scheduleParameter = 1 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     * @param values The scheduleParameter to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllScheduleParameter")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<openfmb.commonmodule.ENG_ScheduleParameter, ScheduleParameterProxy>.plusAssign(values: kotlin.collections.Iterable<openfmb.commonmodule.ENG_ScheduleParameter>) {
      addAll(values)
    }
    /**
     * ```
     * Schedule parameter
     * ```
     *
     * `repeated .commonmodule.ENG_ScheduleParameter scheduleParameter = 1 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     * @param index The index to set the value at.
     * @param value The scheduleParameter to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setScheduleParameter")
    public operator fun com.google.protobuf.kotlin.DslList<openfmb.commonmodule.ENG_ScheduleParameter, ScheduleParameterProxy>.set(index: kotlin.Int, value: openfmb.commonmodule.ENG_ScheduleParameter) {
      _builder.setScheduleParameter(index, value)
    }
    /**
     * ```
     * Schedule parameter
     * ```
     *
     * `repeated .commonmodule.ENG_ScheduleParameter scheduleParameter = 1 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearScheduleParameter")
    public fun com.google.protobuf.kotlin.DslList<openfmb.commonmodule.ENG_ScheduleParameter, ScheduleParameterProxy>.clear() {
      _builder.clearScheduleParameter()
    }


    /**
     * ```
     * Start time
     * ```
     *
     * `.commonmodule.ControlTimestamp startTime = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public var startTime: openfmb.commonmodule.ControlTimestamp
      @JvmName("getStartTime")
      get() = _builder.getStartTime()
      @JvmName("setStartTime")
      set(value) {
        _builder.setStartTime(value)
      }
    /**
     * ```
     * Start time
     * ```
     *
     * `.commonmodule.ControlTimestamp startTime = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public fun clearStartTime() {
      _builder.clearStartTime()
    }
    /**
     * ```
     * Start time
     * ```
     *
     * `.commonmodule.ControlTimestamp startTime = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     * @return Whether the startTime field is set.
     */
    public fun hasStartTime(): kotlin.Boolean {
      return _builder.hasStartTime()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.commonmodule.SchedulePoint.copy(block: openfmb.commonmodule.SchedulePointKt.Dsl.() -> kotlin.Unit): openfmb.commonmodule.SchedulePoint =
  openfmb.commonmodule.SchedulePointKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val openfmb.commonmodule.SchedulePointOrBuilder.startTimeOrNull: openfmb.commonmodule.ControlTimestamp?
  get() = if (hasStartTime()) getStartTime() else null

